package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
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
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.GOLD_ORE.getDefaultState(), Gold.veinSizeVanillaGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkVanillaGoldOre.get(), Gold.minHeightVanillaGoldOre.get(), 0, Gold.maxHeightVanillaGoldOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Gold.enableAndesiteGoldOre.get()) {
                if ((Gold.isTempWhitelistAndesiteGoldOre.get() && Gold.temperatureBlacklistAndesiteGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistAndesiteGoldOre.get() && !Gold.temperatureBlacklistAndesiteGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistAndesiteGoldOre.get() && Gold.biomeBlacklistAndesiteGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistAndesiteGoldOre.get() && !Gold.biomeBlacklistAndesiteGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeAndesiteGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkAndesiteGoldOre.get(), Gold.minHeightAndesiteGoldOre.get(), 0, Gold.maxHeightAndesiteGoldOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Gold.enableDioriteGoldOre.get()) {
                if ((Gold.isTempWhitelistDioriteGoldOre.get() && Gold.temperatureBlacklistDioriteGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistDioriteGoldOre.get() && !Gold.temperatureBlacklistDioriteGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistDioriteGoldOre.get() && Gold.biomeBlacklistDioriteGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistDioriteGoldOre.get() && !Gold.biomeBlacklistDioriteGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeDioriteGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkDioriteGoldOre.get(), Gold.minHeightDioriteGoldOre.get(), 0, Gold.maxHeightDioriteGoldOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Gold.enableGraniteGoldOre.get()) {
                if ((Gold.isTempWhitelistGraniteGoldOre.get() && Gold.temperatureBlacklistGraniteGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistGraniteGoldOre.get() && !Gold.temperatureBlacklistGraniteGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistGraniteGoldOre.get() && Gold.biomeBlacklistGraniteGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistGraniteGoldOre.get() && !Gold.biomeBlacklistGraniteGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeGraniteGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkGraniteGoldOre.get(), Gold.minHeightGraniteGoldOre.get(), 0, Gold.maxHeightGraniteGoldOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Gold.enableNetherrackGoldOre.get()) {
                if ((Gold.isTempWhitelistNetherrackGoldOre.get() && Gold.temperatureBlacklistNetherrackGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistNetherrackGoldOre.get() && !Gold.temperatureBlacklistNetherrackGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistNetherrackGoldOre.get() && Gold.biomeBlacklistNetherrackGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistNetherrackGoldOre.get() && !Gold.biomeBlacklistNetherrackGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_GOLD_ORE.get().getDefaultState(), Gold.veinSizeNetherrackGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkNetherrackGoldOre.get(), Gold.minHeightNetherrackGoldOre.get(), 0, Gold.maxHeightNetherrackGoldOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Gold.enableEndStoneGoldOre.get()) {
                if ((Gold.isTempWhitelistEndStoneGoldOre.get() && Gold.temperatureBlacklistEndStoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEndStoneGoldOre.get() && !Gold.temperatureBlacklistEndStoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEndStoneGoldOre.get() && Gold.biomeBlacklistEndStoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEndStoneGoldOre.get() && !Gold.biomeBlacklistEndStoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEndStoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEndStoneGoldOre.get(), Gold.minHeightEndStoneGoldOre.get(), 0, Gold.maxHeightEndStoneGoldOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Gold.enableSandGoldOre.get()) {
                if ((Gold.isTempWhitelistSandGoldOre.get() && Gold.temperatureBlacklistSandGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistSandGoldOre.get() && !Gold.temperatureBlacklistSandGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistSandGoldOre.get() && Gold.biomeBlacklistSandGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistSandGoldOre.get() && !Gold.biomeBlacklistSandGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_GOLD_ORE.get().getDefaultState(), Gold.veinSizeSandGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkSandGoldOre.get(), Gold.minHeightSandGoldOre.get(), 0, Gold.maxHeightSandGoldOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Gold.enableRedSandGoldOre.get()) {
                if ((Gold.isTempWhitelistRedSandGoldOre.get() && Gold.temperatureBlacklistRedSandGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistRedSandGoldOre.get() && !Gold.temperatureBlacklistRedSandGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistRedSandGoldOre.get() && Gold.biomeBlacklistRedSandGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistRedSandGoldOre.get() && !Gold.biomeBlacklistRedSandGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_GOLD_ORE.get().getDefaultState(), Gold.veinSizeRedSandGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkRedSandGoldOre.get(), Gold.minHeightRedSandGoldOre.get(), 0, Gold.maxHeightRedSandGoldOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Gold.enableGravelGoldOre.get()) {
                if ((Gold.isTempWhitelistGravelGoldOre.get() && Gold.temperatureBlacklistGravelGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistGravelGoldOre.get() && !Gold.temperatureBlacklistGravelGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistGravelGoldOre.get() && Gold.biomeBlacklistGravelGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistGravelGoldOre.get() && !Gold.biomeBlacklistGravelGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_GOLD_ORE.get().getDefaultState(), Gold.veinSizeGravelGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkGravelGoldOre.get(), Gold.minHeightGravelGoldOre.get(), 0, Gold.maxHeightGravelGoldOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Gold.enableSandstoneGoldOre.get()) {
                if ((Gold.isTempWhitelistSandstoneGoldOre.get() && Gold.temperatureBlacklistSandstoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistSandstoneGoldOre.get() && !Gold.temperatureBlacklistSandstoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistSandstoneGoldOre.get() && Gold.biomeBlacklistSandstoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistSandstoneGoldOre.get() && !Gold.biomeBlacklistSandstoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeSandstoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkSandstoneGoldOre.get(), Gold.minHeightSandstoneGoldOre.get(), 0, Gold.maxHeightSandstoneGoldOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Gold.enableRedSandstoneGoldOre.get()) {
                if ((Gold.isTempWhitelistRedSandstoneGoldOre.get() && Gold.temperatureBlacklistRedSandstoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistRedSandstoneGoldOre.get() && !Gold.temperatureBlacklistRedSandstoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistRedSandstoneGoldOre.get() && Gold.biomeBlacklistRedSandstoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistRedSandstoneGoldOre.get() && !Gold.biomeBlacklistRedSandstoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeRedSandstoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkRedSandstoneGoldOre.get(), Gold.minHeightRedSandstoneGoldOre.get(), 0, Gold.maxHeightRedSandstoneGoldOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Gold.enableBlueIceGoldOre.get()) {
                if ((Gold.isTempWhitelistBlueIceGoldOre.get() && Gold.temperatureBlacklistBlueIceGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistBlueIceGoldOre.get() && !Gold.temperatureBlacklistBlueIceGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistBlueIceGoldOre.get() && Gold.biomeBlacklistBlueIceGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistBlueIceGoldOre.get() && !Gold.biomeBlacklistBlueIceGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeBlueIceGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkBlueIceGoldOre.get(), Gold.minHeightBlueIceGoldOre.get(), 0, Gold.maxHeightBlueIceGoldOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Gold.enablePackedIceGoldOre.get()) {
                if ((Gold.isTempWhitelistPackedIceGoldOre.get() && Gold.temperatureBlacklistPackedIceGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistPackedIceGoldOre.get() && !Gold.temperatureBlacklistPackedIceGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistPackedIceGoldOre.get() && Gold.biomeBlacklistPackedIceGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistPackedIceGoldOre.get() && !Gold.biomeBlacklistPackedIceGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_GOLD_ORE.get().getDefaultState(), Gold.veinSizePackedIceGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkPackedIceGoldOre.get(), Gold.minHeightPackedIceGoldOre.get(), 0, Gold.maxHeightPackedIceGoldOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Gold.enableBedrockGoldOre.get()) {
                if ((Gold.isTempWhitelistBedrockGoldOre.get() && Gold.temperatureBlacklistBedrockGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistBedrockGoldOre.get() && !Gold.temperatureBlacklistBedrockGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistBedrockGoldOre.get() && Gold.biomeBlacklistBedrockGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistBedrockGoldOre.get() && !Gold.biomeBlacklistBedrockGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_GOLD_ORE.get().getDefaultState(), Gold.veinSizeBedrockGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkBedrockGoldOre.get(), Gold.minHeightBedrockGoldOre.get(), 0, Gold.maxHeightBedrockGoldOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Gold.enableQuarkBasaltGoldOre.get()) {
                if ((Gold.isTempWhitelistQuarkBasaltGoldOre.get() && Gold.temperatureBlacklistQuarkBasaltGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistQuarkBasaltGoldOre.get() && !Gold.temperatureBlacklistQuarkBasaltGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistQuarkBasaltGoldOre.get() && Gold.biomeBlacklistQuarkBasaltGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistQuarkBasaltGoldOre.get() && !Gold.biomeBlacklistQuarkBasaltGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_GOLD_ORE.get().getDefaultState(), Gold.veinSizeQuarkBasaltGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkQuarkBasaltGoldOre.get(), Gold.minHeightQuarkBasaltGoldOre.get(), 0, Gold.maxHeightQuarkBasaltGoldOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Gold.enableQuarkMarbleGoldOre.get()) {
                if ((Gold.isTempWhitelistQuarkMarbleGoldOre.get() && Gold.temperatureBlacklistQuarkMarbleGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistQuarkMarbleGoldOre.get() && !Gold.temperatureBlacklistQuarkMarbleGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistQuarkMarbleGoldOre.get() && Gold.biomeBlacklistQuarkMarbleGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistQuarkMarbleGoldOre.get() && !Gold.biomeBlacklistQuarkMarbleGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeQuarkMarbleGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkQuarkMarbleGoldOre.get(), Gold.minHeightQuarkMarbleGoldOre.get(), 0, Gold.maxHeightQuarkMarbleGoldOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Gold.enableQuarkSlateGoldOre.get()) {
                if ((Gold.isTempWhitelistQuarkSlateGoldOre.get() && Gold.temperatureBlacklistQuarkSlateGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistQuarkSlateGoldOre.get() && !Gold.temperatureBlacklistQuarkSlateGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistQuarkSlateGoldOre.get() && Gold.biomeBlacklistQuarkSlateGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistQuarkSlateGoldOre.get() && !Gold.biomeBlacklistQuarkSlateGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeQuarkSlateGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkQuarkSlateGoldOre.get(), Gold.minHeightQuarkSlateGoldOre.get(), 0, Gold.maxHeightQuarkSlateGoldOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Gold.enableQuarkLimestoneGoldOre.get()) {
                if ((Gold.isTempWhitelistQuarkLimestoneGoldOre.get() && Gold.temperatureBlacklistQuarkLimestoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistQuarkLimestoneGoldOre.get() && !Gold.temperatureBlacklistQuarkLimestoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistQuarkLimestoneGoldOre.get() && Gold.biomeBlacklistQuarkLimestoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistQuarkLimestoneGoldOre.get() && !Gold.biomeBlacklistQuarkLimestoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeQuarkLimestoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkQuarkLimestoneGoldOre.get(), Gold.minHeightQuarkLimestoneGoldOre.get(), 0, Gold.maxHeightQuarkLimestoneGoldOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Gold.enableQuarkJasperGoldOre.get()) {
                if ((Gold.isTempWhitelistQuarkJasperGoldOre.get() && Gold.temperatureBlacklistQuarkJasperGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistQuarkJasperGoldOre.get() && !Gold.temperatureBlacklistQuarkJasperGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistQuarkJasperGoldOre.get() && Gold.biomeBlacklistQuarkJasperGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistQuarkJasperGoldOre.get() && !Gold.biomeBlacklistQuarkJasperGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_GOLD_ORE.get().getDefaultState(), Gold.veinSizeQuarkJasperGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkQuarkJasperGoldOre.get(), Gold.minHeightQuarkJasperGoldOre.get(), 0, Gold.maxHeightQuarkJasperGoldOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Gold.enableEmbellishcraftBasaltGoldOre.get()) {
                if ((Gold.isTempWhitelistEmbellishcraftBasaltGoldOre.get() && Gold.temperatureBlacklistEmbellishcraftBasaltGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEmbellishcraftBasaltGoldOre.get() && !Gold.temperatureBlacklistEmbellishcraftBasaltGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEmbellishcraftBasaltGoldOre.get() && Gold.biomeBlacklistEmbellishcraftBasaltGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEmbellishcraftBasaltGoldOre.get() && !Gold.biomeBlacklistEmbellishcraftBasaltGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEmbellishcraftBasaltGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEmbellishcraftBasaltGoldOre.get(), Gold.minHeightEmbellishcraftBasaltGoldOre.get(), 0, Gold.maxHeightEmbellishcraftBasaltGoldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Gold.enableEmbellishcraftGneissGoldOre.get()) {
                if ((Gold.isTempWhitelistEmbellishcraftGneissGoldOre.get() && Gold.temperatureBlacklistEmbellishcraftGneissGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEmbellishcraftGneissGoldOre.get() && !Gold.temperatureBlacklistEmbellishcraftGneissGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEmbellishcraftGneissGoldOre.get() && Gold.biomeBlacklistEmbellishcraftGneissGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEmbellishcraftGneissGoldOre.get() && !Gold.biomeBlacklistEmbellishcraftGneissGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEmbellishcraftGneissGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEmbellishcraftGneissGoldOre.get(), Gold.minHeightEmbellishcraftGneissGoldOre.get(), 0, Gold.maxHeightEmbellishcraftGneissGoldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Gold.enableEmbellishcraftJadeGoldOre.get()) {
                if ((Gold.isTempWhitelistEmbellishcraftJadeGoldOre.get() && Gold.temperatureBlacklistEmbellishcraftJadeGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEmbellishcraftJadeGoldOre.get() && !Gold.temperatureBlacklistEmbellishcraftJadeGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEmbellishcraftJadeGoldOre.get() && Gold.biomeBlacklistEmbellishcraftJadeGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEmbellishcraftJadeGoldOre.get() && !Gold.biomeBlacklistEmbellishcraftJadeGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEmbellishcraftJadeGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEmbellishcraftJadeGoldOre.get(), Gold.minHeightEmbellishcraftJadeGoldOre.get(), 0, Gold.maxHeightEmbellishcraftJadeGoldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Gold.enableEmbellishcraftLarvikiteGoldOre.get()) {
                if ((Gold.isTempWhitelistEmbellishcraftLarvikiteGoldOre.get() && Gold.temperatureBlacklistEmbellishcraftLarvikiteGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEmbellishcraftLarvikiteGoldOre.get() && !Gold.temperatureBlacklistEmbellishcraftLarvikiteGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEmbellishcraftLarvikiteGoldOre.get() && Gold.biomeBlacklistEmbellishcraftLarvikiteGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEmbellishcraftLarvikiteGoldOre.get() && !Gold.biomeBlacklistEmbellishcraftLarvikiteGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEmbellishcraftLarvikiteGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEmbellishcraftLarvikiteGoldOre.get(), Gold.minHeightEmbellishcraftLarvikiteGoldOre.get(), 0, Gold.maxHeightEmbellishcraftLarvikiteGoldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Gold.enableEmbellishcraftMarbleGoldOre.get()) {
                if ((Gold.isTempWhitelistEmbellishcraftMarbleGoldOre.get() && Gold.temperatureBlacklistEmbellishcraftMarbleGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEmbellishcraftMarbleGoldOre.get() && !Gold.temperatureBlacklistEmbellishcraftMarbleGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEmbellishcraftMarbleGoldOre.get() && Gold.biomeBlacklistEmbellishcraftMarbleGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEmbellishcraftMarbleGoldOre.get() && !Gold.biomeBlacklistEmbellishcraftMarbleGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEmbellishcraftMarbleGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEmbellishcraftMarbleGoldOre.get(), Gold.minHeightEmbellishcraftMarbleGoldOre.get(), 0, Gold.maxHeightEmbellishcraftMarbleGoldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Gold.enableEmbellishcraftSlateGoldOre.get()) {
                if ((Gold.isTempWhitelistEmbellishcraftSlateGoldOre.get() && Gold.temperatureBlacklistEmbellishcraftSlateGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistEmbellishcraftSlateGoldOre.get() && !Gold.temperatureBlacklistEmbellishcraftSlateGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistEmbellishcraftSlateGoldOre.get() && Gold.biomeBlacklistEmbellishcraftSlateGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistEmbellishcraftSlateGoldOre.get() && !Gold.biomeBlacklistEmbellishcraftSlateGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeEmbellishcraftSlateGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkEmbellishcraftSlateGoldOre.get(), Gold.minHeightEmbellishcraftSlateGoldOre.get(), 0, Gold.maxHeightEmbellishcraftSlateGoldOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Gold.enableHardenedStoneGoldOre.get()) {
                if ((Gold.isTempWhitelistHardenedStoneGoldOre.get() && Gold.temperatureBlacklistHardenedStoneGoldOre.get().contains(biomeTS)) || (!Gold.isTempWhitelistHardenedStoneGoldOre.get() && !Gold.temperatureBlacklistHardenedStoneGoldOre.get().contains(biomeTS))) {
                    if ((Gold.isBiomeWhitelistHardenedStoneGoldOre.get() && Gold.biomeBlacklistHardenedStoneGoldOre.get().contains(biomeRNS)) || (!Gold.isBiomeWhitelistHardenedStoneGoldOre.get() && !Gold.biomeBlacklistHardenedStoneGoldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_GOLD_ORE.get().getDefaultState(), Gold.veinSizeHardenedStoneGoldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Gold.veinsPerChunkHardenedStoneGoldOre.get(), Gold.minHeightHardenedStoneGoldOre.get(), 0, Gold.maxHeightHardenedStoneGoldOre.get()))));
                    } } } }
    }
}
