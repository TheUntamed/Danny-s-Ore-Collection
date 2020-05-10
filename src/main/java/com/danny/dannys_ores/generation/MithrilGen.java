package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Mithril;
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

public class MithrilGen {
    public static void addMithrilGen(Biome biome, String biomeRNS, String biomeTS) {
        addMithrilOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addMithrilOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Mithril.enableStoneMithrilOre.get()) {
                if ((Mithril.isTempWhitelistStoneMithrilOre.get() && Mithril.temperatureBlacklistStoneMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistStoneMithrilOre.get() && !Mithril.temperatureBlacklistStoneMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistStoneMithrilOre.get() && Mithril.biomeBlacklistStoneMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistStoneMithrilOre.get() && !Mithril.biomeBlacklistStoneMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeStoneMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkStoneMithrilOre.get(), Mithril.minHeightStoneMithrilOre.get(), 0, Mithril.maxHeightStoneMithrilOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Mithril.enableAndesiteMithrilOre.get()) {
                if ((Mithril.isTempWhitelistAndesiteMithrilOre.get() && Mithril.temperatureBlacklistAndesiteMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistAndesiteMithrilOre.get() && !Mithril.temperatureBlacklistAndesiteMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistAndesiteMithrilOre.get() && Mithril.biomeBlacklistAndesiteMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistAndesiteMithrilOre.get() && !Mithril.biomeBlacklistAndesiteMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeAndesiteMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkAndesiteMithrilOre.get(), Mithril.minHeightAndesiteMithrilOre.get(), 0, Mithril.maxHeightAndesiteMithrilOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Mithril.enableDioriteMithrilOre.get()) {
                if ((Mithril.isTempWhitelistDioriteMithrilOre.get() && Mithril.temperatureBlacklistDioriteMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistDioriteMithrilOre.get() && !Mithril.temperatureBlacklistDioriteMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistDioriteMithrilOre.get() && Mithril.biomeBlacklistDioriteMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistDioriteMithrilOre.get() && !Mithril.biomeBlacklistDioriteMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeDioriteMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkDioriteMithrilOre.get(), Mithril.minHeightDioriteMithrilOre.get(), 0, Mithril.maxHeightDioriteMithrilOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Mithril.enableGraniteMithrilOre.get()) {
                if ((Mithril.isTempWhitelistGraniteMithrilOre.get() && Mithril.temperatureBlacklistGraniteMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistGraniteMithrilOre.get() && !Mithril.temperatureBlacklistGraniteMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistGraniteMithrilOre.get() && Mithril.biomeBlacklistGraniteMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistGraniteMithrilOre.get() && !Mithril.biomeBlacklistGraniteMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeGraniteMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkGraniteMithrilOre.get(), Mithril.minHeightGraniteMithrilOre.get(), 0, Mithril.maxHeightGraniteMithrilOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Mithril.enableNetherrackMithrilOre.get()) {
                if ((Mithril.isTempWhitelistNetherrackMithrilOre.get() && Mithril.temperatureBlacklistNetherrackMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistNetherrackMithrilOre.get() && !Mithril.temperatureBlacklistNetherrackMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistNetherrackMithrilOre.get() && Mithril.biomeBlacklistNetherrackMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistNetherrackMithrilOre.get() && !Mithril.biomeBlacklistNetherrackMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeNetherrackMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkNetherrackMithrilOre.get(), Mithril.minHeightNetherrackMithrilOre.get(), 0, Mithril.maxHeightNetherrackMithrilOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Mithril.enableEndStoneMithrilOre.get()) {
                if ((Mithril.isTempWhitelistEndStoneMithrilOre.get() && Mithril.temperatureBlacklistEndStoneMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistEndStoneMithrilOre.get() && !Mithril.temperatureBlacklistEndStoneMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistEndStoneMithrilOre.get() && Mithril.biomeBlacklistEndStoneMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistEndStoneMithrilOre.get() && !Mithril.biomeBlacklistEndStoneMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeEndStoneMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkEndStoneMithrilOre.get(), Mithril.minHeightEndStoneMithrilOre.get(), 0, Mithril.maxHeightEndStoneMithrilOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Mithril.enableSandMithrilOre.get()) {
                if ((Mithril.isTempWhitelistSandMithrilOre.get() && Mithril.temperatureBlacklistSandMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistSandMithrilOre.get() && !Mithril.temperatureBlacklistSandMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistSandMithrilOre.get() && Mithril.biomeBlacklistSandMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistSandMithrilOre.get() && !Mithril.biomeBlacklistSandMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeSandMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkSandMithrilOre.get(), Mithril.minHeightSandMithrilOre.get(), 0, Mithril.maxHeightSandMithrilOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Mithril.enableRedSandMithrilOre.get()) {
                if ((Mithril.isTempWhitelistRedSandMithrilOre.get() && Mithril.temperatureBlacklistRedSandMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistRedSandMithrilOre.get() && !Mithril.temperatureBlacklistRedSandMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistRedSandMithrilOre.get() && Mithril.biomeBlacklistRedSandMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistRedSandMithrilOre.get() && !Mithril.biomeBlacklistRedSandMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeRedSandMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkRedSandMithrilOre.get(), Mithril.minHeightRedSandMithrilOre.get(), 0, Mithril.maxHeightRedSandMithrilOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Mithril.enableGravelMithrilOre.get()) {
                if ((Mithril.isTempWhitelistGravelMithrilOre.get() && Mithril.temperatureBlacklistGravelMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistGravelMithrilOre.get() && !Mithril.temperatureBlacklistGravelMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistGravelMithrilOre.get() && Mithril.biomeBlacklistGravelMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistGravelMithrilOre.get() && !Mithril.biomeBlacklistGravelMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeGravelMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkGravelMithrilOre.get(), Mithril.minHeightGravelMithrilOre.get(), 0, Mithril.maxHeightGravelMithrilOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Mithril.enableSandstoneMithrilOre.get()) {
                if ((Mithril.isTempWhitelistSandstoneMithrilOre.get() && Mithril.temperatureBlacklistSandstoneMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistSandstoneMithrilOre.get() && !Mithril.temperatureBlacklistSandstoneMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistSandstoneMithrilOre.get() && Mithril.biomeBlacklistSandstoneMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistSandstoneMithrilOre.get() && !Mithril.biomeBlacklistSandstoneMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeSandstoneMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkSandstoneMithrilOre.get(), Mithril.minHeightSandstoneMithrilOre.get(), 0, Mithril.maxHeightSandstoneMithrilOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Mithril.enableRedSandstoneMithrilOre.get()) {
                if ((Mithril.isTempWhitelistRedSandstoneMithrilOre.get() && Mithril.temperatureBlacklistRedSandstoneMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistRedSandstoneMithrilOre.get() && !Mithril.temperatureBlacklistRedSandstoneMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistRedSandstoneMithrilOre.get() && Mithril.biomeBlacklistRedSandstoneMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistRedSandstoneMithrilOre.get() && !Mithril.biomeBlacklistRedSandstoneMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeRedSandstoneMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkRedSandstoneMithrilOre.get(), Mithril.minHeightRedSandstoneMithrilOre.get(), 0, Mithril.maxHeightRedSandstoneMithrilOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Mithril.enableBlueIceMithrilOre.get()) {
                if ((Mithril.isTempWhitelistBlueIceMithrilOre.get() && Mithril.temperatureBlacklistBlueIceMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistBlueIceMithrilOre.get() && !Mithril.temperatureBlacklistBlueIceMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistBlueIceMithrilOre.get() && Mithril.biomeBlacklistBlueIceMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistBlueIceMithrilOre.get() && !Mithril.biomeBlacklistBlueIceMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeBlueIceMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkBlueIceMithrilOre.get(), Mithril.minHeightBlueIceMithrilOre.get(), 0, Mithril.maxHeightBlueIceMithrilOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Mithril.enablePackedIceMithrilOre.get()) {
                if ((Mithril.isTempWhitelistPackedIceMithrilOre.get() && Mithril.temperatureBlacklistPackedIceMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistPackedIceMithrilOre.get() && !Mithril.temperatureBlacklistPackedIceMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistPackedIceMithrilOre.get() && Mithril.biomeBlacklistPackedIceMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistPackedIceMithrilOre.get() && !Mithril.biomeBlacklistPackedIceMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizePackedIceMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkPackedIceMithrilOre.get(), Mithril.minHeightPackedIceMithrilOre.get(), 0, Mithril.maxHeightPackedIceMithrilOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Mithril.enableBedrockMithrilOre.get()) {
                if ((Mithril.isTempWhitelistBedrockMithrilOre.get() && Mithril.temperatureBlacklistBedrockMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistBedrockMithrilOre.get() && !Mithril.temperatureBlacklistBedrockMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistBedrockMithrilOre.get() && Mithril.biomeBlacklistBedrockMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistBedrockMithrilOre.get() && !Mithril.biomeBlacklistBedrockMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeBedrockMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkBedrockMithrilOre.get(), Mithril.minHeightBedrockMithrilOre.get(), 0, Mithril.maxHeightBedrockMithrilOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Mithril.enableQuarkBasaltMithrilOre.get()) {
                if ((Mithril.isTempWhitelistQuarkBasaltMithrilOre.get() && Mithril.temperatureBlacklistQuarkBasaltMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistQuarkBasaltMithrilOre.get() && !Mithril.temperatureBlacklistQuarkBasaltMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistQuarkBasaltMithrilOre.get() && Mithril.biomeBlacklistQuarkBasaltMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistQuarkBasaltMithrilOre.get() && !Mithril.biomeBlacklistQuarkBasaltMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeQuarkBasaltMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkQuarkBasaltMithrilOre.get(), Mithril.minHeightQuarkBasaltMithrilOre.get(), 0, Mithril.maxHeightQuarkBasaltMithrilOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Mithril.enableQuarkMarbleMithrilOre.get()) {
                if ((Mithril.isTempWhitelistQuarkMarbleMithrilOre.get() && Mithril.temperatureBlacklistQuarkMarbleMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistQuarkMarbleMithrilOre.get() && !Mithril.temperatureBlacklistQuarkMarbleMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistQuarkMarbleMithrilOre.get() && Mithril.biomeBlacklistQuarkMarbleMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistQuarkMarbleMithrilOre.get() && !Mithril.biomeBlacklistQuarkMarbleMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeQuarkMarbleMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkQuarkMarbleMithrilOre.get(), Mithril.minHeightQuarkMarbleMithrilOre.get(), 0, Mithril.maxHeightQuarkMarbleMithrilOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Mithril.enableQuarkSlateMithrilOre.get()) {
                if ((Mithril.isTempWhitelistQuarkSlateMithrilOre.get() && Mithril.temperatureBlacklistQuarkSlateMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistQuarkSlateMithrilOre.get() && !Mithril.temperatureBlacklistQuarkSlateMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistQuarkSlateMithrilOre.get() && Mithril.biomeBlacklistQuarkSlateMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistQuarkSlateMithrilOre.get() && !Mithril.biomeBlacklistQuarkSlateMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeQuarkSlateMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkQuarkSlateMithrilOre.get(), Mithril.minHeightQuarkSlateMithrilOre.get(), 0, Mithril.maxHeightQuarkSlateMithrilOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Mithril.enableQuarkLimestoneMithrilOre.get()) {
                if ((Mithril.isTempWhitelistQuarkLimestoneMithrilOre.get() && Mithril.temperatureBlacklistQuarkLimestoneMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistQuarkLimestoneMithrilOre.get() && !Mithril.temperatureBlacklistQuarkLimestoneMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistQuarkLimestoneMithrilOre.get() && Mithril.biomeBlacklistQuarkLimestoneMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistQuarkLimestoneMithrilOre.get() && !Mithril.biomeBlacklistQuarkLimestoneMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeQuarkLimestoneMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkQuarkLimestoneMithrilOre.get(), Mithril.minHeightQuarkLimestoneMithrilOre.get(), 0, Mithril.maxHeightQuarkLimestoneMithrilOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Mithril.enableQuarkJasperMithrilOre.get()) {
                if ((Mithril.isTempWhitelistQuarkJasperMithrilOre.get() && Mithril.temperatureBlacklistQuarkJasperMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistQuarkJasperMithrilOre.get() && !Mithril.temperatureBlacklistQuarkJasperMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistQuarkJasperMithrilOre.get() && Mithril.biomeBlacklistQuarkJasperMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistQuarkJasperMithrilOre.get() && !Mithril.biomeBlacklistQuarkJasperMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeQuarkJasperMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkQuarkJasperMithrilOre.get(), Mithril.minHeightQuarkJasperMithrilOre.get(), 0, Mithril.maxHeightQuarkJasperMithrilOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Mithril.enableEmbellishcraftBasaltMithrilOre.get()) {
                if ((Mithril.isTempWhitelistEmbellishcraftBasaltMithrilOre.get() && Mithril.temperatureBlacklistEmbellishcraftBasaltMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistEmbellishcraftBasaltMithrilOre.get() && !Mithril.temperatureBlacklistEmbellishcraftBasaltMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistEmbellishcraftBasaltMithrilOre.get() && Mithril.biomeBlacklistEmbellishcraftBasaltMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistEmbellishcraftBasaltMithrilOre.get() && !Mithril.biomeBlacklistEmbellishcraftBasaltMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeEmbellishcraftBasaltMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkEmbellishcraftBasaltMithrilOre.get(), Mithril.minHeightEmbellishcraftBasaltMithrilOre.get(), 0, Mithril.maxHeightEmbellishcraftBasaltMithrilOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Mithril.enableEmbellishcraftGneissMithrilOre.get()) {
                if ((Mithril.isTempWhitelistEmbellishcraftGneissMithrilOre.get() && Mithril.temperatureBlacklistEmbellishcraftGneissMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistEmbellishcraftGneissMithrilOre.get() && !Mithril.temperatureBlacklistEmbellishcraftGneissMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistEmbellishcraftGneissMithrilOre.get() && Mithril.biomeBlacklistEmbellishcraftGneissMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistEmbellishcraftGneissMithrilOre.get() && !Mithril.biomeBlacklistEmbellishcraftGneissMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeEmbellishcraftGneissMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkEmbellishcraftGneissMithrilOre.get(), Mithril.minHeightEmbellishcraftGneissMithrilOre.get(), 0, Mithril.maxHeightEmbellishcraftGneissMithrilOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Mithril.enableEmbellishcraftJadeMithrilOre.get()) {
                if ((Mithril.isTempWhitelistEmbellishcraftJadeMithrilOre.get() && Mithril.temperatureBlacklistEmbellishcraftJadeMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistEmbellishcraftJadeMithrilOre.get() && !Mithril.temperatureBlacklistEmbellishcraftJadeMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistEmbellishcraftJadeMithrilOre.get() && Mithril.biomeBlacklistEmbellishcraftJadeMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistEmbellishcraftJadeMithrilOre.get() && !Mithril.biomeBlacklistEmbellishcraftJadeMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeEmbellishcraftJadeMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkEmbellishcraftJadeMithrilOre.get(), Mithril.minHeightEmbellishcraftJadeMithrilOre.get(), 0, Mithril.maxHeightEmbellishcraftJadeMithrilOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Mithril.enableEmbellishcraftLarvikiteMithrilOre.get()) {
                if ((Mithril.isTempWhitelistEmbellishcraftLarvikiteMithrilOre.get() && Mithril.temperatureBlacklistEmbellishcraftLarvikiteMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistEmbellishcraftLarvikiteMithrilOre.get() && !Mithril.temperatureBlacklistEmbellishcraftLarvikiteMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistEmbellishcraftLarvikiteMithrilOre.get() && Mithril.biomeBlacklistEmbellishcraftLarvikiteMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistEmbellishcraftLarvikiteMithrilOre.get() && !Mithril.biomeBlacklistEmbellishcraftLarvikiteMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeEmbellishcraftLarvikiteMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkEmbellishcraftLarvikiteMithrilOre.get(), Mithril.minHeightEmbellishcraftLarvikiteMithrilOre.get(), 0, Mithril.maxHeightEmbellishcraftLarvikiteMithrilOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Mithril.enableEmbellishcraftMarbleMithrilOre.get()) {
                if ((Mithril.isTempWhitelistEmbellishcraftMarbleMithrilOre.get() && Mithril.temperatureBlacklistEmbellishcraftMarbleMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistEmbellishcraftMarbleMithrilOre.get() && !Mithril.temperatureBlacklistEmbellishcraftMarbleMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistEmbellishcraftMarbleMithrilOre.get() && Mithril.biomeBlacklistEmbellishcraftMarbleMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistEmbellishcraftMarbleMithrilOre.get() && !Mithril.biomeBlacklistEmbellishcraftMarbleMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeEmbellishcraftMarbleMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkEmbellishcraftMarbleMithrilOre.get(), Mithril.minHeightEmbellishcraftMarbleMithrilOre.get(), 0, Mithril.maxHeightEmbellishcraftMarbleMithrilOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Mithril.enableEmbellishcraftSlateMithrilOre.get()) {
                if ((Mithril.isTempWhitelistEmbellishcraftSlateMithrilOre.get() && Mithril.temperatureBlacklistEmbellishcraftSlateMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistEmbellishcraftSlateMithrilOre.get() && !Mithril.temperatureBlacklistEmbellishcraftSlateMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistEmbellishcraftSlateMithrilOre.get() && Mithril.biomeBlacklistEmbellishcraftSlateMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistEmbellishcraftSlateMithrilOre.get() && !Mithril.biomeBlacklistEmbellishcraftSlateMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeEmbellishcraftSlateMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkEmbellishcraftSlateMithrilOre.get(), Mithril.minHeightEmbellishcraftSlateMithrilOre.get(), 0, Mithril.maxHeightEmbellishcraftSlateMithrilOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Mithril.enableHardenedStoneMithrilOre.get()) {
                if ((Mithril.isTempWhitelistHardenedStoneMithrilOre.get() && Mithril.temperatureBlacklistHardenedStoneMithrilOre.get().contains(biomeTS)) || (!Mithril.isTempWhitelistHardenedStoneMithrilOre.get() && !Mithril.temperatureBlacklistHardenedStoneMithrilOre.get().contains(biomeTS))) {
                    if ((Mithril.isBiomeWhitelistHardenedStoneMithrilOre.get() && Mithril.biomeBlacklistHardenedStoneMithrilOre.get().contains(biomeRNS)) || (!Mithril.isBiomeWhitelistHardenedStoneMithrilOre.get() && !Mithril.biomeBlacklistHardenedStoneMithrilOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_MITHRIL_ORE.get().getDefaultState(), Mithril.veinSizeHardenedStoneMithrilOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Mithril.veinsPerChunkHardenedStoneMithrilOre.get(), Mithril.minHeightHardenedStoneMithrilOre.get(), 0, Mithril.maxHeightHardenedStoneMithrilOre.get()))));
                    } } } }
    }
}
