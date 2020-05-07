package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Lead;
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

public class LeadGen {
    public static void addLeadGen(Biome biome, String biomeRNS, String biomeTS) {
        addLeadOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addLeadOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Stone
        if (!General.disableStoneOreGeneration.get()) {
            if (Lead.enableStoneLeadOre.get()) {
                if ((Lead.isTempWhitelistStoneLeadOre.get() && Lead.temperatureBlacklistStoneLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistStoneLeadOre.get() && !Lead.temperatureBlacklistStoneLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistStoneLeadOre.get() && Lead.biomeBlacklistStoneLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistStoneLeadOre.get() && !Lead.biomeBlacklistStoneLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), BlockInit.STONE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeStoneLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkStoneLeadOre.get(), Lead.minHeightStoneLeadOre.get(), 0, Lead.maxHeightStoneLeadOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Lead.enableAndesiteLeadOre.get()) {
                if ((Lead.isTempWhitelistAndesiteLeadOre.get() && Lead.temperatureBlacklistAndesiteLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistAndesiteLeadOre.get() && !Lead.temperatureBlacklistAndesiteLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistAndesiteLeadOre.get() && Lead.biomeBlacklistAndesiteLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistAndesiteLeadOre.get() && !Lead.biomeBlacklistAndesiteLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeAndesiteLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkAndesiteLeadOre.get(), Lead.minHeightAndesiteLeadOre.get(), 0, Lead.maxHeightAndesiteLeadOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Lead.enableDioriteLeadOre.get()) {
                if ((Lead.isTempWhitelistDioriteLeadOre.get() && Lead.temperatureBlacklistDioriteLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistDioriteLeadOre.get() && !Lead.temperatureBlacklistDioriteLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistDioriteLeadOre.get() && Lead.biomeBlacklistDioriteLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistDioriteLeadOre.get() && !Lead.biomeBlacklistDioriteLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeDioriteLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkDioriteLeadOre.get(), Lead.minHeightDioriteLeadOre.get(), 0, Lead.maxHeightDioriteLeadOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Lead.enableGraniteLeadOre.get()) {
                if ((Lead.isTempWhitelistGraniteLeadOre.get() && Lead.temperatureBlacklistGraniteLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistGraniteLeadOre.get() && !Lead.temperatureBlacklistGraniteLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistGraniteLeadOre.get() && Lead.biomeBlacklistGraniteLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistGraniteLeadOre.get() && !Lead.biomeBlacklistGraniteLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeGraniteLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkGraniteLeadOre.get(), Lead.minHeightGraniteLeadOre.get(), 0, Lead.maxHeightGraniteLeadOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Lead.enableNetherrackLeadOre.get()) {
                if ((Lead.isTempWhitelistNetherrackLeadOre.get() && Lead.temperatureBlacklistNetherrackLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistNetherrackLeadOre.get() && !Lead.temperatureBlacklistNetherrackLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistNetherrackLeadOre.get() && Lead.biomeBlacklistNetherrackLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistNetherrackLeadOre.get() && !Lead.biomeBlacklistNetherrackLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_LEAD_ORE.get().getDefaultState(), Lead.veinSizeNetherrackLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkNetherrackLeadOre.get(), Lead.minHeightNetherrackLeadOre.get(), 0, Lead.maxHeightNetherrackLeadOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Lead.enableEndStoneLeadOre.get()) {
                if ((Lead.isTempWhitelistEndStoneLeadOre.get() && Lead.temperatureBlacklistEndStoneLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistEndStoneLeadOre.get() && !Lead.temperatureBlacklistEndStoneLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistEndStoneLeadOre.get() && Lead.biomeBlacklistEndStoneLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistEndStoneLeadOre.get() && !Lead.biomeBlacklistEndStoneLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeEndStoneLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkEndStoneLeadOre.get(), Lead.minHeightEndStoneLeadOre.get(), 0, Lead.maxHeightEndStoneLeadOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Lead.enableSandLeadOre.get()) {
                if ((Lead.isTempWhitelistSandLeadOre.get() && Lead.temperatureBlacklistSandLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistSandLeadOre.get() && !Lead.temperatureBlacklistSandLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistSandLeadOre.get() && Lead.biomeBlacklistSandLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistSandLeadOre.get() && !Lead.biomeBlacklistSandLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_LEAD_ORE.get().getDefaultState(), Lead.veinSizeSandLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkSandLeadOre.get(), Lead.minHeightSandLeadOre.get(), 0, Lead.maxHeightSandLeadOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Lead.enableRedSandLeadOre.get()) {
                if ((Lead.isTempWhitelistRedSandLeadOre.get() && Lead.temperatureBlacklistRedSandLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistRedSandLeadOre.get() && !Lead.temperatureBlacklistRedSandLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistRedSandLeadOre.get() && Lead.biomeBlacklistRedSandLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistRedSandLeadOre.get() && !Lead.biomeBlacklistRedSandLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_LEAD_ORE.get().getDefaultState(), Lead.veinSizeRedSandLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkRedSandLeadOre.get(), Lead.minHeightRedSandLeadOre.get(), 0, Lead.maxHeightRedSandLeadOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Lead.enableGravelLeadOre.get()) {
                if ((Lead.isTempWhitelistGravelLeadOre.get() && Lead.temperatureBlacklistGravelLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistGravelLeadOre.get() && !Lead.temperatureBlacklistGravelLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistGravelLeadOre.get() && Lead.biomeBlacklistGravelLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistGravelLeadOre.get() && !Lead.biomeBlacklistGravelLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_LEAD_ORE.get().getDefaultState(), Lead.veinSizeGravelLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkGravelLeadOre.get(), Lead.minHeightGravelLeadOre.get(), 0, Lead.maxHeightGravelLeadOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Lead.enableSandstoneLeadOre.get()) {
                if ((Lead.isTempWhitelistSandstoneLeadOre.get() && Lead.temperatureBlacklistSandstoneLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistSandstoneLeadOre.get() && !Lead.temperatureBlacklistSandstoneLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistSandstoneLeadOre.get() && Lead.biomeBlacklistSandstoneLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistSandstoneLeadOre.get() && !Lead.biomeBlacklistSandstoneLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeSandstoneLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkSandstoneLeadOre.get(), Lead.minHeightSandstoneLeadOre.get(), 0, Lead.maxHeightSandstoneLeadOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Lead.enableRedSandstoneLeadOre.get()) {
                if ((Lead.isTempWhitelistRedSandstoneLeadOre.get() && Lead.temperatureBlacklistRedSandstoneLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistRedSandstoneLeadOre.get() && !Lead.temperatureBlacklistRedSandstoneLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistRedSandstoneLeadOre.get() && Lead.biomeBlacklistRedSandstoneLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistRedSandstoneLeadOre.get() && !Lead.biomeBlacklistRedSandstoneLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeRedSandstoneLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkRedSandstoneLeadOre.get(), Lead.minHeightRedSandstoneLeadOre.get(), 0, Lead.maxHeightRedSandstoneLeadOre.get()))));
                    } } } }
        if (!General.disableBlueIceOreGeneration.get()) {
            if (Lead.enableBlueIceLeadOre.get()) {
                if ((Lead.isTempWhitelistBlueIceLeadOre.get() && Lead.temperatureBlacklistBlueIceLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistBlueIceLeadOre.get() && !Lead.temperatureBlacklistBlueIceLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistBlueIceLeadOre.get() && Lead.biomeBlacklistBlueIceLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistBlueIceLeadOre.get() && !Lead.biomeBlacklistBlueIceLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("blue_ice", null, new BlockMatcher(Blocks.BLUE_ICE)), BlockInit.BLUE_ICE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeBlueIceLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkBlueIceLeadOre.get(), Lead.minHeightBlueIceLeadOre.get(), 0, Lead.maxHeightBlueIceLeadOre.get()))));
                    } } } }
        if (!General.disablePackedIceOreGeneration.get()) {
            if (Lead.enablePackedIceLeadOre.get()) {
                if ((Lead.isTempWhitelistPackedIceLeadOre.get() && Lead.temperatureBlacklistPackedIceLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistPackedIceLeadOre.get() && !Lead.temperatureBlacklistPackedIceLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistPackedIceLeadOre.get() && Lead.biomeBlacklistPackedIceLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistPackedIceLeadOre.get() && !Lead.biomeBlacklistPackedIceLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("packed_ice", null, new BlockMatcher(Blocks.PACKED_ICE)), BlockInit.PACKED_ICE_LEAD_ORE.get().getDefaultState(), Lead.veinSizePackedIceLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkPackedIceLeadOre.get(), Lead.minHeightPackedIceLeadOre.get(), 0, Lead.maxHeightPackedIceLeadOre.get()))));
                    } } } }
        if (!General.disableBedrockOreGeneration.get()) {
            if (Lead.enableBedrockLeadOre.get()) {
                if ((Lead.isTempWhitelistBedrockLeadOre.get() && Lead.temperatureBlacklistBedrockLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistBedrockLeadOre.get() && !Lead.temperatureBlacklistBedrockLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistBedrockLeadOre.get() && Lead.biomeBlacklistBedrockLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistBedrockLeadOre.get() && !Lead.biomeBlacklistBedrockLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("bedrock", null, new BlockMatcher(Blocks.BEDROCK)), BlockInit.BEDROCK_LEAD_ORE.get().getDefaultState(), Lead.veinSizeBedrockLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkBedrockLeadOre.get(), Lead.minHeightBedrockLeadOre.get(), 0, Lead.maxHeightBedrockLeadOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Lead.enableQuarkBasaltLeadOre.get()) {
                if ((Lead.isTempWhitelistQuarkBasaltLeadOre.get() && Lead.temperatureBlacklistQuarkBasaltLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistQuarkBasaltLeadOre.get() && !Lead.temperatureBlacklistQuarkBasaltLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistQuarkBasaltLeadOre.get() && Lead.biomeBlacklistQuarkBasaltLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistQuarkBasaltLeadOre.get() && !Lead.biomeBlacklistQuarkBasaltLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_LEAD_ORE.get().getDefaultState(), Lead.veinSizeQuarkBasaltLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkQuarkBasaltLeadOre.get(), Lead.minHeightQuarkBasaltLeadOre.get(), 0, Lead.maxHeightQuarkBasaltLeadOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Lead.enableQuarkMarbleLeadOre.get()) {
                if ((Lead.isTempWhitelistQuarkMarbleLeadOre.get() && Lead.temperatureBlacklistQuarkMarbleLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistQuarkMarbleLeadOre.get() && !Lead.temperatureBlacklistQuarkMarbleLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistQuarkMarbleLeadOre.get() && Lead.biomeBlacklistQuarkMarbleLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistQuarkMarbleLeadOre.get() && !Lead.biomeBlacklistQuarkMarbleLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeQuarkMarbleLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkQuarkMarbleLeadOre.get(), Lead.minHeightQuarkMarbleLeadOre.get(), 0, Lead.maxHeightQuarkMarbleLeadOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Lead.enableQuarkSlateLeadOre.get()) {
                if ((Lead.isTempWhitelistQuarkSlateLeadOre.get() && Lead.temperatureBlacklistQuarkSlateLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistQuarkSlateLeadOre.get() && !Lead.temperatureBlacklistQuarkSlateLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistQuarkSlateLeadOre.get() && Lead.biomeBlacklistQuarkSlateLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistQuarkSlateLeadOre.get() && !Lead.biomeBlacklistQuarkSlateLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeQuarkSlateLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkQuarkSlateLeadOre.get(), Lead.minHeightQuarkSlateLeadOre.get(), 0, Lead.maxHeightQuarkSlateLeadOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Lead.enableQuarkLimestoneLeadOre.get()) {
                if ((Lead.isTempWhitelistQuarkLimestoneLeadOre.get() && Lead.temperatureBlacklistQuarkLimestoneLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistQuarkLimestoneLeadOre.get() && !Lead.temperatureBlacklistQuarkLimestoneLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistQuarkLimestoneLeadOre.get() && Lead.biomeBlacklistQuarkLimestoneLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistQuarkLimestoneLeadOre.get() && !Lead.biomeBlacklistQuarkLimestoneLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeQuarkLimestoneLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkQuarkLimestoneLeadOre.get(), Lead.minHeightQuarkLimestoneLeadOre.get(), 0, Lead.maxHeightQuarkLimestoneLeadOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Lead.enableQuarkJasperLeadOre.get()) {
                if ((Lead.isTempWhitelistQuarkJasperLeadOre.get() && Lead.temperatureBlacklistQuarkJasperLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistQuarkJasperLeadOre.get() && !Lead.temperatureBlacklistQuarkJasperLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistQuarkJasperLeadOre.get() && Lead.biomeBlacklistQuarkJasperLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistQuarkJasperLeadOre.get() && !Lead.biomeBlacklistQuarkJasperLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_LEAD_ORE.get().getDefaultState(), Lead.veinSizeQuarkJasperLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkQuarkJasperLeadOre.get(), Lead.minHeightQuarkJasperLeadOre.get(), 0, Lead.maxHeightQuarkJasperLeadOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Lead.enableEmbellishcraftBasaltLeadOre.get()) {
                if ((Lead.isTempWhitelistEmbellishcraftBasaltLeadOre.get() && Lead.temperatureBlacklistEmbellishcraftBasaltLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistEmbellishcraftBasaltLeadOre.get() && !Lead.temperatureBlacklistEmbellishcraftBasaltLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistEmbellishcraftBasaltLeadOre.get() && Lead.biomeBlacklistEmbellishcraftBasaltLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistEmbellishcraftBasaltLeadOre.get() && !Lead.biomeBlacklistEmbellishcraftBasaltLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_LEAD_ORE.get().getDefaultState(), Lead.veinSizeEmbellishcraftBasaltLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkEmbellishcraftBasaltLeadOre.get(), Lead.minHeightEmbellishcraftBasaltLeadOre.get(), 0, Lead.maxHeightEmbellishcraftBasaltLeadOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Lead.enableEmbellishcraftGneissLeadOre.get()) {
                if ((Lead.isTempWhitelistEmbellishcraftGneissLeadOre.get() && Lead.temperatureBlacklistEmbellishcraftGneissLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistEmbellishcraftGneissLeadOre.get() && !Lead.temperatureBlacklistEmbellishcraftGneissLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistEmbellishcraftGneissLeadOre.get() && Lead.biomeBlacklistEmbellishcraftGneissLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistEmbellishcraftGneissLeadOre.get() && !Lead.biomeBlacklistEmbellishcraftGneissLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_LEAD_ORE.get().getDefaultState(), Lead.veinSizeEmbellishcraftGneissLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkEmbellishcraftGneissLeadOre.get(), Lead.minHeightEmbellishcraftGneissLeadOre.get(), 0, Lead.maxHeightEmbellishcraftGneissLeadOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Lead.enableEmbellishcraftJadeLeadOre.get()) {
                if ((Lead.isTempWhitelistEmbellishcraftJadeLeadOre.get() && Lead.temperatureBlacklistEmbellishcraftJadeLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistEmbellishcraftJadeLeadOre.get() && !Lead.temperatureBlacklistEmbellishcraftJadeLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistEmbellishcraftJadeLeadOre.get() && Lead.biomeBlacklistEmbellishcraftJadeLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistEmbellishcraftJadeLeadOre.get() && !Lead.biomeBlacklistEmbellishcraftJadeLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeEmbellishcraftJadeLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkEmbellishcraftJadeLeadOre.get(), Lead.minHeightEmbellishcraftJadeLeadOre.get(), 0, Lead.maxHeightEmbellishcraftJadeLeadOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Lead.enableEmbellishcraftLarvikiteLeadOre.get()) {
                if ((Lead.isTempWhitelistEmbellishcraftLarvikiteLeadOre.get() && Lead.temperatureBlacklistEmbellishcraftLarvikiteLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistEmbellishcraftLarvikiteLeadOre.get() && !Lead.temperatureBlacklistEmbellishcraftLarvikiteLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistEmbellishcraftLarvikiteLeadOre.get() && Lead.biomeBlacklistEmbellishcraftLarvikiteLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistEmbellishcraftLarvikiteLeadOre.get() && !Lead.biomeBlacklistEmbellishcraftLarvikiteLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeEmbellishcraftLarvikiteLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkEmbellishcraftLarvikiteLeadOre.get(), Lead.minHeightEmbellishcraftLarvikiteLeadOre.get(), 0, Lead.maxHeightEmbellishcraftLarvikiteLeadOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Lead.enableEmbellishcraftMarbleLeadOre.get()) {
                if ((Lead.isTempWhitelistEmbellishcraftMarbleLeadOre.get() && Lead.temperatureBlacklistEmbellishcraftMarbleLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistEmbellishcraftMarbleLeadOre.get() && !Lead.temperatureBlacklistEmbellishcraftMarbleLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistEmbellishcraftMarbleLeadOre.get() && Lead.biomeBlacklistEmbellishcraftMarbleLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistEmbellishcraftMarbleLeadOre.get() && !Lead.biomeBlacklistEmbellishcraftMarbleLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeEmbellishcraftMarbleLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkEmbellishcraftMarbleLeadOre.get(), Lead.minHeightEmbellishcraftMarbleLeadOre.get(), 0, Lead.maxHeightEmbellishcraftMarbleLeadOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Lead.enableEmbellishcraftSlateLeadOre.get()) {
                if ((Lead.isTempWhitelistEmbellishcraftSlateLeadOre.get() && Lead.temperatureBlacklistEmbellishcraftSlateLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistEmbellishcraftSlateLeadOre.get() && !Lead.temperatureBlacklistEmbellishcraftSlateLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistEmbellishcraftSlateLeadOre.get() && Lead.biomeBlacklistEmbellishcraftSlateLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistEmbellishcraftSlateLeadOre.get() && !Lead.biomeBlacklistEmbellishcraftSlateLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeEmbellishcraftSlateLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkEmbellishcraftSlateLeadOre.get(), Lead.minHeightEmbellishcraftSlateLeadOre.get(), 0, Lead.maxHeightEmbellishcraftSlateLeadOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Lead.enableHardenedStoneLeadOre.get()) {
                if ((Lead.isTempWhitelistHardenedStoneLeadOre.get() && Lead.temperatureBlacklistHardenedStoneLeadOre.get().contains(biomeTS)) || (!Lead.isTempWhitelistHardenedStoneLeadOre.get() && !Lead.temperatureBlacklistHardenedStoneLeadOre.get().contains(biomeTS))) {
                    if ((Lead.isBiomeWhitelistHardenedStoneLeadOre.get() && Lead.biomeBlacklistHardenedStoneLeadOre.get().contains(biomeRNS)) || (!Lead.isBiomeWhitelistHardenedStoneLeadOre.get() && !Lead.biomeBlacklistHardenedStoneLeadOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.HARDENED_STONE_LEAD_ORE.get().getDefaultState(), Lead.veinSizeHardenedStoneLeadOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Lead.veinsPerChunkHardenedStoneLeadOre.get(), Lead.minHeightHardenedStoneLeadOre.get(), 0, Lead.maxHeightHardenedStoneLeadOre.get()))));
                    } } } }
    }
}
