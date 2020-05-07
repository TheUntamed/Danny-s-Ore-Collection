package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Silver;
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

public class SilverGen {
    public static void addSilverGen(Biome biome, String biomeRNS, String biomeTS) {
        addSilverOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addSilverOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Stone
        if (!General.disableStoneOreGeneration.get()) {
            if (Silver.enableStoneSilverOre.get()) {
                if ((Silver.isTempWhitelistStoneSilverOre.get() && Silver.temperatureBlacklistStoneSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistStoneSilverOre.get() && !Silver.temperatureBlacklistStoneSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistStoneSilverOre.get() && Silver.biomeBlacklistStoneSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistStoneSilverOre.get() && !Silver.biomeBlacklistStoneSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeStoneSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkStoneSilverOre.get(), Silver.minHeightStoneSilverOre.get(), 0, Silver.maxHeightStoneSilverOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Silver.enableAndesiteSilverOre.get()) {
                if ((Silver.isTempWhitelistAndesiteSilverOre.get() && Silver.temperatureBlacklistAndesiteSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistAndesiteSilverOre.get() && !Silver.temperatureBlacklistAndesiteSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistAndesiteSilverOre.get() && Silver.biomeBlacklistAndesiteSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistAndesiteSilverOre.get() && !Silver.biomeBlacklistAndesiteSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeAndesiteSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkAndesiteSilverOre.get(), Silver.minHeightAndesiteSilverOre.get(), 0, Silver.maxHeightAndesiteSilverOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Silver.enableDioriteSilverOre.get()) {
                if ((Silver.isTempWhitelistDioriteSilverOre.get() && Silver.temperatureBlacklistDioriteSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistDioriteSilverOre.get() && !Silver.temperatureBlacklistDioriteSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistDioriteSilverOre.get() && Silver.biomeBlacklistDioriteSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistDioriteSilverOre.get() && !Silver.biomeBlacklistDioriteSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeDioriteSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkDioriteSilverOre.get(), Silver.minHeightDioriteSilverOre.get(), 0, Silver.maxHeightDioriteSilverOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Silver.enableGraniteSilverOre.get()) {
                if ((Silver.isTempWhitelistGraniteSilverOre.get() && Silver.temperatureBlacklistGraniteSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistGraniteSilverOre.get() && !Silver.temperatureBlacklistGraniteSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistGraniteSilverOre.get() && Silver.biomeBlacklistGraniteSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistGraniteSilverOre.get() && !Silver.biomeBlacklistGraniteSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeGraniteSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkGraniteSilverOre.get(), Silver.minHeightGraniteSilverOre.get(), 0, Silver.maxHeightGraniteSilverOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Silver.enableNetherrackSilverOre.get()) {
                if ((Silver.isTempWhitelistNetherrackSilverOre.get() && Silver.temperatureBlacklistNetherrackSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistNetherrackSilverOre.get() && !Silver.temperatureBlacklistNetherrackSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistNetherrackSilverOre.get() && Silver.biomeBlacklistNetherrackSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistNetherrackSilverOre.get() && !Silver.biomeBlacklistNetherrackSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_SILVER_ORE.get().getDefaultState(), Silver.veinSizeNetherrackSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkNetherrackSilverOre.get(), Silver.minHeightNetherrackSilverOre.get(), 0, Silver.maxHeightNetherrackSilverOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Silver.enableEndStoneSilverOre.get()) {
                if ((Silver.isTempWhitelistEndStoneSilverOre.get() && Silver.temperatureBlacklistEndStoneSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistEndStoneSilverOre.get() && !Silver.temperatureBlacklistEndStoneSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistEndStoneSilverOre.get() && Silver.biomeBlacklistEndStoneSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistEndStoneSilverOre.get() && !Silver.biomeBlacklistEndStoneSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeEndStoneSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkEndStoneSilverOre.get(), Silver.minHeightEndStoneSilverOre.get(), 0, Silver.maxHeightEndStoneSilverOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Silver.enableSandSilverOre.get()) {
                if ((Silver.isTempWhitelistSandSilverOre.get() && Silver.temperatureBlacklistSandSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistSandSilverOre.get() && !Silver.temperatureBlacklistSandSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistSandSilverOre.get() && Silver.biomeBlacklistSandSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistSandSilverOre.get() && !Silver.biomeBlacklistSandSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_SILVER_ORE.get().getDefaultState(), Silver.veinSizeSandSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkSandSilverOre.get(), Silver.minHeightSandSilverOre.get(), 0, Silver.maxHeightSandSilverOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Silver.enableRedSandSilverOre.get()) {
                if ((Silver.isTempWhitelistRedSandSilverOre.get() && Silver.temperatureBlacklistRedSandSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistRedSandSilverOre.get() && !Silver.temperatureBlacklistRedSandSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistRedSandSilverOre.get() && Silver.biomeBlacklistRedSandSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistRedSandSilverOre.get() && !Silver.biomeBlacklistRedSandSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_SILVER_ORE.get().getDefaultState(), Silver.veinSizeRedSandSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkRedSandSilverOre.get(), Silver.minHeightRedSandSilverOre.get(), 0, Silver.maxHeightRedSandSilverOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Silver.enableGravelSilverOre.get()) {
                if ((Silver.isTempWhitelistGravelSilverOre.get() && Silver.temperatureBlacklistGravelSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistGravelSilverOre.get() && !Silver.temperatureBlacklistGravelSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistGravelSilverOre.get() && Silver.biomeBlacklistGravelSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistGravelSilverOre.get() && !Silver.biomeBlacklistGravelSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_SILVER_ORE.get().getDefaultState(), Silver.veinSizeGravelSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkGravelSilverOre.get(), Silver.minHeightGravelSilverOre.get(), 0, Silver.maxHeightGravelSilverOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Silver.enableSandstoneSilverOre.get()) {
                if ((Silver.isTempWhitelistSandstoneSilverOre.get() && Silver.temperatureBlacklistSandstoneSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistSandstoneSilverOre.get() && !Silver.temperatureBlacklistSandstoneSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistSandstoneSilverOre.get() && Silver.biomeBlacklistSandstoneSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistSandstoneSilverOre.get() && !Silver.biomeBlacklistSandstoneSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeSandstoneSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkSandstoneSilverOre.get(), Silver.minHeightSandstoneSilverOre.get(), 0, Silver.maxHeightSandstoneSilverOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Silver.enableRedSandstoneSilverOre.get()) {
                if ((Silver.isTempWhitelistRedSandstoneSilverOre.get() && Silver.temperatureBlacklistRedSandstoneSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistRedSandstoneSilverOre.get() && !Silver.temperatureBlacklistRedSandstoneSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistRedSandstoneSilverOre.get() && Silver.biomeBlacklistRedSandstoneSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistRedSandstoneSilverOre.get() && !Silver.biomeBlacklistRedSandstoneSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeRedSandstoneSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkRedSandstoneSilverOre.get(), Silver.minHeightRedSandstoneSilverOre.get(), 0, Silver.maxHeightRedSandstoneSilverOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Silver.enableBlueIceSilverOre.get()) {
                if ((Silver.isTempWhitelistBlueIceSilverOre.get() && Silver.temperatureBlacklistBlueIceSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistBlueIceSilverOre.get() && !Silver.temperatureBlacklistBlueIceSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistBlueIceSilverOre.get() && Silver.biomeBlacklistBlueIceSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistBlueIceSilverOre.get() && !Silver.biomeBlacklistBlueIceSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeBlueIceSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkBlueIceSilverOre.get(), Silver.minHeightBlueIceSilverOre.get(), 0, Silver.maxHeightBlueIceSilverOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Silver.enablePackedIceSilverOre.get()) {
                if ((Silver.isTempWhitelistPackedIceSilverOre.get() && Silver.temperatureBlacklistPackedIceSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistPackedIceSilverOre.get() && !Silver.temperatureBlacklistPackedIceSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistPackedIceSilverOre.get() && Silver.biomeBlacklistPackedIceSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistPackedIceSilverOre.get() && !Silver.biomeBlacklistPackedIceSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_SILVER_ORE.get().getDefaultState(), Silver.veinSizePackedIceSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkPackedIceSilverOre.get(), Silver.minHeightPackedIceSilverOre.get(), 0, Silver.maxHeightPackedIceSilverOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Silver.enableBedrockSilverOre.get()) {
                if ((Silver.isTempWhitelistBedrockSilverOre.get() && Silver.temperatureBlacklistBedrockSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistBedrockSilverOre.get() && !Silver.temperatureBlacklistBedrockSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistBedrockSilverOre.get() && Silver.biomeBlacklistBedrockSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistBedrockSilverOre.get() && !Silver.biomeBlacklistBedrockSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_SILVER_ORE.get().getDefaultState(), Silver.veinSizeBedrockSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkBedrockSilverOre.get(), Silver.minHeightBedrockSilverOre.get(), 0, Silver.maxHeightBedrockSilverOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Silver.enableQuarkBasaltSilverOre.get()) {
                if ((Silver.isTempWhitelistQuarkBasaltSilverOre.get() && Silver.temperatureBlacklistQuarkBasaltSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistQuarkBasaltSilverOre.get() && !Silver.temperatureBlacklistQuarkBasaltSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistQuarkBasaltSilverOre.get() && Silver.biomeBlacklistQuarkBasaltSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistQuarkBasaltSilverOre.get() && !Silver.biomeBlacklistQuarkBasaltSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_SILVER_ORE.get().getDefaultState(), Silver.veinSizeQuarkBasaltSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkQuarkBasaltSilverOre.get(), Silver.minHeightQuarkBasaltSilverOre.get(), 0, Silver.maxHeightQuarkBasaltSilverOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Silver.enableQuarkMarbleSilverOre.get()) {
                if ((Silver.isTempWhitelistQuarkMarbleSilverOre.get() && Silver.temperatureBlacklistQuarkMarbleSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistQuarkMarbleSilverOre.get() && !Silver.temperatureBlacklistQuarkMarbleSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistQuarkMarbleSilverOre.get() && Silver.biomeBlacklistQuarkMarbleSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistQuarkMarbleSilverOre.get() && !Silver.biomeBlacklistQuarkMarbleSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeQuarkMarbleSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkQuarkMarbleSilverOre.get(), Silver.minHeightQuarkMarbleSilverOre.get(), 0, Silver.maxHeightQuarkMarbleSilverOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Silver.enableQuarkSlateSilverOre.get()) {
                if ((Silver.isTempWhitelistQuarkSlateSilverOre.get() && Silver.temperatureBlacklistQuarkSlateSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistQuarkSlateSilverOre.get() && !Silver.temperatureBlacklistQuarkSlateSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistQuarkSlateSilverOre.get() && Silver.biomeBlacklistQuarkSlateSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistQuarkSlateSilverOre.get() && !Silver.biomeBlacklistQuarkSlateSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeQuarkSlateSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkQuarkSlateSilverOre.get(), Silver.minHeightQuarkSlateSilverOre.get(), 0, Silver.maxHeightQuarkSlateSilverOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Silver.enableQuarkLimestoneSilverOre.get()) {
                if ((Silver.isTempWhitelistQuarkLimestoneSilverOre.get() && Silver.temperatureBlacklistQuarkLimestoneSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistQuarkLimestoneSilverOre.get() && !Silver.temperatureBlacklistQuarkLimestoneSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistQuarkLimestoneSilverOre.get() && Silver.biomeBlacklistQuarkLimestoneSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistQuarkLimestoneSilverOre.get() && !Silver.biomeBlacklistQuarkLimestoneSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeQuarkLimestoneSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkQuarkLimestoneSilverOre.get(), Silver.minHeightQuarkLimestoneSilverOre.get(), 0, Silver.maxHeightQuarkLimestoneSilverOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Silver.enableQuarkJasperSilverOre.get()) {
                if ((Silver.isTempWhitelistQuarkJasperSilverOre.get() && Silver.temperatureBlacklistQuarkJasperSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistQuarkJasperSilverOre.get() && !Silver.temperatureBlacklistQuarkJasperSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistQuarkJasperSilverOre.get() && Silver.biomeBlacklistQuarkJasperSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistQuarkJasperSilverOre.get() && !Silver.biomeBlacklistQuarkJasperSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_SILVER_ORE.get().getDefaultState(), Silver.veinSizeQuarkJasperSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkQuarkJasperSilverOre.get(), Silver.minHeightQuarkJasperSilverOre.get(), 0, Silver.maxHeightQuarkJasperSilverOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Silver.enableEmbellishcraftBasaltSilverOre.get()) {
                if ((Silver.isTempWhitelistEmbellishcraftBasaltSilverOre.get() && Silver.temperatureBlacklistEmbellishcraftBasaltSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistEmbellishcraftBasaltSilverOre.get() && !Silver.temperatureBlacklistEmbellishcraftBasaltSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistEmbellishcraftBasaltSilverOre.get() && Silver.biomeBlacklistEmbellishcraftBasaltSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistEmbellishcraftBasaltSilverOre.get() && !Silver.biomeBlacklistEmbellishcraftBasaltSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_SILVER_ORE.get().getDefaultState(), Silver.veinSizeEmbellishcraftBasaltSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkEmbellishcraftBasaltSilverOre.get(), Silver.minHeightEmbellishcraftBasaltSilverOre.get(), 0, Silver.maxHeightEmbellishcraftBasaltSilverOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Silver.enableEmbellishcraftGneissSilverOre.get()) {
                if ((Silver.isTempWhitelistEmbellishcraftGneissSilverOre.get() && Silver.temperatureBlacklistEmbellishcraftGneissSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistEmbellishcraftGneissSilverOre.get() && !Silver.temperatureBlacklistEmbellishcraftGneissSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistEmbellishcraftGneissSilverOre.get() && Silver.biomeBlacklistEmbellishcraftGneissSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistEmbellishcraftGneissSilverOre.get() && !Silver.biomeBlacklistEmbellishcraftGneissSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_SILVER_ORE.get().getDefaultState(), Silver.veinSizeEmbellishcraftGneissSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkEmbellishcraftGneissSilverOre.get(), Silver.minHeightEmbellishcraftGneissSilverOre.get(), 0, Silver.maxHeightEmbellishcraftGneissSilverOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Silver.enableEmbellishcraftJadeSilverOre.get()) {
                if ((Silver.isTempWhitelistEmbellishcraftJadeSilverOre.get() && Silver.temperatureBlacklistEmbellishcraftJadeSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistEmbellishcraftJadeSilverOre.get() && !Silver.temperatureBlacklistEmbellishcraftJadeSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistEmbellishcraftJadeSilverOre.get() && Silver.biomeBlacklistEmbellishcraftJadeSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistEmbellishcraftJadeSilverOre.get() && !Silver.biomeBlacklistEmbellishcraftJadeSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeEmbellishcraftJadeSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkEmbellishcraftJadeSilverOre.get(), Silver.minHeightEmbellishcraftJadeSilverOre.get(), 0, Silver.maxHeightEmbellishcraftJadeSilverOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Silver.enableEmbellishcraftLarvikiteSilverOre.get()) {
                if ((Silver.isTempWhitelistEmbellishcraftLarvikiteSilverOre.get() && Silver.temperatureBlacklistEmbellishcraftLarvikiteSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistEmbellishcraftLarvikiteSilverOre.get() && !Silver.temperatureBlacklistEmbellishcraftLarvikiteSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistEmbellishcraftLarvikiteSilverOre.get() && Silver.biomeBlacklistEmbellishcraftLarvikiteSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistEmbellishcraftLarvikiteSilverOre.get() && !Silver.biomeBlacklistEmbellishcraftLarvikiteSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeEmbellishcraftLarvikiteSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkEmbellishcraftLarvikiteSilverOre.get(), Silver.minHeightEmbellishcraftLarvikiteSilverOre.get(), 0, Silver.maxHeightEmbellishcraftLarvikiteSilverOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Silver.enableEmbellishcraftMarbleSilverOre.get()) {
                if ((Silver.isTempWhitelistEmbellishcraftMarbleSilverOre.get() && Silver.temperatureBlacklistEmbellishcraftMarbleSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistEmbellishcraftMarbleSilverOre.get() && !Silver.temperatureBlacklistEmbellishcraftMarbleSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistEmbellishcraftMarbleSilverOre.get() && Silver.biomeBlacklistEmbellishcraftMarbleSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistEmbellishcraftMarbleSilverOre.get() && !Silver.biomeBlacklistEmbellishcraftMarbleSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeEmbellishcraftMarbleSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkEmbellishcraftMarbleSilverOre.get(), Silver.minHeightEmbellishcraftMarbleSilverOre.get(), 0, Silver.maxHeightEmbellishcraftMarbleSilverOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Silver.enableEmbellishcraftSlateSilverOre.get()) {
                if ((Silver.isTempWhitelistEmbellishcraftSlateSilverOre.get() && Silver.temperatureBlacklistEmbellishcraftSlateSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistEmbellishcraftSlateSilverOre.get() && !Silver.temperatureBlacklistEmbellishcraftSlateSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistEmbellishcraftSlateSilverOre.get() && Silver.biomeBlacklistEmbellishcraftSlateSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistEmbellishcraftSlateSilverOre.get() && !Silver.biomeBlacklistEmbellishcraftSlateSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeEmbellishcraftSlateSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkEmbellishcraftSlateSilverOre.get(), Silver.minHeightEmbellishcraftSlateSilverOre.get(), 0, Silver.maxHeightEmbellishcraftSlateSilverOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Silver.enableHardenedStoneSilverOre.get()) {
                if ((Silver.isTempWhitelistHardenedStoneSilverOre.get() && Silver.temperatureBlacklistHardenedStoneSilverOre.get().contains(biomeTS)) || (!Silver.isTempWhitelistHardenedStoneSilverOre.get() && !Silver.temperatureBlacklistHardenedStoneSilverOre.get().contains(biomeTS))) {
                    if ((Silver.isBiomeWhitelistHardenedStoneSilverOre.get() && Silver.biomeBlacklistHardenedStoneSilverOre.get().contains(biomeRNS)) || (!Silver.isBiomeWhitelistHardenedStoneSilverOre.get() && !Silver.biomeBlacklistHardenedStoneSilverOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_SILVER_ORE.get().getDefaultState(), Silver.veinSizeHardenedStoneSilverOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Silver.veinsPerChunkHardenedStoneSilverOre.get(), Silver.minHeightHardenedStoneSilverOre.get(), 0, Silver.maxHeightHardenedStoneSilverOre.get()))));
                    } } } }
    }
}
