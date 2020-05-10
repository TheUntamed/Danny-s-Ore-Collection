package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Diamond;
import com.danny.dannys_ores.configs.Diamond;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class DiamondGen {

    public static void addDiamondGen(Biome biome, String biomeRNS, String biomeTS) {
        addDiamondOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addDiamondOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Diamond.enableVanillaDiamondOre.get()) {
                if ((Diamond.isTempWhitelistVanillaDiamondOre.get() && Diamond.temperatureBlacklistVanillaDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistVanillaDiamondOre.get() && !Diamond.temperatureBlacklistVanillaDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistVanillaDiamondOre.get() && Diamond.biomeBlacklistVanillaDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistVanillaDiamondOre.get() && !Diamond.biomeBlacklistVanillaDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.DIAMOND_ORE.getDefaultState(), Diamond.veinSizeVanillaDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkVanillaDiamondOre.get(), Diamond.minHeightVanillaDiamondOre.get(), 0, Diamond.maxHeightVanillaDiamondOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Diamond.enableAndesiteDiamondOre.get()) {
                if ((Diamond.isTempWhitelistAndesiteDiamondOre.get() && Diamond.temperatureBlacklistAndesiteDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistAndesiteDiamondOre.get() && !Diamond.temperatureBlacklistAndesiteDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistAndesiteDiamondOre.get() && Diamond.biomeBlacklistAndesiteDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistAndesiteDiamondOre.get() && !Diamond.biomeBlacklistAndesiteDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeAndesiteDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkAndesiteDiamondOre.get(), Diamond.minHeightAndesiteDiamondOre.get(), 0, Diamond.maxHeightAndesiteDiamondOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Diamond.enableDioriteDiamondOre.get()) {
                if ((Diamond.isTempWhitelistDioriteDiamondOre.get() && Diamond.temperatureBlacklistDioriteDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistDioriteDiamondOre.get() && !Diamond.temperatureBlacklistDioriteDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistDioriteDiamondOre.get() && Diamond.biomeBlacklistDioriteDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistDioriteDiamondOre.get() && !Diamond.biomeBlacklistDioriteDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeDioriteDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkDioriteDiamondOre.get(), Diamond.minHeightDioriteDiamondOre.get(), 0, Diamond.maxHeightDioriteDiamondOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Diamond.enableGraniteDiamondOre.get()) {
                if ((Diamond.isTempWhitelistGraniteDiamondOre.get() && Diamond.temperatureBlacklistGraniteDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistGraniteDiamondOre.get() && !Diamond.temperatureBlacklistGraniteDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistGraniteDiamondOre.get() && Diamond.biomeBlacklistGraniteDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistGraniteDiamondOre.get() && !Diamond.biomeBlacklistGraniteDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeGraniteDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkGraniteDiamondOre.get(), Diamond.minHeightGraniteDiamondOre.get(), 0, Diamond.maxHeightGraniteDiamondOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Diamond.enableNetherrackDiamondOre.get()) {
                if ((Diamond.isTempWhitelistNetherrackDiamondOre.get() && Diamond.temperatureBlacklistNetherrackDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistNetherrackDiamondOre.get() && !Diamond.temperatureBlacklistNetherrackDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistNetherrackDiamondOre.get() && Diamond.biomeBlacklistNetherrackDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistNetherrackDiamondOre.get() && !Diamond.biomeBlacklistNetherrackDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeNetherrackDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkNetherrackDiamondOre.get(), Diamond.minHeightNetherrackDiamondOre.get(), 0, Diamond.maxHeightNetherrackDiamondOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Diamond.enableEndStoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEndStoneDiamondOre.get() && Diamond.temperatureBlacklistEndStoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEndStoneDiamondOre.get() && !Diamond.temperatureBlacklistEndStoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEndStoneDiamondOre.get() && Diamond.biomeBlacklistEndStoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEndStoneDiamondOre.get() && !Diamond.biomeBlacklistEndStoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEndStoneDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkEndStoneDiamondOre.get(), Diamond.minHeightEndStoneDiamondOre.get(), 0, Diamond.maxHeightEndStoneDiamondOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Diamond.enableSandDiamondOre.get()) {
                if ((Diamond.isTempWhitelistSandDiamondOre.get() && Diamond.temperatureBlacklistSandDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistSandDiamondOre.get() && !Diamond.temperatureBlacklistSandDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistSandDiamondOre.get() && Diamond.biomeBlacklistSandDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistSandDiamondOre.get() && !Diamond.biomeBlacklistSandDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeSandDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkSandDiamondOre.get(), Diamond.minHeightSandDiamondOre.get(), 0, Diamond.maxHeightSandDiamondOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Diamond.enableRedSandDiamondOre.get()) {
                if ((Diamond.isTempWhitelistRedSandDiamondOre.get() && Diamond.temperatureBlacklistRedSandDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistRedSandDiamondOre.get() && !Diamond.temperatureBlacklistRedSandDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistRedSandDiamondOre.get() && Diamond.biomeBlacklistRedSandDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistRedSandDiamondOre.get() && !Diamond.biomeBlacklistRedSandDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeRedSandDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkRedSandDiamondOre.get(), Diamond.minHeightRedSandDiamondOre.get(), 0, Diamond.maxHeightRedSandDiamondOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Diamond.enableGravelDiamondOre.get()) {
                if ((Diamond.isTempWhitelistGravelDiamondOre.get() && Diamond.temperatureBlacklistGravelDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistGravelDiamondOre.get() && !Diamond.temperatureBlacklistGravelDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistGravelDiamondOre.get() && Diamond.biomeBlacklistGravelDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistGravelDiamondOre.get() && !Diamond.biomeBlacklistGravelDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeGravelDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkGravelDiamondOre.get(), Diamond.minHeightGravelDiamondOre.get(), 0, Diamond.maxHeightGravelDiamondOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Diamond.enableSandstoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistSandstoneDiamondOre.get() && Diamond.temperatureBlacklistSandstoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistSandstoneDiamondOre.get() && !Diamond.temperatureBlacklistSandstoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistSandstoneDiamondOre.get() && Diamond.biomeBlacklistSandstoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistSandstoneDiamondOre.get() && !Diamond.biomeBlacklistSandstoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeSandstoneDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkSandstoneDiamondOre.get(), Diamond.minHeightSandstoneDiamondOre.get(), 0, Diamond.maxHeightSandstoneDiamondOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Diamond.enableRedSandstoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistRedSandstoneDiamondOre.get() && Diamond.temperatureBlacklistRedSandstoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistRedSandstoneDiamondOre.get() && !Diamond.temperatureBlacklistRedSandstoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistRedSandstoneDiamondOre.get() && Diamond.biomeBlacklistRedSandstoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistRedSandstoneDiamondOre.get() && !Diamond.biomeBlacklistRedSandstoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeRedSandstoneDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkRedSandstoneDiamondOre.get(), Diamond.minHeightRedSandstoneDiamondOre.get(), 0, Diamond.maxHeightRedSandstoneDiamondOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Diamond.enableBlueIceDiamondOre.get()) {
                if ((Diamond.isTempWhitelistBlueIceDiamondOre.get() && Diamond.temperatureBlacklistBlueIceDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistBlueIceDiamondOre.get() && !Diamond.temperatureBlacklistBlueIceDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistBlueIceDiamondOre.get() && Diamond.biomeBlacklistBlueIceDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistBlueIceDiamondOre.get() && !Diamond.biomeBlacklistBlueIceDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeBlueIceDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkBlueIceDiamondOre.get(), Diamond.minHeightBlueIceDiamondOre.get(), 0, Diamond.maxHeightBlueIceDiamondOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Diamond.enablePackedIceDiamondOre.get()) {
                if ((Diamond.isTempWhitelistPackedIceDiamondOre.get() && Diamond.temperatureBlacklistPackedIceDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistPackedIceDiamondOre.get() && !Diamond.temperatureBlacklistPackedIceDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistPackedIceDiamondOre.get() && Diamond.biomeBlacklistPackedIceDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistPackedIceDiamondOre.get() && !Diamond.biomeBlacklistPackedIceDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizePackedIceDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkPackedIceDiamondOre.get(), Diamond.minHeightPackedIceDiamondOre.get(), 0, Diamond.maxHeightPackedIceDiamondOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Diamond.enableBedrockDiamondOre.get()) {
                if ((Diamond.isTempWhitelistBedrockDiamondOre.get() && Diamond.temperatureBlacklistBedrockDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistBedrockDiamondOre.get() && !Diamond.temperatureBlacklistBedrockDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistBedrockDiamondOre.get() && Diamond.biomeBlacklistBedrockDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistBedrockDiamondOre.get() && !Diamond.biomeBlacklistBedrockDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeBedrockDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkBedrockDiamondOre.get(), Diamond.minHeightBedrockDiamondOre.get(), 0, Diamond.maxHeightBedrockDiamondOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Diamond.enableQuarkBasaltDiamondOre.get()) {
                if ((Diamond.isTempWhitelistQuarkBasaltDiamondOre.get() && Diamond.temperatureBlacklistQuarkBasaltDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistQuarkBasaltDiamondOre.get() && !Diamond.temperatureBlacklistQuarkBasaltDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistQuarkBasaltDiamondOre.get() && Diamond.biomeBlacklistQuarkBasaltDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistQuarkBasaltDiamondOre.get() && !Diamond.biomeBlacklistQuarkBasaltDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeQuarkBasaltDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkQuarkBasaltDiamondOre.get(), Diamond.minHeightQuarkBasaltDiamondOre.get(), 0, Diamond.maxHeightQuarkBasaltDiamondOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Diamond.enableQuarkMarbleDiamondOre.get()) {
                if ((Diamond.isTempWhitelistQuarkMarbleDiamondOre.get() && Diamond.temperatureBlacklistQuarkMarbleDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistQuarkMarbleDiamondOre.get() && !Diamond.temperatureBlacklistQuarkMarbleDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistQuarkMarbleDiamondOre.get() && Diamond.biomeBlacklistQuarkMarbleDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistQuarkMarbleDiamondOre.get() && !Diamond.biomeBlacklistQuarkMarbleDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeQuarkMarbleDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkQuarkMarbleDiamondOre.get(), Diamond.minHeightQuarkMarbleDiamondOre.get(), 0, Diamond.maxHeightQuarkMarbleDiamondOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Diamond.enableQuarkSlateDiamondOre.get()) {
                if ((Diamond.isTempWhitelistQuarkSlateDiamondOre.get() && Diamond.temperatureBlacklistQuarkSlateDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistQuarkSlateDiamondOre.get() && !Diamond.temperatureBlacklistQuarkSlateDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistQuarkSlateDiamondOre.get() && Diamond.biomeBlacklistQuarkSlateDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistQuarkSlateDiamondOre.get() && !Diamond.biomeBlacklistQuarkSlateDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeQuarkSlateDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkQuarkSlateDiamondOre.get(), Diamond.minHeightQuarkSlateDiamondOre.get(), 0, Diamond.maxHeightQuarkSlateDiamondOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Diamond.enableQuarkLimestoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistQuarkLimestoneDiamondOre.get() && Diamond.temperatureBlacklistQuarkLimestoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistQuarkLimestoneDiamondOre.get() && !Diamond.temperatureBlacklistQuarkLimestoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistQuarkLimestoneDiamondOre.get() && Diamond.biomeBlacklistQuarkLimestoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistQuarkLimestoneDiamondOre.get() && !Diamond.biomeBlacklistQuarkLimestoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeQuarkLimestoneDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkQuarkLimestoneDiamondOre.get(), Diamond.minHeightQuarkLimestoneDiamondOre.get(), 0, Diamond.maxHeightQuarkLimestoneDiamondOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Diamond.enableQuarkJasperDiamondOre.get()) {
                if ((Diamond.isTempWhitelistQuarkJasperDiamondOre.get() && Diamond.temperatureBlacklistQuarkJasperDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistQuarkJasperDiamondOre.get() && !Diamond.temperatureBlacklistQuarkJasperDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistQuarkJasperDiamondOre.get() && Diamond.biomeBlacklistQuarkJasperDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistQuarkJasperDiamondOre.get() && !Diamond.biomeBlacklistQuarkJasperDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeQuarkJasperDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkQuarkJasperDiamondOre.get(), Diamond.minHeightQuarkJasperDiamondOre.get(), 0, Diamond.maxHeightQuarkJasperDiamondOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Diamond.enableEmbellishcraftBasaltDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEmbellishcraftBasaltDiamondOre.get() && Diamond.temperatureBlacklistEmbellishcraftBasaltDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEmbellishcraftBasaltDiamondOre.get() && !Diamond.temperatureBlacklistEmbellishcraftBasaltDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEmbellishcraftBasaltDiamondOre.get() && Diamond.biomeBlacklistEmbellishcraftBasaltDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEmbellishcraftBasaltDiamondOre.get() && !Diamond.biomeBlacklistEmbellishcraftBasaltDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEmbellishcraftBasaltDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkEmbellishcraftBasaltDiamondOre.get(), Diamond.minHeightEmbellishcraftBasaltDiamondOre.get(), 0, Diamond.maxHeightEmbellishcraftBasaltDiamondOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Diamond.enableEmbellishcraftGneissDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEmbellishcraftGneissDiamondOre.get() && Diamond.temperatureBlacklistEmbellishcraftGneissDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEmbellishcraftGneissDiamondOre.get() && !Diamond.temperatureBlacklistEmbellishcraftGneissDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEmbellishcraftGneissDiamondOre.get() && Diamond.biomeBlacklistEmbellishcraftGneissDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEmbellishcraftGneissDiamondOre.get() && !Diamond.biomeBlacklistEmbellishcraftGneissDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEmbellishcraftGneissDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkEmbellishcraftGneissDiamondOre.get(), Diamond.minHeightEmbellishcraftGneissDiamondOre.get(), 0, Diamond.maxHeightEmbellishcraftGneissDiamondOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Diamond.enableEmbellishcraftJadeDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEmbellishcraftJadeDiamondOre.get() && Diamond.temperatureBlacklistEmbellishcraftJadeDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEmbellishcraftJadeDiamondOre.get() && !Diamond.temperatureBlacklistEmbellishcraftJadeDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEmbellishcraftJadeDiamondOre.get() && Diamond.biomeBlacklistEmbellishcraftJadeDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEmbellishcraftJadeDiamondOre.get() && !Diamond.biomeBlacklistEmbellishcraftJadeDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEmbellishcraftJadeDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkEmbellishcraftJadeDiamondOre.get(), Diamond.minHeightEmbellishcraftJadeDiamondOre.get(), 0, Diamond.maxHeightEmbellishcraftJadeDiamondOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Diamond.enableEmbellishcraftLarvikiteDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEmbellishcraftLarvikiteDiamondOre.get() && Diamond.temperatureBlacklistEmbellishcraftLarvikiteDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEmbellishcraftLarvikiteDiamondOre.get() && !Diamond.temperatureBlacklistEmbellishcraftLarvikiteDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEmbellishcraftLarvikiteDiamondOre.get() && Diamond.biomeBlacklistEmbellishcraftLarvikiteDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEmbellishcraftLarvikiteDiamondOre.get() && !Diamond.biomeBlacklistEmbellishcraftLarvikiteDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEmbellishcraftLarvikiteDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkEmbellishcraftLarvikiteDiamondOre.get(), Diamond.minHeightEmbellishcraftLarvikiteDiamondOre.get(), 0, Diamond.maxHeightEmbellishcraftLarvikiteDiamondOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Diamond.enableEmbellishcraftMarbleDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEmbellishcraftMarbleDiamondOre.get() && Diamond.temperatureBlacklistEmbellishcraftMarbleDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEmbellishcraftMarbleDiamondOre.get() && !Diamond.temperatureBlacklistEmbellishcraftMarbleDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEmbellishcraftMarbleDiamondOre.get() && Diamond.biomeBlacklistEmbellishcraftMarbleDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEmbellishcraftMarbleDiamondOre.get() && !Diamond.biomeBlacklistEmbellishcraftMarbleDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEmbellishcraftMarbleDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkEmbellishcraftMarbleDiamondOre.get(), Diamond.minHeightEmbellishcraftMarbleDiamondOre.get(), 0, Diamond.maxHeightEmbellishcraftMarbleDiamondOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Diamond.enableEmbellishcraftSlateDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEmbellishcraftSlateDiamondOre.get() && Diamond.temperatureBlacklistEmbellishcraftSlateDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEmbellishcraftSlateDiamondOre.get() && !Diamond.temperatureBlacklistEmbellishcraftSlateDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEmbellishcraftSlateDiamondOre.get() && Diamond.biomeBlacklistEmbellishcraftSlateDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEmbellishcraftSlateDiamondOre.get() && !Diamond.biomeBlacklistEmbellishcraftSlateDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEmbellishcraftSlateDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkEmbellishcraftSlateDiamondOre.get(), Diamond.minHeightEmbellishcraftSlateDiamondOre.get(), 0, Diamond.maxHeightEmbellishcraftSlateDiamondOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Diamond.enableHardenedStoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistHardenedStoneDiamondOre.get() && Diamond.temperatureBlacklistHardenedStoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistHardenedStoneDiamondOre.get() && !Diamond.temperatureBlacklistHardenedStoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistHardenedStoneDiamondOre.get() && Diamond.biomeBlacklistHardenedStoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistHardenedStoneDiamondOre.get() && !Diamond.biomeBlacklistHardenedStoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeHardenedStoneDiamondOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Diamond.veinsPerChunkHardenedStoneDiamondOre.get(), Diamond.minHeightHardenedStoneDiamondOre.get(), 0, Diamond.maxHeightHardenedStoneDiamondOre.get()))));
                    } } } }
    }
}
