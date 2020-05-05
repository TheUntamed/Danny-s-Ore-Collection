package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Redstone;
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
        // Vanilla
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Redstone.enableVanillaRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistVanillaRedstoneOre.get() && Redstone.temperatureBlacklistVanillaRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistVanillaRedstoneOre.get() && !Redstone.temperatureBlacklistVanillaRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistVanillaRedstoneOre.get() && Redstone.biomeBlacklistVanillaRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistVanillaRedstoneOre.get() && !Redstone.biomeBlacklistVanillaRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.REDSTONE_ORE.getDefaultState(), Redstone.veinSizeVanillaRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkVanillaRedstoneOre.get(), Redstone.minHeightVanillaRedstoneOre.get(), 0, Redstone.maxHeightVanillaRedstoneOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Redstone.enableAndesiteRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistAndesiteRedstoneOre.get() && Redstone.temperatureBlacklistAndesiteRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistAndesiteRedstoneOre.get() && !Redstone.temperatureBlacklistAndesiteRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistAndesiteRedstoneOre.get() && Redstone.biomeBlacklistAndesiteRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistAndesiteRedstoneOre.get() && !Redstone.biomeBlacklistAndesiteRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeAndesiteRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkAndesiteRedstoneOre.get(), Redstone.minHeightAndesiteRedstoneOre.get(), 0, Redstone.maxHeightAndesiteRedstoneOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Redstone.enableDioriteRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistDioriteRedstoneOre.get() && Redstone.temperatureBlacklistDioriteRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistDioriteRedstoneOre.get() && !Redstone.temperatureBlacklistDioriteRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistDioriteRedstoneOre.get() && Redstone.biomeBlacklistDioriteRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistDioriteRedstoneOre.get() && !Redstone.biomeBlacklistDioriteRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeDioriteRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkDioriteRedstoneOre.get(), Redstone.minHeightDioriteRedstoneOre.get(), 0, Redstone.maxHeightDioriteRedstoneOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Redstone.enableGraniteRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistGraniteRedstoneOre.get() && Redstone.temperatureBlacklistGraniteRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistGraniteRedstoneOre.get() && !Redstone.temperatureBlacklistGraniteRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistGraniteRedstoneOre.get() && Redstone.biomeBlacklistGraniteRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistGraniteRedstoneOre.get() && !Redstone.biomeBlacklistGraniteRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeGraniteRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkGraniteRedstoneOre.get(), Redstone.minHeightGraniteRedstoneOre.get(), 0, Redstone.maxHeightGraniteRedstoneOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Redstone.enableNetherrackRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistNetherrackRedstoneOre.get() && Redstone.temperatureBlacklistNetherrackRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistNetherrackRedstoneOre.get() && !Redstone.temperatureBlacklistNetherrackRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistNetherrackRedstoneOre.get() && Redstone.biomeBlacklistNetherrackRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistNetherrackRedstoneOre.get() && !Redstone.biomeBlacklistNetherrackRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeNetherrackRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkNetherrackRedstoneOre.get(), Redstone.minHeightNetherrackRedstoneOre.get(), 0, Redstone.maxHeightNetherrackRedstoneOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Redstone.enableEndStoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEndStoneRedstoneOre.get() && Redstone.temperatureBlacklistEndStoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEndStoneRedstoneOre.get() && !Redstone.temperatureBlacklistEndStoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEndStoneRedstoneOre.get() && Redstone.biomeBlacklistEndStoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEndStoneRedstoneOre.get() && !Redstone.biomeBlacklistEndStoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEndStoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEndStoneRedstoneOre.get(), Redstone.minHeightEndStoneRedstoneOre.get(), 0, Redstone.maxHeightEndStoneRedstoneOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Redstone.enableSandRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistSandRedstoneOre.get() && Redstone.temperatureBlacklistSandRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistSandRedstoneOre.get() && !Redstone.temperatureBlacklistSandRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistSandRedstoneOre.get() && Redstone.biomeBlacklistSandRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistSandRedstoneOre.get() && !Redstone.biomeBlacklistSandRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeSandRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkSandRedstoneOre.get(), Redstone.minHeightSandRedstoneOre.get(), 0, Redstone.maxHeightSandRedstoneOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Redstone.enableRedSandRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistRedSandRedstoneOre.get() && Redstone.temperatureBlacklistRedSandRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistRedSandRedstoneOre.get() && !Redstone.temperatureBlacklistRedSandRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistRedSandRedstoneOre.get() && Redstone.biomeBlacklistRedSandRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistRedSandRedstoneOre.get() && !Redstone.biomeBlacklistRedSandRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeRedSandRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkRedSandRedstoneOre.get(), Redstone.minHeightRedSandRedstoneOre.get(), 0, Redstone.maxHeightRedSandRedstoneOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Redstone.enableGravelRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistGravelRedstoneOre.get() && Redstone.temperatureBlacklistGravelRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistGravelRedstoneOre.get() && !Redstone.temperatureBlacklistGravelRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistGravelRedstoneOre.get() && Redstone.biomeBlacklistGravelRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistGravelRedstoneOre.get() && !Redstone.biomeBlacklistGravelRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeGravelRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkGravelRedstoneOre.get(), Redstone.minHeightGravelRedstoneOre.get(), 0, Redstone.maxHeightGravelRedstoneOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Redstone.enableSandstoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistSandstoneRedstoneOre.get() && Redstone.temperatureBlacklistSandstoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistSandstoneRedstoneOre.get() && !Redstone.temperatureBlacklistSandstoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistSandstoneRedstoneOre.get() && Redstone.biomeBlacklistSandstoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistSandstoneRedstoneOre.get() && !Redstone.biomeBlacklistSandstoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeSandstoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkSandstoneRedstoneOre.get(), Redstone.minHeightSandstoneRedstoneOre.get(), 0, Redstone.maxHeightSandstoneRedstoneOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Redstone.enableRedSandstoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistRedSandstoneRedstoneOre.get() && Redstone.temperatureBlacklistRedSandstoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistRedSandstoneRedstoneOre.get() && !Redstone.temperatureBlacklistRedSandstoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistRedSandstoneRedstoneOre.get() && Redstone.biomeBlacklistRedSandstoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistRedSandstoneRedstoneOre.get() && !Redstone.biomeBlacklistRedSandstoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeRedSandstoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkRedSandstoneRedstoneOre.get(), Redstone.minHeightRedSandstoneRedstoneOre.get(), 0, Redstone.maxHeightRedSandstoneRedstoneOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Redstone.enableQuarkBasaltRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistQuarkBasaltRedstoneOre.get() && Redstone.temperatureBlacklistQuarkBasaltRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistQuarkBasaltRedstoneOre.get() && !Redstone.temperatureBlacklistQuarkBasaltRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistQuarkBasaltRedstoneOre.get() && Redstone.biomeBlacklistQuarkBasaltRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistQuarkBasaltRedstoneOre.get() && !Redstone.biomeBlacklistQuarkBasaltRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeQuarkBasaltRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkQuarkBasaltRedstoneOre.get(), Redstone.minHeightQuarkBasaltRedstoneOre.get(), 0, Redstone.maxHeightQuarkBasaltRedstoneOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Redstone.enableQuarkMarbleRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistQuarkMarbleRedstoneOre.get() && Redstone.temperatureBlacklistQuarkMarbleRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistQuarkMarbleRedstoneOre.get() && !Redstone.temperatureBlacklistQuarkMarbleRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistQuarkMarbleRedstoneOre.get() && Redstone.biomeBlacklistQuarkMarbleRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistQuarkMarbleRedstoneOre.get() && !Redstone.biomeBlacklistQuarkMarbleRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeQuarkMarbleRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkQuarkMarbleRedstoneOre.get(), Redstone.minHeightQuarkMarbleRedstoneOre.get(), 0, Redstone.maxHeightQuarkMarbleRedstoneOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Redstone.enableQuarkSlateRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistQuarkSlateRedstoneOre.get() && Redstone.temperatureBlacklistQuarkSlateRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistQuarkSlateRedstoneOre.get() && !Redstone.temperatureBlacklistQuarkSlateRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistQuarkSlateRedstoneOre.get() && Redstone.biomeBlacklistQuarkSlateRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistQuarkSlateRedstoneOre.get() && !Redstone.biomeBlacklistQuarkSlateRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeQuarkSlateRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkQuarkSlateRedstoneOre.get(), Redstone.minHeightQuarkSlateRedstoneOre.get(), 0, Redstone.maxHeightQuarkSlateRedstoneOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Redstone.enableQuarkLimestoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistQuarkLimestoneRedstoneOre.get() && Redstone.temperatureBlacklistQuarkLimestoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistQuarkLimestoneRedstoneOre.get() && !Redstone.temperatureBlacklistQuarkLimestoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistQuarkLimestoneRedstoneOre.get() && Redstone.biomeBlacklistQuarkLimestoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistQuarkLimestoneRedstoneOre.get() && !Redstone.biomeBlacklistQuarkLimestoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeQuarkLimestoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkQuarkLimestoneRedstoneOre.get(), Redstone.minHeightQuarkLimestoneRedstoneOre.get(), 0, Redstone.maxHeightQuarkLimestoneRedstoneOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Redstone.enableQuarkJasperRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistQuarkJasperRedstoneOre.get() && Redstone.temperatureBlacklistQuarkJasperRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistQuarkJasperRedstoneOre.get() && !Redstone.temperatureBlacklistQuarkJasperRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistQuarkJasperRedstoneOre.get() && Redstone.biomeBlacklistQuarkJasperRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistQuarkJasperRedstoneOre.get() && !Redstone.biomeBlacklistQuarkJasperRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeQuarkJasperRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkQuarkJasperRedstoneOre.get(), Redstone.minHeightQuarkJasperRedstoneOre.get(), 0, Redstone.maxHeightQuarkJasperRedstoneOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Redstone.enableEmbellishcraftBasaltRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEmbellishcraftBasaltRedstoneOre.get() && Redstone.temperatureBlacklistEmbellishcraftBasaltRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEmbellishcraftBasaltRedstoneOre.get() && !Redstone.temperatureBlacklistEmbellishcraftBasaltRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEmbellishcraftBasaltRedstoneOre.get() && Redstone.biomeBlacklistEmbellishcraftBasaltRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEmbellishcraftBasaltRedstoneOre.get() && !Redstone.biomeBlacklistEmbellishcraftBasaltRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEmbellishcraftBasaltRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEmbellishcraftBasaltRedstoneOre.get(), Redstone.minHeightEmbellishcraftBasaltRedstoneOre.get(), 0, Redstone.maxHeightEmbellishcraftBasaltRedstoneOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Redstone.enableEmbellishcraftGneissRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEmbellishcraftGneissRedstoneOre.get() && Redstone.temperatureBlacklistEmbellishcraftGneissRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEmbellishcraftGneissRedstoneOre.get() && !Redstone.temperatureBlacklistEmbellishcraftGneissRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEmbellishcraftGneissRedstoneOre.get() && Redstone.biomeBlacklistEmbellishcraftGneissRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEmbellishcraftGneissRedstoneOre.get() && !Redstone.biomeBlacklistEmbellishcraftGneissRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEmbellishcraftGneissRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEmbellishcraftGneissRedstoneOre.get(), Redstone.minHeightEmbellishcraftGneissRedstoneOre.get(), 0, Redstone.maxHeightEmbellishcraftGneissRedstoneOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Redstone.enableEmbellishcraftJadeRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEmbellishcraftJadeRedstoneOre.get() && Redstone.temperatureBlacklistEmbellishcraftJadeRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEmbellishcraftJadeRedstoneOre.get() && !Redstone.temperatureBlacklistEmbellishcraftJadeRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEmbellishcraftJadeRedstoneOre.get() && Redstone.biomeBlacklistEmbellishcraftJadeRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEmbellishcraftJadeRedstoneOre.get() && !Redstone.biomeBlacklistEmbellishcraftJadeRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEmbellishcraftJadeRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEmbellishcraftJadeRedstoneOre.get(), Redstone.minHeightEmbellishcraftJadeRedstoneOre.get(), 0, Redstone.maxHeightEmbellishcraftJadeRedstoneOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Redstone.enableEmbellishcraftLarvikiteRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEmbellishcraftLarvikiteRedstoneOre.get() && Redstone.temperatureBlacklistEmbellishcraftLarvikiteRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEmbellishcraftLarvikiteRedstoneOre.get() && !Redstone.temperatureBlacklistEmbellishcraftLarvikiteRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEmbellishcraftLarvikiteRedstoneOre.get() && Redstone.biomeBlacklistEmbellishcraftLarvikiteRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEmbellishcraftLarvikiteRedstoneOre.get() && !Redstone.biomeBlacklistEmbellishcraftLarvikiteRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEmbellishcraftLarvikiteRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEmbellishcraftLarvikiteRedstoneOre.get(), Redstone.minHeightEmbellishcraftLarvikiteRedstoneOre.get(), 0, Redstone.maxHeightEmbellishcraftLarvikiteRedstoneOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Redstone.enableEmbellishcraftMarbleRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEmbellishcraftMarbleRedstoneOre.get() && Redstone.temperatureBlacklistEmbellishcraftMarbleRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEmbellishcraftMarbleRedstoneOre.get() && !Redstone.temperatureBlacklistEmbellishcraftMarbleRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEmbellishcraftMarbleRedstoneOre.get() && Redstone.biomeBlacklistEmbellishcraftMarbleRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEmbellishcraftMarbleRedstoneOre.get() && !Redstone.biomeBlacklistEmbellishcraftMarbleRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEmbellishcraftMarbleRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEmbellishcraftMarbleRedstoneOre.get(), Redstone.minHeightEmbellishcraftMarbleRedstoneOre.get(), 0, Redstone.maxHeightEmbellishcraftMarbleRedstoneOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Redstone.enableEmbellishcraftSlateRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistEmbellishcraftSlateRedstoneOre.get() && Redstone.temperatureBlacklistEmbellishcraftSlateRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistEmbellishcraftSlateRedstoneOre.get() && !Redstone.temperatureBlacklistEmbellishcraftSlateRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistEmbellishcraftSlateRedstoneOre.get() && Redstone.biomeBlacklistEmbellishcraftSlateRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistEmbellishcraftSlateRedstoneOre.get() && !Redstone.biomeBlacklistEmbellishcraftSlateRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeEmbellishcraftSlateRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkEmbellishcraftSlateRedstoneOre.get(), Redstone.minHeightEmbellishcraftSlateRedstoneOre.get(), 0, Redstone.maxHeightEmbellishcraftSlateRedstoneOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Redstone.enableHardenedStoneRedstoneOre.get()) {
                if ((Redstone.isTempWhitelistHardenedStoneRedstoneOre.get() && Redstone.temperatureBlacklistHardenedStoneRedstoneOre.get().contains(biomeTS)) || (!Redstone.isTempWhitelistHardenedStoneRedstoneOre.get() && !Redstone.temperatureBlacklistHardenedStoneRedstoneOre.get().contains(biomeTS))) {
                    if ((Redstone.isBiomeWhitelistHardenedStoneRedstoneOre.get() && Redstone.biomeBlacklistHardenedStoneRedstoneOre.get().contains(biomeRNS)) || (!Redstone.isBiomeWhitelistHardenedStoneRedstoneOre.get() && !Redstone.biomeBlacklistHardenedStoneRedstoneOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_REDSTONE_ORE.get().getDefaultState(), Redstone.veinSizeHardenedStoneRedstoneOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Redstone.veinsPerChunkHardenedStoneRedstoneOre.get(), Redstone.minHeightHardenedStoneRedstoneOre.get(), 0, Redstone.maxHeightHardenedStoneRedstoneOre.get()))));
                    } } } }
    }
}
