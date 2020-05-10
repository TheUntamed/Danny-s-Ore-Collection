package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Lapis;
import com.danny.dannys_ores.configs.Lapis;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class LapisGen {

    public static void addLapisGen(Biome biome, String biomeRNS, String biomeTS) {
        addLapisOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addLapisOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Lapis.enableVanillaLapisOre.get()) {
                if ((Lapis.isTempWhitelistVanillaLapisOre.get() && Lapis.temperatureBlacklistVanillaLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistVanillaLapisOre.get() && !Lapis.temperatureBlacklistVanillaLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistVanillaLapisOre.get() && Lapis.biomeBlacklistVanillaLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistVanillaLapisOre.get() && !Lapis.biomeBlacklistVanillaLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.LAPIS_ORE.getDefaultState(), Lapis.veinSizeVanillaLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkVanillaLapisOre.get(), Lapis.minHeightVanillaLapisOre.get(), 0, Lapis.maxHeightVanillaLapisOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Lapis.enableAndesiteLapisOre.get()) {
                if ((Lapis.isTempWhitelistAndesiteLapisOre.get() && Lapis.temperatureBlacklistAndesiteLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistAndesiteLapisOre.get() && !Lapis.temperatureBlacklistAndesiteLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistAndesiteLapisOre.get() && Lapis.biomeBlacklistAndesiteLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistAndesiteLapisOre.get() && !Lapis.biomeBlacklistAndesiteLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeAndesiteLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkAndesiteLapisOre.get(), Lapis.minHeightAndesiteLapisOre.get(), 0, Lapis.maxHeightAndesiteLapisOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Lapis.enableDioriteLapisOre.get()) {
                if ((Lapis.isTempWhitelistDioriteLapisOre.get() && Lapis.temperatureBlacklistDioriteLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistDioriteLapisOre.get() && !Lapis.temperatureBlacklistDioriteLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistDioriteLapisOre.get() && Lapis.biomeBlacklistDioriteLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistDioriteLapisOre.get() && !Lapis.biomeBlacklistDioriteLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeDioriteLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkDioriteLapisOre.get(), Lapis.minHeightDioriteLapisOre.get(), 0, Lapis.maxHeightDioriteLapisOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Lapis.enableGraniteLapisOre.get()) {
                if ((Lapis.isTempWhitelistGraniteLapisOre.get() && Lapis.temperatureBlacklistGraniteLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistGraniteLapisOre.get() && !Lapis.temperatureBlacklistGraniteLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistGraniteLapisOre.get() && Lapis.biomeBlacklistGraniteLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistGraniteLapisOre.get() && !Lapis.biomeBlacklistGraniteLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeGraniteLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkGraniteLapisOre.get(), Lapis.minHeightGraniteLapisOre.get(), 0, Lapis.maxHeightGraniteLapisOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Lapis.enableNetherrackLapisOre.get()) {
                if ((Lapis.isTempWhitelistNetherrackLapisOre.get() && Lapis.temperatureBlacklistNetherrackLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistNetherrackLapisOre.get() && !Lapis.temperatureBlacklistNetherrackLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistNetherrackLapisOre.get() && Lapis.biomeBlacklistNetherrackLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistNetherrackLapisOre.get() && !Lapis.biomeBlacklistNetherrackLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeNetherrackLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkNetherrackLapisOre.get(), Lapis.minHeightNetherrackLapisOre.get(), 0, Lapis.maxHeightNetherrackLapisOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Lapis.enableEndStoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistEndStoneLapisOre.get() && Lapis.temperatureBlacklistEndStoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEndStoneLapisOre.get() && !Lapis.temperatureBlacklistEndStoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEndStoneLapisOre.get() && Lapis.biomeBlacklistEndStoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEndStoneLapisOre.get() && !Lapis.biomeBlacklistEndStoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEndStoneLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkEndStoneLapisOre.get(), Lapis.minHeightEndStoneLapisOre.get(), 0, Lapis.maxHeightEndStoneLapisOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Lapis.enableSandLapisOre.get()) {
                if ((Lapis.isTempWhitelistSandLapisOre.get() && Lapis.temperatureBlacklistSandLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistSandLapisOre.get() && !Lapis.temperatureBlacklistSandLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistSandLapisOre.get() && Lapis.biomeBlacklistSandLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistSandLapisOre.get() && !Lapis.biomeBlacklistSandLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeSandLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkSandLapisOre.get(), Lapis.minHeightSandLapisOre.get(), 0, Lapis.maxHeightSandLapisOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Lapis.enableRedSandLapisOre.get()) {
                if ((Lapis.isTempWhitelistRedSandLapisOre.get() && Lapis.temperatureBlacklistRedSandLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistRedSandLapisOre.get() && !Lapis.temperatureBlacklistRedSandLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistRedSandLapisOre.get() && Lapis.biomeBlacklistRedSandLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistRedSandLapisOre.get() && !Lapis.biomeBlacklistRedSandLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeRedSandLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkRedSandLapisOre.get(), Lapis.minHeightRedSandLapisOre.get(), 0, Lapis.maxHeightRedSandLapisOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Lapis.enableGravelLapisOre.get()) {
                if ((Lapis.isTempWhitelistGravelLapisOre.get() && Lapis.temperatureBlacklistGravelLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistGravelLapisOre.get() && !Lapis.temperatureBlacklistGravelLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistGravelLapisOre.get() && Lapis.biomeBlacklistGravelLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistGravelLapisOre.get() && !Lapis.biomeBlacklistGravelLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeGravelLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkGravelLapisOre.get(), Lapis.minHeightGravelLapisOre.get(), 0, Lapis.maxHeightGravelLapisOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Lapis.enableSandstoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistSandstoneLapisOre.get() && Lapis.temperatureBlacklistSandstoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistSandstoneLapisOre.get() && !Lapis.temperatureBlacklistSandstoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistSandstoneLapisOre.get() && Lapis.biomeBlacklistSandstoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistSandstoneLapisOre.get() && !Lapis.biomeBlacklistSandstoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeSandstoneLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkSandstoneLapisOre.get(), Lapis.minHeightSandstoneLapisOre.get(), 0, Lapis.maxHeightSandstoneLapisOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Lapis.enableRedSandstoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistRedSandstoneLapisOre.get() && Lapis.temperatureBlacklistRedSandstoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistRedSandstoneLapisOre.get() && !Lapis.temperatureBlacklistRedSandstoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistRedSandstoneLapisOre.get() && Lapis.biomeBlacklistRedSandstoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistRedSandstoneLapisOre.get() && !Lapis.biomeBlacklistRedSandstoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeRedSandstoneLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkRedSandstoneLapisOre.get(), Lapis.minHeightRedSandstoneLapisOre.get(), 0, Lapis.maxHeightRedSandstoneLapisOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Lapis.enableBlueIceLapisOre.get()) {
                if ((Lapis.isTempWhitelistBlueIceLapisOre.get() && Lapis.temperatureBlacklistBlueIceLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistBlueIceLapisOre.get() && !Lapis.temperatureBlacklistBlueIceLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistBlueIceLapisOre.get() && Lapis.biomeBlacklistBlueIceLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistBlueIceLapisOre.get() && !Lapis.biomeBlacklistBlueIceLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeBlueIceLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkBlueIceLapisOre.get(), Lapis.minHeightBlueIceLapisOre.get(), 0, Lapis.maxHeightBlueIceLapisOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Lapis.enablePackedIceLapisOre.get()) {
                if ((Lapis.isTempWhitelistPackedIceLapisOre.get() && Lapis.temperatureBlacklistPackedIceLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistPackedIceLapisOre.get() && !Lapis.temperatureBlacklistPackedIceLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistPackedIceLapisOre.get() && Lapis.biomeBlacklistPackedIceLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistPackedIceLapisOre.get() && !Lapis.biomeBlacklistPackedIceLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizePackedIceLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkPackedIceLapisOre.get(), Lapis.minHeightPackedIceLapisOre.get(), 0, Lapis.maxHeightPackedIceLapisOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Lapis.enableBedrockLapisOre.get()) {
                if ((Lapis.isTempWhitelistBedrockLapisOre.get() && Lapis.temperatureBlacklistBedrockLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistBedrockLapisOre.get() && !Lapis.temperatureBlacklistBedrockLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistBedrockLapisOre.get() && Lapis.biomeBlacklistBedrockLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistBedrockLapisOre.get() && !Lapis.biomeBlacklistBedrockLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeBedrockLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkBedrockLapisOre.get(), Lapis.minHeightBedrockLapisOre.get(), 0, Lapis.maxHeightBedrockLapisOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Lapis.enableQuarkBasaltLapisOre.get()) {
                if ((Lapis.isTempWhitelistQuarkBasaltLapisOre.get() && Lapis.temperatureBlacklistQuarkBasaltLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistQuarkBasaltLapisOre.get() && !Lapis.temperatureBlacklistQuarkBasaltLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistQuarkBasaltLapisOre.get() && Lapis.biomeBlacklistQuarkBasaltLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistQuarkBasaltLapisOre.get() && !Lapis.biomeBlacklistQuarkBasaltLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeQuarkBasaltLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkQuarkBasaltLapisOre.get(), Lapis.minHeightQuarkBasaltLapisOre.get(), 0, Lapis.maxHeightQuarkBasaltLapisOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Lapis.enableQuarkMarbleLapisOre.get()) {
                if ((Lapis.isTempWhitelistQuarkMarbleLapisOre.get() && Lapis.temperatureBlacklistQuarkMarbleLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistQuarkMarbleLapisOre.get() && !Lapis.temperatureBlacklistQuarkMarbleLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistQuarkMarbleLapisOre.get() && Lapis.biomeBlacklistQuarkMarbleLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistQuarkMarbleLapisOre.get() && !Lapis.biomeBlacklistQuarkMarbleLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeQuarkMarbleLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkQuarkMarbleLapisOre.get(), Lapis.minHeightQuarkMarbleLapisOre.get(), 0, Lapis.maxHeightQuarkMarbleLapisOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Lapis.enableQuarkSlateLapisOre.get()) {
                if ((Lapis.isTempWhitelistQuarkSlateLapisOre.get() && Lapis.temperatureBlacklistQuarkSlateLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistQuarkSlateLapisOre.get() && !Lapis.temperatureBlacklistQuarkSlateLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistQuarkSlateLapisOre.get() && Lapis.biomeBlacklistQuarkSlateLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistQuarkSlateLapisOre.get() && !Lapis.biomeBlacklistQuarkSlateLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeQuarkSlateLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkQuarkSlateLapisOre.get(), Lapis.minHeightQuarkSlateLapisOre.get(), 0, Lapis.maxHeightQuarkSlateLapisOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Lapis.enableQuarkLimestoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistQuarkLimestoneLapisOre.get() && Lapis.temperatureBlacklistQuarkLimestoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistQuarkLimestoneLapisOre.get() && !Lapis.temperatureBlacklistQuarkLimestoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistQuarkLimestoneLapisOre.get() && Lapis.biomeBlacklistQuarkLimestoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistQuarkLimestoneLapisOre.get() && !Lapis.biomeBlacklistQuarkLimestoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeQuarkLimestoneLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkQuarkLimestoneLapisOre.get(), Lapis.minHeightQuarkLimestoneLapisOre.get(), 0, Lapis.maxHeightQuarkLimestoneLapisOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Lapis.enableQuarkJasperLapisOre.get()) {
                if ((Lapis.isTempWhitelistQuarkJasperLapisOre.get() && Lapis.temperatureBlacklistQuarkJasperLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistQuarkJasperLapisOre.get() && !Lapis.temperatureBlacklistQuarkJasperLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistQuarkJasperLapisOre.get() && Lapis.biomeBlacklistQuarkJasperLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistQuarkJasperLapisOre.get() && !Lapis.biomeBlacklistQuarkJasperLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeQuarkJasperLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkQuarkJasperLapisOre.get(), Lapis.minHeightQuarkJasperLapisOre.get(), 0, Lapis.maxHeightQuarkJasperLapisOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Lapis.enableEmbellishcraftBasaltLapisOre.get()) {
                if ((Lapis.isTempWhitelistEmbellishcraftBasaltLapisOre.get() && Lapis.temperatureBlacklistEmbellishcraftBasaltLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEmbellishcraftBasaltLapisOre.get() && !Lapis.temperatureBlacklistEmbellishcraftBasaltLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEmbellishcraftBasaltLapisOre.get() && Lapis.biomeBlacklistEmbellishcraftBasaltLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEmbellishcraftBasaltLapisOre.get() && !Lapis.biomeBlacklistEmbellishcraftBasaltLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEmbellishcraftBasaltLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkEmbellishcraftBasaltLapisOre.get(), Lapis.minHeightEmbellishcraftBasaltLapisOre.get(), 0, Lapis.maxHeightEmbellishcraftBasaltLapisOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Lapis.enableEmbellishcraftGneissLapisOre.get()) {
                if ((Lapis.isTempWhitelistEmbellishcraftGneissLapisOre.get() && Lapis.temperatureBlacklistEmbellishcraftGneissLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEmbellishcraftGneissLapisOre.get() && !Lapis.temperatureBlacklistEmbellishcraftGneissLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEmbellishcraftGneissLapisOre.get() && Lapis.biomeBlacklistEmbellishcraftGneissLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEmbellishcraftGneissLapisOre.get() && !Lapis.biomeBlacklistEmbellishcraftGneissLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEmbellishcraftGneissLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkEmbellishcraftGneissLapisOre.get(), Lapis.minHeightEmbellishcraftGneissLapisOre.get(), 0, Lapis.maxHeightEmbellishcraftGneissLapisOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Lapis.enableEmbellishcraftJadeLapisOre.get()) {
                if ((Lapis.isTempWhitelistEmbellishcraftJadeLapisOre.get() && Lapis.temperatureBlacklistEmbellishcraftJadeLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEmbellishcraftJadeLapisOre.get() && !Lapis.temperatureBlacklistEmbellishcraftJadeLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEmbellishcraftJadeLapisOre.get() && Lapis.biomeBlacklistEmbellishcraftJadeLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEmbellishcraftJadeLapisOre.get() && !Lapis.biomeBlacklistEmbellishcraftJadeLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEmbellishcraftJadeLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkEmbellishcraftJadeLapisOre.get(), Lapis.minHeightEmbellishcraftJadeLapisOre.get(), 0, Lapis.maxHeightEmbellishcraftJadeLapisOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Lapis.enableEmbellishcraftLarvikiteLapisOre.get()) {
                if ((Lapis.isTempWhitelistEmbellishcraftLarvikiteLapisOre.get() && Lapis.temperatureBlacklistEmbellishcraftLarvikiteLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEmbellishcraftLarvikiteLapisOre.get() && !Lapis.temperatureBlacklistEmbellishcraftLarvikiteLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEmbellishcraftLarvikiteLapisOre.get() && Lapis.biomeBlacklistEmbellishcraftLarvikiteLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEmbellishcraftLarvikiteLapisOre.get() && !Lapis.biomeBlacklistEmbellishcraftLarvikiteLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEmbellishcraftLarvikiteLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkEmbellishcraftLarvikiteLapisOre.get(), Lapis.minHeightEmbellishcraftLarvikiteLapisOre.get(), 0, Lapis.maxHeightEmbellishcraftLarvikiteLapisOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Lapis.enableEmbellishcraftMarbleLapisOre.get()) {
                if ((Lapis.isTempWhitelistEmbellishcraftMarbleLapisOre.get() && Lapis.temperatureBlacklistEmbellishcraftMarbleLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEmbellishcraftMarbleLapisOre.get() && !Lapis.temperatureBlacklistEmbellishcraftMarbleLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEmbellishcraftMarbleLapisOre.get() && Lapis.biomeBlacklistEmbellishcraftMarbleLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEmbellishcraftMarbleLapisOre.get() && !Lapis.biomeBlacklistEmbellishcraftMarbleLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEmbellishcraftMarbleLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkEmbellishcraftMarbleLapisOre.get(), Lapis.minHeightEmbellishcraftMarbleLapisOre.get(), 0, Lapis.maxHeightEmbellishcraftMarbleLapisOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Lapis.enableEmbellishcraftSlateLapisOre.get()) {
                if ((Lapis.isTempWhitelistEmbellishcraftSlateLapisOre.get() && Lapis.temperatureBlacklistEmbellishcraftSlateLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEmbellishcraftSlateLapisOre.get() && !Lapis.temperatureBlacklistEmbellishcraftSlateLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEmbellishcraftSlateLapisOre.get() && Lapis.biomeBlacklistEmbellishcraftSlateLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEmbellishcraftSlateLapisOre.get() && !Lapis.biomeBlacklistEmbellishcraftSlateLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEmbellishcraftSlateLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkEmbellishcraftSlateLapisOre.get(), Lapis.minHeightEmbellishcraftSlateLapisOre.get(), 0, Lapis.maxHeightEmbellishcraftSlateLapisOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Lapis.enableHardenedStoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistHardenedStoneLapisOre.get() && Lapis.temperatureBlacklistHardenedStoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistHardenedStoneLapisOre.get() && !Lapis.temperatureBlacklistHardenedStoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistHardenedStoneLapisOre.get() && Lapis.biomeBlacklistHardenedStoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistHardenedStoneLapisOre.get() && !Lapis.biomeBlacklistHardenedStoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeHardenedStoneLapisOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Lapis.veinsPerChunkHardenedStoneLapisOre.get(), Lapis.minHeightHardenedStoneLapisOre.get(), 0, Lapis.maxHeightHardenedStoneLapisOre.get()))));
                    } } } }
    }
}
