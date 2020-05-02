package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.Coal;
import com.danny.dannys_ores.configs.Diamond;
import com.danny.dannys_ores.configs.StoneVariants;
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
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.HARDENED_STONE.get().getDefaultState(), StoneVariants.clusterSizeHardenedStone.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(StoneVariants.clustersPerChunkHardenedStone.get(), StoneVariants.minHeightHardenedStone.get(), 0, StoneVariants.maxHeightHardenedStone.get()))));
                } } }
    }

}
