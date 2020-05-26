package com.danny.dannys_ores.util;

/**
 * This class handles the paths of config values.
 * A change to a path in this class will change the corresponding path in all config files
 * and at every point of the code where a config path is used to get its value.
 */
public class PathHandler {

    public PathHandler() { }

    public static String getDisableAllVariantsPath() {
        return "disableAllVariants";
    }

    public static String getEnableVariantPath() {
        return "enableVariant";
    }

    public static String getVeinSizePath() {
        return "veinSize";
    }

    public static String getVeinsPerChunkPath() {
        return "veinsPerChunk";
    }

    public static String getClusterSizePath() {
        return "clusterSize";
    }

    public static String getClustersPerChunkPath() {
        return "clustersPerChunk";
    }

    public static String getMinHeightPath() {
        return "minHeight";
    }

    public static String getMaxHeightPath() {
        return "maxHeight";
    }

    public static String getIsTempWhitelistPath() {
        return "isTempWhitelist";
    }

    public static String getTemperatureBlacklistPath() {
        return "temperatureBlacklist";
    }

    public static String getIsBiomeWhitelistPath() {
        return "isBiomeWhitelist";
    }

    public static String getBiomeBlacklistPath() {
        return "biomeBlacklist";
    }

    public static String getMinXpDropPath() {
        return "minXpDrop";
    }

    public static String getMaxXpDropPath() {
        return "maxXpDrop";
    }

    public static String getResistancePath() {
        return "resistance";
    }

    public static String getGenerationPath() {
        return "generation";
    }

    public static String getPropertiesPath() {
        return "properties";
    }

    public static String getGeneralPath() {
        return "general";
    }

    public static String getDurationPath() {
        return "duration";
    }

    public static String getSelectedPath() {
        return "onlyWhileSelected";
    }
}
