package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Nickel;
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

public class NickelGen {
    public static void addNickelGen(Biome biome, String biomeRNS, String biomeTS) {
        addNickelOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addNickelOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Nickel.enableStoneNickelOre.get()) {
                if ((Nickel.isTempWhitelistStoneNickelOre.get() && Nickel.temperatureBlacklistStoneNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistStoneNickelOre.get() && !Nickel.temperatureBlacklistStoneNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistStoneNickelOre.get() && Nickel.biomeBlacklistStoneNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistStoneNickelOre.get() && !Nickel.biomeBlacklistStoneNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeStoneNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkStoneNickelOre.get(), Nickel.minHeightStoneNickelOre.get(), 0, Nickel.maxHeightStoneNickelOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Nickel.enableAndesiteNickelOre.get()) {
                if ((Nickel.isTempWhitelistAndesiteNickelOre.get() && Nickel.temperatureBlacklistAndesiteNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistAndesiteNickelOre.get() && !Nickel.temperatureBlacklistAndesiteNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistAndesiteNickelOre.get() && Nickel.biomeBlacklistAndesiteNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistAndesiteNickelOre.get() && !Nickel.biomeBlacklistAndesiteNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeAndesiteNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkAndesiteNickelOre.get(), Nickel.minHeightAndesiteNickelOre.get(), 0, Nickel.maxHeightAndesiteNickelOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Nickel.enableDioriteNickelOre.get()) {
                if ((Nickel.isTempWhitelistDioriteNickelOre.get() && Nickel.temperatureBlacklistDioriteNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistDioriteNickelOre.get() && !Nickel.temperatureBlacklistDioriteNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistDioriteNickelOre.get() && Nickel.biomeBlacklistDioriteNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistDioriteNickelOre.get() && !Nickel.biomeBlacklistDioriteNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeDioriteNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkDioriteNickelOre.get(), Nickel.minHeightDioriteNickelOre.get(), 0, Nickel.maxHeightDioriteNickelOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Nickel.enableGraniteNickelOre.get()) {
                if ((Nickel.isTempWhitelistGraniteNickelOre.get() && Nickel.temperatureBlacklistGraniteNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistGraniteNickelOre.get() && !Nickel.temperatureBlacklistGraniteNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistGraniteNickelOre.get() && Nickel.biomeBlacklistGraniteNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistGraniteNickelOre.get() && !Nickel.biomeBlacklistGraniteNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeGraniteNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkGraniteNickelOre.get(), Nickel.minHeightGraniteNickelOre.get(), 0, Nickel.maxHeightGraniteNickelOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Nickel.enableNetherrackNickelOre.get()) {
                if ((Nickel.isTempWhitelistNetherrackNickelOre.get() && Nickel.temperatureBlacklistNetherrackNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistNetherrackNickelOre.get() && !Nickel.temperatureBlacklistNetherrackNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistNetherrackNickelOre.get() && Nickel.biomeBlacklistNetherrackNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistNetherrackNickelOre.get() && !Nickel.biomeBlacklistNetherrackNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeNetherrackNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkNetherrackNickelOre.get(), Nickel.minHeightNetherrackNickelOre.get(), 0, Nickel.maxHeightNetherrackNickelOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Nickel.enableEndStoneNickelOre.get()) {
                if ((Nickel.isTempWhitelistEndStoneNickelOre.get() && Nickel.temperatureBlacklistEndStoneNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistEndStoneNickelOre.get() && !Nickel.temperatureBlacklistEndStoneNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistEndStoneNickelOre.get() && Nickel.biomeBlacklistEndStoneNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistEndStoneNickelOre.get() && !Nickel.biomeBlacklistEndStoneNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeEndStoneNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkEndStoneNickelOre.get(), Nickel.minHeightEndStoneNickelOre.get(), 0, Nickel.maxHeightEndStoneNickelOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Nickel.enableSandNickelOre.get()) {
                if ((Nickel.isTempWhitelistSandNickelOre.get() && Nickel.temperatureBlacklistSandNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistSandNickelOre.get() && !Nickel.temperatureBlacklistSandNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistSandNickelOre.get() && Nickel.biomeBlacklistSandNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistSandNickelOre.get() && !Nickel.biomeBlacklistSandNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeSandNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkSandNickelOre.get(), Nickel.minHeightSandNickelOre.get(), 0, Nickel.maxHeightSandNickelOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Nickel.enableRedSandNickelOre.get()) {
                if ((Nickel.isTempWhitelistRedSandNickelOre.get() && Nickel.temperatureBlacklistRedSandNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistRedSandNickelOre.get() && !Nickel.temperatureBlacklistRedSandNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistRedSandNickelOre.get() && Nickel.biomeBlacklistRedSandNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistRedSandNickelOre.get() && !Nickel.biomeBlacklistRedSandNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeRedSandNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkRedSandNickelOre.get(), Nickel.minHeightRedSandNickelOre.get(), 0, Nickel.maxHeightRedSandNickelOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Nickel.enableGravelNickelOre.get()) {
                if ((Nickel.isTempWhitelistGravelNickelOre.get() && Nickel.temperatureBlacklistGravelNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistGravelNickelOre.get() && !Nickel.temperatureBlacklistGravelNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistGravelNickelOre.get() && Nickel.biomeBlacklistGravelNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistGravelNickelOre.get() && !Nickel.biomeBlacklistGravelNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeGravelNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkGravelNickelOre.get(), Nickel.minHeightGravelNickelOre.get(), 0, Nickel.maxHeightGravelNickelOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Nickel.enableSandstoneNickelOre.get()) {
                if ((Nickel.isTempWhitelistSandstoneNickelOre.get() && Nickel.temperatureBlacklistSandstoneNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistSandstoneNickelOre.get() && !Nickel.temperatureBlacklistSandstoneNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistSandstoneNickelOre.get() && Nickel.biomeBlacklistSandstoneNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistSandstoneNickelOre.get() && !Nickel.biomeBlacklistSandstoneNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeSandstoneNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkSandstoneNickelOre.get(), Nickel.minHeightSandstoneNickelOre.get(), 0, Nickel.maxHeightSandstoneNickelOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Nickel.enableRedSandstoneNickelOre.get()) {
                if ((Nickel.isTempWhitelistRedSandstoneNickelOre.get() && Nickel.temperatureBlacklistRedSandstoneNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistRedSandstoneNickelOre.get() && !Nickel.temperatureBlacklistRedSandstoneNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistRedSandstoneNickelOre.get() && Nickel.biomeBlacklistRedSandstoneNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistRedSandstoneNickelOre.get() && !Nickel.biomeBlacklistRedSandstoneNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeRedSandstoneNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkRedSandstoneNickelOre.get(), Nickel.minHeightRedSandstoneNickelOre.get(), 0, Nickel.maxHeightRedSandstoneNickelOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Nickel.enableBlueIceNickelOre.get()) {
                if ((Nickel.isTempWhitelistBlueIceNickelOre.get() && Nickel.temperatureBlacklistBlueIceNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistBlueIceNickelOre.get() && !Nickel.temperatureBlacklistBlueIceNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistBlueIceNickelOre.get() && Nickel.biomeBlacklistBlueIceNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistBlueIceNickelOre.get() && !Nickel.biomeBlacklistBlueIceNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeBlueIceNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkBlueIceNickelOre.get(), Nickel.minHeightBlueIceNickelOre.get(), 0, Nickel.maxHeightBlueIceNickelOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Nickel.enablePackedIceNickelOre.get()) {
                if ((Nickel.isTempWhitelistPackedIceNickelOre.get() && Nickel.temperatureBlacklistPackedIceNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistPackedIceNickelOre.get() && !Nickel.temperatureBlacklistPackedIceNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistPackedIceNickelOre.get() && Nickel.biomeBlacklistPackedIceNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistPackedIceNickelOre.get() && !Nickel.biomeBlacklistPackedIceNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizePackedIceNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkPackedIceNickelOre.get(), Nickel.minHeightPackedIceNickelOre.get(), 0, Nickel.maxHeightPackedIceNickelOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Nickel.enableBedrockNickelOre.get()) {
                if ((Nickel.isTempWhitelistBedrockNickelOre.get() && Nickel.temperatureBlacklistBedrockNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistBedrockNickelOre.get() && !Nickel.temperatureBlacklistBedrockNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistBedrockNickelOre.get() && Nickel.biomeBlacklistBedrockNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistBedrockNickelOre.get() && !Nickel.biomeBlacklistBedrockNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeBedrockNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkBedrockNickelOre.get(), Nickel.minHeightBedrockNickelOre.get(), 0, Nickel.maxHeightBedrockNickelOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Nickel.enableQuarkBasaltNickelOre.get()) {
                if ((Nickel.isTempWhitelistQuarkBasaltNickelOre.get() && Nickel.temperatureBlacklistQuarkBasaltNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistQuarkBasaltNickelOre.get() && !Nickel.temperatureBlacklistQuarkBasaltNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistQuarkBasaltNickelOre.get() && Nickel.biomeBlacklistQuarkBasaltNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistQuarkBasaltNickelOre.get() && !Nickel.biomeBlacklistQuarkBasaltNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeQuarkBasaltNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkQuarkBasaltNickelOre.get(), Nickel.minHeightQuarkBasaltNickelOre.get(), 0, Nickel.maxHeightQuarkBasaltNickelOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Nickel.enableQuarkMarbleNickelOre.get()) {
                if ((Nickel.isTempWhitelistQuarkMarbleNickelOre.get() && Nickel.temperatureBlacklistQuarkMarbleNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistQuarkMarbleNickelOre.get() && !Nickel.temperatureBlacklistQuarkMarbleNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistQuarkMarbleNickelOre.get() && Nickel.biomeBlacklistQuarkMarbleNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistQuarkMarbleNickelOre.get() && !Nickel.biomeBlacklistQuarkMarbleNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeQuarkMarbleNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkQuarkMarbleNickelOre.get(), Nickel.minHeightQuarkMarbleNickelOre.get(), 0, Nickel.maxHeightQuarkMarbleNickelOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Nickel.enableQuarkSlateNickelOre.get()) {
                if ((Nickel.isTempWhitelistQuarkSlateNickelOre.get() && Nickel.temperatureBlacklistQuarkSlateNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistQuarkSlateNickelOre.get() && !Nickel.temperatureBlacklistQuarkSlateNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistQuarkSlateNickelOre.get() && Nickel.biomeBlacklistQuarkSlateNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistQuarkSlateNickelOre.get() && !Nickel.biomeBlacklistQuarkSlateNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeQuarkSlateNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkQuarkSlateNickelOre.get(), Nickel.minHeightQuarkSlateNickelOre.get(), 0, Nickel.maxHeightQuarkSlateNickelOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Nickel.enableQuarkLimestoneNickelOre.get()) {
                if ((Nickel.isTempWhitelistQuarkLimestoneNickelOre.get() && Nickel.temperatureBlacklistQuarkLimestoneNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistQuarkLimestoneNickelOre.get() && !Nickel.temperatureBlacklistQuarkLimestoneNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistQuarkLimestoneNickelOre.get() && Nickel.biomeBlacklistQuarkLimestoneNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistQuarkLimestoneNickelOre.get() && !Nickel.biomeBlacklistQuarkLimestoneNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeQuarkLimestoneNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkQuarkLimestoneNickelOre.get(), Nickel.minHeightQuarkLimestoneNickelOre.get(), 0, Nickel.maxHeightQuarkLimestoneNickelOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Nickel.enableQuarkJasperNickelOre.get()) {
                if ((Nickel.isTempWhitelistQuarkJasperNickelOre.get() && Nickel.temperatureBlacklistQuarkJasperNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistQuarkJasperNickelOre.get() && !Nickel.temperatureBlacklistQuarkJasperNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistQuarkJasperNickelOre.get() && Nickel.biomeBlacklistQuarkJasperNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistQuarkJasperNickelOre.get() && !Nickel.biomeBlacklistQuarkJasperNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeQuarkJasperNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkQuarkJasperNickelOre.get(), Nickel.minHeightQuarkJasperNickelOre.get(), 0, Nickel.maxHeightQuarkJasperNickelOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Nickel.enableEmbellishcraftBasaltNickelOre.get()) {
                if ((Nickel.isTempWhitelistEmbellishcraftBasaltNickelOre.get() && Nickel.temperatureBlacklistEmbellishcraftBasaltNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistEmbellishcraftBasaltNickelOre.get() && !Nickel.temperatureBlacklistEmbellishcraftBasaltNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistEmbellishcraftBasaltNickelOre.get() && Nickel.biomeBlacklistEmbellishcraftBasaltNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistEmbellishcraftBasaltNickelOre.get() && !Nickel.biomeBlacklistEmbellishcraftBasaltNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeEmbellishcraftBasaltNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkEmbellishcraftBasaltNickelOre.get(), Nickel.minHeightEmbellishcraftBasaltNickelOre.get(), 0, Nickel.maxHeightEmbellishcraftBasaltNickelOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Nickel.enableEmbellishcraftGneissNickelOre.get()) {
                if ((Nickel.isTempWhitelistEmbellishcraftGneissNickelOre.get() && Nickel.temperatureBlacklistEmbellishcraftGneissNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistEmbellishcraftGneissNickelOre.get() && !Nickel.temperatureBlacklistEmbellishcraftGneissNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistEmbellishcraftGneissNickelOre.get() && Nickel.biomeBlacklistEmbellishcraftGneissNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistEmbellishcraftGneissNickelOre.get() && !Nickel.biomeBlacklistEmbellishcraftGneissNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeEmbellishcraftGneissNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkEmbellishcraftGneissNickelOre.get(), Nickel.minHeightEmbellishcraftGneissNickelOre.get(), 0, Nickel.maxHeightEmbellishcraftGneissNickelOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Nickel.enableEmbellishcraftJadeNickelOre.get()) {
                if ((Nickel.isTempWhitelistEmbellishcraftJadeNickelOre.get() && Nickel.temperatureBlacklistEmbellishcraftJadeNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistEmbellishcraftJadeNickelOre.get() && !Nickel.temperatureBlacklistEmbellishcraftJadeNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistEmbellishcraftJadeNickelOre.get() && Nickel.biomeBlacklistEmbellishcraftJadeNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistEmbellishcraftJadeNickelOre.get() && !Nickel.biomeBlacklistEmbellishcraftJadeNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeEmbellishcraftJadeNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkEmbellishcraftJadeNickelOre.get(), Nickel.minHeightEmbellishcraftJadeNickelOre.get(), 0, Nickel.maxHeightEmbellishcraftJadeNickelOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Nickel.enableEmbellishcraftLarvikiteNickelOre.get()) {
                if ((Nickel.isTempWhitelistEmbellishcraftLarvikiteNickelOre.get() && Nickel.temperatureBlacklistEmbellishcraftLarvikiteNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistEmbellishcraftLarvikiteNickelOre.get() && !Nickel.temperatureBlacklistEmbellishcraftLarvikiteNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistEmbellishcraftLarvikiteNickelOre.get() && Nickel.biomeBlacklistEmbellishcraftLarvikiteNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistEmbellishcraftLarvikiteNickelOre.get() && !Nickel.biomeBlacklistEmbellishcraftLarvikiteNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeEmbellishcraftLarvikiteNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkEmbellishcraftLarvikiteNickelOre.get(), Nickel.minHeightEmbellishcraftLarvikiteNickelOre.get(), 0, Nickel.maxHeightEmbellishcraftLarvikiteNickelOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Nickel.enableEmbellishcraftMarbleNickelOre.get()) {
                if ((Nickel.isTempWhitelistEmbellishcraftMarbleNickelOre.get() && Nickel.temperatureBlacklistEmbellishcraftMarbleNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistEmbellishcraftMarbleNickelOre.get() && !Nickel.temperatureBlacklistEmbellishcraftMarbleNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistEmbellishcraftMarbleNickelOre.get() && Nickel.biomeBlacklistEmbellishcraftMarbleNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistEmbellishcraftMarbleNickelOre.get() && !Nickel.biomeBlacklistEmbellishcraftMarbleNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeEmbellishcraftMarbleNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkEmbellishcraftMarbleNickelOre.get(), Nickel.minHeightEmbellishcraftMarbleNickelOre.get(), 0, Nickel.maxHeightEmbellishcraftMarbleNickelOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Nickel.enableEmbellishcraftSlateNickelOre.get()) {
                if ((Nickel.isTempWhitelistEmbellishcraftSlateNickelOre.get() && Nickel.temperatureBlacklistEmbellishcraftSlateNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistEmbellishcraftSlateNickelOre.get() && !Nickel.temperatureBlacklistEmbellishcraftSlateNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistEmbellishcraftSlateNickelOre.get() && Nickel.biomeBlacklistEmbellishcraftSlateNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistEmbellishcraftSlateNickelOre.get() && !Nickel.biomeBlacklistEmbellishcraftSlateNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeEmbellishcraftSlateNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkEmbellishcraftSlateNickelOre.get(), Nickel.minHeightEmbellishcraftSlateNickelOre.get(), 0, Nickel.maxHeightEmbellishcraftSlateNickelOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Nickel.enableHardenedStoneNickelOre.get()) {
                if ((Nickel.isTempWhitelistHardenedStoneNickelOre.get() && Nickel.temperatureBlacklistHardenedStoneNickelOre.get().contains(biomeTS)) || (!Nickel.isTempWhitelistHardenedStoneNickelOre.get() && !Nickel.temperatureBlacklistHardenedStoneNickelOre.get().contains(biomeTS))) {
                    if ((Nickel.isBiomeWhitelistHardenedStoneNickelOre.get() && Nickel.biomeBlacklistHardenedStoneNickelOre.get().contains(biomeRNS)) || (!Nickel.isBiomeWhitelistHardenedStoneNickelOre.get() && !Nickel.biomeBlacklistHardenedStoneNickelOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_NICKEL_ORE.get().getDefaultState(), Nickel.veinSizeHardenedStoneNickelOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Nickel.veinsPerChunkHardenedStoneNickelOre.get(), Nickel.minHeightHardenedStoneNickelOre.get(), 0, Nickel.maxHeightHardenedStoneNickelOre.get()))));
                    } } } }
    }
}
