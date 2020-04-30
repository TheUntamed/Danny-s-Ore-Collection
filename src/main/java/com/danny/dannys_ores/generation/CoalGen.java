package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Coal;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class CoalGen {

    public static void addCoalGen(Biome biome, String biomeRNS, String biomeTS) {
        addCoalOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addCoalOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Coal.enableVanillaCoalOre.get()) {
                if ((Coal.isTempWhitelistVanillaCoalOre.get() && Coal.temperatureBlacklistVanillaCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistVanillaCoalOre.get() && !Coal.temperatureBlacklistVanillaCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistVanillaCoalOre.get() && Coal.biomeBlacklistVanillaCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistVanillaCoalOre.get() && !Coal.biomeBlacklistVanillaCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.COAL_ORE.getDefaultState(), Coal.veinSizeVanillaCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(9, 8, 0, 6))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Coal.enableAndesiteCoalOre.get()) {
                if ((Coal.isTempWhitelistAndesiteCoalOre.get() && Coal.temperatureBlacklistAndesiteCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistAndesiteCoalOre.get() && !Coal.temperatureBlacklistAndesiteCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistAndesiteCoalOre.get() && Coal.biomeBlacklistAndesiteCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistAndesiteCoalOre.get() && !Coal.biomeBlacklistAndesiteCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_COAL_ORE.get().getDefaultState(), Coal.veinSizeAndesiteCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkAndesiteCoalOre.get(), Coal.minHeightAndesiteCoalOre.get(), 0, Coal.maxHeightAndesiteCoalOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Coal.enableDioriteCoalOre.get()) {
                if ((Coal.isTempWhitelistDioriteCoalOre.get() && Coal.temperatureBlacklistDioriteCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistDioriteCoalOre.get() && !Coal.temperatureBlacklistDioriteCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistDioriteCoalOre.get() && Coal.biomeBlacklistDioriteCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistDioriteCoalOre.get() && !Coal.biomeBlacklistDioriteCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_COAL_ORE.get().getDefaultState(), Coal.veinSizeDioriteCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkDioriteCoalOre.get(), Coal.minHeightDioriteCoalOre.get(), 0, Coal.maxHeightDioriteCoalOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Coal.enableGraniteCoalOre.get()) {
                if ((Coal.isTempWhitelistGraniteCoalOre.get() && Coal.temperatureBlacklistGraniteCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistGraniteCoalOre.get() && !Coal.temperatureBlacklistGraniteCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistGraniteCoalOre.get() && Coal.biomeBlacklistGraniteCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistGraniteCoalOre.get() && !Coal.biomeBlacklistGraniteCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_COAL_ORE.get().getDefaultState(), Coal.veinSizeGraniteCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkGraniteCoalOre.get(), Coal.minHeightGraniteCoalOre.get(), 0, Coal.maxHeightGraniteCoalOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Coal.enableNetherrackCoalOre.get()) {
                if ((Coal.isTempWhitelistNetherrackCoalOre.get() && Coal.temperatureBlacklistNetherrackCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistNetherrackCoalOre.get() && !Coal.temperatureBlacklistNetherrackCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistNetherrackCoalOre.get() && Coal.biomeBlacklistNetherrackCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistNetherrackCoalOre.get() && !Coal.biomeBlacklistNetherrackCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_COAL_ORE.get().getDefaultState(), Coal.veinSizeNetherrackCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkNetherrackCoalOre.get(), Coal.minHeightNetherrackCoalOre.get(), 0, Coal.maxHeightNetherrackCoalOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Coal.enableEndStoneCoalOre.get()) {
                if ((Coal.isTempWhitelistEndStoneCoalOre.get() && Coal.temperatureBlacklistEndStoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEndStoneCoalOre.get() && !Coal.temperatureBlacklistEndStoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEndStoneCoalOre.get() && Coal.biomeBlacklistEndStoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEndStoneCoalOre.get() && !Coal.biomeBlacklistEndStoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_COAL_ORE.get().getDefaultState(), Coal.veinSizeEndStoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEndStoneCoalOre.get(), Coal.minHeightEndStoneCoalOre.get(), 0, Coal.maxHeightEndStoneCoalOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Coal.enableSandCoalOre.get()) {
                if ((Coal.isTempWhitelistSandCoalOre.get() && Coal.temperatureBlacklistSandCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistSandCoalOre.get() && !Coal.temperatureBlacklistSandCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistSandCoalOre.get() && Coal.biomeBlacklistSandCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistSandCoalOre.get() && !Coal.biomeBlacklistSandCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_COAL_ORE.get().getDefaultState(), Coal.veinSizeSandCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkSandCoalOre.get(), Coal.minHeightSandCoalOre.get(), 0, Coal.maxHeightSandCoalOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Coal.enableGravelCoalOre.get()) {
                if ((Coal.isTempWhitelistGravelCoalOre.get() && Coal.temperatureBlacklistGravelCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistGravelCoalOre.get() && !Coal.temperatureBlacklistGravelCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistGravelCoalOre.get() && Coal.biomeBlacklistGravelCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistGravelCoalOre.get() && !Coal.biomeBlacklistGravelCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_COAL_ORE.get().getDefaultState(), Coal.veinSizeGravelCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkGravelCoalOre.get(), Coal.minHeightGravelCoalOre.get(), 0, Coal.maxHeightGravelCoalOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Coal.enableSandstoneCoalOre.get()) {
                if ((Coal.isTempWhitelistSandstoneCoalOre.get() && Coal.temperatureBlacklistSandstoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistSandstoneCoalOre.get() && !Coal.temperatureBlacklistSandstoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistSandstoneCoalOre.get() && Coal.biomeBlacklistSandstoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistSandstoneCoalOre.get() && !Coal.biomeBlacklistSandstoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_COAL_ORE.get().getDefaultState(), Coal.veinSizeSandstoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkSandstoneCoalOre.get(), Coal.minHeightSandstoneCoalOre.get(), 0, Coal.maxHeightSandstoneCoalOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Coal.enableRedSandstoneCoalOre.get()) {
                if ((Coal.isTempWhitelistRedSandstoneCoalOre.get() && Coal.temperatureBlacklistRedSandstoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistRedSandstoneCoalOre.get() && !Coal.temperatureBlacklistRedSandstoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistRedSandstoneCoalOre.get() && Coal.biomeBlacklistRedSandstoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistRedSandstoneCoalOre.get() && !Coal.biomeBlacklistRedSandstoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_COAL_ORE.get().getDefaultState(), Coal.veinSizeRedSandstoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkRedSandstoneCoalOre.get(), Coal.minHeightRedSandstoneCoalOre.get(), 0, Coal.maxHeightRedSandstoneCoalOre.get()))));
                    } } } }
    }
}
