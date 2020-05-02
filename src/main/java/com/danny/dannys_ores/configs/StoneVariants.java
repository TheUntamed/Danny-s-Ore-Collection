package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.Main;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

import java.util.ArrayList;
import java.util.List;

public class StoneVariants {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec spec;
    public static ForgeConfigSpec.BooleanValue enableStoneVariants;

    public static ForgeConfigSpec.BooleanValue enableHardenedStoneGeneration;
    public static ForgeConfigSpec.IntValue clusterSizeHardenedStone;
    public static ForgeConfigSpec.IntValue clustersPerChunkHardenedStone;
    public static ForgeConfigSpec.IntValue minHeightHardenedStone;
    public static ForgeConfigSpec.IntValue maxHeightHardenedStone;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistHardenedStone;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistHardenedStone;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistHardenedStone;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistHardenedStone;

    static {
        // = BUILDER.comment("").define("", false);

        BUILDER.comment("Stone Variants").push("stone_variants");
            enableStoneVariants = BUILDER.comment("Should stone variants added by this mod generate?").define("enableStoneVariants", true);
            BUILDER.comment("Hardened Stone generation settings.").push("hardened_stone_generation");
                enableHardenedStoneGeneration = BUILDER.comment("Enable or disable Hardened Stone.").define("enableHardenedStoneGeneration", true);
                clusterSizeHardenedStone = BUILDER.comment("The size of a cluster").defineInRange("clusterSizeHardenedStone", 180, 0, 65536);
                clustersPerChunkHardenedStone = BUILDER.comment("How many clusters per chunk.").defineInRange("clustersPerChunkHardenedStone", 1, 0, 65536);
                minHeightHardenedStone = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightHardenedStone", 0, 0, 256);
                maxHeightHardenedStone = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightHardenedStone", 16, 0, 256);
                isTempWhitelistHardenedStone = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistHardenedStone", false);
                temperatureBlacklistHardenedStone = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistHardenedStone", new ArrayList<String>());
                isBiomeWhitelistHardenedStone = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistHardenedStone", false);
                biomeBlacklistHardenedStone = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:alps\"])").define("biomeBlacklistHardenedStone", new ArrayList<String>());
            BUILDER.pop();
        BUILDER.pop();
        spec = BUILDER.build();
        //BUILDER.comment("").push("");
        //
        //BUILDER.pop();
    }

    public static void loadConfig() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, StoneVariants.spec, Main.MOD_ID + "/stone_variants.toml");
    }
}
