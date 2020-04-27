package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Iron;
import com.danny.dannys_ores.configs.Xp;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
/*
This file was heavily inspired by the code of the mod almost-all-the-ores by waylanderou.
https://github.com/waylanderou/almost-all-the-ores
 */
public class OreGen {

    public static void generateOre() {
        //Check if config is correct
        ArrayList<String> biomeVerify = new ArrayList<>();
        ArrayList<String> tempVerify = new ArrayList<>();
        for (Biome biome : ForgeRegistries.BIOMES) {
            biomeVerify.add(biome.getRegistryName().toString());
            tempVerify.add(biome.getTempCategory().toString());
        }
        ConfigChecker.checkConfig(biomeVerify, tempVerify);

        for (Biome biome : ForgeRegistries.BIOMES) {
            String biomeRNS = biome.getRegistryName().toString();
            String biomeTS = biome.getTempCategory().toString();

            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                if (General.disableOtherOverworldOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (General.replaceVanillaOverworldOreGeneration.get()) {
                    removeVanillaOverworldOres(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.NETHER) {
                if(General.disableOtherNetherOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (General.replaceVanillaNetherOreGeneration.get()) {
                    removeNetherQuartzOre(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.THEEND) {
                if (General.disableOtherEndOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                }
            }
            if (General.replaceVanillaOverworldOreGeneration.get()) {
                if (Iron.enableIronOres.get()) { IronGen.addIronGen(biome, biomeRNS, biomeTS); }
            }
            if (General.replaceVanillaNetherOreGeneration.get()) {

            }
            if (Copper.enableCopperOres.get()) { CopperGen.addCopperGen(biome, biomeRNS, biomeTS); }
            if (Xp.enableXpOres.get()) { XpGen.addXpGen(biome, biomeRNS, biomeTS); }
        }
    }

    private static void removeVanillaOverworldOres(Biome biome) {
        List<ConfiguredFeature<?, ?>> featuresToRemove = new ArrayList<>();
        for (ConfiguredFeature<?, ?> feature : biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES)) {
            if (feature.config instanceof DecoratedFeatureConfig) {
                if (((DecoratedFeatureConfig)feature.config).feature.feature instanceof OreFeature) {
                    Block b = ((OreFeatureConfig)((DecoratedFeatureConfig)feature.config).feature.config).state.getBlock();
                    if (b == Blocks.IRON_ORE || b == Blocks.GOLD_ORE || b == Blocks.COAL_ORE || b == Blocks.DIAMOND_ORE || b == Blocks.EMERALD_ORE || b == Blocks.LAPIS_ORE || b == Blocks.REDSTONE_ORE) {
                        featuresToRemove.add(feature);
                    } } } }
        biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).removeAll(featuresToRemove);
    }

    private static void removeNetherQuartzOre(Biome biome) {
        List<ConfiguredFeature<?, ?>> featuresToRemove = new ArrayList<>();
        for(ConfiguredFeature<?, ?> feature : biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION)) {
            if (feature.config instanceof DecoratedFeatureConfig) {
                if (((DecoratedFeatureConfig)feature.config).feature.feature instanceof OreFeature) {
                    Block b = ((OreFeatureConfig)((DecoratedFeatureConfig)feature.config).feature.config).state.getBlock();
                    if (b == Blocks.NETHER_QUARTZ_ORE) {
                        featuresToRemove.add(feature);
                    } } } }
        biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION).removeAll(featuresToRemove);
    }
}
