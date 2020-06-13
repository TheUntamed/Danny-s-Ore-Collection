package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.*;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.max;

public class GenerationHandler {

    /**
     * Called by Main class to process all ore generation.
     * <p>
     * The config checker and disable features were inspired by the code of the mod almost-all-the-ores by waylanderou.
     * https://github.com/waylanderou/almost-all-the-ores
     */
    public static void generateOre() {
        String biomeName = "";

        // Check if config is correct
        if (GeneralConfig.enableConfigChecker.get()) {
            ArrayList<String> biomeVerify = new ArrayList<>();
            ArrayList<String> tempVerify = new ArrayList<>();
            for (Biome biome : ForgeRegistries.BIOMES) {
                ResourceLocation biomeResLoc = biome.getRegistryName();
                ResourceLocation tempResLoc = biome.getRegistryName();
                if (biomeResLoc != null) {
                    biomeVerify.add(biomeResLoc.toString());
                }
                if (tempResLoc != null) {
                    tempVerify.add(tempResLoc.toString());
                }
            }
            ConfigHandler.checkConfig(biomeVerify, tempVerify);
        }

        // Disable existing generation features
        for (Biome biome : ForgeRegistries.BIOMES) {
            ResourceLocation biomeResLoc = biome.getRegistryName();
            if (biomeResLoc != null) {
                biomeName = biomeResLoc.toString();
            }
            String tempName = biome.getTempCategory().toString();

            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                if (GeneralConfig.disableOtherOverworldOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (GeneralConfig.removeVanillaOverworldOreGeneration.get()) {
                    removeVanillaOverworldOres(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.NETHER) {
                if (GeneralConfig.disableOtherNetherOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (GeneralConfig.removeVanillaNetherOreGeneration.get()) {
                    removeNetherQuartzOre(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.THEEND) {
                if (GeneralConfig.disableOtherEndOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                }
            }

            // Re-add vanilla ores
            if (GeneralConfig.enableCustomVanillaOreGeneration.get()) {
                HashMap<Block, Pair<OreTypes, StoneVariants>> vanilla = BlockInit.getFilledVanillaBlockMap();
                for (Block block : vanilla.keySet()) {
                    RichnessTypes rType = RichnessTypes.NORMAL;
                    VariantsModId fillerBlockModId = VariantsModId.MINECRAFT;
                    Pair<OreTypes, StoneVariants> pair = vanilla.get(block);
                    OreTypes oType = pair.getKey();
                    StoneVariants variant = pair.getValue();
                    UnmodifiableConfig config = ConfigHandler.getConfig(block);
                    if (getSpecificOreGenerationStatus(config, oType, rType, variant, fillerBlockModId, biomeName, tempName)) {
                        Block fillerBlock = Blocks.STONE;
                        if (oType.equals(OreTypes.QUARTZ)) {
                            fillerBlock = Blocks.NETHERRACK;
                        }

                        int veinSize = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getVeinSizeFullPath(fillerBlockModId, variant, rType, oType))).get();
                        int veinsPerChunk = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getVeinsPerChunkFullPath(fillerBlockModId, variant, rType, oType))).get();
                        int minHeight = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getMinHeightFullPath(fillerBlockModId, variant, rType, oType))).get();
                        int maxHeight = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getMaxHeightFullPath(fillerBlockModId, variant, rType, oType))).get();

                        if (veinSize == 0) {
                            Main.LOGGER.info("Generation of '" + block + "' is enabled but vein size is 0!");
                        } else if (veinSize < 3) {
                            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE
                                    .withConfiguration(new ReplaceBlockConfig(fillerBlock.getDefaultState(), block.getDefaultState()))
                                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(veinsPerChunk, minHeight, 0, maxHeight))));
                        } else {
                            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE
                                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create(fillerBlock.toString(), null, new BlockMatcher(fillerBlock)), block.getDefaultState(), veinSize))
                                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(veinsPerChunk, minHeight, 0, maxHeight))));
                        }
                    }
                }
            }

            // Add own generation
            for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
                Block block = blockRO.get();
                if (block instanceof SimpleOre) {
                    SimpleOre ore = (SimpleOre) block;
                    if (ModHandler.variantsModIdExists(ore.getBlockBaseModId())) {
                        StoneVariants variant = ore.getStoneVariant();
                        Block fillerBlock = ore.getBlockBase();
                        UnmodifiableConfig generalConfig = GeneralConfig.spec.getValues();
                        if (getVariantGenerationStatus(generalConfig, ore, fillerBlock)) {
                            UnmodifiableConfig config = ConfigHandler.getConfig(block);
                            OreTypes oType = ore.getOreType();
                            RichnessTypes rType = ore.getRichnessType();
                            VariantsModId fillerBlockModId = ore.getBlockBaseModId();
                            if (getOreTypeGenerationStatus(config)) {
                                if (getSpecificOreGenerationStatus(config, oType, rType, variant, fillerBlockModId, biomeName, tempName)) {
                                    int veinSize = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getVeinSizeFullPath(fillerBlockModId, variant, rType, oType))).get();
                                    int veinsPerChunk = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getVeinsPerChunkFullPath(fillerBlockModId, variant, rType, oType))).get();
                                    int minHeight = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getMinHeightFullPath(fillerBlockModId, variant, rType, oType))).get();
                                    int maxHeight = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getMaxHeightFullPath(fillerBlockModId, variant, rType, oType))).get();
                                    if (veinSize == 0) {
                                        Main.LOGGER.info("Generation of '" + block + "' is enabled but vein size is 0!");
                                    } else if (veinSize < 3) {
                                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE
                                                .withConfiguration(new ReplaceBlockConfig(fillerBlock.getDefaultState(), block.getDefaultState()))
                                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(veinsPerChunk, minHeight, 0, maxHeight))));
                                    } else {
                                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE
                                                .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create(fillerBlock.toString(), null, new BlockMatcher(fillerBlock)), block.getDefaultState(), veinSize))
                                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(veinsPerChunk, minHeight, 0, maxHeight))));
                                    }
                                }
                            }
                        }
                    }
                } else if (block instanceof SimpleBlock) {
                    ResourceLocation resLoc = block.getRegistryName();
                    if (resLoc != null) {
                        String regName = resLoc.toString();
                        String blockName = regName.split(":")[1];
                        UnmodifiableConfig config = ConfigHandler.getConfig(block);
                        if (getStoneGenerationStatus(config, blockName, biomeName, tempName)) {
                            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, block.getDefaultState(), max(((ForgeConfigSpec.IntValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getClusterSizePath())).get(), 3)))
                                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(((ForgeConfigSpec.IntValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getClustersPerChunkPath())).get(), ((ForgeConfigSpec.IntValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getMinHeightPath())).get(), 0, ((ForgeConfigSpec.IntValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getMaxHeightPath())).get()))));
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks the specific generation config values of an ore.
     *
     * @param config    The config of the ore.
     * @param ore       The ore.
     * @param biomeName the current biome.
     * @param tempName  The temperature of the given biome.
     * @return True if the given ore should generate. False if it shouldn't.
     */
    private static boolean getSpecificOreGenerationStatus(UnmodifiableConfig config, SimpleOre ore, String biomeName, String tempName) {
        OreTypes oType = ore.getOreType();
        RichnessTypes rType = ore.getRichnessType();
        StoneVariants variant = ore.getStoneVariant();
        VariantsModId fillerBlockModId = ore.getBlockBaseModId();
        return getSpecificOreGenerationStatus(config, oType, rType, variant, fillerBlockModId, biomeName, tempName);
    }

    /**
     * Checks the specific generation config values of an ore.
     *
     * @param config           The config of the ore.
     * @param oType            The ore type of an ore.
     * @param rType            The richness type of an ore.
     * @param variant          The variant of the filler block of the ore.
     * @param fillerBlockModId the modId of the filler block of the ore.
     * @param biomeName        the current biome.
     * @param tempName         The temperature of the given biome.
     * @return True if an ore with the given features should generate. False if it shouldn't.
     */
    private static boolean getSpecificOreGenerationStatus(UnmodifiableConfig config, OreTypes oType, RichnessTypes rType, StoneVariants variant, VariantsModId fillerBlockModId, String biomeName, String tempName) {
        boolean stoneVariant = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getEnableVariantFullPath(fillerBlockModId, variant, rType, oType))).get();
        boolean isTempWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getIsTempWhitelistFullPath(fillerBlockModId, variant, rType, oType))).get();
        boolean isBiomeWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getIsBiomeWhitelistFullPath(fillerBlockModId, variant, rType, oType))).get();
        ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get(PathBuilder.getBiomeBlacklistFullPath(fillerBlockModId, variant, rType, oType));
        List<String> biomeList = inBiomeFCS.get();
        ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get(PathBuilder.getTemperatureBlacklistFullPath(fillerBlockModId, variant, rType, oType));
        List<String> tempList = inTempFCS.get();
        boolean biomeAllowed = (isBiomeWhite && biomeList.contains(biomeName)) || (!isBiomeWhite && !biomeList.contains(biomeName));
        boolean tempAllowed = (isTempWhite && tempList.contains(tempName)) || (!isTempWhite && !tempList.contains(tempName));

        return stoneVariant && biomeAllowed && tempAllowed;
    }

    /**
     * Checks the general config value of an ore config.
     * If that value is false no ores of that type will generate.
     *
     * @param config The config.
     * @return true if the ore type is enabled.
     */
    private static boolean getOreTypeGenerationStatus(UnmodifiableConfig config) {
        return !((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getDisableAllVariantsFullPath())).get();
    }

    /**
     * Checks the general configs if an ore is allowed to generate.
     *
     * @param generalConfig The config to check.
     * @param ore           The ore to check the general generation for.
     * @param fillerBlock   The filler block of the ore the generation is checked for.
     * @return True if the block should generate.
     */
    private static boolean getVariantGenerationStatus(UnmodifiableConfig generalConfig, SimpleOre ore, Block fillerBlock) {
        String variantWithOwner = getVariantWithModOwner(fillerBlock);
        RichnessTypes rType = ore.getRichnessType();
        if (((ForgeConfigSpec.BooleanValue) generalConfig.get(PathBuilder.getDisableAllVariantsFullPath(rType))).get()) {
            return false;
        } else {
            return !((ForgeConfigSpec.BooleanValue) generalConfig.get(PathHandler.getGeneralPath() + "." + rType.getName() + "." + PathHandler.getStoneVariantsPath() + "." + variantWithOwner)).get();
        }
    }

    /**
     * Checks the StoneVariants config if a block is allowed to generate.
     * The given block should be a stone variant of this mod.
     *
     * @param config    The config of the block.
     * @param blockName The name of the block.
     * @param biomeName the current biome.
     * @param tempName  The temperature of the given biome.
     * @return True if the given block should generate. False if it shouldn't.
     */
    private static boolean getStoneGenerationStatus(UnmodifiableConfig config, String blockName, String biomeName, String tempName) {
        boolean disableAll = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getDisableAllVariantsFullPath())).get();
        boolean stoneVariant = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getEnableVariantFullPath(blockName))).get();
        boolean isTempWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getIsTempWhitelistFullPath(blockName))).get();
        boolean isBiomeWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getIsBiomeWhitelistFullPath(blockName))).get();
        ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get(PathBuilder.getBiomeBlacklistFullPath(blockName));
        List<String> biomeList = inBiomeFCS.get();
        ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get(PathBuilder.getTemperatureBlacklistFullPath(blockName));
        List<String> tempList = inTempFCS.get();
        boolean biomeAllowed = (isBiomeWhite && biomeList.contains(biomeName)) || (!isBiomeWhite && !biomeList.contains(biomeName));
        boolean tempAllowed = (isTempWhite && tempList.contains(tempName)) || (!isTempWhite && !tempList.contains(tempName));
        return !disableAll && stoneVariant && biomeAllowed && tempAllowed;
    }

    /**
     * The variant of a block is already part of the block name
     * but due to the syntax of a block name hard to get with string splitting.
     * This is the alternative.
     *
     * @param fillerBlock The filler block is also always the variant of the replacer block (for which the variant should be determined).
     * @return The stone variant and its modid as concatenated String ('modid.variant') of the given block.
     */
    private static String getVariantWithModOwner(Block fillerBlock) {
        String ownerAndVariant;
        ResourceLocation resLoc = fillerBlock.getRegistryName();
        if (resLoc != null) {
            ownerAndVariant = resLoc.toString().replace(":", ".");
            return ownerAndVariant;
        } else {
            throw new NullPointerException("Block '" + fillerBlock + "' has no registry name!");
        }
    }

    /**
     * Removes generation for all vanilla overworld ores in the given biome.
     *
     * @param biome The given biome.
     */
    private static void removeVanillaOverworldOres(Biome biome) {
        List<ConfiguredFeature<?, ?>> featuresToRemove = new ArrayList<>();
        for (ConfiguredFeature<?, ?> feature : biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES)) {
            if (feature.config instanceof DecoratedFeatureConfig) {
                if (((DecoratedFeatureConfig) feature.config).feature.feature instanceof OreFeature) {
                    Block b = ((OreFeatureConfig) ((DecoratedFeatureConfig) feature.config).feature.config).state.getBlock();
                    if (b == Blocks.IRON_ORE || b == Blocks.GOLD_ORE || b == Blocks.COAL_ORE || b == Blocks.DIAMOND_ORE || b == Blocks.EMERALD_ORE || b == Blocks.LAPIS_ORE || b == Blocks.REDSTONE_ORE) {
                        featuresToRemove.add(feature);
                    }
                }
            }
        }
        biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).removeAll(featuresToRemove);
    }

    /**
     * Removes Vanilla Nether Quartz Ore generation in the given biome.
     *
     * @param biome The given biome.
     */
    private static void removeNetherQuartzOre(Biome biome) {
        List<ConfiguredFeature<?, ?>> featuresToRemove = new ArrayList<>();
        for (ConfiguredFeature<?, ?> feature : biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION)) {
            if (feature.config instanceof DecoratedFeatureConfig) {
                if (((DecoratedFeatureConfig) feature.config).feature.feature instanceof OreFeature) {
                    Block b = ((OreFeatureConfig) ((DecoratedFeatureConfig) feature.config).feature.config).state.getBlock();
                    if (b == Blocks.NETHER_QUARTZ_ORE) {
                        featuresToRemove.add(feature);
                    }
                }
            }
        }
        biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION).removeAll(featuresToRemove);
    }
}
