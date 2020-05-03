package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.Coal;
import com.danny.dannys_ores.configs.Coal;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class CoalGen {

    public static void addCoalGen(Biome biome, String biomeRNS, String biomeTS) {
        addCoalOreGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addCoalOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        // Vanilla
        if (General.enableCustomVanillaOreGeneration.get()) {
            if (Coal.enableVanillaCoalOre.get()) {
                if ((Coal.isTempWhitelistVanillaCoalOre.get() && Coal.temperatureBlacklistVanillaCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistVanillaCoalOre.get() && !Coal.temperatureBlacklistVanillaCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistVanillaCoalOre.get() && Coal.biomeBlacklistVanillaCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistVanillaCoalOre.get() && !Coal.biomeBlacklistVanillaCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("stone", null, new BlockMatcher(Blocks.STONE)), Blocks.COAL_ORE.getDefaultState(), Coal.veinSizeVanillaCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkVanillaCoalOre.get(), Coal.minHeightVanillaCoalOre.get(), 0, Coal.maxHeightVanillaCoalOre.get()))));
                    } } } }
        if (!General.disableAndesiteOreGeneration.get()) {
            if (Coal.enableAndesiteCoalOre.get()) {
                if ((Coal.isTempWhitelistAndesiteCoalOre.get() && Coal.temperatureBlacklistAndesiteCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistAndesiteCoalOre.get() && !Coal.temperatureBlacklistAndesiteCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistAndesiteCoalOre.get() && Coal.biomeBlacklistAndesiteCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistAndesiteCoalOre.get() && !Coal.biomeBlacklistAndesiteCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("andesite", null, new BlockMatcher(Blocks.ANDESITE)), BlockInit.ANDESITE_COAL_ORE.get().getDefaultState(), Coal.veinSizeAndesiteCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkAndesiteCoalOre.get(), Coal.minHeightAndesiteCoalOre.get(), 0, Coal.maxHeightAndesiteCoalOre.get()))));
                    } } } }
        if (!General.disableDioriteOreGeneration.get()) {
            if (Coal.enableDioriteCoalOre.get()) {
                if ((Coal.isTempWhitelistDioriteCoalOre.get() && Coal.temperatureBlacklistDioriteCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistDioriteCoalOre.get() && !Coal.temperatureBlacklistDioriteCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistDioriteCoalOre.get() && Coal.biomeBlacklistDioriteCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistDioriteCoalOre.get() && !Coal.biomeBlacklistDioriteCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("diorite", null, new BlockMatcher(Blocks.DIORITE)), BlockInit.DIORITE_COAL_ORE.get().getDefaultState(), Coal.veinSizeDioriteCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkDioriteCoalOre.get(), Coal.minHeightDioriteCoalOre.get(), 0, Coal.maxHeightDioriteCoalOre.get()))));
                    } } } }
        if (!General.disableGraniteOreGeneration.get()) {
            if (Coal.enableGraniteCoalOre.get()) {
                if ((Coal.isTempWhitelistGraniteCoalOre.get() && Coal.temperatureBlacklistGraniteCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistGraniteCoalOre.get() && !Coal.temperatureBlacklistGraniteCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistGraniteCoalOre.get() && Coal.biomeBlacklistGraniteCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistGraniteCoalOre.get() && !Coal.biomeBlacklistGraniteCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("granite", null, new BlockMatcher(Blocks.GRANITE)), BlockInit.GRANITE_COAL_ORE.get().getDefaultState(), Coal.veinSizeGraniteCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkGraniteCoalOre.get(), Coal.minHeightGraniteCoalOre.get(), 0, Coal.maxHeightGraniteCoalOre.get()))));
                    } } } }
        if (!General.disableNetherrackOreGeneration.get()) {
            if (Coal.enableNetherrackCoalOre.get()) {
                if ((Coal.isTempWhitelistNetherrackCoalOre.get() && Coal.temperatureBlacklistNetherrackCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistNetherrackCoalOre.get() && !Coal.temperatureBlacklistNetherrackCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistNetherrackCoalOre.get() && Coal.biomeBlacklistNetherrackCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistNetherrackCoalOre.get() && !Coal.biomeBlacklistNetherrackCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("netherrack", null, new BlockMatcher(Blocks.NETHERRACK)), BlockInit.NETHERRACK_COAL_ORE.get().getDefaultState(), Coal.veinSizeNetherrackCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkNetherrackCoalOre.get(), Coal.minHeightNetherrackCoalOre.get(), 0, Coal.maxHeightNetherrackCoalOre.get()))));
                    } } } }
        if (!General.disableEndStoneOreGeneration.get()) {
            if (Coal.enableEndStoneCoalOre.get()) {
                if ((Coal.isTempWhitelistEndStoneCoalOre.get() && Coal.temperatureBlacklistEndStoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEndStoneCoalOre.get() && !Coal.temperatureBlacklistEndStoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEndStoneCoalOre.get() && Coal.biomeBlacklistEndStoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEndStoneCoalOre.get() && !Coal.biomeBlacklistEndStoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockInit.END_STONE_COAL_ORE.get().getDefaultState(), Coal.veinSizeEndStoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEndStoneCoalOre.get(), Coal.minHeightEndStoneCoalOre.get(), 0, Coal.maxHeightEndStoneCoalOre.get()))));
                    } } } }
        if (!General.disableSandOreGeneration.get()) {
            if (Coal.enableSandCoalOre.get()) {
                if ((Coal.isTempWhitelistSandCoalOre.get() && Coal.temperatureBlacklistSandCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistSandCoalOre.get() && !Coal.temperatureBlacklistSandCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistSandCoalOre.get() && Coal.biomeBlacklistSandCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistSandCoalOre.get() && !Coal.biomeBlacklistSandCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sand", null, new BlockMatcher(Blocks.SAND)), BlockInit.SAND_COAL_ORE.get().getDefaultState(), Coal.veinSizeSandCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkSandCoalOre.get(), Coal.minHeightSandCoalOre.get(), 0, Coal.maxHeightSandCoalOre.get()))));
                    } } } }
        if (!General.disableRedSandOreGeneration.get()) {
            if (Coal.enableRedSandCoalOre.get()) {
                if ((Coal.isTempWhitelistRedSandCoalOre.get() && Coal.temperatureBlacklistRedSandCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistRedSandCoalOre.get() && !Coal.temperatureBlacklistRedSandCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistRedSandCoalOre.get() && Coal.biomeBlacklistRedSandCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistRedSandCoalOre.get() && !Coal.biomeBlacklistRedSandCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sand", null, new BlockMatcher(Blocks.RED_SAND)), BlockInit.RED_SAND_COAL_ORE.get().getDefaultState(), Coal.veinSizeRedSandCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkRedSandCoalOre.get(), Coal.minHeightRedSandCoalOre.get(), 0, Coal.maxHeightRedSandCoalOre.get()))));
                    } } } }
        if (!General.disableGravelOreGeneration.get()) {
            if (Coal.enableGravelCoalOre.get()) {
                if ((Coal.isTempWhitelistGravelCoalOre.get() && Coal.temperatureBlacklistGravelCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistGravelCoalOre.get() && !Coal.temperatureBlacklistGravelCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistGravelCoalOre.get() && Coal.biomeBlacklistGravelCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistGravelCoalOre.get() && !Coal.biomeBlacklistGravelCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("gravel", null, new BlockMatcher(Blocks.GRAVEL)), BlockInit.GRAVEL_COAL_ORE.get().getDefaultState(), Coal.veinSizeGravelCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkGravelCoalOre.get(), Coal.minHeightGravelCoalOre.get(), 0, Coal.maxHeightGravelCoalOre.get()))));
                    } } } }
        if (!General.disableSandstoneOreGeneration.get()) {
            if (Coal.enableSandstoneCoalOre.get()) {
                if ((Coal.isTempWhitelistSandstoneCoalOre.get() && Coal.temperatureBlacklistSandstoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistSandstoneCoalOre.get() && !Coal.temperatureBlacklistSandstoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistSandstoneCoalOre.get() && Coal.biomeBlacklistSandstoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistSandstoneCoalOre.get() && !Coal.biomeBlacklistSandstoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("sandstone", null, new BlockMatcher(Blocks.SANDSTONE)), BlockInit.SANDSTONE_COAL_ORE.get().getDefaultState(), Coal.veinSizeSandstoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkSandstoneCoalOre.get(), Coal.minHeightSandstoneCoalOre.get(), 0, Coal.maxHeightSandstoneCoalOre.get()))));
                    } } } }
        if (!General.disableRedSandstoneOreGeneration.get()) {
            if (Coal.enableRedSandstoneCoalOre.get()) {
                if ((Coal.isTempWhitelistRedSandstoneCoalOre.get() && Coal.temperatureBlacklistRedSandstoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistRedSandstoneCoalOre.get() && !Coal.temperatureBlacklistRedSandstoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistRedSandstoneCoalOre.get() && Coal.biomeBlacklistRedSandstoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistRedSandstoneCoalOre.get() && !Coal.biomeBlacklistRedSandstoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("red_sandstone", null, new BlockMatcher(Blocks.RED_SANDSTONE)), BlockInit.RED_SANDSTONE_COAL_ORE.get().getDefaultState(), Coal.veinSizeRedSandstoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkRedSandstoneCoalOre.get(), Coal.minHeightRedSandstoneCoalOre.get(), 0, Coal.maxHeightRedSandstoneCoalOre.get()))));
                    } } } }
        // Quark
        if (!General.disableQuarkBasaltOreGeneration.get() && Main.quark) {
            if (Coal.enableQuarkBasaltCoalOre.get()) {
                if ((Coal.isTempWhitelistQuarkBasaltCoalOre.get() && Coal.temperatureBlacklistQuarkBasaltCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistQuarkBasaltCoalOre.get() && !Coal.temperatureBlacklistQuarkBasaltCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistQuarkBasaltCoalOre.get() && Coal.biomeBlacklistQuarkBasaltCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistQuarkBasaltCoalOre.get() && !Coal.biomeBlacklistQuarkBasaltCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_basalt", null, new BlockMatcher(BlockInit.QUARK_BASALT != null ? BlockInit.QUARK_BASALT : Blocks.BARRIER)), BlockInit.QUARK_BASALT_COAL_ORE.get().getDefaultState(), Coal.veinSizeQuarkBasaltCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkQuarkBasaltCoalOre.get(), Coal.minHeightQuarkBasaltCoalOre.get(), 0, Coal.maxHeightQuarkBasaltCoalOre.get()))));
                    } } } }
        if (!General.disableQuarkMarbleOreGeneration.get() && Main.quark) {
            if (Coal.enableQuarkMarbleCoalOre.get()) {
                if ((Coal.isTempWhitelistQuarkMarbleCoalOre.get() && Coal.temperatureBlacklistQuarkMarbleCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistQuarkMarbleCoalOre.get() && !Coal.temperatureBlacklistQuarkMarbleCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistQuarkMarbleCoalOre.get() && Coal.biomeBlacklistQuarkMarbleCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistQuarkMarbleCoalOre.get() && !Coal.biomeBlacklistQuarkMarbleCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_marble", null, new BlockMatcher(BlockInit.QUARK_MARBLE != null ? BlockInit.QUARK_MARBLE : Blocks.BARRIER)), BlockInit.QUARK_MARBLE_COAL_ORE.get().getDefaultState(), Coal.veinSizeQuarkMarbleCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkQuarkMarbleCoalOre.get(), Coal.minHeightQuarkMarbleCoalOre.get(), 0, Coal.maxHeightQuarkMarbleCoalOre.get()))));
                    } } } }
        if (!General.disableQuarkSlateOreGeneration.get() && Main.quark) {
            if (Coal.enableQuarkSlateCoalOre.get()) {
                if ((Coal.isTempWhitelistQuarkSlateCoalOre.get() && Coal.temperatureBlacklistQuarkSlateCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistQuarkSlateCoalOre.get() && !Coal.temperatureBlacklistQuarkSlateCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistQuarkSlateCoalOre.get() && Coal.biomeBlacklistQuarkSlateCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistQuarkSlateCoalOre.get() && !Coal.biomeBlacklistQuarkSlateCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_slate", null, new BlockMatcher(BlockInit.QUARK_SLATE != null ? BlockInit.QUARK_SLATE : Blocks.BARRIER)), BlockInit.QUARK_SLATE_COAL_ORE.get().getDefaultState(), Coal.veinSizeQuarkSlateCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkQuarkSlateCoalOre.get(), Coal.minHeightQuarkSlateCoalOre.get(), 0, Coal.maxHeightQuarkSlateCoalOre.get()))));
                    } } } }
        if (!General.disableQuarkLimestoneOreGeneration.get() && Main.quark) {
            if (Coal.enableQuarkLimestoneCoalOre.get()) {
                if ((Coal.isTempWhitelistQuarkLimestoneCoalOre.get() && Coal.temperatureBlacklistQuarkLimestoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistQuarkLimestoneCoalOre.get() && !Coal.temperatureBlacklistQuarkLimestoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistQuarkLimestoneCoalOre.get() && Coal.biomeBlacklistQuarkLimestoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistQuarkLimestoneCoalOre.get() && !Coal.biomeBlacklistQuarkLimestoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_limestone", null, new BlockMatcher(BlockInit.QUARK_LIMESTONE != null ? BlockInit.QUARK_LIMESTONE : Blocks.BARRIER)), BlockInit.QUARK_LIMESTONE_COAL_ORE.get().getDefaultState(), Coal.veinSizeQuarkLimestoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkQuarkLimestoneCoalOre.get(), Coal.minHeightQuarkLimestoneCoalOre.get(), 0, Coal.maxHeightQuarkLimestoneCoalOre.get()))));
                    } } } }
        if (!General.disableQuarkJasperOreGeneration.get() && Main.quark) {
            if (Coal.enableQuarkJasperCoalOre.get()) {
                if ((Coal.isTempWhitelistQuarkJasperCoalOre.get() && Coal.temperatureBlacklistQuarkJasperCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistQuarkJasperCoalOre.get() && !Coal.temperatureBlacklistQuarkJasperCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistQuarkJasperCoalOre.get() && Coal.biomeBlacklistQuarkJasperCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistQuarkJasperCoalOre.get() && !Coal.biomeBlacklistQuarkJasperCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("quark_jasper", null, new BlockMatcher(BlockInit.QUARK_JASPER != null ? BlockInit.QUARK_JASPER : Blocks.BARRIER)), BlockInit.QUARK_JASPER_COAL_ORE.get().getDefaultState(), Coal.veinSizeQuarkJasperCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkQuarkJasperCoalOre.get(), Coal.minHeightQuarkJasperCoalOre.get(), 0, Coal.maxHeightQuarkJasperCoalOre.get()))));
                    } } } }
        // Embellishcraft
        if (!General.disableEmbellishcraftBasaltOreGeneration.get() && Main.quark) {
            if (Coal.enableEmbellishcraftBasaltCoalOre.get()) {
                if ((Coal.isTempWhitelistEmbellishcraftBasaltCoalOre.get() && Coal.temperatureBlacklistEmbellishcraftBasaltCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEmbellishcraftBasaltCoalOre.get() && !Coal.temperatureBlacklistEmbellishcraftBasaltCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEmbellishcraftBasaltCoalOre.get() && Coal.biomeBlacklistEmbellishcraftBasaltCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEmbellishcraftBasaltCoalOre.get() && !Coal.biomeBlacklistEmbellishcraftBasaltCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_basalt", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_BASALT != null ? BlockInit.EMBELLISHCRAFT_BASALT : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_BASALT_COAL_ORE.get().getDefaultState(), Coal.veinSizeEmbellishcraftBasaltCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEmbellishcraftBasaltCoalOre.get(), Coal.minHeightEmbellishcraftBasaltCoalOre.get(), 0, Coal.maxHeightEmbellishcraftBasaltCoalOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftGneissOreGeneration.get() && Main.quark) {
            if (Coal.enableEmbellishcraftGneissCoalOre.get()) {
                if ((Coal.isTempWhitelistEmbellishcraftGneissCoalOre.get() && Coal.temperatureBlacklistEmbellishcraftGneissCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEmbellishcraftGneissCoalOre.get() && !Coal.temperatureBlacklistEmbellishcraftGneissCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEmbellishcraftGneissCoalOre.get() && Coal.biomeBlacklistEmbellishcraftGneissCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEmbellishcraftGneissCoalOre.get() && !Coal.biomeBlacklistEmbellishcraftGneissCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_gneiss", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_GNEISS != null ? BlockInit.EMBELLISHCRAFT_GNEISS : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_GNEISS_COAL_ORE.get().getDefaultState(), Coal.veinSizeEmbellishcraftGneissCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEmbellishcraftGneissCoalOre.get(), Coal.minHeightEmbellishcraftGneissCoalOre.get(), 0, Coal.maxHeightEmbellishcraftGneissCoalOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftJadeOreGeneration.get() && Main.quark) {
            if (Coal.enableEmbellishcraftJadeCoalOre.get()) {
                if ((Coal.isTempWhitelistEmbellishcraftJadeCoalOre.get() && Coal.temperatureBlacklistEmbellishcraftJadeCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEmbellishcraftJadeCoalOre.get() && !Coal.temperatureBlacklistEmbellishcraftJadeCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEmbellishcraftJadeCoalOre.get() && Coal.biomeBlacklistEmbellishcraftJadeCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEmbellishcraftJadeCoalOre.get() && !Coal.biomeBlacklistEmbellishcraftJadeCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_jade", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_JADE != null ? BlockInit.EMBELLISHCRAFT_JADE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_JADE_COAL_ORE.get().getDefaultState(), Coal.veinSizeEmbellishcraftJadeCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEmbellishcraftJadeCoalOre.get(), Coal.minHeightEmbellishcraftJadeCoalOre.get(), 0, Coal.maxHeightEmbellishcraftJadeCoalOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftLarvikiteOreGeneration.get() && Main.quark) {
            if (Coal.enableEmbellishcraftLarvikiteCoalOre.get()) {
                if ((Coal.isTempWhitelistEmbellishcraftLarvikiteCoalOre.get() && Coal.temperatureBlacklistEmbellishcraftLarvikiteCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEmbellishcraftLarvikiteCoalOre.get() && !Coal.temperatureBlacklistEmbellishcraftLarvikiteCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEmbellishcraftLarvikiteCoalOre.get() && Coal.biomeBlacklistEmbellishcraftLarvikiteCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEmbellishcraftLarvikiteCoalOre.get() && !Coal.biomeBlacklistEmbellishcraftLarvikiteCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_larvikite", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_LARVIKITE != null ? BlockInit.EMBELLISHCRAFT_LARVIKITE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_LARVIKITE_COAL_ORE.get().getDefaultState(), Coal.veinSizeEmbellishcraftLarvikiteCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEmbellishcraftLarvikiteCoalOre.get(), Coal.minHeightEmbellishcraftLarvikiteCoalOre.get(), 0, Coal.maxHeightEmbellishcraftLarvikiteCoalOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftMarbleOreGeneration.get() && Main.quark) {
            if (Coal.enableEmbellishcraftMarbleCoalOre.get()) {
                if ((Coal.isTempWhitelistEmbellishcraftMarbleCoalOre.get() && Coal.temperatureBlacklistEmbellishcraftMarbleCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEmbellishcraftMarbleCoalOre.get() && !Coal.temperatureBlacklistEmbellishcraftMarbleCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEmbellishcraftMarbleCoalOre.get() && Coal.biomeBlacklistEmbellishcraftMarbleCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEmbellishcraftMarbleCoalOre.get() && !Coal.biomeBlacklistEmbellishcraftMarbleCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_marble", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_MARBLE != null ? BlockInit.EMBELLISHCRAFT_MARBLE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_MARBLE_COAL_ORE.get().getDefaultState(), Coal.veinSizeEmbellishcraftMarbleCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEmbellishcraftMarbleCoalOre.get(), Coal.minHeightEmbellishcraftMarbleCoalOre.get(), 0, Coal.maxHeightEmbellishcraftMarbleCoalOre.get()))));
                    } } } }
        if (!General.disableEmbellishcraftSlateOreGeneration.get() && Main.quark) {
            if (Coal.enableEmbellishcraftSlateCoalOre.get()) {
                if ((Coal.isTempWhitelistEmbellishcraftSlateCoalOre.get() && Coal.temperatureBlacklistEmbellishcraftSlateCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistEmbellishcraftSlateCoalOre.get() && !Coal.temperatureBlacklistEmbellishcraftSlateCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistEmbellishcraftSlateCoalOre.get() && Coal.biomeBlacklistEmbellishcraftSlateCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistEmbellishcraftSlateCoalOre.get() && !Coal.biomeBlacklistEmbellishcraftSlateCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("embellishcraft_slate", null, new BlockMatcher(BlockInit.EMBELLISHCRAFT_SLATE != null ? BlockInit.EMBELLISHCRAFT_SLATE : Blocks.BARRIER)), BlockInit.EMBELLISHCRAFT_SLATE_COAL_ORE.get().getDefaultState(), Coal.veinSizeEmbellishcraftSlateCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkEmbellishcraftSlateCoalOre.get(), Coal.minHeightEmbellishcraftSlateCoalOre.get(), 0, Coal.maxHeightEmbellishcraftSlateCoalOre.get()))));
                    } } } }
        // Danny's Ores
        if (!General.disableHardenedStoneOreGeneration.get()) {
            if (Coal.enableHardenedStoneCoalOre.get()) {
                if ((Coal.isTempWhitelistHardenedStoneCoalOre.get() && Coal.temperatureBlacklistHardenedStoneCoalOre.get().contains(biomeTS)) || (!Coal.isTempWhitelistHardenedStoneCoalOre.get() && !Coal.temperatureBlacklistHardenedStoneCoalOre.get().contains(biomeTS))) {
                    if ((Coal.isBiomeWhitelistHardenedStoneCoalOre.get() && Coal.biomeBlacklistHardenedStoneCoalOre.get().contains(biomeRNS)) || (!Coal.isBiomeWhitelistHardenedStoneCoalOre.get() && !Coal.biomeBlacklistHardenedStoneCoalOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("hardened_stone", null, new BlockMatcher(BlockInit.HARDENED_STONE.get())), BlockInit.RED_SAND_COAL_ORE.get().getDefaultState(), Coal.veinSizeHardenedStoneCoalOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Coal.veinsPerChunkHardenedStoneCoalOre.get(), Coal.minHeightHardenedStoneCoalOre.get(), 0, Coal.maxHeightHardenedStoneCoalOre.get()))));
                    } } } }
    }
}
