package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Gold;
import com.danny.dannys_ores.configs.Gold;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class GoldGen {

    public static void addGoldGen(Biome biome, String biomeRNS, String biomeTS) {
        addGoldOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addGoldOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Gold.enableVanillaGoldOre.get()) {
                if ((Gold.isTempWhitelistVanillaGoldOre.get() && Gold.temperatureBlacklistVanillaGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistVanillaGoldOre.get() && !Gold.temperatureBlacklistVanillaGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistVanillaGoldOre.get() && Gold.biomeBlacklistVanillaGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistVanillaGoldOre.get() && !Gold.biomeBlacklistVanillaGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.GOLD_ORE.getDefaultState(), Gold.veinSizeVanillaGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkVanillaGoldOre.get(), Gold.minHeightVanillaGoldOre.get(), 0, Gold.maxHeightVanillaGoldOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Gold.enableAndesiteGoldOre.get()) {
                if ((Gold.isTempWhitelistAndesiteGoldOre.get() && Gold.temperatureBlacklistAndesiteGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistAndesiteGoldOre.get() && !Gold.temperatureBlacklistAndesiteGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistAndesiteGoldOre.get() && Gold.biomeBlacklistAndesiteGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistAndesiteGoldOre.get() && !Gold.biomeBlacklistAndesiteGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeAndesiteGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkAndesiteGoldOre.get(), Gold.minHeightAndesiteGoldOre.get(), 0, Gold.maxHeightAndesiteGoldOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Gold.enableDioriteGoldOre.get()) {
                if ((Gold.isTempWhitelistDioriteGoldOre.get() && Gold.temperatureBlacklistDioriteGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistDioriteGoldOre.get() && !Gold.temperatureBlacklistDioriteGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistDioriteGoldOre.get() && Gold.biomeBlacklistDioriteGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistDioriteGoldOre.get() && !Gold.biomeBlacklistDioriteGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeDioriteGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkDioriteGoldOre.get(), Gold.minHeightDioriteGoldOre.get(), 0, Gold.maxHeightDioriteGoldOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Gold.enableGraniteGoldOre.get()) {
                if ((Gold.isTempWhitelistGraniteGoldOre.get() && Gold.temperatureBlacklistGraniteGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistGraniteGoldOre.get() && !Gold.temperatureBlacklistGraniteGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistGraniteGoldOre.get() && Gold.biomeBlacklistGraniteGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistGraniteGoldOre.get() && !Gold.biomeBlacklistGraniteGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeGraniteGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkGraniteGoldOre.get(), Gold.minHeightGraniteGoldOre.get(), 0, Gold.maxHeightGraniteGoldOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Gold.enableNetherrackGoldOre.get()) {
                if ((Gold.isTempWhitelistNetherrackGoldOre.get() && Gold.temperatureBlacklistNetherrackGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistNetherrackGoldOre.get() && !Gold.temperatureBlacklistNetherrackGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistNetherrackGoldOre.get() && Gold.biomeBlacklistNetherrackGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistNetherrackGoldOre.get() && !Gold.biomeBlacklistNetherrackGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_GOLD_ORE.get().getDefaultState(), Gold.veinSizeNetherrackGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkNetherrackGoldOre.get(), Gold.minHeightNetherrackGoldOre.get(), 0, Gold.maxHeightNetherrackGoldOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Gold.enableEndStoneGoldOre.get()) {
                if ((Gold.isTempWhitelistEndStoneGoldOre.get() && Gold.temperatureBlacklistEndStoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEndStoneGoldOre.get() && !Gold.temperatureBlacklistEndStoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEndStoneGoldOre.get() && Gold.biomeBlacklistEndStoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEndStoneGoldOre.get() && !Gold.biomeBlacklistEndStoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEndStoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEndStoneGoldOre.get(), Gold.minHeightEndStoneGoldOre.get(), 0, Gold.maxHeightEndStoneGoldOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Gold.enableSandGoldOre.get()) {
                if ((Gold.isTempWhitelistSandGoldOre.get() && Gold.temperatureBlacklistSandGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistSandGoldOre.get() && !Gold.temperatureBlacklistSandGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistSandGoldOre.get() && Gold.biomeBlacklistSandGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistSandGoldOre.get() && !Gold.biomeBlacklistSandGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_GOLD_ORE.get().getDefaultState(), Gold.veinSizeSandGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkSandGoldOre.get(), Gold.minHeightSandGoldOre.get(), 0, Gold.maxHeightSandGoldOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Gold.enableGravelGoldOre.get()) {
                if ((Gold.isTempWhitelistGravelGoldOre.get() && Gold.temperatureBlacklistGravelGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistGravelGoldOre.get() && !Gold.temperatureBlacklistGravelGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistGravelGoldOre.get() && Gold.biomeBlacklistGravelGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistGravelGoldOre.get() && !Gold.biomeBlacklistGravelGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_GOLD_ORE.get().getDefaultState(), Gold.veinSizeGravelGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkGravelGoldOre.get(), Gold.minHeightGravelGoldOre.get(), 0, Gold.maxHeightGravelGoldOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Gold.enableSandstoneGoldOre.get()) {
                if ((Gold.isTempWhitelistSandstoneGoldOre.get() && Gold.temperatureBlacklistSandstoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistSandstoneGoldOre.get() && !Gold.temperatureBlacklistSandstoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistSandstoneGoldOre.get() && Gold.biomeBlacklistSandstoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistSandstoneGoldOre.get() && !Gold.biomeBlacklistSandstoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeSandstoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkSandstoneGoldOre.get(), Gold.minHeightSandstoneGoldOre.get(), 0, Gold.maxHeightSandstoneGoldOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Gold.enableRedSandstoneGoldOre.get()) {
                if ((Gold.isTempWhitelistRedSandstoneGoldOre.get() && Gold.temperatureBlacklistRedSandstoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistRedSandstoneGoldOre.get() && !Gold.temperatureBlacklistRedSandstoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistRedSandstoneGoldOre.get() && Gold.biomeBlacklistRedSandstoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistRedSandstoneGoldOre.get() && !Gold.biomeBlacklistRedSandstoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeRedSandstoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkRedSandstoneGoldOre.get(), Gold.minHeightRedSandstoneGoldOre.get(), 0, Gold.maxHeightRedSandstoneGoldOre.get()))));
                    } } } }
    }
}
