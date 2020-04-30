package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Emerald;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class EmeraldGen {

    public static void addEmeraldGen(Biome biome, String biomeRNS, String biomeTS) {
        addEmeraldOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addEmeraldOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Emerald.enableVanillaEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistVanillaEmeraldOre.get() && Emerald.temperatureBlacklistVanillaEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistVanillaEmeraldOre.get() && !Emerald.temperatureBlacklistVanillaEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistVanillaEmeraldOre.get() && Emerald.biomeBlacklistVanillaEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistVanillaEmeraldOre.get() && !Emerald.biomeBlacklistVanillaEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.EMERALD_ORE.getDefaultState(), Emerald.veinSizeVanillaEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkVanillaEmeraldOre.get(), Emerald.minHeightVanillaEmeraldOre.get(), 0, Emerald.maxHeightVanillaEmeraldOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Emerald.enableAndesiteEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistAndesiteEmeraldOre.get() && Emerald.temperatureBlacklistAndesiteEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistAndesiteEmeraldOre.get() && !Emerald.temperatureBlacklistAndesiteEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistAndesiteEmeraldOre.get() && Emerald.biomeBlacklistAndesiteEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistAndesiteEmeraldOre.get() && !Emerald.biomeBlacklistAndesiteEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeAndesiteEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkAndesiteEmeraldOre.get(), Emerald.minHeightAndesiteEmeraldOre.get(), 0, Emerald.maxHeightAndesiteEmeraldOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Emerald.enableDioriteEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistDioriteEmeraldOre.get() && Emerald.temperatureBlacklistDioriteEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistDioriteEmeraldOre.get() && !Emerald.temperatureBlacklistDioriteEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistDioriteEmeraldOre.get() && Emerald.biomeBlacklistDioriteEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistDioriteEmeraldOre.get() && !Emerald.biomeBlacklistDioriteEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeDioriteEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkDioriteEmeraldOre.get(), Emerald.minHeightDioriteEmeraldOre.get(), 0, Emerald.maxHeightDioriteEmeraldOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Emerald.enableGraniteEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistGraniteEmeraldOre.get() && Emerald.temperatureBlacklistGraniteEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistGraniteEmeraldOre.get() && !Emerald.temperatureBlacklistGraniteEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistGraniteEmeraldOre.get() && Emerald.biomeBlacklistGraniteEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistGraniteEmeraldOre.get() && !Emerald.biomeBlacklistGraniteEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeGraniteEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkGraniteEmeraldOre.get(), Emerald.minHeightGraniteEmeraldOre.get(), 0, Emerald.maxHeightGraniteEmeraldOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Emerald.enableNetherrackEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistNetherrackEmeraldOre.get() && Emerald.temperatureBlacklistNetherrackEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistNetherrackEmeraldOre.get() && !Emerald.temperatureBlacklistNetherrackEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistNetherrackEmeraldOre.get() && Emerald.biomeBlacklistNetherrackEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistNetherrackEmeraldOre.get() && !Emerald.biomeBlacklistNetherrackEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeNetherrackEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkNetherrackEmeraldOre.get(), Emerald.minHeightNetherrackEmeraldOre.get(), 0, Emerald.maxHeightNetherrackEmeraldOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Emerald.enableEndStoneEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistEndStoneEmeraldOre.get() && Emerald.temperatureBlacklistEndStoneEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistEndStoneEmeraldOre.get() && !Emerald.temperatureBlacklistEndStoneEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistEndStoneEmeraldOre.get() && Emerald.biomeBlacklistEndStoneEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistEndStoneEmeraldOre.get() && !Emerald.biomeBlacklistEndStoneEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeEndStoneEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkEndStoneEmeraldOre.get(), Emerald.minHeightEndStoneEmeraldOre.get(), 0, Emerald.maxHeightEndStoneEmeraldOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Emerald.enableSandEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistSandEmeraldOre.get() && Emerald.temperatureBlacklistSandEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistSandEmeraldOre.get() && !Emerald.temperatureBlacklistSandEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistSandEmeraldOre.get() && Emerald.biomeBlacklistSandEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistSandEmeraldOre.get() && !Emerald.biomeBlacklistSandEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeSandEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkSandEmeraldOre.get(), Emerald.minHeightSandEmeraldOre.get(), 0, Emerald.maxHeightSandEmeraldOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Emerald.enableGravelEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistGravelEmeraldOre.get() && Emerald.temperatureBlacklistGravelEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistGravelEmeraldOre.get() && !Emerald.temperatureBlacklistGravelEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistGravelEmeraldOre.get() && Emerald.biomeBlacklistGravelEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistGravelEmeraldOre.get() && !Emerald.biomeBlacklistGravelEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeGravelEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkGravelEmeraldOre.get(), Emerald.minHeightGravelEmeraldOre.get(), 0, Emerald.maxHeightGravelEmeraldOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Emerald.enableSandstoneEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistSandstoneEmeraldOre.get() && Emerald.temperatureBlacklistSandstoneEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistSandstoneEmeraldOre.get() && !Emerald.temperatureBlacklistSandstoneEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistSandstoneEmeraldOre.get() && Emerald.biomeBlacklistSandstoneEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistSandstoneEmeraldOre.get() && !Emerald.biomeBlacklistSandstoneEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeSandstoneEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkSandstoneEmeraldOre.get(), Emerald.minHeightSandstoneEmeraldOre.get(), 0, Emerald.maxHeightSandstoneEmeraldOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Emerald.enableRedSandstoneEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistRedSandstoneEmeraldOre.get() && Emerald.temperatureBlacklistRedSandstoneEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistRedSandstoneEmeraldOre.get() && !Emerald.temperatureBlacklistRedSandstoneEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistRedSandstoneEmeraldOre.get() && Emerald.biomeBlacklistRedSandstoneEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistRedSandstoneEmeraldOre.get() && !Emerald.biomeBlacklistRedSandstoneEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeRedSandstoneEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkRedSandstoneEmeraldOre.get(), Emerald.minHeightRedSandstoneEmeraldOre.get(), 0, Emerald.maxHeightRedSandstoneEmeraldOre.get()))));
                    } } } }
    }
}
