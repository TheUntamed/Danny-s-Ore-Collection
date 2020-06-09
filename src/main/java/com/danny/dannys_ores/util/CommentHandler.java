package com.danny.dannys_ores.util;

/**
 * This class handles the comments in the config files.
 * A change to a comment in this class will change the corresponding comment in all config files.
 */
public class CommentHandler {

    public CommentHandler() { }

    public static String getDisableAllVariantsComment() {
        return "If false, all variants of this ore type will be disabled.";
    }

    public static String getEnableVariantComment() {
        return "If false, this ore variant will not generate.";
    }

    public static String getVeinSizeComment() {
        return "The amount of ores in one vein.";
    }

    public static String getVeinsPerChunkComment() {
        return "How many veins per chunk.";
    }

    public static String getClusterSizeComment() {
        return "The size of a cluster";
    }

    public static String getClustersPerChunkComment() {
        return "How many clusters per chunk.";
    }

    public static String getMinHeightComment() {
        return "The min y-level the ore will generate.";
    }

    public static String getMaxHeightComment() {
        return "The max y-level the ore will generate.";
    }

    public static String getIsTempWhitelistComment() {
        return "If true, the biome temperature blacklist is a whitelist.";
    }

    public static String getTemperatureBlacklistComment() {
        return "Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"";
    }

    public static String getIsBiomeWhitelistComment() {
        return "If true, the biome blacklist is a whitelist.";
    }

    public static String getBiomeBlacklistComment() {
        return "Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:alps\"])";
    }

    public static String getMinXpDropComment() {
        return "The minimum amount of xp this ore drops.";
    }

    public static String getMaxXpDropComment() {
        return "The maximum amount of xp this ore drops.";
    }

    public static String getResistanceComment() {
        return "A higher value means a stronger explosion is needed to destroy this ore. Stone has 6.0 and Obsidian 1200.0";
    }

    public static String getGenerationComment() {
        return "Generation settings for this ore variant";
    }

    public static String getPropertiesComment() { return "Block properties"; }

    public static String getGeneralComment() {
        return "Settings affecting all variants";
    }

    public static String getEffectLevelComment() { return "The strength of the effect."; }

    public static String getDisableEffectComment() { return "If true, these ores will not cause effects to players while in their inventory/hand."; }

    public static String getOnlyWhileSelectedComment() { return "If true, a player will only be affected while holding the ore in a hand. If false, it just has to be in the inventory."; }

    public static String getEffectDurationComment() { return "How long the effect will last in ticks (in seconds for burn effect) after removing the ore from the inventory"; }

    public static String getExplosionChanceComment() { return "The chance (in %) an ore of this type will explode when mined"; }

    public static String getExplosionRangeComment() { return "The range of the explosion (in blocks)"; }

    public static String getExplosionBreaksBlocksComment() { return "If true, explosions caused by this ore type will break blocks. If false, it only damages entities"; }

    public static String getAsLayerComment() { return "If true, this stone variant will generate as a layer instead of a cluster."; }

    public static String getBlockNameComment(StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        String oTypeName = oType.getName().substring(0, 1).toUpperCase() + oType.getName().substring(1);
        String[] variantNameSplit = variant.getBlockName().split("_");
        StringBuilder variantName = new StringBuilder();
        for (String part : variantNameSplit) {
            variantName.append(part.substring(0, 1).toUpperCase()).append(part.substring(1)).append(" ");
        }

        if (rType.equals(RichnessTypes.NORMAL)) {
            return variantName + oTypeName + " Ore";
        } else {
            String rTypeName = rType.getName().substring(0, 1).toUpperCase() + rType.getName().substring(1);
            return variantName + rTypeName + " " + oTypeName + " Ore";
        }
    }
}
