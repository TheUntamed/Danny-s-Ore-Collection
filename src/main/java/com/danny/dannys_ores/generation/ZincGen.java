package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Zinc;
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

public class ZincGen {
    public static void addZincGen(Biome biome, String biomeRNS, String biomeTS) {
        addZincOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addZincOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Zinc.enableStoneZincOre.get()) {
                if ((Zinc.isTempWhitelistStoneZincOre.get() && Zinc.temperatureBlacklistStoneZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistStoneZincOre.get() && !Zinc.temperatureBlacklistStoneZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistStoneZincOre.get() && Zinc.biomeBlacklistStoneZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistStoneZincOre.get() && !Zinc.biomeBlacklistStoneZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeStoneZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkStoneZincOre.get(), Zinc.minHeightStoneZincOre.get(), 0, Zinc.maxHeightStoneZincOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Zinc.enableAndesiteZincOre.get()) {
                if ((Zinc.isTempWhitelistAndesiteZincOre.get() && Zinc.temperatureBlacklistAndesiteZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistAndesiteZincOre.get() && !Zinc.temperatureBlacklistAndesiteZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistAndesiteZincOre.get() && Zinc.biomeBlacklistAndesiteZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistAndesiteZincOre.get() && !Zinc.biomeBlacklistAndesiteZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeAndesiteZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkAndesiteZincOre.get(), Zinc.minHeightAndesiteZincOre.get(), 0, Zinc.maxHeightAndesiteZincOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Zinc.enableDioriteZincOre.get()) {
                if ((Zinc.isTempWhitelistDioriteZincOre.get() && Zinc.temperatureBlacklistDioriteZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistDioriteZincOre.get() && !Zinc.temperatureBlacklistDioriteZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistDioriteZincOre.get() && Zinc.biomeBlacklistDioriteZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistDioriteZincOre.get() && !Zinc.biomeBlacklistDioriteZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeDioriteZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkDioriteZincOre.get(), Zinc.minHeightDioriteZincOre.get(), 0, Zinc.maxHeightDioriteZincOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Zinc.enableGraniteZincOre.get()) {
                if ((Zinc.isTempWhitelistGraniteZincOre.get() && Zinc.temperatureBlacklistGraniteZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistGraniteZincOre.get() && !Zinc.temperatureBlacklistGraniteZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistGraniteZincOre.get() && Zinc.biomeBlacklistGraniteZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistGraniteZincOre.get() && !Zinc.biomeBlacklistGraniteZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeGraniteZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkGraniteZincOre.get(), Zinc.minHeightGraniteZincOre.get(), 0, Zinc.maxHeightGraniteZincOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Zinc.enableNetherrackZincOre.get()) {
                if ((Zinc.isTempWhitelistNetherrackZincOre.get() && Zinc.temperatureBlacklistNetherrackZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistNetherrackZincOre.get() && !Zinc.temperatureBlacklistNetherrackZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistNetherrackZincOre.get() && Zinc.biomeBlacklistNetherrackZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistNetherrackZincOre.get() && !Zinc.biomeBlacklistNetherrackZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeNetherrackZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkNetherrackZincOre.get(), Zinc.minHeightNetherrackZincOre.get(), 0, Zinc.maxHeightNetherrackZincOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Zinc.enableEndStoneZincOre.get()) {
                if ((Zinc.isTempWhitelistEndStoneZincOre.get() && Zinc.temperatureBlacklistEndStoneZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistEndStoneZincOre.get() && !Zinc.temperatureBlacklistEndStoneZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistEndStoneZincOre.get() && Zinc.biomeBlacklistEndStoneZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistEndStoneZincOre.get() && !Zinc.biomeBlacklistEndStoneZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeEndStoneZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkEndStoneZincOre.get(), Zinc.minHeightEndStoneZincOre.get(), 0, Zinc.maxHeightEndStoneZincOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Zinc.enableSandZincOre.get()) {
                if ((Zinc.isTempWhitelistSandZincOre.get() && Zinc.temperatureBlacklistSandZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistSandZincOre.get() && !Zinc.temperatureBlacklistSandZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistSandZincOre.get() && Zinc.biomeBlacklistSandZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistSandZincOre.get() && !Zinc.biomeBlacklistSandZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeSandZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkSandZincOre.get(), Zinc.minHeightSandZincOre.get(), 0, Zinc.maxHeightSandZincOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Zinc.enableRedSandZincOre.get()) {
                if ((Zinc.isTempWhitelistRedSandZincOre.get() && Zinc.temperatureBlacklistRedSandZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistRedSandZincOre.get() && !Zinc.temperatureBlacklistRedSandZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistRedSandZincOre.get() && Zinc.biomeBlacklistRedSandZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistRedSandZincOre.get() && !Zinc.biomeBlacklistRedSandZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeRedSandZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkRedSandZincOre.get(), Zinc.minHeightRedSandZincOre.get(), 0, Zinc.maxHeightRedSandZincOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Zinc.enableGravelZincOre.get()) {
                if ((Zinc.isTempWhitelistGravelZincOre.get() && Zinc.temperatureBlacklistGravelZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistGravelZincOre.get() && !Zinc.temperatureBlacklistGravelZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistGravelZincOre.get() && Zinc.biomeBlacklistGravelZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistGravelZincOre.get() && !Zinc.biomeBlacklistGravelZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeGravelZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkGravelZincOre.get(), Zinc.minHeightGravelZincOre.get(), 0, Zinc.maxHeightGravelZincOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Zinc.enableSandstoneZincOre.get()) {
                if ((Zinc.isTempWhitelistSandstoneZincOre.get() && Zinc.temperatureBlacklistSandstoneZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistSandstoneZincOre.get() && !Zinc.temperatureBlacklistSandstoneZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistSandstoneZincOre.get() && Zinc.biomeBlacklistSandstoneZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistSandstoneZincOre.get() && !Zinc.biomeBlacklistSandstoneZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeSandstoneZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkSandstoneZincOre.get(), Zinc.minHeightSandstoneZincOre.get(), 0, Zinc.maxHeightSandstoneZincOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Zinc.enableRedSandstoneZincOre.get()) {
                if ((Zinc.isTempWhitelistRedSandstoneZincOre.get() && Zinc.temperatureBlacklistRedSandstoneZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistRedSandstoneZincOre.get() && !Zinc.temperatureBlacklistRedSandstoneZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistRedSandstoneZincOre.get() && Zinc.biomeBlacklistRedSandstoneZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistRedSandstoneZincOre.get() && !Zinc.biomeBlacklistRedSandstoneZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeRedSandstoneZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkRedSandstoneZincOre.get(), Zinc.minHeightRedSandstoneZincOre.get(), 0, Zinc.maxHeightRedSandstoneZincOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Zinc.enableBlueIceZincOre.get()) {
                if ((Zinc.isTempWhitelistBlueIceZincOre.get() && Zinc.temperatureBlacklistBlueIceZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistBlueIceZincOre.get() && !Zinc.temperatureBlacklistBlueIceZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistBlueIceZincOre.get() && Zinc.biomeBlacklistBlueIceZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistBlueIceZincOre.get() && !Zinc.biomeBlacklistBlueIceZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeBlueIceZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkBlueIceZincOre.get(), Zinc.minHeightBlueIceZincOre.get(), 0, Zinc.maxHeightBlueIceZincOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Zinc.enablePackedIceZincOre.get()) {
                if ((Zinc.isTempWhitelistPackedIceZincOre.get() && Zinc.temperatureBlacklistPackedIceZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistPackedIceZincOre.get() && !Zinc.temperatureBlacklistPackedIceZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistPackedIceZincOre.get() && Zinc.biomeBlacklistPackedIceZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistPackedIceZincOre.get() && !Zinc.biomeBlacklistPackedIceZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizePackedIceZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkPackedIceZincOre.get(), Zinc.minHeightPackedIceZincOre.get(), 0, Zinc.maxHeightPackedIceZincOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Zinc.enableBedrockZincOre.get()) {
                if ((Zinc.isTempWhitelistBedrockZincOre.get() && Zinc.temperatureBlacklistBedrockZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistBedrockZincOre.get() && !Zinc.temperatureBlacklistBedrockZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistBedrockZincOre.get() && Zinc.biomeBlacklistBedrockZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistBedrockZincOre.get() && !Zinc.biomeBlacklistBedrockZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeBedrockZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkBedrockZincOre.get(), Zinc.minHeightBedrockZincOre.get(), 0, Zinc.maxHeightBedrockZincOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Zinc.enableQuarkBasaltZincOre.get()) {
                if ((Zinc.isTempWhitelistQuarkBasaltZincOre.get() && Zinc.temperatureBlacklistQuarkBasaltZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistQuarkBasaltZincOre.get() && !Zinc.temperatureBlacklistQuarkBasaltZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistQuarkBasaltZincOre.get() && Zinc.biomeBlacklistQuarkBasaltZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistQuarkBasaltZincOre.get() && !Zinc.biomeBlacklistQuarkBasaltZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeQuarkBasaltZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkQuarkBasaltZincOre.get(), Zinc.minHeightQuarkBasaltZincOre.get(), 0, Zinc.maxHeightQuarkBasaltZincOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Zinc.enableQuarkMarbleZincOre.get()) {
                if ((Zinc.isTempWhitelistQuarkMarbleZincOre.get() && Zinc.temperatureBlacklistQuarkMarbleZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistQuarkMarbleZincOre.get() && !Zinc.temperatureBlacklistQuarkMarbleZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistQuarkMarbleZincOre.get() && Zinc.biomeBlacklistQuarkMarbleZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistQuarkMarbleZincOre.get() && !Zinc.biomeBlacklistQuarkMarbleZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeQuarkMarbleZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkQuarkMarbleZincOre.get(), Zinc.minHeightQuarkMarbleZincOre.get(), 0, Zinc.maxHeightQuarkMarbleZincOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Zinc.enableQuarkSlateZincOre.get()) {
                if ((Zinc.isTempWhitelistQuarkSlateZincOre.get() && Zinc.temperatureBlacklistQuarkSlateZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistQuarkSlateZincOre.get() && !Zinc.temperatureBlacklistQuarkSlateZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistQuarkSlateZincOre.get() && Zinc.biomeBlacklistQuarkSlateZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistQuarkSlateZincOre.get() && !Zinc.biomeBlacklistQuarkSlateZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeQuarkSlateZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkQuarkSlateZincOre.get(), Zinc.minHeightQuarkSlateZincOre.get(), 0, Zinc.maxHeightQuarkSlateZincOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Zinc.enableQuarkLimestoneZincOre.get()) {
                if ((Zinc.isTempWhitelistQuarkLimestoneZincOre.get() && Zinc.temperatureBlacklistQuarkLimestoneZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistQuarkLimestoneZincOre.get() && !Zinc.temperatureBlacklistQuarkLimestoneZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistQuarkLimestoneZincOre.get() && Zinc.biomeBlacklistQuarkLimestoneZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistQuarkLimestoneZincOre.get() && !Zinc.biomeBlacklistQuarkLimestoneZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeQuarkLimestoneZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkQuarkLimestoneZincOre.get(), Zinc.minHeightQuarkLimestoneZincOre.get(), 0, Zinc.maxHeightQuarkLimestoneZincOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Zinc.enableQuarkJasperZincOre.get()) {
                if ((Zinc.isTempWhitelistQuarkJasperZincOre.get() && Zinc.temperatureBlacklistQuarkJasperZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistQuarkJasperZincOre.get() && !Zinc.temperatureBlacklistQuarkJasperZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistQuarkJasperZincOre.get() && Zinc.biomeBlacklistQuarkJasperZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistQuarkJasperZincOre.get() && !Zinc.biomeBlacklistQuarkJasperZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeQuarkJasperZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkQuarkJasperZincOre.get(), Zinc.minHeightQuarkJasperZincOre.get(), 0, Zinc.maxHeightQuarkJasperZincOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Zinc.enableEmbellishcraftBasaltZincOre.get()) {
                if ((Zinc.isTempWhitelistEmbellishcraftBasaltZincOre.get() && Zinc.temperatureBlacklistEmbellishcraftBasaltZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistEmbellishcraftBasaltZincOre.get() && !Zinc.temperatureBlacklistEmbellishcraftBasaltZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistEmbellishcraftBasaltZincOre.get() && Zinc.biomeBlacklistEmbellishcraftBasaltZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistEmbellishcraftBasaltZincOre.get() && !Zinc.biomeBlacklistEmbellishcraftBasaltZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeEmbellishcraftBasaltZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkEmbellishcraftBasaltZincOre.get(), Zinc.minHeightEmbellishcraftBasaltZincOre.get(), 0, Zinc.maxHeightEmbellishcraftBasaltZincOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Zinc.enableEmbellishcraftGneissZincOre.get()) {
                if ((Zinc.isTempWhitelistEmbellishcraftGneissZincOre.get() && Zinc.temperatureBlacklistEmbellishcraftGneissZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistEmbellishcraftGneissZincOre.get() && !Zinc.temperatureBlacklistEmbellishcraftGneissZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistEmbellishcraftGneissZincOre.get() && Zinc.biomeBlacklistEmbellishcraftGneissZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistEmbellishcraftGneissZincOre.get() && !Zinc.biomeBlacklistEmbellishcraftGneissZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeEmbellishcraftGneissZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkEmbellishcraftGneissZincOre.get(), Zinc.minHeightEmbellishcraftGneissZincOre.get(), 0, Zinc.maxHeightEmbellishcraftGneissZincOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Zinc.enableEmbellishcraftJadeZincOre.get()) {
                if ((Zinc.isTempWhitelistEmbellishcraftJadeZincOre.get() && Zinc.temperatureBlacklistEmbellishcraftJadeZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistEmbellishcraftJadeZincOre.get() && !Zinc.temperatureBlacklistEmbellishcraftJadeZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistEmbellishcraftJadeZincOre.get() && Zinc.biomeBlacklistEmbellishcraftJadeZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistEmbellishcraftJadeZincOre.get() && !Zinc.biomeBlacklistEmbellishcraftJadeZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeEmbellishcraftJadeZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkEmbellishcraftJadeZincOre.get(), Zinc.minHeightEmbellishcraftJadeZincOre.get(), 0, Zinc.maxHeightEmbellishcraftJadeZincOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Zinc.enableEmbellishcraftLarvikiteZincOre.get()) {
                if ((Zinc.isTempWhitelistEmbellishcraftLarvikiteZincOre.get() && Zinc.temperatureBlacklistEmbellishcraftLarvikiteZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistEmbellishcraftLarvikiteZincOre.get() && !Zinc.temperatureBlacklistEmbellishcraftLarvikiteZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistEmbellishcraftLarvikiteZincOre.get() && Zinc.biomeBlacklistEmbellishcraftLarvikiteZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistEmbellishcraftLarvikiteZincOre.get() && !Zinc.biomeBlacklistEmbellishcraftLarvikiteZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeEmbellishcraftLarvikiteZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkEmbellishcraftLarvikiteZincOre.get(), Zinc.minHeightEmbellishcraftLarvikiteZincOre.get(), 0, Zinc.maxHeightEmbellishcraftLarvikiteZincOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Zinc.enableEmbellishcraftMarbleZincOre.get()) {
                if ((Zinc.isTempWhitelistEmbellishcraftMarbleZincOre.get() && Zinc.temperatureBlacklistEmbellishcraftMarbleZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistEmbellishcraftMarbleZincOre.get() && !Zinc.temperatureBlacklistEmbellishcraftMarbleZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistEmbellishcraftMarbleZincOre.get() && Zinc.biomeBlacklistEmbellishcraftMarbleZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistEmbellishcraftMarbleZincOre.get() && !Zinc.biomeBlacklistEmbellishcraftMarbleZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeEmbellishcraftMarbleZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkEmbellishcraftMarbleZincOre.get(), Zinc.minHeightEmbellishcraftMarbleZincOre.get(), 0, Zinc.maxHeightEmbellishcraftMarbleZincOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Zinc.enableEmbellishcraftSlateZincOre.get()) {
                if ((Zinc.isTempWhitelistEmbellishcraftSlateZincOre.get() && Zinc.temperatureBlacklistEmbellishcraftSlateZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistEmbellishcraftSlateZincOre.get() && !Zinc.temperatureBlacklistEmbellishcraftSlateZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistEmbellishcraftSlateZincOre.get() && Zinc.biomeBlacklistEmbellishcraftSlateZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistEmbellishcraftSlateZincOre.get() && !Zinc.biomeBlacklistEmbellishcraftSlateZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeEmbellishcraftSlateZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkEmbellishcraftSlateZincOre.get(), Zinc.minHeightEmbellishcraftSlateZincOre.get(), 0, Zinc.maxHeightEmbellishcraftSlateZincOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Zinc.enableHardenedStoneZincOre.get()) {
                if ((Zinc.isTempWhitelistHardenedStoneZincOre.get() && Zinc.temperatureBlacklistHardenedStoneZincOre.get().contains(biomeTS)) || (!Zinc.isTempWhitelistHardenedStoneZincOre.get() && !Zinc.temperatureBlacklistHardenedStoneZincOre.get().contains(biomeTS))) {
                    if ((Zinc.isBiomeWhitelistHardenedStoneZincOre.get() && Zinc.biomeBlacklistHardenedStoneZincOre.get().contains(biomeRNS)) || (!Zinc.isBiomeWhitelistHardenedStoneZincOre.get() && !Zinc.biomeBlacklistHardenedStoneZincOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_ZINC_ORE.get().getDefaultState(), Zinc.veinSizeHardenedStoneZincOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Zinc.veinsPerChunkHardenedStoneZincOre.get(), Zinc.minHeightHardenedStoneZincOre.get(), 0, Zinc.maxHeightHardenedStoneZincOre.get()))));
                    } } } }
    }
}
