package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.Iron;
import com.danny.dannys_ores.configs.Xp;

import java.util.ArrayList;

/*
The biome verifier was inspired by the code of the mod Embellishcraft by MapperTV.
https://github.com/MapperTV/embellishcraft
 */
public class ConfigChecker {

    public static void checkConfig(ArrayList biomeVerify, ArrayList tempVerify) {
        checkIron(biomeVerify, tempVerify);
        checkCopper(biomeVerify, tempVerify);
        checkXp(biomeVerify, tempVerify);
    }

    private static void checkIron(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Iron.biomeBlacklistStoneIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistAndesiteIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistDioriteIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistGraniteIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistNetherrackIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistEndStoneIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistSandIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistGravelIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistSandstoneIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneIronOre, please check the entries!"); }
        }
        for (String name : Iron.biomeBlacklistRedSandstoneIronOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneIronOre, please check the entries!"); }
        }

        for (String temp : Iron.temperatureBlacklistStoneIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistAndesiteIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistDioriteIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistGraniteIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistNetherrackIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistEndStoneIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistSandIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistGravelIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistSandstoneIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneIronOre, please check the entries!"); }
        }
        for (String temp : Iron.temperatureBlacklistRedSandstoneIronOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneIronOre, please check the entries!"); }
        }
    }

    private static void checkCopper(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Copper.biomeBlacklistStoneCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistAndesiteCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistDioriteCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistGraniteCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistNetherrackCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistEndStoneCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistSandCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistGravelCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistSandstoneCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneCopperOre, please check the entries!"); }
        }
        for (String name : Copper.biomeBlacklistRedSandstoneCopperOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneCopperOre, please check the entries!"); }
        }

        for (String temp : Copper.temperatureBlacklistStoneCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistAndesiteCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistDioriteCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistGraniteCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistNetherrackCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistEndStoneCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistSandCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistGravelCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistSandstoneCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneCopperOre, please check the entries!"); }
        }
        for (String temp : Copper.temperatureBlacklistRedSandstoneCopperOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneCopperOre, please check the entries!"); }
        }
    }

    private static void checkXp(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Xp.biomeBlacklistStoneXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistAndesiteXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistDioriteXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistGraniteXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistNetherrackXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistEndStoneXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistSandXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistGravelXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistSandstoneXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneXpOre, please check the entries!"); }
        }
        for (String name : Xp.biomeBlacklistRedSandstoneXpOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneXpOre, please check the entries!"); }
        }

        for (String temp : Xp.temperatureBlacklistStoneXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistAndesiteXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistDioriteXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistGraniteXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistNetherrackXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistEndStoneXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistSandXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistGravelXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistSandstoneXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneXpOre, please check the entries!"); }
        }
        for (String temp : Xp.temperatureBlacklistRedSandstoneXpOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneXpOre, please check the entries!"); }
        }
    }
}
