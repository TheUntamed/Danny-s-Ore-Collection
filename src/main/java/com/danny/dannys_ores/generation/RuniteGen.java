package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Runite;
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

public class RuniteGen {
    public static void addRuniteGen(Biome biome, String biomeRNS, String biomeTS) {
        addRuniteOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addRuniteOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Runite.enableStoneRuniteOre.get()) {
                if ((Runite.isTempWhitelistStoneRuniteOre.get() && Runite.temperatureBlacklistStoneRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistStoneRuniteOre.get() && !Runite.temperatureBlacklistStoneRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistStoneRuniteOre.get() && Runite.biomeBlacklistStoneRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistStoneRuniteOre.get() && !Runite.biomeBlacklistStoneRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeStoneRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkStoneRuniteOre.get(), Runite.minHeightStoneRuniteOre.get(), 0, Runite.maxHeightStoneRuniteOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Runite.enableAndesiteRuniteOre.get()) {
                if ((Runite.isTempWhitelistAndesiteRuniteOre.get() && Runite.temperatureBlacklistAndesiteRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistAndesiteRuniteOre.get() && !Runite.temperatureBlacklistAndesiteRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistAndesiteRuniteOre.get() && Runite.biomeBlacklistAndesiteRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistAndesiteRuniteOre.get() && !Runite.biomeBlacklistAndesiteRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeAndesiteRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkAndesiteRuniteOre.get(), Runite.minHeightAndesiteRuniteOre.get(), 0, Runite.maxHeightAndesiteRuniteOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Runite.enableDioriteRuniteOre.get()) {
                if ((Runite.isTempWhitelistDioriteRuniteOre.get() && Runite.temperatureBlacklistDioriteRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistDioriteRuniteOre.get() && !Runite.temperatureBlacklistDioriteRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistDioriteRuniteOre.get() && Runite.biomeBlacklistDioriteRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistDioriteRuniteOre.get() && !Runite.biomeBlacklistDioriteRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeDioriteRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkDioriteRuniteOre.get(), Runite.minHeightDioriteRuniteOre.get(), 0, Runite.maxHeightDioriteRuniteOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Runite.enableGraniteRuniteOre.get()) {
                if ((Runite.isTempWhitelistGraniteRuniteOre.get() && Runite.temperatureBlacklistGraniteRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistGraniteRuniteOre.get() && !Runite.temperatureBlacklistGraniteRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistGraniteRuniteOre.get() && Runite.biomeBlacklistGraniteRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistGraniteRuniteOre.get() && !Runite.biomeBlacklistGraniteRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeGraniteRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkGraniteRuniteOre.get(), Runite.minHeightGraniteRuniteOre.get(), 0, Runite.maxHeightGraniteRuniteOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Runite.enableNetherrackRuniteOre.get()) {
                if ((Runite.isTempWhitelistNetherrackRuniteOre.get() && Runite.temperatureBlacklistNetherrackRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistNetherrackRuniteOre.get() && !Runite.temperatureBlacklistNetherrackRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistNetherrackRuniteOre.get() && Runite.biomeBlacklistNetherrackRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistNetherrackRuniteOre.get() && !Runite.biomeBlacklistNetherrackRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeNetherrackRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkNetherrackRuniteOre.get(), Runite.minHeightNetherrackRuniteOre.get(), 0, Runite.maxHeightNetherrackRuniteOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Runite.enableEndStoneRuniteOre.get()) {
                if ((Runite.isTempWhitelistEndStoneRuniteOre.get() && Runite.temperatureBlacklistEndStoneRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistEndStoneRuniteOre.get() && !Runite.temperatureBlacklistEndStoneRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistEndStoneRuniteOre.get() && Runite.biomeBlacklistEndStoneRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistEndStoneRuniteOre.get() && !Runite.biomeBlacklistEndStoneRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeEndStoneRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkEndStoneRuniteOre.get(), Runite.minHeightEndStoneRuniteOre.get(), 0, Runite.maxHeightEndStoneRuniteOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Runite.enableSandRuniteOre.get()) {
                if ((Runite.isTempWhitelistSandRuniteOre.get() && Runite.temperatureBlacklistSandRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistSandRuniteOre.get() && !Runite.temperatureBlacklistSandRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistSandRuniteOre.get() && Runite.biomeBlacklistSandRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistSandRuniteOre.get() && !Runite.biomeBlacklistSandRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeSandRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkSandRuniteOre.get(), Runite.minHeightSandRuniteOre.get(), 0, Runite.maxHeightSandRuniteOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Runite.enableRedSandRuniteOre.get()) {
                if ((Runite.isTempWhitelistRedSandRuniteOre.get() && Runite.temperatureBlacklistRedSandRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistRedSandRuniteOre.get() && !Runite.temperatureBlacklistRedSandRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistRedSandRuniteOre.get() && Runite.biomeBlacklistRedSandRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistRedSandRuniteOre.get() && !Runite.biomeBlacklistRedSandRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeRedSandRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkRedSandRuniteOre.get(), Runite.minHeightRedSandRuniteOre.get(), 0, Runite.maxHeightRedSandRuniteOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Runite.enableGravelRuniteOre.get()) {
                if ((Runite.isTempWhitelistGravelRuniteOre.get() && Runite.temperatureBlacklistGravelRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistGravelRuniteOre.get() && !Runite.temperatureBlacklistGravelRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistGravelRuniteOre.get() && Runite.biomeBlacklistGravelRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistGravelRuniteOre.get() && !Runite.biomeBlacklistGravelRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeGravelRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkGravelRuniteOre.get(), Runite.minHeightGravelRuniteOre.get(), 0, Runite.maxHeightGravelRuniteOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Runite.enableSandstoneRuniteOre.get()) {
                if ((Runite.isTempWhitelistSandstoneRuniteOre.get() && Runite.temperatureBlacklistSandstoneRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistSandstoneRuniteOre.get() && !Runite.temperatureBlacklistSandstoneRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistSandstoneRuniteOre.get() && Runite.biomeBlacklistSandstoneRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistSandstoneRuniteOre.get() && !Runite.biomeBlacklistSandstoneRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeSandstoneRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkSandstoneRuniteOre.get(), Runite.minHeightSandstoneRuniteOre.get(), 0, Runite.maxHeightSandstoneRuniteOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Runite.enableRedSandstoneRuniteOre.get()) {
                if ((Runite.isTempWhitelistRedSandstoneRuniteOre.get() && Runite.temperatureBlacklistRedSandstoneRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistRedSandstoneRuniteOre.get() && !Runite.temperatureBlacklistRedSandstoneRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistRedSandstoneRuniteOre.get() && Runite.biomeBlacklistRedSandstoneRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistRedSandstoneRuniteOre.get() && !Runite.biomeBlacklistRedSandstoneRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeRedSandstoneRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkRedSandstoneRuniteOre.get(), Runite.minHeightRedSandstoneRuniteOre.get(), 0, Runite.maxHeightRedSandstoneRuniteOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Runite.enableBlueIceRuniteOre.get()) {
                if ((Runite.isTempWhitelistBlueIceRuniteOre.get() && Runite.temperatureBlacklistBlueIceRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistBlueIceRuniteOre.get() && !Runite.temperatureBlacklistBlueIceRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistBlueIceRuniteOre.get() && Runite.biomeBlacklistBlueIceRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistBlueIceRuniteOre.get() && !Runite.biomeBlacklistBlueIceRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeBlueIceRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkBlueIceRuniteOre.get(), Runite.minHeightBlueIceRuniteOre.get(), 0, Runite.maxHeightBlueIceRuniteOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Runite.enablePackedIceRuniteOre.get()) {
                if ((Runite.isTempWhitelistPackedIceRuniteOre.get() && Runite.temperatureBlacklistPackedIceRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistPackedIceRuniteOre.get() && !Runite.temperatureBlacklistPackedIceRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistPackedIceRuniteOre.get() && Runite.biomeBlacklistPackedIceRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistPackedIceRuniteOre.get() && !Runite.biomeBlacklistPackedIceRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizePackedIceRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkPackedIceRuniteOre.get(), Runite.minHeightPackedIceRuniteOre.get(), 0, Runite.maxHeightPackedIceRuniteOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Runite.enableBedrockRuniteOre.get()) {
                if ((Runite.isTempWhitelistBedrockRuniteOre.get() && Runite.temperatureBlacklistBedrockRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistBedrockRuniteOre.get() && !Runite.temperatureBlacklistBedrockRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistBedrockRuniteOre.get() && Runite.biomeBlacklistBedrockRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistBedrockRuniteOre.get() && !Runite.biomeBlacklistBedrockRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeBedrockRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkBedrockRuniteOre.get(), Runite.minHeightBedrockRuniteOre.get(), 0, Runite.maxHeightBedrockRuniteOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Runite.enableQuarkBasaltRuniteOre.get()) {
                if ((Runite.isTempWhitelistQuarkBasaltRuniteOre.get() && Runite.temperatureBlacklistQuarkBasaltRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistQuarkBasaltRuniteOre.get() && !Runite.temperatureBlacklistQuarkBasaltRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistQuarkBasaltRuniteOre.get() && Runite.biomeBlacklistQuarkBasaltRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistQuarkBasaltRuniteOre.get() && !Runite.biomeBlacklistQuarkBasaltRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeQuarkBasaltRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkQuarkBasaltRuniteOre.get(), Runite.minHeightQuarkBasaltRuniteOre.get(), 0, Runite.maxHeightQuarkBasaltRuniteOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Runite.enableQuarkMarbleRuniteOre.get()) {
                if ((Runite.isTempWhitelistQuarkMarbleRuniteOre.get() && Runite.temperatureBlacklistQuarkMarbleRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistQuarkMarbleRuniteOre.get() && !Runite.temperatureBlacklistQuarkMarbleRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistQuarkMarbleRuniteOre.get() && Runite.biomeBlacklistQuarkMarbleRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistQuarkMarbleRuniteOre.get() && !Runite.biomeBlacklistQuarkMarbleRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeQuarkMarbleRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkQuarkMarbleRuniteOre.get(), Runite.minHeightQuarkMarbleRuniteOre.get(), 0, Runite.maxHeightQuarkMarbleRuniteOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Runite.enableQuarkSlateRuniteOre.get()) {
                if ((Runite.isTempWhitelistQuarkSlateRuniteOre.get() && Runite.temperatureBlacklistQuarkSlateRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistQuarkSlateRuniteOre.get() && !Runite.temperatureBlacklistQuarkSlateRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistQuarkSlateRuniteOre.get() && Runite.biomeBlacklistQuarkSlateRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistQuarkSlateRuniteOre.get() && !Runite.biomeBlacklistQuarkSlateRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeQuarkSlateRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkQuarkSlateRuniteOre.get(), Runite.minHeightQuarkSlateRuniteOre.get(), 0, Runite.maxHeightQuarkSlateRuniteOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Runite.enableQuarkLimestoneRuniteOre.get()) {
                if ((Runite.isTempWhitelistQuarkLimestoneRuniteOre.get() && Runite.temperatureBlacklistQuarkLimestoneRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistQuarkLimestoneRuniteOre.get() && !Runite.temperatureBlacklistQuarkLimestoneRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistQuarkLimestoneRuniteOre.get() && Runite.biomeBlacklistQuarkLimestoneRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistQuarkLimestoneRuniteOre.get() && !Runite.biomeBlacklistQuarkLimestoneRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeQuarkLimestoneRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkQuarkLimestoneRuniteOre.get(), Runite.minHeightQuarkLimestoneRuniteOre.get(), 0, Runite.maxHeightQuarkLimestoneRuniteOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Runite.enableQuarkJasperRuniteOre.get()) {
                if ((Runite.isTempWhitelistQuarkJasperRuniteOre.get() && Runite.temperatureBlacklistQuarkJasperRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistQuarkJasperRuniteOre.get() && !Runite.temperatureBlacklistQuarkJasperRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistQuarkJasperRuniteOre.get() && Runite.biomeBlacklistQuarkJasperRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistQuarkJasperRuniteOre.get() && !Runite.biomeBlacklistQuarkJasperRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeQuarkJasperRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkQuarkJasperRuniteOre.get(), Runite.minHeightQuarkJasperRuniteOre.get(), 0, Runite.maxHeightQuarkJasperRuniteOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Runite.enableEmbellishcraftBasaltRuniteOre.get()) {
                if ((Runite.isTempWhitelistEmbellishcraftBasaltRuniteOre.get() && Runite.temperatureBlacklistEmbellishcraftBasaltRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistEmbellishcraftBasaltRuniteOre.get() && !Runite.temperatureBlacklistEmbellishcraftBasaltRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistEmbellishcraftBasaltRuniteOre.get() && Runite.biomeBlacklistEmbellishcraftBasaltRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistEmbellishcraftBasaltRuniteOre.get() && !Runite.biomeBlacklistEmbellishcraftBasaltRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeEmbellishcraftBasaltRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkEmbellishcraftBasaltRuniteOre.get(), Runite.minHeightEmbellishcraftBasaltRuniteOre.get(), 0, Runite.maxHeightEmbellishcraftBasaltRuniteOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Runite.enableEmbellishcraftGneissRuniteOre.get()) {
                if ((Runite.isTempWhitelistEmbellishcraftGneissRuniteOre.get() && Runite.temperatureBlacklistEmbellishcraftGneissRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistEmbellishcraftGneissRuniteOre.get() && !Runite.temperatureBlacklistEmbellishcraftGneissRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistEmbellishcraftGneissRuniteOre.get() && Runite.biomeBlacklistEmbellishcraftGneissRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistEmbellishcraftGneissRuniteOre.get() && !Runite.biomeBlacklistEmbellishcraftGneissRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeEmbellishcraftGneissRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkEmbellishcraftGneissRuniteOre.get(), Runite.minHeightEmbellishcraftGneissRuniteOre.get(), 0, Runite.maxHeightEmbellishcraftGneissRuniteOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Runite.enableEmbellishcraftJadeRuniteOre.get()) {
                if ((Runite.isTempWhitelistEmbellishcraftJadeRuniteOre.get() && Runite.temperatureBlacklistEmbellishcraftJadeRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistEmbellishcraftJadeRuniteOre.get() && !Runite.temperatureBlacklistEmbellishcraftJadeRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistEmbellishcraftJadeRuniteOre.get() && Runite.biomeBlacklistEmbellishcraftJadeRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistEmbellishcraftJadeRuniteOre.get() && !Runite.biomeBlacklistEmbellishcraftJadeRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeEmbellishcraftJadeRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkEmbellishcraftJadeRuniteOre.get(), Runite.minHeightEmbellishcraftJadeRuniteOre.get(), 0, Runite.maxHeightEmbellishcraftJadeRuniteOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Runite.enableEmbellishcraftLarvikiteRuniteOre.get()) {
                if ((Runite.isTempWhitelistEmbellishcraftLarvikiteRuniteOre.get() && Runite.temperatureBlacklistEmbellishcraftLarvikiteRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistEmbellishcraftLarvikiteRuniteOre.get() && !Runite.temperatureBlacklistEmbellishcraftLarvikiteRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistEmbellishcraftLarvikiteRuniteOre.get() && Runite.biomeBlacklistEmbellishcraftLarvikiteRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistEmbellishcraftLarvikiteRuniteOre.get() && !Runite.biomeBlacklistEmbellishcraftLarvikiteRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeEmbellishcraftLarvikiteRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkEmbellishcraftLarvikiteRuniteOre.get(), Runite.minHeightEmbellishcraftLarvikiteRuniteOre.get(), 0, Runite.maxHeightEmbellishcraftLarvikiteRuniteOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Runite.enableEmbellishcraftMarbleRuniteOre.get()) {
                if ((Runite.isTempWhitelistEmbellishcraftMarbleRuniteOre.get() && Runite.temperatureBlacklistEmbellishcraftMarbleRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistEmbellishcraftMarbleRuniteOre.get() && !Runite.temperatureBlacklistEmbellishcraftMarbleRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistEmbellishcraftMarbleRuniteOre.get() && Runite.biomeBlacklistEmbellishcraftMarbleRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistEmbellishcraftMarbleRuniteOre.get() && !Runite.biomeBlacklistEmbellishcraftMarbleRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeEmbellishcraftMarbleRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkEmbellishcraftMarbleRuniteOre.get(), Runite.minHeightEmbellishcraftMarbleRuniteOre.get(), 0, Runite.maxHeightEmbellishcraftMarbleRuniteOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Runite.enableEmbellishcraftSlateRuniteOre.get()) {
                if ((Runite.isTempWhitelistEmbellishcraftSlateRuniteOre.get() && Runite.temperatureBlacklistEmbellishcraftSlateRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistEmbellishcraftSlateRuniteOre.get() && !Runite.temperatureBlacklistEmbellishcraftSlateRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistEmbellishcraftSlateRuniteOre.get() && Runite.biomeBlacklistEmbellishcraftSlateRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistEmbellishcraftSlateRuniteOre.get() && !Runite.biomeBlacklistEmbellishcraftSlateRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeEmbellishcraftSlateRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkEmbellishcraftSlateRuniteOre.get(), Runite.minHeightEmbellishcraftSlateRuniteOre.get(), 0, Runite.maxHeightEmbellishcraftSlateRuniteOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Runite.enableHardenedStoneRuniteOre.get()) {
                if ((Runite.isTempWhitelistHardenedStoneRuniteOre.get() && Runite.temperatureBlacklistHardenedStoneRuniteOre.get().contains(biomeTS)) || (!Runite.isTempWhitelistHardenedStoneRuniteOre.get() && !Runite.temperatureBlacklistHardenedStoneRuniteOre.get().contains(biomeTS))) {
                    if ((Runite.isBiomeWhitelistHardenedStoneRuniteOre.get() && Runite.biomeBlacklistHardenedStoneRuniteOre.get().contains(biomeRNS)) || (!Runite.isBiomeWhitelistHardenedStoneRuniteOre.get() && !Runite.biomeBlacklistHardenedStoneRuniteOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_RUNITE_ORE.get().getDefaultState(), Runite.veinSizeHardenedStoneRuniteOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Runite.veinsPerChunkHardenedStoneRuniteOre.get(), Runite.minHeightHardenedStoneRuniteOre.get(), 0, Runite.maxHeightHardenedStoneRuniteOre.get()))));
                    } } } }
    }
}
