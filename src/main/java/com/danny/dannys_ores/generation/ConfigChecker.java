package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;

import java.util.ArrayList;

/*
The biome verifier was inspired by the code of the mod Embellishcraft by MapperTV.
https://github.com/MapperTV/embellishcraft
 */
public class ConfigChecker {

    public static void checkConfig(ArrayList biomeVerify, ArrayList tempVerify) {
        checkStoneVariants(biomeVerify, tempVerify);
        checkIron(biomeVerify, tempVerify);
        checkCoal(biomeVerify, tempVerify);
        checkDiamond(biomeVerify, tempVerify);
        checkEmerald(biomeVerify, tempVerify);
        checkGold(biomeVerify, tempVerify);
        checkLapis(biomeVerify, tempVerify);
        checkQuartz(biomeVerify, tempVerify);
        checkRedstone(biomeVerify, tempVerify);
        checkCopper(biomeVerify, tempVerify);
        checkXp(biomeVerify, tempVerify);
    }

    private static void checkStoneVariants(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : StoneVariants.biomeBlacklistHardenedStone.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/stone_variants.toml in biomeBlacklistHardenedStone, please check the entries!"); } }

        for (String temp : StoneVariants.temperatureBlacklistHardenedStone.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/stone_variants.toml in temperatureBlacklistHardenedStone, please check the entries!"); } }
    }

    private static void checkIron(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Iron.biomeBlacklistVanillaIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistStoneIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistAndesiteIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistAndesiteIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistDioriteIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistDioriteIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistGraniteIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistGraniteIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistNetherrackIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistNetherrackIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistEndStoneIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistEndStoneIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistSandIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistSandIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistGravelIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistGravelIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistSandstoneIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistSandstoneIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistRedSandstoneIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistRedSandstoneIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistRedSandIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistRedSandIronOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Iron.biomeBlacklistQuarkBasaltIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistQuarkBasaltIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistQuarkLimestoneIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistQuarkLimestoneIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistQuarkJasperIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistQuarkJasperIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistQuarkMarbleIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistQuarkMarbleIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistQuarkSlateIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistQuarkSlateIronOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Iron.biomeBlacklistEmbellishcraftBasaltIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistEmbellishcraftBasaltIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistEmbellishcraftGneissIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistEmbellishcraftGneissIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistEmbellishcraftJadeIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistEmbellishcraftJadeIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistEmbellishcraftLarvikiteIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistEmbellishcraftLarvikiteIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistEmbellishcraftMarbleIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistEmbellishcraftMarbleIronOre, please check the entries!"); } }
        for (String name : Iron.biomeBlacklistEmbellishcraftSlateIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistEmbellishcraftSlateIronOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Iron.biomeBlacklistHardenedStoneIronOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/iron.toml in biomeBlacklistHardenedStoneIronOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Iron.temperatureBlacklistVanillaIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistStoneIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistAndesiteIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistAndesiteIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistDioriteIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistDioriteIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistGraniteIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistGraniteIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistNetherrackIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistNetherrackIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistEndStoneIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistEndStoneIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistSandIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistSandIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistGravelIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistGravelIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistSandstoneIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistSandstoneIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistRedSandstoneIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistRedSandstoneIronOre, please check the entries!"); } }
        for (String temp : Iron.temperatureBlacklistSandIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistSandIronOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Iron.temperatureBlacklistQuarkBasaltIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistQuarkBasaltIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistQuarkLimestoneIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistQuarkLimestoneIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistQuarkJasperIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistQuarkJasperIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistQuarkMarbleIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistQuarkMarbleIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistQuarkSlateIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistQuarkSlateIronOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Iron.temperatureBlacklistEmbellishcraftBasaltIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistEmbellishcraftBasaltIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistEmbellishcraftGneissIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistEmbellishcraftGneissIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistEmbellishcraftJadeIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistEmbellishcraftJadeIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistEmbellishcraftLarvikiteIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistEmbellishcraftLarvikiteIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistEmbellishcraftMarbleIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistEmbellishcraftMarbleIronOre, please check the entries!"); } }
        for (String name : Iron.temperatureBlacklistEmbellishcraftSlateIronOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/iron.toml in temperatureBlacklistEmbellishcraftSlateIronOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Iron.temperatureBlacklistSandIronOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/iron.toml in temperatureBlacklistSandIronOre, please check the entries!"); } }
    }

    private static void checkDiamond(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Diamond.biomeBlacklistVanillaDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistStoneDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistAndesiteDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistAndesiteDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistDioriteDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistDioriteDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistGraniteDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistGraniteDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistNetherrackDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistNetherrackDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistEndStoneDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistEndStoneDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistSandDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistSandDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistGravelDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistGravelDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistSandstoneDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistSandstoneDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistRedSandstoneDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistRedSandstoneDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistRedSandDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistRedSandDiamondOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Diamond.biomeBlacklistQuarkBasaltDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistQuarkBasaltDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistQuarkLimestoneDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistQuarkLimestoneDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistQuarkJasperDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistQuarkJasperDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistQuarkMarbleDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistQuarkMarbleDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistQuarkSlateDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistQuarkSlateDiamondOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Diamond.biomeBlacklistEmbellishcraftBasaltDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistEmbellishcraftBasaltDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistEmbellishcraftGneissDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistEmbellishcraftGneissDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistEmbellishcraftJadeDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistEmbellishcraftJadeDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistEmbellishcraftLarvikiteDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistEmbellishcraftLarvikiteDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistEmbellishcraftMarbleDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistEmbellishcraftMarbleDiamondOre, please check the entries!"); } }
        for (String name : Diamond.biomeBlacklistEmbellishcraftSlateDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistEmbellishcraftSlateDiamondOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Diamond.biomeBlacklistHardenedStoneDiamondOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/diamond.toml in biomeBlacklistHardenedStoneDiamondOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Diamond.temperatureBlacklistVanillaDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistStoneDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistAndesiteDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistAndesiteDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistDioriteDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistDioriteDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistGraniteDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistGraniteDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistNetherrackDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistNetherrackDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistEndStoneDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistEndStoneDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistSandDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistSandDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistGravelDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistGravelDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistSandstoneDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistSandstoneDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistRedSandstoneDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistRedSandstoneDiamondOre, please check the entries!"); } }
        for (String temp : Diamond.temperatureBlacklistSandDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistSandDiamondOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Diamond.temperatureBlacklistQuarkBasaltDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistQuarkBasaltDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistQuarkLimestoneDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistQuarkLimestoneDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistQuarkJasperDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistQuarkJasperDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistQuarkMarbleDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistQuarkMarbleDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistQuarkSlateDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistQuarkSlateDiamondOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Diamond.temperatureBlacklistEmbellishcraftBasaltDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistEmbellishcraftBasaltDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistEmbellishcraftGneissDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistEmbellishcraftGneissDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistEmbellishcraftJadeDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistEmbellishcraftJadeDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistEmbellishcraftLarvikiteDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistEmbellishcraftLarvikiteDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistEmbellishcraftMarbleDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistEmbellishcraftMarbleDiamondOre, please check the entries!"); } }
        for (String name : Diamond.temperatureBlacklistEmbellishcraftSlateDiamondOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/diamond.toml in temperatureBlacklistEmbellishcraftSlateDiamondOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Diamond.temperatureBlacklistSandDiamondOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/diamond.toml in temperatureBlacklistSandDiamondOre, please check the entries!"); } }
    }

    private static void checkCoal(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Coal.biomeBlacklistVanillaCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistStoneCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistAndesiteCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistAndesiteCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistDioriteCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistDioriteCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistGraniteCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistGraniteCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistNetherrackCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistNetherrackCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistEndStoneCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistEndStoneCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistSandCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistSandCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistGravelCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistGravelCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistSandstoneCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistSandstoneCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistRedSandstoneCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistRedSandstoneCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistRedSandCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistRedSandCoalOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Coal.biomeBlacklistQuarkBasaltCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistQuarkBasaltCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistQuarkLimestoneCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistQuarkLimestoneCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistQuarkJasperCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistQuarkJasperCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistQuarkMarbleCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistQuarkMarbleCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistQuarkSlateCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistQuarkSlateCoalOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Coal.biomeBlacklistEmbellishcraftBasaltCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistEmbellishcraftBasaltCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistEmbellishcraftGneissCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistEmbellishcraftGneissCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistEmbellishcraftJadeCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistEmbellishcraftJadeCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistEmbellishcraftLarvikiteCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistEmbellishcraftLarvikiteCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistEmbellishcraftMarbleCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistEmbellishcraftMarbleCoalOre, please check the entries!"); } }
        for (String name : Coal.biomeBlacklistEmbellishcraftSlateCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistEmbellishcraftSlateCoalOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Coal.biomeBlacklistHardenedStoneCoalOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/coal.toml in biomeBlacklistHardenedStoneCoalOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Coal.temperatureBlacklistVanillaCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistStoneCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistAndesiteCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistAndesiteCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistDioriteCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistDioriteCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistGraniteCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistGraniteCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistNetherrackCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistNetherrackCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistEndStoneCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistEndStoneCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistSandCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistSandCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistGravelCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistGravelCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistSandstoneCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistSandstoneCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistRedSandstoneCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistRedSandstoneCoalOre, please check the entries!"); } }
        for (String temp : Coal.temperatureBlacklistSandCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistSandCoalOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Coal.temperatureBlacklistQuarkBasaltCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistQuarkBasaltCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistQuarkLimestoneCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistQuarkLimestoneCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistQuarkJasperCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistQuarkJasperCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistQuarkMarbleCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistQuarkMarbleCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistQuarkSlateCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistQuarkSlateCoalOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Coal.temperatureBlacklistEmbellishcraftBasaltCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistEmbellishcraftBasaltCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistEmbellishcraftGneissCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistEmbellishcraftGneissCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistEmbellishcraftJadeCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistEmbellishcraftJadeCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistEmbellishcraftLarvikiteCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistEmbellishcraftLarvikiteCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistEmbellishcraftMarbleCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistEmbellishcraftMarbleCoalOre, please check the entries!"); } }
        for (String name : Coal.temperatureBlacklistEmbellishcraftSlateCoalOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/coal.toml in temperatureBlacklistEmbellishcraftSlateCoalOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Coal.temperatureBlacklistSandCoalOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/coal.toml in temperatureBlacklistSandCoalOre, please check the entries!"); } }
    }

    private static void checkEmerald(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Emerald.biomeBlacklistVanillaEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistStoneEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistAndesiteEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistAndesiteEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistDioriteEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistDioriteEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistGraniteEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistGraniteEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistNetherrackEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistNetherrackEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistEndStoneEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistEndStoneEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistSandEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistSandEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistGravelEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistGravelEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistSandstoneEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistSandstoneEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistRedSandstoneEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistRedSandstoneEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistRedSandEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistRedSandEmeraldOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Emerald.biomeBlacklistQuarkBasaltEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistQuarkBasaltEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistQuarkLimestoneEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistQuarkLimestoneEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistQuarkJasperEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistQuarkJasperEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistQuarkMarbleEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistQuarkMarbleEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistQuarkSlateEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistQuarkSlateEmeraldOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Emerald.biomeBlacklistEmbellishcraftBasaltEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistEmbellishcraftBasaltEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistEmbellishcraftGneissEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistEmbellishcraftGneissEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistEmbellishcraftJadeEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistEmbellishcraftJadeEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistEmbellishcraftLarvikiteEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistEmbellishcraftLarvikiteEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistEmbellishcraftMarbleEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistEmbellishcraftMarbleEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.biomeBlacklistEmbellishcraftSlateEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistEmbellishcraftSlateEmeraldOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Emerald.biomeBlacklistHardenedStoneEmeraldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/emerald.toml in biomeBlacklistHardenedStoneEmeraldOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Emerald.temperatureBlacklistVanillaEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistStoneEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistAndesiteEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistAndesiteEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistDioriteEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistDioriteEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistGraniteEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistGraniteEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistNetherrackEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistNetherrackEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistEndStoneEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistEndStoneEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistSandEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistSandEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistGravelEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistGravelEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistSandstoneEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistSandstoneEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistRedSandstoneEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistRedSandstoneEmeraldOre, please check the entries!"); } }
        for (String temp : Emerald.temperatureBlacklistSandEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistSandEmeraldOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Emerald.temperatureBlacklistQuarkBasaltEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistQuarkBasaltEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistQuarkLimestoneEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistQuarkLimestoneEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistQuarkJasperEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistQuarkJasperEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistQuarkMarbleEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistQuarkMarbleEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistQuarkSlateEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistQuarkSlateEmeraldOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Emerald.temperatureBlacklistEmbellishcraftBasaltEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistEmbellishcraftBasaltEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistEmbellishcraftGneissEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistEmbellishcraftGneissEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistEmbellishcraftJadeEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistEmbellishcraftJadeEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistEmbellishcraftLarvikiteEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistEmbellishcraftLarvikiteEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistEmbellishcraftMarbleEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistEmbellishcraftMarbleEmeraldOre, please check the entries!"); } }
        for (String name : Emerald.temperatureBlacklistEmbellishcraftSlateEmeraldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/emerald.toml in temperatureBlacklistEmbellishcraftSlateEmeraldOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Emerald.temperatureBlacklistSandEmeraldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/emerald.toml in temperatureBlacklistSandEmeraldOre, please check the entries!"); } }
    }

    private static void checkGold(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Gold.biomeBlacklistVanillaGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistStoneGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistAndesiteGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistAndesiteGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistDioriteGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistDioriteGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistGraniteGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistGraniteGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistNetherrackGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistNetherrackGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistEndStoneGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistEndStoneGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistSandGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistSandGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistGravelGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistGravelGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistSandstoneGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistSandstoneGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistRedSandstoneGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistRedSandstoneGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistRedSandGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistRedSandGoldOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Gold.biomeBlacklistQuarkBasaltGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistQuarkBasaltGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistQuarkLimestoneGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistQuarkLimestoneGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistQuarkJasperGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistQuarkJasperGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistQuarkMarbleGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistQuarkMarbleGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistQuarkSlateGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistQuarkSlateGoldOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Gold.biomeBlacklistEmbellishcraftBasaltGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistEmbellishcraftBasaltGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistEmbellishcraftGneissGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistEmbellishcraftGneissGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistEmbellishcraftJadeGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistEmbellishcraftJadeGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistEmbellishcraftLarvikiteGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistEmbellishcraftLarvikiteGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistEmbellishcraftMarbleGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistEmbellishcraftMarbleGoldOre, please check the entries!"); } }
        for (String name : Gold.biomeBlacklistEmbellishcraftSlateGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistEmbellishcraftSlateGoldOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Gold.biomeBlacklistHardenedStoneGoldOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/gold.toml in biomeBlacklistHardenedStoneGoldOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Gold.temperatureBlacklistVanillaGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistStoneGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistAndesiteGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistAndesiteGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistDioriteGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistDioriteGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistGraniteGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistGraniteGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistNetherrackGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistNetherrackGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistEndStoneGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistEndStoneGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistSandGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistSandGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistGravelGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistGravelGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistSandstoneGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistSandstoneGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistRedSandstoneGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistRedSandstoneGoldOre, please check the entries!"); } }
        for (String temp : Gold.temperatureBlacklistSandGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistSandGoldOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Gold.temperatureBlacklistQuarkBasaltGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistQuarkBasaltGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistQuarkLimestoneGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistQuarkLimestoneGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistQuarkJasperGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistQuarkJasperGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistQuarkMarbleGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistQuarkMarbleGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistQuarkSlateGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistQuarkSlateGoldOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Gold.temperatureBlacklistEmbellishcraftBasaltGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistEmbellishcraftBasaltGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistEmbellishcraftGneissGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistEmbellishcraftGneissGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistEmbellishcraftJadeGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistEmbellishcraftJadeGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistEmbellishcraftLarvikiteGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistEmbellishcraftLarvikiteGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistEmbellishcraftMarbleGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistEmbellishcraftMarbleGoldOre, please check the entries!"); } }
        for (String name : Gold.temperatureBlacklistEmbellishcraftSlateGoldOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/gold.toml in temperatureBlacklistEmbellishcraftSlateGoldOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Gold.temperatureBlacklistSandGoldOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/gold.toml in temperatureBlacklistSandGoldOre, please check the entries!"); } }
    }

    private static void checkLapis(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Lapis.biomeBlacklistVanillaLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistStoneLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistAndesiteLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistAndesiteLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistDioriteLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistDioriteLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistGraniteLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistGraniteLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistNetherrackLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistNetherrackLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistEndStoneLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistEndStoneLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistSandLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistSandLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistGravelLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistGravelLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistSandstoneLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistSandstoneLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistRedSandstoneLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistRedSandstoneLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistRedSandLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistRedSandLapisOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Lapis.biomeBlacklistQuarkBasaltLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistQuarkBasaltLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistQuarkLimestoneLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistQuarkLimestoneLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistQuarkJasperLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistQuarkJasperLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistQuarkMarbleLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistQuarkMarbleLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistQuarkSlateLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistQuarkSlateLapisOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Lapis.biomeBlacklistEmbellishcraftBasaltLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistEmbellishcraftBasaltLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistEmbellishcraftGneissLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistEmbellishcraftGneissLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistEmbellishcraftJadeLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistEmbellishcraftJadeLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistEmbellishcraftLarvikiteLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistEmbellishcraftLarvikiteLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistEmbellishcraftMarbleLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistEmbellishcraftMarbleLapisOre, please check the entries!"); } }
        for (String name : Lapis.biomeBlacklistEmbellishcraftSlateLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistEmbellishcraftSlateLapisOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Lapis.biomeBlacklistHardenedStoneLapisOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/lapis.toml in biomeBlacklistHardenedStoneLapisOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Lapis.temperatureBlacklistVanillaLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistStoneLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistAndesiteLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistAndesiteLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistDioriteLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistDioriteLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistGraniteLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistGraniteLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistNetherrackLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistNetherrackLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistEndStoneLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistEndStoneLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistSandLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistSandLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistGravelLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistGravelLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistSandstoneLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistSandstoneLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistRedSandstoneLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistRedSandstoneLapisOre, please check the entries!"); } }
        for (String temp : Lapis.temperatureBlacklistSandLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistSandLapisOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Lapis.temperatureBlacklistQuarkBasaltLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistQuarkBasaltLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistQuarkLimestoneLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistQuarkLimestoneLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistQuarkJasperLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistQuarkJasperLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistQuarkMarbleLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistQuarkMarbleLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistQuarkSlateLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistQuarkSlateLapisOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Lapis.temperatureBlacklistEmbellishcraftBasaltLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistEmbellishcraftBasaltLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistEmbellishcraftGneissLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistEmbellishcraftGneissLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistEmbellishcraftJadeLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistEmbellishcraftJadeLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistEmbellishcraftLarvikiteLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistEmbellishcraftLarvikiteLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistEmbellishcraftMarbleLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistEmbellishcraftMarbleLapisOre, please check the entries!"); } }
        for (String name : Lapis.temperatureBlacklistEmbellishcraftSlateLapisOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/lapis.toml in temperatureBlacklistEmbellishcraftSlateLapisOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Lapis.temperatureBlacklistSandLapisOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/lapis.toml in temperatureBlacklistSandLapisOre, please check the entries!"); } }
    }

    private static void checkQuartz(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Quartz.biomeBlacklistStoneQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistStoneQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistAndesiteQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistAndesiteQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistDioriteQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistDioriteQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistGraniteQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistGraniteQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistVanillaNetherQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistNetherrackQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistEndStoneQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistEndStoneQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistSandQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistSandQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistGravelQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistGravelQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistSandstoneQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistSandstoneQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistRedSandstoneQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistRedSandstoneQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistRedSandQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistRedSandQuartzOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Quartz.biomeBlacklistQuarkBasaltQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistQuarkBasaltQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistQuarkLimestoneQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistQuarkLimestoneQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistQuarkJasperQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistQuarkJasperQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistQuarkMarbleQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistQuarkMarbleQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistQuarkSlateQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistQuarkSlateQuartzOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Quartz.biomeBlacklistEmbellishcraftBasaltQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistEmbellishcraftBasaltQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistEmbellishcraftGneissQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistEmbellishcraftGneissQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistEmbellishcraftJadeQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistEmbellishcraftJadeQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistEmbellishcraftLarvikiteQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistEmbellishcraftLarvikiteQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistEmbellishcraftMarbleQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistEmbellishcraftMarbleQuartzOre, please check the entries!"); } }
        for (String name : Quartz.biomeBlacklistEmbellishcraftSlateQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistEmbellishcraftSlateQuartzOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Quartz.biomeBlacklistHardenedStoneQuartzOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/quartz.toml in biomeBlacklistHardenedStoneQuartzOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Quartz.temperatureBlacklistStoneQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistStoneQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistAndesiteQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistAndesiteQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistDioriteQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistDioriteQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistGraniteQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistGraniteQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistVanillaNetherQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistNetherrackQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistEndStoneQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistEndStoneQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistSandQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistSandQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistGravelQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistGravelQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistSandstoneQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistSandstoneQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistRedSandstoneQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistRedSandstoneQuartzOre, please check the entries!"); } }
        for (String temp : Quartz.temperatureBlacklistSandQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistSandQuartzOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Quartz.temperatureBlacklistQuarkBasaltQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistQuarkBasaltQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistQuarkLimestoneQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistQuarkLimestoneQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistQuarkJasperQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistQuarkJasperQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistQuarkMarbleQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistQuarkMarbleQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistQuarkSlateQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistQuarkSlateQuartzOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Quartz.temperatureBlacklistEmbellishcraftBasaltQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistEmbellishcraftBasaltQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistEmbellishcraftGneissQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistEmbellishcraftGneissQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistEmbellishcraftJadeQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistEmbellishcraftJadeQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistEmbellishcraftLarvikiteQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistEmbellishcraftLarvikiteQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistEmbellishcraftMarbleQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistEmbellishcraftMarbleQuartzOre, please check the entries!"); } }
        for (String name : Quartz.temperatureBlacklistEmbellishcraftSlateQuartzOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/quartz.toml in temperatureBlacklistEmbellishcraftSlateQuartzOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Quartz.temperatureBlacklistSandQuartzOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/quartz.toml in temperatureBlacklistSandQuartzOre, please check the entries!"); } }
    }

    private static void checkRedstone(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Redstone.biomeBlacklistVanillaRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistStoneRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistAndesiteRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistAndesiteRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistDioriteRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistDioriteRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistGraniteRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistGraniteRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistNetherrackRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistNetherrackRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistEndStoneRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistEndStoneRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistSandRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistSandRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistGravelRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistGravelRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistSandstoneRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistSandstoneRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistRedSandstoneRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistRedSandstoneRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistRedSandRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistRedSandRedstoneOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Redstone.biomeBlacklistQuarkBasaltRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistQuarkBasaltRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistQuarkLimestoneRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistQuarkLimestoneRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistQuarkJasperRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistQuarkJasperRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistQuarkMarbleRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistQuarkMarbleRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistQuarkSlateRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistQuarkSlateRedstoneOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Redstone.biomeBlacklistEmbellishcraftBasaltRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistEmbellishcraftBasaltRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistEmbellishcraftGneissRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistEmbellishcraftGneissRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistEmbellishcraftJadeRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistEmbellishcraftJadeRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistEmbellishcraftLarvikiteRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistEmbellishcraftLarvikiteRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistEmbellishcraftMarbleRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistEmbellishcraftMarbleRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.biomeBlacklistEmbellishcraftSlateRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistEmbellishcraftSlateRedstoneOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Redstone.biomeBlacklistHardenedStoneRedstoneOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/redstone.toml in biomeBlacklistHardenedStoneRedstoneOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Redstone.temperatureBlacklistVanillaRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistStoneRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistAndesiteRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistAndesiteRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistDioriteRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistDioriteRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistGraniteRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistGraniteRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistNetherrackRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistNetherrackRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistEndStoneRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistEndStoneRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistSandRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistSandRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistGravelRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistGravelRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistSandstoneRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistSandstoneRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistRedSandstoneRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistRedSandstoneRedstoneOre, please check the entries!"); } }
        for (String temp : Redstone.temperatureBlacklistSandRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistSandRedstoneOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Redstone.temperatureBlacklistQuarkBasaltRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistQuarkBasaltRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistQuarkLimestoneRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistQuarkLimestoneRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistQuarkJasperRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistQuarkJasperRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistQuarkMarbleRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistQuarkMarbleRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistQuarkSlateRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistQuarkSlateRedstoneOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Redstone.temperatureBlacklistEmbellishcraftBasaltRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistEmbellishcraftBasaltRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistEmbellishcraftGneissRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistEmbellishcraftGneissRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistEmbellishcraftJadeRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistEmbellishcraftJadeRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistEmbellishcraftLarvikiteRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistEmbellishcraftLarvikiteRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistEmbellishcraftMarbleRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistEmbellishcraftMarbleRedstoneOre, please check the entries!"); } }
        for (String name : Redstone.temperatureBlacklistEmbellishcraftSlateRedstoneOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/redstone.toml in temperatureBlacklistEmbellishcraftSlateRedstoneOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Redstone.temperatureBlacklistSandRedstoneOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/redstone.toml in temperatureBlacklistSandRedstoneOre, please check the entries!"); } }
    }

    private static void checkCopper(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Copper.biomeBlacklistStoneCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistStoneCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistAndesiteCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistAndesiteCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistDioriteCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistDioriteCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistGraniteCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistGraniteCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistNetherrackCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistNetherrackCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistEndStoneCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistEndStoneCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistSandCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistSandCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistGravelCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistGravelCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistSandstoneCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistSandstoneCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistRedSandstoneCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistRedSandstoneCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistRedSandCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistRedSandCopperOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Copper.biomeBlacklistQuarkBasaltCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistQuarkBasaltCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistQuarkLimestoneCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistQuarkLimestoneCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistQuarkJasperCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistQuarkJasperCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistQuarkMarbleCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistQuarkMarbleCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistQuarkSlateCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistQuarkSlateCopperOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Copper.biomeBlacklistEmbellishcraftBasaltCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistEmbellishcraftBasaltCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistEmbellishcraftGneissCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistEmbellishcraftGneissCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistEmbellishcraftJadeCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistEmbellishcraftJadeCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistEmbellishcraftLarvikiteCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistEmbellishcraftLarvikiteCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistEmbellishcraftMarbleCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistEmbellishcraftMarbleCopperOre, please check the entries!"); } }
        for (String name : Copper.biomeBlacklistEmbellishcraftSlateCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistEmbellishcraftSlateCopperOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Copper.biomeBlacklistHardenedStoneCopperOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/copper.toml in biomeBlacklistHardenedStoneCopperOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Copper.temperatureBlacklistStoneCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistStoneCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistAndesiteCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistAndesiteCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistDioriteCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistDioriteCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistGraniteCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistGraniteCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistNetherrackCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistNetherrackCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistEndStoneCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistEndStoneCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistSandCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistSandCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistGravelCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistGravelCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistSandstoneCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistSandstoneCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistRedSandstoneCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistRedSandstoneCopperOre, please check the entries!"); } }
        for (String temp : Copper.temperatureBlacklistSandCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistSandCopperOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Copper.temperatureBlacklistQuarkBasaltCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistQuarkBasaltCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistQuarkLimestoneCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistQuarkLimestoneCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistQuarkJasperCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistQuarkJasperCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistQuarkMarbleCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistQuarkMarbleCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistQuarkSlateCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistQuarkSlateCopperOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Copper.temperatureBlacklistEmbellishcraftBasaltCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistEmbellishcraftBasaltCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistEmbellishcraftGneissCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistEmbellishcraftGneissCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistEmbellishcraftJadeCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistEmbellishcraftJadeCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistEmbellishcraftLarvikiteCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistEmbellishcraftLarvikiteCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistEmbellishcraftMarbleCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistEmbellishcraftMarbleCopperOre, please check the entries!"); } }
        for (String name : Copper.temperatureBlacklistEmbellishcraftSlateCopperOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/copper.toml in temperatureBlacklistEmbellishcraftSlateCopperOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Copper.temperatureBlacklistSandCopperOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/copper.toml in temperatureBlacklistSandCopperOre, please check the entries!"); } }
    }

    private static void checkXp(ArrayList biomeVerify, ArrayList tempVerify) {
        // Vanilla Biome Blacklist
        for (String name : Xp.biomeBlacklistStoneXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistStoneXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistAndesiteXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistAndesiteXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistDioriteXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistDioriteXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistGraniteXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistGraniteXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistNetherrackXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistNetherrackXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistEndStoneXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistEndStoneXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistSandXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistSandXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistGravelXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistGravelXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistSandstoneXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistSandstoneXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistRedSandstoneXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistRedSandstoneXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistRedSandXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistRedSandXpOre, please check the entries!"); } }

        // Quark Biome Blacklist
        for (String name : Xp.biomeBlacklistQuarkBasaltXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistQuarkBasaltXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistQuarkLimestoneXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistQuarkLimestoneXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistQuarkJasperXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistQuarkJasperXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistQuarkMarbleXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistQuarkMarbleXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistQuarkSlateXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistQuarkSlateXpOre, please check the entries!"); } }

        // Embellishcraft Biome Blacklist
        for (String name : Xp.biomeBlacklistEmbellishcraftBasaltXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistEmbellishcraftBasaltXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistEmbellishcraftGneissXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistEmbellishcraftGneissXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistEmbellishcraftJadeXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistEmbellishcraftJadeXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistEmbellishcraftLarvikiteXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistEmbellishcraftLarvikiteXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistEmbellishcraftMarbleXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistEmbellishcraftMarbleXpOre, please check the entries!"); } }
        for (String name : Xp.biomeBlacklistEmbellishcraftSlateXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistEmbellishcraftSlateXpOre, please check the entries!"); } }

        // Danny's Ores Biome Blacklist
        for (String name : Xp.biomeBlacklistHardenedStoneXpOre.get()) { if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in config/dannys_ores/xp.toml in biomeBlacklistHardenedStoneXpOre, please check the entries!"); } }

        // Vanilla Temperature Blacklist
        for (String temp : Xp.temperatureBlacklistStoneXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistStoneXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistAndesiteXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistAndesiteXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistDioriteXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistDioriteXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistGraniteXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistGraniteXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistNetherrackXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistNetherrackXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistEndStoneXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistEndStoneXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistSandXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistSandXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistGravelXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistGravelXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistSandstoneXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistSandstoneXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistRedSandstoneXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistRedSandstoneXpOre, please check the entries!"); } }
        for (String temp : Xp.temperatureBlacklistSandXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistSandXpOre, please check the entries!"); } }

        // Quark Temperature Blacklist
        for (String name : Xp.temperatureBlacklistQuarkBasaltXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistQuarkBasaltXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistQuarkLimestoneXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistQuarkLimestoneXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistQuarkJasperXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistQuarkJasperXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistQuarkMarbleXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistQuarkMarbleXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistQuarkSlateXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistQuarkSlateXpOre, please check the entries!"); } }

        // Embellishcraft Temperature Blacklist
        for (String name : Xp.temperatureBlacklistEmbellishcraftBasaltXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistEmbellishcraftBasaltXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistEmbellishcraftGneissXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistEmbellishcraftGneissXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistEmbellishcraftJadeXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistEmbellishcraftJadeXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistEmbellishcraftLarvikiteXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistEmbellishcraftLarvikiteXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistEmbellishcraftMarbleXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistEmbellishcraftMarbleXpOre, please check the entries!"); } }
        for (String name : Xp.temperatureBlacklistEmbellishcraftSlateXpOre.get()) { if (!tempVerify.contains(name)) { Main.LOGGER.warn("Invalid temperature '" + name + "' in config/dannys_ores/xp.toml in temperatureBlacklistEmbellishcraftSlateXpOre, please check the entries!"); } }

        // Danny's Ores Temperature Blacklist
        for (String temp : Xp.temperatureBlacklistSandXpOre.get()) { if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in config/dannys_ores/xp.toml in temperatureBlacklistSandXpOre, please check the entries!"); } }
    }
}
