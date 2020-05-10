package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Iridium;
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

public class IridiumGen {
    public static void addIridiumGen(Biome biome, String biomeRNS, String biomeTS) {
        addIridiumOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addIridiumOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Stone
        if (!General.disableStoneOreGeneration.get()) {
            if (Iridium.enableStoneIridiumOre.get()) {
                if ((Iridium.isTempWhitelistStoneIridiumOre.get() && Iridium.temperatureBlacklistStoneIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistStoneIridiumOre.get() && !Iridium.temperatureBlacklistStoneIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistStoneIridiumOre.get() && Iridium.biomeBlacklistStoneIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistStoneIridiumOre.get() && !Iridium.biomeBlacklistStoneIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeStoneIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkStoneIridiumOre.get(), Iridium.minHeightStoneIridiumOre.get(), 0, Iridium.maxHeightStoneIridiumOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Iridium.enableAndesiteIridiumOre.get()) {
                if ((Iridium.isTempWhitelistAndesiteIridiumOre.get() && Iridium.temperatureBlacklistAndesiteIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistAndesiteIridiumOre.get() && !Iridium.temperatureBlacklistAndesiteIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistAndesiteIridiumOre.get() && Iridium.biomeBlacklistAndesiteIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistAndesiteIridiumOre.get() && !Iridium.biomeBlacklistAndesiteIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeAndesiteIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkAndesiteIridiumOre.get(), Iridium.minHeightAndesiteIridiumOre.get(), 0, Iridium.maxHeightAndesiteIridiumOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Iridium.enableDioriteIridiumOre.get()) {
                if ((Iridium.isTempWhitelistDioriteIridiumOre.get() && Iridium.temperatureBlacklistDioriteIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistDioriteIridiumOre.get() && !Iridium.temperatureBlacklistDioriteIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistDioriteIridiumOre.get() && Iridium.biomeBlacklistDioriteIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistDioriteIridiumOre.get() && !Iridium.biomeBlacklistDioriteIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeDioriteIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkDioriteIridiumOre.get(), Iridium.minHeightDioriteIridiumOre.get(), 0, Iridium.maxHeightDioriteIridiumOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Iridium.enableGraniteIridiumOre.get()) {
                if ((Iridium.isTempWhitelistGraniteIridiumOre.get() && Iridium.temperatureBlacklistGraniteIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistGraniteIridiumOre.get() && !Iridium.temperatureBlacklistGraniteIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistGraniteIridiumOre.get() && Iridium.biomeBlacklistGraniteIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistGraniteIridiumOre.get() && !Iridium.biomeBlacklistGraniteIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeGraniteIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkGraniteIridiumOre.get(), Iridium.minHeightGraniteIridiumOre.get(), 0, Iridium.maxHeightGraniteIridiumOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Iridium.enableNetherrackIridiumOre.get()) {
                if ((Iridium.isTempWhitelistNetherrackIridiumOre.get() && Iridium.temperatureBlacklistNetherrackIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistNetherrackIridiumOre.get() && !Iridium.temperatureBlacklistNetherrackIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistNetherrackIridiumOre.get() && Iridium.biomeBlacklistNetherrackIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistNetherrackIridiumOre.get() && !Iridium.biomeBlacklistNetherrackIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeNetherrackIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkNetherrackIridiumOre.get(), Iridium.minHeightNetherrackIridiumOre.get(), 0, Iridium.maxHeightNetherrackIridiumOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Iridium.enableEndStoneIridiumOre.get()) {
                if ((Iridium.isTempWhitelistEndStoneIridiumOre.get() && Iridium.temperatureBlacklistEndStoneIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistEndStoneIridiumOre.get() && !Iridium.temperatureBlacklistEndStoneIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistEndStoneIridiumOre.get() && Iridium.biomeBlacklistEndStoneIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistEndStoneIridiumOre.get() && !Iridium.biomeBlacklistEndStoneIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeEndStoneIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkEndStoneIridiumOre.get(), Iridium.minHeightEndStoneIridiumOre.get(), 0, Iridium.maxHeightEndStoneIridiumOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Iridium.enableSandIridiumOre.get()) {
                if ((Iridium.isTempWhitelistSandIridiumOre.get() && Iridium.temperatureBlacklistSandIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistSandIridiumOre.get() && !Iridium.temperatureBlacklistSandIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistSandIridiumOre.get() && Iridium.biomeBlacklistSandIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistSandIridiumOre.get() && !Iridium.biomeBlacklistSandIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeSandIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkSandIridiumOre.get(), Iridium.minHeightSandIridiumOre.get(), 0, Iridium.maxHeightSandIridiumOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Iridium.enableRedSandIridiumOre.get()) {
                if ((Iridium.isTempWhitelistRedSandIridiumOre.get() && Iridium.temperatureBlacklistRedSandIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistRedSandIridiumOre.get() && !Iridium.temperatureBlacklistRedSandIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistRedSandIridiumOre.get() && Iridium.biomeBlacklistRedSandIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistRedSandIridiumOre.get() && !Iridium.biomeBlacklistRedSandIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeRedSandIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkRedSandIridiumOre.get(), Iridium.minHeightRedSandIridiumOre.get(), 0, Iridium.maxHeightRedSandIridiumOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Iridium.enableGravelIridiumOre.get()) {
                if ((Iridium.isTempWhitelistGravelIridiumOre.get() && Iridium.temperatureBlacklistGravelIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistGravelIridiumOre.get() && !Iridium.temperatureBlacklistGravelIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistGravelIridiumOre.get() && Iridium.biomeBlacklistGravelIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistGravelIridiumOre.get() && !Iridium.biomeBlacklistGravelIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeGravelIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkGravelIridiumOre.get(), Iridium.minHeightGravelIridiumOre.get(), 0, Iridium.maxHeightGravelIridiumOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Iridium.enableSandstoneIridiumOre.get()) {
                if ((Iridium.isTempWhitelistSandstoneIridiumOre.get() && Iridium.temperatureBlacklistSandstoneIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistSandstoneIridiumOre.get() && !Iridium.temperatureBlacklistSandstoneIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistSandstoneIridiumOre.get() && Iridium.biomeBlacklistSandstoneIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistSandstoneIridiumOre.get() && !Iridium.biomeBlacklistSandstoneIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeSandstoneIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkSandstoneIridiumOre.get(), Iridium.minHeightSandstoneIridiumOre.get(), 0, Iridium.maxHeightSandstoneIridiumOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Iridium.enableRedSandstoneIridiumOre.get()) {
                if ((Iridium.isTempWhitelistRedSandstoneIridiumOre.get() && Iridium.temperatureBlacklistRedSandstoneIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistRedSandstoneIridiumOre.get() && !Iridium.temperatureBlacklistRedSandstoneIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistRedSandstoneIridiumOre.get() && Iridium.biomeBlacklistRedSandstoneIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistRedSandstoneIridiumOre.get() && !Iridium.biomeBlacklistRedSandstoneIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeRedSandstoneIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkRedSandstoneIridiumOre.get(), Iridium.minHeightRedSandstoneIridiumOre.get(), 0, Iridium.maxHeightRedSandstoneIridiumOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Iridium.enableBlueIceIridiumOre.get()) {
                if ((Iridium.isTempWhitelistBlueIceIridiumOre.get() && Iridium.temperatureBlacklistBlueIceIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistBlueIceIridiumOre.get() && !Iridium.temperatureBlacklistBlueIceIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistBlueIceIridiumOre.get() && Iridium.biomeBlacklistBlueIceIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistBlueIceIridiumOre.get() && !Iridium.biomeBlacklistBlueIceIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeBlueIceIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkBlueIceIridiumOre.get(), Iridium.minHeightBlueIceIridiumOre.get(), 0, Iridium.maxHeightBlueIceIridiumOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Iridium.enablePackedIceIridiumOre.get()) {
                if ((Iridium.isTempWhitelistPackedIceIridiumOre.get() && Iridium.temperatureBlacklistPackedIceIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistPackedIceIridiumOre.get() && !Iridium.temperatureBlacklistPackedIceIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistPackedIceIridiumOre.get() && Iridium.biomeBlacklistPackedIceIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistPackedIceIridiumOre.get() && !Iridium.biomeBlacklistPackedIceIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizePackedIceIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkPackedIceIridiumOre.get(), Iridium.minHeightPackedIceIridiumOre.get(), 0, Iridium.maxHeightPackedIceIridiumOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Iridium.enableBedrockIridiumOre.get()) {
                if ((Iridium.isTempWhitelistBedrockIridiumOre.get() && Iridium.temperatureBlacklistBedrockIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistBedrockIridiumOre.get() && !Iridium.temperatureBlacklistBedrockIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistBedrockIridiumOre.get() && Iridium.biomeBlacklistBedrockIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistBedrockIridiumOre.get() && !Iridium.biomeBlacklistBedrockIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeBedrockIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkBedrockIridiumOre.get(), Iridium.minHeightBedrockIridiumOre.get(), 0, Iridium.maxHeightBedrockIridiumOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Iridium.enableQuarkBasaltIridiumOre.get()) {
                if ((Iridium.isTempWhitelistQuarkBasaltIridiumOre.get() && Iridium.temperatureBlacklistQuarkBasaltIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistQuarkBasaltIridiumOre.get() && !Iridium.temperatureBlacklistQuarkBasaltIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistQuarkBasaltIridiumOre.get() && Iridium.biomeBlacklistQuarkBasaltIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistQuarkBasaltIridiumOre.get() && !Iridium.biomeBlacklistQuarkBasaltIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeQuarkBasaltIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkQuarkBasaltIridiumOre.get(), Iridium.minHeightQuarkBasaltIridiumOre.get(), 0, Iridium.maxHeightQuarkBasaltIridiumOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Iridium.enableQuarkMarbleIridiumOre.get()) {
                if ((Iridium.isTempWhitelistQuarkMarbleIridiumOre.get() && Iridium.temperatureBlacklistQuarkMarbleIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistQuarkMarbleIridiumOre.get() && !Iridium.temperatureBlacklistQuarkMarbleIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistQuarkMarbleIridiumOre.get() && Iridium.biomeBlacklistQuarkMarbleIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistQuarkMarbleIridiumOre.get() && !Iridium.biomeBlacklistQuarkMarbleIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeQuarkMarbleIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkQuarkMarbleIridiumOre.get(), Iridium.minHeightQuarkMarbleIridiumOre.get(), 0, Iridium.maxHeightQuarkMarbleIridiumOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Iridium.enableQuarkSlateIridiumOre.get()) {
                if ((Iridium.isTempWhitelistQuarkSlateIridiumOre.get() && Iridium.temperatureBlacklistQuarkSlateIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistQuarkSlateIridiumOre.get() && !Iridium.temperatureBlacklistQuarkSlateIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistQuarkSlateIridiumOre.get() && Iridium.biomeBlacklistQuarkSlateIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistQuarkSlateIridiumOre.get() && !Iridium.biomeBlacklistQuarkSlateIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeQuarkSlateIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkQuarkSlateIridiumOre.get(), Iridium.minHeightQuarkSlateIridiumOre.get(), 0, Iridium.maxHeightQuarkSlateIridiumOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Iridium.enableQuarkLimestoneIridiumOre.get()) {
                if ((Iridium.isTempWhitelistQuarkLimestoneIridiumOre.get() && Iridium.temperatureBlacklistQuarkLimestoneIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistQuarkLimestoneIridiumOre.get() && !Iridium.temperatureBlacklistQuarkLimestoneIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistQuarkLimestoneIridiumOre.get() && Iridium.biomeBlacklistQuarkLimestoneIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistQuarkLimestoneIridiumOre.get() && !Iridium.biomeBlacklistQuarkLimestoneIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeQuarkLimestoneIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkQuarkLimestoneIridiumOre.get(), Iridium.minHeightQuarkLimestoneIridiumOre.get(), 0, Iridium.maxHeightQuarkLimestoneIridiumOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Iridium.enableQuarkJasperIridiumOre.get()) {
                if ((Iridium.isTempWhitelistQuarkJasperIridiumOre.get() && Iridium.temperatureBlacklistQuarkJasperIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistQuarkJasperIridiumOre.get() && !Iridium.temperatureBlacklistQuarkJasperIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistQuarkJasperIridiumOre.get() && Iridium.biomeBlacklistQuarkJasperIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistQuarkJasperIridiumOre.get() && !Iridium.biomeBlacklistQuarkJasperIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeQuarkJasperIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkQuarkJasperIridiumOre.get(), Iridium.minHeightQuarkJasperIridiumOre.get(), 0, Iridium.maxHeightQuarkJasperIridiumOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Iridium.enableEmbellishcraftBasaltIridiumOre.get()) {
                if ((Iridium.isTempWhitelistEmbellishcraftBasaltIridiumOre.get() && Iridium.temperatureBlacklistEmbellishcraftBasaltIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistEmbellishcraftBasaltIridiumOre.get() && !Iridium.temperatureBlacklistEmbellishcraftBasaltIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistEmbellishcraftBasaltIridiumOre.get() && Iridium.biomeBlacklistEmbellishcraftBasaltIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistEmbellishcraftBasaltIridiumOre.get() && !Iridium.biomeBlacklistEmbellishcraftBasaltIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeEmbellishcraftBasaltIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkEmbellishcraftBasaltIridiumOre.get(), Iridium.minHeightEmbellishcraftBasaltIridiumOre.get(), 0, Iridium.maxHeightEmbellishcraftBasaltIridiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Iridium.enableEmbellishcraftGneissIridiumOre.get()) {
                if ((Iridium.isTempWhitelistEmbellishcraftGneissIridiumOre.get() && Iridium.temperatureBlacklistEmbellishcraftGneissIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistEmbellishcraftGneissIridiumOre.get() && !Iridium.temperatureBlacklistEmbellishcraftGneissIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistEmbellishcraftGneissIridiumOre.get() && Iridium.biomeBlacklistEmbellishcraftGneissIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistEmbellishcraftGneissIridiumOre.get() && !Iridium.biomeBlacklistEmbellishcraftGneissIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeEmbellishcraftGneissIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkEmbellishcraftGneissIridiumOre.get(), Iridium.minHeightEmbellishcraftGneissIridiumOre.get(), 0, Iridium.maxHeightEmbellishcraftGneissIridiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Iridium.enableEmbellishcraftJadeIridiumOre.get()) {
                if ((Iridium.isTempWhitelistEmbellishcraftJadeIridiumOre.get() && Iridium.temperatureBlacklistEmbellishcraftJadeIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistEmbellishcraftJadeIridiumOre.get() && !Iridium.temperatureBlacklistEmbellishcraftJadeIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistEmbellishcraftJadeIridiumOre.get() && Iridium.biomeBlacklistEmbellishcraftJadeIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistEmbellishcraftJadeIridiumOre.get() && !Iridium.biomeBlacklistEmbellishcraftJadeIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeEmbellishcraftJadeIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkEmbellishcraftJadeIridiumOre.get(), Iridium.minHeightEmbellishcraftJadeIridiumOre.get(), 0, Iridium.maxHeightEmbellishcraftJadeIridiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Iridium.enableEmbellishcraftLarvikiteIridiumOre.get()) {
                if ((Iridium.isTempWhitelistEmbellishcraftLarvikiteIridiumOre.get() && Iridium.temperatureBlacklistEmbellishcraftLarvikiteIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistEmbellishcraftLarvikiteIridiumOre.get() && !Iridium.temperatureBlacklistEmbellishcraftLarvikiteIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistEmbellishcraftLarvikiteIridiumOre.get() && Iridium.biomeBlacklistEmbellishcraftLarvikiteIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistEmbellishcraftLarvikiteIridiumOre.get() && !Iridium.biomeBlacklistEmbellishcraftLarvikiteIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeEmbellishcraftLarvikiteIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkEmbellishcraftLarvikiteIridiumOre.get(), Iridium.minHeightEmbellishcraftLarvikiteIridiumOre.get(), 0, Iridium.maxHeightEmbellishcraftLarvikiteIridiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Iridium.enableEmbellishcraftMarbleIridiumOre.get()) {
                if ((Iridium.isTempWhitelistEmbellishcraftMarbleIridiumOre.get() && Iridium.temperatureBlacklistEmbellishcraftMarbleIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistEmbellishcraftMarbleIridiumOre.get() && !Iridium.temperatureBlacklistEmbellishcraftMarbleIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistEmbellishcraftMarbleIridiumOre.get() && Iridium.biomeBlacklistEmbellishcraftMarbleIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistEmbellishcraftMarbleIridiumOre.get() && !Iridium.biomeBlacklistEmbellishcraftMarbleIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeEmbellishcraftMarbleIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkEmbellishcraftMarbleIridiumOre.get(), Iridium.minHeightEmbellishcraftMarbleIridiumOre.get(), 0, Iridium.maxHeightEmbellishcraftMarbleIridiumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Iridium.enableEmbellishcraftSlateIridiumOre.get()) {
                if ((Iridium.isTempWhitelistEmbellishcraftSlateIridiumOre.get() && Iridium.temperatureBlacklistEmbellishcraftSlateIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistEmbellishcraftSlateIridiumOre.get() && !Iridium.temperatureBlacklistEmbellishcraftSlateIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistEmbellishcraftSlateIridiumOre.get() && Iridium.biomeBlacklistEmbellishcraftSlateIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistEmbellishcraftSlateIridiumOre.get() && !Iridium.biomeBlacklistEmbellishcraftSlateIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeEmbellishcraftSlateIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkEmbellishcraftSlateIridiumOre.get(), Iridium.minHeightEmbellishcraftSlateIridiumOre.get(), 0, Iridium.maxHeightEmbellishcraftSlateIridiumOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Iridium.enableHardenedStoneIridiumOre.get()) {
                if ((Iridium.isTempWhitelistHardenedStoneIridiumOre.get() && Iridium.temperatureBlacklistHardenedStoneIridiumOre.get().contains(biomeTS)) || (!Iridium.isTempWhitelistHardenedStoneIridiumOre.get() && !Iridium.temperatureBlacklistHardenedStoneIridiumOre.get().contains(biomeTS))) {
                    if ((Iridium.isBiomeWhitelistHardenedStoneIridiumOre.get() && Iridium.biomeBlacklistHardenedStoneIridiumOre.get().contains(biomeRNS)) || (!Iridium.isBiomeWhitelistHardenedStoneIridiumOre.get() && !Iridium.biomeBlacklistHardenedStoneIridiumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_IRIDIUM_ORE.get().getDefaultState(), Iridium.veinSizeHardenedStoneIridiumOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iridium.veinsPerChunkHardenedStoneIridiumOre.get(), Iridium.minHeightHardenedStoneIridiumOre.get(), 0, Iridium.maxHeightHardenedStoneIridiumOre.get()))));
                    } } } }
    }
}
