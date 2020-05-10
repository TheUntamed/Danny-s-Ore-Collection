package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Lucky;
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

public class LuckyGen {
    public static void addLuckyGen(Biome biome, String biomeRNS, String biomeTS) {
        addLuckyOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addLuckyOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Lucky.enableStoneLuckyOre.get()) {
                if ((Lucky.isTempWhitelistStoneLuckyOre.get() && Lucky.temperatureBlacklistStoneLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistStoneLuckyOre.get() && !Lucky.temperatureBlacklistStoneLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistStoneLuckyOre.get() && Lucky.biomeBlacklistStoneLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistStoneLuckyOre.get() && !Lucky.biomeBlacklistStoneLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeStoneLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkStoneLuckyOre.get(), Lucky.minHeightStoneLuckyOre.get(), 0, Lucky.maxHeightStoneLuckyOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Lucky.enableAndesiteLuckyOre.get()) {
                if ((Lucky.isTempWhitelistAndesiteLuckyOre.get() && Lucky.temperatureBlacklistAndesiteLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistAndesiteLuckyOre.get() && !Lucky.temperatureBlacklistAndesiteLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistAndesiteLuckyOre.get() && Lucky.biomeBlacklistAndesiteLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistAndesiteLuckyOre.get() && !Lucky.biomeBlacklistAndesiteLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeAndesiteLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkAndesiteLuckyOre.get(), Lucky.minHeightAndesiteLuckyOre.get(), 0, Lucky.maxHeightAndesiteLuckyOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Lucky.enableDioriteLuckyOre.get()) {
                if ((Lucky.isTempWhitelistDioriteLuckyOre.get() && Lucky.temperatureBlacklistDioriteLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistDioriteLuckyOre.get() && !Lucky.temperatureBlacklistDioriteLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistDioriteLuckyOre.get() && Lucky.biomeBlacklistDioriteLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistDioriteLuckyOre.get() && !Lucky.biomeBlacklistDioriteLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeDioriteLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkDioriteLuckyOre.get(), Lucky.minHeightDioriteLuckyOre.get(), 0, Lucky.maxHeightDioriteLuckyOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Lucky.enableGraniteLuckyOre.get()) {
                if ((Lucky.isTempWhitelistGraniteLuckyOre.get() && Lucky.temperatureBlacklistGraniteLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistGraniteLuckyOre.get() && !Lucky.temperatureBlacklistGraniteLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistGraniteLuckyOre.get() && Lucky.biomeBlacklistGraniteLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistGraniteLuckyOre.get() && !Lucky.biomeBlacklistGraniteLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeGraniteLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkGraniteLuckyOre.get(), Lucky.minHeightGraniteLuckyOre.get(), 0, Lucky.maxHeightGraniteLuckyOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Lucky.enableNetherrackLuckyOre.get()) {
                if ((Lucky.isTempWhitelistNetherrackLuckyOre.get() && Lucky.temperatureBlacklistNetherrackLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistNetherrackLuckyOre.get() && !Lucky.temperatureBlacklistNetherrackLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistNetherrackLuckyOre.get() && Lucky.biomeBlacklistNetherrackLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistNetherrackLuckyOre.get() && !Lucky.biomeBlacklistNetherrackLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeNetherrackLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkNetherrackLuckyOre.get(), Lucky.minHeightNetherrackLuckyOre.get(), 0, Lucky.maxHeightNetherrackLuckyOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Lucky.enableEndStoneLuckyOre.get()) {
                if ((Lucky.isTempWhitelistEndStoneLuckyOre.get() && Lucky.temperatureBlacklistEndStoneLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistEndStoneLuckyOre.get() && !Lucky.temperatureBlacklistEndStoneLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistEndStoneLuckyOre.get() && Lucky.biomeBlacklistEndStoneLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistEndStoneLuckyOre.get() && !Lucky.biomeBlacklistEndStoneLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeEndStoneLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkEndStoneLuckyOre.get(), Lucky.minHeightEndStoneLuckyOre.get(), 0, Lucky.maxHeightEndStoneLuckyOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Lucky.enableSandLuckyOre.get()) {
                if ((Lucky.isTempWhitelistSandLuckyOre.get() && Lucky.temperatureBlacklistSandLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistSandLuckyOre.get() && !Lucky.temperatureBlacklistSandLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistSandLuckyOre.get() && Lucky.biomeBlacklistSandLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistSandLuckyOre.get() && !Lucky.biomeBlacklistSandLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeSandLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkSandLuckyOre.get(), Lucky.minHeightSandLuckyOre.get(), 0, Lucky.maxHeightSandLuckyOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Lucky.enableRedSandLuckyOre.get()) {
                if ((Lucky.isTempWhitelistRedSandLuckyOre.get() && Lucky.temperatureBlacklistRedSandLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistRedSandLuckyOre.get() && !Lucky.temperatureBlacklistRedSandLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistRedSandLuckyOre.get() && Lucky.biomeBlacklistRedSandLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistRedSandLuckyOre.get() && !Lucky.biomeBlacklistRedSandLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeRedSandLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkRedSandLuckyOre.get(), Lucky.minHeightRedSandLuckyOre.get(), 0, Lucky.maxHeightRedSandLuckyOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Lucky.enableGravelLuckyOre.get()) {
                if ((Lucky.isTempWhitelistGravelLuckyOre.get() && Lucky.temperatureBlacklistGravelLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistGravelLuckyOre.get() && !Lucky.temperatureBlacklistGravelLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistGravelLuckyOre.get() && Lucky.biomeBlacklistGravelLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistGravelLuckyOre.get() && !Lucky.biomeBlacklistGravelLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeGravelLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkGravelLuckyOre.get(), Lucky.minHeightGravelLuckyOre.get(), 0, Lucky.maxHeightGravelLuckyOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Lucky.enableSandstoneLuckyOre.get()) {
                if ((Lucky.isTempWhitelistSandstoneLuckyOre.get() && Lucky.temperatureBlacklistSandstoneLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistSandstoneLuckyOre.get() && !Lucky.temperatureBlacklistSandstoneLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistSandstoneLuckyOre.get() && Lucky.biomeBlacklistSandstoneLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistSandstoneLuckyOre.get() && !Lucky.biomeBlacklistSandstoneLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeSandstoneLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkSandstoneLuckyOre.get(), Lucky.minHeightSandstoneLuckyOre.get(), 0, Lucky.maxHeightSandstoneLuckyOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Lucky.enableRedSandstoneLuckyOre.get()) {
                if ((Lucky.isTempWhitelistRedSandstoneLuckyOre.get() && Lucky.temperatureBlacklistRedSandstoneLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistRedSandstoneLuckyOre.get() && !Lucky.temperatureBlacklistRedSandstoneLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistRedSandstoneLuckyOre.get() && Lucky.biomeBlacklistRedSandstoneLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistRedSandstoneLuckyOre.get() && !Lucky.biomeBlacklistRedSandstoneLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeRedSandstoneLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkRedSandstoneLuckyOre.get(), Lucky.minHeightRedSandstoneLuckyOre.get(), 0, Lucky.maxHeightRedSandstoneLuckyOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Lucky.enableBlueIceLuckyOre.get()) {
                if ((Lucky.isTempWhitelistBlueIceLuckyOre.get() && Lucky.temperatureBlacklistBlueIceLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistBlueIceLuckyOre.get() && !Lucky.temperatureBlacklistBlueIceLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistBlueIceLuckyOre.get() && Lucky.biomeBlacklistBlueIceLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistBlueIceLuckyOre.get() && !Lucky.biomeBlacklistBlueIceLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeBlueIceLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkBlueIceLuckyOre.get(), Lucky.minHeightBlueIceLuckyOre.get(), 0, Lucky.maxHeightBlueIceLuckyOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Lucky.enablePackedIceLuckyOre.get()) {
                if ((Lucky.isTempWhitelistPackedIceLuckyOre.get() && Lucky.temperatureBlacklistPackedIceLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistPackedIceLuckyOre.get() && !Lucky.temperatureBlacklistPackedIceLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistPackedIceLuckyOre.get() && Lucky.biomeBlacklistPackedIceLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistPackedIceLuckyOre.get() && !Lucky.biomeBlacklistPackedIceLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizePackedIceLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkPackedIceLuckyOre.get(), Lucky.minHeightPackedIceLuckyOre.get(), 0, Lucky.maxHeightPackedIceLuckyOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Lucky.enableBedrockLuckyOre.get()) {
                if ((Lucky.isTempWhitelistBedrockLuckyOre.get() && Lucky.temperatureBlacklistBedrockLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistBedrockLuckyOre.get() && !Lucky.temperatureBlacklistBedrockLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistBedrockLuckyOre.get() && Lucky.biomeBlacklistBedrockLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistBedrockLuckyOre.get() && !Lucky.biomeBlacklistBedrockLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeBedrockLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkBedrockLuckyOre.get(), Lucky.minHeightBedrockLuckyOre.get(), 0, Lucky.maxHeightBedrockLuckyOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Lucky.enableQuarkBasaltLuckyOre.get()) {
                if ((Lucky.isTempWhitelistQuarkBasaltLuckyOre.get() && Lucky.temperatureBlacklistQuarkBasaltLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistQuarkBasaltLuckyOre.get() && !Lucky.temperatureBlacklistQuarkBasaltLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistQuarkBasaltLuckyOre.get() && Lucky.biomeBlacklistQuarkBasaltLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistQuarkBasaltLuckyOre.get() && !Lucky.biomeBlacklistQuarkBasaltLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeQuarkBasaltLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkQuarkBasaltLuckyOre.get(), Lucky.minHeightQuarkBasaltLuckyOre.get(), 0, Lucky.maxHeightQuarkBasaltLuckyOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Lucky.enableQuarkMarbleLuckyOre.get()) {
                if ((Lucky.isTempWhitelistQuarkMarbleLuckyOre.get() && Lucky.temperatureBlacklistQuarkMarbleLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistQuarkMarbleLuckyOre.get() && !Lucky.temperatureBlacklistQuarkMarbleLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistQuarkMarbleLuckyOre.get() && Lucky.biomeBlacklistQuarkMarbleLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistQuarkMarbleLuckyOre.get() && !Lucky.biomeBlacklistQuarkMarbleLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeQuarkMarbleLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkQuarkMarbleLuckyOre.get(), Lucky.minHeightQuarkMarbleLuckyOre.get(), 0, Lucky.maxHeightQuarkMarbleLuckyOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Lucky.enableQuarkSlateLuckyOre.get()) {
                if ((Lucky.isTempWhitelistQuarkSlateLuckyOre.get() && Lucky.temperatureBlacklistQuarkSlateLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistQuarkSlateLuckyOre.get() && !Lucky.temperatureBlacklistQuarkSlateLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistQuarkSlateLuckyOre.get() && Lucky.biomeBlacklistQuarkSlateLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistQuarkSlateLuckyOre.get() && !Lucky.biomeBlacklistQuarkSlateLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeQuarkSlateLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkQuarkSlateLuckyOre.get(), Lucky.minHeightQuarkSlateLuckyOre.get(), 0, Lucky.maxHeightQuarkSlateLuckyOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Lucky.enableQuarkLimestoneLuckyOre.get()) {
                if ((Lucky.isTempWhitelistQuarkLimestoneLuckyOre.get() && Lucky.temperatureBlacklistQuarkLimestoneLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistQuarkLimestoneLuckyOre.get() && !Lucky.temperatureBlacklistQuarkLimestoneLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistQuarkLimestoneLuckyOre.get() && Lucky.biomeBlacklistQuarkLimestoneLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistQuarkLimestoneLuckyOre.get() && !Lucky.biomeBlacklistQuarkLimestoneLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeQuarkLimestoneLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkQuarkLimestoneLuckyOre.get(), Lucky.minHeightQuarkLimestoneLuckyOre.get(), 0, Lucky.maxHeightQuarkLimestoneLuckyOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Lucky.enableQuarkJasperLuckyOre.get()) {
                if ((Lucky.isTempWhitelistQuarkJasperLuckyOre.get() && Lucky.temperatureBlacklistQuarkJasperLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistQuarkJasperLuckyOre.get() && !Lucky.temperatureBlacklistQuarkJasperLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistQuarkJasperLuckyOre.get() && Lucky.biomeBlacklistQuarkJasperLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistQuarkJasperLuckyOre.get() && !Lucky.biomeBlacklistQuarkJasperLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeQuarkJasperLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkQuarkJasperLuckyOre.get(), Lucky.minHeightQuarkJasperLuckyOre.get(), 0, Lucky.maxHeightQuarkJasperLuckyOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Lucky.enableEmbellishcraftBasaltLuckyOre.get()) {
                if ((Lucky.isTempWhitelistEmbellishcraftBasaltLuckyOre.get() && Lucky.temperatureBlacklistEmbellishcraftBasaltLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistEmbellishcraftBasaltLuckyOre.get() && !Lucky.temperatureBlacklistEmbellishcraftBasaltLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistEmbellishcraftBasaltLuckyOre.get() && Lucky.biomeBlacklistEmbellishcraftBasaltLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistEmbellishcraftBasaltLuckyOre.get() && !Lucky.biomeBlacklistEmbellishcraftBasaltLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeEmbellishcraftBasaltLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkEmbellishcraftBasaltLuckyOre.get(), Lucky.minHeightEmbellishcraftBasaltLuckyOre.get(), 0, Lucky.maxHeightEmbellishcraftBasaltLuckyOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Lucky.enableEmbellishcraftGneissLuckyOre.get()) {
                if ((Lucky.isTempWhitelistEmbellishcraftGneissLuckyOre.get() && Lucky.temperatureBlacklistEmbellishcraftGneissLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistEmbellishcraftGneissLuckyOre.get() && !Lucky.temperatureBlacklistEmbellishcraftGneissLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistEmbellishcraftGneissLuckyOre.get() && Lucky.biomeBlacklistEmbellishcraftGneissLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistEmbellishcraftGneissLuckyOre.get() && !Lucky.biomeBlacklistEmbellishcraftGneissLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeEmbellishcraftGneissLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkEmbellishcraftGneissLuckyOre.get(), Lucky.minHeightEmbellishcraftGneissLuckyOre.get(), 0, Lucky.maxHeightEmbellishcraftGneissLuckyOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Lucky.enableEmbellishcraftJadeLuckyOre.get()) {
                if ((Lucky.isTempWhitelistEmbellishcraftJadeLuckyOre.get() && Lucky.temperatureBlacklistEmbellishcraftJadeLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistEmbellishcraftJadeLuckyOre.get() && !Lucky.temperatureBlacklistEmbellishcraftJadeLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistEmbellishcraftJadeLuckyOre.get() && Lucky.biomeBlacklistEmbellishcraftJadeLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistEmbellishcraftJadeLuckyOre.get() && !Lucky.biomeBlacklistEmbellishcraftJadeLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeEmbellishcraftJadeLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkEmbellishcraftJadeLuckyOre.get(), Lucky.minHeightEmbellishcraftJadeLuckyOre.get(), 0, Lucky.maxHeightEmbellishcraftJadeLuckyOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Lucky.enableEmbellishcraftLarvikiteLuckyOre.get()) {
                if ((Lucky.isTempWhitelistEmbellishcraftLarvikiteLuckyOre.get() && Lucky.temperatureBlacklistEmbellishcraftLarvikiteLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistEmbellishcraftLarvikiteLuckyOre.get() && !Lucky.temperatureBlacklistEmbellishcraftLarvikiteLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistEmbellishcraftLarvikiteLuckyOre.get() && Lucky.biomeBlacklistEmbellishcraftLarvikiteLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistEmbellishcraftLarvikiteLuckyOre.get() && !Lucky.biomeBlacklistEmbellishcraftLarvikiteLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeEmbellishcraftLarvikiteLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkEmbellishcraftLarvikiteLuckyOre.get(), Lucky.minHeightEmbellishcraftLarvikiteLuckyOre.get(), 0, Lucky.maxHeightEmbellishcraftLarvikiteLuckyOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Lucky.enableEmbellishcraftMarbleLuckyOre.get()) {
                if ((Lucky.isTempWhitelistEmbellishcraftMarbleLuckyOre.get() && Lucky.temperatureBlacklistEmbellishcraftMarbleLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistEmbellishcraftMarbleLuckyOre.get() && !Lucky.temperatureBlacklistEmbellishcraftMarbleLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistEmbellishcraftMarbleLuckyOre.get() && Lucky.biomeBlacklistEmbellishcraftMarbleLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistEmbellishcraftMarbleLuckyOre.get() && !Lucky.biomeBlacklistEmbellishcraftMarbleLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeEmbellishcraftMarbleLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkEmbellishcraftMarbleLuckyOre.get(), Lucky.minHeightEmbellishcraftMarbleLuckyOre.get(), 0, Lucky.maxHeightEmbellishcraftMarbleLuckyOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Lucky.enableEmbellishcraftSlateLuckyOre.get()) {
                if ((Lucky.isTempWhitelistEmbellishcraftSlateLuckyOre.get() && Lucky.temperatureBlacklistEmbellishcraftSlateLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistEmbellishcraftSlateLuckyOre.get() && !Lucky.temperatureBlacklistEmbellishcraftSlateLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistEmbellishcraftSlateLuckyOre.get() && Lucky.biomeBlacklistEmbellishcraftSlateLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistEmbellishcraftSlateLuckyOre.get() && !Lucky.biomeBlacklistEmbellishcraftSlateLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeEmbellishcraftSlateLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkEmbellishcraftSlateLuckyOre.get(), Lucky.minHeightEmbellishcraftSlateLuckyOre.get(), 0, Lucky.maxHeightEmbellishcraftSlateLuckyOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Lucky.enableHardenedStoneLuckyOre.get()) {
                if ((Lucky.isTempWhitelistHardenedStoneLuckyOre.get() && Lucky.temperatureBlacklistHardenedStoneLuckyOre.get().contains(biomeTS)) || (!Lucky.isTempWhitelistHardenedStoneLuckyOre.get() && !Lucky.temperatureBlacklistHardenedStoneLuckyOre.get().contains(biomeTS))) {
                    if ((Lucky.isBiomeWhitelistHardenedStoneLuckyOre.get() && Lucky.biomeBlacklistHardenedStoneLuckyOre.get().contains(biomeRNS)) || (!Lucky.isBiomeWhitelistHardenedStoneLuckyOre.get() && !Lucky.biomeBlacklistHardenedStoneLuckyOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_LUCKY_ORE.get().getDefaultState(), Lucky.veinSizeHardenedStoneLuckyOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lucky.veinsPerChunkHardenedStoneLuckyOre.get(), Lucky.minHeightHardenedStoneLuckyOre.get(), 0, Lucky.maxHeightHardenedStoneLuckyOre.get()))));
                    } } } }
    }
}
