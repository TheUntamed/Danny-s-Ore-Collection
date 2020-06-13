package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import com.danny.dannys_ores.util.StoneVariants;
import com.danny.dannys_ores.util.VariantsModId;

/**
 * This class provides the raw path names as Strings.
 * They are used by the config classes and {@link PathBuilder}
 *
 * A change to a path in this class will change the corresponding path in all config files
 * and at every point of the code where a config path is used to get its value.
 */
public class PathHandler {

    public PathHandler() { }

    public static String getDisableAllVariantsPath() { return "disableAllVariants"; }

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

    public static String getEffectDurationPath() { return "duration"; }

    public static String getDisableEffectPath() { return "disableEffect"; }

    public static String getOnlyWhileSelectedPath() {
        return "onlyWhileSelected";
    }

    public static String getEffectLevelPath() { return "effectLevel"; }

    public static String getExplosionChancePath() { return "explosionChance"; }

    public static String getExplosionRangePath() { return "explosionRange"; }

    public static String getExplosionBreaksBlocksPath() { return "explosionBreaksBlocks"; }

    public static String getStoneVariantsPath() {
        return "stoneVariants";
    }

    public static String getAsLayerPath() { return "asLayer"; }

    public static String getBlockNamePath(StoneVariants variant, RichnessTypes rType, OreTypes oType) {

        if (rType.equals(RichnessTypes.NORMAL)) {
            return variant.getBlockName() + "_" + oType.getName() + "_ore";
        } else {
            return variant.getBlockName() + "_" + rType.getName() + "_" + oType.getName() + "_ore";
        }
    }

    public static String getModNamePath(VariantsModId modId) {
        //Main.LOGGER.info("modId: " + modId.asLowerCaseString());
        return modId.asLowerCaseString();
    }
}
