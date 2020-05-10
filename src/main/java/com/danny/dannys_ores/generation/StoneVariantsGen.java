package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class StoneVariantsGen {

    public static void addStoneVariantsGen(Biome biome, String biomeRNS, String biomeTS) {
        addStoneVariantsGeneration(biome, biomeRNS, biomeTS);
    }

    private static void addStoneVariantsGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (StoneVariants.enableHardenedStoneGeneration.get()) {
            if ((StoneVariants.isTempWhitelistHardenedStone.get() && StoneVariants.temperatureBlacklistHardenedStone.get().contains(biomeTS)) || (!StoneVariants.isTempWhitelistHardenedStone.get() && !StoneVariants.temperatureBlacklistHardenedStone.get().contains(biomeTS))) {
                if ((StoneVariants.isBiomeWhitelistHardenedStone.get() && StoneVariants.biomeBlacklistHardenedStone.get().contains(biomeRNS)) || (!StoneVariants.isBiomeWhitelistHardenedStone.get() && !StoneVariants.biomeBlacklistHardenedStone.get().contains(biomeRNS))) {
                    //biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(0, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.HARDENED_STONE.get().getDefaultState(), StoneVariants.clusterSizeHardenedStone.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(StoneVariants.clustersPerChunkHardenedStone.get(), StoneVariants.minHeightHardenedStone.get(), 0, StoneVariants.maxHeightHardenedStone.get()))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.HARDENED_STONE.get().getDefaultState(), StoneVariants.clusterSizeHardenedStone.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(StoneVariants.clustersPerChunkHardenedStone.get(), StoneVariants.minHeightHardenedStone.get(), 0, StoneVariants.maxHeightHardenedStone.get()))));
                } } }
    }

}
