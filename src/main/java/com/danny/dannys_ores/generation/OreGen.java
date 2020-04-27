package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
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
            if (Copper.enableCopperOres.get()) { CopperGen.addCopperGen(biome, biomeRNS, biomeTS); }
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

//    private static void addCopperOreGeneration(Biome biome, String biomeRNS, String biomeTS) {
//        if (!General.disableStoneOreGeneration.get()) {
//            if (Copper.enableStoneCopperOre.get()) {
//                if ((Copper.isTempWhitelistStoneCopperOre.get() && Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistStoneCopperOre.get() && !Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS))) {
//                    if ((Copper.isBiomeWhitelistStoneCopperOre.get() && Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistStoneCopperOre.get() && !Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS))) {
//                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.STONE_COPPER_ORE.getDefaultState(), Copper.veinSizeStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkStoneCopperOre.get(), Copper.minHeightStoneCopperOre.get(), 0, Copper.maxHeightStoneCopperOre.get()))));
//                        //FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE))
//                    } } } }
//        if (!General.disableStoneOreGeneration.get()) {
//            if (Copper.enableStoneCopperOre.get()) {
//                if ((Copper.isTempWhitelistStoneCopperOre.get() && Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS)) || (!Copper.isTempWhitelistStoneCopperOre.get() && !Copper.temperatureBlacklistStoneCopperOre.get().contains(biomeTS))) {
//                    if ((Copper.isBiomeWhitelistStoneCopperOre.get() && Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS)) || (!Copper.isBiomeWhitelistStoneCopperOre.get() && !Copper.biomeBlacklistStoneCopperOre.get().contains(biomeRNS))) {
//                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.STONE_COPPER_ORE.getDefaultState(), Copper.veinSizeStoneCopperOre.get())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(Copper.veinsPerChunkStoneCopperOre.get(), Copper.minHeightStoneCopperOre.get(), 0, Copper.maxHeightStoneCopperOre.get()))));
//                        //FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE))
//                    } } } }
//    }
}
