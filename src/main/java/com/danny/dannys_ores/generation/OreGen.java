package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.configs.*;
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
        if (General.enableConfigChecker.get()) {
            for (Biome biome : ForgeRegistries.BIOMES) {
                biomeVerify.add(biome.getRegistryName().toString());
                tempVerify.add(biome.getTempCategory().toString());
            }
            ConfigChecker.checkConfig(biomeVerify, tempVerify);
        }

        for (Biome biome : ForgeRegistries.BIOMES) {
            String biomeRNS = biome.getRegistryName().toString();
            String biomeTS = biome.getTempCategory().toString();

            if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                if (General.disableOtherOverworldOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (General.removeVanillaOverworldOreGeneration.get()) {
                    removeVanillaOverworldOres(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.NETHER) {
                if(General.disableOtherNetherOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                } else if (General.removeVanillaNetherOreGeneration.get()) {
                    removeNetherQuartzOre(biome);
                }
            }
            if (biome.getCategory() == Biome.Category.THEEND) {
                if (General.disableOtherEndOreGeneration.get()) {
                    biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
                }
            }

            if (Iron.enableIronOres.get()) { IronGen.addIronGen(biome, biomeRNS, biomeTS); }
            if (Gold.enableGoldOres.get()) { GoldGen.addGoldGen(biome, biomeRNS, biomeTS); }
            if (Coal.enableCoalOres.get()) { CoalGen.addCoalGen(biome, biomeRNS, biomeTS); }
            if (Lapis.enableLapisOres.get()) { LapisGen.addLapisGen(biome, biomeRNS, biomeTS); }
            if (Redstone.enableRedstoneOres.get()) { RedstoneGen.addRedstoneGen(biome, biomeRNS, biomeTS); }
            if (Emerald.enableEmeraldOres.get()) { EmeraldGen.addEmeraldGen(biome, biomeRNS, biomeTS); }
            if (Diamond.enableDiamondOres.get()) { DiamondGen.addDiamondGen(biome, biomeRNS, biomeTS); }
            if (Quartz.enableQuartzOres.get()) { QuartzGen.addQuartzGen(biome, biomeRNS, biomeTS); }
            if (Copper.enableCopperOres.get()) { CopperGen.addCopperGen(biome, biomeRNS, biomeTS); }
            if (Aluminum.enableAluminumOres.get()) { AluminumGen.addAluminumGen(biome, biomeRNS, biomeTS); }
            if (Tin.enableTinOres.get()) { TinGen.addTinGen(biome, biomeRNS, biomeTS); }
            if (Silver.enableSilverOres.get()) { SilverGen.addSilverGen(biome, biomeRNS, biomeTS); }
            if (Lead.enableLeadOres.get()) { LeadGen.addLeadGen(biome, biomeRNS, biomeTS); }
            if (Uranium.enableUraniumOres.get()) { UraniumGen.addUraniumGen(biome, biomeRNS, biomeTS); }
            if (Nickel.enableNickelOres.get()) { NickelGen.addNickelGen(biome, biomeRNS, biomeTS); }
            if (Zinc.enableZincOres.get()) { ZincGen.addZincGen(biome, biomeRNS, biomeTS); }
            if (Platinum.enablePlatinumOres.get()) { PlatinumGen.addPlatinumGen(biome, biomeRNS, biomeTS); }
            if (Iridium.enableIridiumOres.get()) { IridiumGen.addIridiumGen(biome, biomeRNS, biomeTS); }
            if (Osmium.enableOsmiumOres.get()) { OsmiumGen.addOsmiumGen(biome, biomeRNS, biomeTS); }
            if (Xp.enableXpOres.get()) { XpGen.addXpGen(biome, biomeRNS, biomeTS); }
            if (Adamantium.enableAdamantiumOres.get()) { AdamantiumGen.addAdamantiumGen(biome, biomeRNS, biomeTS); }
            if (Amethyst.enableAmethystOres.get()) { AmethystGen.addAmethystGen(biome, biomeRNS, biomeTS); }
            if (Bismuth.enableBismuthOres.get()) { BismuthGen.addBismuthGen(biome, biomeRNS, biomeTS); }
            if (BlackOpal.enableBlackOpalOres.get()) { BlackOpalGen.addBlackOpalGen(biome, biomeRNS, biomeTS); }
            if (Lucky.enableLuckyOres.get()) { LuckyGen.addLuckyGen(biome, biomeRNS, biomeTS); }
            if (Mithril.enableMithrilOres.get()) { MithrilGen.addMithrilGen(biome, biomeRNS, biomeTS); }
            if (Runite.enableRuniteOres.get()) { RuniteGen.addRuniteGen(biome, biomeRNS, biomeTS); }
            if (WhiteOpal.enableWhiteOpalOres.get()) { WhiteOpalGen.addWhiteOpalGen(biome, biomeRNS, biomeTS); }
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
