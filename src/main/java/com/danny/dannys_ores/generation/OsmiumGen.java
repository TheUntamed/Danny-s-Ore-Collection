package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Osmium;
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

public class OsmiumGen {
    public static void addOsmiumGen(Biome biome, String biomeRNS, String biomeTS) {
        addOsmiumOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addOsmiumOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Osmium.enableStoneOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistStoneOsmiumOre.get() && Osmium.temperatureBlacklistStoneOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistStoneOsmiumOre.get() && !Osmium.temperatureBlacklistStoneOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistStoneOsmiumOre.get() && Osmium.biomeBlacklistStoneOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistStoneOsmiumOre.get() && !Osmium.biomeBlacklistStoneOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeStoneOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkStoneOsmiumOre.get(), Osmium.minHeightStoneOsmiumOre.get(), 0, Osmium.maxHeightStoneOsmiumOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Osmium.enableAndesiteOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistAndesiteOsmiumOre.get() && Osmium.temperatureBlacklistAndesiteOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistAndesiteOsmiumOre.get() && !Osmium.temperatureBlacklistAndesiteOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistAndesiteOsmiumOre.get() && Osmium.biomeBlacklistAndesiteOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistAndesiteOsmiumOre.get() && !Osmium.biomeBlacklistAndesiteOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeAndesiteOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkAndesiteOsmiumOre.get(), Osmium.minHeightAndesiteOsmiumOre.get(), 0, Osmium.maxHeightAndesiteOsmiumOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Osmium.enableDioriteOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistDioriteOsmiumOre.get() && Osmium.temperatureBlacklistDioriteOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistDioriteOsmiumOre.get() && !Osmium.temperatureBlacklistDioriteOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistDioriteOsmiumOre.get() && Osmium.biomeBlacklistDioriteOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistDioriteOsmiumOre.get() && !Osmium.biomeBlacklistDioriteOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeDioriteOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkDioriteOsmiumOre.get(), Osmium.minHeightDioriteOsmiumOre.get(), 0, Osmium.maxHeightDioriteOsmiumOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Osmium.enableGraniteOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistGraniteOsmiumOre.get() && Osmium.temperatureBlacklistGraniteOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistGraniteOsmiumOre.get() && !Osmium.temperatureBlacklistGraniteOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistGraniteOsmiumOre.get() && Osmium.biomeBlacklistGraniteOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistGraniteOsmiumOre.get() && !Osmium.biomeBlacklistGraniteOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeGraniteOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkGraniteOsmiumOre.get(), Osmium.minHeightGraniteOsmiumOre.get(), 0, Osmium.maxHeightGraniteOsmiumOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Osmium.enableNetherrackOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistNetherrackOsmiumOre.get() && Osmium.temperatureBlacklistNetherrackOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistNetherrackOsmiumOre.get() && !Osmium.temperatureBlacklistNetherrackOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistNetherrackOsmiumOre.get() && Osmium.biomeBlacklistNetherrackOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistNetherrackOsmiumOre.get() && !Osmium.biomeBlacklistNetherrackOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeNetherrackOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkNetherrackOsmiumOre.get(), Osmium.minHeightNetherrackOsmiumOre.get(), 0, Osmium.maxHeightNetherrackOsmiumOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Osmium.enableEndStoneOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistEndStoneOsmiumOre.get() && Osmium.temperatureBlacklistEndStoneOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistEndStoneOsmiumOre.get() && !Osmium.temperatureBlacklistEndStoneOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistEndStoneOsmiumOre.get() && Osmium.biomeBlacklistEndStoneOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistEndStoneOsmiumOre.get() && !Osmium.biomeBlacklistEndStoneOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeEndStoneOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkEndStoneOsmiumOre.get(), Osmium.minHeightEndStoneOsmiumOre.get(), 0, Osmium.maxHeightEndStoneOsmiumOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Osmium.enableSandOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistSandOsmiumOre.get() && Osmium.temperatureBlacklistSandOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistSandOsmiumOre.get() && !Osmium.temperatureBlacklistSandOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistSandOsmiumOre.get() && Osmium.biomeBlacklistSandOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistSandOsmiumOre.get() && !Osmium.biomeBlacklistSandOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeSandOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkSandOsmiumOre.get(), Osmium.minHeightSandOsmiumOre.get(), 0, Osmium.maxHeightSandOsmiumOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Osmium.enableRedSandOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistRedSandOsmiumOre.get() && Osmium.temperatureBlacklistRedSandOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistRedSandOsmiumOre.get() && !Osmium.temperatureBlacklistRedSandOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistRedSandOsmiumOre.get() && Osmium.biomeBlacklistRedSandOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistRedSandOsmiumOre.get() && !Osmium.biomeBlacklistRedSandOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeRedSandOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkRedSandOsmiumOre.get(), Osmium.minHeightRedSandOsmiumOre.get(), 0, Osmium.maxHeightRedSandOsmiumOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Osmium.enableGravelOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistGravelOsmiumOre.get() && Osmium.temperatureBlacklistGravelOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistGravelOsmiumOre.get() && !Osmium.temperatureBlacklistGravelOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistGravelOsmiumOre.get() && Osmium.biomeBlacklistGravelOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistGravelOsmiumOre.get() && !Osmium.biomeBlacklistGravelOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeGravelOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkGravelOsmiumOre.get(), Osmium.minHeightGravelOsmiumOre.get(), 0, Osmium.maxHeightGravelOsmiumOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Osmium.enableSandstoneOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistSandstoneOsmiumOre.get() && Osmium.temperatureBlacklistSandstoneOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistSandstoneOsmiumOre.get() && !Osmium.temperatureBlacklistSandstoneOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistSandstoneOsmiumOre.get() && Osmium.biomeBlacklistSandstoneOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistSandstoneOsmiumOre.get() && !Osmium.biomeBlacklistSandstoneOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeSandstoneOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkSandstoneOsmiumOre.get(), Osmium.minHeightSandstoneOsmiumOre.get(), 0, Osmium.maxHeightSandstoneOsmiumOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Osmium.enableRedSandstoneOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistRedSandstoneOsmiumOre.get() && Osmium.temperatureBlacklistRedSandstoneOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistRedSandstoneOsmiumOre.get() && !Osmium.temperatureBlacklistRedSandstoneOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistRedSandstoneOsmiumOre.get() && Osmium.biomeBlacklistRedSandstoneOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistRedSandstoneOsmiumOre.get() && !Osmium.biomeBlacklistRedSandstoneOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeRedSandstoneOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkRedSandstoneOsmiumOre.get(), Osmium.minHeightRedSandstoneOsmiumOre.get(), 0, Osmium.maxHeightRedSandstoneOsmiumOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Osmium.enableBlueIceOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistBlueIceOsmiumOre.get() && Osmium.temperatureBlacklistBlueIceOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistBlueIceOsmiumOre.get() && !Osmium.temperatureBlacklistBlueIceOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistBlueIceOsmiumOre.get() && Osmium.biomeBlacklistBlueIceOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistBlueIceOsmiumOre.get() && !Osmium.biomeBlacklistBlueIceOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeBlueIceOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkBlueIceOsmiumOre.get(), Osmium.minHeightBlueIceOsmiumOre.get(), 0, Osmium.maxHeightBlueIceOsmiumOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Osmium.enablePackedIceOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistPackedIceOsmiumOre.get() && Osmium.temperatureBlacklistPackedIceOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistPackedIceOsmiumOre.get() && !Osmium.temperatureBlacklistPackedIceOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistPackedIceOsmiumOre.get() && Osmium.biomeBlacklistPackedIceOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistPackedIceOsmiumOre.get() && !Osmium.biomeBlacklistPackedIceOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizePackedIceOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkPackedIceOsmiumOre.get(), Osmium.minHeightPackedIceOsmiumOre.get(), 0, Osmium.maxHeightPackedIceOsmiumOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Osmium.enableBedrockOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistBedrockOsmiumOre.get() && Osmium.temperatureBlacklistBedrockOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistBedrockOsmiumOre.get() && !Osmium.temperatureBlacklistBedrockOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistBedrockOsmiumOre.get() && Osmium.biomeBlacklistBedrockOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistBedrockOsmiumOre.get() && !Osmium.biomeBlacklistBedrockOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeBedrockOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkBedrockOsmiumOre.get(), Osmium.minHeightBedrockOsmiumOre.get(), 0, Osmium.maxHeightBedrockOsmiumOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Osmium.enableQuarkBasaltOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistQuarkBasaltOsmiumOre.get() && Osmium.temperatureBlacklistQuarkBasaltOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistQuarkBasaltOsmiumOre.get() && !Osmium.temperatureBlacklistQuarkBasaltOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistQuarkBasaltOsmiumOre.get() && Osmium.biomeBlacklistQuarkBasaltOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistQuarkBasaltOsmiumOre.get() && !Osmium.biomeBlacklistQuarkBasaltOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeQuarkBasaltOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkQuarkBasaltOsmiumOre.get(), Osmium.minHeightQuarkBasaltOsmiumOre.get(), 0, Osmium.maxHeightQuarkBasaltOsmiumOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Osmium.enableQuarkMarbleOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistQuarkMarbleOsmiumOre.get() && Osmium.temperatureBlacklistQuarkMarbleOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistQuarkMarbleOsmiumOre.get() && !Osmium.temperatureBlacklistQuarkMarbleOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistQuarkMarbleOsmiumOre.get() && Osmium.biomeBlacklistQuarkMarbleOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistQuarkMarbleOsmiumOre.get() && !Osmium.biomeBlacklistQuarkMarbleOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeQuarkMarbleOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkQuarkMarbleOsmiumOre.get(), Osmium.minHeightQuarkMarbleOsmiumOre.get(), 0, Osmium.maxHeightQuarkMarbleOsmiumOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Osmium.enableQuarkSlateOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistQuarkSlateOsmiumOre.get() && Osmium.temperatureBlacklistQuarkSlateOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistQuarkSlateOsmiumOre.get() && !Osmium.temperatureBlacklistQuarkSlateOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistQuarkSlateOsmiumOre.get() && Osmium.biomeBlacklistQuarkSlateOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistQuarkSlateOsmiumOre.get() && !Osmium.biomeBlacklistQuarkSlateOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeQuarkSlateOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkQuarkSlateOsmiumOre.get(), Osmium.minHeightQuarkSlateOsmiumOre.get(), 0, Osmium.maxHeightQuarkSlateOsmiumOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Osmium.enableQuarkLimestoneOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistQuarkLimestoneOsmiumOre.get() && Osmium.temperatureBlacklistQuarkLimestoneOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistQuarkLimestoneOsmiumOre.get() && !Osmium.temperatureBlacklistQuarkLimestoneOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistQuarkLimestoneOsmiumOre.get() && Osmium.biomeBlacklistQuarkLimestoneOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistQuarkLimestoneOsmiumOre.get() && !Osmium.biomeBlacklistQuarkLimestoneOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeQuarkLimestoneOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkQuarkLimestoneOsmiumOre.get(), Osmium.minHeightQuarkLimestoneOsmiumOre.get(), 0, Osmium.maxHeightQuarkLimestoneOsmiumOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Osmium.enableQuarkJasperOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistQuarkJasperOsmiumOre.get() && Osmium.temperatureBlacklistQuarkJasperOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistQuarkJasperOsmiumOre.get() && !Osmium.temperatureBlacklistQuarkJasperOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistQuarkJasperOsmiumOre.get() && Osmium.biomeBlacklistQuarkJasperOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistQuarkJasperOsmiumOre.get() && !Osmium.biomeBlacklistQuarkJasperOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeQuarkJasperOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkQuarkJasperOsmiumOre.get(), Osmium.minHeightQuarkJasperOsmiumOre.get(), 0, Osmium.maxHeightQuarkJasperOsmiumOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Osmium.enableEmbellishcraftBasaltOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistEmbellishcraftBasaltOsmiumOre.get() && Osmium.temperatureBlacklistEmbellishcraftBasaltOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistEmbellishcraftBasaltOsmiumOre.get() && !Osmium.temperatureBlacklistEmbellishcraftBasaltOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistEmbellishcraftBasaltOsmiumOre.get() && Osmium.biomeBlacklistEmbellishcraftBasaltOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistEmbellishcraftBasaltOsmiumOre.get() && !Osmium.biomeBlacklistEmbellishcraftBasaltOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeEmbellishcraftBasaltOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkEmbellishcraftBasaltOsmiumOre.get(), Osmium.minHeightEmbellishcraftBasaltOsmiumOre.get(), 0, Osmium.maxHeightEmbellishcraftBasaltOsmiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Osmium.enableEmbellishcraftGneissOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistEmbellishcraftGneissOsmiumOre.get() && Osmium.temperatureBlacklistEmbellishcraftGneissOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistEmbellishcraftGneissOsmiumOre.get() && !Osmium.temperatureBlacklistEmbellishcraftGneissOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistEmbellishcraftGneissOsmiumOre.get() && Osmium.biomeBlacklistEmbellishcraftGneissOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistEmbellishcraftGneissOsmiumOre.get() && !Osmium.biomeBlacklistEmbellishcraftGneissOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeEmbellishcraftGneissOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkEmbellishcraftGneissOsmiumOre.get(), Osmium.minHeightEmbellishcraftGneissOsmiumOre.get(), 0, Osmium.maxHeightEmbellishcraftGneissOsmiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Osmium.enableEmbellishcraftJadeOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistEmbellishcraftJadeOsmiumOre.get() && Osmium.temperatureBlacklistEmbellishcraftJadeOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistEmbellishcraftJadeOsmiumOre.get() && !Osmium.temperatureBlacklistEmbellishcraftJadeOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistEmbellishcraftJadeOsmiumOre.get() && Osmium.biomeBlacklistEmbellishcraftJadeOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistEmbellishcraftJadeOsmiumOre.get() && !Osmium.biomeBlacklistEmbellishcraftJadeOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeEmbellishcraftJadeOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkEmbellishcraftJadeOsmiumOre.get(), Osmium.minHeightEmbellishcraftJadeOsmiumOre.get(), 0, Osmium.maxHeightEmbellishcraftJadeOsmiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Osmium.enableEmbellishcraftLarvikiteOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistEmbellishcraftLarvikiteOsmiumOre.get() && Osmium.temperatureBlacklistEmbellishcraftLarvikiteOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistEmbellishcraftLarvikiteOsmiumOre.get() && !Osmium.temperatureBlacklistEmbellishcraftLarvikiteOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistEmbellishcraftLarvikiteOsmiumOre.get() && Osmium.biomeBlacklistEmbellishcraftLarvikiteOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistEmbellishcraftLarvikiteOsmiumOre.get() && !Osmium.biomeBlacklistEmbellishcraftLarvikiteOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeEmbellishcraftLarvikiteOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkEmbellishcraftLarvikiteOsmiumOre.get(), Osmium.minHeightEmbellishcraftLarvikiteOsmiumOre.get(), 0, Osmium.maxHeightEmbellishcraftLarvikiteOsmiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Osmium.enableEmbellishcraftMarbleOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistEmbellishcraftMarbleOsmiumOre.get() && Osmium.temperatureBlacklistEmbellishcraftMarbleOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistEmbellishcraftMarbleOsmiumOre.get() && !Osmium.temperatureBlacklistEmbellishcraftMarbleOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistEmbellishcraftMarbleOsmiumOre.get() && Osmium.biomeBlacklistEmbellishcraftMarbleOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistEmbellishcraftMarbleOsmiumOre.get() && !Osmium.biomeBlacklistEmbellishcraftMarbleOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeEmbellishcraftMarbleOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkEmbellishcraftMarbleOsmiumOre.get(), Osmium.minHeightEmbellishcraftMarbleOsmiumOre.get(), 0, Osmium.maxHeightEmbellishcraftMarbleOsmiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Osmium.enableEmbellishcraftSlateOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistEmbellishcraftSlateOsmiumOre.get() && Osmium.temperatureBlacklistEmbellishcraftSlateOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistEmbellishcraftSlateOsmiumOre.get() && !Osmium.temperatureBlacklistEmbellishcraftSlateOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistEmbellishcraftSlateOsmiumOre.get() && Osmium.biomeBlacklistEmbellishcraftSlateOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistEmbellishcraftSlateOsmiumOre.get() && !Osmium.biomeBlacklistEmbellishcraftSlateOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeEmbellishcraftSlateOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkEmbellishcraftSlateOsmiumOre.get(), Osmium.minHeightEmbellishcraftSlateOsmiumOre.get(), 0, Osmium.maxHeightEmbellishcraftSlateOsmiumOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Osmium.enableHardenedStoneOsmiumOre.get()) {
                if ((Osmium.isTempWhitelistHardenedStoneOsmiumOre.get() && Osmium.temperatureBlacklistHardenedStoneOsmiumOre.get().contains(biomeTS)) || (!Osmium.isTempWhitelistHardenedStoneOsmiumOre.get() && !Osmium.temperatureBlacklistHardenedStoneOsmiumOre.get().contains(biomeTS))) {
                    if ((Osmium.isBiomeWhitelistHardenedStoneOsmiumOre.get() && Osmium.biomeBlacklistHardenedStoneOsmiumOre.get().contains(biomeRNS)) || (!Osmium.isBiomeWhitelistHardenedStoneOsmiumOre.get() && !Osmium.biomeBlacklistHardenedStoneOsmiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_OSMIUM_ORE.get().getDefaultState(), Osmium.veinSizeHardenedStoneOsmiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Osmium.veinsPerChunkHardenedStoneOsmiumOre.get(), Osmium.minHeightHardenedStoneOsmiumOre.get(), 0, Osmium.maxHeightHardenedStoneOsmiumOre.get()))));
                    } } } }
    }
}
