package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Aluminum;
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

public class AluminumGen {
    public static void addAluminumGen(Biome biome, String biomeRNS, String biomeTS) {
        addAluminumOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addAluminumOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Stone
        if (!General.disableStoneOreGeneration.get()) {
            if (Aluminum.enableStoneAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistStoneAluminumOre.get() && Aluminum.temperatureBlacklistStoneAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistStoneAluminumOre.get() && !Aluminum.temperatureBlacklistStoneAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistStoneAluminumOre.get() && Aluminum.biomeBlacklistStoneAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistStoneAluminumOre.get() && !Aluminum.biomeBlacklistStoneAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeStoneAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkStoneAluminumOre.get(), Aluminum.minHeightStoneAluminumOre.get(), 0, Aluminum.maxHeightStoneAluminumOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Aluminum.enableAndesiteAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistAndesiteAluminumOre.get() && Aluminum.temperatureBlacklistAndesiteAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistAndesiteAluminumOre.get() && !Aluminum.temperatureBlacklistAndesiteAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistAndesiteAluminumOre.get() && Aluminum.biomeBlacklistAndesiteAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistAndesiteAluminumOre.get() && !Aluminum.biomeBlacklistAndesiteAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeAndesiteAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkAndesiteAluminumOre.get(), Aluminum.minHeightAndesiteAluminumOre.get(), 0, Aluminum.maxHeightAndesiteAluminumOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Aluminum.enableDioriteAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistDioriteAluminumOre.get() && Aluminum.temperatureBlacklistDioriteAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistDioriteAluminumOre.get() && !Aluminum.temperatureBlacklistDioriteAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistDioriteAluminumOre.get() && Aluminum.biomeBlacklistDioriteAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistDioriteAluminumOre.get() && !Aluminum.biomeBlacklistDioriteAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeDioriteAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkDioriteAluminumOre.get(), Aluminum.minHeightDioriteAluminumOre.get(), 0, Aluminum.maxHeightDioriteAluminumOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Aluminum.enableGraniteAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistGraniteAluminumOre.get() && Aluminum.temperatureBlacklistGraniteAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistGraniteAluminumOre.get() && !Aluminum.temperatureBlacklistGraniteAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistGraniteAluminumOre.get() && Aluminum.biomeBlacklistGraniteAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistGraniteAluminumOre.get() && !Aluminum.biomeBlacklistGraniteAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeGraniteAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkGraniteAluminumOre.get(), Aluminum.minHeightGraniteAluminumOre.get(), 0, Aluminum.maxHeightGraniteAluminumOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Aluminum.enableNetherrackAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistNetherrackAluminumOre.get() && Aluminum.temperatureBlacklistNetherrackAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistNetherrackAluminumOre.get() && !Aluminum.temperatureBlacklistNetherrackAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistNetherrackAluminumOre.get() && Aluminum.biomeBlacklistNetherrackAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistNetherrackAluminumOre.get() && !Aluminum.biomeBlacklistNetherrackAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeNetherrackAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkNetherrackAluminumOre.get(), Aluminum.minHeightNetherrackAluminumOre.get(), 0, Aluminum.maxHeightNetherrackAluminumOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Aluminum.enableEndStoneAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistEndStoneAluminumOre.get() && Aluminum.temperatureBlacklistEndStoneAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistEndStoneAluminumOre.get() && !Aluminum.temperatureBlacklistEndStoneAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistEndStoneAluminumOre.get() && Aluminum.biomeBlacklistEndStoneAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistEndStoneAluminumOre.get() && !Aluminum.biomeBlacklistEndStoneAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeEndStoneAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkEndStoneAluminumOre.get(), Aluminum.minHeightEndStoneAluminumOre.get(), 0, Aluminum.maxHeightEndStoneAluminumOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Aluminum.enableSandAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistSandAluminumOre.get() && Aluminum.temperatureBlacklistSandAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistSandAluminumOre.get() && !Aluminum.temperatureBlacklistSandAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistSandAluminumOre.get() && Aluminum.biomeBlacklistSandAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistSandAluminumOre.get() && !Aluminum.biomeBlacklistSandAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeSandAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkSandAluminumOre.get(), Aluminum.minHeightSandAluminumOre.get(), 0, Aluminum.maxHeightSandAluminumOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Aluminum.enableRedSandAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistRedSandAluminumOre.get() && Aluminum.temperatureBlacklistRedSandAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistRedSandAluminumOre.get() && !Aluminum.temperatureBlacklistRedSandAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistRedSandAluminumOre.get() && Aluminum.biomeBlacklistRedSandAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistRedSandAluminumOre.get() && !Aluminum.biomeBlacklistRedSandAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeRedSandAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkRedSandAluminumOre.get(), Aluminum.minHeightRedSandAluminumOre.get(), 0, Aluminum.maxHeightRedSandAluminumOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Aluminum.enableGravelAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistGravelAluminumOre.get() && Aluminum.temperatureBlacklistGravelAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistGravelAluminumOre.get() && !Aluminum.temperatureBlacklistGravelAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistGravelAluminumOre.get() && Aluminum.biomeBlacklistGravelAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistGravelAluminumOre.get() && !Aluminum.biomeBlacklistGravelAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeGravelAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkGravelAluminumOre.get(), Aluminum.minHeightGravelAluminumOre.get(), 0, Aluminum.maxHeightGravelAluminumOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Aluminum.enableSandstoneAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistSandstoneAluminumOre.get() && Aluminum.temperatureBlacklistSandstoneAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistSandstoneAluminumOre.get() && !Aluminum.temperatureBlacklistSandstoneAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistSandstoneAluminumOre.get() && Aluminum.biomeBlacklistSandstoneAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistSandstoneAluminumOre.get() && !Aluminum.biomeBlacklistSandstoneAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeSandstoneAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkSandstoneAluminumOre.get(), Aluminum.minHeightSandstoneAluminumOre.get(), 0, Aluminum.maxHeightSandstoneAluminumOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Aluminum.enableRedSandstoneAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistRedSandstoneAluminumOre.get() && Aluminum.temperatureBlacklistRedSandstoneAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistRedSandstoneAluminumOre.get() && !Aluminum.temperatureBlacklistRedSandstoneAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistRedSandstoneAluminumOre.get() && Aluminum.biomeBlacklistRedSandstoneAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistRedSandstoneAluminumOre.get() && !Aluminum.biomeBlacklistRedSandstoneAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeRedSandstoneAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkRedSandstoneAluminumOre.get(), Aluminum.minHeightRedSandstoneAluminumOre.get(), 0, Aluminum.maxHeightRedSandstoneAluminumOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Aluminum.enableBlueIceAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistBlueIceAluminumOre.get() && Aluminum.temperatureBlacklistBlueIceAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistBlueIceAluminumOre.get() && !Aluminum.temperatureBlacklistBlueIceAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistBlueIceAluminumOre.get() && Aluminum.biomeBlacklistBlueIceAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistBlueIceAluminumOre.get() && !Aluminum.biomeBlacklistBlueIceAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeBlueIceAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkBlueIceAluminumOre.get(), Aluminum.minHeightBlueIceAluminumOre.get(), 0, Aluminum.maxHeightBlueIceAluminumOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Aluminum.enablePackedIceAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistPackedIceAluminumOre.get() && Aluminum.temperatureBlacklistPackedIceAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistPackedIceAluminumOre.get() && !Aluminum.temperatureBlacklistPackedIceAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistPackedIceAluminumOre.get() && Aluminum.biomeBlacklistPackedIceAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistPackedIceAluminumOre.get() && !Aluminum.biomeBlacklistPackedIceAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizePackedIceAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkPackedIceAluminumOre.get(), Aluminum.minHeightPackedIceAluminumOre.get(), 0, Aluminum.maxHeightPackedIceAluminumOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Aluminum.enableBedrockAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistBedrockAluminumOre.get() && Aluminum.temperatureBlacklistBedrockAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistBedrockAluminumOre.get() && !Aluminum.temperatureBlacklistBedrockAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistBedrockAluminumOre.get() && Aluminum.biomeBlacklistBedrockAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistBedrockAluminumOre.get() && !Aluminum.biomeBlacklistBedrockAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeBedrockAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkBedrockAluminumOre.get(), Aluminum.minHeightBedrockAluminumOre.get(), 0, Aluminum.maxHeightBedrockAluminumOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Aluminum.enableQuarkBasaltAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistQuarkBasaltAluminumOre.get() && Aluminum.temperatureBlacklistQuarkBasaltAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistQuarkBasaltAluminumOre.get() && !Aluminum.temperatureBlacklistQuarkBasaltAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistQuarkBasaltAluminumOre.get() && Aluminum.biomeBlacklistQuarkBasaltAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistQuarkBasaltAluminumOre.get() && !Aluminum.biomeBlacklistQuarkBasaltAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeQuarkBasaltAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkQuarkBasaltAluminumOre.get(), Aluminum.minHeightQuarkBasaltAluminumOre.get(), 0, Aluminum.maxHeightQuarkBasaltAluminumOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Aluminum.enableQuarkMarbleAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistQuarkMarbleAluminumOre.get() && Aluminum.temperatureBlacklistQuarkMarbleAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistQuarkMarbleAluminumOre.get() && !Aluminum.temperatureBlacklistQuarkMarbleAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistQuarkMarbleAluminumOre.get() && Aluminum.biomeBlacklistQuarkMarbleAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistQuarkMarbleAluminumOre.get() && !Aluminum.biomeBlacklistQuarkMarbleAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeQuarkMarbleAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkQuarkMarbleAluminumOre.get(), Aluminum.minHeightQuarkMarbleAluminumOre.get(), 0, Aluminum.maxHeightQuarkMarbleAluminumOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Aluminum.enableQuarkSlateAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistQuarkSlateAluminumOre.get() && Aluminum.temperatureBlacklistQuarkSlateAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistQuarkSlateAluminumOre.get() && !Aluminum.temperatureBlacklistQuarkSlateAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistQuarkSlateAluminumOre.get() && Aluminum.biomeBlacklistQuarkSlateAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistQuarkSlateAluminumOre.get() && !Aluminum.biomeBlacklistQuarkSlateAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeQuarkSlateAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkQuarkSlateAluminumOre.get(), Aluminum.minHeightQuarkSlateAluminumOre.get(), 0, Aluminum.maxHeightQuarkSlateAluminumOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Aluminum.enableQuarkLimestoneAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistQuarkLimestoneAluminumOre.get() && Aluminum.temperatureBlacklistQuarkLimestoneAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistQuarkLimestoneAluminumOre.get() && !Aluminum.temperatureBlacklistQuarkLimestoneAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistQuarkLimestoneAluminumOre.get() && Aluminum.biomeBlacklistQuarkLimestoneAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistQuarkLimestoneAluminumOre.get() && !Aluminum.biomeBlacklistQuarkLimestoneAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeQuarkLimestoneAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkQuarkLimestoneAluminumOre.get(), Aluminum.minHeightQuarkLimestoneAluminumOre.get(), 0, Aluminum.maxHeightQuarkLimestoneAluminumOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Aluminum.enableQuarkJasperAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistQuarkJasperAluminumOre.get() && Aluminum.temperatureBlacklistQuarkJasperAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistQuarkJasperAluminumOre.get() && !Aluminum.temperatureBlacklistQuarkJasperAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistQuarkJasperAluminumOre.get() && Aluminum.biomeBlacklistQuarkJasperAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistQuarkJasperAluminumOre.get() && !Aluminum.biomeBlacklistQuarkJasperAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeQuarkJasperAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkQuarkJasperAluminumOre.get(), Aluminum.minHeightQuarkJasperAluminumOre.get(), 0, Aluminum.maxHeightQuarkJasperAluminumOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Aluminum.enableEmbellishcraftBasaltAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistEmbellishcraftBasaltAluminumOre.get() && Aluminum.temperatureBlacklistEmbellishcraftBasaltAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistEmbellishcraftBasaltAluminumOre.get() && !Aluminum.temperatureBlacklistEmbellishcraftBasaltAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistEmbellishcraftBasaltAluminumOre.get() && Aluminum.biomeBlacklistEmbellishcraftBasaltAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistEmbellishcraftBasaltAluminumOre.get() && !Aluminum.biomeBlacklistEmbellishcraftBasaltAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeEmbellishcraftBasaltAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkEmbellishcraftBasaltAluminumOre.get(), Aluminum.minHeightEmbellishcraftBasaltAluminumOre.get(), 0, Aluminum.maxHeightEmbellishcraftBasaltAluminumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Aluminum.enableEmbellishcraftGneissAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistEmbellishcraftGneissAluminumOre.get() && Aluminum.temperatureBlacklistEmbellishcraftGneissAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistEmbellishcraftGneissAluminumOre.get() && !Aluminum.temperatureBlacklistEmbellishcraftGneissAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistEmbellishcraftGneissAluminumOre.get() && Aluminum.biomeBlacklistEmbellishcraftGneissAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistEmbellishcraftGneissAluminumOre.get() && !Aluminum.biomeBlacklistEmbellishcraftGneissAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeEmbellishcraftGneissAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkEmbellishcraftGneissAluminumOre.get(), Aluminum.minHeightEmbellishcraftGneissAluminumOre.get(), 0, Aluminum.maxHeightEmbellishcraftGneissAluminumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Aluminum.enableEmbellishcraftJadeAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistEmbellishcraftJadeAluminumOre.get() && Aluminum.temperatureBlacklistEmbellishcraftJadeAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistEmbellishcraftJadeAluminumOre.get() && !Aluminum.temperatureBlacklistEmbellishcraftJadeAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistEmbellishcraftJadeAluminumOre.get() && Aluminum.biomeBlacklistEmbellishcraftJadeAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistEmbellishcraftJadeAluminumOre.get() && !Aluminum.biomeBlacklistEmbellishcraftJadeAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeEmbellishcraftJadeAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkEmbellishcraftJadeAluminumOre.get(), Aluminum.minHeightEmbellishcraftJadeAluminumOre.get(), 0, Aluminum.maxHeightEmbellishcraftJadeAluminumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Aluminum.enableEmbellishcraftLarvikiteAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistEmbellishcraftLarvikiteAluminumOre.get() && Aluminum.temperatureBlacklistEmbellishcraftLarvikiteAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistEmbellishcraftLarvikiteAluminumOre.get() && !Aluminum.temperatureBlacklistEmbellishcraftLarvikiteAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistEmbellishcraftLarvikiteAluminumOre.get() && Aluminum.biomeBlacklistEmbellishcraftLarvikiteAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistEmbellishcraftLarvikiteAluminumOre.get() && !Aluminum.biomeBlacklistEmbellishcraftLarvikiteAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeEmbellishcraftLarvikiteAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkEmbellishcraftLarvikiteAluminumOre.get(), Aluminum.minHeightEmbellishcraftLarvikiteAluminumOre.get(), 0, Aluminum.maxHeightEmbellishcraftLarvikiteAluminumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Aluminum.enableEmbellishcraftMarbleAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistEmbellishcraftMarbleAluminumOre.get() && Aluminum.temperatureBlacklistEmbellishcraftMarbleAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistEmbellishcraftMarbleAluminumOre.get() && !Aluminum.temperatureBlacklistEmbellishcraftMarbleAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistEmbellishcraftMarbleAluminumOre.get() && Aluminum.biomeBlacklistEmbellishcraftMarbleAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistEmbellishcraftMarbleAluminumOre.get() && !Aluminum.biomeBlacklistEmbellishcraftMarbleAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeEmbellishcraftMarbleAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkEmbellishcraftMarbleAluminumOre.get(), Aluminum.minHeightEmbellishcraftMarbleAluminumOre.get(), 0, Aluminum.maxHeightEmbellishcraftMarbleAluminumOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Aluminum.enableEmbellishcraftSlateAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistEmbellishcraftSlateAluminumOre.get() && Aluminum.temperatureBlacklistEmbellishcraftSlateAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistEmbellishcraftSlateAluminumOre.get() && !Aluminum.temperatureBlacklistEmbellishcraftSlateAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistEmbellishcraftSlateAluminumOre.get() && Aluminum.biomeBlacklistEmbellishcraftSlateAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistEmbellishcraftSlateAluminumOre.get() && !Aluminum.biomeBlacklistEmbellishcraftSlateAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeEmbellishcraftSlateAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkEmbellishcraftSlateAluminumOre.get(), Aluminum.minHeightEmbellishcraftSlateAluminumOre.get(), 0, Aluminum.maxHeightEmbellishcraftSlateAluminumOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Aluminum.enableHardenedStoneAluminumOre.get()) {
                if ((Aluminum.isTempWhitelistHardenedStoneAluminumOre.get() && Aluminum.temperatureBlacklistHardenedStoneAluminumOre.get().contains(biomeTS)) || (!Aluminum.isTempWhitelistHardenedStoneAluminumOre.get() && !Aluminum.temperatureBlacklistHardenedStoneAluminumOre.get().contains(biomeTS))) {
                    if ((Aluminum.isBiomeWhitelistHardenedStoneAluminumOre.get() && Aluminum.biomeBlacklistHardenedStoneAluminumOre.get().contains(biomeRNS)) || (!Aluminum.isBiomeWhitelistHardenedStoneAluminumOre.get() && !Aluminum.biomeBlacklistHardenedStoneAluminumOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_ALUMINUM_ORE.get().getDefaultState(), Aluminum.veinSizeHardenedStoneAluminumOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Aluminum.veinsPerChunkHardenedStoneAluminumOre.get(), Aluminum.minHeightHardenedStoneAluminumOre.get(), 0, Aluminum.maxHeightHardenedStoneAluminumOre.get()))));
                    } } } }
    }
}
