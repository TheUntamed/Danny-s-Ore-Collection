package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Diamond;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class DiamondGen {

    public static void addDiamondGen(Biome biome, String biomeRNS, String biomeTS) {
        addDiamondOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addDiamondOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Diamond.enableVanillaDiamondOre.get()) {
                if ((Diamond.isTempWhitelistVanillaDiamondOre.get() && Diamond.temperatureBlacklistVanillaDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistVanillaDiamondOre.get() && !Diamond.temperatureBlacklistVanillaDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistVanillaDiamondOre.get() && Diamond.biomeBlacklistVanillaDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistVanillaDiamondOre.get() && !Diamond.biomeBlacklistVanillaDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.DIAMOND_ORE.getDefaultState(), Diamond.veinSizeVanillaDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkVanillaDiamondOre.get(), Diamond.minHeightVanillaDiamondOre.get(), 0, Diamond.maxHeightVanillaDiamondOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Diamond.enableAndesiteDiamondOre.get()) {
                if ((Diamond.isTempWhitelistAndesiteDiamondOre.get() && Diamond.temperatureBlacklistAndesiteDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistAndesiteDiamondOre.get() && !Diamond.temperatureBlacklistAndesiteDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistAndesiteDiamondOre.get() && Diamond.biomeBlacklistAndesiteDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistAndesiteDiamondOre.get() && !Diamond.biomeBlacklistAndesiteDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeAndesiteDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkAndesiteDiamondOre.get(), Diamond.minHeightAndesiteDiamondOre.get(), 0, Diamond.maxHeightAndesiteDiamondOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Diamond.enableDioriteDiamondOre.get()) {
                if ((Diamond.isTempWhitelistDioriteDiamondOre.get() && Diamond.temperatureBlacklistDioriteDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistDioriteDiamondOre.get() && !Diamond.temperatureBlacklistDioriteDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistDioriteDiamondOre.get() && Diamond.biomeBlacklistDioriteDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistDioriteDiamondOre.get() && !Diamond.biomeBlacklistDioriteDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeDioriteDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkDioriteDiamondOre.get(), Diamond.minHeightDioriteDiamondOre.get(), 0, Diamond.maxHeightDioriteDiamondOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Diamond.enableGraniteDiamondOre.get()) {
                if ((Diamond.isTempWhitelistGraniteDiamondOre.get() && Diamond.temperatureBlacklistGraniteDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistGraniteDiamondOre.get() && !Diamond.temperatureBlacklistGraniteDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistGraniteDiamondOre.get() && Diamond.biomeBlacklistGraniteDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistGraniteDiamondOre.get() && !Diamond.biomeBlacklistGraniteDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeGraniteDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkGraniteDiamondOre.get(), Diamond.minHeightGraniteDiamondOre.get(), 0, Diamond.maxHeightGraniteDiamondOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Diamond.enableNetherrackDiamondOre.get()) {
                if ((Diamond.isTempWhitelistNetherrackDiamondOre.get() && Diamond.temperatureBlacklistNetherrackDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistNetherrackDiamondOre.get() && !Diamond.temperatureBlacklistNetherrackDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistNetherrackDiamondOre.get() && Diamond.biomeBlacklistNetherrackDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistNetherrackDiamondOre.get() && !Diamond.biomeBlacklistNetherrackDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeNetherrackDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkNetherrackDiamondOre.get(), Diamond.minHeightNetherrackDiamondOre.get(), 0, Diamond.maxHeightNetherrackDiamondOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Diamond.enableEndStoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistEndStoneDiamondOre.get() && Diamond.temperatureBlacklistEndStoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistEndStoneDiamondOre.get() && !Diamond.temperatureBlacklistEndStoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistEndStoneDiamondOre.get() && Diamond.biomeBlacklistEndStoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistEndStoneDiamondOre.get() && !Diamond.biomeBlacklistEndStoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeEndStoneDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkEndStoneDiamondOre.get(), Diamond.minHeightEndStoneDiamondOre.get(), 0, Diamond.maxHeightEndStoneDiamondOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Diamond.enableSandDiamondOre.get()) {
                if ((Diamond.isTempWhitelistSandDiamondOre.get() && Diamond.temperatureBlacklistSandDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistSandDiamondOre.get() && !Diamond.temperatureBlacklistSandDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistSandDiamondOre.get() && Diamond.biomeBlacklistSandDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistSandDiamondOre.get() && !Diamond.biomeBlacklistSandDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeSandDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkSandDiamondOre.get(), Diamond.minHeightSandDiamondOre.get(), 0, Diamond.maxHeightSandDiamondOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Diamond.enableGravelDiamondOre.get()) {
                if ((Diamond.isTempWhitelistGravelDiamondOre.get() && Diamond.temperatureBlacklistGravelDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistGravelDiamondOre.get() && !Diamond.temperatureBlacklistGravelDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistGravelDiamondOre.get() && Diamond.biomeBlacklistGravelDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistGravelDiamondOre.get() && !Diamond.biomeBlacklistGravelDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeGravelDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkGravelDiamondOre.get(), Diamond.minHeightGravelDiamondOre.get(), 0, Diamond.maxHeightGravelDiamondOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Diamond.enableSandstoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistSandstoneDiamondOre.get() && Diamond.temperatureBlacklistSandstoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistSandstoneDiamondOre.get() && !Diamond.temperatureBlacklistSandstoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistSandstoneDiamondOre.get() && Diamond.biomeBlacklistSandstoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistSandstoneDiamondOre.get() && !Diamond.biomeBlacklistSandstoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeSandstoneDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkSandstoneDiamondOre.get(), Diamond.minHeightSandstoneDiamondOre.get(), 0, Diamond.maxHeightSandstoneDiamondOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Diamond.enableRedSandstoneDiamondOre.get()) {
                if ((Diamond.isTempWhitelistRedSandstoneDiamondOre.get() && Diamond.temperatureBlacklistRedSandstoneDiamondOre.get().contains(biomeTS)) || (!Diamond.isTempWhitelistRedSandstoneDiamondOre.get() && !Diamond.temperatureBlacklistRedSandstoneDiamondOre.get().contains(biomeTS))) {
                    if ((Diamond.isBiomeWhitelistRedSandstoneDiamondOre.get() && Diamond.biomeBlacklistRedSandstoneDiamondOre.get().contains(biomeRNS)) || (!Diamond.isBiomeWhitelistRedSandstoneDiamondOre.get() && !Diamond.biomeBlacklistRedSandstoneDiamondOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_DIAMOND_ORE.get().getDefaultState(), Diamond.veinSizeRedSandstoneDiamondOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Diamond.veinsPerChunkRedSandstoneDiamondOre.get(), Diamond.minHeightRedSandstoneDiamondOre.get(), 0, Diamond.maxHeightRedSandstoneDiamondOre.get()))));
                    } } } }
    }
}
