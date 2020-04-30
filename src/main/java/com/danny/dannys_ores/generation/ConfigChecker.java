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

    private static void checkIron(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Iron.biomeBlacklistVanillaIronOre.get()) {
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

        for (String temp : Iron.temperatureBlacklistVanillaIronOre.get()) {
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

    private static void checkDiamond(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Diamond.biomeBlacklistVanillaDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistAndesiteDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistDioriteDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistGraniteDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistNetherrackDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistEndStoneDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistSandDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistGravelDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistSandstoneDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneDiamondOre, please check the entries!"); }
        }
        for (String name : Diamond.biomeBlacklistRedSandstoneDiamondOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneDiamondOre, please check the entries!"); }
        }

        for (String temp : Diamond.temperatureBlacklistVanillaDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistAndesiteDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistDioriteDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistGraniteDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistNetherrackDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistEndStoneDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistSandDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistGravelDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistSandstoneDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneDiamondOre, please check the entries!"); }
        }
        for (String temp : Diamond.temperatureBlacklistRedSandstoneDiamondOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneDiamondOre, please check the entries!"); }
        }
    }

    private static void checkCoal(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Coal.biomeBlacklistVanillaCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistAndesiteCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistDioriteCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistGraniteCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistNetherrackCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistEndStoneCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistSandCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistGravelCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistSandstoneCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneCoalOre, please check the entries!"); }
        }
        for (String name : Coal.biomeBlacklistRedSandstoneCoalOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneCoalOre, please check the entries!"); }
        }

        for (String temp : Coal.temperatureBlacklistVanillaCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistAndesiteCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistDioriteCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistGraniteCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistNetherrackCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistEndStoneCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistSandCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistGravelCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistSandstoneCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneCoalOre, please check the entries!"); }
        }
        for (String temp : Coal.temperatureBlacklistRedSandstoneCoalOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneCoalOre, please check the entries!"); }
        }
    }

    private static void checkEmerald(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Emerald.biomeBlacklistVanillaEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistAndesiteEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistDioriteEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistGraniteEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistNetherrackEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistEndStoneEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistSandEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistGravelEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistSandstoneEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneEmeraldOre, please check the entries!"); }
        }
        for (String name : Emerald.biomeBlacklistRedSandstoneEmeraldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneEmeraldOre, please check the entries!"); }
        }

        for (String temp : Emerald.temperatureBlacklistVanillaEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistAndesiteEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistDioriteEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistGraniteEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistNetherrackEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistEndStoneEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistSandEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistGravelEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistSandstoneEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneEmeraldOre, please check the entries!"); }
        }
        for (String temp : Emerald.temperatureBlacklistRedSandstoneEmeraldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneEmeraldOre, please check the entries!"); }
        }
    }

    private static void checkGold(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Gold.biomeBlacklistVanillaGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistAndesiteGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistDioriteGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistGraniteGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistNetherrackGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistEndStoneGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistSandGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistGravelGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistSandstoneGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneGoldOre, please check the entries!"); }
        }
        for (String name : Gold.biomeBlacklistRedSandstoneGoldOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneGoldOre, please check the entries!"); }
        }

        for (String temp : Gold.temperatureBlacklistVanillaGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistAndesiteGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistDioriteGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistGraniteGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistNetherrackGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistEndStoneGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistSandGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistGravelGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistSandstoneGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneGoldOre, please check the entries!"); }
        }
        for (String temp : Gold.temperatureBlacklistRedSandstoneGoldOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneGoldOre, please check the entries!"); }
        }
    }

    private static void checkLapis(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Lapis.biomeBlacklistVanillaLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistAndesiteLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistDioriteLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistGraniteLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistNetherrackLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistEndStoneLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistSandLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistGravelLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistSandstoneLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneLapisOre, please check the entries!"); }
        }
        for (String name : Lapis.biomeBlacklistRedSandstoneLapisOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneLapisOre, please check the entries!"); }
        }

        for (String temp : Lapis.temperatureBlacklistVanillaLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistAndesiteLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistDioriteLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistGraniteLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistNetherrackLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistEndStoneLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistSandLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistGravelLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistSandstoneLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneLapisOre, please check the entries!"); }
        }
        for (String temp : Lapis.temperatureBlacklistRedSandstoneLapisOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneLapisOre, please check the entries!"); }
        }
    }

    private static void checkQuartz(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Quartz.biomeBlacklistStoneQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistAndesiteQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistDioriteQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistGraniteQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistVanillaNetherQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistEndStoneQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistSandQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistGravelQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistSandstoneQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneQuartzOre, please check the entries!"); }
        }
        for (String name : Quartz.biomeBlacklistRedSandstoneQuartzOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneQuartzOre, please check the entries!"); }
        }

        for (String temp : Quartz.temperatureBlacklistStoneQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistAndesiteQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistDioriteQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistGraniteQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistVanillaNetherQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistEndStoneQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistSandQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistGravelQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistSandstoneQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneQuartzOre, please check the entries!"); }
        }
        for (String temp : Quartz.temperatureBlacklistRedSandstoneQuartzOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneQuartzOre, please check the entries!"); }
        }
    }

    private static void checkRedstone(ArrayList biomeVerify, ArrayList tempVerify) {
        for (String name : Redstone.biomeBlacklistVanillaRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistStoneRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistAndesiteRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistAndesiteRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistDioriteRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistDioriteRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistGraniteRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGraniteRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistNetherrackRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistNetherrackRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistEndStoneRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistEndStoneRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistSandRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistGravelRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistGravelRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistSandstoneRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistSandstoneRedstoneOre, please check the entries!"); }
        }
        for (String name : Redstone.biomeBlacklistRedSandstoneRedstoneOre.get()) {
            if (!biomeVerify.contains(name)) { Main.LOGGER.warn("Invalid biome '" + name + "' in dannys_ores-common.toml in biomeBlacklistRedSandstoneRedstoneOre, please check the entries!"); }
        }

        for (String temp : Redstone.temperatureBlacklistVanillaRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistStoneRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistAndesiteRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistAndesiteRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistDioriteRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistDioriteRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistGraniteRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGraniteRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistNetherrackRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistNetherrackRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistEndStoneRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistEndStoneRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistSandRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistGravelRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistGravelRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistSandstoneRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistSandstoneRedstoneOre, please check the entries!"); }
        }
        for (String temp : Redstone.temperatureBlacklistRedSandstoneRedstoneOre.get()) {
            if (!tempVerify.contains(temp)) { Main.LOGGER.warn("Invalid temperature '" + temp + "' in dannys_ores-common.toml in temperatureBlacklistRedSandstoneRedstoneOre, please check the entries!"); }
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
