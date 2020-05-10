package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Iron;
import com.danny.dannys_ores.configs.Iron;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Iron;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class IronGen {

    public static void addIronGen(Biome biome, String biomeRNS, String biomeTS) {
        addIronOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addIronOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Iron.enableVanillaIronOre.get()) {
                if ((Iron.isTempWhitelistVanillaIronOre.get() && Iron.temperatureBlacklistVanillaIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistVanillaIronOre.get() && !Iron.temperatureBlacklistVanillaIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistVanillaIronOre.get() && Iron.biomeBlacklistVanillaIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistVanillaIronOre.get() && !Iron.biomeBlacklistVanillaIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.IRON_ORE.getDefaultState(), Iron.veinSizeVanillaIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkVanillaIronOre.get(), Iron.minHeightVanillaIronOre.get(), 0, Iron.maxHeightVanillaIronOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Iron.enableAndesiteIronOre.get()) {
                if ((Iron.isTempWhitelistAndesiteIronOre.get() && Iron.temperatureBlacklistAndesiteIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistAndesiteIronOre.get() && !Iron.temperatureBlacklistAndesiteIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistAndesiteIronOre.get() && Iron.biomeBlacklistAndesiteIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistAndesiteIronOre.get() && !Iron.biomeBlacklistAndesiteIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_IRON_ORE.get().getDefaultState(), Iron.veinSizeAndesiteIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkAndesiteIronOre.get(), Iron.minHeightAndesiteIronOre.get(), 0, Iron.maxHeightAndesiteIronOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Iron.enableDioriteIronOre.get()) {
                if ((Iron.isTempWhitelistDioriteIronOre.get() && Iron.temperatureBlacklistDioriteIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistDioriteIronOre.get() && !Iron.temperatureBlacklistDioriteIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistDioriteIronOre.get() && Iron.biomeBlacklistDioriteIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistDioriteIronOre.get() && !Iron.biomeBlacklistDioriteIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_IRON_ORE.get().getDefaultState(), Iron.veinSizeDioriteIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkDioriteIronOre.get(), Iron.minHeightDioriteIronOre.get(), 0, Iron.maxHeightDioriteIronOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Iron.enableGraniteIronOre.get()) {
                if ((Iron.isTempWhitelistGraniteIronOre.get() && Iron.temperatureBlacklistGraniteIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistGraniteIronOre.get() && !Iron.temperatureBlacklistGraniteIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistGraniteIronOre.get() && Iron.biomeBlacklistGraniteIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistGraniteIronOre.get() && !Iron.biomeBlacklistGraniteIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_IRON_ORE.get().getDefaultState(), Iron.veinSizeGraniteIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkGraniteIronOre.get(), Iron.minHeightGraniteIronOre.get(), 0, Iron.maxHeightGraniteIronOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Iron.enableNetherrackIronOre.get()) {
                if ((Iron.isTempWhitelistNetherrackIronOre.get() && Iron.temperatureBlacklistNetherrackIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistNetherrackIronOre.get() && !Iron.temperatureBlacklistNetherrackIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistNetherrackIronOre.get() && Iron.biomeBlacklistNetherrackIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistNetherrackIronOre.get() && !Iron.biomeBlacklistNetherrackIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_IRON_ORE.get().getDefaultState(), Iron.veinSizeNetherrackIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkNetherrackIronOre.get(), Iron.minHeightNetherrackIronOre.get(), 0, Iron.maxHeightNetherrackIronOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Iron.enableEndStoneIronOre.get()) {
                if ((Iron.isTempWhitelistEndStoneIronOre.get() && Iron.temperatureBlacklistEndStoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEndStoneIronOre.get() && !Iron.temperatureBlacklistEndStoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEndStoneIronOre.get() && Iron.biomeBlacklistEndStoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEndStoneIronOre.get() && !Iron.biomeBlacklistEndStoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_IRON_ORE.get().getDefaultState(), Iron.veinSizeEndStoneIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkEndStoneIronOre.get(), Iron.minHeightEndStoneIronOre.get(), 0, Iron.maxHeightEndStoneIronOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Iron.enableSandIronOre.get()) {
                if ((Iron.isTempWhitelistSandIronOre.get() && Iron.temperatureBlacklistSandIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistSandIronOre.get() && !Iron.temperatureBlacklistSandIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistSandIronOre.get() && Iron.biomeBlacklistSandIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistSandIronOre.get() && !Iron.biomeBlacklistSandIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_IRON_ORE.get().getDefaultState(), Iron.veinSizeSandIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkSandIronOre.get(), Iron.minHeightSandIronOre.get(), 0, Iron.maxHeightSandIronOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Iron.enableRedSandIronOre.get()) {
                if ((Iron.isTempWhitelistRedSandIronOre.get() && Iron.temperatureBlacklistRedSandIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistRedSandIronOre.get() && !Iron.temperatureBlacklistRedSandIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistRedSandIronOre.get() && Iron.biomeBlacklistRedSandIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistRedSandIronOre.get() && !Iron.biomeBlacklistRedSandIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_IRON_ORE.get().getDefaultState(), Iron.veinSizeRedSandIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkRedSandIronOre.get(), Iron.minHeightRedSandIronOre.get(), 0, Iron.maxHeightRedSandIronOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Iron.enableGravelIronOre.get()) {
                if ((Iron.isTempWhitelistGravelIronOre.get() && Iron.temperatureBlacklistGravelIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistGravelIronOre.get() && !Iron.temperatureBlacklistGravelIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistGravelIronOre.get() && Iron.biomeBlacklistGravelIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistGravelIronOre.get() && !Iron.biomeBlacklistGravelIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_IRON_ORE.get().getDefaultState(), Iron.veinSizeGravelIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkGravelIronOre.get(), Iron.minHeightGravelIronOre.get(), 0, Iron.maxHeightGravelIronOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Iron.enableSandstoneIronOre.get()) {
                if ((Iron.isTempWhitelistSandstoneIronOre.get() && Iron.temperatureBlacklistSandstoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistSandstoneIronOre.get() && !Iron.temperatureBlacklistSandstoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistSandstoneIronOre.get() && Iron.biomeBlacklistSandstoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistSandstoneIronOre.get() && !Iron.biomeBlacklistSandstoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_IRON_ORE.get().getDefaultState(), Iron.veinSizeSandstoneIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkSandstoneIronOre.get(), Iron.minHeightSandstoneIronOre.get(), 0, Iron.maxHeightSandstoneIronOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Iron.enableRedSandstoneIronOre.get()) {
                if ((Iron.isTempWhitelistRedSandstoneIronOre.get() && Iron.temperatureBlacklistRedSandstoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistRedSandstoneIronOre.get() && !Iron.temperatureBlacklistRedSandstoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistRedSandstoneIronOre.get() && Iron.biomeBlacklistRedSandstoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistRedSandstoneIronOre.get() && !Iron.biomeBlacklistRedSandstoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_IRON_ORE.get().getDefaultState(), Iron.veinSizeRedSandstoneIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkRedSandstoneIronOre.get(), Iron.minHeightRedSandstoneIronOre.get(), 0, Iron.maxHeightRedSandstoneIronOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Iron.enableBlueIceIronOre.get()) {
                if ((Iron.isTempWhitelistBlueIceIronOre.get() && Iron.temperatureBlacklistBlueIceIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistBlueIceIronOre.get() && !Iron.temperatureBlacklistBlueIceIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistBlueIceIronOre.get() && Iron.biomeBlacklistBlueIceIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistBlueIceIronOre.get() && !Iron.biomeBlacklistBlueIceIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_IRON_ORE.get().getDefaultState(), Iron.veinSizeBlueIceIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkBlueIceIronOre.get(), Iron.minHeightBlueIceIronOre.get(), 0, Iron.maxHeightBlueIceIronOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Iron.enablePackedIceIronOre.get()) {
                if ((Iron.isTempWhitelistPackedIceIronOre.get() && Iron.temperatureBlacklistPackedIceIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistPackedIceIronOre.get() && !Iron.temperatureBlacklistPackedIceIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistPackedIceIronOre.get() && Iron.biomeBlacklistPackedIceIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistPackedIceIronOre.get() && !Iron.biomeBlacklistPackedIceIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_IRON_ORE.get().getDefaultState(), Iron.veinSizePackedIceIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkPackedIceIronOre.get(), Iron.minHeightPackedIceIronOre.get(), 0, Iron.maxHeightPackedIceIronOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Iron.enableBedrockIronOre.get()) {
                if ((Iron.isTempWhitelistBedrockIronOre.get() && Iron.temperatureBlacklistBedrockIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistBedrockIronOre.get() && !Iron.temperatureBlacklistBedrockIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistBedrockIronOre.get() && Iron.biomeBlacklistBedrockIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistBedrockIronOre.get() && !Iron.biomeBlacklistBedrockIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_IRON_ORE.get().getDefaultState(), Iron.veinSizeBedrockIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkBedrockIronOre.get(), Iron.minHeightBedrockIronOre.get(), 0, Iron.maxHeightBedrockIronOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Iron.enableQuarkBasaltIronOre.get()) {
                if ((Iron.isTempWhitelistQuarkBasaltIronOre.get() && Iron.temperatureBlacklistQuarkBasaltIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistQuarkBasaltIronOre.get() && !Iron.temperatureBlacklistQuarkBasaltIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistQuarkBasaltIronOre.get() && Iron.biomeBlacklistQuarkBasaltIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistQuarkBasaltIronOre.get() && !Iron.biomeBlacklistQuarkBasaltIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_IRON_ORE.get().getDefaultState(), Iron.veinSizeQuarkBasaltIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkQuarkBasaltIronOre.get(), Iron.minHeightQuarkBasaltIronOre.get(), 0, Iron.maxHeightQuarkBasaltIronOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Iron.enableQuarkMarbleIronOre.get()) {
                if ((Iron.isTempWhitelistQuarkMarbleIronOre.get() && Iron.temperatureBlacklistQuarkMarbleIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistQuarkMarbleIronOre.get() && !Iron.temperatureBlacklistQuarkMarbleIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistQuarkMarbleIronOre.get() && Iron.biomeBlacklistQuarkMarbleIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistQuarkMarbleIronOre.get() && !Iron.biomeBlacklistQuarkMarbleIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_IRON_ORE.get().getDefaultState(), Iron.veinSizeQuarkMarbleIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkQuarkMarbleIronOre.get(), Iron.minHeightQuarkMarbleIronOre.get(), 0, Iron.maxHeightQuarkMarbleIronOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Iron.enableQuarkSlateIronOre.get()) {
                if ((Iron.isTempWhitelistQuarkSlateIronOre.get() && Iron.temperatureBlacklistQuarkSlateIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistQuarkSlateIronOre.get() && !Iron.temperatureBlacklistQuarkSlateIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistQuarkSlateIronOre.get() && Iron.biomeBlacklistQuarkSlateIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistQuarkSlateIronOre.get() && !Iron.biomeBlacklistQuarkSlateIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_IRON_ORE.get().getDefaultState(), Iron.veinSizeQuarkSlateIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkQuarkSlateIronOre.get(), Iron.minHeightQuarkSlateIronOre.get(), 0, Iron.maxHeightQuarkSlateIronOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Iron.enableQuarkLimestoneIronOre.get()) {
                if ((Iron.isTempWhitelistQuarkLimestoneIronOre.get() && Iron.temperatureBlacklistQuarkLimestoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistQuarkLimestoneIronOre.get() && !Iron.temperatureBlacklistQuarkLimestoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistQuarkLimestoneIronOre.get() && Iron.biomeBlacklistQuarkLimestoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistQuarkLimestoneIronOre.get() && !Iron.biomeBlacklistQuarkLimestoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_IRON_ORE.get().getDefaultState(), Iron.veinSizeQuarkLimestoneIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkQuarkLimestoneIronOre.get(), Iron.minHeightQuarkLimestoneIronOre.get(), 0, Iron.maxHeightQuarkLimestoneIronOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Iron.enableQuarkJasperIronOre.get()) {
                if ((Iron.isTempWhitelistQuarkJasperIronOre.get() && Iron.temperatureBlacklistQuarkJasperIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistQuarkJasperIronOre.get() && !Iron.temperatureBlacklistQuarkJasperIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistQuarkJasperIronOre.get() && Iron.biomeBlacklistQuarkJasperIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistQuarkJasperIronOre.get() && !Iron.biomeBlacklistQuarkJasperIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_IRON_ORE.get().getDefaultState(), Iron.veinSizeQuarkJasperIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkQuarkJasperIronOre.get(), Iron.minHeightQuarkJasperIronOre.get(), 0, Iron.maxHeightQuarkJasperIronOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Iron.enableEmbellishcraftBasaltIronOre.get()) {
                if ((Iron.isTempWhitelistEmbellishcraftBasaltIronOre.get() && Iron.temperatureBlacklistEmbellishcraftBasaltIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEmbellishcraftBasaltIronOre.get() && !Iron.temperatureBlacklistEmbellishcraftBasaltIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEmbellishcraftBasaltIronOre.get() && Iron.biomeBlacklistEmbellishcraftBasaltIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEmbellishcraftBasaltIronOre.get() && !Iron.biomeBlacklistEmbellishcraftBasaltIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_IRON_ORE.get().getDefaultState(), Iron.veinSizeEmbellishcraftBasaltIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkEmbellishcraftBasaltIronOre.get(), Iron.minHeightEmbellishcraftBasaltIronOre.get(), 0, Iron.maxHeightEmbellishcraftBasaltIronOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Iron.enableEmbellishcraftGneissIronOre.get()) {
                if ((Iron.isTempWhitelistEmbellishcraftGneissIronOre.get() && Iron.temperatureBlacklistEmbellishcraftGneissIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEmbellishcraftGneissIronOre.get() && !Iron.temperatureBlacklistEmbellishcraftGneissIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEmbellishcraftGneissIronOre.get() && Iron.biomeBlacklistEmbellishcraftGneissIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEmbellishcraftGneissIronOre.get() && !Iron.biomeBlacklistEmbellishcraftGneissIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_IRON_ORE.get().getDefaultState(), Iron.veinSizeEmbellishcraftGneissIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkEmbellishcraftGneissIronOre.get(), Iron.minHeightEmbellishcraftGneissIronOre.get(), 0, Iron.maxHeightEmbellishcraftGneissIronOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Iron.enableEmbellishcraftJadeIronOre.get()) {
                if ((Iron.isTempWhitelistEmbellishcraftJadeIronOre.get() && Iron.temperatureBlacklistEmbellishcraftJadeIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEmbellishcraftJadeIronOre.get() && !Iron.temperatureBlacklistEmbellishcraftJadeIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEmbellishcraftJadeIronOre.get() && Iron.biomeBlacklistEmbellishcraftJadeIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEmbellishcraftJadeIronOre.get() && !Iron.biomeBlacklistEmbellishcraftJadeIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_IRON_ORE.get().getDefaultState(), Iron.veinSizeEmbellishcraftJadeIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkEmbellishcraftJadeIronOre.get(), Iron.minHeightEmbellishcraftJadeIronOre.get(), 0, Iron.maxHeightEmbellishcraftJadeIronOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Iron.enableEmbellishcraftLarvikiteIronOre.get()) {
                if ((Iron.isTempWhitelistEmbellishcraftLarvikiteIronOre.get() && Iron.temperatureBlacklistEmbellishcraftLarvikiteIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEmbellishcraftLarvikiteIronOre.get() && !Iron.temperatureBlacklistEmbellishcraftLarvikiteIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEmbellishcraftLarvikiteIronOre.get() && Iron.biomeBlacklistEmbellishcraftLarvikiteIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEmbellishcraftLarvikiteIronOre.get() && !Iron.biomeBlacklistEmbellishcraftLarvikiteIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_IRON_ORE.get().getDefaultState(), Iron.veinSizeEmbellishcraftLarvikiteIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkEmbellishcraftLarvikiteIronOre.get(), Iron.minHeightEmbellishcraftLarvikiteIronOre.get(), 0, Iron.maxHeightEmbellishcraftLarvikiteIronOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Iron.enableEmbellishcraftMarbleIronOre.get()) {
                if ((Iron.isTempWhitelistEmbellishcraftMarbleIronOre.get() && Iron.temperatureBlacklistEmbellishcraftMarbleIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEmbellishcraftMarbleIronOre.get() && !Iron.temperatureBlacklistEmbellishcraftMarbleIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEmbellishcraftMarbleIronOre.get() && Iron.biomeBlacklistEmbellishcraftMarbleIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEmbellishcraftMarbleIronOre.get() && !Iron.biomeBlacklistEmbellishcraftMarbleIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_IRON_ORE.get().getDefaultState(), Iron.veinSizeEmbellishcraftMarbleIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkEmbellishcraftMarbleIronOre.get(), Iron.minHeightEmbellishcraftMarbleIronOre.get(), 0, Iron.maxHeightEmbellishcraftMarbleIronOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Iron.enableEmbellishcraftSlateIronOre.get()) {
                if ((Iron.isTempWhitelistEmbellishcraftSlateIronOre.get() && Iron.temperatureBlacklistEmbellishcraftSlateIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEmbellishcraftSlateIronOre.get() && !Iron.temperatureBlacklistEmbellishcraftSlateIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEmbellishcraftSlateIronOre.get() && Iron.biomeBlacklistEmbellishcraftSlateIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEmbellishcraftSlateIronOre.get() && !Iron.biomeBlacklistEmbellishcraftSlateIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_IRON_ORE.get().getDefaultState(), Iron.veinSizeEmbellishcraftSlateIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkEmbellishcraftSlateIronOre.get(), Iron.minHeightEmbellishcraftSlateIronOre.get(), 0, Iron.maxHeightEmbellishcraftSlateIronOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Iron.enableHardenedStoneIronOre.get()) {
                if ((Iron.isTempWhitelistHardenedStoneIronOre.get() && Iron.temperatureBlacklistHardenedStoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistHardenedStoneIronOre.get() && !Iron.temperatureBlacklistHardenedStoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistHardenedStoneIronOre.get() && Iron.biomeBlacklistHardenedStoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistHardenedStoneIronOre.get() && !Iron.biomeBlacklistHardenedStoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_IRON_ORE.get().getDefaultState(), Iron.veinSizeHardenedStoneIronOre.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Iron.veinsPerChunkHardenedStoneIronOre.get(), Iron.minHeightHardenedStoneIronOre.get(), 0, Iron.maxHeightHardenedStoneIronOre.get()))));
                    } } } }
    }
}
