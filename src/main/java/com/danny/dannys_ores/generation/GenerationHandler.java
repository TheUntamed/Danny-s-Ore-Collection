package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseBlock;
import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.ores.vanilla.*;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.ConfigHandler;
import com.danny.dannys_ores.util.PathHandler;
import com.danny.dannys_ores.util.RichnessTypes;
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

import java.util.ArrayList;
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
        if (General.enableConfigChecker.get()) {
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

        // Disable existing features
        for (Biome biome : ForgeRegistries.BIOMES) {
            ResourceLocation biomeResLoc = biome.getRegistryName();
            if (biomeResLoc != null) {
                biomeName = biomeResLoc.toString();
            }
            String tempName = biome.getTempCategory().toString();

            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                if (General.disableOtherOverworldOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (General.removeVanillaOverworldOreGeneration.get()) {
                    removeVanillaOverworldOres(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.NETHER) {
                if (General.disableOtherNetherOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (General.removeVanillaNetherOreGeneration.get()) {
                    removeNetherQuartzOre(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.THEEND) {
                if (General.disableOtherEndOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                }
            }

            // Re-add vanilla ores
            if (General.enableCustomVanillaOreGeneration.get()) {
                if (Coal.enableVanillaCoalOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.COAL_ORE.getDefaultState(), max(Coal.veinSizeVanillaCoalOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Coal.veinsPerChunkVanillaCoalOre.get(), Coal.minHeightVanillaCoalOre.get(), 0, Coal.maxHeightVanillaCoalOre.get()))));
                }
                if (Iron.enableVanillaIronOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.IRON_ORE.getDefaultState(), max(Iron.veinSizeVanillaIronOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkVanillaIronOre.get(), Iron.minHeightVanillaIronOre.get(), 0, Iron.maxHeightVanillaIronOre.get()))));
                }
                if (Gold.enableVanillaGoldOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.GOLD_ORE.getDefaultState(), max(Gold.veinSizeVanillaGoldOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Gold.veinsPerChunkVanillaGoldOre.get(), Gold.minHeightVanillaGoldOre.get(), 0, Gold.maxHeightVanillaGoldOre.get()))));
                }
                if (Lapis.enableVanillaLapisOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.LAPIS_ORE.getDefaultState(), max(Lapis.veinSizeVanillaLapisOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkVanillaLapisOre.get(), Lapis.minHeightVanillaLapisOre.get(), 0, Lapis.maxHeightVanillaLapisOre.get()))));
                }
                if (Redstone.enableVanillaRedstoneOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.REDSTONE_ORE.getDefaultState(), max(Redstone.veinSizeVanillaRedstoneOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Redstone.veinsPerChunkVanillaRedstoneOre.get(), Redstone.minHeightVanillaRedstoneOre.get(), 0, Redstone.maxHeightVanillaRedstoneOre.get()))));
                }
                if (Diamond.enableVanillaDiamondOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.DIAMOND_ORE.getDefaultState(), max(Diamond.veinSizeVanillaDiamondOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkVanillaDiamondOre.get(), Diamond.minHeightVanillaDiamondOre.get(), 0, Diamond.maxHeightVanillaDiamondOre.get()))));
                }
                if (Emerald.enableVanillaEmeraldOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.EMERALD_ORE.getDefaultState(), max(Emerald.veinSizeVanillaEmeraldOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Emerald.veinsPerChunkVanillaEmeraldOre.get(), Emerald.minHeightVanillaEmeraldOre.get(), 0, Emerald.maxHeightVanillaEmeraldOre.get()))));
                }
                if (Quartz.enableVanillaNetherQuartzOre.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), Blocks.NETHER_QUARTZ_ORE.getDefaultState(), max(Quartz.veinSizeVanillaNetherQuartzOre.get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Quartz.veinsPerChunkVanillaNetherQuartzOre.get(), Quartz.minHeightVanillaNetherQuartzOre.get(), 0, Quartz.maxHeightVanillaNetherQuartzOre.get()))));
                }
            }

            // Add own generation
            for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
                Block block = blockRO.get();
                ResourceLocation resLoc = block.getRegistryName();
                if (resLoc != null) {
                    String regName = resLoc.toString();
                    String blockName = regName.split(":")[1];
                    if (block instanceof BaseOre) {
                        if (!blockName.contains("quark") && !blockName.contains("embellishcraft") || blockName.contains("quark") && Main.quark || blockName.contains("embellishcraft") && Main.embellishcraft) {
                            Block fillerBlock = ((BaseBlock) block).getBlockBase();
                            UnmodifiableConfig generalConfig = General.spec.getValues();
                            if (getGeneralOreGenerationStatus(generalConfig, (BaseOre) block, fillerBlock)) {
                                UnmodifiableConfig config = ConfigHandler.getConfig(block);
                                if (getSpecificOreGenerationStatus(config, blockName, biomeName, tempName)) {
                                    int veinSize = ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.veinSize")).get();
                                    if (veinSize == 0) {
                                        Main.LOGGER.info("Generation of '" + block + "' is enabled but vein size is 0!");
                                    } else if (veinSize < 3) {
                                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(fillerBlock.getDefaultState(), block.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.veinsPerChunk")).get(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.minHeight")).get(), 0, ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.maxHeight")).get()))));
                                    } else {
                                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create(fillerBlock.toString(), null, new BlockMatcher(fillerBlock)), block.getDefaultState(), veinSize)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.veinsPerChunk")).get(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.minHeight")).get(), 0, ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.maxHeight")).get()))));
                                    }
                                }
                            }
                        }
                    } else if (block instanceof BaseBlock) {
                        UnmodifiableConfig config = ConfigHandler.getConfig(block);
                        if (getStoneGenerationStatus(config, blockName, biomeName, tempName)) {
//                            if (((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getAsLayerPath())).get()) {
//                                List<BlockState> targets = Lists.newArrayList(Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.GRANITE.getDefaultState(), Blocks.ANDESITE.getDefaultState(), Blocks.DIORITE.getDefaultState(), Blocks.GRAVEL.getDefaultState());
//                                //biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(block.getDefaultState(), 8, 1, targets)).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));
//                                System.err.println("Generate: " + block);
//                                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(block.getDefaultState(), 8, 1, targets)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.clustersPerChunk")).get(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.minHeight")).get(), 0, ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.maxHeight")).get()))));
//                            } else {
                                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, block.getDefaultState(), max(((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.clusterSize")).get(), 3))).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.clustersPerChunk")).get(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.minHeight")).get(), 0, ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.maxHeight")).get()))));
//                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks the specific configs of an ore if it is allowed to generate.
     *
     * @param config    The config of the block.
     * @param blockName The name of the given ore.
     * @param biomeName the current biome.
     * @param tempName  The temperature of the given biome.
     * @return True if the given block should generate. False if it shouldn't.
     */
    private static boolean getSpecificOreGenerationStatus(UnmodifiableConfig config, String blockName, String biomeName, String tempName) {

        boolean disableAll = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getDisableAllVariantsPath())).get();
        boolean stoneVariant = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getEnableVariantPath())).get();
        boolean isTempWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getIsTempWhitelistPath())).get();
        boolean isBiomeWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getIsBiomeWhitelistPath())).get();
        ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getBiomeBlacklistPath());
        List<String> biomeList = inBiomeFCS.get();
        ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getTemperatureBlacklistPath());
        List<String> tempList = inTempFCS.get();
        boolean biomeAllowed = (isBiomeWhite && biomeList.contains(biomeName)) || (!isBiomeWhite && !biomeList.contains(biomeName));
        boolean tempAllowed = (isTempWhite && tempList.contains(tempName)) || (!isTempWhite && !tempList.contains(tempName));

        return !disableAll && stoneVariant && biomeAllowed && tempAllowed;
    }

    /**
     * Checks the general configs if an ore is allowed to generate.
     *
     * @param config      The config to check.
     * @param ore         The ore to check the general generation for.
     * @param fillerBlock The filler block of the ore the generation is checked for.
     * @return True if the block should generate.
     */
    private static boolean getGeneralOreGenerationStatus(UnmodifiableConfig config, BaseOre ore, Block fillerBlock) {
        String variantWithOwner = getVariantWithModOwner(fillerBlock);
        RichnessTypes rType = ore.getRichnessType();
        String rT = rType.toString().toLowerCase();
        if (((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + rT + ".allVariants")).get()) {
            return false;
        } else {
            return !((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + rT + ".stone_variants." + variantWithOwner)).get();
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
        boolean disableAll = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getDisableAllVariantsPath())).get();
        boolean stoneVariant = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getEnableVariantPath())).get();
        boolean isTempWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getIsTempWhitelistPath())).get();
        boolean isBiomeWhite = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getIsBiomeWhitelistPath())).get();
        ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getBiomeBlacklistPath());
        List<String> biomeList = inBiomeFCS.get();
        ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getTemperatureBlacklistPath());
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
