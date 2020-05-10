package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Platinum;
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

public class PlatinumGen {
    public static void addPlatinumGen(Biome biome, String biomeRNS, String biomeTS) {
        addPlatinumOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addPlatinumOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Stone
        if (!General.disableStoneOreGeneration.get()) {
            if (Platinum.enableStonePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistStonePlatinumOre.get() && Platinum.temperatureBlacklistStonePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistStonePlatinumOre.get() && !Platinum.temperatureBlacklistStonePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistStonePlatinumOre.get() && Platinum.biomeBlacklistStonePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistStonePlatinumOre.get() && !Platinum.biomeBlacklistStonePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeStonePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkStonePlatinumOre.get(), Platinum.minHeightStonePlatinumOre.get(), 0, Platinum.maxHeightStonePlatinumOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Platinum.enableAndesitePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistAndesitePlatinumOre.get() && Platinum.temperatureBlacklistAndesitePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistAndesitePlatinumOre.get() && !Platinum.temperatureBlacklistAndesitePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistAndesitePlatinumOre.get() && Platinum.biomeBlacklistAndesitePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistAndesitePlatinumOre.get() && !Platinum.biomeBlacklistAndesitePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeAndesitePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkAndesitePlatinumOre.get(), Platinum.minHeightAndesitePlatinumOre.get(), 0, Platinum.maxHeightAndesitePlatinumOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Platinum.enableDioritePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistDioritePlatinumOre.get() && Platinum.temperatureBlacklistDioritePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistDioritePlatinumOre.get() && !Platinum.temperatureBlacklistDioritePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistDioritePlatinumOre.get() && Platinum.biomeBlacklistDioritePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistDioritePlatinumOre.get() && !Platinum.biomeBlacklistDioritePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeDioritePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkDioritePlatinumOre.get(), Platinum.minHeightDioritePlatinumOre.get(), 0, Platinum.maxHeightDioritePlatinumOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Platinum.enableGranitePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistGranitePlatinumOre.get() && Platinum.temperatureBlacklistGranitePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistGranitePlatinumOre.get() && !Platinum.temperatureBlacklistGranitePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistGranitePlatinumOre.get() && Platinum.biomeBlacklistGranitePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistGranitePlatinumOre.get() && !Platinum.biomeBlacklistGranitePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeGranitePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkGranitePlatinumOre.get(), Platinum.minHeightGranitePlatinumOre.get(), 0, Platinum.maxHeightGranitePlatinumOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Platinum.enableNetherrackPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistNetherrackPlatinumOre.get() && Platinum.temperatureBlacklistNetherrackPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistNetherrackPlatinumOre.get() && !Platinum.temperatureBlacklistNetherrackPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistNetherrackPlatinumOre.get() && Platinum.biomeBlacklistNetherrackPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistNetherrackPlatinumOre.get() && !Platinum.biomeBlacklistNetherrackPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeNetherrackPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkNetherrackPlatinumOre.get(), Platinum.minHeightNetherrackPlatinumOre.get(), 0, Platinum.maxHeightNetherrackPlatinumOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Platinum.enableEndStonePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistEndStonePlatinumOre.get() && Platinum.temperatureBlacklistEndStonePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistEndStonePlatinumOre.get() && !Platinum.temperatureBlacklistEndStonePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistEndStonePlatinumOre.get() && Platinum.biomeBlacklistEndStonePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistEndStonePlatinumOre.get() && !Platinum.biomeBlacklistEndStonePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeEndStonePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkEndStonePlatinumOre.get(), Platinum.minHeightEndStonePlatinumOre.get(), 0, Platinum.maxHeightEndStonePlatinumOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Platinum.enableSandPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistSandPlatinumOre.get() && Platinum.temperatureBlacklistSandPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistSandPlatinumOre.get() && !Platinum.temperatureBlacklistSandPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistSandPlatinumOre.get() && Platinum.biomeBlacklistSandPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistSandPlatinumOre.get() && !Platinum.biomeBlacklistSandPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeSandPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkSandPlatinumOre.get(), Platinum.minHeightSandPlatinumOre.get(), 0, Platinum.maxHeightSandPlatinumOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Platinum.enableRedSandPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistRedSandPlatinumOre.get() && Platinum.temperatureBlacklistRedSandPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistRedSandPlatinumOre.get() && !Platinum.temperatureBlacklistRedSandPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistRedSandPlatinumOre.get() && Platinum.biomeBlacklistRedSandPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistRedSandPlatinumOre.get() && !Platinum.biomeBlacklistRedSandPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeRedSandPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkRedSandPlatinumOre.get(), Platinum.minHeightRedSandPlatinumOre.get(), 0, Platinum.maxHeightRedSandPlatinumOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Platinum.enableGravelPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistGravelPlatinumOre.get() && Platinum.temperatureBlacklistGravelPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistGravelPlatinumOre.get() && !Platinum.temperatureBlacklistGravelPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistGravelPlatinumOre.get() && Platinum.biomeBlacklistGravelPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistGravelPlatinumOre.get() && !Platinum.biomeBlacklistGravelPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeGravelPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkGravelPlatinumOre.get(), Platinum.minHeightGravelPlatinumOre.get(), 0, Platinum.maxHeightGravelPlatinumOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Platinum.enableSandstonePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistSandstonePlatinumOre.get() && Platinum.temperatureBlacklistSandstonePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistSandstonePlatinumOre.get() && !Platinum.temperatureBlacklistSandstonePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistSandstonePlatinumOre.get() && Platinum.biomeBlacklistSandstonePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistSandstonePlatinumOre.get() && !Platinum.biomeBlacklistSandstonePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeSandstonePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkSandstonePlatinumOre.get(), Platinum.minHeightSandstonePlatinumOre.get(), 0, Platinum.maxHeightSandstonePlatinumOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Platinum.enableRedSandstonePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistRedSandstonePlatinumOre.get() && Platinum.temperatureBlacklistRedSandstonePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistRedSandstonePlatinumOre.get() && !Platinum.temperatureBlacklistRedSandstonePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistRedSandstonePlatinumOre.get() && Platinum.biomeBlacklistRedSandstonePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistRedSandstonePlatinumOre.get() && !Platinum.biomeBlacklistRedSandstonePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeRedSandstonePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkRedSandstonePlatinumOre.get(), Platinum.minHeightRedSandstonePlatinumOre.get(), 0, Platinum.maxHeightRedSandstonePlatinumOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Platinum.enableBlueIcePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistBlueIcePlatinumOre.get() && Platinum.temperatureBlacklistBlueIcePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistBlueIcePlatinumOre.get() && !Platinum.temperatureBlacklistBlueIcePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistBlueIcePlatinumOre.get() && Platinum.biomeBlacklistBlueIcePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistBlueIcePlatinumOre.get() && !Platinum.biomeBlacklistBlueIcePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeBlueIcePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkBlueIcePlatinumOre.get(), Platinum.minHeightBlueIcePlatinumOre.get(), 0, Platinum.maxHeightBlueIcePlatinumOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Platinum.enablePackedIcePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistPackedIcePlatinumOre.get() && Platinum.temperatureBlacklistPackedIcePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistPackedIcePlatinumOre.get() && !Platinum.temperatureBlacklistPackedIcePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistPackedIcePlatinumOre.get() && Platinum.biomeBlacklistPackedIcePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistPackedIcePlatinumOre.get() && !Platinum.biomeBlacklistPackedIcePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizePackedIcePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkPackedIcePlatinumOre.get(), Platinum.minHeightPackedIcePlatinumOre.get(), 0, Platinum.maxHeightPackedIcePlatinumOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Platinum.enableBedrockPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistBedrockPlatinumOre.get() && Platinum.temperatureBlacklistBedrockPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistBedrockPlatinumOre.get() && !Platinum.temperatureBlacklistBedrockPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistBedrockPlatinumOre.get() && Platinum.biomeBlacklistBedrockPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistBedrockPlatinumOre.get() && !Platinum.biomeBlacklistBedrockPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeBedrockPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkBedrockPlatinumOre.get(), Platinum.minHeightBedrockPlatinumOre.get(), 0, Platinum.maxHeightBedrockPlatinumOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Platinum.enableQuarkBasaltPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistQuarkBasaltPlatinumOre.get() && Platinum.temperatureBlacklistQuarkBasaltPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistQuarkBasaltPlatinumOre.get() && !Platinum.temperatureBlacklistQuarkBasaltPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistQuarkBasaltPlatinumOre.get() && Platinum.biomeBlacklistQuarkBasaltPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistQuarkBasaltPlatinumOre.get() && !Platinum.biomeBlacklistQuarkBasaltPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeQuarkBasaltPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkQuarkBasaltPlatinumOre.get(), Platinum.minHeightQuarkBasaltPlatinumOre.get(), 0, Platinum.maxHeightQuarkBasaltPlatinumOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Platinum.enableQuarkMarblePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistQuarkMarblePlatinumOre.get() && Platinum.temperatureBlacklistQuarkMarblePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistQuarkMarblePlatinumOre.get() && !Platinum.temperatureBlacklistQuarkMarblePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistQuarkMarblePlatinumOre.get() && Platinum.biomeBlacklistQuarkMarblePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistQuarkMarblePlatinumOre.get() && !Platinum.biomeBlacklistQuarkMarblePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeQuarkMarblePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkQuarkMarblePlatinumOre.get(), Platinum.minHeightQuarkMarblePlatinumOre.get(), 0, Platinum.maxHeightQuarkMarblePlatinumOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Platinum.enableQuarkSlatePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistQuarkSlatePlatinumOre.get() && Platinum.temperatureBlacklistQuarkSlatePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistQuarkSlatePlatinumOre.get() && !Platinum.temperatureBlacklistQuarkSlatePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistQuarkSlatePlatinumOre.get() && Platinum.biomeBlacklistQuarkSlatePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistQuarkSlatePlatinumOre.get() && !Platinum.biomeBlacklistQuarkSlatePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeQuarkSlatePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkQuarkSlatePlatinumOre.get(), Platinum.minHeightQuarkSlatePlatinumOre.get(), 0, Platinum.maxHeightQuarkSlatePlatinumOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Platinum.enableQuarkLimestonePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistQuarkLimestonePlatinumOre.get() && Platinum.temperatureBlacklistQuarkLimestonePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistQuarkLimestonePlatinumOre.get() && !Platinum.temperatureBlacklistQuarkLimestonePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistQuarkLimestonePlatinumOre.get() && Platinum.biomeBlacklistQuarkLimestonePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistQuarkLimestonePlatinumOre.get() && !Platinum.biomeBlacklistQuarkLimestonePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeQuarkLimestonePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkQuarkLimestonePlatinumOre.get(), Platinum.minHeightQuarkLimestonePlatinumOre.get(), 0, Platinum.maxHeightQuarkLimestonePlatinumOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Platinum.enableQuarkJasperPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistQuarkJasperPlatinumOre.get() && Platinum.temperatureBlacklistQuarkJasperPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistQuarkJasperPlatinumOre.get() && !Platinum.temperatureBlacklistQuarkJasperPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistQuarkJasperPlatinumOre.get() && Platinum.biomeBlacklistQuarkJasperPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistQuarkJasperPlatinumOre.get() && !Platinum.biomeBlacklistQuarkJasperPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeQuarkJasperPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkQuarkJasperPlatinumOre.get(), Platinum.minHeightQuarkJasperPlatinumOre.get(), 0, Platinum.maxHeightQuarkJasperPlatinumOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Platinum.enableEmbellishcraftBasaltPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistEmbellishcraftBasaltPlatinumOre.get() && Platinum.temperatureBlacklistEmbellishcraftBasaltPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistEmbellishcraftBasaltPlatinumOre.get() && !Platinum.temperatureBlacklistEmbellishcraftBasaltPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistEmbellishcraftBasaltPlatinumOre.get() && Platinum.biomeBlacklistEmbellishcraftBasaltPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistEmbellishcraftBasaltPlatinumOre.get() && !Platinum.biomeBlacklistEmbellishcraftBasaltPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeEmbellishcraftBasaltPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkEmbellishcraftBasaltPlatinumOre.get(), Platinum.minHeightEmbellishcraftBasaltPlatinumOre.get(), 0, Platinum.maxHeightEmbellishcraftBasaltPlatinumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Platinum.enableEmbellishcraftGneissPlatinumOre.get()) {
                if ((Platinum.isTempWhitelistEmbellishcraftGneissPlatinumOre.get() && Platinum.temperatureBlacklistEmbellishcraftGneissPlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistEmbellishcraftGneissPlatinumOre.get() && !Platinum.temperatureBlacklistEmbellishcraftGneissPlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistEmbellishcraftGneissPlatinumOre.get() && Platinum.biomeBlacklistEmbellishcraftGneissPlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistEmbellishcraftGneissPlatinumOre.get() && !Platinum.biomeBlacklistEmbellishcraftGneissPlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeEmbellishcraftGneissPlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkEmbellishcraftGneissPlatinumOre.get(), Platinum.minHeightEmbellishcraftGneissPlatinumOre.get(), 0, Platinum.maxHeightEmbellishcraftGneissPlatinumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Platinum.enableEmbellishcraftJadePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistEmbellishcraftJadePlatinumOre.get() && Platinum.temperatureBlacklistEmbellishcraftJadePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistEmbellishcraftJadePlatinumOre.get() && !Platinum.temperatureBlacklistEmbellishcraftJadePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistEmbellishcraftJadePlatinumOre.get() && Platinum.biomeBlacklistEmbellishcraftJadePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistEmbellishcraftJadePlatinumOre.get() && !Platinum.biomeBlacklistEmbellishcraftJadePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeEmbellishcraftJadePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkEmbellishcraftJadePlatinumOre.get(), Platinum.minHeightEmbellishcraftJadePlatinumOre.get(), 0, Platinum.maxHeightEmbellishcraftJadePlatinumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Platinum.enableEmbellishcraftLarvikitePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistEmbellishcraftLarvikitePlatinumOre.get() && Platinum.temperatureBlacklistEmbellishcraftLarvikitePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistEmbellishcraftLarvikitePlatinumOre.get() && !Platinum.temperatureBlacklistEmbellishcraftLarvikitePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistEmbellishcraftLarvikitePlatinumOre.get() && Platinum.biomeBlacklistEmbellishcraftLarvikitePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistEmbellishcraftLarvikitePlatinumOre.get() && !Platinum.biomeBlacklistEmbellishcraftLarvikitePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeEmbellishcraftLarvikitePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkEmbellishcraftLarvikitePlatinumOre.get(), Platinum.minHeightEmbellishcraftLarvikitePlatinumOre.get(), 0, Platinum.maxHeightEmbellishcraftLarvikitePlatinumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Platinum.enableEmbellishcraftMarblePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistEmbellishcraftMarblePlatinumOre.get() && Platinum.temperatureBlacklistEmbellishcraftMarblePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistEmbellishcraftMarblePlatinumOre.get() && !Platinum.temperatureBlacklistEmbellishcraftMarblePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistEmbellishcraftMarblePlatinumOre.get() && Platinum.biomeBlacklistEmbellishcraftMarblePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistEmbellishcraftMarblePlatinumOre.get() && !Platinum.biomeBlacklistEmbellishcraftMarblePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeEmbellishcraftMarblePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkEmbellishcraftMarblePlatinumOre.get(), Platinum.minHeightEmbellishcraftMarblePlatinumOre.get(), 0, Platinum.maxHeightEmbellishcraftMarblePlatinumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Platinum.enableEmbellishcraftSlatePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistEmbellishcraftSlatePlatinumOre.get() && Platinum.temperatureBlacklistEmbellishcraftSlatePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistEmbellishcraftSlatePlatinumOre.get() && !Platinum.temperatureBlacklistEmbellishcraftSlatePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistEmbellishcraftSlatePlatinumOre.get() && Platinum.biomeBlacklistEmbellishcraftSlatePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistEmbellishcraftSlatePlatinumOre.get() && !Platinum.biomeBlacklistEmbellishcraftSlatePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeEmbellishcraftSlatePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkEmbellishcraftSlatePlatinumOre.get(), Platinum.minHeightEmbellishcraftSlatePlatinumOre.get(), 0, Platinum.maxHeightEmbellishcraftSlatePlatinumOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Platinum.enableHardenedStonePlatinumOre.get()) {
                if ((Platinum.isTempWhitelistHardenedStonePlatinumOre.get() && Platinum.temperatureBlacklistHardenedStonePlatinumOre.get().contains(biomeTS)) || (!Platinum.isTempWhitelistHardenedStonePlatinumOre.get() && !Platinum.temperatureBlacklistHardenedStonePlatinumOre.get().contains(biomeTS))) {
                    if ((Platinum.isBiomeWhitelistHardenedStonePlatinumOre.get() && Platinum.biomeBlacklistHardenedStonePlatinumOre.get().contains(biomeRNS)) || (!Platinum.isBiomeWhitelistHardenedStonePlatinumOre.get() && !Platinum.biomeBlacklistHardenedStonePlatinumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_PLATINUM_ORE.get().getDefaultState(), Platinum.veinSizeHardenedStonePlatinumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Platinum.veinsPerChunkHardenedStonePlatinumOre.get(), Platinum.minHeightHardenedStonePlatinumOre.get(), 0, Platinum.maxHeightHardenedStonePlatinumOre.get()))));
                    } } } }
    }
}
