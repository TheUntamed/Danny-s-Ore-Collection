package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Emerald;
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
        // Vanilla
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
        if (!General.disableRedSandOreGeneration.get()) {
            if (Emerald.enableRedSandEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistRedSandEmeraldOre.get() && Emerald.temperatureBlacklistRedSandEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistRedSandEmeraldOre.get() && !Emerald.temperatureBlacklistRedSandEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistRedSandEmeraldOre.get() && Emerald.biomeBlacklistRedSandEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistRedSandEmeraldOre.get() && !Emerald.biomeBlacklistRedSandEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeRedSandEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkRedSandEmeraldOre.get(), Emerald.minHeightRedSandEmeraldOre.get(), 0, Emerald.maxHeightRedSandEmeraldOre.get()))));
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
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Emerald.enableQuarkBasaltEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistQuarkBasaltEmeraldOre.get() && Emerald.temperatureBlacklistQuarkBasaltEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistQuarkBasaltEmeraldOre.get() && !Emerald.temperatureBlacklistQuarkBasaltEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistQuarkBasaltEmeraldOre.get() && Emerald.biomeBlacklistQuarkBasaltEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistQuarkBasaltEmeraldOre.get() && !Emerald.biomeBlacklistQuarkBasaltEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeQuarkBasaltEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkQuarkBasaltEmeraldOre.get(), Emerald.minHeightQuarkBasaltEmeraldOre.get(), 0, Emerald.maxHeightQuarkBasaltEmeraldOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Emerald.enableQuarkMarbleEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistQuarkMarbleEmeraldOre.get() && Emerald.temperatureBlacklistQuarkMarbleEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistQuarkMarbleEmeraldOre.get() && !Emerald.temperatureBlacklistQuarkMarbleEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistQuarkMarbleEmeraldOre.get() && Emerald.biomeBlacklistQuarkMarbleEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistQuarkMarbleEmeraldOre.get() && !Emerald.biomeBlacklistQuarkMarbleEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeQuarkMarbleEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkQuarkMarbleEmeraldOre.get(), Emerald.minHeightQuarkMarbleEmeraldOre.get(), 0, Emerald.maxHeightQuarkMarbleEmeraldOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Emerald.enableQuarkSlateEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistQuarkSlateEmeraldOre.get() && Emerald.temperatureBlacklistQuarkSlateEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistQuarkSlateEmeraldOre.get() && !Emerald.temperatureBlacklistQuarkSlateEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistQuarkSlateEmeraldOre.get() && Emerald.biomeBlacklistQuarkSlateEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistQuarkSlateEmeraldOre.get() && !Emerald.biomeBlacklistQuarkSlateEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeQuarkSlateEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkQuarkSlateEmeraldOre.get(), Emerald.minHeightQuarkSlateEmeraldOre.get(), 0, Emerald.maxHeightQuarkSlateEmeraldOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Emerald.enableQuarkLimestoneEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistQuarkLimestoneEmeraldOre.get() && Emerald.temperatureBlacklistQuarkLimestoneEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistQuarkLimestoneEmeraldOre.get() && !Emerald.temperatureBlacklistQuarkLimestoneEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistQuarkLimestoneEmeraldOre.get() && Emerald.biomeBlacklistQuarkLimestoneEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistQuarkLimestoneEmeraldOre.get() && !Emerald.biomeBlacklistQuarkLimestoneEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeQuarkLimestoneEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkQuarkLimestoneEmeraldOre.get(), Emerald.minHeightQuarkLimestoneEmeraldOre.get(), 0, Emerald.maxHeightQuarkLimestoneEmeraldOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Emerald.enableQuarkJasperEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistQuarkJasperEmeraldOre.get() && Emerald.temperatureBlacklistQuarkJasperEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistQuarkJasperEmeraldOre.get() && !Emerald.temperatureBlacklistQuarkJasperEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistQuarkJasperEmeraldOre.get() && Emerald.biomeBlacklistQuarkJasperEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistQuarkJasperEmeraldOre.get() && !Emerald.biomeBlacklistQuarkJasperEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeQuarkJasperEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkQuarkJasperEmeraldOre.get(), Emerald.minHeightQuarkJasperEmeraldOre.get(), 0, Emerald.maxHeightQuarkJasperEmeraldOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Emerald.enableEmbellishcraftBasaltEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistEmbellishcraftBasaltEmeraldOre.get() && Emerald.temperatureBlacklistEmbellishcraftBasaltEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistEmbellishcraftBasaltEmeraldOre.get() && !Emerald.temperatureBlacklistEmbellishcraftBasaltEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistEmbellishcraftBasaltEmeraldOre.get() && Emerald.biomeBlacklistEmbellishcraftBasaltEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistEmbellishcraftBasaltEmeraldOre.get() && !Emerald.biomeBlacklistEmbellishcraftBasaltEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeEmbellishcraftBasaltEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkEmbellishcraftBasaltEmeraldOre.get(), Emerald.minHeightEmbellishcraftBasaltEmeraldOre.get(), 0, Emerald.maxHeightEmbellishcraftBasaltEmeraldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Emerald.enableEmbellishcraftGneissEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistEmbellishcraftGneissEmeraldOre.get() && Emerald.temperatureBlacklistEmbellishcraftGneissEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistEmbellishcraftGneissEmeraldOre.get() && !Emerald.temperatureBlacklistEmbellishcraftGneissEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistEmbellishcraftGneissEmeraldOre.get() && Emerald.biomeBlacklistEmbellishcraftGneissEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistEmbellishcraftGneissEmeraldOre.get() && !Emerald.biomeBlacklistEmbellishcraftGneissEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeEmbellishcraftGneissEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkEmbellishcraftGneissEmeraldOre.get(), Emerald.minHeightEmbellishcraftGneissEmeraldOre.get(), 0, Emerald.maxHeightEmbellishcraftGneissEmeraldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Emerald.enableEmbellishcraftJadeEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistEmbellishcraftJadeEmeraldOre.get() && Emerald.temperatureBlacklistEmbellishcraftJadeEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistEmbellishcraftJadeEmeraldOre.get() && !Emerald.temperatureBlacklistEmbellishcraftJadeEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistEmbellishcraftJadeEmeraldOre.get() && Emerald.biomeBlacklistEmbellishcraftJadeEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistEmbellishcraftJadeEmeraldOre.get() && !Emerald.biomeBlacklistEmbellishcraftJadeEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeEmbellishcraftJadeEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkEmbellishcraftJadeEmeraldOre.get(), Emerald.minHeightEmbellishcraftJadeEmeraldOre.get(), 0, Emerald.maxHeightEmbellishcraftJadeEmeraldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Emerald.enableEmbellishcraftLarvikiteEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistEmbellishcraftLarvikiteEmeraldOre.get() && Emerald.temperatureBlacklistEmbellishcraftLarvikiteEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistEmbellishcraftLarvikiteEmeraldOre.get() && !Emerald.temperatureBlacklistEmbellishcraftLarvikiteEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistEmbellishcraftLarvikiteEmeraldOre.get() && Emerald.biomeBlacklistEmbellishcraftLarvikiteEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistEmbellishcraftLarvikiteEmeraldOre.get() && !Emerald.biomeBlacklistEmbellishcraftLarvikiteEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeEmbellishcraftLarvikiteEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkEmbellishcraftLarvikiteEmeraldOre.get(), Emerald.minHeightEmbellishcraftLarvikiteEmeraldOre.get(), 0, Emerald.maxHeightEmbellishcraftLarvikiteEmeraldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Emerald.enableEmbellishcraftMarbleEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistEmbellishcraftMarbleEmeraldOre.get() && Emerald.temperatureBlacklistEmbellishcraftMarbleEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistEmbellishcraftMarbleEmeraldOre.get() && !Emerald.temperatureBlacklistEmbellishcraftMarbleEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistEmbellishcraftMarbleEmeraldOre.get() && Emerald.biomeBlacklistEmbellishcraftMarbleEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistEmbellishcraftMarbleEmeraldOre.get() && !Emerald.biomeBlacklistEmbellishcraftMarbleEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeEmbellishcraftMarbleEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkEmbellishcraftMarbleEmeraldOre.get(), Emerald.minHeightEmbellishcraftMarbleEmeraldOre.get(), 0, Emerald.maxHeightEmbellishcraftMarbleEmeraldOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Emerald.enableEmbellishcraftSlateEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistEmbellishcraftSlateEmeraldOre.get() && Emerald.temperatureBlacklistEmbellishcraftSlateEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistEmbellishcraftSlateEmeraldOre.get() && !Emerald.temperatureBlacklistEmbellishcraftSlateEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistEmbellishcraftSlateEmeraldOre.get() && Emerald.biomeBlacklistEmbellishcraftSlateEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistEmbellishcraftSlateEmeraldOre.get() && !Emerald.biomeBlacklistEmbellishcraftSlateEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeEmbellishcraftSlateEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkEmbellishcraftSlateEmeraldOre.get(), Emerald.minHeightEmbellishcraftSlateEmeraldOre.get(), 0, Emerald.maxHeightEmbellishcraftSlateEmeraldOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Emerald.enableHardenedStoneEmeraldOre.get()) {
                if ((Emerald.isTempWhitelistHardenedStoneEmeraldOre.get() && Emerald.temperatureBlacklistHardenedStoneEmeraldOre.get().contains(biomeTS)) || (!Emerald.isTempWhitelistHardenedStoneEmeraldOre.get() && !Emerald.temperatureBlacklistHardenedStoneEmeraldOre.get().contains(biomeTS))) {
                    if ((Emerald.isBiomeWhitelistHardenedStoneEmeraldOre.get() && Emerald.biomeBlacklistHardenedStoneEmeraldOre.get().contains(biomeRNS)) || (!Emerald.isBiomeWhitelistHardenedStoneEmeraldOre.get() && !Emerald.biomeBlacklistHardenedStoneEmeraldOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.RED_SAND_EMERALD_ORE.get().getDefaultState(), Emerald.veinSizeHardenedStoneEmeraldOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Emerald.veinsPerChunkHardenedStoneEmeraldOre.get(), Emerald.minHeightHardenedStoneEmeraldOre.get(), 0, Emerald.maxHeightHardenedStoneEmeraldOre.get()))));
                    } } } }
    }
}
