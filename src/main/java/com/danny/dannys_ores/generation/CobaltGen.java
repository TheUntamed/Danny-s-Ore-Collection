package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Cobalt;
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

public class CobaltGen {

    public static void addCobaltGen(Biome biome, String biomeRNS, String biomeTS) {
        addCobaltOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addCobaltOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Cobalt.enableStoneCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistStoneCobaltOre.get() && Cobalt.temperatureBlacklistStoneCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistStoneCobaltOre.get() && !Cobalt.temperatureBlacklistStoneCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistStoneCobaltOre.get() && Cobalt.biomeBlacklistStoneCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistStoneCobaltOre.get() && !Cobalt.biomeBlacklistStoneCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeStoneCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkStoneCobaltOre.get(), Cobalt.minHeightStoneCobaltOre.get(), 0, Cobalt.maxHeightStoneCobaltOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Cobalt.enableAndesiteCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistAndesiteCobaltOre.get() && Cobalt.temperatureBlacklistAndesiteCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistAndesiteCobaltOre.get() && !Cobalt.temperatureBlacklistAndesiteCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistAndesiteCobaltOre.get() && Cobalt.biomeBlacklistAndesiteCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistAndesiteCobaltOre.get() && !Cobalt.biomeBlacklistAndesiteCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeAndesiteCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkAndesiteCobaltOre.get(), Cobalt.minHeightAndesiteCobaltOre.get(), 0, Cobalt.maxHeightAndesiteCobaltOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Cobalt.enableDioriteCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistDioriteCobaltOre.get() && Cobalt.temperatureBlacklistDioriteCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistDioriteCobaltOre.get() && !Cobalt.temperatureBlacklistDioriteCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistDioriteCobaltOre.get() && Cobalt.biomeBlacklistDioriteCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistDioriteCobaltOre.get() && !Cobalt.biomeBlacklistDioriteCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeDioriteCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkDioriteCobaltOre.get(), Cobalt.minHeightDioriteCobaltOre.get(), 0, Cobalt.maxHeightDioriteCobaltOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Cobalt.enableGraniteCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistGraniteCobaltOre.get() && Cobalt.temperatureBlacklistGraniteCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistGraniteCobaltOre.get() && !Cobalt.temperatureBlacklistGraniteCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistGraniteCobaltOre.get() && Cobalt.biomeBlacklistGraniteCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistGraniteCobaltOre.get() && !Cobalt.biomeBlacklistGraniteCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeGraniteCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkGraniteCobaltOre.get(), Cobalt.minHeightGraniteCobaltOre.get(), 0, Cobalt.maxHeightGraniteCobaltOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Cobalt.enableNetherrackCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistNetherrackCobaltOre.get() && Cobalt.temperatureBlacklistNetherrackCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistNetherrackCobaltOre.get() && !Cobalt.temperatureBlacklistNetherrackCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistNetherrackCobaltOre.get() && Cobalt.biomeBlacklistNetherrackCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistNetherrackCobaltOre.get() && !Cobalt.biomeBlacklistNetherrackCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeNetherrackCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkNetherrackCobaltOre.get(), Cobalt.minHeightNetherrackCobaltOre.get(), 0, Cobalt.maxHeightNetherrackCobaltOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Cobalt.enableEndStoneCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistEndStoneCobaltOre.get() && Cobalt.temperatureBlacklistEndStoneCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistEndStoneCobaltOre.get() && !Cobalt.temperatureBlacklistEndStoneCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistEndStoneCobaltOre.get() && Cobalt.biomeBlacklistEndStoneCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistEndStoneCobaltOre.get() && !Cobalt.biomeBlacklistEndStoneCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeEndStoneCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkEndStoneCobaltOre.get(), Cobalt.minHeightEndStoneCobaltOre.get(), 0, Cobalt.maxHeightEndStoneCobaltOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Cobalt.enableSandCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistSandCobaltOre.get() && Cobalt.temperatureBlacklistSandCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistSandCobaltOre.get() && !Cobalt.temperatureBlacklistSandCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistSandCobaltOre.get() && Cobalt.biomeBlacklistSandCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistSandCobaltOre.get() && !Cobalt.biomeBlacklistSandCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeSandCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkSandCobaltOre.get(), Cobalt.minHeightSandCobaltOre.get(), 0, Cobalt.maxHeightSandCobaltOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Cobalt.enableRedSandCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistRedSandCobaltOre.get() && Cobalt.temperatureBlacklistRedSandCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistRedSandCobaltOre.get() && !Cobalt.temperatureBlacklistRedSandCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistRedSandCobaltOre.get() && Cobalt.biomeBlacklistRedSandCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistRedSandCobaltOre.get() && !Cobalt.biomeBlacklistRedSandCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeRedSandCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkRedSandCobaltOre.get(), Cobalt.minHeightRedSandCobaltOre.get(), 0, Cobalt.maxHeightRedSandCobaltOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Cobalt.enableGravelCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistGravelCobaltOre.get() && Cobalt.temperatureBlacklistGravelCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistGravelCobaltOre.get() && !Cobalt.temperatureBlacklistGravelCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistGravelCobaltOre.get() && Cobalt.biomeBlacklistGravelCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistGravelCobaltOre.get() && !Cobalt.biomeBlacklistGravelCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeGravelCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkGravelCobaltOre.get(), Cobalt.minHeightGravelCobaltOre.get(), 0, Cobalt.maxHeightGravelCobaltOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Cobalt.enableSandstoneCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistSandstoneCobaltOre.get() && Cobalt.temperatureBlacklistSandstoneCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistSandstoneCobaltOre.get() && !Cobalt.temperatureBlacklistSandstoneCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistSandstoneCobaltOre.get() && Cobalt.biomeBlacklistSandstoneCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistSandstoneCobaltOre.get() && !Cobalt.biomeBlacklistSandstoneCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeSandstoneCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkSandstoneCobaltOre.get(), Cobalt.minHeightSandstoneCobaltOre.get(), 0, Cobalt.maxHeightSandstoneCobaltOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Cobalt.enableRedSandstoneCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistRedSandstoneCobaltOre.get() && Cobalt.temperatureBlacklistRedSandstoneCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistRedSandstoneCobaltOre.get() && !Cobalt.temperatureBlacklistRedSandstoneCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistRedSandstoneCobaltOre.get() && Cobalt.biomeBlacklistRedSandstoneCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistRedSandstoneCobaltOre.get() && !Cobalt.biomeBlacklistRedSandstoneCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeRedSandstoneCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkRedSandstoneCobaltOre.get(), Cobalt.minHeightRedSandstoneCobaltOre.get(), 0, Cobalt.maxHeightRedSandstoneCobaltOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Cobalt.enableBlueIceCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistBlueIceCobaltOre.get() && Cobalt.temperatureBlacklistBlueIceCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistBlueIceCobaltOre.get() && !Cobalt.temperatureBlacklistBlueIceCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistBlueIceCobaltOre.get() && Cobalt.biomeBlacklistBlueIceCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistBlueIceCobaltOre.get() && !Cobalt.biomeBlacklistBlueIceCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeBlueIceCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkBlueIceCobaltOre.get(), Cobalt.minHeightBlueIceCobaltOre.get(), 0, Cobalt.maxHeightBlueIceCobaltOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Cobalt.enablePackedIceCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistPackedIceCobaltOre.get() && Cobalt.temperatureBlacklistPackedIceCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistPackedIceCobaltOre.get() && !Cobalt.temperatureBlacklistPackedIceCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistPackedIceCobaltOre.get() && Cobalt.biomeBlacklistPackedIceCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistPackedIceCobaltOre.get() && !Cobalt.biomeBlacklistPackedIceCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizePackedIceCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkPackedIceCobaltOre.get(), Cobalt.minHeightPackedIceCobaltOre.get(), 0, Cobalt.maxHeightPackedIceCobaltOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Cobalt.enableBedrockCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistBedrockCobaltOre.get() && Cobalt.temperatureBlacklistBedrockCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistBedrockCobaltOre.get() && !Cobalt.temperatureBlacklistBedrockCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistBedrockCobaltOre.get() && Cobalt.biomeBlacklistBedrockCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistBedrockCobaltOre.get() && !Cobalt.biomeBlacklistBedrockCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeBedrockCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkBedrockCobaltOre.get(), Cobalt.minHeightBedrockCobaltOre.get(), 0, Cobalt.maxHeightBedrockCobaltOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Cobalt.enableQuarkBasaltCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistQuarkBasaltCobaltOre.get() && Cobalt.temperatureBlacklistQuarkBasaltCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistQuarkBasaltCobaltOre.get() && !Cobalt.temperatureBlacklistQuarkBasaltCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistQuarkBasaltCobaltOre.get() && Cobalt.biomeBlacklistQuarkBasaltCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistQuarkBasaltCobaltOre.get() && !Cobalt.biomeBlacklistQuarkBasaltCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeQuarkBasaltCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkQuarkBasaltCobaltOre.get(), Cobalt.minHeightQuarkBasaltCobaltOre.get(), 0, Cobalt.maxHeightQuarkBasaltCobaltOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Cobalt.enableQuarkMarbleCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistQuarkMarbleCobaltOre.get() && Cobalt.temperatureBlacklistQuarkMarbleCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistQuarkMarbleCobaltOre.get() && !Cobalt.temperatureBlacklistQuarkMarbleCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistQuarkMarbleCobaltOre.get() && Cobalt.biomeBlacklistQuarkMarbleCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistQuarkMarbleCobaltOre.get() && !Cobalt.biomeBlacklistQuarkMarbleCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeQuarkMarbleCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkQuarkMarbleCobaltOre.get(), Cobalt.minHeightQuarkMarbleCobaltOre.get(), 0, Cobalt.maxHeightQuarkMarbleCobaltOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Cobalt.enableQuarkSlateCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistQuarkSlateCobaltOre.get() && Cobalt.temperatureBlacklistQuarkSlateCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistQuarkSlateCobaltOre.get() && !Cobalt.temperatureBlacklistQuarkSlateCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistQuarkSlateCobaltOre.get() && Cobalt.biomeBlacklistQuarkSlateCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistQuarkSlateCobaltOre.get() && !Cobalt.biomeBlacklistQuarkSlateCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeQuarkSlateCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkQuarkSlateCobaltOre.get(), Cobalt.minHeightQuarkSlateCobaltOre.get(), 0, Cobalt.maxHeightQuarkSlateCobaltOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Cobalt.enableQuarkLimestoneCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistQuarkLimestoneCobaltOre.get() && Cobalt.temperatureBlacklistQuarkLimestoneCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistQuarkLimestoneCobaltOre.get() && !Cobalt.temperatureBlacklistQuarkLimestoneCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistQuarkLimestoneCobaltOre.get() && Cobalt.biomeBlacklistQuarkLimestoneCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistQuarkLimestoneCobaltOre.get() && !Cobalt.biomeBlacklistQuarkLimestoneCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeQuarkLimestoneCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkQuarkLimestoneCobaltOre.get(), Cobalt.minHeightQuarkLimestoneCobaltOre.get(), 0, Cobalt.maxHeightQuarkLimestoneCobaltOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Cobalt.enableQuarkJasperCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistQuarkJasperCobaltOre.get() && Cobalt.temperatureBlacklistQuarkJasperCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistQuarkJasperCobaltOre.get() && !Cobalt.temperatureBlacklistQuarkJasperCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistQuarkJasperCobaltOre.get() && Cobalt.biomeBlacklistQuarkJasperCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistQuarkJasperCobaltOre.get() && !Cobalt.biomeBlacklistQuarkJasperCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeQuarkJasperCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkQuarkJasperCobaltOre.get(), Cobalt.minHeightQuarkJasperCobaltOre.get(), 0, Cobalt.maxHeightQuarkJasperCobaltOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Cobalt.enableEmbellishcraftBasaltCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistEmbellishcraftBasaltCobaltOre.get() && Cobalt.temperatureBlacklistEmbellishcraftBasaltCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistEmbellishcraftBasaltCobaltOre.get() && !Cobalt.temperatureBlacklistEmbellishcraftBasaltCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistEmbellishcraftBasaltCobaltOre.get() && Cobalt.biomeBlacklistEmbellishcraftBasaltCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistEmbellishcraftBasaltCobaltOre.get() && !Cobalt.biomeBlacklistEmbellishcraftBasaltCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeEmbellishcraftBasaltCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkEmbellishcraftBasaltCobaltOre.get(), Cobalt.minHeightEmbellishcraftBasaltCobaltOre.get(), 0, Cobalt.maxHeightEmbellishcraftBasaltCobaltOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Cobalt.enableEmbellishcraftGneissCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistEmbellishcraftGneissCobaltOre.get() && Cobalt.temperatureBlacklistEmbellishcraftGneissCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistEmbellishcraftGneissCobaltOre.get() && !Cobalt.temperatureBlacklistEmbellishcraftGneissCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistEmbellishcraftGneissCobaltOre.get() && Cobalt.biomeBlacklistEmbellishcraftGneissCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistEmbellishcraftGneissCobaltOre.get() && !Cobalt.biomeBlacklistEmbellishcraftGneissCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeEmbellishcraftGneissCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkEmbellishcraftGneissCobaltOre.get(), Cobalt.minHeightEmbellishcraftGneissCobaltOre.get(), 0, Cobalt.maxHeightEmbellishcraftGneissCobaltOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Cobalt.enableEmbellishcraftJadeCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistEmbellishcraftJadeCobaltOre.get() && Cobalt.temperatureBlacklistEmbellishcraftJadeCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistEmbellishcraftJadeCobaltOre.get() && !Cobalt.temperatureBlacklistEmbellishcraftJadeCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistEmbellishcraftJadeCobaltOre.get() && Cobalt.biomeBlacklistEmbellishcraftJadeCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistEmbellishcraftJadeCobaltOre.get() && !Cobalt.biomeBlacklistEmbellishcraftJadeCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeEmbellishcraftJadeCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkEmbellishcraftJadeCobaltOre.get(), Cobalt.minHeightEmbellishcraftJadeCobaltOre.get(), 0, Cobalt.maxHeightEmbellishcraftJadeCobaltOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Cobalt.enableEmbellishcraftLarvikiteCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistEmbellishcraftLarvikiteCobaltOre.get() && Cobalt.temperatureBlacklistEmbellishcraftLarvikiteCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistEmbellishcraftLarvikiteCobaltOre.get() && !Cobalt.temperatureBlacklistEmbellishcraftLarvikiteCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistEmbellishcraftLarvikiteCobaltOre.get() && Cobalt.biomeBlacklistEmbellishcraftLarvikiteCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistEmbellishcraftLarvikiteCobaltOre.get() && !Cobalt.biomeBlacklistEmbellishcraftLarvikiteCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeEmbellishcraftLarvikiteCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkEmbellishcraftLarvikiteCobaltOre.get(), Cobalt.minHeightEmbellishcraftLarvikiteCobaltOre.get(), 0, Cobalt.maxHeightEmbellishcraftLarvikiteCobaltOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Cobalt.enableEmbellishcraftMarbleCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistEmbellishcraftMarbleCobaltOre.get() && Cobalt.temperatureBlacklistEmbellishcraftMarbleCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistEmbellishcraftMarbleCobaltOre.get() && !Cobalt.temperatureBlacklistEmbellishcraftMarbleCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistEmbellishcraftMarbleCobaltOre.get() && Cobalt.biomeBlacklistEmbellishcraftMarbleCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistEmbellishcraftMarbleCobaltOre.get() && !Cobalt.biomeBlacklistEmbellishcraftMarbleCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeEmbellishcraftMarbleCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkEmbellishcraftMarbleCobaltOre.get(), Cobalt.minHeightEmbellishcraftMarbleCobaltOre.get(), 0, Cobalt.maxHeightEmbellishcraftMarbleCobaltOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Cobalt.enableEmbellishcraftSlateCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistEmbellishcraftSlateCobaltOre.get() && Cobalt.temperatureBlacklistEmbellishcraftSlateCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistEmbellishcraftSlateCobaltOre.get() && !Cobalt.temperatureBlacklistEmbellishcraftSlateCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistEmbellishcraftSlateCobaltOre.get() && Cobalt.biomeBlacklistEmbellishcraftSlateCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistEmbellishcraftSlateCobaltOre.get() && !Cobalt.biomeBlacklistEmbellishcraftSlateCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeEmbellishcraftSlateCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkEmbellishcraftSlateCobaltOre.get(), Cobalt.minHeightEmbellishcraftSlateCobaltOre.get(), 0, Cobalt.maxHeightEmbellishcraftSlateCobaltOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Cobalt.enableHardenedStoneCobaltOre.get()) {
                if ((Cobalt.isTempWhitelistHardenedStoneCobaltOre.get() && Cobalt.temperatureBlacklistHardenedStoneCobaltOre.get().contains(biomeTS)) || (!Cobalt.isTempWhitelistHardenedStoneCobaltOre.get() && !Cobalt.temperatureBlacklistHardenedStoneCobaltOre.get().contains(biomeTS))) {
                    if ((Cobalt.isBiomeWhitelistHardenedStoneCobaltOre.get() && Cobalt.biomeBlacklistHardenedStoneCobaltOre.get().contains(biomeRNS)) || (!Cobalt.isBiomeWhitelistHardenedStoneCobaltOre.get() && !Cobalt.biomeBlacklistHardenedStoneCobaltOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_COBALT_ORE.get().getDefaultState(), Cobalt.veinSizeHardenedStoneCobaltOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Cobalt.veinsPerChunkHardenedStoneCobaltOre.get(), Cobalt.minHeightHardenedStoneCobaltOre.get(), 0, Cobalt.maxHeightHardenedStoneCobaltOre.get()))));
                    } } } }
    }
}
