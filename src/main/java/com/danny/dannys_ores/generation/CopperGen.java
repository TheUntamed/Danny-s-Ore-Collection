package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class CopperGen {

    public static void addCopperGen(Biome biome, String biomeRNS, String biomeTS) {
        addCopperOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addCopperOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Copper.enableStoneCopperOre.get()) {
                if ((Copper.isTempWhitelistStoneCopperOre.get() && Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistStoneCopperOre.get() && !Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistStoneCopperOre.get() && Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistStoneCopperOre.get() && !Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkStoneCopperOre.get(), Copper.minHeightStoneCopperOre.get(), 0, Copper.maxHeightStoneCopperOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Copper.enableAndesiteCopperOre.get()) {
                if ((Copper.isTempWhitelistAndesiteCopperOre.get() && Copper.temperatureBlacklistAndesiteCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistAndesiteCopperOre.get() && !Copper.temperatureBlacklistAndesiteCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistAndesiteCopperOre.get() && Copper.biomeBlacklistAndesiteCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistAndesiteCopperOre.get() && !Copper.biomeBlacklistAndesiteCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeAndesiteCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkAndesiteCopperOre.get(), Copper.minHeightAndesiteCopperOre.get(), 0, Copper.maxHeightAndesiteCopperOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Copper.enableDioriteCopperOre.get()) {
                if ((Copper.isTempWhitelistDioriteCopperOre.get() && Copper.temperatureBlacklistDioriteCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistDioriteCopperOre.get() && !Copper.temperatureBlacklistDioriteCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistDioriteCopperOre.get() && Copper.biomeBlacklistDioriteCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistDioriteCopperOre.get() && !Copper.biomeBlacklistDioriteCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeDioriteCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkDioriteCopperOre.get(), Copper.minHeightDioriteCopperOre.get(), 0, Copper.maxHeightDioriteCopperOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Copper.enableGraniteCopperOre.get()) {
                if ((Copper.isTempWhitelistGraniteCopperOre.get() && Copper.temperatureBlacklistGraniteCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistGraniteCopperOre.get() && !Copper.temperatureBlacklistGraniteCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistGraniteCopperOre.get() && Copper.biomeBlacklistGraniteCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistGraniteCopperOre.get() && !Copper.biomeBlacklistGraniteCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeGraniteCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkGraniteCopperOre.get(), Copper.minHeightGraniteCopperOre.get(), 0, Copper.maxHeightGraniteCopperOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Copper.enableNetherrackCopperOre.get()) {
                if ((Copper.isTempWhitelistNetherrackCopperOre.get() && Copper.temperatureBlacklistNetherrackCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistNetherrackCopperOre.get() && !Copper.temperatureBlacklistNetherrackCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistNetherrackCopperOre.get() && Copper.biomeBlacklistNetherrackCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistNetherrackCopperOre.get() && !Copper.biomeBlacklistNetherrackCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_COPPER_ORE.get().getDefaultState(), Copper.veinSizeNetherrackCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkNetherrackCopperOre.get(), Copper.minHeightNetherrackCopperOre.get(), 0, Copper.maxHeightNetherrackCopperOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Copper.enableEndStoneCopperOre.get()) {
                if ((Copper.isTempWhitelistEndStoneCopperOre.get() && Copper.temperatureBlacklistEndStoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEndStoneCopperOre.get() && !Copper.temperatureBlacklistEndStoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEndStoneCopperOre.get() && Copper.biomeBlacklistEndStoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEndStoneCopperOre.get() && !Copper.biomeBlacklistEndStoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEndStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEndStoneCopperOre.get(), Copper.minHeightEndStoneCopperOre.get(), 0, Copper.maxHeightEndStoneCopperOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Copper.enableSandCopperOre.get()) {
                if ((Copper.isTempWhitelistSandCopperOre.get() && Copper.temperatureBlacklistSandCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistSandCopperOre.get() && !Copper.temperatureBlacklistSandCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistSandCopperOre.get() && Copper.biomeBlacklistSandCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistSandCopperOre.get() && !Copper.biomeBlacklistSandCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_COPPER_ORE.get().getDefaultState(), Copper.veinSizeSandCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkSandCopperOre.get(), Copper.minHeightSandCopperOre.get(), 0, Copper.maxHeightSandCopperOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Copper.enableRedSandCopperOre.get()) {
                if ((Copper.isTempWhitelistRedSandCopperOre.get() && Copper.temperatureBlacklistRedSandCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistRedSandCopperOre.get() && !Copper.temperatureBlacklistRedSandCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistRedSandCopperOre.get() && Copper.biomeBlacklistRedSandCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistRedSandCopperOre.get() && !Copper.biomeBlacklistRedSandCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_COPPER_ORE.get().getDefaultState(), Copper.veinSizeRedSandCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkRedSandCopperOre.get(), Copper.minHeightRedSandCopperOre.get(), 0, Copper.maxHeightRedSandCopperOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Copper.enableGravelCopperOre.get()) {
                if ((Copper.isTempWhitelistGravelCopperOre.get() && Copper.temperatureBlacklistGravelCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistGravelCopperOre.get() && !Copper.temperatureBlacklistGravelCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistGravelCopperOre.get() && Copper.biomeBlacklistGravelCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistGravelCopperOre.get() && !Copper.biomeBlacklistGravelCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_COPPER_ORE.get().getDefaultState(), Copper.veinSizeGravelCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkGravelCopperOre.get(), Copper.minHeightGravelCopperOre.get(), 0, Copper.maxHeightGravelCopperOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Copper.enableSandstoneCopperOre.get()) {
                if ((Copper.isTempWhitelistSandstoneCopperOre.get() && Copper.temperatureBlacklistSandstoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistSandstoneCopperOre.get() && !Copper.temperatureBlacklistSandstoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistSandstoneCopperOre.get() && Copper.biomeBlacklistSandstoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistSandstoneCopperOre.get() && !Copper.biomeBlacklistSandstoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeSandstoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkSandstoneCopperOre.get(), Copper.minHeightSandstoneCopperOre.get(), 0, Copper.maxHeightSandstoneCopperOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Copper.enableRedSandstoneCopperOre.get()) {
                if ((Copper.isTempWhitelistRedSandstoneCopperOre.get() && Copper.temperatureBlacklistRedSandstoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistRedSandstoneCopperOre.get() && !Copper.temperatureBlacklistRedSandstoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistRedSandstoneCopperOre.get() && Copper.biomeBlacklistRedSandstoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistRedSandstoneCopperOre.get() && !Copper.biomeBlacklistRedSandstoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeRedSandstoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkRedSandstoneCopperOre.get(), Copper.minHeightRedSandstoneCopperOre.get(), 0, Copper.maxHeightRedSandstoneCopperOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Copper.enableBlueIceCopperOre.get()) {
                if ((Copper.isTempWhitelistBlueIceCopperOre.get() && Copper.temperatureBlacklistBlueIceCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistBlueIceCopperOre.get() && !Copper.temperatureBlacklistBlueIceCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistBlueIceCopperOre.get() && Copper.biomeBlacklistBlueIceCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistBlueIceCopperOre.get() && !Copper.biomeBlacklistBlueIceCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeBlueIceCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkBlueIceCopperOre.get(), Copper.minHeightBlueIceCopperOre.get(), 0, Copper.maxHeightBlueIceCopperOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Copper.enablePackedIceCopperOre.get()) {
                if ((Copper.isTempWhitelistPackedIceCopperOre.get() && Copper.temperatureBlacklistPackedIceCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistPackedIceCopperOre.get() && !Copper.temperatureBlacklistPackedIceCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistPackedIceCopperOre.get() && Copper.biomeBlacklistPackedIceCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistPackedIceCopperOre.get() && !Copper.biomeBlacklistPackedIceCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_COPPER_ORE.get().getDefaultState(), Copper.veinSizePackedIceCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkPackedIceCopperOre.get(), Copper.minHeightPackedIceCopperOre.get(), 0, Copper.maxHeightPackedIceCopperOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Copper.enableBedrockCopperOre.get()) {
                if ((Copper.isTempWhitelistBedrockCopperOre.get() && Copper.temperatureBlacklistBedrockCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistBedrockCopperOre.get() && !Copper.temperatureBlacklistBedrockCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistBedrockCopperOre.get() && Copper.biomeBlacklistBedrockCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistBedrockCopperOre.get() && !Copper.biomeBlacklistBedrockCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_COPPER_ORE.get().getDefaultState(), Copper.veinSizeBedrockCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkBedrockCopperOre.get(), Copper.minHeightBedrockCopperOre.get(), 0, Copper.maxHeightBedrockCopperOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Copper.enableQuarkBasaltCopperOre.get()) {
                if ((Copper.isTempWhitelistQuarkBasaltCopperOre.get() && Copper.temperatureBlacklistQuarkBasaltCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistQuarkBasaltCopperOre.get() && !Copper.temperatureBlacklistQuarkBasaltCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistQuarkBasaltCopperOre.get() && Copper.biomeBlacklistQuarkBasaltCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistQuarkBasaltCopperOre.get() && !Copper.biomeBlacklistQuarkBasaltCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_COPPER_ORE.get().getDefaultState(), Copper.veinSizeQuarkBasaltCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkQuarkBasaltCopperOre.get(), Copper.minHeightQuarkBasaltCopperOre.get(), 0, Copper.maxHeightQuarkBasaltCopperOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Copper.enableQuarkMarbleCopperOre.get()) {
                if ((Copper.isTempWhitelistQuarkMarbleCopperOre.get() && Copper.temperatureBlacklistQuarkMarbleCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistQuarkMarbleCopperOre.get() && !Copper.temperatureBlacklistQuarkMarbleCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistQuarkMarbleCopperOre.get() && Copper.biomeBlacklistQuarkMarbleCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistQuarkMarbleCopperOre.get() && !Copper.biomeBlacklistQuarkMarbleCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeQuarkMarbleCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkQuarkMarbleCopperOre.get(), Copper.minHeightQuarkMarbleCopperOre.get(), 0, Copper.maxHeightQuarkMarbleCopperOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Copper.enableQuarkSlateCopperOre.get()) {
                if ((Copper.isTempWhitelistQuarkSlateCopperOre.get() && Copper.temperatureBlacklistQuarkSlateCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistQuarkSlateCopperOre.get() && !Copper.temperatureBlacklistQuarkSlateCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistQuarkSlateCopperOre.get() && Copper.biomeBlacklistQuarkSlateCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistQuarkSlateCopperOre.get() && !Copper.biomeBlacklistQuarkSlateCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeQuarkSlateCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkQuarkSlateCopperOre.get(), Copper.minHeightQuarkSlateCopperOre.get(), 0, Copper.maxHeightQuarkSlateCopperOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Copper.enableQuarkLimestoneCopperOre.get()) {
                if ((Copper.isTempWhitelistQuarkLimestoneCopperOre.get() && Copper.temperatureBlacklistQuarkLimestoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistQuarkLimestoneCopperOre.get() && !Copper.temperatureBlacklistQuarkLimestoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistQuarkLimestoneCopperOre.get() && Copper.biomeBlacklistQuarkLimestoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistQuarkLimestoneCopperOre.get() && !Copper.biomeBlacklistQuarkLimestoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeQuarkLimestoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkQuarkLimestoneCopperOre.get(), Copper.minHeightQuarkLimestoneCopperOre.get(), 0, Copper.maxHeightQuarkLimestoneCopperOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Copper.enableQuarkJasperCopperOre.get()) {
                if ((Copper.isTempWhitelistQuarkJasperCopperOre.get() && Copper.temperatureBlacklistQuarkJasperCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistQuarkJasperCopperOre.get() && !Copper.temperatureBlacklistQuarkJasperCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistQuarkJasperCopperOre.get() && Copper.biomeBlacklistQuarkJasperCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistQuarkJasperCopperOre.get() && !Copper.biomeBlacklistQuarkJasperCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_COPPER_ORE.get().getDefaultState(), Copper.veinSizeQuarkJasperCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkQuarkJasperCopperOre.get(), Copper.minHeightQuarkJasperCopperOre.get(), 0, Copper.maxHeightQuarkJasperCopperOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Copper.enableEmbellishcraftBasaltCopperOre.get()) {
                if ((Copper.isTempWhitelistEmbellishcraftBasaltCopperOre.get() && Copper.temperatureBlacklistEmbellishcraftBasaltCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEmbellishcraftBasaltCopperOre.get() && !Copper.temperatureBlacklistEmbellishcraftBasaltCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEmbellishcraftBasaltCopperOre.get() && Copper.biomeBlacklistEmbellishcraftBasaltCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEmbellishcraftBasaltCopperOre.get() && !Copper.biomeBlacklistEmbellishcraftBasaltCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEmbellishcraftBasaltCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEmbellishcraftBasaltCopperOre.get(), Copper.minHeightEmbellishcraftBasaltCopperOre.get(), 0, Copper.maxHeightEmbellishcraftBasaltCopperOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Copper.enableEmbellishcraftGneissCopperOre.get()) {
                if ((Copper.isTempWhitelistEmbellishcraftGneissCopperOre.get() && Copper.temperatureBlacklistEmbellishcraftGneissCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEmbellishcraftGneissCopperOre.get() && !Copper.temperatureBlacklistEmbellishcraftGneissCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEmbellishcraftGneissCopperOre.get() && Copper.biomeBlacklistEmbellishcraftGneissCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEmbellishcraftGneissCopperOre.get() && !Copper.biomeBlacklistEmbellishcraftGneissCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEmbellishcraftGneissCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEmbellishcraftGneissCopperOre.get(), Copper.minHeightEmbellishcraftGneissCopperOre.get(), 0, Copper.maxHeightEmbellishcraftGneissCopperOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Copper.enableEmbellishcraftJadeCopperOre.get()) {
                if ((Copper.isTempWhitelistEmbellishcraftJadeCopperOre.get() && Copper.temperatureBlacklistEmbellishcraftJadeCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEmbellishcraftJadeCopperOre.get() && !Copper.temperatureBlacklistEmbellishcraftJadeCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEmbellishcraftJadeCopperOre.get() && Copper.biomeBlacklistEmbellishcraftJadeCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEmbellishcraftJadeCopperOre.get() && !Copper.biomeBlacklistEmbellishcraftJadeCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEmbellishcraftJadeCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEmbellishcraftJadeCopperOre.get(), Copper.minHeightEmbellishcraftJadeCopperOre.get(), 0, Copper.maxHeightEmbellishcraftJadeCopperOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Copper.enableEmbellishcraftLarvikiteCopperOre.get()) {
                if ((Copper.isTempWhitelistEmbellishcraftLarvikiteCopperOre.get() && Copper.temperatureBlacklistEmbellishcraftLarvikiteCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEmbellishcraftLarvikiteCopperOre.get() && !Copper.temperatureBlacklistEmbellishcraftLarvikiteCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEmbellishcraftLarvikiteCopperOre.get() && Copper.biomeBlacklistEmbellishcraftLarvikiteCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEmbellishcraftLarvikiteCopperOre.get() && !Copper.biomeBlacklistEmbellishcraftLarvikiteCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEmbellishcraftLarvikiteCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEmbellishcraftLarvikiteCopperOre.get(), Copper.minHeightEmbellishcraftLarvikiteCopperOre.get(), 0, Copper.maxHeightEmbellishcraftLarvikiteCopperOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Copper.enableEmbellishcraftMarbleCopperOre.get()) {
                if ((Copper.isTempWhitelistEmbellishcraftMarbleCopperOre.get() && Copper.temperatureBlacklistEmbellishcraftMarbleCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEmbellishcraftMarbleCopperOre.get() && !Copper.temperatureBlacklistEmbellishcraftMarbleCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEmbellishcraftMarbleCopperOre.get() && Copper.biomeBlacklistEmbellishcraftMarbleCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEmbellishcraftMarbleCopperOre.get() && !Copper.biomeBlacklistEmbellishcraftMarbleCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEmbellishcraftMarbleCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEmbellishcraftMarbleCopperOre.get(), Copper.minHeightEmbellishcraftMarbleCopperOre.get(), 0, Copper.maxHeightEmbellishcraftMarbleCopperOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Copper.enableEmbellishcraftSlateCopperOre.get()) {
                if ((Copper.isTempWhitelistEmbellishcraftSlateCopperOre.get() && Copper.temperatureBlacklistEmbellishcraftSlateCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEmbellishcraftSlateCopperOre.get() && !Copper.temperatureBlacklistEmbellishcraftSlateCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEmbellishcraftSlateCopperOre.get() && Copper.biomeBlacklistEmbellishcraftSlateCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEmbellishcraftSlateCopperOre.get() && !Copper.biomeBlacklistEmbellishcraftSlateCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEmbellishcraftSlateCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEmbellishcraftSlateCopperOre.get(), Copper.minHeightEmbellishcraftSlateCopperOre.get(), 0, Copper.maxHeightEmbellishcraftSlateCopperOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Copper.enableHardenedStoneCopperOre.get()) {
                if ((Copper.isTempWhitelistHardenedStoneCopperOre.get() && Copper.temperatureBlacklistHardenedStoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistHardenedStoneCopperOre.get() && !Copper.temperatureBlacklistHardenedStoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistHardenedStoneCopperOre.get() && Copper.biomeBlacklistHardenedStoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistHardenedStoneCopperOre.get() && !Copper.biomeBlacklistHardenedStoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeHardenedStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkHardenedStoneCopperOre.get(), Copper.minHeightHardenedStoneCopperOre.get(), 0, Copper.maxHeightHardenedStoneCopperOre.get()))));
                    } } } }
    }
}
