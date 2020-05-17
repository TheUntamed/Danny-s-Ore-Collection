package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseBlock;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.ConfigHandler;
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

public class GenerationHandler {

    /**
     * Called by Main class to process all ore generation.
     *
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
            //ConfigChecker.checkConfig(biomeVerify, tempVerify);
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
                if(General.disableOtherNetherOreGeneration.get()) {
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

            // Add own generation
            for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
                Block block = blockRO.get();
                ResourceLocation resLoc = block.getRegistryName();
                if (resLoc != null) {
                    String regName = resLoc.toString();
                    String blockName = regName.split(":")[1];
                    if (!blockName.contains("quark") && !blockName.contains("embellishcraft") || blockName.contains("quark") && Main.quark || blockName.contains("embellishcraft") && Main.embellishcraft) {
                        UnmodifiableConfig config = ConfigHandler.getConfig(blockName);
                        if (blockName.contains("_ore")) {
                            //Block fillerBlock = Blocks.BARRIER;
//                            if (block instanceof BaseBlock) {
//                                if (block.getRegistryName().toString().contains("bedrock")) {
//                                    System.err.println("Inside Bedrock Check!");
//                                }
//                                fillerBlock = ((BaseBlock) block).getBlockBase();
//                            }
                            Block fillerBlock = FillerBlock.getFillerBlock(block);
                            if (getOreGenerationStatus(config, regName, biomeName, tempName)) {
                                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create(fillerBlock.toString(), null, new BlockMatcher(fillerBlock)), block.getDefaultState(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.veinSize")).get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.veinsPerChunk")).get(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.minHeight")).get(), 0, ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.maxHeight")).get()))));
                            }
                        } else {
                            if (getStoneGenerationStatus(config, blockName, biomeName, tempName)) {
                                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, block.getDefaultState(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.clusterSize")).get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.clustersPerChunk")).get(), ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.minHeight")).get(), 0, ((ForgeConfigSpec.IntValue) config.get("general." + blockName + ".generation.maxHeight")).get()))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks the configs if a block is allowed to generate.
     * The given block should be an ore of this mod.
     *
     * @param config The config of the block.
     * @param regName The name of the block.
     * @param biomeName the current biome.
     * @param tempName The temperature of the given biome.
     * @return True if the given block should generate. False if it shouldn't.
     */
    private static boolean getOreGenerationStatus(UnmodifiableConfig config , String regName, String biomeName, String tempName) {
        String[] sub = regName.split(":");
        String blockOwner = sub[0];
        String blockName = sub[1];
        String variant = getVariantWithModOwner(blockName);
        UnmodifiableConfig generalConfig = General.spec.getValues();
        boolean variantIsDisabled;
        if (blockOwner.equals("minecraft")) {
            variantIsDisabled = !((ForgeConfigSpec.BooleanValue) generalConfig.get("general.vanilla_and_other_mods.enableCustomVanillaOreGeneration")).get();
        } else {
            variantIsDisabled = ((ForgeConfigSpec.BooleanValue) generalConfig.get("general.stone_variants." + variant)).get();
        }
        boolean disableAll = ((ForgeConfigSpec.BooleanValue) config.get("general.disableAllVariants")).get();
        boolean stoneVariant = ((ForgeConfigSpec.BooleanValue) config.get("general." + blockName + ".generation.enableVariant")).get();
        boolean isTempWhite = ((ForgeConfigSpec.BooleanValue) config.get("general." + blockName + ".generation.isTempWhitelist")).get();
        boolean isBiomeWhite = ((ForgeConfigSpec.BooleanValue) config.get("general." + blockName + ".generation.isBiomeWhitelist")).get();
        ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get("general." + blockName + ".generation.biomeBlacklist");
        List<String> biomeList = inBiomeFCS.get();
        ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get("general." + blockName + ".generation.temperatureBlacklist");
        List<String> tempList = inTempFCS.get();
        boolean biomeAllowed = (isBiomeWhite && biomeList.contains(biomeName)) || (!isBiomeWhite && !biomeList.contains(biomeName));
        boolean tempAllowed = (isTempWhite && tempList.contains(tempName)) || (!isTempWhite && !tempList.contains(tempName));

        return !variantIsDisabled && !disableAll && stoneVariant && biomeAllowed && tempAllowed;
    }

    /**
     * Checks the configs if a block is allowed to generate.
     * The given block should be a stone variant of this mod.
     *
     * @param config The config of the block.
     * @param blockName The name of the block.
     * @param biomeName the current biome.
     * @param tempName The temperature of the given biome.
     * @return True if the given block should generate. False if it shouldn't.
     */
    private static boolean getStoneGenerationStatus(UnmodifiableConfig config , String blockName, String biomeName, String tempName) {
        boolean disableAll = ((ForgeConfigSpec.BooleanValue) config.get("general.disableAllVariants")).get();

        boolean stoneVariant = ((ForgeConfigSpec.BooleanValue) config.get("general." + blockName + ".generation.enableVariant")).get();
        boolean isTempWhite = ((ForgeConfigSpec.BooleanValue) config.get("general." + blockName + ".generation.isTempWhitelist")).get();
        boolean isBiomeWhite = ((ForgeConfigSpec.BooleanValue) config.get("general." + blockName + ".generation.isBiomeWhitelist")).get();
        ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get("general." + blockName + ".generation.biomeBlacklist");
        List<String> biomeList = inBiomeFCS.get();
        ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get("general." + blockName + ".generation.temperatureBlacklist");
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
     * @param blockName The name of the block for which the variant should be determined.
     * @return The stone variant and its modid as concatenated String ('modid.variant') of the given block.
     */
    private static String getVariantWithModOwner(String blockName) {
        if (blockName.contains("andesite")) { return "minecraft.andesite"; }
        else if (blockName.contains("bedrock")) { return "minecraft.bedrock"; }
        else if (blockName.contains("blue_ice")) { return "minecraft.blue_ice"; }
        else if (blockName.contains("diorite")) { return "minecraft.diorite"; }
        else if (blockName.contains("embellishcraft_basalt")) { return "embellishcraft.embellishcraft_basalt"; }
        else if (blockName.contains("embellishcraft_gneiss")) { return "embellishcraft.embellishcraft_gneiss"; }
        else if (blockName.contains("embellishcraft_jade")) { return "embellishcraft.embellishcraft_jade"; }
        else if (blockName.contains("embellishcraft_larvikite")) { return "embellishcraft.embellishcraft_larvikite"; }
        else if (blockName.contains("embellishcraft_marble")) { return "embellishcraft.embellishcraft_marble"; }
        else if (blockName.contains("embellishcraft_slate")) { return "embellishcraft.embellishcraft_slate"; }
        else if (blockName.contains("end_stone")) { return "minecraft.end_stone"; }
        else if (blockName.contains("granite")) { return "minecraft.granite"; }
        else if (blockName.contains("gravel")) { return "minecraft.gravel"; }
        else if (blockName.contains("hardened_stone")) { return "dannys_ores.hardened_stone"; }
        else if (blockName.contains("netherrack")) { return "minecraft.netherrack"; }
        else if (blockName.contains("packed_ice")) { return "minecraft.packed_ice"; }
        else if (blockName.contains("quark_basalt")) { return "quark.quark_basalt"; }
        else if (blockName.contains("quark_jasper")) { return "quark.quark_jasper"; }
        else if (blockName.contains("quark_limestone")) { return "quark.quark_limestone"; }
        else if (blockName.contains("quark_marble")) { return "quark.quark_marble"; }
        else if (blockName.contains("quark_slate")) { return "quark.quark_slate"; }
        else if (blockName.contains("sand")) {
            if (blockName.contains("red_sand")) {
                return "minecraft.red_sand";
            } else {
                return "minecraft.sand";
            }
        } else if (blockName.contains("sandstone")) {
            if (blockName.contains("red_sandstone")) {
                return "minecraft.red_sandstone";
            } else {
                return "minecraft.sandstone";
            }
        }
        return "minecraft.stone";
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
                if (((DecoratedFeatureConfig)feature.config).feature.feature instanceof OreFeature) {
                    Block b = ((OreFeatureConfig)((DecoratedFeatureConfig)feature.config).feature.config).state.getBlock();
                    if (b == Blocks.IRON_ORE || b == Blocks.GOLD_ORE || b == Blocks.COAL_ORE || b == Blocks.DIAMOND_ORE || b == Blocks.EMERALD_ORE || b == Blocks.LAPIS_ORE || b == Blocks.REDSTONE_ORE) {
                        featuresToRemove.add(feature);
                    } } } }
        biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).removeAll(featuresToRemove);
    }

    /**
     * Removes Vanilla Nether Quartz Ore generation in the given biome.
     *
     * @param biome The given biome.
     */
    private static void removeNetherQuartzOre(Biome biome) {
        List<ConfiguredFeature<?, ?>> featuresToRemove = new ArrayList<>();
        for(ConfiguredFeature<?, ?> feature : biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION)) {
            if (feature.config instanceof DecoratedFeatureConfig) {
                if (((DecoratedFeatureConfig)feature.config).feature.feature instanceof OreFeature) {
                    Block b = ((OreFeatureConfig)((DecoratedFeatureConfig)feature.config).feature.config).state.getBlock();
                    if (b == Blocks.NETHER_QUARTZ_ORE) {
                        featuresToRemove.add(feature);
                    } } } }
        biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION).removeAll(featuresToRemove);
    }
}
