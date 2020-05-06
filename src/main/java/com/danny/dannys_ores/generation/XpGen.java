package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class XpGen {

    public static void addXpGen(Biome biome, String biomeRNS, String biomeTS) {
        addXpOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addXpOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Xp.enableStoneXpOre.get()) {
                if ((Xp.isTempWhitelistStoneXpOre.get() && Xp.temperatureBlacklistStoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistStoneXpOre.get() && !Xp.temperatureBlacklistStoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistStoneXpOre.get() && Xp.biomeBlacklistStoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistStoneXpOre.get() && !Xp.biomeBlacklistStoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_XP_ORE.get().getDefaultState(), Xp.veinSizeStoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkStoneXpOre.get(), Xp.minHeightStoneXpOre.get(), 0, Xp.maxHeightStoneXpOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Xp.enableAndesiteXpOre.get()) {
                if ((Xp.isTempWhitelistAndesiteXpOre.get() && Xp.temperatureBlacklistAndesiteXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistAndesiteXpOre.get() && !Xp.temperatureBlacklistAndesiteXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistAndesiteXpOre.get() && Xp.biomeBlacklistAndesiteXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistAndesiteXpOre.get() && !Xp.biomeBlacklistAndesiteXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_XP_ORE.get().getDefaultState(), Xp.veinSizeAndesiteXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkAndesiteXpOre.get(), Xp.minHeightAndesiteXpOre.get(), 0, Xp.maxHeightAndesiteXpOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Xp.enableDioriteXpOre.get()) {
                if ((Xp.isTempWhitelistDioriteXpOre.get() && Xp.temperatureBlacklistDioriteXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistDioriteXpOre.get() && !Xp.temperatureBlacklistDioriteXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistDioriteXpOre.get() && Xp.biomeBlacklistDioriteXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistDioriteXpOre.get() && !Xp.biomeBlacklistDioriteXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_XP_ORE.get().getDefaultState(), Xp.veinSizeDioriteXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkDioriteXpOre.get(), Xp.minHeightDioriteXpOre.get(), 0, Xp.maxHeightDioriteXpOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Xp.enableGraniteXpOre.get()) {
                if ((Xp.isTempWhitelistGraniteXpOre.get() && Xp.temperatureBlacklistGraniteXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistGraniteXpOre.get() && !Xp.temperatureBlacklistGraniteXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistGraniteXpOre.get() && Xp.biomeBlacklistGraniteXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistGraniteXpOre.get() && !Xp.biomeBlacklistGraniteXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_XP_ORE.get().getDefaultState(), Xp.veinSizeGraniteXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkGraniteXpOre.get(), Xp.minHeightGraniteXpOre.get(), 0, Xp.maxHeightGraniteXpOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Xp.enableNetherrackXpOre.get()) {
                if ((Xp.isTempWhitelistNetherrackXpOre.get() && Xp.temperatureBlacklistNetherrackXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistNetherrackXpOre.get() && !Xp.temperatureBlacklistNetherrackXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistNetherrackXpOre.get() && Xp.biomeBlacklistNetherrackXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistNetherrackXpOre.get() && !Xp.biomeBlacklistNetherrackXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_XP_ORE.get().getDefaultState(), Xp.veinSizeNetherrackXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkNetherrackXpOre.get(), Xp.minHeightNetherrackXpOre.get(), 0, Xp.maxHeightNetherrackXpOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Xp.enableEndStoneXpOre.get()) {
                if ((Xp.isTempWhitelistEndStoneXpOre.get() && Xp.temperatureBlacklistEndStoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEndStoneXpOre.get() && !Xp.temperatureBlacklistEndStoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEndStoneXpOre.get() && Xp.biomeBlacklistEndStoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEndStoneXpOre.get() && !Xp.biomeBlacklistEndStoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_XP_ORE.get().getDefaultState(), Xp.veinSizeEndStoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEndStoneXpOre.get(), Xp.minHeightEndStoneXpOre.get(), 0, Xp.maxHeightEndStoneXpOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Xp.enableSandXpOre.get()) {
                if ((Xp.isTempWhitelistSandXpOre.get() && Xp.temperatureBlacklistSandXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistSandXpOre.get() && !Xp.temperatureBlacklistSandXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistSandXpOre.get() && Xp.biomeBlacklistSandXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistSandXpOre.get() && !Xp.biomeBlacklistSandXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_XP_ORE.get().getDefaultState(), Xp.veinSizeSandXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkSandXpOre.get(), Xp.minHeightSandXpOre.get(), 0, Xp.maxHeightSandXpOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Xp.enableRedSandXpOre.get()) {
                if ((Xp.isTempWhitelistRedSandXpOre.get() && Xp.temperatureBlacklistRedSandXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistRedSandXpOre.get() && !Xp.temperatureBlacklistRedSandXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistRedSandXpOre.get() && Xp.biomeBlacklistRedSandXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistRedSandXpOre.get() && !Xp.biomeBlacklistRedSandXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_XP_ORE.get().getDefaultState(), Xp.veinSizeRedSandXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkRedSandXpOre.get(), Xp.minHeightRedSandXpOre.get(), 0, Xp.maxHeightRedSandXpOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Xp.enableGravelXpOre.get()) {
                if ((Xp.isTempWhitelistGravelXpOre.get() && Xp.temperatureBlacklistGravelXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistGravelXpOre.get() && !Xp.temperatureBlacklistGravelXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistGravelXpOre.get() && Xp.biomeBlacklistGravelXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistGravelXpOre.get() && !Xp.biomeBlacklistGravelXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_XP_ORE.get().getDefaultState(), Xp.veinSizeGravelXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkGravelXpOre.get(), Xp.minHeightGravelXpOre.get(), 0, Xp.maxHeightGravelXpOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Xp.enableSandstoneXpOre.get()) {
                if ((Xp.isTempWhitelistSandstoneXpOre.get() && Xp.temperatureBlacklistSandstoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistSandstoneXpOre.get() && !Xp.temperatureBlacklistSandstoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistSandstoneXpOre.get() && Xp.biomeBlacklistSandstoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistSandstoneXpOre.get() && !Xp.biomeBlacklistSandstoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_XP_ORE.get().getDefaultState(), Xp.veinSizeSandstoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkSandstoneXpOre.get(), Xp.minHeightSandstoneXpOre.get(), 0, Xp.maxHeightSandstoneXpOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Xp.enableRedSandstoneXpOre.get()) {
                if ((Xp.isTempWhitelistRedSandstoneXpOre.get() && Xp.temperatureBlacklistRedSandstoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistRedSandstoneXpOre.get() && !Xp.temperatureBlacklistRedSandstoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistRedSandstoneXpOre.get() && Xp.biomeBlacklistRedSandstoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistRedSandstoneXpOre.get() && !Xp.biomeBlacklistRedSandstoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_XP_ORE.get().getDefaultState(), Xp.veinSizeRedSandstoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkRedSandstoneXpOre.get(), Xp.minHeightRedSandstoneXpOre.get(), 0, Xp.maxHeightRedSandstoneXpOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Xp.enableBlueIceXpOre.get()) {
                if ((Xp.isTempWhitelistBlueIceXpOre.get() && Xp.temperatureBlacklistBlueIceXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistBlueIceXpOre.get() && !Xp.temperatureBlacklistBlueIceXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistBlueIceXpOre.get() && Xp.biomeBlacklistBlueIceXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistBlueIceXpOre.get() && !Xp.biomeBlacklistBlueIceXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_XP_ORE.get().getDefaultState(), Xp.veinSizeBlueIceXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkBlueIceXpOre.get(), Xp.minHeightBlueIceXpOre.get(), 0, Xp.maxHeightBlueIceXpOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Xp.enablePackedIceXpOre.get()) {
                if ((Xp.isTempWhitelistPackedIceXpOre.get() && Xp.temperatureBlacklistPackedIceXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistPackedIceXpOre.get() && !Xp.temperatureBlacklistPackedIceXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistPackedIceXpOre.get() && Xp.biomeBlacklistPackedIceXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistPackedIceXpOre.get() && !Xp.biomeBlacklistPackedIceXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_XP_ORE.get().getDefaultState(), Xp.veinSizePackedIceXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkPackedIceXpOre.get(), Xp.minHeightPackedIceXpOre.get(), 0, Xp.maxHeightPackedIceXpOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Xp.enableBedrockXpOre.get()) {
                if ((Xp.isTempWhitelistBedrockXpOre.get() && Xp.temperatureBlacklistBedrockXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistBedrockXpOre.get() && !Xp.temperatureBlacklistBedrockXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistBedrockXpOre.get() && Xp.biomeBlacklistBedrockXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistBedrockXpOre.get() && !Xp.biomeBlacklistBedrockXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_XP_ORE.get().getDefaultState(), Xp.veinSizeBedrockXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkBedrockXpOre.get(), Xp.minHeightBedrockXpOre.get(), 0, Xp.maxHeightBedrockXpOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Xp.enableQuarkBasaltXpOre.get()) {
                if ((Xp.isTempWhitelistQuarkBasaltXpOre.get() && Xp.temperatureBlacklistQuarkBasaltXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistQuarkBasaltXpOre.get() && !Xp.temperatureBlacklistQuarkBasaltXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistQuarkBasaltXpOre.get() && Xp.biomeBlacklistQuarkBasaltXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistQuarkBasaltXpOre.get() && !Xp.biomeBlacklistQuarkBasaltXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_XP_ORE.get().getDefaultState(), Xp.veinSizeQuarkBasaltXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkQuarkBasaltXpOre.get(), Xp.minHeightQuarkBasaltXpOre.get(), 0, Xp.maxHeightQuarkBasaltXpOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Xp.enableQuarkMarbleXpOre.get()) {
                if ((Xp.isTempWhitelistQuarkMarbleXpOre.get() && Xp.temperatureBlacklistQuarkMarbleXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistQuarkMarbleXpOre.get() && !Xp.temperatureBlacklistQuarkMarbleXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistQuarkMarbleXpOre.get() && Xp.biomeBlacklistQuarkMarbleXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistQuarkMarbleXpOre.get() && !Xp.biomeBlacklistQuarkMarbleXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_XP_ORE.get().getDefaultState(), Xp.veinSizeQuarkMarbleXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkQuarkMarbleXpOre.get(), Xp.minHeightQuarkMarbleXpOre.get(), 0, Xp.maxHeightQuarkMarbleXpOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Xp.enableQuarkSlateXpOre.get()) {
                if ((Xp.isTempWhitelistQuarkSlateXpOre.get() && Xp.temperatureBlacklistQuarkSlateXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistQuarkSlateXpOre.get() && !Xp.temperatureBlacklistQuarkSlateXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistQuarkSlateXpOre.get() && Xp.biomeBlacklistQuarkSlateXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistQuarkSlateXpOre.get() && !Xp.biomeBlacklistQuarkSlateXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_XP_ORE.get().getDefaultState(), Xp.veinSizeQuarkSlateXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkQuarkSlateXpOre.get(), Xp.minHeightQuarkSlateXpOre.get(), 0, Xp.maxHeightQuarkSlateXpOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Xp.enableQuarkLimestoneXpOre.get()) {
                if ((Xp.isTempWhitelistQuarkLimestoneXpOre.get() && Xp.temperatureBlacklistQuarkLimestoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistQuarkLimestoneXpOre.get() && !Xp.temperatureBlacklistQuarkLimestoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistQuarkLimestoneXpOre.get() && Xp.biomeBlacklistQuarkLimestoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistQuarkLimestoneXpOre.get() && !Xp.biomeBlacklistQuarkLimestoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_XP_ORE.get().getDefaultState(), Xp.veinSizeQuarkLimestoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkQuarkLimestoneXpOre.get(), Xp.minHeightQuarkLimestoneXpOre.get(), 0, Xp.maxHeightQuarkLimestoneXpOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Xp.enableQuarkJasperXpOre.get()) {
                if ((Xp.isTempWhitelistQuarkJasperXpOre.get() && Xp.temperatureBlacklistQuarkJasperXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistQuarkJasperXpOre.get() && !Xp.temperatureBlacklistQuarkJasperXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistQuarkJasperXpOre.get() && Xp.biomeBlacklistQuarkJasperXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistQuarkJasperXpOre.get() && !Xp.biomeBlacklistQuarkJasperXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_XP_ORE.get().getDefaultState(), Xp.veinSizeQuarkJasperXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkQuarkJasperXpOre.get(), Xp.minHeightQuarkJasperXpOre.get(), 0, Xp.maxHeightQuarkJasperXpOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Xp.enableEmbellishcraftBasaltXpOre.get()) {
                if ((Xp.isTempWhitelistEmbellishcraftBasaltXpOre.get() && Xp.temperatureBlacklistEmbellishcraftBasaltXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEmbellishcraftBasaltXpOre.get() && !Xp.temperatureBlacklistEmbellishcraftBasaltXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEmbellishcraftBasaltXpOre.get() && Xp.biomeBlacklistEmbellishcraftBasaltXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEmbellishcraftBasaltXpOre.get() && !Xp.biomeBlacklistEmbellishcraftBasaltXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_XP_ORE.get().getDefaultState(), Xp.veinSizeEmbellishcraftBasaltXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEmbellishcraftBasaltXpOre.get(), Xp.minHeightEmbellishcraftBasaltXpOre.get(), 0, Xp.maxHeightEmbellishcraftBasaltXpOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Xp.enableEmbellishcraftGneissXpOre.get()) {
                if ((Xp.isTempWhitelistEmbellishcraftGneissXpOre.get() && Xp.temperatureBlacklistEmbellishcraftGneissXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEmbellishcraftGneissXpOre.get() && !Xp.temperatureBlacklistEmbellishcraftGneissXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEmbellishcraftGneissXpOre.get() && Xp.biomeBlacklistEmbellishcraftGneissXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEmbellishcraftGneissXpOre.get() && !Xp.biomeBlacklistEmbellishcraftGneissXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_XP_ORE.get().getDefaultState(), Xp.veinSizeEmbellishcraftGneissXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEmbellishcraftGneissXpOre.get(), Xp.minHeightEmbellishcraftGneissXpOre.get(), 0, Xp.maxHeightEmbellishcraftGneissXpOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Xp.enableEmbellishcraftJadeXpOre.get()) {
                if ((Xp.isTempWhitelistEmbellishcraftJadeXpOre.get() && Xp.temperatureBlacklistEmbellishcraftJadeXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEmbellishcraftJadeXpOre.get() && !Xp.temperatureBlacklistEmbellishcraftJadeXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEmbellishcraftJadeXpOre.get() && Xp.biomeBlacklistEmbellishcraftJadeXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEmbellishcraftJadeXpOre.get() && !Xp.biomeBlacklistEmbellishcraftJadeXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_XP_ORE.get().getDefaultState(), Xp.veinSizeEmbellishcraftJadeXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEmbellishcraftJadeXpOre.get(), Xp.minHeightEmbellishcraftJadeXpOre.get(), 0, Xp.maxHeightEmbellishcraftJadeXpOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Xp.enableEmbellishcraftLarvikiteXpOre.get()) {
                if ((Xp.isTempWhitelistEmbellishcraftLarvikiteXpOre.get() && Xp.temperatureBlacklistEmbellishcraftLarvikiteXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEmbellishcraftLarvikiteXpOre.get() && !Xp.temperatureBlacklistEmbellishcraftLarvikiteXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEmbellishcraftLarvikiteXpOre.get() && Xp.biomeBlacklistEmbellishcraftLarvikiteXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEmbellishcraftLarvikiteXpOre.get() && !Xp.biomeBlacklistEmbellishcraftLarvikiteXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_XP_ORE.get().getDefaultState(), Xp.veinSizeEmbellishcraftLarvikiteXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEmbellishcraftLarvikiteXpOre.get(), Xp.minHeightEmbellishcraftLarvikiteXpOre.get(), 0, Xp.maxHeightEmbellishcraftLarvikiteXpOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Xp.enableEmbellishcraftMarbleXpOre.get()) {
                if ((Xp.isTempWhitelistEmbellishcraftMarbleXpOre.get() && Xp.temperatureBlacklistEmbellishcraftMarbleXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEmbellishcraftMarbleXpOre.get() && !Xp.temperatureBlacklistEmbellishcraftMarbleXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEmbellishcraftMarbleXpOre.get() && Xp.biomeBlacklistEmbellishcraftMarbleXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEmbellishcraftMarbleXpOre.get() && !Xp.biomeBlacklistEmbellishcraftMarbleXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_XP_ORE.get().getDefaultState(), Xp.veinSizeEmbellishcraftMarbleXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEmbellishcraftMarbleXpOre.get(), Xp.minHeightEmbellishcraftMarbleXpOre.get(), 0, Xp.maxHeightEmbellishcraftMarbleXpOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Xp.enableEmbellishcraftSlateXpOre.get()) {
                if ((Xp.isTempWhitelistEmbellishcraftSlateXpOre.get() && Xp.temperatureBlacklistEmbellishcraftSlateXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEmbellishcraftSlateXpOre.get() && !Xp.temperatureBlacklistEmbellishcraftSlateXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEmbellishcraftSlateXpOre.get() && Xp.biomeBlacklistEmbellishcraftSlateXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEmbellishcraftSlateXpOre.get() && !Xp.biomeBlacklistEmbellishcraftSlateXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_XP_ORE.get().getDefaultState(), Xp.veinSizeEmbellishcraftSlateXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEmbellishcraftSlateXpOre.get(), Xp.minHeightEmbellishcraftSlateXpOre.get(), 0, Xp.maxHeightEmbellishcraftSlateXpOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Xp.enableHardenedStoneXpOre.get()) {
                if ((Xp.isTempWhitelistHardenedStoneXpOre.get() && Xp.temperatureBlacklistHardenedStoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistHardenedStoneXpOre.get() && !Xp.temperatureBlacklistHardenedStoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistHardenedStoneXpOre.get() && Xp.biomeBlacklistHardenedStoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistHardenedStoneXpOre.get() && !Xp.biomeBlacklistHardenedStoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_XP_ORE.get().getDefaultState(), Xp.veinSizeHardenedStoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkHardenedStoneXpOre.get(), Xp.minHeightHardenedStoneXpOre.get(), 0, Xp.maxHeightHardenedStoneXpOre.get()))));
                    } } } }
    }
}
