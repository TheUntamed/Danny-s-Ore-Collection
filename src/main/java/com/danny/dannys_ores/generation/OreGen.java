package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Config;
import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
/*
This file was heavily inspired by the code of the mod almost-all-the-ores by waylanderou.
https://github.com/waylanderou/almost-all-the-ores
The biome verifier was inspired by the code of the mod Embellishcraft by MapperTV.
https://github.com/MapperTV/embellishcraft
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
        checkConfig(biomeVerify, tempVerify);

        for (Biome biome : ForgeRegistries.BIOMES) {
            String biomeRNS = biome.getRegistryName().toString();
            String biomeTS = biome.getTempCategory().toString();

            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                if (Config.disableOtherOverworldOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else {
                    removeVanillaOverworldOres(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.NETHER) {
                if(Config.disableOtherNetherOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else {
                    removeNetherQuartzOre(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.THEEND) {
                if (Config.disableOtherEndOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                }
            }
            if (Config.enableCopperOres.get()) {
                addCopperOreGeneration(biome, biomeRNS, biomeTS);
            }
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

    private static void addCopperOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
        if (!Config.disableStoneOreGeneration.get()) {
            if (Config.enableStoneCopperOre.get()) {
                if ((Config.isTempWhitelistStoneCopperOre.get() && Config.temperatureBlacklistStoneCopperOre.get().contains(biomeTS)) || (!Config.isTempWhitelistStoneCopperOre.get() && !Config.temperatureBlacklistStoneCopperOre.get().contains(biomeTS))) {
                    if ((Config.isBiomeWhitelistStoneCopperOre.get() && Config.biomeBlacklistStoneCopperOre.get().contains(biomeRNS)) || (!Config.isBiomeWhitelistStoneCopperOre.get() && !Config.biomeBlacklistStoneCopperOre.get().contains(biomeRNS))) {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.STONE_COPPER_ORE.getDefaultState(), Config.veinSizeStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Config.veinsPerChunkStoneCopperOre.get(), Config.minHeightStoneCopperOre.get(), 0, Config.maxHeightStoneCopperOre.get()))));
                        //FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE))
                    } } } } }


    private static void checkConfig(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Config.biomeBlacklistStoneCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneCopperOre, please check the entries!"); }
        }
        for (String temp : Config.temperatureBlacklistStoneCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneCopperOre, please check the entries!"); }
        }
    }
}
