package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Chrome;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class ChromeGen {

    public static void addChromeGen(Biome biome, String biomeRNS, String biomeTS) {
        addChromeOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addChromeOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Chrome.enableStoneChromeOre.get()) {
                if ((Chrome.isTempWhitelistStoneChromeOre.get() && Chrome.temperatureBlacklistStoneChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistStoneChromeOre.get() && !Chrome.temperatureBlacklistStoneChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistStoneChromeOre.get() && Chrome.biomeBlacklistStoneChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistStoneChromeOre.get() && !Chrome.biomeBlacklistStoneChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeStoneChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkStoneChromeOre.get(), Chrome.minHeightStoneChromeOre.get(), 0, Chrome.maxHeightStoneChromeOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Chrome.enableAndesiteChromeOre.get()) {
                if ((Chrome.isTempWhitelistAndesiteChromeOre.get() && Chrome.temperatureBlacklistAndesiteChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistAndesiteChromeOre.get() && !Chrome.temperatureBlacklistAndesiteChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistAndesiteChromeOre.get() && Chrome.biomeBlacklistAndesiteChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistAndesiteChromeOre.get() && !Chrome.biomeBlacklistAndesiteChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeAndesiteChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkAndesiteChromeOre.get(), Chrome.minHeightAndesiteChromeOre.get(), 0, Chrome.maxHeightAndesiteChromeOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Chrome.enableDioriteChromeOre.get()) {
                if ((Chrome.isTempWhitelistDioriteChromeOre.get() && Chrome.temperatureBlacklistDioriteChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistDioriteChromeOre.get() && !Chrome.temperatureBlacklistDioriteChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistDioriteChromeOre.get() && Chrome.biomeBlacklistDioriteChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistDioriteChromeOre.get() && !Chrome.biomeBlacklistDioriteChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeDioriteChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkDioriteChromeOre.get(), Chrome.minHeightDioriteChromeOre.get(), 0, Chrome.maxHeightDioriteChromeOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Chrome.enableGraniteChromeOre.get()) {
                if ((Chrome.isTempWhitelistGraniteChromeOre.get() && Chrome.temperatureBlacklistGraniteChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistGraniteChromeOre.get() && !Chrome.temperatureBlacklistGraniteChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistGraniteChromeOre.get() && Chrome.biomeBlacklistGraniteChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistGraniteChromeOre.get() && !Chrome.biomeBlacklistGraniteChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeGraniteChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkGraniteChromeOre.get(), Chrome.minHeightGraniteChromeOre.get(), 0, Chrome.maxHeightGraniteChromeOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Chrome.enableNetherrackChromeOre.get()) {
                if ((Chrome.isTempWhitelistNetherrackChromeOre.get() && Chrome.temperatureBlacklistNetherrackChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistNetherrackChromeOre.get() && !Chrome.temperatureBlacklistNetherrackChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistNetherrackChromeOre.get() && Chrome.biomeBlacklistNetherrackChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistNetherrackChromeOre.get() && !Chrome.biomeBlacklistNetherrackChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeNetherrackChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkNetherrackChromeOre.get(), Chrome.minHeightNetherrackChromeOre.get(), 0, Chrome.maxHeightNetherrackChromeOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Chrome.enableEndStoneChromeOre.get()) {
                if ((Chrome.isTempWhitelistEndStoneChromeOre.get() && Chrome.temperatureBlacklistEndStoneChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistEndStoneChromeOre.get() && !Chrome.temperatureBlacklistEndStoneChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistEndStoneChromeOre.get() && Chrome.biomeBlacklistEndStoneChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistEndStoneChromeOre.get() && !Chrome.biomeBlacklistEndStoneChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeEndStoneChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkEndStoneChromeOre.get(), Chrome.minHeightEndStoneChromeOre.get(), 0, Chrome.maxHeightEndStoneChromeOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Chrome.enableSandChromeOre.get()) {
                if ((Chrome.isTempWhitelistSandChromeOre.get() && Chrome.temperatureBlacklistSandChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistSandChromeOre.get() && !Chrome.temperatureBlacklistSandChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistSandChromeOre.get() && Chrome.biomeBlacklistSandChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistSandChromeOre.get() && !Chrome.biomeBlacklistSandChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeSandChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkSandChromeOre.get(), Chrome.minHeightSandChromeOre.get(), 0, Chrome.maxHeightSandChromeOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Chrome.enableRedSandChromeOre.get()) {
                if ((Chrome.isTempWhitelistRedSandChromeOre.get() && Chrome.temperatureBlacklistRedSandChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistRedSandChromeOre.get() && !Chrome.temperatureBlacklistRedSandChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistRedSandChromeOre.get() && Chrome.biomeBlacklistRedSandChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistRedSandChromeOre.get() && !Chrome.biomeBlacklistRedSandChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeRedSandChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkRedSandChromeOre.get(), Chrome.minHeightRedSandChromeOre.get(), 0, Chrome.maxHeightRedSandChromeOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Chrome.enableGravelChromeOre.get()) {
                if ((Chrome.isTempWhitelistGravelChromeOre.get() && Chrome.temperatureBlacklistGravelChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistGravelChromeOre.get() && !Chrome.temperatureBlacklistGravelChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistGravelChromeOre.get() && Chrome.biomeBlacklistGravelChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistGravelChromeOre.get() && !Chrome.biomeBlacklistGravelChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeGravelChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkGravelChromeOre.get(), Chrome.minHeightGravelChromeOre.get(), 0, Chrome.maxHeightGravelChromeOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Chrome.enableSandstoneChromeOre.get()) {
                if ((Chrome.isTempWhitelistSandstoneChromeOre.get() && Chrome.temperatureBlacklistSandstoneChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistSandstoneChromeOre.get() && !Chrome.temperatureBlacklistSandstoneChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistSandstoneChromeOre.get() && Chrome.biomeBlacklistSandstoneChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistSandstoneChromeOre.get() && !Chrome.biomeBlacklistSandstoneChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeSandstoneChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkSandstoneChromeOre.get(), Chrome.minHeightSandstoneChromeOre.get(), 0, Chrome.maxHeightSandstoneChromeOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Chrome.enableRedSandstoneChromeOre.get()) {
                if ((Chrome.isTempWhitelistRedSandstoneChromeOre.get() && Chrome.temperatureBlacklistRedSandstoneChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistRedSandstoneChromeOre.get() && !Chrome.temperatureBlacklistRedSandstoneChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistRedSandstoneChromeOre.get() && Chrome.biomeBlacklistRedSandstoneChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistRedSandstoneChromeOre.get() && !Chrome.biomeBlacklistRedSandstoneChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeRedSandstoneChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkRedSandstoneChromeOre.get(), Chrome.minHeightRedSandstoneChromeOre.get(), 0, Chrome.maxHeightRedSandstoneChromeOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Chrome.enableBlueIceChromeOre.get()) {
                if ((Chrome.isTempWhitelistBlueIceChromeOre.get() && Chrome.temperatureBlacklistBlueIceChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistBlueIceChromeOre.get() && !Chrome.temperatureBlacklistBlueIceChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistBlueIceChromeOre.get() && Chrome.biomeBlacklistBlueIceChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistBlueIceChromeOre.get() && !Chrome.biomeBlacklistBlueIceChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeBlueIceChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkBlueIceChromeOre.get(), Chrome.minHeightBlueIceChromeOre.get(), 0, Chrome.maxHeightBlueIceChromeOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Chrome.enablePackedIceChromeOre.get()) {
                if ((Chrome.isTempWhitelistPackedIceChromeOre.get() && Chrome.temperatureBlacklistPackedIceChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistPackedIceChromeOre.get() && !Chrome.temperatureBlacklistPackedIceChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistPackedIceChromeOre.get() && Chrome.biomeBlacklistPackedIceChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistPackedIceChromeOre.get() && !Chrome.biomeBlacklistPackedIceChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizePackedIceChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkPackedIceChromeOre.get(), Chrome.minHeightPackedIceChromeOre.get(), 0, Chrome.maxHeightPackedIceChromeOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Chrome.enableBedrockChromeOre.get()) {
                if ((Chrome.isTempWhitelistBedrockChromeOre.get() && Chrome.temperatureBlacklistBedrockChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistBedrockChromeOre.get() && !Chrome.temperatureBlacklistBedrockChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistBedrockChromeOre.get() && Chrome.biomeBlacklistBedrockChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistBedrockChromeOre.get() && !Chrome.biomeBlacklistBedrockChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeBedrockChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkBedrockChromeOre.get(), Chrome.minHeightBedrockChromeOre.get(), 0, Chrome.maxHeightBedrockChromeOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Chrome.enableQuarkBasaltChromeOre.get()) {
                if ((Chrome.isTempWhitelistQuarkBasaltChromeOre.get() && Chrome.temperatureBlacklistQuarkBasaltChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistQuarkBasaltChromeOre.get() && !Chrome.temperatureBlacklistQuarkBasaltChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistQuarkBasaltChromeOre.get() && Chrome.biomeBlacklistQuarkBasaltChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistQuarkBasaltChromeOre.get() && !Chrome.biomeBlacklistQuarkBasaltChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeQuarkBasaltChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkQuarkBasaltChromeOre.get(), Chrome.minHeightQuarkBasaltChromeOre.get(), 0, Chrome.maxHeightQuarkBasaltChromeOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Chrome.enableQuarkMarbleChromeOre.get()) {
                if ((Chrome.isTempWhitelistQuarkMarbleChromeOre.get() && Chrome.temperatureBlacklistQuarkMarbleChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistQuarkMarbleChromeOre.get() && !Chrome.temperatureBlacklistQuarkMarbleChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistQuarkMarbleChromeOre.get() && Chrome.biomeBlacklistQuarkMarbleChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistQuarkMarbleChromeOre.get() && !Chrome.biomeBlacklistQuarkMarbleChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeQuarkMarbleChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkQuarkMarbleChromeOre.get(), Chrome.minHeightQuarkMarbleChromeOre.get(), 0, Chrome.maxHeightQuarkMarbleChromeOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Chrome.enableQuarkSlateChromeOre.get()) {
                if ((Chrome.isTempWhitelistQuarkSlateChromeOre.get() && Chrome.temperatureBlacklistQuarkSlateChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistQuarkSlateChromeOre.get() && !Chrome.temperatureBlacklistQuarkSlateChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistQuarkSlateChromeOre.get() && Chrome.biomeBlacklistQuarkSlateChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistQuarkSlateChromeOre.get() && !Chrome.biomeBlacklistQuarkSlateChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeQuarkSlateChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkQuarkSlateChromeOre.get(), Chrome.minHeightQuarkSlateChromeOre.get(), 0, Chrome.maxHeightQuarkSlateChromeOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Chrome.enableQuarkLimestoneChromeOre.get()) {
                if ((Chrome.isTempWhitelistQuarkLimestoneChromeOre.get() && Chrome.temperatureBlacklistQuarkLimestoneChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistQuarkLimestoneChromeOre.get() && !Chrome.temperatureBlacklistQuarkLimestoneChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistQuarkLimestoneChromeOre.get() && Chrome.biomeBlacklistQuarkLimestoneChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistQuarkLimestoneChromeOre.get() && !Chrome.biomeBlacklistQuarkLimestoneChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeQuarkLimestoneChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkQuarkLimestoneChromeOre.get(), Chrome.minHeightQuarkLimestoneChromeOre.get(), 0, Chrome.maxHeightQuarkLimestoneChromeOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Chrome.enableQuarkJasperChromeOre.get()) {
                if ((Chrome.isTempWhitelistQuarkJasperChromeOre.get() && Chrome.temperatureBlacklistQuarkJasperChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistQuarkJasperChromeOre.get() && !Chrome.temperatureBlacklistQuarkJasperChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistQuarkJasperChromeOre.get() && Chrome.biomeBlacklistQuarkJasperChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistQuarkJasperChromeOre.get() && !Chrome.biomeBlacklistQuarkJasperChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeQuarkJasperChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkQuarkJasperChromeOre.get(), Chrome.minHeightQuarkJasperChromeOre.get(), 0, Chrome.maxHeightQuarkJasperChromeOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Chrome.enableEmbellishcraftBasaltChromeOre.get()) {
                if ((Chrome.isTempWhitelistEmbellishcraftBasaltChromeOre.get() && Chrome.temperatureBlacklistEmbellishcraftBasaltChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistEmbellishcraftBasaltChromeOre.get() && !Chrome.temperatureBlacklistEmbellishcraftBasaltChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistEmbellishcraftBasaltChromeOre.get() && Chrome.biomeBlacklistEmbellishcraftBasaltChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistEmbellishcraftBasaltChromeOre.get() && !Chrome.biomeBlacklistEmbellishcraftBasaltChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeEmbellishcraftBasaltChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkEmbellishcraftBasaltChromeOre.get(), Chrome.minHeightEmbellishcraftBasaltChromeOre.get(), 0, Chrome.maxHeightEmbellishcraftBasaltChromeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Chrome.enableEmbellishcraftGneissChromeOre.get()) {
                if ((Chrome.isTempWhitelistEmbellishcraftGneissChromeOre.get() && Chrome.temperatureBlacklistEmbellishcraftGneissChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistEmbellishcraftGneissChromeOre.get() && !Chrome.temperatureBlacklistEmbellishcraftGneissChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistEmbellishcraftGneissChromeOre.get() && Chrome.biomeBlacklistEmbellishcraftGneissChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistEmbellishcraftGneissChromeOre.get() && !Chrome.biomeBlacklistEmbellishcraftGneissChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeEmbellishcraftGneissChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkEmbellishcraftGneissChromeOre.get(), Chrome.minHeightEmbellishcraftGneissChromeOre.get(), 0, Chrome.maxHeightEmbellishcraftGneissChromeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Chrome.enableEmbellishcraftJadeChromeOre.get()) {
                if ((Chrome.isTempWhitelistEmbellishcraftJadeChromeOre.get() && Chrome.temperatureBlacklistEmbellishcraftJadeChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistEmbellishcraftJadeChromeOre.get() && !Chrome.temperatureBlacklistEmbellishcraftJadeChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistEmbellishcraftJadeChromeOre.get() && Chrome.biomeBlacklistEmbellishcraftJadeChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistEmbellishcraftJadeChromeOre.get() && !Chrome.biomeBlacklistEmbellishcraftJadeChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeEmbellishcraftJadeChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkEmbellishcraftJadeChromeOre.get(), Chrome.minHeightEmbellishcraftJadeChromeOre.get(), 0, Chrome.maxHeightEmbellishcraftJadeChromeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Chrome.enableEmbellishcraftLarvikiteChromeOre.get()) {
                if ((Chrome.isTempWhitelistEmbellishcraftLarvikiteChromeOre.get() && Chrome.temperatureBlacklistEmbellishcraftLarvikiteChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistEmbellishcraftLarvikiteChromeOre.get() && !Chrome.temperatureBlacklistEmbellishcraftLarvikiteChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistEmbellishcraftLarvikiteChromeOre.get() && Chrome.biomeBlacklistEmbellishcraftLarvikiteChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistEmbellishcraftLarvikiteChromeOre.get() && !Chrome.biomeBlacklistEmbellishcraftLarvikiteChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeEmbellishcraftLarvikiteChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkEmbellishcraftLarvikiteChromeOre.get(), Chrome.minHeightEmbellishcraftLarvikiteChromeOre.get(), 0, Chrome.maxHeightEmbellishcraftLarvikiteChromeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Chrome.enableEmbellishcraftMarbleChromeOre.get()) {
                if ((Chrome.isTempWhitelistEmbellishcraftMarbleChromeOre.get() && Chrome.temperatureBlacklistEmbellishcraftMarbleChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistEmbellishcraftMarbleChromeOre.get() && !Chrome.temperatureBlacklistEmbellishcraftMarbleChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistEmbellishcraftMarbleChromeOre.get() && Chrome.biomeBlacklistEmbellishcraftMarbleChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistEmbellishcraftMarbleChromeOre.get() && !Chrome.biomeBlacklistEmbellishcraftMarbleChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeEmbellishcraftMarbleChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkEmbellishcraftMarbleChromeOre.get(), Chrome.minHeightEmbellishcraftMarbleChromeOre.get(), 0, Chrome.maxHeightEmbellishcraftMarbleChromeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Chrome.enableEmbellishcraftSlateChromeOre.get()) {
                if ((Chrome.isTempWhitelistEmbellishcraftSlateChromeOre.get() && Chrome.temperatureBlacklistEmbellishcraftSlateChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistEmbellishcraftSlateChromeOre.get() && !Chrome.temperatureBlacklistEmbellishcraftSlateChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistEmbellishcraftSlateChromeOre.get() && Chrome.biomeBlacklistEmbellishcraftSlateChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistEmbellishcraftSlateChromeOre.get() && !Chrome.biomeBlacklistEmbellishcraftSlateChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeEmbellishcraftSlateChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkEmbellishcraftSlateChromeOre.get(), Chrome.minHeightEmbellishcraftSlateChromeOre.get(), 0, Chrome.maxHeightEmbellishcraftSlateChromeOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Chrome.enableHardenedStoneChromeOre.get()) {
                if ((Chrome.isTempWhitelistHardenedStoneChromeOre.get() && Chrome.temperatureBlacklistHardenedStoneChromeOre.get().contains(biomeTS)) || (!Chrome.isTempWhitelistHardenedStoneChromeOre.get() && !Chrome.temperatureBlacklistHardenedStoneChromeOre.get().contains(biomeTS))) {
                    if ((Chrome.isBiomeWhitelistHardenedStoneChromeOre.get() && Chrome.biomeBlacklistHardenedStoneChromeOre.get().contains(biomeRNS)) || (!Chrome.isBiomeWhitelistHardenedStoneChromeOre.get() && !Chrome.biomeBlacklistHardenedStoneChromeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_CHROME_ORE.get().getDefaultState(), Chrome.veinSizeHardenedStoneChromeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Chrome.veinsPerChunkHardenedStoneChromeOre.get(), Chrome.minHeightHardenedStoneChromeOre.get(), 0, Chrome.maxHeightHardenedStoneChromeOre.get()))));
                    } } } }
    }
}
