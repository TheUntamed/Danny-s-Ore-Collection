package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Ardite;
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

public class ArditeGen {

    public static void addArditeGen(Biome biome, String biomeRNS, String biomeTS) {
        addArditeOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addArditeOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Ardite.enableStoneArditeOre.get()) {
                if ((Ardite.isTempWhitelistStoneArditeOre.get() && Ardite.temperatureBlacklistStoneArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistStoneArditeOre.get() && !Ardite.temperatureBlacklistStoneArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistStoneArditeOre.get() && Ardite.biomeBlacklistStoneArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistStoneArditeOre.get() && !Ardite.biomeBlacklistStoneArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeStoneArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkStoneArditeOre.get(), Ardite.minHeightStoneArditeOre.get(), 0, Ardite.maxHeightStoneArditeOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Ardite.enableAndesiteArditeOre.get()) {
                if ((Ardite.isTempWhitelistAndesiteArditeOre.get() && Ardite.temperatureBlacklistAndesiteArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistAndesiteArditeOre.get() && !Ardite.temperatureBlacklistAndesiteArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistAndesiteArditeOre.get() && Ardite.biomeBlacklistAndesiteArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistAndesiteArditeOre.get() && !Ardite.biomeBlacklistAndesiteArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeAndesiteArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkAndesiteArditeOre.get(), Ardite.minHeightAndesiteArditeOre.get(), 0, Ardite.maxHeightAndesiteArditeOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Ardite.enableDioriteArditeOre.get()) {
                if ((Ardite.isTempWhitelistDioriteArditeOre.get() && Ardite.temperatureBlacklistDioriteArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistDioriteArditeOre.get() && !Ardite.temperatureBlacklistDioriteArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistDioriteArditeOre.get() && Ardite.biomeBlacklistDioriteArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistDioriteArditeOre.get() && !Ardite.biomeBlacklistDioriteArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeDioriteArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkDioriteArditeOre.get(), Ardite.minHeightDioriteArditeOre.get(), 0, Ardite.maxHeightDioriteArditeOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Ardite.enableGraniteArditeOre.get()) {
                if ((Ardite.isTempWhitelistGraniteArditeOre.get() && Ardite.temperatureBlacklistGraniteArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistGraniteArditeOre.get() && !Ardite.temperatureBlacklistGraniteArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistGraniteArditeOre.get() && Ardite.biomeBlacklistGraniteArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistGraniteArditeOre.get() && !Ardite.biomeBlacklistGraniteArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeGraniteArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkGraniteArditeOre.get(), Ardite.minHeightGraniteArditeOre.get(), 0, Ardite.maxHeightGraniteArditeOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Ardite.enableNetherrackArditeOre.get()) {
                if ((Ardite.isTempWhitelistNetherrackArditeOre.get() && Ardite.temperatureBlacklistNetherrackArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistNetherrackArditeOre.get() && !Ardite.temperatureBlacklistNetherrackArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistNetherrackArditeOre.get() && Ardite.biomeBlacklistNetherrackArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistNetherrackArditeOre.get() && !Ardite.biomeBlacklistNetherrackArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeNetherrackArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkNetherrackArditeOre.get(), Ardite.minHeightNetherrackArditeOre.get(), 0, Ardite.maxHeightNetherrackArditeOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Ardite.enableEndStoneArditeOre.get()) {
                if ((Ardite.isTempWhitelistEndStoneArditeOre.get() && Ardite.temperatureBlacklistEndStoneArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistEndStoneArditeOre.get() && !Ardite.temperatureBlacklistEndStoneArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistEndStoneArditeOre.get() && Ardite.biomeBlacklistEndStoneArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistEndStoneArditeOre.get() && !Ardite.biomeBlacklistEndStoneArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeEndStoneArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkEndStoneArditeOre.get(), Ardite.minHeightEndStoneArditeOre.get(), 0, Ardite.maxHeightEndStoneArditeOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Ardite.enableSandArditeOre.get()) {
                if ((Ardite.isTempWhitelistSandArditeOre.get() && Ardite.temperatureBlacklistSandArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistSandArditeOre.get() && !Ardite.temperatureBlacklistSandArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistSandArditeOre.get() && Ardite.biomeBlacklistSandArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistSandArditeOre.get() && !Ardite.biomeBlacklistSandArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeSandArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkSandArditeOre.get(), Ardite.minHeightSandArditeOre.get(), 0, Ardite.maxHeightSandArditeOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Ardite.enableRedSandArditeOre.get()) {
                if ((Ardite.isTempWhitelistRedSandArditeOre.get() && Ardite.temperatureBlacklistRedSandArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistRedSandArditeOre.get() && !Ardite.temperatureBlacklistRedSandArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistRedSandArditeOre.get() && Ardite.biomeBlacklistRedSandArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistRedSandArditeOre.get() && !Ardite.biomeBlacklistRedSandArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeRedSandArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkRedSandArditeOre.get(), Ardite.minHeightRedSandArditeOre.get(), 0, Ardite.maxHeightRedSandArditeOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Ardite.enableGravelArditeOre.get()) {
                if ((Ardite.isTempWhitelistGravelArditeOre.get() && Ardite.temperatureBlacklistGravelArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistGravelArditeOre.get() && !Ardite.temperatureBlacklistGravelArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistGravelArditeOre.get() && Ardite.biomeBlacklistGravelArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistGravelArditeOre.get() && !Ardite.biomeBlacklistGravelArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeGravelArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkGravelArditeOre.get(), Ardite.minHeightGravelArditeOre.get(), 0, Ardite.maxHeightGravelArditeOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Ardite.enableSandstoneArditeOre.get()) {
                if ((Ardite.isTempWhitelistSandstoneArditeOre.get() && Ardite.temperatureBlacklistSandstoneArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistSandstoneArditeOre.get() && !Ardite.temperatureBlacklistSandstoneArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistSandstoneArditeOre.get() && Ardite.biomeBlacklistSandstoneArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistSandstoneArditeOre.get() && !Ardite.biomeBlacklistSandstoneArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeSandstoneArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkSandstoneArditeOre.get(), Ardite.minHeightSandstoneArditeOre.get(), 0, Ardite.maxHeightSandstoneArditeOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Ardite.enableRedSandstoneArditeOre.get()) {
                if ((Ardite.isTempWhitelistRedSandstoneArditeOre.get() && Ardite.temperatureBlacklistRedSandstoneArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistRedSandstoneArditeOre.get() && !Ardite.temperatureBlacklistRedSandstoneArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistRedSandstoneArditeOre.get() && Ardite.biomeBlacklistRedSandstoneArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistRedSandstoneArditeOre.get() && !Ardite.biomeBlacklistRedSandstoneArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeRedSandstoneArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkRedSandstoneArditeOre.get(), Ardite.minHeightRedSandstoneArditeOre.get(), 0, Ardite.maxHeightRedSandstoneArditeOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Ardite.enableBlueIceArditeOre.get()) {
                if ((Ardite.isTempWhitelistBlueIceArditeOre.get() && Ardite.temperatureBlacklistBlueIceArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistBlueIceArditeOre.get() && !Ardite.temperatureBlacklistBlueIceArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistBlueIceArditeOre.get() && Ardite.biomeBlacklistBlueIceArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistBlueIceArditeOre.get() && !Ardite.biomeBlacklistBlueIceArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeBlueIceArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkBlueIceArditeOre.get(), Ardite.minHeightBlueIceArditeOre.get(), 0, Ardite.maxHeightBlueIceArditeOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Ardite.enablePackedIceArditeOre.get()) {
                if ((Ardite.isTempWhitelistPackedIceArditeOre.get() && Ardite.temperatureBlacklistPackedIceArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistPackedIceArditeOre.get() && !Ardite.temperatureBlacklistPackedIceArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistPackedIceArditeOre.get() && Ardite.biomeBlacklistPackedIceArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistPackedIceArditeOre.get() && !Ardite.biomeBlacklistPackedIceArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizePackedIceArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkPackedIceArditeOre.get(), Ardite.minHeightPackedIceArditeOre.get(), 0, Ardite.maxHeightPackedIceArditeOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Ardite.enableBedrockArditeOre.get()) {
                if ((Ardite.isTempWhitelistBedrockArditeOre.get() && Ardite.temperatureBlacklistBedrockArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistBedrockArditeOre.get() && !Ardite.temperatureBlacklistBedrockArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistBedrockArditeOre.get() && Ardite.biomeBlacklistBedrockArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistBedrockArditeOre.get() && !Ardite.biomeBlacklistBedrockArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeBedrockArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkBedrockArditeOre.get(), Ardite.minHeightBedrockArditeOre.get(), 0, Ardite.maxHeightBedrockArditeOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Ardite.enableQuarkBasaltArditeOre.get()) {
                if ((Ardite.isTempWhitelistQuarkBasaltArditeOre.get() && Ardite.temperatureBlacklistQuarkBasaltArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistQuarkBasaltArditeOre.get() && !Ardite.temperatureBlacklistQuarkBasaltArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistQuarkBasaltArditeOre.get() && Ardite.biomeBlacklistQuarkBasaltArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistQuarkBasaltArditeOre.get() && !Ardite.biomeBlacklistQuarkBasaltArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeQuarkBasaltArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkQuarkBasaltArditeOre.get(), Ardite.minHeightQuarkBasaltArditeOre.get(), 0, Ardite.maxHeightQuarkBasaltArditeOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Ardite.enableQuarkMarbleArditeOre.get()) {
                if ((Ardite.isTempWhitelistQuarkMarbleArditeOre.get() && Ardite.temperatureBlacklistQuarkMarbleArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistQuarkMarbleArditeOre.get() && !Ardite.temperatureBlacklistQuarkMarbleArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistQuarkMarbleArditeOre.get() && Ardite.biomeBlacklistQuarkMarbleArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistQuarkMarbleArditeOre.get() && !Ardite.biomeBlacklistQuarkMarbleArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeQuarkMarbleArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkQuarkMarbleArditeOre.get(), Ardite.minHeightQuarkMarbleArditeOre.get(), 0, Ardite.maxHeightQuarkMarbleArditeOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Ardite.enableQuarkSlateArditeOre.get()) {
                if ((Ardite.isTempWhitelistQuarkSlateArditeOre.get() && Ardite.temperatureBlacklistQuarkSlateArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistQuarkSlateArditeOre.get() && !Ardite.temperatureBlacklistQuarkSlateArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistQuarkSlateArditeOre.get() && Ardite.biomeBlacklistQuarkSlateArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistQuarkSlateArditeOre.get() && !Ardite.biomeBlacklistQuarkSlateArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeQuarkSlateArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkQuarkSlateArditeOre.get(), Ardite.minHeightQuarkSlateArditeOre.get(), 0, Ardite.maxHeightQuarkSlateArditeOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Ardite.enableQuarkLimestoneArditeOre.get()) {
                if ((Ardite.isTempWhitelistQuarkLimestoneArditeOre.get() && Ardite.temperatureBlacklistQuarkLimestoneArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistQuarkLimestoneArditeOre.get() && !Ardite.temperatureBlacklistQuarkLimestoneArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistQuarkLimestoneArditeOre.get() && Ardite.biomeBlacklistQuarkLimestoneArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistQuarkLimestoneArditeOre.get() && !Ardite.biomeBlacklistQuarkLimestoneArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeQuarkLimestoneArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkQuarkLimestoneArditeOre.get(), Ardite.minHeightQuarkLimestoneArditeOre.get(), 0, Ardite.maxHeightQuarkLimestoneArditeOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Ardite.enableQuarkJasperArditeOre.get()) {
                if ((Ardite.isTempWhitelistQuarkJasperArditeOre.get() && Ardite.temperatureBlacklistQuarkJasperArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistQuarkJasperArditeOre.get() && !Ardite.temperatureBlacklistQuarkJasperArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistQuarkJasperArditeOre.get() && Ardite.biomeBlacklistQuarkJasperArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistQuarkJasperArditeOre.get() && !Ardite.biomeBlacklistQuarkJasperArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeQuarkJasperArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkQuarkJasperArditeOre.get(), Ardite.minHeightQuarkJasperArditeOre.get(), 0, Ardite.maxHeightQuarkJasperArditeOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Ardite.enableEmbellishcraftBasaltArditeOre.get()) {
                if ((Ardite.isTempWhitelistEmbellishcraftBasaltArditeOre.get() && Ardite.temperatureBlacklistEmbellishcraftBasaltArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistEmbellishcraftBasaltArditeOre.get() && !Ardite.temperatureBlacklistEmbellishcraftBasaltArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistEmbellishcraftBasaltArditeOre.get() && Ardite.biomeBlacklistEmbellishcraftBasaltArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistEmbellishcraftBasaltArditeOre.get() && !Ardite.biomeBlacklistEmbellishcraftBasaltArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeEmbellishcraftBasaltArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkEmbellishcraftBasaltArditeOre.get(), Ardite.minHeightEmbellishcraftBasaltArditeOre.get(), 0, Ardite.maxHeightEmbellishcraftBasaltArditeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Ardite.enableEmbellishcraftGneissArditeOre.get()) {
                if ((Ardite.isTempWhitelistEmbellishcraftGneissArditeOre.get() && Ardite.temperatureBlacklistEmbellishcraftGneissArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistEmbellishcraftGneissArditeOre.get() && !Ardite.temperatureBlacklistEmbellishcraftGneissArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistEmbellishcraftGneissArditeOre.get() && Ardite.biomeBlacklistEmbellishcraftGneissArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistEmbellishcraftGneissArditeOre.get() && !Ardite.biomeBlacklistEmbellishcraftGneissArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeEmbellishcraftGneissArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkEmbellishcraftGneissArditeOre.get(), Ardite.minHeightEmbellishcraftGneissArditeOre.get(), 0, Ardite.maxHeightEmbellishcraftGneissArditeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Ardite.enableEmbellishcraftJadeArditeOre.get()) {
                if ((Ardite.isTempWhitelistEmbellishcraftJadeArditeOre.get() && Ardite.temperatureBlacklistEmbellishcraftJadeArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistEmbellishcraftJadeArditeOre.get() && !Ardite.temperatureBlacklistEmbellishcraftJadeArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistEmbellishcraftJadeArditeOre.get() && Ardite.biomeBlacklistEmbellishcraftJadeArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistEmbellishcraftJadeArditeOre.get() && !Ardite.biomeBlacklistEmbellishcraftJadeArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeEmbellishcraftJadeArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkEmbellishcraftJadeArditeOre.get(), Ardite.minHeightEmbellishcraftJadeArditeOre.get(), 0, Ardite.maxHeightEmbellishcraftJadeArditeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Ardite.enableEmbellishcraftLarvikiteArditeOre.get()) {
                if ((Ardite.isTempWhitelistEmbellishcraftLarvikiteArditeOre.get() && Ardite.temperatureBlacklistEmbellishcraftLarvikiteArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistEmbellishcraftLarvikiteArditeOre.get() && !Ardite.temperatureBlacklistEmbellishcraftLarvikiteArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistEmbellishcraftLarvikiteArditeOre.get() && Ardite.biomeBlacklistEmbellishcraftLarvikiteArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistEmbellishcraftLarvikiteArditeOre.get() && !Ardite.biomeBlacklistEmbellishcraftLarvikiteArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeEmbellishcraftLarvikiteArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkEmbellishcraftLarvikiteArditeOre.get(), Ardite.minHeightEmbellishcraftLarvikiteArditeOre.get(), 0, Ardite.maxHeightEmbellishcraftLarvikiteArditeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Ardite.enableEmbellishcraftMarbleArditeOre.get()) {
                if ((Ardite.isTempWhitelistEmbellishcraftMarbleArditeOre.get() && Ardite.temperatureBlacklistEmbellishcraftMarbleArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistEmbellishcraftMarbleArditeOre.get() && !Ardite.temperatureBlacklistEmbellishcraftMarbleArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistEmbellishcraftMarbleArditeOre.get() && Ardite.biomeBlacklistEmbellishcraftMarbleArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistEmbellishcraftMarbleArditeOre.get() && !Ardite.biomeBlacklistEmbellishcraftMarbleArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeEmbellishcraftMarbleArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkEmbellishcraftMarbleArditeOre.get(), Ardite.minHeightEmbellishcraftMarbleArditeOre.get(), 0, Ardite.maxHeightEmbellishcraftMarbleArditeOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Ardite.enableEmbellishcraftSlateArditeOre.get()) {
                if ((Ardite.isTempWhitelistEmbellishcraftSlateArditeOre.get() && Ardite.temperatureBlacklistEmbellishcraftSlateArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistEmbellishcraftSlateArditeOre.get() && !Ardite.temperatureBlacklistEmbellishcraftSlateArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistEmbellishcraftSlateArditeOre.get() && Ardite.biomeBlacklistEmbellishcraftSlateArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistEmbellishcraftSlateArditeOre.get() && !Ardite.biomeBlacklistEmbellishcraftSlateArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeEmbellishcraftSlateArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkEmbellishcraftSlateArditeOre.get(), Ardite.minHeightEmbellishcraftSlateArditeOre.get(), 0, Ardite.maxHeightEmbellishcraftSlateArditeOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Ardite.enableHardenedStoneArditeOre.get()) {
                if ((Ardite.isTempWhitelistHardenedStoneArditeOre.get() && Ardite.temperatureBlacklistHardenedStoneArditeOre.get().contains(biomeTS)) || (!Ardite.isTempWhitelistHardenedStoneArditeOre.get() && !Ardite.temperatureBlacklistHardenedStoneArditeOre.get().contains(biomeTS))) {
                    if ((Ardite.isBiomeWhitelistHardenedStoneArditeOre.get() && Ardite.biomeBlacklistHardenedStoneArditeOre.get().contains(biomeRNS)) || (!Ardite.isBiomeWhitelistHardenedStoneArditeOre.get() && !Ardite.biomeBlacklistHardenedStoneArditeOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_ARDITE_ORE.get().getDefaultState(), Ardite.veinSizeHardenedStoneArditeOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Ardite.veinsPerChunkHardenedStoneArditeOre.get(), Ardite.minHeightHardenedStoneArditeOre.get(), 0, Ardite.maxHeightHardenedStoneArditeOre.get()))));
                    } } } }
    }
}
