package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.util.*;

/**
 * This class concatenates the partial paths provided by {@link PathHandler}.
 * A full config path can be used to get the value behind it.
 * 
 * e.g. config.get('fullPath');
 */
public class PathBuilder {

    //######//
    // Ores //
    //######//

    public static String getDisableAllVariantsFullPath(RichnessTypes rType) {
        return getGeneralPath() + "." + rType.getName() + "." + PathHandler.getDisableAllVariantsPath();
    }

    public static String getDisableAllVariantsFullPath() {
        return getGeneralPath() + "." + PathHandler.getDisableAllVariantsPath();
    }

    public static String getEnableVariantFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getEnableVariantPath();
    }

    public static String getVeinSizeFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getVeinSizePath();
    }

    public static String getVeinsPerChunkFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getVeinsPerChunkPath();
    }

    public static String getMinHeightFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getMinHeightPath();
    }

    public static String getMaxHeightFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getMaxHeightPath();
    }

    public static String getIsTempWhitelistFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getIsTempWhitelistPath();
    }

    public static String getTemperatureBlacklistFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getTemperatureBlacklistPath();
    }

    public static String getIsBiomeWhitelistFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getIsBiomeWhitelistPath();
    }

    public static String getBiomeBlacklistFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGenerationPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getBiomeBlacklistPath();
    }

    public static String getMinXpDropFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getPropertiesPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getMinXpDropPath();
    }

    public static String getMaxXpDropFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getPropertiesPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getMaxXpDropPath();
    }

    public static String getResistanceFullPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getPropertiesPath(fillerBlockModId, variant, rType, oType) + "." + PathHandler.getResistancePath();
    }

    public static String getEffectDurationFullPath() {
        return getGeneralPath() + "." + PathHandler.getEffectDurationPath();
    }

    public static String getDisableEffectFullPath() {
        return getGeneralPath() + "." + PathHandler.getDisableEffectPath();
    }

    public static String getOnlyWhileSelectedFullPath() {
        return getGeneralPath() + "." + PathHandler.getOnlyWhileSelectedPath();
    }

    public static String getEffectLevelFullPath() {
        return PathHandler.getGeneralPath() + "." + PathHandler.getEffectLevelPath();
    }

    public static String getExplosionChanceFullPath() {
        return getGeneralPath() + "." + PathHandler.getExplosionChancePath();
    }

    public static String getExplosionRangeFullPath() {
        return getGeneralPath() + "." + PathHandler.getExplosionRangePath();
    }

    public static String getExplosionBreaksBlocksFullPath() {
        return getGeneralPath() + "." + PathHandler.getExplosionBreaksBlocksPath();
    }


    public static String getGenerationPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGeneralPath() + "." + PathHandler.getModNamePath(fillerBlockModId) + "." + PathHandler.getBlockNamePath(variant, rType, oType) + "." + PathHandler.getGenerationPath();
    }

    public static String getPropertiesPath(VariantsModId fillerBlockModId, StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        return getGeneralPath() + "." + PathHandler.getModNamePath(fillerBlockModId) + "." + PathHandler.getBlockNamePath(variant, rType, oType) + "." + PathHandler.getPropertiesPath();
    }

    public static String getGeneralPath() {
        return PathHandler.getGeneralPath();
    }

    //################//
    // Stone Variants //
    //################//

    public static String getEnableVariantFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getEnableVariantPath();
    }

    public static String getVeinSizeFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getVeinSizePath();
    }

    public static String getVeinsPerChunkFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getVeinsPerChunkPath();
    }

    public static String getMinHeightFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getMinHeightPath();
    }

    public static String getMaxHeightFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getMaxHeightPath();
    }

    public static String getIsTempWhitelistFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getIsTempWhitelistPath();
    }

    public static String getTemperatureBlacklistFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getTemperatureBlacklistPath();
    }

    public static String getIsBiomeWhitelistFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getIsBiomeWhitelistPath();
    }

    public static String getBiomeBlacklistFullPath(String blockName) {
        return getGenerationPath(blockName) + "." + PathHandler.getBiomeBlacklistPath();
    }


    public static String getGenerationPath(String blockName) {
        return getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath();
    }
}
