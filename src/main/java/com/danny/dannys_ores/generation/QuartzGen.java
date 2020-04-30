package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Quartz;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class QuartzGen {

    public static void addQuartzGen(Biome biome, String biomeRNS, String biomeTS) {
        addQuartzOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addQuartzOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (!General.disableStoneOreGeneration.get()) {
            if (Quartz.enableStoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistStoneQuartzOre.get() && Quartz.temperatureBlacklistStoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistStoneQuartzOre.get() && !Quartz.temperatureBlacklistStoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistStoneQuartzOre.get() && Quartz.biomeBlacklistStoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistStoneQuartzOre.get() && !Quartz.biomeBlacklistStoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeStoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkStoneQuartzOre.get(), Quartz.minHeightStoneQuartzOre.get(), 0, Quartz.maxHeightStoneQuartzOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Quartz.enableAndesiteQuartzOre.get()) {
                if ((Quartz.isTempWhitelistAndesiteQuartzOre.get() && Quartz.temperatureBlacklistAndesiteQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistAndesiteQuartzOre.get() && !Quartz.temperatureBlacklistAndesiteQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistAndesiteQuartzOre.get() && Quartz.biomeBlacklistAndesiteQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistAndesiteQuartzOre.get() && !Quartz.biomeBlacklistAndesiteQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeAndesiteQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkAndesiteQuartzOre.get(), Quartz.minHeightAndesiteQuartzOre.get(), 0, Quartz.maxHeightAndesiteQuartzOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Quartz.enableDioriteQuartzOre.get()) {
                if ((Quartz.isTempWhitelistDioriteQuartzOre.get() && Quartz.temperatureBlacklistDioriteQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistDioriteQuartzOre.get() && !Quartz.temperatureBlacklistDioriteQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistDioriteQuartzOre.get() && Quartz.biomeBlacklistDioriteQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistDioriteQuartzOre.get() && !Quartz.biomeBlacklistDioriteQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeDioriteQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkDioriteQuartzOre.get(), Quartz.minHeightDioriteQuartzOre.get(), 0, Quartz.maxHeightDioriteQuartzOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Quartz.enableGraniteQuartzOre.get()) {
                if ((Quartz.isTempWhitelistGraniteQuartzOre.get() && Quartz.temperatureBlacklistGraniteQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistGraniteQuartzOre.get() && !Quartz.temperatureBlacklistGraniteQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistGraniteQuartzOre.get() && Quartz.biomeBlacklistGraniteQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistGraniteQuartzOre.get() && !Quartz.biomeBlacklistGraniteQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeGraniteQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkGraniteQuartzOre.get(), Quartz.minHeightGraniteQuartzOre.get(), 0, Quartz.maxHeightGraniteQuartzOre.get()))));
                    } } } }
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Quartz.enableVanillaNetherQuartzOre.get()) {
                if ((Quartz.isTempWhitelistVanillaNetherQuartzOre.get() && Quartz.temperatureBlacklistVanillaNetherQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistVanillaNetherQuartzOre.get() && !Quartz.temperatureBlacklistVanillaNetherQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistVanillaNetherQuartzOre.get() && Quartz.biomeBlacklistVanillaNetherQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistVanillaNetherQuartzOre.get() && !Quartz.biomeBlacklistVanillaNetherQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), Blocks.NETHER_QUARTZ_ORE.getDefaultState(), Quartz.veinSizeVanillaNetherQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkVanillaNetherQuartzOre.get(), Quartz.minHeightVanillaNetherQuartzOre.get(), 0, Quartz.maxHeightVanillaNetherQuartzOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Quartz.enableEndStoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEndStoneQuartzOre.get() && Quartz.temperatureBlacklistEndStoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEndStoneQuartzOre.get() && !Quartz.temperatureBlacklistEndStoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEndStoneQuartzOre.get() && Quartz.biomeBlacklistEndStoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEndStoneQuartzOre.get() && !Quartz.biomeBlacklistEndStoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEndStoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEndStoneQuartzOre.get(), Quartz.minHeightEndStoneQuartzOre.get(), 0, Quartz.maxHeightEndStoneQuartzOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Quartz.enableSandQuartzOre.get()) {
                if ((Quartz.isTempWhitelistSandQuartzOre.get() && Quartz.temperatureBlacklistSandQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistSandQuartzOre.get() && !Quartz.temperatureBlacklistSandQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistSandQuartzOre.get() && Quartz.biomeBlacklistSandQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistSandQuartzOre.get() && !Quartz.biomeBlacklistSandQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeSandQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkSandQuartzOre.get(), Quartz.minHeightSandQuartzOre.get(), 0, Quartz.maxHeightSandQuartzOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Quartz.enableGravelQuartzOre.get()) {
                if ((Quartz.isTempWhitelistGravelQuartzOre.get() && Quartz.temperatureBlacklistGravelQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistGravelQuartzOre.get() && !Quartz.temperatureBlacklistGravelQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistGravelQuartzOre.get() && Quartz.biomeBlacklistGravelQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistGravelQuartzOre.get() && !Quartz.biomeBlacklistGravelQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeGravelQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkGravelQuartzOre.get(), Quartz.minHeightGravelQuartzOre.get(), 0, Quartz.maxHeightGravelQuartzOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Quartz.enableSandstoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistSandstoneQuartzOre.get() && Quartz.temperatureBlacklistSandstoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistSandstoneQuartzOre.get() && !Quartz.temperatureBlacklistSandstoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistSandstoneQuartzOre.get() && Quartz.biomeBlacklistSandstoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistSandstoneQuartzOre.get() && !Quartz.biomeBlacklistSandstoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeSandstoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkSandstoneQuartzOre.get(), Quartz.minHeightSandstoneQuartzOre.get(), 0, Quartz.maxHeightSandstoneQuartzOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Quartz.enableRedSandstoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistRedSandstoneQuartzOre.get() && Quartz.temperatureBlacklistRedSandstoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistRedSandstoneQuartzOre.get() && !Quartz.temperatureBlacklistRedSandstoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistRedSandstoneQuartzOre.get() && Quartz.biomeBlacklistRedSandstoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistRedSandstoneQuartzOre.get() && !Quartz.biomeBlacklistRedSandstoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeRedSandstoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkRedSandstoneQuartzOre.get(), Quartz.minHeightRedSandstoneQuartzOre.get(), 0, Quartz.maxHeightRedSandstoneQuartzOre.get()))));
                    } } } }
    }
}
