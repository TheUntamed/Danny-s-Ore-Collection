package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Lapis;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class LapisGen {

    public static void addLapisGen(Biome biome, String biomeRNS, String biomeTS) {
        addLapisOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addLapisOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Lapis.enableVanillaLapisOre.get()) {
                if ((Lapis.isTempWhitelistVanillaLapisOre.get() && Lapis.temperatureBlacklistVanillaLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistVanillaLapisOre.get() && !Lapis.temperatureBlacklistVanillaLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistVanillaLapisOre.get() && Lapis.biomeBlacklistVanillaLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistVanillaLapisOre.get() && !Lapis.biomeBlacklistVanillaLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.LAPIS_ORE.getDefaultState(), Lapis.veinSizeVanillaLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkVanillaLapisOre.get(), Lapis.minHeightVanillaLapisOre.get(), 0, Lapis.maxHeightVanillaLapisOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Lapis.enableAndesiteLapisOre.get()) {
                if ((Lapis.isTempWhitelistAndesiteLapisOre.get() && Lapis.temperatureBlacklistAndesiteLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistAndesiteLapisOre.get() && !Lapis.temperatureBlacklistAndesiteLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistAndesiteLapisOre.get() && Lapis.biomeBlacklistAndesiteLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistAndesiteLapisOre.get() && !Lapis.biomeBlacklistAndesiteLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeAndesiteLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkAndesiteLapisOre.get(), Lapis.minHeightAndesiteLapisOre.get(), 0, Lapis.maxHeightAndesiteLapisOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Lapis.enableDioriteLapisOre.get()) {
                if ((Lapis.isTempWhitelistDioriteLapisOre.get() && Lapis.temperatureBlacklistDioriteLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistDioriteLapisOre.get() && !Lapis.temperatureBlacklistDioriteLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistDioriteLapisOre.get() && Lapis.biomeBlacklistDioriteLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistDioriteLapisOre.get() && !Lapis.biomeBlacklistDioriteLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeDioriteLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkDioriteLapisOre.get(), Lapis.minHeightDioriteLapisOre.get(), 0, Lapis.maxHeightDioriteLapisOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Lapis.enableGraniteLapisOre.get()) {
                if ((Lapis.isTempWhitelistGraniteLapisOre.get() && Lapis.temperatureBlacklistGraniteLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistGraniteLapisOre.get() && !Lapis.temperatureBlacklistGraniteLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistGraniteLapisOre.get() && Lapis.biomeBlacklistGraniteLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistGraniteLapisOre.get() && !Lapis.biomeBlacklistGraniteLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeGraniteLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkGraniteLapisOre.get(), Lapis.minHeightGraniteLapisOre.get(), 0, Lapis.maxHeightGraniteLapisOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Lapis.enableNetherrackLapisOre.get()) {
                if ((Lapis.isTempWhitelistNetherrackLapisOre.get() && Lapis.temperatureBlacklistNetherrackLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistNetherrackLapisOre.get() && !Lapis.temperatureBlacklistNetherrackLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistNetherrackLapisOre.get() && Lapis.biomeBlacklistNetherrackLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistNetherrackLapisOre.get() && !Lapis.biomeBlacklistNetherrackLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeNetherrackLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkNetherrackLapisOre.get(), Lapis.minHeightNetherrackLapisOre.get(), 0, Lapis.maxHeightNetherrackLapisOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Lapis.enableEndStoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistEndStoneLapisOre.get() && Lapis.temperatureBlacklistEndStoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistEndStoneLapisOre.get() && !Lapis.temperatureBlacklistEndStoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistEndStoneLapisOre.get() && Lapis.biomeBlacklistEndStoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistEndStoneLapisOre.get() && !Lapis.biomeBlacklistEndStoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeEndStoneLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkEndStoneLapisOre.get(), Lapis.minHeightEndStoneLapisOre.get(), 0, Lapis.maxHeightEndStoneLapisOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Lapis.enableSandLapisOre.get()) {
                if ((Lapis.isTempWhitelistSandLapisOre.get() && Lapis.temperatureBlacklistSandLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistSandLapisOre.get() && !Lapis.temperatureBlacklistSandLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistSandLapisOre.get() && Lapis.biomeBlacklistSandLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistSandLapisOre.get() && !Lapis.biomeBlacklistSandLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeSandLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkSandLapisOre.get(), Lapis.minHeightSandLapisOre.get(), 0, Lapis.maxHeightSandLapisOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Lapis.enableGravelLapisOre.get()) {
                if ((Lapis.isTempWhitelistGravelLapisOre.get() && Lapis.temperatureBlacklistGravelLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistGravelLapisOre.get() && !Lapis.temperatureBlacklistGravelLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistGravelLapisOre.get() && Lapis.biomeBlacklistGravelLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistGravelLapisOre.get() && !Lapis.biomeBlacklistGravelLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeGravelLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkGravelLapisOre.get(), Lapis.minHeightGravelLapisOre.get(), 0, Lapis.maxHeightGravelLapisOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Lapis.enableSandstoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistSandstoneLapisOre.get() && Lapis.temperatureBlacklistSandstoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistSandstoneLapisOre.get() && !Lapis.temperatureBlacklistSandstoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistSandstoneLapisOre.get() && Lapis.biomeBlacklistSandstoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistSandstoneLapisOre.get() && !Lapis.biomeBlacklistSandstoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeSandstoneLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkSandstoneLapisOre.get(), Lapis.minHeightSandstoneLapisOre.get(), 0, Lapis.maxHeightSandstoneLapisOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Lapis.enableRedSandstoneLapisOre.get()) {
                if ((Lapis.isTempWhitelistRedSandstoneLapisOre.get() && Lapis.temperatureBlacklistRedSandstoneLapisOre.get().contains(biomeTS)) || (!Lapis.isTempWhitelistRedSandstoneLapisOre.get() && !Lapis.temperatureBlacklistRedSandstoneLapisOre.get().contains(biomeTS))) {
                    if ((Lapis.isBiomeWhitelistRedSandstoneLapisOre.get() && Lapis.biomeBlacklistRedSandstoneLapisOre.get().contains(biomeRNS)) || (!Lapis.isBiomeWhitelistRedSandstoneLapisOre.get() && !Lapis.biomeBlacklistRedSandstoneLapisOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_LAPIS_ORE.get().getDefaultState(), Lapis.veinSizeRedSandstoneLapisOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lapis.veinsPerChunkRedSandstoneLapisOre.get(), Lapis.minHeightRedSandstoneLapisOre.get(), 0, Lapis.maxHeightRedSandstoneLapisOre.get()))));
                    } } } }
    }
}
