package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Niter;
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

public class NiterGen {

    public static void addNiterGen(Biome biome, String biomeRNS, String biomeTS) {
        addNiterOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addNiterOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Niter.enableStoneNiterOre.get()) {
                if ((Niter.isTempWhitelistStoneNiterOre.get() && Niter.temperatureBlacklistStoneNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistStoneNiterOre.get() && !Niter.temperatureBlacklistStoneNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistStoneNiterOre.get() && Niter.biomeBlacklistStoneNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistStoneNiterOre.get() && !Niter.biomeBlacklistStoneNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_NITER_ORE.get().getDefaultState(), Niter.veinSizeStoneNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkStoneNiterOre.get(), Niter.minHeightStoneNiterOre.get(), 0, Niter.maxHeightStoneNiterOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Niter.enableAndesiteNiterOre.get()) {
                if ((Niter.isTempWhitelistAndesiteNiterOre.get() && Niter.temperatureBlacklistAndesiteNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistAndesiteNiterOre.get() && !Niter.temperatureBlacklistAndesiteNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistAndesiteNiterOre.get() && Niter.biomeBlacklistAndesiteNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistAndesiteNiterOre.get() && !Niter.biomeBlacklistAndesiteNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_NITER_ORE.get().getDefaultState(), Niter.veinSizeAndesiteNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkAndesiteNiterOre.get(), Niter.minHeightAndesiteNiterOre.get(), 0, Niter.maxHeightAndesiteNiterOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Niter.enableDioriteNiterOre.get()) {
                if ((Niter.isTempWhitelistDioriteNiterOre.get() && Niter.temperatureBlacklistDioriteNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistDioriteNiterOre.get() && !Niter.temperatureBlacklistDioriteNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistDioriteNiterOre.get() && Niter.biomeBlacklistDioriteNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistDioriteNiterOre.get() && !Niter.biomeBlacklistDioriteNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_NITER_ORE.get().getDefaultState(), Niter.veinSizeDioriteNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkDioriteNiterOre.get(), Niter.minHeightDioriteNiterOre.get(), 0, Niter.maxHeightDioriteNiterOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Niter.enableGraniteNiterOre.get()) {
                if ((Niter.isTempWhitelistGraniteNiterOre.get() && Niter.temperatureBlacklistGraniteNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistGraniteNiterOre.get() && !Niter.temperatureBlacklistGraniteNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistGraniteNiterOre.get() && Niter.biomeBlacklistGraniteNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistGraniteNiterOre.get() && !Niter.biomeBlacklistGraniteNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_NITER_ORE.get().getDefaultState(), Niter.veinSizeGraniteNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkGraniteNiterOre.get(), Niter.minHeightGraniteNiterOre.get(), 0, Niter.maxHeightGraniteNiterOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Niter.enableNetherrackNiterOre.get()) {
                if ((Niter.isTempWhitelistNetherrackNiterOre.get() && Niter.temperatureBlacklistNetherrackNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistNetherrackNiterOre.get() && !Niter.temperatureBlacklistNetherrackNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistNetherrackNiterOre.get() && Niter.biomeBlacklistNetherrackNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistNetherrackNiterOre.get() && !Niter.biomeBlacklistNetherrackNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_NITER_ORE.get().getDefaultState(), Niter.veinSizeNetherrackNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkNetherrackNiterOre.get(), Niter.minHeightNetherrackNiterOre.get(), 0, Niter.maxHeightNetherrackNiterOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Niter.enableEndStoneNiterOre.get()) {
                if ((Niter.isTempWhitelistEndStoneNiterOre.get() && Niter.temperatureBlacklistEndStoneNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistEndStoneNiterOre.get() && !Niter.temperatureBlacklistEndStoneNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistEndStoneNiterOre.get() && Niter.biomeBlacklistEndStoneNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistEndStoneNiterOre.get() && !Niter.biomeBlacklistEndStoneNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_NITER_ORE.get().getDefaultState(), Niter.veinSizeEndStoneNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkEndStoneNiterOre.get(), Niter.minHeightEndStoneNiterOre.get(), 0, Niter.maxHeightEndStoneNiterOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Niter.enableSandNiterOre.get()) {
                if ((Niter.isTempWhitelistSandNiterOre.get() && Niter.temperatureBlacklistSandNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistSandNiterOre.get() && !Niter.temperatureBlacklistSandNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistSandNiterOre.get() && Niter.biomeBlacklistSandNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistSandNiterOre.get() && !Niter.biomeBlacklistSandNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_NITER_ORE.get().getDefaultState(), Niter.veinSizeSandNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkSandNiterOre.get(), Niter.minHeightSandNiterOre.get(), 0, Niter.maxHeightSandNiterOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Niter.enableRedSandNiterOre.get()) {
                if ((Niter.isTempWhitelistRedSandNiterOre.get() && Niter.temperatureBlacklistRedSandNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistRedSandNiterOre.get() && !Niter.temperatureBlacklistRedSandNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistRedSandNiterOre.get() && Niter.biomeBlacklistRedSandNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistRedSandNiterOre.get() && !Niter.biomeBlacklistRedSandNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_NITER_ORE.get().getDefaultState(), Niter.veinSizeRedSandNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkRedSandNiterOre.get(), Niter.minHeightRedSandNiterOre.get(), 0, Niter.maxHeightRedSandNiterOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Niter.enableGravelNiterOre.get()) {
                if ((Niter.isTempWhitelistGravelNiterOre.get() && Niter.temperatureBlacklistGravelNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistGravelNiterOre.get() && !Niter.temperatureBlacklistGravelNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistGravelNiterOre.get() && Niter.biomeBlacklistGravelNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistGravelNiterOre.get() && !Niter.biomeBlacklistGravelNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_NITER_ORE.get().getDefaultState(), Niter.veinSizeGravelNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkGravelNiterOre.get(), Niter.minHeightGravelNiterOre.get(), 0, Niter.maxHeightGravelNiterOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Niter.enableSandstoneNiterOre.get()) {
                if ((Niter.isTempWhitelistSandstoneNiterOre.get() && Niter.temperatureBlacklistSandstoneNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistSandstoneNiterOre.get() && !Niter.temperatureBlacklistSandstoneNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistSandstoneNiterOre.get() && Niter.biomeBlacklistSandstoneNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistSandstoneNiterOre.get() && !Niter.biomeBlacklistSandstoneNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_NITER_ORE.get().getDefaultState(), Niter.veinSizeSandstoneNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkSandstoneNiterOre.get(), Niter.minHeightSandstoneNiterOre.get(), 0, Niter.maxHeightSandstoneNiterOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Niter.enableRedSandstoneNiterOre.get()) {
                if ((Niter.isTempWhitelistRedSandstoneNiterOre.get() && Niter.temperatureBlacklistRedSandstoneNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistRedSandstoneNiterOre.get() && !Niter.temperatureBlacklistRedSandstoneNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistRedSandstoneNiterOre.get() && Niter.biomeBlacklistRedSandstoneNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistRedSandstoneNiterOre.get() && !Niter.biomeBlacklistRedSandstoneNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_NITER_ORE.get().getDefaultState(), Niter.veinSizeRedSandstoneNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkRedSandstoneNiterOre.get(), Niter.minHeightRedSandstoneNiterOre.get(), 0, Niter.maxHeightRedSandstoneNiterOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Niter.enableBlueIceNiterOre.get()) {
                if ((Niter.isTempWhitelistBlueIceNiterOre.get() && Niter.temperatureBlacklistBlueIceNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistBlueIceNiterOre.get() && !Niter.temperatureBlacklistBlueIceNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistBlueIceNiterOre.get() && Niter.biomeBlacklistBlueIceNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistBlueIceNiterOre.get() && !Niter.biomeBlacklistBlueIceNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_NITER_ORE.get().getDefaultState(), Niter.veinSizeBlueIceNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkBlueIceNiterOre.get(), Niter.minHeightBlueIceNiterOre.get(), 0, Niter.maxHeightBlueIceNiterOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Niter.enablePackedIceNiterOre.get()) {
                if ((Niter.isTempWhitelistPackedIceNiterOre.get() && Niter.temperatureBlacklistPackedIceNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistPackedIceNiterOre.get() && !Niter.temperatureBlacklistPackedIceNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistPackedIceNiterOre.get() && Niter.biomeBlacklistPackedIceNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistPackedIceNiterOre.get() && !Niter.biomeBlacklistPackedIceNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_NITER_ORE.get().getDefaultState(), Niter.veinSizePackedIceNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkPackedIceNiterOre.get(), Niter.minHeightPackedIceNiterOre.get(), 0, Niter.maxHeightPackedIceNiterOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Niter.enableBedrockNiterOre.get()) {
                if ((Niter.isTempWhitelistBedrockNiterOre.get() && Niter.temperatureBlacklistBedrockNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistBedrockNiterOre.get() && !Niter.temperatureBlacklistBedrockNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistBedrockNiterOre.get() && Niter.biomeBlacklistBedrockNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistBedrockNiterOre.get() && !Niter.biomeBlacklistBedrockNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_NITER_ORE.get().getDefaultState(), Niter.veinSizeBedrockNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkBedrockNiterOre.get(), Niter.minHeightBedrockNiterOre.get(), 0, Niter.maxHeightBedrockNiterOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Niter.enableQuarkBasaltNiterOre.get()) {
                if ((Niter.isTempWhitelistQuarkBasaltNiterOre.get() && Niter.temperatureBlacklistQuarkBasaltNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistQuarkBasaltNiterOre.get() && !Niter.temperatureBlacklistQuarkBasaltNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistQuarkBasaltNiterOre.get() && Niter.biomeBlacklistQuarkBasaltNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistQuarkBasaltNiterOre.get() && !Niter.biomeBlacklistQuarkBasaltNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_NITER_ORE.get().getDefaultState(), Niter.veinSizeQuarkBasaltNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkQuarkBasaltNiterOre.get(), Niter.minHeightQuarkBasaltNiterOre.get(), 0, Niter.maxHeightQuarkBasaltNiterOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Niter.enableQuarkMarbleNiterOre.get()) {
                if ((Niter.isTempWhitelistQuarkMarbleNiterOre.get() && Niter.temperatureBlacklistQuarkMarbleNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistQuarkMarbleNiterOre.get() && !Niter.temperatureBlacklistQuarkMarbleNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistQuarkMarbleNiterOre.get() && Niter.biomeBlacklistQuarkMarbleNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistQuarkMarbleNiterOre.get() && !Niter.biomeBlacklistQuarkMarbleNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_NITER_ORE.get().getDefaultState(), Niter.veinSizeQuarkMarbleNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkQuarkMarbleNiterOre.get(), Niter.minHeightQuarkMarbleNiterOre.get(), 0, Niter.maxHeightQuarkMarbleNiterOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Niter.enableQuarkSlateNiterOre.get()) {
                if ((Niter.isTempWhitelistQuarkSlateNiterOre.get() && Niter.temperatureBlacklistQuarkSlateNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistQuarkSlateNiterOre.get() && !Niter.temperatureBlacklistQuarkSlateNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistQuarkSlateNiterOre.get() && Niter.biomeBlacklistQuarkSlateNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistQuarkSlateNiterOre.get() && !Niter.biomeBlacklistQuarkSlateNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_NITER_ORE.get().getDefaultState(), Niter.veinSizeQuarkSlateNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkQuarkSlateNiterOre.get(), Niter.minHeightQuarkSlateNiterOre.get(), 0, Niter.maxHeightQuarkSlateNiterOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Niter.enableQuarkLimestoneNiterOre.get()) {
                if ((Niter.isTempWhitelistQuarkLimestoneNiterOre.get() && Niter.temperatureBlacklistQuarkLimestoneNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistQuarkLimestoneNiterOre.get() && !Niter.temperatureBlacklistQuarkLimestoneNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistQuarkLimestoneNiterOre.get() && Niter.biomeBlacklistQuarkLimestoneNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistQuarkLimestoneNiterOre.get() && !Niter.biomeBlacklistQuarkLimestoneNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_NITER_ORE.get().getDefaultState(), Niter.veinSizeQuarkLimestoneNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkQuarkLimestoneNiterOre.get(), Niter.minHeightQuarkLimestoneNiterOre.get(), 0, Niter.maxHeightQuarkLimestoneNiterOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Niter.enableQuarkJasperNiterOre.get()) {
                if ((Niter.isTempWhitelistQuarkJasperNiterOre.get() && Niter.temperatureBlacklistQuarkJasperNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistQuarkJasperNiterOre.get() && !Niter.temperatureBlacklistQuarkJasperNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistQuarkJasperNiterOre.get() && Niter.biomeBlacklistQuarkJasperNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistQuarkJasperNiterOre.get() && !Niter.biomeBlacklistQuarkJasperNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_NITER_ORE.get().getDefaultState(), Niter.veinSizeQuarkJasperNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkQuarkJasperNiterOre.get(), Niter.minHeightQuarkJasperNiterOre.get(), 0, Niter.maxHeightQuarkJasperNiterOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Niter.enableEmbellishcraftBasaltNiterOre.get()) {
                if ((Niter.isTempWhitelistEmbellishcraftBasaltNiterOre.get() && Niter.temperatureBlacklistEmbellishcraftBasaltNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistEmbellishcraftBasaltNiterOre.get() && !Niter.temperatureBlacklistEmbellishcraftBasaltNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistEmbellishcraftBasaltNiterOre.get() && Niter.biomeBlacklistEmbellishcraftBasaltNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistEmbellishcraftBasaltNiterOre.get() && !Niter.biomeBlacklistEmbellishcraftBasaltNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_NITER_ORE.get().getDefaultState(), Niter.veinSizeEmbellishcraftBasaltNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkEmbellishcraftBasaltNiterOre.get(), Niter.minHeightEmbellishcraftBasaltNiterOre.get(), 0, Niter.maxHeightEmbellishcraftBasaltNiterOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Niter.enableEmbellishcraftGneissNiterOre.get()) {
                if ((Niter.isTempWhitelistEmbellishcraftGneissNiterOre.get() && Niter.temperatureBlacklistEmbellishcraftGneissNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistEmbellishcraftGneissNiterOre.get() && !Niter.temperatureBlacklistEmbellishcraftGneissNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistEmbellishcraftGneissNiterOre.get() && Niter.biomeBlacklistEmbellishcraftGneissNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistEmbellishcraftGneissNiterOre.get() && !Niter.biomeBlacklistEmbellishcraftGneissNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_NITER_ORE.get().getDefaultState(), Niter.veinSizeEmbellishcraftGneissNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkEmbellishcraftGneissNiterOre.get(), Niter.minHeightEmbellishcraftGneissNiterOre.get(), 0, Niter.maxHeightEmbellishcraftGneissNiterOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Niter.enableEmbellishcraftJadeNiterOre.get()) {
                if ((Niter.isTempWhitelistEmbellishcraftJadeNiterOre.get() && Niter.temperatureBlacklistEmbellishcraftJadeNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistEmbellishcraftJadeNiterOre.get() && !Niter.temperatureBlacklistEmbellishcraftJadeNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistEmbellishcraftJadeNiterOre.get() && Niter.biomeBlacklistEmbellishcraftJadeNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistEmbellishcraftJadeNiterOre.get() && !Niter.biomeBlacklistEmbellishcraftJadeNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_NITER_ORE.get().getDefaultState(), Niter.veinSizeEmbellishcraftJadeNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkEmbellishcraftJadeNiterOre.get(), Niter.minHeightEmbellishcraftJadeNiterOre.get(), 0, Niter.maxHeightEmbellishcraftJadeNiterOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Niter.enableEmbellishcraftLarvikiteNiterOre.get()) {
                if ((Niter.isTempWhitelistEmbellishcraftLarvikiteNiterOre.get() && Niter.temperatureBlacklistEmbellishcraftLarvikiteNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistEmbellishcraftLarvikiteNiterOre.get() && !Niter.temperatureBlacklistEmbellishcraftLarvikiteNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistEmbellishcraftLarvikiteNiterOre.get() && Niter.biomeBlacklistEmbellishcraftLarvikiteNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistEmbellishcraftLarvikiteNiterOre.get() && !Niter.biomeBlacklistEmbellishcraftLarvikiteNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_NITER_ORE.get().getDefaultState(), Niter.veinSizeEmbellishcraftLarvikiteNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkEmbellishcraftLarvikiteNiterOre.get(), Niter.minHeightEmbellishcraftLarvikiteNiterOre.get(), 0, Niter.maxHeightEmbellishcraftLarvikiteNiterOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Niter.enableEmbellishcraftMarbleNiterOre.get()) {
                if ((Niter.isTempWhitelistEmbellishcraftMarbleNiterOre.get() && Niter.temperatureBlacklistEmbellishcraftMarbleNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistEmbellishcraftMarbleNiterOre.get() && !Niter.temperatureBlacklistEmbellishcraftMarbleNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistEmbellishcraftMarbleNiterOre.get() && Niter.biomeBlacklistEmbellishcraftMarbleNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistEmbellishcraftMarbleNiterOre.get() && !Niter.biomeBlacklistEmbellishcraftMarbleNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_NITER_ORE.get().getDefaultState(), Niter.veinSizeEmbellishcraftMarbleNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkEmbellishcraftMarbleNiterOre.get(), Niter.minHeightEmbellishcraftMarbleNiterOre.get(), 0, Niter.maxHeightEmbellishcraftMarbleNiterOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Niter.enableEmbellishcraftSlateNiterOre.get()) {
                if ((Niter.isTempWhitelistEmbellishcraftSlateNiterOre.get() && Niter.temperatureBlacklistEmbellishcraftSlateNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistEmbellishcraftSlateNiterOre.get() && !Niter.temperatureBlacklistEmbellishcraftSlateNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistEmbellishcraftSlateNiterOre.get() && Niter.biomeBlacklistEmbellishcraftSlateNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistEmbellishcraftSlateNiterOre.get() && !Niter.biomeBlacklistEmbellishcraftSlateNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_NITER_ORE.get().getDefaultState(), Niter.veinSizeEmbellishcraftSlateNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkEmbellishcraftSlateNiterOre.get(), Niter.minHeightEmbellishcraftSlateNiterOre.get(), 0, Niter.maxHeightEmbellishcraftSlateNiterOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Niter.enableHardenedStoneNiterOre.get()) {
                if ((Niter.isTempWhitelistHardenedStoneNiterOre.get() && Niter.temperatureBlacklistHardenedStoneNiterOre.get().contains(biomeTS)) || (!Niter.isTempWhitelistHardenedStoneNiterOre.get() && !Niter.temperatureBlacklistHardenedStoneNiterOre.get().contains(biomeTS))) {
                    if ((Niter.isBiomeWhitelistHardenedStoneNiterOre.get() && Niter.biomeBlacklistHardenedStoneNiterOre.get().contains(biomeRNS)) || (!Niter.isBiomeWhitelistHardenedStoneNiterOre.get() && !Niter.biomeBlacklistHardenedStoneNiterOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_NITER_ORE.get().getDefaultState(), Niter.veinSizeHardenedStoneNiterOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Niter.veinsPerChunkHardenedStoneNiterOre.get(), Niter.minHeightHardenedStoneNiterOre.get(), 0, Niter.maxHeightHardenedStoneNiterOre.get()))));
                    } } } }
    }
}
