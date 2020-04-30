package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.Xp;
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

public class XpGen {

    public static void addXpGen(Biome biome, String biomeRNS, String biomeTS) {
        addXpOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addXpOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (!General.disableStoneOreGeneration.get()) {
            if (Xp.enableStoneXpOre.get()) {
                if ((Xp.isTempWhitelistStoneXpOre.get() && Xp.temperatureBlacklistStoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistStoneXpOre.get() && !Xp.temperatureBlacklistStoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistStoneXpOre.get() && Xp.biomeBlacklistStoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistStoneXpOre.get() && !Xp.biomeBlacklistStoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_XP_ORE.get().getDefaultState(), Xp.veinSizeStoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkStoneXpOre.get(), Xp.minHeightStoneXpOre.get(), 0, Xp.maxHeightStoneXpOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Xp.enableAndesiteXpOre.get()) {
                if ((Xp.isTempWhitelistAndesiteXpOre.get() && Xp.temperatureBlacklistAndesiteXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistAndesiteXpOre.get() && !Xp.temperatureBlacklistAndesiteXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistAndesiteXpOre.get() && Xp.biomeBlacklistAndesiteXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistAndesiteXpOre.get() && !Xp.biomeBlacklistAndesiteXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_XP_ORE.get().getDefaultState(), Xp.veinSizeAndesiteXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkAndesiteXpOre.get(), Xp.minHeightAndesiteXpOre.get(), 0, Xp.maxHeightAndesiteXpOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Xp.enableDioriteXpOre.get()) {
                if ((Xp.isTempWhitelistDioriteXpOre.get() && Xp.temperatureBlacklistDioriteXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistDioriteXpOre.get() && !Xp.temperatureBlacklistDioriteXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistDioriteXpOre.get() && Xp.biomeBlacklistDioriteXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistDioriteXpOre.get() && !Xp.biomeBlacklistDioriteXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_XP_ORE.get().getDefaultState(), Xp.veinSizeDioriteXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkDioriteXpOre.get(), Xp.minHeightDioriteXpOre.get(), 0, Xp.maxHeightDioriteXpOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Xp.enableGraniteXpOre.get()) {
                if ((Xp.isTempWhitelistGraniteXpOre.get() && Xp.temperatureBlacklistGraniteXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistGraniteXpOre.get() && !Xp.temperatureBlacklistGraniteXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistGraniteXpOre.get() && Xp.biomeBlacklistGraniteXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistGraniteXpOre.get() && !Xp.biomeBlacklistGraniteXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_XP_ORE.get().getDefaultState(), Xp.veinSizeGraniteXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkGraniteXpOre.get(), Xp.minHeightGraniteXpOre.get(), 0, Xp.maxHeightGraniteXpOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Xp.enableNetherrackXpOre.get()) {
                if ((Xp.isTempWhitelistNetherrackXpOre.get() && Xp.temperatureBlacklistNetherrackXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistNetherrackXpOre.get() && !Xp.temperatureBlacklistNetherrackXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistNetherrackXpOre.get() && Xp.biomeBlacklistNetherrackXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistNetherrackXpOre.get() && !Xp.biomeBlacklistNetherrackXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_XP_ORE.get().getDefaultState(), Xp.veinSizeNetherrackXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkNetherrackXpOre.get(), Xp.minHeightNetherrackXpOre.get(), 0, Xp.maxHeightNetherrackXpOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Xp.enableEndStoneXpOre.get()) {
                if ((Xp.isTempWhitelistEndStoneXpOre.get() && Xp.temperatureBlacklistEndStoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistEndStoneXpOre.get() && !Xp.temperatureBlacklistEndStoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistEndStoneXpOre.get() && Xp.biomeBlacklistEndStoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistEndStoneXpOre.get() && !Xp.biomeBlacklistEndStoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_XP_ORE.get().getDefaultState(), Xp.veinSizeEndStoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkEndStoneXpOre.get(), Xp.minHeightEndStoneXpOre.get(), 0, Xp.maxHeightEndStoneXpOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Xp.enableSandXpOre.get()) {
                if ((Xp.isTempWhitelistSandXpOre.get() && Xp.temperatureBlacklistSandXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistSandXpOre.get() && !Xp.temperatureBlacklistSandXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistSandXpOre.get() && Xp.biomeBlacklistSandXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistSandXpOre.get() && !Xp.biomeBlacklistSandXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_XP_ORE.get().getDefaultState(), Xp.veinSizeSandXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkSandXpOre.get(), Xp.minHeightSandXpOre.get(), 0, Xp.maxHeightSandXpOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Xp.enableGravelXpOre.get()) {
                if ((Xp.isTempWhitelistGravelXpOre.get() && Xp.temperatureBlacklistGravelXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistGravelXpOre.get() && !Xp.temperatureBlacklistGravelXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistGravelXpOre.get() && Xp.biomeBlacklistGravelXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistGravelXpOre.get() && !Xp.biomeBlacklistGravelXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_XP_ORE.get().getDefaultState(), Xp.veinSizeGravelXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkGravelXpOre.get(), Xp.minHeightGravelXpOre.get(), 0, Xp.maxHeightGravelXpOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Xp.enableSandstoneXpOre.get()) {
                if ((Xp.isTempWhitelistSandstoneXpOre.get() && Xp.temperatureBlacklistSandstoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistSandstoneXpOre.get() && !Xp.temperatureBlacklistSandstoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistSandstoneXpOre.get() && Xp.biomeBlacklistSandstoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistSandstoneXpOre.get() && !Xp.biomeBlacklistSandstoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_XP_ORE.get().getDefaultState(), Xp.veinSizeSandstoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkSandstoneXpOre.get(), Xp.minHeightSandstoneXpOre.get(), 0, Xp.maxHeightSandstoneXpOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Xp.enableRedSandstoneXpOre.get()) {
                if ((Xp.isTempWhitelistRedSandstoneXpOre.get() && Xp.temperatureBlacklistRedSandstoneXpOre.get().contains(biomeTS)) || (!Xp.isTempWhitelistRedSandstoneXpOre.get() && !Xp.temperatureBlacklistRedSandstoneXpOre.get().contains(biomeTS))) {
                    if ((Xp.isBiomeWhitelistRedSandstoneXpOre.get() && Xp.biomeBlacklistRedSandstoneXpOre.get().contains(biomeRNS)) || (!Xp.isBiomeWhitelistRedSandstoneXpOre.get() && !Xp.biomeBlacklistRedSandstoneXpOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_XP_ORE.get().getDefaultState(), Xp.veinSizeRedSandstoneXpOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Xp.veinsPerChunkRedSandstoneXpOre.get(), Xp.minHeightRedSandstoneXpOre.get(), 0, Xp.maxHeightRedSandstoneXpOre.get()))));
                    } } } }
    }
}
