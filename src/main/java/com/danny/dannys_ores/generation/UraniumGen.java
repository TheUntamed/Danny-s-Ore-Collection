package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Uranium;
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

public class UraniumGen {
    public static void addUraniumGen(Biome biome, String biomeRNS, String biomeTS) {
        addUraniumOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addUraniumOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Stone
        if (!General.disableStoneOreGeneration.get()) {
            if (Uranium.enableStoneUraniumOre.get()) {
                if ((Uranium.isTempWhitelistStoneUraniumOre.get() && Uranium.temperatureBlacklistStoneUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistStoneUraniumOre.get() && !Uranium.temperatureBlacklistStoneUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistStoneUraniumOre.get() && Uranium.biomeBlacklistStoneUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistStoneUraniumOre.get() && !Uranium.biomeBlacklistStoneUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeStoneUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkStoneUraniumOre.get(), Uranium.minHeightStoneUraniumOre.get(), 0, Uranium.maxHeightStoneUraniumOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Uranium.enableAndesiteUraniumOre.get()) {
                if ((Uranium.isTempWhitelistAndesiteUraniumOre.get() && Uranium.temperatureBlacklistAndesiteUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistAndesiteUraniumOre.get() && !Uranium.temperatureBlacklistAndesiteUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistAndesiteUraniumOre.get() && Uranium.biomeBlacklistAndesiteUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistAndesiteUraniumOre.get() && !Uranium.biomeBlacklistAndesiteUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeAndesiteUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkAndesiteUraniumOre.get(), Uranium.minHeightAndesiteUraniumOre.get(), 0, Uranium.maxHeightAndesiteUraniumOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Uranium.enableDioriteUraniumOre.get()) {
                if ((Uranium.isTempWhitelistDioriteUraniumOre.get() && Uranium.temperatureBlacklistDioriteUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistDioriteUraniumOre.get() && !Uranium.temperatureBlacklistDioriteUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistDioriteUraniumOre.get() && Uranium.biomeBlacklistDioriteUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistDioriteUraniumOre.get() && !Uranium.biomeBlacklistDioriteUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeDioriteUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkDioriteUraniumOre.get(), Uranium.minHeightDioriteUraniumOre.get(), 0, Uranium.maxHeightDioriteUraniumOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Uranium.enableGraniteUraniumOre.get()) {
                if ((Uranium.isTempWhitelistGraniteUraniumOre.get() && Uranium.temperatureBlacklistGraniteUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistGraniteUraniumOre.get() && !Uranium.temperatureBlacklistGraniteUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistGraniteUraniumOre.get() && Uranium.biomeBlacklistGraniteUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistGraniteUraniumOre.get() && !Uranium.biomeBlacklistGraniteUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeGraniteUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkGraniteUraniumOre.get(), Uranium.minHeightGraniteUraniumOre.get(), 0, Uranium.maxHeightGraniteUraniumOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Uranium.enableNetherrackUraniumOre.get()) {
                if ((Uranium.isTempWhitelistNetherrackUraniumOre.get() && Uranium.temperatureBlacklistNetherrackUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistNetherrackUraniumOre.get() && !Uranium.temperatureBlacklistNetherrackUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistNetherrackUraniumOre.get() && Uranium.biomeBlacklistNetherrackUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistNetherrackUraniumOre.get() && !Uranium.biomeBlacklistNetherrackUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeNetherrackUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkNetherrackUraniumOre.get(), Uranium.minHeightNetherrackUraniumOre.get(), 0, Uranium.maxHeightNetherrackUraniumOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Uranium.enableEndStoneUraniumOre.get()) {
                if ((Uranium.isTempWhitelistEndStoneUraniumOre.get() && Uranium.temperatureBlacklistEndStoneUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistEndStoneUraniumOre.get() && !Uranium.temperatureBlacklistEndStoneUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistEndStoneUraniumOre.get() && Uranium.biomeBlacklistEndStoneUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistEndStoneUraniumOre.get() && !Uranium.biomeBlacklistEndStoneUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeEndStoneUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkEndStoneUraniumOre.get(), Uranium.minHeightEndStoneUraniumOre.get(), 0, Uranium.maxHeightEndStoneUraniumOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Uranium.enableSandUraniumOre.get()) {
                if ((Uranium.isTempWhitelistSandUraniumOre.get() && Uranium.temperatureBlacklistSandUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistSandUraniumOre.get() && !Uranium.temperatureBlacklistSandUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistSandUraniumOre.get() && Uranium.biomeBlacklistSandUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistSandUraniumOre.get() && !Uranium.biomeBlacklistSandUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeSandUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkSandUraniumOre.get(), Uranium.minHeightSandUraniumOre.get(), 0, Uranium.maxHeightSandUraniumOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Uranium.enableRedSandUraniumOre.get()) {
                if ((Uranium.isTempWhitelistRedSandUraniumOre.get() && Uranium.temperatureBlacklistRedSandUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistRedSandUraniumOre.get() && !Uranium.temperatureBlacklistRedSandUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistRedSandUraniumOre.get() && Uranium.biomeBlacklistRedSandUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistRedSandUraniumOre.get() && !Uranium.biomeBlacklistRedSandUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeRedSandUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkRedSandUraniumOre.get(), Uranium.minHeightRedSandUraniumOre.get(), 0, Uranium.maxHeightRedSandUraniumOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Uranium.enableGravelUraniumOre.get()) {
                if ((Uranium.isTempWhitelistGravelUraniumOre.get() && Uranium.temperatureBlacklistGravelUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistGravelUraniumOre.get() && !Uranium.temperatureBlacklistGravelUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistGravelUraniumOre.get() && Uranium.biomeBlacklistGravelUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistGravelUraniumOre.get() && !Uranium.biomeBlacklistGravelUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeGravelUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkGravelUraniumOre.get(), Uranium.minHeightGravelUraniumOre.get(), 0, Uranium.maxHeightGravelUraniumOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Uranium.enableSandstoneUraniumOre.get()) {
                if ((Uranium.isTempWhitelistSandstoneUraniumOre.get() && Uranium.temperatureBlacklistSandstoneUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistSandstoneUraniumOre.get() && !Uranium.temperatureBlacklistSandstoneUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistSandstoneUraniumOre.get() && Uranium.biomeBlacklistSandstoneUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistSandstoneUraniumOre.get() && !Uranium.biomeBlacklistSandstoneUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeSandstoneUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkSandstoneUraniumOre.get(), Uranium.minHeightSandstoneUraniumOre.get(), 0, Uranium.maxHeightSandstoneUraniumOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Uranium.enableRedSandstoneUraniumOre.get()) {
                if ((Uranium.isTempWhitelistRedSandstoneUraniumOre.get() && Uranium.temperatureBlacklistRedSandstoneUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistRedSandstoneUraniumOre.get() && !Uranium.temperatureBlacklistRedSandstoneUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistRedSandstoneUraniumOre.get() && Uranium.biomeBlacklistRedSandstoneUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistRedSandstoneUraniumOre.get() && !Uranium.biomeBlacklistRedSandstoneUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeRedSandstoneUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkRedSandstoneUraniumOre.get(), Uranium.minHeightRedSandstoneUraniumOre.get(), 0, Uranium.maxHeightRedSandstoneUraniumOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Uranium.enableBlueIceUraniumOre.get()) {
                if ((Uranium.isTempWhitelistBlueIceUraniumOre.get() && Uranium.temperatureBlacklistBlueIceUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistBlueIceUraniumOre.get() && !Uranium.temperatureBlacklistBlueIceUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistBlueIceUraniumOre.get() && Uranium.biomeBlacklistBlueIceUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistBlueIceUraniumOre.get() && !Uranium.biomeBlacklistBlueIceUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeBlueIceUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkBlueIceUraniumOre.get(), Uranium.minHeightBlueIceUraniumOre.get(), 0, Uranium.maxHeightBlueIceUraniumOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Uranium.enablePackedIceUraniumOre.get()) {
                if ((Uranium.isTempWhitelistPackedIceUraniumOre.get() && Uranium.temperatureBlacklistPackedIceUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistPackedIceUraniumOre.get() && !Uranium.temperatureBlacklistPackedIceUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistPackedIceUraniumOre.get() && Uranium.biomeBlacklistPackedIceUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistPackedIceUraniumOre.get() && !Uranium.biomeBlacklistPackedIceUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizePackedIceUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkPackedIceUraniumOre.get(), Uranium.minHeightPackedIceUraniumOre.get(), 0, Uranium.maxHeightPackedIceUraniumOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Uranium.enableBedrockUraniumOre.get()) {
                if ((Uranium.isTempWhitelistBedrockUraniumOre.get() && Uranium.temperatureBlacklistBedrockUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistBedrockUraniumOre.get() && !Uranium.temperatureBlacklistBedrockUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistBedrockUraniumOre.get() && Uranium.biomeBlacklistBedrockUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistBedrockUraniumOre.get() && !Uranium.biomeBlacklistBedrockUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeBedrockUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkBedrockUraniumOre.get(), Uranium.minHeightBedrockUraniumOre.get(), 0, Uranium.maxHeightBedrockUraniumOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Uranium.enableQuarkBasaltUraniumOre.get()) {
                if ((Uranium.isTempWhitelistQuarkBasaltUraniumOre.get() && Uranium.temperatureBlacklistQuarkBasaltUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistQuarkBasaltUraniumOre.get() && !Uranium.temperatureBlacklistQuarkBasaltUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistQuarkBasaltUraniumOre.get() && Uranium.biomeBlacklistQuarkBasaltUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistQuarkBasaltUraniumOre.get() && !Uranium.biomeBlacklistQuarkBasaltUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeQuarkBasaltUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkQuarkBasaltUraniumOre.get(), Uranium.minHeightQuarkBasaltUraniumOre.get(), 0, Uranium.maxHeightQuarkBasaltUraniumOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Uranium.enableQuarkMarbleUraniumOre.get()) {
                if ((Uranium.isTempWhitelistQuarkMarbleUraniumOre.get() && Uranium.temperatureBlacklistQuarkMarbleUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistQuarkMarbleUraniumOre.get() && !Uranium.temperatureBlacklistQuarkMarbleUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistQuarkMarbleUraniumOre.get() && Uranium.biomeBlacklistQuarkMarbleUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistQuarkMarbleUraniumOre.get() && !Uranium.biomeBlacklistQuarkMarbleUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeQuarkMarbleUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkQuarkMarbleUraniumOre.get(), Uranium.minHeightQuarkMarbleUraniumOre.get(), 0, Uranium.maxHeightQuarkMarbleUraniumOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Uranium.enableQuarkSlateUraniumOre.get()) {
                if ((Uranium.isTempWhitelistQuarkSlateUraniumOre.get() && Uranium.temperatureBlacklistQuarkSlateUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistQuarkSlateUraniumOre.get() && !Uranium.temperatureBlacklistQuarkSlateUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistQuarkSlateUraniumOre.get() && Uranium.biomeBlacklistQuarkSlateUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistQuarkSlateUraniumOre.get() && !Uranium.biomeBlacklistQuarkSlateUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeQuarkSlateUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkQuarkSlateUraniumOre.get(), Uranium.minHeightQuarkSlateUraniumOre.get(), 0, Uranium.maxHeightQuarkSlateUraniumOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Uranium.enableQuarkLimestoneUraniumOre.get()) {
                if ((Uranium.isTempWhitelistQuarkLimestoneUraniumOre.get() && Uranium.temperatureBlacklistQuarkLimestoneUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistQuarkLimestoneUraniumOre.get() && !Uranium.temperatureBlacklistQuarkLimestoneUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistQuarkLimestoneUraniumOre.get() && Uranium.biomeBlacklistQuarkLimestoneUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistQuarkLimestoneUraniumOre.get() && !Uranium.biomeBlacklistQuarkLimestoneUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeQuarkLimestoneUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkQuarkLimestoneUraniumOre.get(), Uranium.minHeightQuarkLimestoneUraniumOre.get(), 0, Uranium.maxHeightQuarkLimestoneUraniumOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Uranium.enableQuarkJasperUraniumOre.get()) {
                if ((Uranium.isTempWhitelistQuarkJasperUraniumOre.get() && Uranium.temperatureBlacklistQuarkJasperUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistQuarkJasperUraniumOre.get() && !Uranium.temperatureBlacklistQuarkJasperUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistQuarkJasperUraniumOre.get() && Uranium.biomeBlacklistQuarkJasperUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistQuarkJasperUraniumOre.get() && !Uranium.biomeBlacklistQuarkJasperUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeQuarkJasperUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkQuarkJasperUraniumOre.get(), Uranium.minHeightQuarkJasperUraniumOre.get(), 0, Uranium.maxHeightQuarkJasperUraniumOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Uranium.enableEmbellishcraftBasaltUraniumOre.get()) {
                if ((Uranium.isTempWhitelistEmbellishcraftBasaltUraniumOre.get() && Uranium.temperatureBlacklistEmbellishcraftBasaltUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistEmbellishcraftBasaltUraniumOre.get() && !Uranium.temperatureBlacklistEmbellishcraftBasaltUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistEmbellishcraftBasaltUraniumOre.get() && Uranium.biomeBlacklistEmbellishcraftBasaltUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistEmbellishcraftBasaltUraniumOre.get() && !Uranium.biomeBlacklistEmbellishcraftBasaltUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeEmbellishcraftBasaltUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkEmbellishcraftBasaltUraniumOre.get(), Uranium.minHeightEmbellishcraftBasaltUraniumOre.get(), 0, Uranium.maxHeightEmbellishcraftBasaltUraniumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Uranium.enableEmbellishcraftGneissUraniumOre.get()) {
                if ((Uranium.isTempWhitelistEmbellishcraftGneissUraniumOre.get() && Uranium.temperatureBlacklistEmbellishcraftGneissUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistEmbellishcraftGneissUraniumOre.get() && !Uranium.temperatureBlacklistEmbellishcraftGneissUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistEmbellishcraftGneissUraniumOre.get() && Uranium.biomeBlacklistEmbellishcraftGneissUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistEmbellishcraftGneissUraniumOre.get() && !Uranium.biomeBlacklistEmbellishcraftGneissUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeEmbellishcraftGneissUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkEmbellishcraftGneissUraniumOre.get(), Uranium.minHeightEmbellishcraftGneissUraniumOre.get(), 0, Uranium.maxHeightEmbellishcraftGneissUraniumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Uranium.enableEmbellishcraftJadeUraniumOre.get()) {
                if ((Uranium.isTempWhitelistEmbellishcraftJadeUraniumOre.get() && Uranium.temperatureBlacklistEmbellishcraftJadeUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistEmbellishcraftJadeUraniumOre.get() && !Uranium.temperatureBlacklistEmbellishcraftJadeUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistEmbellishcraftJadeUraniumOre.get() && Uranium.biomeBlacklistEmbellishcraftJadeUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistEmbellishcraftJadeUraniumOre.get() && !Uranium.biomeBlacklistEmbellishcraftJadeUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeEmbellishcraftJadeUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkEmbellishcraftJadeUraniumOre.get(), Uranium.minHeightEmbellishcraftJadeUraniumOre.get(), 0, Uranium.maxHeightEmbellishcraftJadeUraniumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Uranium.enableEmbellishcraftLarvikiteUraniumOre.get()) {
                if ((Uranium.isTempWhitelistEmbellishcraftLarvikiteUraniumOre.get() && Uranium.temperatureBlacklistEmbellishcraftLarvikiteUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistEmbellishcraftLarvikiteUraniumOre.get() && !Uranium.temperatureBlacklistEmbellishcraftLarvikiteUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistEmbellishcraftLarvikiteUraniumOre.get() && Uranium.biomeBlacklistEmbellishcraftLarvikiteUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistEmbellishcraftLarvikiteUraniumOre.get() && !Uranium.biomeBlacklistEmbellishcraftLarvikiteUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeEmbellishcraftLarvikiteUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkEmbellishcraftLarvikiteUraniumOre.get(), Uranium.minHeightEmbellishcraftLarvikiteUraniumOre.get(), 0, Uranium.maxHeightEmbellishcraftLarvikiteUraniumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Uranium.enableEmbellishcraftMarbleUraniumOre.get()) {
                if ((Uranium.isTempWhitelistEmbellishcraftMarbleUraniumOre.get() && Uranium.temperatureBlacklistEmbellishcraftMarbleUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistEmbellishcraftMarbleUraniumOre.get() && !Uranium.temperatureBlacklistEmbellishcraftMarbleUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistEmbellishcraftMarbleUraniumOre.get() && Uranium.biomeBlacklistEmbellishcraftMarbleUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistEmbellishcraftMarbleUraniumOre.get() && !Uranium.biomeBlacklistEmbellishcraftMarbleUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeEmbellishcraftMarbleUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkEmbellishcraftMarbleUraniumOre.get(), Uranium.minHeightEmbellishcraftMarbleUraniumOre.get(), 0, Uranium.maxHeightEmbellishcraftMarbleUraniumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Uranium.enableEmbellishcraftSlateUraniumOre.get()) {
                if ((Uranium.isTempWhitelistEmbellishcraftSlateUraniumOre.get() && Uranium.temperatureBlacklistEmbellishcraftSlateUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistEmbellishcraftSlateUraniumOre.get() && !Uranium.temperatureBlacklistEmbellishcraftSlateUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistEmbellishcraftSlateUraniumOre.get() && Uranium.biomeBlacklistEmbellishcraftSlateUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistEmbellishcraftSlateUraniumOre.get() && !Uranium.biomeBlacklistEmbellishcraftSlateUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeEmbellishcraftSlateUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkEmbellishcraftSlateUraniumOre.get(), Uranium.minHeightEmbellishcraftSlateUraniumOre.get(), 0, Uranium.maxHeightEmbellishcraftSlateUraniumOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Uranium.enableHardenedStoneUraniumOre.get()) {
                if ((Uranium.isTempWhitelistHardenedStoneUraniumOre.get() && Uranium.temperatureBlacklistHardenedStoneUraniumOre.get().contains(biomeTS)) || (!Uranium.isTempWhitelistHardenedStoneUraniumOre.get() && !Uranium.temperatureBlacklistHardenedStoneUraniumOre.get().contains(biomeTS))) {
                    if ((Uranium.isBiomeWhitelistHardenedStoneUraniumOre.get() && Uranium.biomeBlacklistHardenedStoneUraniumOre.get().contains(biomeRNS)) || (!Uranium.isBiomeWhitelistHardenedStoneUraniumOre.get() && !Uranium.biomeBlacklistHardenedStoneUraniumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_URANIUM_ORE.get().getDefaultState(), Uranium.veinSizeHardenedStoneUraniumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Uranium.veinsPerChunkHardenedStoneUraniumOre.get(), Uranium.minHeightHardenedStoneUraniumOre.get(), 0, Uranium.maxHeightHardenedStoneUraniumOre.get()))));
                    } } } }
    }
}
