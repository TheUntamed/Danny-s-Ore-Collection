package com.danny.dannys_ores.configs;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a config file to handle the configurations for all stone variants added by this mod.
 * (Just hardened stone right now.)
 */
public class StonesConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec spec;
    public static ForgeConfigSpec.BooleanValue disableAllVariants;

    public static ForgeConfigSpec.BooleanValue enableHardenedStoneGeneration;
    public static ForgeConfigSpec.BooleanValue generateAsLayerHardenedStone;
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

        BUILDER.comment("Stone Variants (this mod adds just one stone variant right now. Vanilla and other mods stone variants are handled in #general or the ore configs)").push(PathHandler.getGeneralPath());
        disableAllVariants = BUILDER.comment("Should stone variants added by this mod generate?").define(PathHandler.getDisableAllVariantsPath(), false);
            BUILDER.comment("Hardened Stone generation settings.").push("hardened_stone");
                BUILDER.comment("Hardened Stone generation settings.").push(PathHandler.getGenerationPath());
                    enableHardenedStoneGeneration = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                    //generateAsLayerHardenedStone = BUILDER.comment(CommentHandler.getAsLayerComment()).define(PathHandler.getAsLayerPath(), false);
                    clusterSizeHardenedStone = BUILDER.comment(CommentHandler.getClusterSizeComment()).defineInRange(PathHandler.getClusterSizePath(), 33, 0, 65536);
                    clustersPerChunkHardenedStone = BUILDER.comment(CommentHandler.getClustersPerChunkComment()).defineInRange(PathHandler.getClustersPerChunkPath(), 10, 0, 65536);
                    minHeightHardenedStone = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), 0, 0, 256);
                    maxHeightHardenedStone = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 30, 0, 256);
                    isTempWhitelistHardenedStone = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                    temperatureBlacklistHardenedStone = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                    isBiomeWhitelistHardenedStone = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                    biomeBlacklistHardenedStone = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                BUILDER.pop();
            BUILDER.pop();
        BUILDER.pop();
        spec = BUILDER.build();
        //BUILDER.comment("").push("");
        //
        //BUILDER.pop();
    }

    /**
     * The method called
     * @param path
     */
    public static void loadConfig(String path) {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, StonesConfig.spec, path + "/stone_variants.toml");
    }
}
