package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Sulfur;
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

public class SulfurGen {

    public static void addSulfurGen(Biome biome, String biomeRNS, String biomeTS) {
        addSulfurOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addSulfurOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Sulfur.enableStoneSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistStoneSulfurOre.get() && Sulfur.temperatureBlacklistStoneSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistStoneSulfurOre.get() && !Sulfur.temperatureBlacklistStoneSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistStoneSulfurOre.get() && Sulfur.biomeBlacklistStoneSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistStoneSulfurOre.get() && !Sulfur.biomeBlacklistStoneSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeStoneSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkStoneSulfurOre.get(), Sulfur.minHeightStoneSulfurOre.get(), 0, Sulfur.maxHeightStoneSulfurOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Sulfur.enableAndesiteSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistAndesiteSulfurOre.get() && Sulfur.temperatureBlacklistAndesiteSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistAndesiteSulfurOre.get() && !Sulfur.temperatureBlacklistAndesiteSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistAndesiteSulfurOre.get() && Sulfur.biomeBlacklistAndesiteSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistAndesiteSulfurOre.get() && !Sulfur.biomeBlacklistAndesiteSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeAndesiteSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkAndesiteSulfurOre.get(), Sulfur.minHeightAndesiteSulfurOre.get(), 0, Sulfur.maxHeightAndesiteSulfurOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Sulfur.enableDioriteSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistDioriteSulfurOre.get() && Sulfur.temperatureBlacklistDioriteSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistDioriteSulfurOre.get() && !Sulfur.temperatureBlacklistDioriteSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistDioriteSulfurOre.get() && Sulfur.biomeBlacklistDioriteSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistDioriteSulfurOre.get() && !Sulfur.biomeBlacklistDioriteSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeDioriteSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkDioriteSulfurOre.get(), Sulfur.minHeightDioriteSulfurOre.get(), 0, Sulfur.maxHeightDioriteSulfurOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Sulfur.enableGraniteSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistGraniteSulfurOre.get() && Sulfur.temperatureBlacklistGraniteSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistGraniteSulfurOre.get() && !Sulfur.temperatureBlacklistGraniteSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistGraniteSulfurOre.get() && Sulfur.biomeBlacklistGraniteSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistGraniteSulfurOre.get() && !Sulfur.biomeBlacklistGraniteSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeGraniteSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkGraniteSulfurOre.get(), Sulfur.minHeightGraniteSulfurOre.get(), 0, Sulfur.maxHeightGraniteSulfurOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Sulfur.enableNetherrackSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistNetherrackSulfurOre.get() && Sulfur.temperatureBlacklistNetherrackSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistNetherrackSulfurOre.get() && !Sulfur.temperatureBlacklistNetherrackSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistNetherrackSulfurOre.get() && Sulfur.biomeBlacklistNetherrackSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistNetherrackSulfurOre.get() && !Sulfur.biomeBlacklistNetherrackSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeNetherrackSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkNetherrackSulfurOre.get(), Sulfur.minHeightNetherrackSulfurOre.get(), 0, Sulfur.maxHeightNetherrackSulfurOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Sulfur.enableEndStoneSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistEndStoneSulfurOre.get() && Sulfur.temperatureBlacklistEndStoneSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistEndStoneSulfurOre.get() && !Sulfur.temperatureBlacklistEndStoneSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistEndStoneSulfurOre.get() && Sulfur.biomeBlacklistEndStoneSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistEndStoneSulfurOre.get() && !Sulfur.biomeBlacklistEndStoneSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeEndStoneSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkEndStoneSulfurOre.get(), Sulfur.minHeightEndStoneSulfurOre.get(), 0, Sulfur.maxHeightEndStoneSulfurOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Sulfur.enableSandSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistSandSulfurOre.get() && Sulfur.temperatureBlacklistSandSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistSandSulfurOre.get() && !Sulfur.temperatureBlacklistSandSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistSandSulfurOre.get() && Sulfur.biomeBlacklistSandSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistSandSulfurOre.get() && !Sulfur.biomeBlacklistSandSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeSandSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkSandSulfurOre.get(), Sulfur.minHeightSandSulfurOre.get(), 0, Sulfur.maxHeightSandSulfurOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Sulfur.enableRedSandSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistRedSandSulfurOre.get() && Sulfur.temperatureBlacklistRedSandSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistRedSandSulfurOre.get() && !Sulfur.temperatureBlacklistRedSandSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistRedSandSulfurOre.get() && Sulfur.biomeBlacklistRedSandSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistRedSandSulfurOre.get() && !Sulfur.biomeBlacklistRedSandSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeRedSandSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkRedSandSulfurOre.get(), Sulfur.minHeightRedSandSulfurOre.get(), 0, Sulfur.maxHeightRedSandSulfurOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Sulfur.enableGravelSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistGravelSulfurOre.get() && Sulfur.temperatureBlacklistGravelSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistGravelSulfurOre.get() && !Sulfur.temperatureBlacklistGravelSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistGravelSulfurOre.get() && Sulfur.biomeBlacklistGravelSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistGravelSulfurOre.get() && !Sulfur.biomeBlacklistGravelSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeGravelSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkGravelSulfurOre.get(), Sulfur.minHeightGravelSulfurOre.get(), 0, Sulfur.maxHeightGravelSulfurOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Sulfur.enableSandstoneSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistSandstoneSulfurOre.get() && Sulfur.temperatureBlacklistSandstoneSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistSandstoneSulfurOre.get() && !Sulfur.temperatureBlacklistSandstoneSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistSandstoneSulfurOre.get() && Sulfur.biomeBlacklistSandstoneSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistSandstoneSulfurOre.get() && !Sulfur.biomeBlacklistSandstoneSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeSandstoneSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkSandstoneSulfurOre.get(), Sulfur.minHeightSandstoneSulfurOre.get(), 0, Sulfur.maxHeightSandstoneSulfurOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Sulfur.enableRedSandstoneSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistRedSandstoneSulfurOre.get() && Sulfur.temperatureBlacklistRedSandstoneSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistRedSandstoneSulfurOre.get() && !Sulfur.temperatureBlacklistRedSandstoneSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistRedSandstoneSulfurOre.get() && Sulfur.biomeBlacklistRedSandstoneSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistRedSandstoneSulfurOre.get() && !Sulfur.biomeBlacklistRedSandstoneSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeRedSandstoneSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkRedSandstoneSulfurOre.get(), Sulfur.minHeightRedSandstoneSulfurOre.get(), 0, Sulfur.maxHeightRedSandstoneSulfurOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Sulfur.enableBlueIceSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistBlueIceSulfurOre.get() && Sulfur.temperatureBlacklistBlueIceSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistBlueIceSulfurOre.get() && !Sulfur.temperatureBlacklistBlueIceSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistBlueIceSulfurOre.get() && Sulfur.biomeBlacklistBlueIceSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistBlueIceSulfurOre.get() && !Sulfur.biomeBlacklistBlueIceSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeBlueIceSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkBlueIceSulfurOre.get(), Sulfur.minHeightBlueIceSulfurOre.get(), 0, Sulfur.maxHeightBlueIceSulfurOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Sulfur.enablePackedIceSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistPackedIceSulfurOre.get() && Sulfur.temperatureBlacklistPackedIceSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistPackedIceSulfurOre.get() && !Sulfur.temperatureBlacklistPackedIceSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistPackedIceSulfurOre.get() && Sulfur.biomeBlacklistPackedIceSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistPackedIceSulfurOre.get() && !Sulfur.biomeBlacklistPackedIceSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizePackedIceSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkPackedIceSulfurOre.get(), Sulfur.minHeightPackedIceSulfurOre.get(), 0, Sulfur.maxHeightPackedIceSulfurOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Sulfur.enableBedrockSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistBedrockSulfurOre.get() && Sulfur.temperatureBlacklistBedrockSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistBedrockSulfurOre.get() && !Sulfur.temperatureBlacklistBedrockSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistBedrockSulfurOre.get() && Sulfur.biomeBlacklistBedrockSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistBedrockSulfurOre.get() && !Sulfur.biomeBlacklistBedrockSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeBedrockSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkBedrockSulfurOre.get(), Sulfur.minHeightBedrockSulfurOre.get(), 0, Sulfur.maxHeightBedrockSulfurOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Sulfur.enableQuarkBasaltSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistQuarkBasaltSulfurOre.get() && Sulfur.temperatureBlacklistQuarkBasaltSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistQuarkBasaltSulfurOre.get() && !Sulfur.temperatureBlacklistQuarkBasaltSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistQuarkBasaltSulfurOre.get() && Sulfur.biomeBlacklistQuarkBasaltSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistQuarkBasaltSulfurOre.get() && !Sulfur.biomeBlacklistQuarkBasaltSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeQuarkBasaltSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkQuarkBasaltSulfurOre.get(), Sulfur.minHeightQuarkBasaltSulfurOre.get(), 0, Sulfur.maxHeightQuarkBasaltSulfurOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Sulfur.enableQuarkMarbleSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistQuarkMarbleSulfurOre.get() && Sulfur.temperatureBlacklistQuarkMarbleSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistQuarkMarbleSulfurOre.get() && !Sulfur.temperatureBlacklistQuarkMarbleSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistQuarkMarbleSulfurOre.get() && Sulfur.biomeBlacklistQuarkMarbleSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistQuarkMarbleSulfurOre.get() && !Sulfur.biomeBlacklistQuarkMarbleSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeQuarkMarbleSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkQuarkMarbleSulfurOre.get(), Sulfur.minHeightQuarkMarbleSulfurOre.get(), 0, Sulfur.maxHeightQuarkMarbleSulfurOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Sulfur.enableQuarkSlateSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistQuarkSlateSulfurOre.get() && Sulfur.temperatureBlacklistQuarkSlateSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistQuarkSlateSulfurOre.get() && !Sulfur.temperatureBlacklistQuarkSlateSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistQuarkSlateSulfurOre.get() && Sulfur.biomeBlacklistQuarkSlateSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistQuarkSlateSulfurOre.get() && !Sulfur.biomeBlacklistQuarkSlateSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeQuarkSlateSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkQuarkSlateSulfurOre.get(), Sulfur.minHeightQuarkSlateSulfurOre.get(), 0, Sulfur.maxHeightQuarkSlateSulfurOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Sulfur.enableQuarkLimestoneSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistQuarkLimestoneSulfurOre.get() && Sulfur.temperatureBlacklistQuarkLimestoneSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistQuarkLimestoneSulfurOre.get() && !Sulfur.temperatureBlacklistQuarkLimestoneSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistQuarkLimestoneSulfurOre.get() && Sulfur.biomeBlacklistQuarkLimestoneSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistQuarkLimestoneSulfurOre.get() && !Sulfur.biomeBlacklistQuarkLimestoneSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeQuarkLimestoneSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkQuarkLimestoneSulfurOre.get(), Sulfur.minHeightQuarkLimestoneSulfurOre.get(), 0, Sulfur.maxHeightQuarkLimestoneSulfurOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Sulfur.enableQuarkJasperSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistQuarkJasperSulfurOre.get() && Sulfur.temperatureBlacklistQuarkJasperSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistQuarkJasperSulfurOre.get() && !Sulfur.temperatureBlacklistQuarkJasperSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistQuarkJasperSulfurOre.get() && Sulfur.biomeBlacklistQuarkJasperSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistQuarkJasperSulfurOre.get() && !Sulfur.biomeBlacklistQuarkJasperSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeQuarkJasperSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkQuarkJasperSulfurOre.get(), Sulfur.minHeightQuarkJasperSulfurOre.get(), 0, Sulfur.maxHeightQuarkJasperSulfurOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Sulfur.enableEmbellishcraftBasaltSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistEmbellishcraftBasaltSulfurOre.get() && Sulfur.temperatureBlacklistEmbellishcraftBasaltSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistEmbellishcraftBasaltSulfurOre.get() && !Sulfur.temperatureBlacklistEmbellishcraftBasaltSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistEmbellishcraftBasaltSulfurOre.get() && Sulfur.biomeBlacklistEmbellishcraftBasaltSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistEmbellishcraftBasaltSulfurOre.get() && !Sulfur.biomeBlacklistEmbellishcraftBasaltSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeEmbellishcraftBasaltSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkEmbellishcraftBasaltSulfurOre.get(), Sulfur.minHeightEmbellishcraftBasaltSulfurOre.get(), 0, Sulfur.maxHeightEmbellishcraftBasaltSulfurOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Sulfur.enableEmbellishcraftGneissSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistEmbellishcraftGneissSulfurOre.get() && Sulfur.temperatureBlacklistEmbellishcraftGneissSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistEmbellishcraftGneissSulfurOre.get() && !Sulfur.temperatureBlacklistEmbellishcraftGneissSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistEmbellishcraftGneissSulfurOre.get() && Sulfur.biomeBlacklistEmbellishcraftGneissSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistEmbellishcraftGneissSulfurOre.get() && !Sulfur.biomeBlacklistEmbellishcraftGneissSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeEmbellishcraftGneissSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkEmbellishcraftGneissSulfurOre.get(), Sulfur.minHeightEmbellishcraftGneissSulfurOre.get(), 0, Sulfur.maxHeightEmbellishcraftGneissSulfurOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Sulfur.enableEmbellishcraftJadeSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistEmbellishcraftJadeSulfurOre.get() && Sulfur.temperatureBlacklistEmbellishcraftJadeSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistEmbellishcraftJadeSulfurOre.get() && !Sulfur.temperatureBlacklistEmbellishcraftJadeSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistEmbellishcraftJadeSulfurOre.get() && Sulfur.biomeBlacklistEmbellishcraftJadeSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistEmbellishcraftJadeSulfurOre.get() && !Sulfur.biomeBlacklistEmbellishcraftJadeSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeEmbellishcraftJadeSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkEmbellishcraftJadeSulfurOre.get(), Sulfur.minHeightEmbellishcraftJadeSulfurOre.get(), 0, Sulfur.maxHeightEmbellishcraftJadeSulfurOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Sulfur.enableEmbellishcraftLarvikiteSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistEmbellishcraftLarvikiteSulfurOre.get() && Sulfur.temperatureBlacklistEmbellishcraftLarvikiteSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistEmbellishcraftLarvikiteSulfurOre.get() && !Sulfur.temperatureBlacklistEmbellishcraftLarvikiteSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistEmbellishcraftLarvikiteSulfurOre.get() && Sulfur.biomeBlacklistEmbellishcraftLarvikiteSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistEmbellishcraftLarvikiteSulfurOre.get() && !Sulfur.biomeBlacklistEmbellishcraftLarvikiteSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeEmbellishcraftLarvikiteSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkEmbellishcraftLarvikiteSulfurOre.get(), Sulfur.minHeightEmbellishcraftLarvikiteSulfurOre.get(), 0, Sulfur.maxHeightEmbellishcraftLarvikiteSulfurOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Sulfur.enableEmbellishcraftMarbleSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistEmbellishcraftMarbleSulfurOre.get() && Sulfur.temperatureBlacklistEmbellishcraftMarbleSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistEmbellishcraftMarbleSulfurOre.get() && !Sulfur.temperatureBlacklistEmbellishcraftMarbleSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistEmbellishcraftMarbleSulfurOre.get() && Sulfur.biomeBlacklistEmbellishcraftMarbleSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistEmbellishcraftMarbleSulfurOre.get() && !Sulfur.biomeBlacklistEmbellishcraftMarbleSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeEmbellishcraftMarbleSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkEmbellishcraftMarbleSulfurOre.get(), Sulfur.minHeightEmbellishcraftMarbleSulfurOre.get(), 0, Sulfur.maxHeightEmbellishcraftMarbleSulfurOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Sulfur.enableEmbellishcraftSlateSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistEmbellishcraftSlateSulfurOre.get() && Sulfur.temperatureBlacklistEmbellishcraftSlateSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistEmbellishcraftSlateSulfurOre.get() && !Sulfur.temperatureBlacklistEmbellishcraftSlateSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistEmbellishcraftSlateSulfurOre.get() && Sulfur.biomeBlacklistEmbellishcraftSlateSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistEmbellishcraftSlateSulfurOre.get() && !Sulfur.biomeBlacklistEmbellishcraftSlateSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeEmbellishcraftSlateSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkEmbellishcraftSlateSulfurOre.get(), Sulfur.minHeightEmbellishcraftSlateSulfurOre.get(), 0, Sulfur.maxHeightEmbellishcraftSlateSulfurOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Sulfur.enableHardenedStoneSulfurOre.get()) {
                if ((Sulfur.isTempWhitelistHardenedStoneSulfurOre.get() && Sulfur.temperatureBlacklistHardenedStoneSulfurOre.get().contains(biomeTS)) || (!Sulfur.isTempWhitelistHardenedStoneSulfurOre.get() && !Sulfur.temperatureBlacklistHardenedStoneSulfurOre.get().contains(biomeTS))) {
                    if ((Sulfur.isBiomeWhitelistHardenedStoneSulfurOre.get() && Sulfur.biomeBlacklistHardenedStoneSulfurOre.get().contains(biomeRNS)) || (!Sulfur.isBiomeWhitelistHardenedStoneSulfurOre.get() && !Sulfur.biomeBlacklistHardenedStoneSulfurOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_SULFUR_ORE.get().getDefaultState(), Sulfur.veinSizeHardenedStoneSulfurOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Sulfur.veinsPerChunkHardenedStoneSulfurOre.get(), Sulfur.minHeightHardenedStoneSulfurOre.get(), 0, Sulfur.maxHeightHardenedStoneSulfurOre.get()))));
                    } } } }
    }
}
