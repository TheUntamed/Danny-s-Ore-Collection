package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;

import java.util.ArrayList;

public class ConfigChecker {

    public static void checkConfig(ArrayList biomeVerify, ArrayList tempVerify) {
        checkCopper(biomeVerify, tempVerify);
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
}
