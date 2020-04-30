package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.Main;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

import java.util.ArrayList;
import java.util.List;

public class Lapis {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec spec;
    public static ForgeConfigSpec.BooleanValue enableLapisOres;

    public static ForgeConfigSpec.BooleanValue enableVanillaLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeVanillaLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkVanillaLapisOre;
    public static ForgeConfigSpec.IntValue minHeightVanillaLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightVanillaLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistVanillaLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistVanillaLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistVanillaLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistVanillaLapisOre;

    public static ForgeConfigSpec.BooleanValue enableAndesiteLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeAndesiteLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkAndesiteLapisOre;
    public static ForgeConfigSpec.IntValue minHeightAndesiteLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightAndesiteLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistAndesiteLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAndesiteLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistAndesiteLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAndesiteLapisOre;

    public static ForgeConfigSpec.BooleanValue enableDioriteLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeDioriteLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkDioriteLapisOre;
    public static ForgeConfigSpec.IntValue minHeightDioriteLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightDioriteLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistDioriteLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistDioriteLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistDioriteLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistDioriteLapisOre;

    public static ForgeConfigSpec.BooleanValue enableGraniteLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeGraniteLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkGraniteLapisOre;
    public static ForgeConfigSpec.IntValue minHeightGraniteLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightGraniteLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistGraniteLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistGraniteLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistGraniteLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistGraniteLapisOre;

    public static ForgeConfigSpec.BooleanValue enableNetherrackLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeNetherrackLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkNetherrackLapisOre;
    public static ForgeConfigSpec.IntValue minHeightNetherrackLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightNetherrackLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistNetherrackLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistNetherrackLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistNetherrackLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistNetherrackLapisOre;

    public static ForgeConfigSpec.BooleanValue enableEndStoneLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeEndStoneLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkEndStoneLapisOre;
    public static ForgeConfigSpec.IntValue minHeightEndStoneLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightEndStoneLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistEndStoneLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEndStoneLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistEndStoneLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEndStoneLapisOre;

    public static ForgeConfigSpec.BooleanValue enableSandLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeSandLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkSandLapisOre;
    public static ForgeConfigSpec.IntValue minHeightSandLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightSandLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistSandLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistSandLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistSandLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistSandLapisOre;

    public static ForgeConfigSpec.BooleanValue enableGravelLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeGravelLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkGravelLapisOre;
    public static ForgeConfigSpec.IntValue minHeightGravelLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightGravelLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistGravelLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistGravelLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistGravelLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistGravelLapisOre;

    public static ForgeConfigSpec.BooleanValue enableSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue minHeightSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightSandstoneLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistSandstoneLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistSandstoneLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistSandstoneLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistSandstoneLapisOre;

    public static ForgeConfigSpec.BooleanValue enableRedSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue veinSizeRedSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkRedSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue minHeightRedSandstoneLapisOre;
    public static ForgeConfigSpec.IntValue maxHeightRedSandstoneLapisOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistRedSandstoneLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistRedSandstoneLapisOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistRedSandstoneLapisOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistRedSandstoneLapisOre;

    static {
        // = BUILDER.comment("").define("", false);

        BUILDER.comment("Lapis Ores").push("lapis_ores");
        enableLapisOres = BUILDER.comment("Enable or disable all Lapis Ore variants.").define("enableLapisOres", true);
        BUILDER.comment("Vanilla (Stone) Lapis Ore").push("vanilla_stone_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableVanillaLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableVanillaLapisOre", true);
        veinSizeVanillaLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeVanillaLapisOre", 7, 0, 65536);
        veinsPerChunkVanillaLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkVanillaLapisOre", 1, 0, 65536);
        minHeightVanillaLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightVanillaLapisOre", 0, 0, 256);
        maxHeightVanillaLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightVanillaLapisOre", 32, 0, 256);
        isTempWhitelistVanillaLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistVanillaLapisOre", false);
        temperatureBlacklistVanillaLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistVanillaLapisOre", new ArrayList<String>());
        isBiomeWhitelistVanillaLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistVanillaLapisOre", false);
        biomeBlacklistVanillaLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistVanillaLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Andesite Lapis Ore").push("andesite_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableAndesiteLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableAndesiteLapisOre", true);
        veinSizeAndesiteLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeAndesiteLapisOre", 7, 0, 65536);
        veinsPerChunkAndesiteLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkAndesiteLapisOre", 1, 0, 65536);
        minHeightAndesiteLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightAndesiteLapisOre", 0, 0, 256);
        maxHeightAndesiteLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightAndesiteLapisOre", 32, 0, 256);
        isTempWhitelistAndesiteLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistAndesiteLapisOre", false);
        temperatureBlacklistAndesiteLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistAndesiteLapisOre", new ArrayList<String>());
        isBiomeWhitelistAndesiteLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistAndesiteLapisOre", false);
        biomeBlacklistAndesiteLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistAndesiteLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Diorite Lapis Ore").push("diorite_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableDioriteLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableDioriteLapisOre", true);
        veinSizeDioriteLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeDioriteLapisOre", 7, 0, 65536);
        veinsPerChunkDioriteLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkDioriteLapisOre", 1, 0, 65536);
        minHeightDioriteLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightDioriteLapisOre", 0, 0, 256);
        maxHeightDioriteLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightDioriteLapisOre", 32, 0, 256);
        isTempWhitelistDioriteLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistDioriteLapisOre", false);
        temperatureBlacklistDioriteLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistDioriteLapisOre", new ArrayList<String>());
        isBiomeWhitelistDioriteLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistDioriteLapisOre", false);
        biomeBlacklistDioriteLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistDioriteLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Granite Lapis Ore").push("granite_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableGraniteLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableGraniteLapisOre", true);
        veinSizeGraniteLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeGraniteLapisOre", 7, 0, 65536);
        veinsPerChunkGraniteLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkGraniteLapisOre", 1, 0, 65536);
        minHeightGraniteLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightGraniteLapisOre", 0, 0, 256);
        maxHeightGraniteLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightGraniteLapisOre", 32, 0, 256);
        isTempWhitelistGraniteLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistGraniteLapisOre", false);
        temperatureBlacklistGraniteLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistGraniteLapisOre", new ArrayList<String>());
        isBiomeWhitelistGraniteLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistGraniteLapisOre", false);
        biomeBlacklistGraniteLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistGraniteLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Netherrack Lapis Ore").push("netherrack_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableNetherrackLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableNetherrackLapisOre", true);
        veinSizeNetherrackLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeNetherrackLapisOre", 7, 0, 65536);
        veinsPerChunkNetherrackLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkNetherrackLapisOre", 1, 0, 65536);
        minHeightNetherrackLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightNetherrackLapisOre", 64, 0, 256);
        maxHeightNetherrackLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightNetherrackLapisOre", 128, 0, 256);
        isTempWhitelistNetherrackLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistNetherrackLapisOre", false);
        temperatureBlacklistNetherrackLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistNetherrackLapisOre", new ArrayList<String>());
        isBiomeWhitelistNetherrackLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistNetherrackLapisOre", false);
        biomeBlacklistNetherrackLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistNetherrackLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("End Stone Lapis Ore").push("end_stone_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableEndStoneLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableEndStoneLapisOre", true);
        veinSizeEndStoneLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeEndStoneLapisOre", 7, 0, 65536);
        veinsPerChunkEndStoneLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkEndStoneLapisOre", 1, 0, 65536);
        minHeightEndStoneLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightEndStoneLapisOre", 0, 0, 256);
        maxHeightEndStoneLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightEndStoneLapisOre", 64, 0, 256);
        isTempWhitelistEndStoneLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistEndStoneLapisOre", false);
        temperatureBlacklistEndStoneLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistEndStoneLapisOre", new ArrayList<String>());
        isBiomeWhitelistEndStoneLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistEndStoneLapisOre", false);
        biomeBlacklistEndStoneLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistEndStoneLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Sand Lapis Ore").push("sand_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableSandLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableSandLapisOre", true);
        veinSizeSandLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeSandLapisOre", 7, 0, 65536);
        veinsPerChunkSandLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkSandLapisOre", 1, 0, 65536);
        minHeightSandLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightSandLapisOre", 0, 0, 256);
        maxHeightSandLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightSandLapisOre", 128, 0, 256);
        isTempWhitelistSandLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistSandLapisOre", false);
        temperatureBlacklistSandLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistSandLapisOre", new ArrayList<String>());
        isBiomeWhitelistSandLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistSandLapisOre", false);
        biomeBlacklistSandLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistSandLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Gravel Lapis Ore").push("gravel_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableGravelLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableGravelLapisOre", true);
        veinSizeGravelLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeGravelLapisOre", 7, 0, 65536);
        veinsPerChunkGravelLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkGravelLapisOre", 1, 0, 65536);
        minHeightGravelLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightGravelLapisOre", 0, 0, 256);
        maxHeightGravelLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightGravelLapisOre", 128, 0, 256);
        isTempWhitelistGravelLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistGravelLapisOre", false);
        temperatureBlacklistGravelLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistGravelLapisOre", new ArrayList<String>());
        isBiomeWhitelistGravelLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistGravelLapisOre", false);
        biomeBlacklistGravelLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistGravelLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Sandstone Lapis Ore").push("sandstone_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableSandstoneLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableSandstoneLapisOre", true);
        veinSizeSandstoneLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeSandstoneLapisOre", 7, 0, 65536);
        veinsPerChunkSandstoneLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkSandstoneLapisOre", 1, 0, 65536);
        minHeightSandstoneLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightSandstoneLapisOre", 0, 0, 256);
        maxHeightSandstoneLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightSandstoneLapisOre", 128, 0, 256);
        isTempWhitelistSandstoneLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistSandstoneLapisOre", false);
        temperatureBlacklistSandstoneLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistSandstoneLapisOre", new ArrayList<String>());
        isBiomeWhitelistSandstoneLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistSandstoneLapisOre", false);
        biomeBlacklistSandstoneLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistSandstoneLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.comment("Red Sandstone Lapis Ore").push("red_sandstone_lapis_ore");
        BUILDER.comment("Generation settings for this ore.").push("generation");
        enableRedSandstoneLapisOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableRedSandstoneLapisOre", true);
        veinSizeRedSandstoneLapisOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeRedSandstoneLapisOre", 7, 0, 65536);
        veinsPerChunkRedSandstoneLapisOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkRedSandstoneLapisOre", 1, 0, 65536);
        minHeightRedSandstoneLapisOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightRedSandstoneLapisOre", 0, 0, 256);
        maxHeightRedSandstoneLapisOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightRedSandstoneLapisOre", 128, 0, 256);
        isTempWhitelistRedSandstoneLapisOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistRedSandstoneLapisOre", false);
        temperatureBlacklistRedSandstoneLapisOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistRedSandstoneLapisOre", new ArrayList<String>());
        isBiomeWhitelistRedSandstoneLapisOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistRedSandstoneLapisOre", false);
        biomeBlacklistRedSandstoneLapisOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistRedSandstoneLapisOre", new ArrayList<String>());
        BUILDER.pop();
        BUILDER.pop();
        BUILDER.pop();
        spec = BUILDER.build();
        //BUILDER.comment("").push("");
        //
        //BUILDER.pop();
    }

    public static void loadConfig() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Lapis.spec, Main.MOD_ID + "/lapis.toml");
    }
}
