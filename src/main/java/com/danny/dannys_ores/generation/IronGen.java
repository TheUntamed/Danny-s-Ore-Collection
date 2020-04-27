package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.Iron;
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

public class IronGen {

    public static void addIronGen(Biome biome, String biomeRNS, String biomeTS) {
        addIronOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addIronOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (!General.disableStoneOreGeneration.get()) {
            if (Iron.enableStoneIronOre.get()) {
                if ((Iron.isTempWhitelistStoneIronOre.get() && Iron.temperatureBlacklistStoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistStoneIronOre.get() && !Iron.temperatureBlacklistStoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistStoneIronOre.get() && Iron.biomeBlacklistStoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistStoneIronOre.get() && !Iron.biomeBlacklistStoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_IRON_ORE.getDefaultState(), Iron.veinSizeStoneIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkStoneIronOre.get(), Iron.minHeightStoneIronOre.get(), 0, Iron.maxHeightStoneIronOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Iron.enableAndesiteIronOre.get()) {
                if ((Iron.isTempWhitelistAndesiteIronOre.get() && Iron.temperatureBlacklistAndesiteIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistAndesiteIronOre.get() && !Iron.temperatureBlacklistAndesiteIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistAndesiteIronOre.get() && Iron.biomeBlacklistAndesiteIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistAndesiteIronOre.get() && !Iron.biomeBlacklistAndesiteIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_IRON_ORE.getDefaultState(), Iron.veinSizeAndesiteIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkAndesiteIronOre.get(), Iron.minHeightAndesiteIronOre.get(), 0, Iron.maxHeightAndesiteIronOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Iron.enableDioriteIronOre.get()) {
                if ((Iron.isTempWhitelistDioriteIronOre.get() && Iron.temperatureBlacklistDioriteIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistDioriteIronOre.get() && !Iron.temperatureBlacklistDioriteIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistDioriteIronOre.get() && Iron.biomeBlacklistDioriteIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistDioriteIronOre.get() && !Iron.biomeBlacklistDioriteIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_IRON_ORE.getDefaultState(), Iron.veinSizeDioriteIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkDioriteIronOre.get(), Iron.minHeightDioriteIronOre.get(), 0, Iron.maxHeightDioriteIronOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Iron.enableGraniteIronOre.get()) {
                if ((Iron.isTempWhitelistGraniteIronOre.get() && Iron.temperatureBlacklistGraniteIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistGraniteIronOre.get() && !Iron.temperatureBlacklistGraniteIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistGraniteIronOre.get() && Iron.biomeBlacklistGraniteIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistGraniteIronOre.get() && !Iron.biomeBlacklistGraniteIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_IRON_ORE.getDefaultState(), Iron.veinSizeGraniteIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkGraniteIronOre.get(), Iron.minHeightGraniteIronOre.get(), 0, Iron.maxHeightGraniteIronOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Iron.enableNetherrackIronOre.get()) {
                if ((Iron.isTempWhitelistNetherrackIronOre.get() && Iron.temperatureBlacklistNetherrackIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistNetherrackIronOre.get() && !Iron.temperatureBlacklistNetherrackIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistNetherrackIronOre.get() && Iron.biomeBlacklistNetherrackIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistNetherrackIronOre.get() && !Iron.biomeBlacklistNetherrackIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_IRON_ORE.getDefaultState(), Iron.veinSizeNetherrackIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkNetherrackIronOre.get(), Iron.minHeightNetherrackIronOre.get(), 0, Iron.maxHeightNetherrackIronOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Iron.enableEndStoneIronOre.get()) {
                if ((Iron.isTempWhitelistEndStoneIronOre.get() && Iron.temperatureBlacklistEndStoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistEndStoneIronOre.get() && !Iron.temperatureBlacklistEndStoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistEndStoneIronOre.get() && Iron.biomeBlacklistEndStoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistEndStoneIronOre.get() && !Iron.biomeBlacklistEndStoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_IRON_ORE.getDefaultState(), Iron.veinSizeEndStoneIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkEndStoneIronOre.get(), Iron.minHeightEndStoneIronOre.get(), 0, Iron.maxHeightEndStoneIronOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Iron.enableSandIronOre.get()) {
                if ((Iron.isTempWhitelistSandIronOre.get() && Iron.temperatureBlacklistSandIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistSandIronOre.get() && !Iron.temperatureBlacklistSandIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistSandIronOre.get() && Iron.biomeBlacklistSandIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistSandIronOre.get() && !Iron.biomeBlacklistSandIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_IRON_ORE.getDefaultState(), Iron.veinSizeSandIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkSandIronOre.get(), Iron.minHeightSandIronOre.get(), 0, Iron.maxHeightSandIronOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Iron.enableGravelIronOre.get()) {
                if ((Iron.isTempWhitelistGravelIronOre.get() && Iron.temperatureBlacklistGravelIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistGravelIronOre.get() && !Iron.temperatureBlacklistGravelIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistGravelIronOre.get() && Iron.biomeBlacklistGravelIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistGravelIronOre.get() && !Iron.biomeBlacklistGravelIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_IRON_ORE.getDefaultState(), Iron.veinSizeGravelIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkGravelIronOre.get(), Iron.minHeightGravelIronOre.get(), 0, Iron.maxHeightGravelIronOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Iron.enableSandstoneIronOre.get()) {
                if ((Iron.isTempWhitelistSandstoneIronOre.get() && Iron.temperatureBlacklistSandstoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistSandstoneIronOre.get() && !Iron.temperatureBlacklistSandstoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistSandstoneIronOre.get() && Iron.biomeBlacklistSandstoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistSandstoneIronOre.get() && !Iron.biomeBlacklistSandstoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_IRON_ORE.getDefaultState(), Iron.veinSizeSandstoneIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkSandstoneIronOre.get(), Iron.minHeightSandstoneIronOre.get(), 0, Iron.maxHeightSandstoneIronOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Iron.enableRedSandstoneIronOre.get()) {
                if ((Iron.isTempWhitelistRedSandstoneIronOre.get() && Iron.temperatureBlacklistRedSandstoneIronOre.get().contains(biomeTS)) || (!Iron.isTempWhitelistRedSandstoneIronOre.get() && !Iron.temperatureBlacklistRedSandstoneIronOre.get().contains(biomeTS))) {
                    if ((Iron.isBiomeWhitelistRedSandstoneIronOre.get() && Iron.biomeBlacklistRedSandstoneIronOre.get().contains(biomeRNS)) || (!Iron.isBiomeWhitelistRedSandstoneIronOre.get() && !Iron.biomeBlacklistRedSandstoneIronOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_IRON_ORE.getDefaultState(), Iron.veinSizeRedSandstoneIronOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Iron.veinsPerChunkRedSandstoneIronOre.get(), Iron.minHeightRedSandstoneIronOre.get(), 0, Iron.maxHeightRedSandstoneIronOre.get()))));
                    } } } }
    }
}
