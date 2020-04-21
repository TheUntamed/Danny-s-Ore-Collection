package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {

    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
            //if(biome == Biomes.MOUNTAINS) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(200, 5, 0, 45));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockInit.STONE_COPPER_ORE.getDefaultState(), 10)).func_227228_a_(customConfig));
            //}
        }
    }

}
