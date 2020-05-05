package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Quartz;
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
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Quartz.enableStoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistStoneQuartzOre.get() && Quartz.temperatureBlacklistStoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistStoneQuartzOre.get() && !Quartz.temperatureBlacklistStoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistStoneQuartzOre.get() && Quartz.biomeBlacklistStoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistStoneQuartzOre.get() && !Quartz.biomeBlacklistStoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeStoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkStoneQuartzOre.get(), Quartz.minHeightStoneQuartzOre.get(), 0, Quartz.maxHeightStoneQuartzOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Quartz.enableAndesiteQuartzOre.get()) {
                if ((Quartz.isTempWhitelistAndesiteQuartzOre.get() && Quartz.temperatureBlacklistAndesiteQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistAndesiteQuartzOre.get() && !Quartz.temperatureBlacklistAndesiteQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistAndesiteQuartzOre.get() && Quartz.biomeBlacklistAndesiteQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistAndesiteQuartzOre.get() && !Quartz.biomeBlacklistAndesiteQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeAndesiteQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkAndesiteQuartzOre.get(), Quartz.minHeightAndesiteQuartzOre.get(), 0, Quartz.maxHeightAndesiteQuartzOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Quartz.enableDioriteQuartzOre.get()) {
                if ((Quartz.isTempWhitelistDioriteQuartzOre.get() && Quartz.temperatureBlacklistDioriteQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistDioriteQuartzOre.get() && !Quartz.temperatureBlacklistDioriteQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistDioriteQuartzOre.get() && Quartz.biomeBlacklistDioriteQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistDioriteQuartzOre.get() && !Quartz.biomeBlacklistDioriteQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeDioriteQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkDioriteQuartzOre.get(), Quartz.minHeightDioriteQuartzOre.get(), 0, Quartz.maxHeightDioriteQuartzOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Quartz.enableGraniteQuartzOre.get()) {
                if ((Quartz.isTempWhitelistGraniteQuartzOre.get() && Quartz.temperatureBlacklistGraniteQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistGraniteQuartzOre.get() && !Quartz.temperatureBlacklistGraniteQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistGraniteQuartzOre.get() && Quartz.biomeBlacklistGraniteQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistGraniteQuartzOre.get() && !Quartz.biomeBlacklistGraniteQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeGraniteQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkGraniteQuartzOre.get(), Quartz.minHeightGraniteQuartzOre.get(), 0, Quartz.maxHeightGraniteQuartzOre.get()))));
                    } } } }
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Quartz.enableVanillaNetherQuartzOre.get()) {
                if ((Quartz.isTempWhitelistVanillaNetherQuartzOre.get() && Quartz.temperatureBlacklistVanillaNetherQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistVanillaNetherQuartzOre.get() && !Quartz.temperatureBlacklistVanillaNetherQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistVanillaNetherQuartzOre.get() && Quartz.biomeBlacklistVanillaNetherQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistVanillaNetherQuartzOre.get() && !Quartz.biomeBlacklistVanillaNetherQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), Blocks.NETHER_QUARTZ_ORE.getDefaultState(), Quartz.veinSizeVanillaNetherQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkVanillaNetherQuartzOre.get(), Quartz.minHeightVanillaNetherQuartzOre.get(), 0, Quartz.maxHeightVanillaNetherQuartzOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Quartz.enableEndStoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEndStoneQuartzOre.get() && Quartz.temperatureBlacklistEndStoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEndStoneQuartzOre.get() && !Quartz.temperatureBlacklistEndStoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEndStoneQuartzOre.get() && Quartz.biomeBlacklistEndStoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEndStoneQuartzOre.get() && !Quartz.biomeBlacklistEndStoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEndStoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEndStoneQuartzOre.get(), Quartz.minHeightEndStoneQuartzOre.get(), 0, Quartz.maxHeightEndStoneQuartzOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Quartz.enableSandQuartzOre.get()) {
                if ((Quartz.isTempWhitelistSandQuartzOre.get() && Quartz.temperatureBlacklistSandQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistSandQuartzOre.get() && !Quartz.temperatureBlacklistSandQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistSandQuartzOre.get() && Quartz.biomeBlacklistSandQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistSandQuartzOre.get() && !Quartz.biomeBlacklistSandQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeSandQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkSandQuartzOre.get(), Quartz.minHeightSandQuartzOre.get(), 0, Quartz.maxHeightSandQuartzOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Quartz.enableRedSandQuartzOre.get()) {
                if ((Quartz.isTempWhitelistRedSandQuartzOre.get() && Quartz.temperatureBlacklistRedSandQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistRedSandQuartzOre.get() && !Quartz.temperatureBlacklistRedSandQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistRedSandQuartzOre.get() && Quartz.biomeBlacklistRedSandQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistRedSandQuartzOre.get() && !Quartz.biomeBlacklistRedSandQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeRedSandQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkRedSandQuartzOre.get(), Quartz.minHeightRedSandQuartzOre.get(), 0, Quartz.maxHeightRedSandQuartzOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Quartz.enableGravelQuartzOre.get()) {
                if ((Quartz.isTempWhitelistGravelQuartzOre.get() && Quartz.temperatureBlacklistGravelQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistGravelQuartzOre.get() && !Quartz.temperatureBlacklistGravelQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistGravelQuartzOre.get() && Quartz.biomeBlacklistGravelQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistGravelQuartzOre.get() && !Quartz.biomeBlacklistGravelQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeGravelQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkGravelQuartzOre.get(), Quartz.minHeightGravelQuartzOre.get(), 0, Quartz.maxHeightGravelQuartzOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Quartz.enableSandstoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistSandstoneQuartzOre.get() && Quartz.temperatureBlacklistSandstoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistSandstoneQuartzOre.get() && !Quartz.temperatureBlacklistSandstoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistSandstoneQuartzOre.get() && Quartz.biomeBlacklistSandstoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistSandstoneQuartzOre.get() && !Quartz.biomeBlacklistSandstoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeSandstoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkSandstoneQuartzOre.get(), Quartz.minHeightSandstoneQuartzOre.get(), 0, Quartz.maxHeightSandstoneQuartzOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Quartz.enableRedSandstoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistRedSandstoneQuartzOre.get() && Quartz.temperatureBlacklistRedSandstoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistRedSandstoneQuartzOre.get() && !Quartz.temperatureBlacklistRedSandstoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistRedSandstoneQuartzOre.get() && Quartz.biomeBlacklistRedSandstoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistRedSandstoneQuartzOre.get() && !Quartz.biomeBlacklistRedSandstoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeRedSandstoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkRedSandstoneQuartzOre.get(), Quartz.minHeightRedSandstoneQuartzOre.get(), 0, Quartz.maxHeightRedSandstoneQuartzOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Quartz.enableQuarkBasaltQuartzOre.get()) {
                if ((Quartz.isTempWhitelistQuarkBasaltQuartzOre.get() && Quartz.temperatureBlacklistQuarkBasaltQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistQuarkBasaltQuartzOre.get() && !Quartz.temperatureBlacklistQuarkBasaltQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistQuarkBasaltQuartzOre.get() && Quartz.biomeBlacklistQuarkBasaltQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistQuarkBasaltQuartzOre.get() && !Quartz.biomeBlacklistQuarkBasaltQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeQuarkBasaltQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkQuarkBasaltQuartzOre.get(), Quartz.minHeightQuarkBasaltQuartzOre.get(), 0, Quartz.maxHeightQuarkBasaltQuartzOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Quartz.enableQuarkMarbleQuartzOre.get()) {
                if ((Quartz.isTempWhitelistQuarkMarbleQuartzOre.get() && Quartz.temperatureBlacklistQuarkMarbleQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistQuarkMarbleQuartzOre.get() && !Quartz.temperatureBlacklistQuarkMarbleQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistQuarkMarbleQuartzOre.get() && Quartz.biomeBlacklistQuarkMarbleQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistQuarkMarbleQuartzOre.get() && !Quartz.biomeBlacklistQuarkMarbleQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeQuarkMarbleQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkQuarkMarbleQuartzOre.get(), Quartz.minHeightQuarkMarbleQuartzOre.get(), 0, Quartz.maxHeightQuarkMarbleQuartzOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Quartz.enableQuarkSlateQuartzOre.get()) {
                if ((Quartz.isTempWhitelistQuarkSlateQuartzOre.get() && Quartz.temperatureBlacklistQuarkSlateQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistQuarkSlateQuartzOre.get() && !Quartz.temperatureBlacklistQuarkSlateQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistQuarkSlateQuartzOre.get() && Quartz.biomeBlacklistQuarkSlateQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistQuarkSlateQuartzOre.get() && !Quartz.biomeBlacklistQuarkSlateQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeQuarkSlateQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkQuarkSlateQuartzOre.get(), Quartz.minHeightQuarkSlateQuartzOre.get(), 0, Quartz.maxHeightQuarkSlateQuartzOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Quartz.enableQuarkLimestoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistQuarkLimestoneQuartzOre.get() && Quartz.temperatureBlacklistQuarkLimestoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistQuarkLimestoneQuartzOre.get() && !Quartz.temperatureBlacklistQuarkLimestoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistQuarkLimestoneQuartzOre.get() && Quartz.biomeBlacklistQuarkLimestoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistQuarkLimestoneQuartzOre.get() && !Quartz.biomeBlacklistQuarkLimestoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeQuarkLimestoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkQuarkLimestoneQuartzOre.get(), Quartz.minHeightQuarkLimestoneQuartzOre.get(), 0, Quartz.maxHeightQuarkLimestoneQuartzOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Quartz.enableQuarkJasperQuartzOre.get()) {
                if ((Quartz.isTempWhitelistQuarkJasperQuartzOre.get() && Quartz.temperatureBlacklistQuarkJasperQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistQuarkJasperQuartzOre.get() && !Quartz.temperatureBlacklistQuarkJasperQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistQuarkJasperQuartzOre.get() && Quartz.biomeBlacklistQuarkJasperQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistQuarkJasperQuartzOre.get() && !Quartz.biomeBlacklistQuarkJasperQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeQuarkJasperQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkQuarkJasperQuartzOre.get(), Quartz.minHeightQuarkJasperQuartzOre.get(), 0, Quartz.maxHeightQuarkJasperQuartzOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Quartz.enableEmbellishcraftBasaltQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEmbellishcraftBasaltQuartzOre.get() && Quartz.temperatureBlacklistEmbellishcraftBasaltQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEmbellishcraftBasaltQuartzOre.get() && !Quartz.temperatureBlacklistEmbellishcraftBasaltQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEmbellishcraftBasaltQuartzOre.get() && Quartz.biomeBlacklistEmbellishcraftBasaltQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEmbellishcraftBasaltQuartzOre.get() && !Quartz.biomeBlacklistEmbellishcraftBasaltQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEmbellishcraftBasaltQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEmbellishcraftBasaltQuartzOre.get(), Quartz.minHeightEmbellishcraftBasaltQuartzOre.get(), 0, Quartz.maxHeightEmbellishcraftBasaltQuartzOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Quartz.enableEmbellishcraftGneissQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEmbellishcraftGneissQuartzOre.get() && Quartz.temperatureBlacklistEmbellishcraftGneissQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEmbellishcraftGneissQuartzOre.get() && !Quartz.temperatureBlacklistEmbellishcraftGneissQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEmbellishcraftGneissQuartzOre.get() && Quartz.biomeBlacklistEmbellishcraftGneissQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEmbellishcraftGneissQuartzOre.get() && !Quartz.biomeBlacklistEmbellishcraftGneissQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEmbellishcraftGneissQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEmbellishcraftGneissQuartzOre.get(), Quartz.minHeightEmbellishcraftGneissQuartzOre.get(), 0, Quartz.maxHeightEmbellishcraftGneissQuartzOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Quartz.enableEmbellishcraftJadeQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEmbellishcraftJadeQuartzOre.get() && Quartz.temperatureBlacklistEmbellishcraftJadeQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEmbellishcraftJadeQuartzOre.get() && !Quartz.temperatureBlacklistEmbellishcraftJadeQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEmbellishcraftJadeQuartzOre.get() && Quartz.biomeBlacklistEmbellishcraftJadeQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEmbellishcraftJadeQuartzOre.get() && !Quartz.biomeBlacklistEmbellishcraftJadeQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEmbellishcraftJadeQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEmbellishcraftJadeQuartzOre.get(), Quartz.minHeightEmbellishcraftJadeQuartzOre.get(), 0, Quartz.maxHeightEmbellishcraftJadeQuartzOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Quartz.enableEmbellishcraftLarvikiteQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEmbellishcraftLarvikiteQuartzOre.get() && Quartz.temperatureBlacklistEmbellishcraftLarvikiteQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEmbellishcraftLarvikiteQuartzOre.get() && !Quartz.temperatureBlacklistEmbellishcraftLarvikiteQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEmbellishcraftLarvikiteQuartzOre.get() && Quartz.biomeBlacklistEmbellishcraftLarvikiteQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEmbellishcraftLarvikiteQuartzOre.get() && !Quartz.biomeBlacklistEmbellishcraftLarvikiteQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEmbellishcraftLarvikiteQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEmbellishcraftLarvikiteQuartzOre.get(), Quartz.minHeightEmbellishcraftLarvikiteQuartzOre.get(), 0, Quartz.maxHeightEmbellishcraftLarvikiteQuartzOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Quartz.enableEmbellishcraftMarbleQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEmbellishcraftMarbleQuartzOre.get() && Quartz.temperatureBlacklistEmbellishcraftMarbleQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEmbellishcraftMarbleQuartzOre.get() && !Quartz.temperatureBlacklistEmbellishcraftMarbleQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEmbellishcraftMarbleQuartzOre.get() && Quartz.biomeBlacklistEmbellishcraftMarbleQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEmbellishcraftMarbleQuartzOre.get() && !Quartz.biomeBlacklistEmbellishcraftMarbleQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEmbellishcraftMarbleQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEmbellishcraftMarbleQuartzOre.get(), Quartz.minHeightEmbellishcraftMarbleQuartzOre.get(), 0, Quartz.maxHeightEmbellishcraftMarbleQuartzOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Quartz.enableEmbellishcraftSlateQuartzOre.get()) {
                if ((Quartz.isTempWhitelistEmbellishcraftSlateQuartzOre.get() && Quartz.temperatureBlacklistEmbellishcraftSlateQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistEmbellishcraftSlateQuartzOre.get() && !Quartz.temperatureBlacklistEmbellishcraftSlateQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistEmbellishcraftSlateQuartzOre.get() && Quartz.biomeBlacklistEmbellishcraftSlateQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistEmbellishcraftSlateQuartzOre.get() && !Quartz.biomeBlacklistEmbellishcraftSlateQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeEmbellishcraftSlateQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkEmbellishcraftSlateQuartzOre.get(), Quartz.minHeightEmbellishcraftSlateQuartzOre.get(), 0, Quartz.maxHeightEmbellishcraftSlateQuartzOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Quartz.enableHardenedStoneQuartzOre.get()) {
                if ((Quartz.isTempWhitelistHardenedStoneQuartzOre.get() && Quartz.temperatureBlacklistHardenedStoneQuartzOre.get().contains(biomeTS)) || (!Quartz.isTempWhitelistHardenedStoneQuartzOre.get() && !Quartz.temperatureBlacklistHardenedStoneQuartzOre.get().contains(biomeTS))) {
                    if ((Quartz.isBiomeWhitelistHardenedStoneQuartzOre.get() && Quartz.biomeBlacklistHardenedStoneQuartzOre.get().contains(biomeRNS)) || (!Quartz.isBiomeWhitelistHardenedStoneQuartzOre.get() && !Quartz.biomeBlacklistHardenedStoneQuartzOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_QUARTZ_ORE.get().getDefaultState(), Quartz.veinSizeHardenedStoneQuartzOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Quartz.veinsPerChunkHardenedStoneQuartzOre.get(), Quartz.minHeightHardenedStoneQuartzOre.get(), 0, Quartz.maxHeightHardenedStoneQuartzOre.get()))));
                    } } } }
    }
}
