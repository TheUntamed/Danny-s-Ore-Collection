package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class CopperGen {

    public static void addCopperGen(Biome biome, String biomeRNS, String biomeTS) {
        addCopperOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addCopperOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Copper.enableStoneCopperOre.get()) {
                if ((Copper.isTempWhitelistStoneCopperOre.get() && Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistStoneCopperOre.get() && !Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistStoneCopperOre.get() && Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistStoneCopperOre.get() && !Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkStoneCopperOre.get(), Copper.minHeightStoneCopperOre.get(), 0, Copper.maxHeightStoneCopperOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Copper.enableAndesiteCopperOre.get()) {
                if ((Copper.isTempWhitelistAndesiteCopperOre.get() && Copper.temperatureBlacklistAndesiteCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistAndesiteCopperOre.get() && !Copper.temperatureBlacklistAndesiteCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistAndesiteCopperOre.get() && Copper.biomeBlacklistAndesiteCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistAndesiteCopperOre.get() && !Copper.biomeBlacklistAndesiteCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeAndesiteCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkAndesiteCopperOre.get(), Copper.minHeightAndesiteCopperOre.get(), 0, Copper.maxHeightAndesiteCopperOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Copper.enableDioriteCopperOre.get()) {
                if ((Copper.isTempWhitelistDioriteCopperOre.get() && Copper.temperatureBlacklistDioriteCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistDioriteCopperOre.get() && !Copper.temperatureBlacklistDioriteCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistDioriteCopperOre.get() && Copper.biomeBlacklistDioriteCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistDioriteCopperOre.get() && !Copper.biomeBlacklistDioriteCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeDioriteCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkDioriteCopperOre.get(), Copper.minHeightDioriteCopperOre.get(), 0, Copper.maxHeightDioriteCopperOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Copper.enableGraniteCopperOre.get()) {
                if ((Copper.isTempWhitelistGraniteCopperOre.get() && Copper.temperatureBlacklistGraniteCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistGraniteCopperOre.get() && !Copper.temperatureBlacklistGraniteCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistGraniteCopperOre.get() && Copper.biomeBlacklistGraniteCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistGraniteCopperOre.get() && !Copper.biomeBlacklistGraniteCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeGraniteCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkGraniteCopperOre.get(), Copper.minHeightGraniteCopperOre.get(), 0, Copper.maxHeightGraniteCopperOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Copper.enableNetherrackCopperOre.get()) {
                if ((Copper.isTempWhitelistNetherrackCopperOre.get() && Copper.temperatureBlacklistNetherrackCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistNetherrackCopperOre.get() && !Copper.temperatureBlacklistNetherrackCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistNetherrackCopperOre.get() && Copper.biomeBlacklistNetherrackCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistNetherrackCopperOre.get() && !Copper.biomeBlacklistNetherrackCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_COPPER_ORE.get().getDefaultState(), Copper.veinSizeNetherrackCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkNetherrackCopperOre.get(), Copper.minHeightNetherrackCopperOre.get(), 0, Copper.maxHeightNetherrackCopperOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Copper.enableEndStoneCopperOre.get()) {
                if ((Copper.isTempWhitelistEndStoneCopperOre.get() && Copper.temperatureBlacklistEndStoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistEndStoneCopperOre.get() && !Copper.temperatureBlacklistEndStoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistEndStoneCopperOre.get() && Copper.biomeBlacklistEndStoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistEndStoneCopperOre.get() && !Copper.biomeBlacklistEndStoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeEndStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkEndStoneCopperOre.get(), Copper.minHeightEndStoneCopperOre.get(), 0, Copper.maxHeightEndStoneCopperOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Copper.enableSandCopperOre.get()) {
                if ((Copper.isTempWhitelistSandCopperOre.get() && Copper.temperatureBlacklistSandCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistSandCopperOre.get() && !Copper.temperatureBlacklistSandCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistSandCopperOre.get() && Copper.biomeBlacklistSandCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistSandCopperOre.get() && !Copper.biomeBlacklistSandCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_COPPER_ORE.get().getDefaultState(), Copper.veinSizeSandCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkSandCopperOre.get(), Copper.minHeightSandCopperOre.get(), 0, Copper.maxHeightSandCopperOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Copper.enableGravelCopperOre.get()) {
                if ((Copper.isTempWhitelistGravelCopperOre.get() && Copper.temperatureBlacklistGravelCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistGravelCopperOre.get() && !Copper.temperatureBlacklistGravelCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistGravelCopperOre.get() && Copper.biomeBlacklistGravelCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistGravelCopperOre.get() && !Copper.biomeBlacklistGravelCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_COPPER_ORE.get().getDefaultState(), Copper.veinSizeGravelCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkGravelCopperOre.get(), Copper.minHeightGravelCopperOre.get(), 0, Copper.maxHeightGravelCopperOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Copper.enableSandstoneCopperOre.get()) {
                if ((Copper.isTempWhitelistSandstoneCopperOre.get() && Copper.temperatureBlacklistSandstoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistSandstoneCopperOre.get() && !Copper.temperatureBlacklistSandstoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistSandstoneCopperOre.get() && Copper.biomeBlacklistSandstoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistSandstoneCopperOre.get() && !Copper.biomeBlacklistSandstoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeSandstoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkSandstoneCopperOre.get(), Copper.minHeightSandstoneCopperOre.get(), 0, Copper.maxHeightSandstoneCopperOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Copper.enableRedSandstoneCopperOre.get()) {
                if ((Copper.isTempWhitelistRedSandstoneCopperOre.get() && Copper.temperatureBlacklistRedSandstoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistRedSandstoneCopperOre.get() && !Copper.temperatureBlacklistRedSandstoneCopperOre.get().contains(biomeTS))) {
                    if ((Copper.isBiomeWhitelistRedSandstoneCopperOre.get() && Copper.biomeBlacklistRedSandstoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistRedSandstoneCopperOre.get() && !Copper.biomeBlacklistRedSandstoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_COPPER_ORE.get().getDefaultState(), Copper.veinSizeRedSandstoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkRedSandstoneCopperOre.get(), Copper.minHeightRedSandstoneCopperOre.get(), 0, Copper.maxHeightRedSandstoneCopperOre.get()))));
                    } } } }
    }
}
