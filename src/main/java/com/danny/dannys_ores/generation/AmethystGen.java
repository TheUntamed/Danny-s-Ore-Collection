package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Amethyst;
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

public class AmethystGen {
    public static void addAmethystGen(Biome biome, String biomeRNS, String biomeTS) {
        addAmethystOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addAmethystOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (!General.disableStoneOreGeneration.get()) {
            if (Amethyst.enableStoneAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistStoneAmethystOre.get() && Amethyst.temperatureBlacklistStoneAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistStoneAmethystOre.get() && !Amethyst.temperatureBlacklistStoneAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistStoneAmethystOre.get() && Amethyst.biomeBlacklistStoneAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistStoneAmethystOre.get() && !Amethyst.biomeBlacklistStoneAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeStoneAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkStoneAmethystOre.get(), Amethyst.minHeightStoneAmethystOre.get(), 0, Amethyst.maxHeightStoneAmethystOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Amethyst.enableAndesiteAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistAndesiteAmethystOre.get() && Amethyst.temperatureBlacklistAndesiteAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistAndesiteAmethystOre.get() && !Amethyst.temperatureBlacklistAndesiteAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistAndesiteAmethystOre.get() && Amethyst.biomeBlacklistAndesiteAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistAndesiteAmethystOre.get() && !Amethyst.biomeBlacklistAndesiteAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeAndesiteAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkAndesiteAmethystOre.get(), Amethyst.minHeightAndesiteAmethystOre.get(), 0, Amethyst.maxHeightAndesiteAmethystOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Amethyst.enableDioriteAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistDioriteAmethystOre.get() && Amethyst.temperatureBlacklistDioriteAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistDioriteAmethystOre.get() && !Amethyst.temperatureBlacklistDioriteAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistDioriteAmethystOre.get() && Amethyst.biomeBlacklistDioriteAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistDioriteAmethystOre.get() && !Amethyst.biomeBlacklistDioriteAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeDioriteAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkDioriteAmethystOre.get(), Amethyst.minHeightDioriteAmethystOre.get(), 0, Amethyst.maxHeightDioriteAmethystOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Amethyst.enableGraniteAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistGraniteAmethystOre.get() && Amethyst.temperatureBlacklistGraniteAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistGraniteAmethystOre.get() && !Amethyst.temperatureBlacklistGraniteAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistGraniteAmethystOre.get() && Amethyst.biomeBlacklistGraniteAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistGraniteAmethystOre.get() && !Amethyst.biomeBlacklistGraniteAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeGraniteAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkGraniteAmethystOre.get(), Amethyst.minHeightGraniteAmethystOre.get(), 0, Amethyst.maxHeightGraniteAmethystOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Amethyst.enableNetherrackAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistNetherrackAmethystOre.get() && Amethyst.temperatureBlacklistNetherrackAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistNetherrackAmethystOre.get() && !Amethyst.temperatureBlacklistNetherrackAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistNetherrackAmethystOre.get() && Amethyst.biomeBlacklistNetherrackAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistNetherrackAmethystOre.get() && !Amethyst.biomeBlacklistNetherrackAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeNetherrackAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkNetherrackAmethystOre.get(), Amethyst.minHeightNetherrackAmethystOre.get(), 0, Amethyst.maxHeightNetherrackAmethystOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Amethyst.enableEndStoneAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistEndStoneAmethystOre.get() && Amethyst.temperatureBlacklistEndStoneAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistEndStoneAmethystOre.get() && !Amethyst.temperatureBlacklistEndStoneAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistEndStoneAmethystOre.get() && Amethyst.biomeBlacklistEndStoneAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistEndStoneAmethystOre.get() && !Amethyst.biomeBlacklistEndStoneAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeEndStoneAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkEndStoneAmethystOre.get(), Amethyst.minHeightEndStoneAmethystOre.get(), 0, Amethyst.maxHeightEndStoneAmethystOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Amethyst.enableSandAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistSandAmethystOre.get() && Amethyst.temperatureBlacklistSandAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistSandAmethystOre.get() && !Amethyst.temperatureBlacklistSandAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistSandAmethystOre.get() && Amethyst.biomeBlacklistSandAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistSandAmethystOre.get() && !Amethyst.biomeBlacklistSandAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeSandAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkSandAmethystOre.get(), Amethyst.minHeightSandAmethystOre.get(), 0, Amethyst.maxHeightSandAmethystOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Amethyst.enableRedSandAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistRedSandAmethystOre.get() && Amethyst.temperatureBlacklistRedSandAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistRedSandAmethystOre.get() && !Amethyst.temperatureBlacklistRedSandAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistRedSandAmethystOre.get() && Amethyst.biomeBlacklistRedSandAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistRedSandAmethystOre.get() && !Amethyst.biomeBlacklistRedSandAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeRedSandAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkRedSandAmethystOre.get(), Amethyst.minHeightRedSandAmethystOre.get(), 0, Amethyst.maxHeightRedSandAmethystOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Amethyst.enableGravelAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistGravelAmethystOre.get() && Amethyst.temperatureBlacklistGravelAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistGravelAmethystOre.get() && !Amethyst.temperatureBlacklistGravelAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistGravelAmethystOre.get() && Amethyst.biomeBlacklistGravelAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistGravelAmethystOre.get() && !Amethyst.biomeBlacklistGravelAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeGravelAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkGravelAmethystOre.get(), Amethyst.minHeightGravelAmethystOre.get(), 0, Amethyst.maxHeightGravelAmethystOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Amethyst.enableSandstoneAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistSandstoneAmethystOre.get() && Amethyst.temperatureBlacklistSandstoneAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistSandstoneAmethystOre.get() && !Amethyst.temperatureBlacklistSandstoneAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistSandstoneAmethystOre.get() && Amethyst.biomeBlacklistSandstoneAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistSandstoneAmethystOre.get() && !Amethyst.biomeBlacklistSandstoneAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeSandstoneAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkSandstoneAmethystOre.get(), Amethyst.minHeightSandstoneAmethystOre.get(), 0, Amethyst.maxHeightSandstoneAmethystOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Amethyst.enableRedSandstoneAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistRedSandstoneAmethystOre.get() && Amethyst.temperatureBlacklistRedSandstoneAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistRedSandstoneAmethystOre.get() && !Amethyst.temperatureBlacklistRedSandstoneAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistRedSandstoneAmethystOre.get() && Amethyst.biomeBlacklistRedSandstoneAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistRedSandstoneAmethystOre.get() && !Amethyst.biomeBlacklistRedSandstoneAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeRedSandstoneAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkRedSandstoneAmethystOre.get(), Amethyst.minHeightRedSandstoneAmethystOre.get(), 0, Amethyst.maxHeightRedSandstoneAmethystOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Amethyst.enableBlueIceAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistBlueIceAmethystOre.get() && Amethyst.temperatureBlacklistBlueIceAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistBlueIceAmethystOre.get() && !Amethyst.temperatureBlacklistBlueIceAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistBlueIceAmethystOre.get() && Amethyst.biomeBlacklistBlueIceAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistBlueIceAmethystOre.get() && !Amethyst.biomeBlacklistBlueIceAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeBlueIceAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkBlueIceAmethystOre.get(), Amethyst.minHeightBlueIceAmethystOre.get(), 0, Amethyst.maxHeightBlueIceAmethystOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Amethyst.enablePackedIceAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistPackedIceAmethystOre.get() && Amethyst.temperatureBlacklistPackedIceAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistPackedIceAmethystOre.get() && !Amethyst.temperatureBlacklistPackedIceAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistPackedIceAmethystOre.get() && Amethyst.biomeBlacklistPackedIceAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistPackedIceAmethystOre.get() && !Amethyst.biomeBlacklistPackedIceAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizePackedIceAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkPackedIceAmethystOre.get(), Amethyst.minHeightPackedIceAmethystOre.get(), 0, Amethyst.maxHeightPackedIceAmethystOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Amethyst.enableBedrockAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistBedrockAmethystOre.get() && Amethyst.temperatureBlacklistBedrockAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistBedrockAmethystOre.get() && !Amethyst.temperatureBlacklistBedrockAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistBedrockAmethystOre.get() && Amethyst.biomeBlacklistBedrockAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistBedrockAmethystOre.get() && !Amethyst.biomeBlacklistBedrockAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeBedrockAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkBedrockAmethystOre.get(), Amethyst.minHeightBedrockAmethystOre.get(), 0, Amethyst.maxHeightBedrockAmethystOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Amethyst.enableQuarkBasaltAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistQuarkBasaltAmethystOre.get() && Amethyst.temperatureBlacklistQuarkBasaltAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistQuarkBasaltAmethystOre.get() && !Amethyst.temperatureBlacklistQuarkBasaltAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistQuarkBasaltAmethystOre.get() && Amethyst.biomeBlacklistQuarkBasaltAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistQuarkBasaltAmethystOre.get() && !Amethyst.biomeBlacklistQuarkBasaltAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeQuarkBasaltAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkQuarkBasaltAmethystOre.get(), Amethyst.minHeightQuarkBasaltAmethystOre.get(), 0, Amethyst.maxHeightQuarkBasaltAmethystOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Amethyst.enableQuarkMarbleAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistQuarkMarbleAmethystOre.get() && Amethyst.temperatureBlacklistQuarkMarbleAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistQuarkMarbleAmethystOre.get() && !Amethyst.temperatureBlacklistQuarkMarbleAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistQuarkMarbleAmethystOre.get() && Amethyst.biomeBlacklistQuarkMarbleAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistQuarkMarbleAmethystOre.get() && !Amethyst.biomeBlacklistQuarkMarbleAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeQuarkMarbleAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkQuarkMarbleAmethystOre.get(), Amethyst.minHeightQuarkMarbleAmethystOre.get(), 0, Amethyst.maxHeightQuarkMarbleAmethystOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Amethyst.enableQuarkSlateAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistQuarkSlateAmethystOre.get() && Amethyst.temperatureBlacklistQuarkSlateAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistQuarkSlateAmethystOre.get() && !Amethyst.temperatureBlacklistQuarkSlateAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistQuarkSlateAmethystOre.get() && Amethyst.biomeBlacklistQuarkSlateAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistQuarkSlateAmethystOre.get() && !Amethyst.biomeBlacklistQuarkSlateAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeQuarkSlateAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkQuarkSlateAmethystOre.get(), Amethyst.minHeightQuarkSlateAmethystOre.get(), 0, Amethyst.maxHeightQuarkSlateAmethystOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Amethyst.enableQuarkLimestoneAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistQuarkLimestoneAmethystOre.get() && Amethyst.temperatureBlacklistQuarkLimestoneAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistQuarkLimestoneAmethystOre.get() && !Amethyst.temperatureBlacklistQuarkLimestoneAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistQuarkLimestoneAmethystOre.get() && Amethyst.biomeBlacklistQuarkLimestoneAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistQuarkLimestoneAmethystOre.get() && !Amethyst.biomeBlacklistQuarkLimestoneAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeQuarkLimestoneAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkQuarkLimestoneAmethystOre.get(), Amethyst.minHeightQuarkLimestoneAmethystOre.get(), 0, Amethyst.maxHeightQuarkLimestoneAmethystOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Amethyst.enableQuarkJasperAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistQuarkJasperAmethystOre.get() && Amethyst.temperatureBlacklistQuarkJasperAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistQuarkJasperAmethystOre.get() && !Amethyst.temperatureBlacklistQuarkJasperAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistQuarkJasperAmethystOre.get() && Amethyst.biomeBlacklistQuarkJasperAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistQuarkJasperAmethystOre.get() && !Amethyst.biomeBlacklistQuarkJasperAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeQuarkJasperAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkQuarkJasperAmethystOre.get(), Amethyst.minHeightQuarkJasperAmethystOre.get(), 0, Amethyst.maxHeightQuarkJasperAmethystOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Amethyst.enableEmbellishcraftBasaltAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistEmbellishcraftBasaltAmethystOre.get() && Amethyst.temperatureBlacklistEmbellishcraftBasaltAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistEmbellishcraftBasaltAmethystOre.get() && !Amethyst.temperatureBlacklistEmbellishcraftBasaltAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistEmbellishcraftBasaltAmethystOre.get() && Amethyst.biomeBlacklistEmbellishcraftBasaltAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistEmbellishcraftBasaltAmethystOre.get() && !Amethyst.biomeBlacklistEmbellishcraftBasaltAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeEmbellishcraftBasaltAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkEmbellishcraftBasaltAmethystOre.get(), Amethyst.minHeightEmbellishcraftBasaltAmethystOre.get(), 0, Amethyst.maxHeightEmbellishcraftBasaltAmethystOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Amethyst.enableEmbellishcraftGneissAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistEmbellishcraftGneissAmethystOre.get() && Amethyst.temperatureBlacklistEmbellishcraftGneissAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistEmbellishcraftGneissAmethystOre.get() && !Amethyst.temperatureBlacklistEmbellishcraftGneissAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistEmbellishcraftGneissAmethystOre.get() && Amethyst.biomeBlacklistEmbellishcraftGneissAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistEmbellishcraftGneissAmethystOre.get() && !Amethyst.biomeBlacklistEmbellishcraftGneissAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeEmbellishcraftGneissAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkEmbellishcraftGneissAmethystOre.get(), Amethyst.minHeightEmbellishcraftGneissAmethystOre.get(), 0, Amethyst.maxHeightEmbellishcraftGneissAmethystOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Amethyst.enableEmbellishcraftJadeAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistEmbellishcraftJadeAmethystOre.get() && Amethyst.temperatureBlacklistEmbellishcraftJadeAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistEmbellishcraftJadeAmethystOre.get() && !Amethyst.temperatureBlacklistEmbellishcraftJadeAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistEmbellishcraftJadeAmethystOre.get() && Amethyst.biomeBlacklistEmbellishcraftJadeAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistEmbellishcraftJadeAmethystOre.get() && !Amethyst.biomeBlacklistEmbellishcraftJadeAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeEmbellishcraftJadeAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkEmbellishcraftJadeAmethystOre.get(), Amethyst.minHeightEmbellishcraftJadeAmethystOre.get(), 0, Amethyst.maxHeightEmbellishcraftJadeAmethystOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Amethyst.enableEmbellishcraftLarvikiteAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistEmbellishcraftLarvikiteAmethystOre.get() && Amethyst.temperatureBlacklistEmbellishcraftLarvikiteAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistEmbellishcraftLarvikiteAmethystOre.get() && !Amethyst.temperatureBlacklistEmbellishcraftLarvikiteAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistEmbellishcraftLarvikiteAmethystOre.get() && Amethyst.biomeBlacklistEmbellishcraftLarvikiteAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistEmbellishcraftLarvikiteAmethystOre.get() && !Amethyst.biomeBlacklistEmbellishcraftLarvikiteAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeEmbellishcraftLarvikiteAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkEmbellishcraftLarvikiteAmethystOre.get(), Amethyst.minHeightEmbellishcraftLarvikiteAmethystOre.get(), 0, Amethyst.maxHeightEmbellishcraftLarvikiteAmethystOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Amethyst.enableEmbellishcraftMarbleAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistEmbellishcraftMarbleAmethystOre.get() && Amethyst.temperatureBlacklistEmbellishcraftMarbleAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistEmbellishcraftMarbleAmethystOre.get() && !Amethyst.temperatureBlacklistEmbellishcraftMarbleAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistEmbellishcraftMarbleAmethystOre.get() && Amethyst.biomeBlacklistEmbellishcraftMarbleAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistEmbellishcraftMarbleAmethystOre.get() && !Amethyst.biomeBlacklistEmbellishcraftMarbleAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeEmbellishcraftMarbleAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkEmbellishcraftMarbleAmethystOre.get(), Amethyst.minHeightEmbellishcraftMarbleAmethystOre.get(), 0, Amethyst.maxHeightEmbellishcraftMarbleAmethystOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Amethyst.enableEmbellishcraftSlateAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistEmbellishcraftSlateAmethystOre.get() && Amethyst.temperatureBlacklistEmbellishcraftSlateAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistEmbellishcraftSlateAmethystOre.get() && !Amethyst.temperatureBlacklistEmbellishcraftSlateAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistEmbellishcraftSlateAmethystOre.get() && Amethyst.biomeBlacklistEmbellishcraftSlateAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistEmbellishcraftSlateAmethystOre.get() && !Amethyst.biomeBlacklistEmbellishcraftSlateAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeEmbellishcraftSlateAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkEmbellishcraftSlateAmethystOre.get(), Amethyst.minHeightEmbellishcraftSlateAmethystOre.get(), 0, Amethyst.maxHeightEmbellishcraftSlateAmethystOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Amethyst.enableHardenedStoneAmethystOre.get()) {
                if ((Amethyst.isTempWhitelistHardenedStoneAmethystOre.get() && Amethyst.temperatureBlacklistHardenedStoneAmethystOre.get().contains(biomeTS)) || (!Amethyst.isTempWhitelistHardenedStoneAmethystOre.get() && !Amethyst.temperatureBlacklistHardenedStoneAmethystOre.get().contains(biomeTS))) {
                    if ((Amethyst.isBiomeWhitelistHardenedStoneAmethystOre.get() && Amethyst.biomeBlacklistHardenedStoneAmethystOre.get().contains(biomeRNS)) || (!Amethyst.isBiomeWhitelistHardenedStoneAmethystOre.get() && !Amethyst.biomeBlacklistHardenedStoneAmethystOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_AMETHYST_ORE.get().getDefaultState(), Amethyst.veinSizeHardenedStoneAmethystOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Amethyst.veinsPerChunkHardenedStoneAmethystOre.get(), Amethyst.minHeightHardenedStoneAmethystOre.get(), 0, Amethyst.maxHeightHardenedStoneAmethystOre.get()))));
                    } } } }
    }
}
