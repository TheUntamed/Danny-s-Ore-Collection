package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.StoneVariants;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.ForgeRegistries;

public class StoneGen {

    public static void generateStone() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            String biomeRNS = biome.getRegistryName().toString();
            String biomeTS = biome.getTempCategory().toString();

            if (StoneVariants.enableStoneVariants.get()) {
                StoneVariantsGen.addStoneVariantsGen(biome, biomeRNS, biomeTS);
            }
        }
    }
}
