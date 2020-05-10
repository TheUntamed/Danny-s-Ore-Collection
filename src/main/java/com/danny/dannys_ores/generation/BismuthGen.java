package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Bismuth;
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

public class BismuthGen {
    public static void addBismuthGen(Biome biome, String biomeRNS, String biomeTS) {
        addBismuthOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addBismuthOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Bismuth.enableStoneBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistStoneBismuthOre.get() && Bismuth.temperatureBlacklistStoneBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistStoneBismuthOre.get() && !Bismuth.temperatureBlacklistStoneBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistStoneBismuthOre.get() && Bismuth.biomeBlacklistStoneBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistStoneBismuthOre.get() && !Bismuth.biomeBlacklistStoneBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeStoneBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkStoneBismuthOre.get(), Bismuth.minHeightStoneBismuthOre.get(), 0, Bismuth.maxHeightStoneBismuthOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Bismuth.enableAndesiteBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistAndesiteBismuthOre.get() && Bismuth.temperatureBlacklistAndesiteBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistAndesiteBismuthOre.get() && !Bismuth.temperatureBlacklistAndesiteBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistAndesiteBismuthOre.get() && Bismuth.biomeBlacklistAndesiteBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistAndesiteBismuthOre.get() && !Bismuth.biomeBlacklistAndesiteBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeAndesiteBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkAndesiteBismuthOre.get(), Bismuth.minHeightAndesiteBismuthOre.get(), 0, Bismuth.maxHeightAndesiteBismuthOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Bismuth.enableDioriteBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistDioriteBismuthOre.get() && Bismuth.temperatureBlacklistDioriteBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistDioriteBismuthOre.get() && !Bismuth.temperatureBlacklistDioriteBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistDioriteBismuthOre.get() && Bismuth.biomeBlacklistDioriteBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistDioriteBismuthOre.get() && !Bismuth.biomeBlacklistDioriteBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeDioriteBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkDioriteBismuthOre.get(), Bismuth.minHeightDioriteBismuthOre.get(), 0, Bismuth.maxHeightDioriteBismuthOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Bismuth.enableGraniteBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistGraniteBismuthOre.get() && Bismuth.temperatureBlacklistGraniteBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistGraniteBismuthOre.get() && !Bismuth.temperatureBlacklistGraniteBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistGraniteBismuthOre.get() && Bismuth.biomeBlacklistGraniteBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistGraniteBismuthOre.get() && !Bismuth.biomeBlacklistGraniteBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeGraniteBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkGraniteBismuthOre.get(), Bismuth.minHeightGraniteBismuthOre.get(), 0, Bismuth.maxHeightGraniteBismuthOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Bismuth.enableNetherrackBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistNetherrackBismuthOre.get() && Bismuth.temperatureBlacklistNetherrackBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistNetherrackBismuthOre.get() && !Bismuth.temperatureBlacklistNetherrackBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistNetherrackBismuthOre.get() && Bismuth.biomeBlacklistNetherrackBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistNetherrackBismuthOre.get() && !Bismuth.biomeBlacklistNetherrackBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeNetherrackBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkNetherrackBismuthOre.get(), Bismuth.minHeightNetherrackBismuthOre.get(), 0, Bismuth.maxHeightNetherrackBismuthOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Bismuth.enableEndStoneBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistEndStoneBismuthOre.get() && Bismuth.temperatureBlacklistEndStoneBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistEndStoneBismuthOre.get() && !Bismuth.temperatureBlacklistEndStoneBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistEndStoneBismuthOre.get() && Bismuth.biomeBlacklistEndStoneBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistEndStoneBismuthOre.get() && !Bismuth.biomeBlacklistEndStoneBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeEndStoneBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkEndStoneBismuthOre.get(), Bismuth.minHeightEndStoneBismuthOre.get(), 0, Bismuth.maxHeightEndStoneBismuthOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Bismuth.enableSandBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistSandBismuthOre.get() && Bismuth.temperatureBlacklistSandBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistSandBismuthOre.get() && !Bismuth.temperatureBlacklistSandBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistSandBismuthOre.get() && Bismuth.biomeBlacklistSandBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistSandBismuthOre.get() && !Bismuth.biomeBlacklistSandBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeSandBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkSandBismuthOre.get(), Bismuth.minHeightSandBismuthOre.get(), 0, Bismuth.maxHeightSandBismuthOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Bismuth.enableRedSandBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistRedSandBismuthOre.get() && Bismuth.temperatureBlacklistRedSandBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistRedSandBismuthOre.get() && !Bismuth.temperatureBlacklistRedSandBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistRedSandBismuthOre.get() && Bismuth.biomeBlacklistRedSandBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistRedSandBismuthOre.get() && !Bismuth.biomeBlacklistRedSandBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeRedSandBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkRedSandBismuthOre.get(), Bismuth.minHeightRedSandBismuthOre.get(), 0, Bismuth.maxHeightRedSandBismuthOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Bismuth.enableGravelBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistGravelBismuthOre.get() && Bismuth.temperatureBlacklistGravelBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistGravelBismuthOre.get() && !Bismuth.temperatureBlacklistGravelBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistGravelBismuthOre.get() && Bismuth.biomeBlacklistGravelBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistGravelBismuthOre.get() && !Bismuth.biomeBlacklistGravelBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeGravelBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkGravelBismuthOre.get(), Bismuth.minHeightGravelBismuthOre.get(), 0, Bismuth.maxHeightGravelBismuthOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Bismuth.enableSandstoneBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistSandstoneBismuthOre.get() && Bismuth.temperatureBlacklistSandstoneBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistSandstoneBismuthOre.get() && !Bismuth.temperatureBlacklistSandstoneBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistSandstoneBismuthOre.get() && Bismuth.biomeBlacklistSandstoneBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistSandstoneBismuthOre.get() && !Bismuth.biomeBlacklistSandstoneBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeSandstoneBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkSandstoneBismuthOre.get(), Bismuth.minHeightSandstoneBismuthOre.get(), 0, Bismuth.maxHeightSandstoneBismuthOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Bismuth.enableRedSandstoneBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistRedSandstoneBismuthOre.get() && Bismuth.temperatureBlacklistRedSandstoneBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistRedSandstoneBismuthOre.get() && !Bismuth.temperatureBlacklistRedSandstoneBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistRedSandstoneBismuthOre.get() && Bismuth.biomeBlacklistRedSandstoneBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistRedSandstoneBismuthOre.get() && !Bismuth.biomeBlacklistRedSandstoneBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeRedSandstoneBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkRedSandstoneBismuthOre.get(), Bismuth.minHeightRedSandstoneBismuthOre.get(), 0, Bismuth.maxHeightRedSandstoneBismuthOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Bismuth.enableBlueIceBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistBlueIceBismuthOre.get() && Bismuth.temperatureBlacklistBlueIceBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistBlueIceBismuthOre.get() && !Bismuth.temperatureBlacklistBlueIceBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistBlueIceBismuthOre.get() && Bismuth.biomeBlacklistBlueIceBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistBlueIceBismuthOre.get() && !Bismuth.biomeBlacklistBlueIceBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeBlueIceBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkBlueIceBismuthOre.get(), Bismuth.minHeightBlueIceBismuthOre.get(), 0, Bismuth.maxHeightBlueIceBismuthOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Bismuth.enablePackedIceBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistPackedIceBismuthOre.get() && Bismuth.temperatureBlacklistPackedIceBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistPackedIceBismuthOre.get() && !Bismuth.temperatureBlacklistPackedIceBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistPackedIceBismuthOre.get() && Bismuth.biomeBlacklistPackedIceBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistPackedIceBismuthOre.get() && !Bismuth.biomeBlacklistPackedIceBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizePackedIceBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkPackedIceBismuthOre.get(), Bismuth.minHeightPackedIceBismuthOre.get(), 0, Bismuth.maxHeightPackedIceBismuthOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Bismuth.enableBedrockBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistBedrockBismuthOre.get() && Bismuth.temperatureBlacklistBedrockBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistBedrockBismuthOre.get() && !Bismuth.temperatureBlacklistBedrockBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistBedrockBismuthOre.get() && Bismuth.biomeBlacklistBedrockBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistBedrockBismuthOre.get() && !Bismuth.biomeBlacklistBedrockBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeBedrockBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkBedrockBismuthOre.get(), Bismuth.minHeightBedrockBismuthOre.get(), 0, Bismuth.maxHeightBedrockBismuthOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Bismuth.enableQuarkBasaltBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistQuarkBasaltBismuthOre.get() && Bismuth.temperatureBlacklistQuarkBasaltBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistQuarkBasaltBismuthOre.get() && !Bismuth.temperatureBlacklistQuarkBasaltBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistQuarkBasaltBismuthOre.get() && Bismuth.biomeBlacklistQuarkBasaltBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistQuarkBasaltBismuthOre.get() && !Bismuth.biomeBlacklistQuarkBasaltBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeQuarkBasaltBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkQuarkBasaltBismuthOre.get(), Bismuth.minHeightQuarkBasaltBismuthOre.get(), 0, Bismuth.maxHeightQuarkBasaltBismuthOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Bismuth.enableQuarkMarbleBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistQuarkMarbleBismuthOre.get() && Bismuth.temperatureBlacklistQuarkMarbleBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistQuarkMarbleBismuthOre.get() && !Bismuth.temperatureBlacklistQuarkMarbleBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistQuarkMarbleBismuthOre.get() && Bismuth.biomeBlacklistQuarkMarbleBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistQuarkMarbleBismuthOre.get() && !Bismuth.biomeBlacklistQuarkMarbleBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeQuarkMarbleBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkQuarkMarbleBismuthOre.get(), Bismuth.minHeightQuarkMarbleBismuthOre.get(), 0, Bismuth.maxHeightQuarkMarbleBismuthOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Bismuth.enableQuarkSlateBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistQuarkSlateBismuthOre.get() && Bismuth.temperatureBlacklistQuarkSlateBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistQuarkSlateBismuthOre.get() && !Bismuth.temperatureBlacklistQuarkSlateBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistQuarkSlateBismuthOre.get() && Bismuth.biomeBlacklistQuarkSlateBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistQuarkSlateBismuthOre.get() && !Bismuth.biomeBlacklistQuarkSlateBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeQuarkSlateBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkQuarkSlateBismuthOre.get(), Bismuth.minHeightQuarkSlateBismuthOre.get(), 0, Bismuth.maxHeightQuarkSlateBismuthOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Bismuth.enableQuarkLimestoneBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistQuarkLimestoneBismuthOre.get() && Bismuth.temperatureBlacklistQuarkLimestoneBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistQuarkLimestoneBismuthOre.get() && !Bismuth.temperatureBlacklistQuarkLimestoneBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistQuarkLimestoneBismuthOre.get() && Bismuth.biomeBlacklistQuarkLimestoneBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistQuarkLimestoneBismuthOre.get() && !Bismuth.biomeBlacklistQuarkLimestoneBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeQuarkLimestoneBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkQuarkLimestoneBismuthOre.get(), Bismuth.minHeightQuarkLimestoneBismuthOre.get(), 0, Bismuth.maxHeightQuarkLimestoneBismuthOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Bismuth.enableQuarkJasperBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistQuarkJasperBismuthOre.get() && Bismuth.temperatureBlacklistQuarkJasperBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistQuarkJasperBismuthOre.get() && !Bismuth.temperatureBlacklistQuarkJasperBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistQuarkJasperBismuthOre.get() && Bismuth.biomeBlacklistQuarkJasperBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistQuarkJasperBismuthOre.get() && !Bismuth.biomeBlacklistQuarkJasperBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeQuarkJasperBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkQuarkJasperBismuthOre.get(), Bismuth.minHeightQuarkJasperBismuthOre.get(), 0, Bismuth.maxHeightQuarkJasperBismuthOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Bismuth.enableEmbellishcraftBasaltBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistEmbellishcraftBasaltBismuthOre.get() && Bismuth.temperatureBlacklistEmbellishcraftBasaltBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistEmbellishcraftBasaltBismuthOre.get() && !Bismuth.temperatureBlacklistEmbellishcraftBasaltBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistEmbellishcraftBasaltBismuthOre.get() && Bismuth.biomeBlacklistEmbellishcraftBasaltBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistEmbellishcraftBasaltBismuthOre.get() && !Bismuth.biomeBlacklistEmbellishcraftBasaltBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeEmbellishcraftBasaltBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkEmbellishcraftBasaltBismuthOre.get(), Bismuth.minHeightEmbellishcraftBasaltBismuthOre.get(), 0, Bismuth.maxHeightEmbellishcraftBasaltBismuthOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Bismuth.enableEmbellishcraftGneissBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistEmbellishcraftGneissBismuthOre.get() && Bismuth.temperatureBlacklistEmbellishcraftGneissBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistEmbellishcraftGneissBismuthOre.get() && !Bismuth.temperatureBlacklistEmbellishcraftGneissBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistEmbellishcraftGneissBismuthOre.get() && Bismuth.biomeBlacklistEmbellishcraftGneissBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistEmbellishcraftGneissBismuthOre.get() && !Bismuth.biomeBlacklistEmbellishcraftGneissBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeEmbellishcraftGneissBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkEmbellishcraftGneissBismuthOre.get(), Bismuth.minHeightEmbellishcraftGneissBismuthOre.get(), 0, Bismuth.maxHeightEmbellishcraftGneissBismuthOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Bismuth.enableEmbellishcraftJadeBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistEmbellishcraftJadeBismuthOre.get() && Bismuth.temperatureBlacklistEmbellishcraftJadeBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistEmbellishcraftJadeBismuthOre.get() && !Bismuth.temperatureBlacklistEmbellishcraftJadeBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistEmbellishcraftJadeBismuthOre.get() && Bismuth.biomeBlacklistEmbellishcraftJadeBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistEmbellishcraftJadeBismuthOre.get() && !Bismuth.biomeBlacklistEmbellishcraftJadeBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeEmbellishcraftJadeBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkEmbellishcraftJadeBismuthOre.get(), Bismuth.minHeightEmbellishcraftJadeBismuthOre.get(), 0, Bismuth.maxHeightEmbellishcraftJadeBismuthOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Bismuth.enableEmbellishcraftLarvikiteBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistEmbellishcraftLarvikiteBismuthOre.get() && Bismuth.temperatureBlacklistEmbellishcraftLarvikiteBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistEmbellishcraftLarvikiteBismuthOre.get() && !Bismuth.temperatureBlacklistEmbellishcraftLarvikiteBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistEmbellishcraftLarvikiteBismuthOre.get() && Bismuth.biomeBlacklistEmbellishcraftLarvikiteBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistEmbellishcraftLarvikiteBismuthOre.get() && !Bismuth.biomeBlacklistEmbellishcraftLarvikiteBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeEmbellishcraftLarvikiteBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkEmbellishcraftLarvikiteBismuthOre.get(), Bismuth.minHeightEmbellishcraftLarvikiteBismuthOre.get(), 0, Bismuth.maxHeightEmbellishcraftLarvikiteBismuthOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Bismuth.enableEmbellishcraftMarbleBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistEmbellishcraftMarbleBismuthOre.get() && Bismuth.temperatureBlacklistEmbellishcraftMarbleBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistEmbellishcraftMarbleBismuthOre.get() && !Bismuth.temperatureBlacklistEmbellishcraftMarbleBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistEmbellishcraftMarbleBismuthOre.get() && Bismuth.biomeBlacklistEmbellishcraftMarbleBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistEmbellishcraftMarbleBismuthOre.get() && !Bismuth.biomeBlacklistEmbellishcraftMarbleBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeEmbellishcraftMarbleBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkEmbellishcraftMarbleBismuthOre.get(), Bismuth.minHeightEmbellishcraftMarbleBismuthOre.get(), 0, Bismuth.maxHeightEmbellishcraftMarbleBismuthOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Bismuth.enableEmbellishcraftSlateBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistEmbellishcraftSlateBismuthOre.get() && Bismuth.temperatureBlacklistEmbellishcraftSlateBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistEmbellishcraftSlateBismuthOre.get() && !Bismuth.temperatureBlacklistEmbellishcraftSlateBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistEmbellishcraftSlateBismuthOre.get() && Bismuth.biomeBlacklistEmbellishcraftSlateBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistEmbellishcraftSlateBismuthOre.get() && !Bismuth.biomeBlacklistEmbellishcraftSlateBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeEmbellishcraftSlateBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkEmbellishcraftSlateBismuthOre.get(), Bismuth.minHeightEmbellishcraftSlateBismuthOre.get(), 0, Bismuth.maxHeightEmbellishcraftSlateBismuthOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Bismuth.enableHardenedStoneBismuthOre.get()) {
                if ((Bismuth.isTempWhitelistHardenedStoneBismuthOre.get() && Bismuth.temperatureBlacklistHardenedStoneBismuthOre.get().contains(biomeTS)) || (!Bismuth.isTempWhitelistHardenedStoneBismuthOre.get() && !Bismuth.temperatureBlacklistHardenedStoneBismuthOre.get().contains(biomeTS))) {
                    if ((Bismuth.isBiomeWhitelistHardenedStoneBismuthOre.get() && Bismuth.biomeBlacklistHardenedStoneBismuthOre.get().contains(biomeRNS)) || (!Bismuth.isBiomeWhitelistHardenedStoneBismuthOre.get() && !Bismuth.biomeBlacklistHardenedStoneBismuthOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_BISMUTH_ORE.get().getDefaultState(), Bismuth.veinSizeHardenedStoneBismuthOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Bismuth.veinsPerChunkHardenedStoneBismuthOre.get(), Bismuth.minHeightHardenedStoneBismuthOre.get(), 0, Bismuth.maxHeightHardenedStoneBismuthOre.get()))));
                    } } } }
    }
}
