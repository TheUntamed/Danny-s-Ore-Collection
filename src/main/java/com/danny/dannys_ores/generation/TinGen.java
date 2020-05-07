package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Tin;
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

public class TinGen {
    public static void addTinGen(Biome biome, String biomeRNS, String biomeTS) {
        addTinOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addTinOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Stone
        if (!General.disableStoneOreGeneration.get()) {
            if (Tin.enableStoneTinOre.get()) {
                if ((Tin.isTempWhitelistStoneTinOre.get() && Tin.temperatureBlacklistStoneTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistStoneTinOre.get() && !Tin.temperatureBlacklistStoneTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistStoneTinOre.get() && Tin.biomeBlacklistStoneTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistStoneTinOre.get() && !Tin.biomeBlacklistStoneTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_TIN_ORE.get().getDefaultState(), Tin.veinSizeStoneTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkStoneTinOre.get(), Tin.minHeightStoneTinOre.get(), 0, Tin.maxHeightStoneTinOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Tin.enableAndesiteTinOre.get()) {
                if ((Tin.isTempWhitelistAndesiteTinOre.get() && Tin.temperatureBlacklistAndesiteTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistAndesiteTinOre.get() && !Tin.temperatureBlacklistAndesiteTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistAndesiteTinOre.get() && Tin.biomeBlacklistAndesiteTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistAndesiteTinOre.get() && !Tin.biomeBlacklistAndesiteTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_TIN_ORE.get().getDefaultState(), Tin.veinSizeAndesiteTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkAndesiteTinOre.get(), Tin.minHeightAndesiteTinOre.get(), 0, Tin.maxHeightAndesiteTinOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Tin.enableDioriteTinOre.get()) {
                if ((Tin.isTempWhitelistDioriteTinOre.get() && Tin.temperatureBlacklistDioriteTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistDioriteTinOre.get() && !Tin.temperatureBlacklistDioriteTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistDioriteTinOre.get() && Tin.biomeBlacklistDioriteTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistDioriteTinOre.get() && !Tin.biomeBlacklistDioriteTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_TIN_ORE.get().getDefaultState(), Tin.veinSizeDioriteTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkDioriteTinOre.get(), Tin.minHeightDioriteTinOre.get(), 0, Tin.maxHeightDioriteTinOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Tin.enableGraniteTinOre.get()) {
                if ((Tin.isTempWhitelistGraniteTinOre.get() && Tin.temperatureBlacklistGraniteTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistGraniteTinOre.get() && !Tin.temperatureBlacklistGraniteTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistGraniteTinOre.get() && Tin.biomeBlacklistGraniteTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistGraniteTinOre.get() && !Tin.biomeBlacklistGraniteTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_TIN_ORE.get().getDefaultState(), Tin.veinSizeGraniteTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkGraniteTinOre.get(), Tin.minHeightGraniteTinOre.get(), 0, Tin.maxHeightGraniteTinOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Tin.enableNetherrackTinOre.get()) {
                if ((Tin.isTempWhitelistNetherrackTinOre.get() && Tin.temperatureBlacklistNetherrackTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistNetherrackTinOre.get() && !Tin.temperatureBlacklistNetherrackTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistNetherrackTinOre.get() && Tin.biomeBlacklistNetherrackTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistNetherrackTinOre.get() && !Tin.biomeBlacklistNetherrackTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_TIN_ORE.get().getDefaultState(), Tin.veinSizeNetherrackTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkNetherrackTinOre.get(), Tin.minHeightNetherrackTinOre.get(), 0, Tin.maxHeightNetherrackTinOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Tin.enableEndStoneTinOre.get()) {
                if ((Tin.isTempWhitelistEndStoneTinOre.get() && Tin.temperatureBlacklistEndStoneTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistEndStoneTinOre.get() && !Tin.temperatureBlacklistEndStoneTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistEndStoneTinOre.get() && Tin.biomeBlacklistEndStoneTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistEndStoneTinOre.get() && !Tin.biomeBlacklistEndStoneTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_TIN_ORE.get().getDefaultState(), Tin.veinSizeEndStoneTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkEndStoneTinOre.get(), Tin.minHeightEndStoneTinOre.get(), 0, Tin.maxHeightEndStoneTinOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Tin.enableSandTinOre.get()) {
                if ((Tin.isTempWhitelistSandTinOre.get() && Tin.temperatureBlacklistSandTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistSandTinOre.get() && !Tin.temperatureBlacklistSandTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistSandTinOre.get() && Tin.biomeBlacklistSandTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistSandTinOre.get() && !Tin.biomeBlacklistSandTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_TIN_ORE.get().getDefaultState(), Tin.veinSizeSandTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkSandTinOre.get(), Tin.minHeightSandTinOre.get(), 0, Tin.maxHeightSandTinOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Tin.enableRedSandTinOre.get()) {
                if ((Tin.isTempWhitelistRedSandTinOre.get() && Tin.temperatureBlacklistRedSandTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistRedSandTinOre.get() && !Tin.temperatureBlacklistRedSandTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistRedSandTinOre.get() && Tin.biomeBlacklistRedSandTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistRedSandTinOre.get() && !Tin.biomeBlacklistRedSandTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_TIN_ORE.get().getDefaultState(), Tin.veinSizeRedSandTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkRedSandTinOre.get(), Tin.minHeightRedSandTinOre.get(), 0, Tin.maxHeightRedSandTinOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Tin.enableGravelTinOre.get()) {
                if ((Tin.isTempWhitelistGravelTinOre.get() && Tin.temperatureBlacklistGravelTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistGravelTinOre.get() && !Tin.temperatureBlacklistGravelTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistGravelTinOre.get() && Tin.biomeBlacklistGravelTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistGravelTinOre.get() && !Tin.biomeBlacklistGravelTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_TIN_ORE.get().getDefaultState(), Tin.veinSizeGravelTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkGravelTinOre.get(), Tin.minHeightGravelTinOre.get(), 0, Tin.maxHeightGravelTinOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Tin.enableSandstoneTinOre.get()) {
                if ((Tin.isTempWhitelistSandstoneTinOre.get() && Tin.temperatureBlacklistSandstoneTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistSandstoneTinOre.get() && !Tin.temperatureBlacklistSandstoneTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistSandstoneTinOre.get() && Tin.biomeBlacklistSandstoneTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistSandstoneTinOre.get() && !Tin.biomeBlacklistSandstoneTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_TIN_ORE.get().getDefaultState(), Tin.veinSizeSandstoneTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkSandstoneTinOre.get(), Tin.minHeightSandstoneTinOre.get(), 0, Tin.maxHeightSandstoneTinOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Tin.enableRedSandstoneTinOre.get()) {
                if ((Tin.isTempWhitelistRedSandstoneTinOre.get() && Tin.temperatureBlacklistRedSandstoneTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistRedSandstoneTinOre.get() && !Tin.temperatureBlacklistRedSandstoneTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistRedSandstoneTinOre.get() && Tin.biomeBlacklistRedSandstoneTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistRedSandstoneTinOre.get() && !Tin.biomeBlacklistRedSandstoneTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_TIN_ORE.get().getDefaultState(), Tin.veinSizeRedSandstoneTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkRedSandstoneTinOre.get(), Tin.minHeightRedSandstoneTinOre.get(), 0, Tin.maxHeightRedSandstoneTinOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Tin.enableBlueIceTinOre.get()) {
                if ((Tin.isTempWhitelistBlueIceTinOre.get() && Tin.temperatureBlacklistBlueIceTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistBlueIceTinOre.get() && !Tin.temperatureBlacklistBlueIceTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistBlueIceTinOre.get() && Tin.biomeBlacklistBlueIceTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistBlueIceTinOre.get() && !Tin.biomeBlacklistBlueIceTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_TIN_ORE.get().getDefaultState(), Tin.veinSizeBlueIceTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkBlueIceTinOre.get(), Tin.minHeightBlueIceTinOre.get(), 0, Tin.maxHeightBlueIceTinOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Tin.enablePackedIceTinOre.get()) {
                if ((Tin.isTempWhitelistPackedIceTinOre.get() && Tin.temperatureBlacklistPackedIceTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistPackedIceTinOre.get() && !Tin.temperatureBlacklistPackedIceTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistPackedIceTinOre.get() && Tin.biomeBlacklistPackedIceTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistPackedIceTinOre.get() && !Tin.biomeBlacklistPackedIceTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_TIN_ORE.get().getDefaultState(), Tin.veinSizePackedIceTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkPackedIceTinOre.get(), Tin.minHeightPackedIceTinOre.get(), 0, Tin.maxHeightPackedIceTinOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Tin.enableBedrockTinOre.get()) {
                if ((Tin.isTempWhitelistBedrockTinOre.get() && Tin.temperatureBlacklistBedrockTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistBedrockTinOre.get() && !Tin.temperatureBlacklistBedrockTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistBedrockTinOre.get() && Tin.biomeBlacklistBedrockTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistBedrockTinOre.get() && !Tin.biomeBlacklistBedrockTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_TIN_ORE.get().getDefaultState(), Tin.veinSizeBedrockTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkBedrockTinOre.get(), Tin.minHeightBedrockTinOre.get(), 0, Tin.maxHeightBedrockTinOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Tin.enableQuarkBasaltTinOre.get()) {
                if ((Tin.isTempWhitelistQuarkBasaltTinOre.get() && Tin.temperatureBlacklistQuarkBasaltTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistQuarkBasaltTinOre.get() && !Tin.temperatureBlacklistQuarkBasaltTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistQuarkBasaltTinOre.get() && Tin.biomeBlacklistQuarkBasaltTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistQuarkBasaltTinOre.get() && !Tin.biomeBlacklistQuarkBasaltTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_TIN_ORE.get().getDefaultState(), Tin.veinSizeQuarkBasaltTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkQuarkBasaltTinOre.get(), Tin.minHeightQuarkBasaltTinOre.get(), 0, Tin.maxHeightQuarkBasaltTinOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Tin.enableQuarkMarbleTinOre.get()) {
                if ((Tin.isTempWhitelistQuarkMarbleTinOre.get() && Tin.temperatureBlacklistQuarkMarbleTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistQuarkMarbleTinOre.get() && !Tin.temperatureBlacklistQuarkMarbleTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistQuarkMarbleTinOre.get() && Tin.biomeBlacklistQuarkMarbleTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistQuarkMarbleTinOre.get() && !Tin.biomeBlacklistQuarkMarbleTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_TIN_ORE.get().getDefaultState(), Tin.veinSizeQuarkMarbleTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkQuarkMarbleTinOre.get(), Tin.minHeightQuarkMarbleTinOre.get(), 0, Tin.maxHeightQuarkMarbleTinOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Tin.enableQuarkSlateTinOre.get()) {
                if ((Tin.isTempWhitelistQuarkSlateTinOre.get() && Tin.temperatureBlacklistQuarkSlateTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistQuarkSlateTinOre.get() && !Tin.temperatureBlacklistQuarkSlateTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistQuarkSlateTinOre.get() && Tin.biomeBlacklistQuarkSlateTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistQuarkSlateTinOre.get() && !Tin.biomeBlacklistQuarkSlateTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_TIN_ORE.get().getDefaultState(), Tin.veinSizeQuarkSlateTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkQuarkSlateTinOre.get(), Tin.minHeightQuarkSlateTinOre.get(), 0, Tin.maxHeightQuarkSlateTinOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Tin.enableQuarkLimestoneTinOre.get()) {
                if ((Tin.isTempWhitelistQuarkLimestoneTinOre.get() && Tin.temperatureBlacklistQuarkLimestoneTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistQuarkLimestoneTinOre.get() && !Tin.temperatureBlacklistQuarkLimestoneTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistQuarkLimestoneTinOre.get() && Tin.biomeBlacklistQuarkLimestoneTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistQuarkLimestoneTinOre.get() && !Tin.biomeBlacklistQuarkLimestoneTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_TIN_ORE.get().getDefaultState(), Tin.veinSizeQuarkLimestoneTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkQuarkLimestoneTinOre.get(), Tin.minHeightQuarkLimestoneTinOre.get(), 0, Tin.maxHeightQuarkLimestoneTinOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Tin.enableQuarkJasperTinOre.get()) {
                if ((Tin.isTempWhitelistQuarkJasperTinOre.get() && Tin.temperatureBlacklistQuarkJasperTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistQuarkJasperTinOre.get() && !Tin.temperatureBlacklistQuarkJasperTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistQuarkJasperTinOre.get() && Tin.biomeBlacklistQuarkJasperTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistQuarkJasperTinOre.get() && !Tin.biomeBlacklistQuarkJasperTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_TIN_ORE.get().getDefaultState(), Tin.veinSizeQuarkJasperTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkQuarkJasperTinOre.get(), Tin.minHeightQuarkJasperTinOre.get(), 0, Tin.maxHeightQuarkJasperTinOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Tin.enableEmbellishcraftBasaltTinOre.get()) {
                if ((Tin.isTempWhitelistEmbellishcraftBasaltTinOre.get() && Tin.temperatureBlacklistEmbellishcraftBasaltTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistEmbellishcraftBasaltTinOre.get() && !Tin.temperatureBlacklistEmbellishcraftBasaltTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistEmbellishcraftBasaltTinOre.get() && Tin.biomeBlacklistEmbellishcraftBasaltTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistEmbellishcraftBasaltTinOre.get() && !Tin.biomeBlacklistEmbellishcraftBasaltTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_TIN_ORE.get().getDefaultState(), Tin.veinSizeEmbellishcraftBasaltTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkEmbellishcraftBasaltTinOre.get(), Tin.minHeightEmbellishcraftBasaltTinOre.get(), 0, Tin.maxHeightEmbellishcraftBasaltTinOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Tin.enableEmbellishcraftGneissTinOre.get()) {
                if ((Tin.isTempWhitelistEmbellishcraftGneissTinOre.get() && Tin.temperatureBlacklistEmbellishcraftGneissTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistEmbellishcraftGneissTinOre.get() && !Tin.temperatureBlacklistEmbellishcraftGneissTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistEmbellishcraftGneissTinOre.get() && Tin.biomeBlacklistEmbellishcraftGneissTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistEmbellishcraftGneissTinOre.get() && !Tin.biomeBlacklistEmbellishcraftGneissTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_TIN_ORE.get().getDefaultState(), Tin.veinSizeEmbellishcraftGneissTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkEmbellishcraftGneissTinOre.get(), Tin.minHeightEmbellishcraftGneissTinOre.get(), 0, Tin.maxHeightEmbellishcraftGneissTinOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Tin.enableEmbellishcraftJadeTinOre.get()) {
                if ((Tin.isTempWhitelistEmbellishcraftJadeTinOre.get() && Tin.temperatureBlacklistEmbellishcraftJadeTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistEmbellishcraftJadeTinOre.get() && !Tin.temperatureBlacklistEmbellishcraftJadeTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistEmbellishcraftJadeTinOre.get() && Tin.biomeBlacklistEmbellishcraftJadeTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistEmbellishcraftJadeTinOre.get() && !Tin.biomeBlacklistEmbellishcraftJadeTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_TIN_ORE.get().getDefaultState(), Tin.veinSizeEmbellishcraftJadeTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkEmbellishcraftJadeTinOre.get(), Tin.minHeightEmbellishcraftJadeTinOre.get(), 0, Tin.maxHeightEmbellishcraftJadeTinOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Tin.enableEmbellishcraftLarvikiteTinOre.get()) {
                if ((Tin.isTempWhitelistEmbellishcraftLarvikiteTinOre.get() && Tin.temperatureBlacklistEmbellishcraftLarvikiteTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistEmbellishcraftLarvikiteTinOre.get() && !Tin.temperatureBlacklistEmbellishcraftLarvikiteTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistEmbellishcraftLarvikiteTinOre.get() && Tin.biomeBlacklistEmbellishcraftLarvikiteTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistEmbellishcraftLarvikiteTinOre.get() && !Tin.biomeBlacklistEmbellishcraftLarvikiteTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_TIN_ORE.get().getDefaultState(), Tin.veinSizeEmbellishcraftLarvikiteTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkEmbellishcraftLarvikiteTinOre.get(), Tin.minHeightEmbellishcraftLarvikiteTinOre.get(), 0, Tin.maxHeightEmbellishcraftLarvikiteTinOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Tin.enableEmbellishcraftMarbleTinOre.get()) {
                if ((Tin.isTempWhitelistEmbellishcraftMarbleTinOre.get() && Tin.temperatureBlacklistEmbellishcraftMarbleTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistEmbellishcraftMarbleTinOre.get() && !Tin.temperatureBlacklistEmbellishcraftMarbleTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistEmbellishcraftMarbleTinOre.get() && Tin.biomeBlacklistEmbellishcraftMarbleTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistEmbellishcraftMarbleTinOre.get() && !Tin.biomeBlacklistEmbellishcraftMarbleTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_TIN_ORE.get().getDefaultState(), Tin.veinSizeEmbellishcraftMarbleTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkEmbellishcraftMarbleTinOre.get(), Tin.minHeightEmbellishcraftMarbleTinOre.get(), 0, Tin.maxHeightEmbellishcraftMarbleTinOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Tin.enableEmbellishcraftSlateTinOre.get()) {
                if ((Tin.isTempWhitelistEmbellishcraftSlateTinOre.get() && Tin.temperatureBlacklistEmbellishcraftSlateTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistEmbellishcraftSlateTinOre.get() && !Tin.temperatureBlacklistEmbellishcraftSlateTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistEmbellishcraftSlateTinOre.get() && Tin.biomeBlacklistEmbellishcraftSlateTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistEmbellishcraftSlateTinOre.get() && !Tin.biomeBlacklistEmbellishcraftSlateTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_TIN_ORE.get().getDefaultState(), Tin.veinSizeEmbellishcraftSlateTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkEmbellishcraftSlateTinOre.get(), Tin.minHeightEmbellishcraftSlateTinOre.get(), 0, Tin.maxHeightEmbellishcraftSlateTinOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Tin.enableHardenedStoneTinOre.get()) {
                if ((Tin.isTempWhitelistHardenedStoneTinOre.get() && Tin.temperatureBlacklistHardenedStoneTinOre.get().contains(biomeTS)) || (!Tin.isTempWhitelistHardenedStoneTinOre.get() && !Tin.temperatureBlacklistHardenedStoneTinOre.get().contains(biomeTS))) {
                    if ((Tin.isBiomeWhitelistHardenedStoneTinOre.get() && Tin.biomeBlacklistHardenedStoneTinOre.get().contains(biomeRNS)) || (!Tin.isBiomeWhitelistHardenedStoneTinOre.get() && !Tin.biomeBlacklistHardenedStoneTinOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_TIN_ORE.get().getDefaultState(), Tin.veinSizeHardenedStoneTinOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Tin.veinsPerChunkHardenedStoneTinOre.get(), Tin.minHeightHardenedStoneTinOre.get(), 0, Tin.maxHeightHardenedStoneTinOre.get()))));
                    } } } }
    }
}
