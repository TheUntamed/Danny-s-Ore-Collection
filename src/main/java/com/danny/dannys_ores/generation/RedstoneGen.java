package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Redstone;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class RedstoneGen {

    public static void addRedstoneGen(Biome biome, String biomeRNS, String biomeTS) {
        addRedstoneOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addRedstoneOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Redstone.enableVanillaRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistVanillaRedstoneOre.get() && Redstone.temperatureBlacklistVanillaRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistVanillaRedstoneOre.get() && !Redstone.temperatureBlacklistVanillaRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistVanillaRedstoneOre.get() && Redstone.biomeBlacklistVanillaRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistVanillaRedstoneOre.get() && !Redstone.biomeBlacklistVanillaRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.REDSTONE_ORE.getDefaultState(), Redstone.veinSizeVanillaRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkVanillaRedstoneOre.get(), Redstone.minHeightVanillaRedstoneOre.get(), 0, Redstone.maxHeightVanillaRedstoneOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Redstone.enableAndesiteRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistAndesiteRedstoneOre.get() && Redstone.temperatureBlacklistAndesiteRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistAndesiteRedstoneOre.get() && !Redstone.temperatureBlacklistAndesiteRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistAndesiteRedstoneOre.get() && Redstone.biomeBlacklistAndesiteRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistAndesiteRedstoneOre.get() && !Redstone.biomeBlacklistAndesiteRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeAndesiteRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkAndesiteRedstoneOre.get(), Redstone.minHeightAndesiteRedstoneOre.get(), 0, Redstone.maxHeightAndesiteRedstoneOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Redstone.enableDioriteRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistDioriteRedstoneOre.get() && Redstone.temperatureBlacklistDioriteRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistDioriteRedstoneOre.get() && !Redstone.temperatureBlacklistDioriteRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistDioriteRedstoneOre.get() && Redstone.biomeBlacklistDioriteRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistDioriteRedstoneOre.get() && !Redstone.biomeBlacklistDioriteRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeDioriteRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkDioriteRedstoneOre.get(), Redstone.minHeightDioriteRedstoneOre.get(), 0, Redstone.maxHeightDioriteRedstoneOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Redstone.enableGraniteRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistGraniteRedstoneOre.get() && Redstone.temperatureBlacklistGraniteRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistGraniteRedstoneOre.get() && !Redstone.temperatureBlacklistGraniteRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistGraniteRedstoneOre.get() && Redstone.biomeBlacklistGraniteRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistGraniteRedstoneOre.get() && !Redstone.biomeBlacklistGraniteRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeGraniteRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkGraniteRedstoneOre.get(), Redstone.minHeightGraniteRedstoneOre.get(), 0, Redstone.maxHeightGraniteRedstoneOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Redstone.enableNetherrackRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistNetherrackRedstoneOre.get() && Redstone.temperatureBlacklistNetherrackRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistNetherrackRedstoneOre.get() && !Redstone.temperatureBlacklistNetherrackRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistNetherrackRedstoneOre.get() && Redstone.biomeBlacklistNetherrackRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistNetherrackRedstoneOre.get() && !Redstone.biomeBlacklistNetherrackRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeNetherrackRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkNetherrackRedstoneOre.get(), Redstone.minHeightNetherrackRedstoneOre.get(), 0, Redstone.maxHeightNetherrackRedstoneOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Redstone.enableEndStoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEndStoneRedstoneOre.get() && Redstone.temperatureBlacklistEndStoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEndStoneRedstoneOre.get() && !Redstone.temperatureBlacklistEndStoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEndStoneRedstoneOre.get() && Redstone.biomeBlacklistEndStoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEndStoneRedstoneOre.get() && !Redstone.biomeBlacklistEndStoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEndStoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEndStoneRedstoneOre.get(), Redstone.minHeightEndStoneRedstoneOre.get(), 0, Redstone.maxHeightEndStoneRedstoneOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Redstone.enableSandRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistSandRedstoneOre.get() && Redstone.temperatureBlacklistSandRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistSandRedstoneOre.get() && !Redstone.temperatureBlacklistSandRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistSandRedstoneOre.get() && Redstone.biomeBlacklistSandRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistSandRedstoneOre.get() && !Redstone.biomeBlacklistSandRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeSandRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkSandRedstoneOre.get(), Redstone.minHeightSandRedstoneOre.get(), 0, Redstone.maxHeightSandRedstoneOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Redstone.enableGravelRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistGravelRedstoneOre.get() && Redstone.temperatureBlacklistGravelRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistGravelRedstoneOre.get() && !Redstone.temperatureBlacklistGravelRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistGravelRedstoneOre.get() && Redstone.biomeBlacklistGravelRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistGravelRedstoneOre.get() && !Redstone.biomeBlacklistGravelRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeGravelRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkGravelRedstoneOre.get(), Redstone.minHeightGravelRedstoneOre.get(), 0, Redstone.maxHeightGravelRedstoneOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Redstone.enableSandstoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistSandstoneRedstoneOre.get() && Redstone.temperatureBlacklistSandstoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistSandstoneRedstoneOre.get() && !Redstone.temperatureBlacklistSandstoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistSandstoneRedstoneOre.get() && Redstone.biomeBlacklistSandstoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistSandstoneRedstoneOre.get() && !Redstone.biomeBlacklistSandstoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeSandstoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkSandstoneRedstoneOre.get(), Redstone.minHeightSandstoneRedstoneOre.get(), 0, Redstone.maxHeightSandstoneRedstoneOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Redstone.enableRedSandstoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistRedSandstoneRedstoneOre.get() && Redstone.temperatureBlacklistRedSandstoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistRedSandstoneRedstoneOre.get() && !Redstone.temperatureBlacklistRedSandstoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistRedSandstoneRedstoneOre.get() && Redstone.biomeBlacklistRedSandstoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistRedSandstoneRedstoneOre.get() && !Redstone.biomeBlacklistRedSandstoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeRedSandstoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkRedSandstoneRedstoneOre.get(), Redstone.minHeightRedSandstoneRedstoneOre.get(), 0, Redstone.maxHeightRedSandstoneRedstoneOre.get()))));
                    } } } }
    }
}
