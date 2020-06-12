package com.danny.dannys_ores.configs.ores;

import com.danny.dannys_ores.util.*;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    private ForgeConfigSpec spec;

    /**
     * Creates a config file for all ores with the given feature combination.
     * @param path The directory the file should be placed in.
     * @param oType The ore type.
     * @param rType The richness type
     * @return ForgeConfigSpec containing all config values and their unambiguously paths
     */
    public ForgeConfigSpec create(String path, OreTypes oType, RichnessTypes rType) {
        ConfigTypes cType = oType.getConfigType();
        ForgeConfigSpec.BooleanValue disableOreType;
        ForgeConfigSpec.DoubleValue explosionChance;
        ForgeConfigSpec.DoubleValue explosionRange;
        ForgeConfigSpec.BooleanValue explosionBreaksBlocks;
        ForgeConfigSpec.BooleanValue disableEffect;
        ForgeConfigSpec.BooleanValue onlyWhileSelected;
        ForgeConfigSpec.IntValue effectDuration;
        ForgeConfigSpec.IntValue effectLevel;

        ForgeConfigSpec.BooleanValue enableStoneOre;
        ForgeConfigSpec.IntValue veinSizeStoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkStoneOre;
        ForgeConfigSpec.IntValue minHeightStoneOre;
        ForgeConfigSpec.IntValue maxHeightStoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistStoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistStoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistStoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistStoneOre;
        ForgeConfigSpec.IntValue minXpStoneOre;
        ForgeConfigSpec.IntValue maxXpStoneOre;

        ForgeConfigSpec.BooleanValue enableAndesiteOre;
        ForgeConfigSpec.IntValue veinSizeAndesiteOre;
        ForgeConfigSpec.IntValue veinsPerChunkAndesiteOre;
        ForgeConfigSpec.IntValue minHeightAndesiteOre;
        ForgeConfigSpec.IntValue maxHeightAndesiteOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAndesiteOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAndesiteOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAndesiteOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAndesiteOre;
        ForgeConfigSpec.IntValue minXpAndesiteOre;
        ForgeConfigSpec.IntValue maxXpAndesiteOre;

        ForgeConfigSpec.BooleanValue enableDioriteOre;
        ForgeConfigSpec.IntValue veinSizeDioriteOre;
        ForgeConfigSpec.IntValue veinsPerChunkDioriteOre;
        ForgeConfigSpec.IntValue minHeightDioriteOre;
        ForgeConfigSpec.IntValue maxHeightDioriteOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistDioriteOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistDioriteOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistDioriteOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistDioriteOre;
        ForgeConfigSpec.IntValue minXpDioriteOre;
        ForgeConfigSpec.IntValue maxXpDioriteOre;

        ForgeConfigSpec.BooleanValue enableGraniteOre;
        ForgeConfigSpec.IntValue veinSizeGraniteOre;
        ForgeConfigSpec.IntValue veinsPerChunkGraniteOre;
        ForgeConfigSpec.IntValue minHeightGraniteOre;
        ForgeConfigSpec.IntValue maxHeightGraniteOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistGraniteOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistGraniteOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistGraniteOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistGraniteOre;
        ForgeConfigSpec.IntValue minXpGraniteOre;
        ForgeConfigSpec.IntValue maxXpGraniteOre;

        ForgeConfigSpec.BooleanValue enableNetherrackOre;
        ForgeConfigSpec.IntValue veinSizeNetherrackOre;
        ForgeConfigSpec.IntValue veinsPerChunkNetherrackOre;
        ForgeConfigSpec.IntValue minHeightNetherrackOre;
        ForgeConfigSpec.IntValue maxHeightNetherrackOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistNetherrackOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistNetherrackOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistNetherrackOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistNetherrackOre;
        ForgeConfigSpec.IntValue minXpNetherrackOre;
        ForgeConfigSpec.IntValue maxXpNetherrackOre;

        ForgeConfigSpec.BooleanValue enableEndStoneOre;
        ForgeConfigSpec.IntValue veinSizeEndStoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkEndStoneOre;
        ForgeConfigSpec.IntValue minHeightEndStoneOre;
        ForgeConfigSpec.IntValue maxHeightEndStoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistEndStoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEndStoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistEndStoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEndStoneOre;
        ForgeConfigSpec.IntValue minXpEndStoneOre;
        ForgeConfigSpec.IntValue maxXpEndStoneOre;

        ForgeConfigSpec.BooleanValue enableSandOre;
        ForgeConfigSpec.IntValue veinSizeSandOre;
        ForgeConfigSpec.IntValue veinsPerChunkSandOre;
        ForgeConfigSpec.IntValue minHeightSandOre;
        ForgeConfigSpec.IntValue maxHeightSandOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistSandOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistSandOre;
        ForgeConfigSpec.IntValue minXpSandOre;
        ForgeConfigSpec.IntValue maxXpSandOre;

        ForgeConfigSpec.BooleanValue enableRedSandOre;
        ForgeConfigSpec.IntValue veinSizeRedSandOre;
        ForgeConfigSpec.IntValue veinsPerChunkRedSandOre;
        ForgeConfigSpec.IntValue minHeightRedSandOre;
        ForgeConfigSpec.IntValue maxHeightRedSandOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistRedSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistRedSandOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistRedSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistRedSandOre;
        ForgeConfigSpec.IntValue minXpRedSandOre;
        ForgeConfigSpec.IntValue maxXpRedSandOre;

        ForgeConfigSpec.BooleanValue enableSandstoneOre;
        ForgeConfigSpec.IntValue veinSizeSandstoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkSandstoneOre;
        ForgeConfigSpec.IntValue minHeightSandstoneOre;
        ForgeConfigSpec.IntValue maxHeightSandstoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistSandstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistSandstoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistSandstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistSandstoneOre;
        ForgeConfigSpec.IntValue minXpSandstoneOre;
        ForgeConfigSpec.IntValue maxXpSandstoneOre;

        ForgeConfigSpec.BooleanValue enableRedSandstoneOre;
        ForgeConfigSpec.IntValue veinSizeRedSandstoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkRedSandstoneOre;
        ForgeConfigSpec.IntValue minHeightRedSandstoneOre;
        ForgeConfigSpec.IntValue maxHeightRedSandstoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistRedSandstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistRedSandstoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistRedSandstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistRedSandstoneOre;
        ForgeConfigSpec.IntValue minXpRedSandstoneOre;
        ForgeConfigSpec.IntValue maxXpRedSandstoneOre;

        ForgeConfigSpec.BooleanValue enableGravelOre;
        ForgeConfigSpec.IntValue veinSizeGravelOre;
        ForgeConfigSpec.IntValue veinsPerChunkGravelOre;
        ForgeConfigSpec.IntValue minHeightGravelOre;
        ForgeConfigSpec.IntValue maxHeightGravelOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistGravelOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistGravelOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistGravelOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistGravelOre;
        ForgeConfigSpec.IntValue minXpGravelOre;
        ForgeConfigSpec.IntValue maxXpGravelOre;

        ForgeConfigSpec.BooleanValue enableBlueIceOre;
        ForgeConfigSpec.IntValue veinSizeBlueIceOre;
        ForgeConfigSpec.IntValue veinsPerChunkBlueIceOre;
        ForgeConfigSpec.IntValue minHeightBlueIceOre;
        ForgeConfigSpec.IntValue maxHeightBlueIceOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistBlueIceOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistBlueIceOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistBlueIceOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistBlueIceOre;
        ForgeConfigSpec.IntValue minXpBlueIceOre;
        ForgeConfigSpec.IntValue maxXpBlueIceOre;

        ForgeConfigSpec.BooleanValue enablePackedIceOre;
        ForgeConfigSpec.IntValue veinSizePackedIceOre;
        ForgeConfigSpec.IntValue veinsPerChunkPackedIceOre;
        ForgeConfigSpec.IntValue minHeightPackedIceOre;
        ForgeConfigSpec.IntValue maxHeightPackedIceOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistPackedIceOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistPackedIceOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistPackedIceOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistPackedIceOre;
        ForgeConfigSpec.IntValue minXpPackedIceOre;
        ForgeConfigSpec.IntValue maxXpPackedIceOre;

        ForgeConfigSpec.BooleanValue enableBedrockOre;
        ForgeConfigSpec.IntValue veinSizeBedrockOre;
        ForgeConfigSpec.IntValue veinsPerChunkBedrockOre;
        ForgeConfigSpec.IntValue minHeightBedrockOre;
        ForgeConfigSpec.IntValue maxHeightBedrockOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistBedrockOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistBedrockOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistBedrockOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistBedrockOre;
        ForgeConfigSpec.DoubleValue resistanceBedrockOre;
        ForgeConfigSpec.IntValue minXpBedrockOre;
        ForgeConfigSpec.IntValue maxXpBedrockOre;

        ForgeConfigSpec.BooleanValue enableQuarkBasaltOre;
        ForgeConfigSpec.IntValue veinSizeQuarkBasaltOre;
        ForgeConfigSpec.IntValue veinsPerChunkQuarkBasaltOre;
        ForgeConfigSpec.IntValue minHeightQuarkBasaltOre;
        ForgeConfigSpec.IntValue maxHeightQuarkBasaltOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistQuarkBasaltOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistQuarkBasaltOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistQuarkBasaltOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistQuarkBasaltOre;
        ForgeConfigSpec.IntValue minXpQuarkBasaltOre;
        ForgeConfigSpec.IntValue maxXpQuarkBasaltOre;

        ForgeConfigSpec.BooleanValue enableQuarkLimestoneOre;
        ForgeConfigSpec.IntValue veinSizeQuarkLimestoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkQuarkLimestoneOre;
        ForgeConfigSpec.IntValue minHeightQuarkLimestoneOre;
        ForgeConfigSpec.IntValue maxHeightQuarkLimestoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistQuarkLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistQuarkLimestoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistQuarkLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistQuarkLimestoneOre;
        ForgeConfigSpec.IntValue minXpQuarkLimestoneOre;
        ForgeConfigSpec.IntValue maxXpQuarkLimestoneOre;

        ForgeConfigSpec.BooleanValue enableQuarkJasperOre;
        ForgeConfigSpec.IntValue veinSizeQuarkJasperOre;
        ForgeConfigSpec.IntValue veinsPerChunkQuarkJasperOre;
        ForgeConfigSpec.IntValue minHeightQuarkJasperOre;
        ForgeConfigSpec.IntValue maxHeightQuarkJasperOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistQuarkJasperOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistQuarkJasperOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistQuarkJasperOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistQuarkJasperOre;
        ForgeConfigSpec.IntValue minXpQuarkJasperOre;
        ForgeConfigSpec.IntValue maxXpQuarkJasperOre;

        ForgeConfigSpec.BooleanValue enableQuarkMarbleOre;
        ForgeConfigSpec.IntValue veinSizeQuarkMarbleOre;
        ForgeConfigSpec.IntValue veinsPerChunkQuarkMarbleOre;
        ForgeConfigSpec.IntValue minHeightQuarkMarbleOre;
        ForgeConfigSpec.IntValue maxHeightQuarkMarbleOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistQuarkMarbleOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistQuarkMarbleOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistQuarkMarbleOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistQuarkMarbleOre;
        ForgeConfigSpec.IntValue minXpQuarkMarbleOre;
        ForgeConfigSpec.IntValue maxXpQuarkMarbleOre;

        ForgeConfigSpec.BooleanValue enableQuarkSlateOre;
        ForgeConfigSpec.IntValue veinSizeQuarkSlateOre;
        ForgeConfigSpec.IntValue veinsPerChunkQuarkSlateOre;
        ForgeConfigSpec.IntValue minHeightQuarkSlateOre;
        ForgeConfigSpec.IntValue maxHeightQuarkSlateOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistQuarkSlateOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistQuarkSlateOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistQuarkSlateOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistQuarkSlateOre;
        ForgeConfigSpec.IntValue minXpQuarkSlateOre;
        ForgeConfigSpec.IntValue maxXpQuarkSlateOre;

        ForgeConfigSpec.BooleanValue enableEmbellishcraftBasaltOre;
        ForgeConfigSpec.IntValue veinSizeEmbellishcraftBasaltOre;
        ForgeConfigSpec.IntValue veinsPerChunkEmbellishcraftBasaltOre;
        ForgeConfigSpec.IntValue minHeightEmbellishcraftBasaltOre;
        ForgeConfigSpec.IntValue maxHeightEmbellishcraftBasaltOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistEmbellishcraftBasaltOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEmbellishcraftBasaltOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistEmbellishcraftBasaltOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEmbellishcraftBasaltOre;
        ForgeConfigSpec.IntValue minXpEmbellishcraftBasaltOre;
        ForgeConfigSpec.IntValue maxXpEmbellishcraftBasaltOre;

        ForgeConfigSpec.BooleanValue enableEmbellishcraftGneissOre;
        ForgeConfigSpec.IntValue veinSizeEmbellishcraftGneissOre;
        ForgeConfigSpec.IntValue veinsPerChunkEmbellishcraftGneissOre;
        ForgeConfigSpec.IntValue minHeightEmbellishcraftGneissOre;
        ForgeConfigSpec.IntValue maxHeightEmbellishcraftGneissOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistEmbellishcraftGneissOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEmbellishcraftGneissOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistEmbellishcraftGneissOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEmbellishcraftGneissOre;
        ForgeConfigSpec.IntValue minXpEmbellishcraftGneissOre;
        ForgeConfigSpec.IntValue maxXpEmbellishcraftGneissOre;

        ForgeConfigSpec.BooleanValue enableEmbellishcraftJadeOre;
        ForgeConfigSpec.IntValue veinSizeEmbellishcraftJadeOre;
        ForgeConfigSpec.IntValue veinsPerChunkEmbellishcraftJadeOre;
        ForgeConfigSpec.IntValue minHeightEmbellishcraftJadeOre;
        ForgeConfigSpec.IntValue maxHeightEmbellishcraftJadeOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistEmbellishcraftJadeOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEmbellishcraftJadeOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistEmbellishcraftJadeOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEmbellishcraftJadeOre;
        ForgeConfigSpec.IntValue minXpEmbellishcraftJadeOre;
        ForgeConfigSpec.IntValue maxXpEmbellishcraftJadeOre;

        ForgeConfigSpec.BooleanValue enableEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.IntValue veinSizeEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.IntValue veinsPerChunkEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.IntValue minHeightEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.IntValue maxHeightEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.IntValue minXpEmbellishcraftLarvikiteOre;
        ForgeConfigSpec.IntValue maxXpEmbellishcraftLarvikiteOre;

        ForgeConfigSpec.BooleanValue enableEmbellishcraftMarbleOre;
        ForgeConfigSpec.IntValue veinSizeEmbellishcraftMarbleOre;
        ForgeConfigSpec.IntValue veinsPerChunkEmbellishcraftMarbleOre;
        ForgeConfigSpec.IntValue minHeightEmbellishcraftMarbleOre;
        ForgeConfigSpec.IntValue maxHeightEmbellishcraftMarbleOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistEmbellishcraftMarbleOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEmbellishcraftMarbleOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistEmbellishcraftMarbleOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEmbellishcraftMarbleOre;
        ForgeConfigSpec.IntValue minXpEmbellishcraftMarbleOre;
        ForgeConfigSpec.IntValue maxXpEmbellishcraftMarbleOre;

        ForgeConfigSpec.BooleanValue enableEmbellishcraftSlateOre;
        ForgeConfigSpec.IntValue veinSizeEmbellishcraftSlateOre;
        ForgeConfigSpec.IntValue veinsPerChunkEmbellishcraftSlateOre;
        ForgeConfigSpec.IntValue minHeightEmbellishcraftSlateOre;
        ForgeConfigSpec.IntValue maxHeightEmbellishcraftSlateOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistEmbellishcraftSlateOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistEmbellishcraftSlateOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistEmbellishcraftSlateOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEmbellishcraftSlateOre;
        ForgeConfigSpec.IntValue minXpEmbellishcraftSlateOre;
        ForgeConfigSpec.IntValue maxXpEmbellishcraftSlateOre;

        ForgeConfigSpec.BooleanValue enableMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.IntValue veinSizeMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.IntValue minHeightMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.IntValue maxHeightMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.IntValue minXpMysticalagricultureSoulstoneOre;
        ForgeConfigSpec.IntValue maxXpMysticalagricultureSoulstoneOre;

        ForgeConfigSpec.BooleanValue enableMidnightNightstoneOre;
        ForgeConfigSpec.IntValue veinSizeMidnightNightstoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkMidnightNightstoneOre;
        ForgeConfigSpec.IntValue minHeightMidnightNightstoneOre;
        ForgeConfigSpec.IntValue maxHeightMidnightNightstoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistMidnightNightstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistMidnightNightstoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistMidnightNightstoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistMidnightNightstoneOre;
        ForgeConfigSpec.IntValue minXpMidnightNightstoneOre;
        ForgeConfigSpec.IntValue maxXpMidnightNightstoneOre;

        ForgeConfigSpec.BooleanValue enableHardenedStoneOre;
        ForgeConfigSpec.IntValue veinSizeHardenedStoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkHardenedStoneOre;
        ForgeConfigSpec.IntValue minHeightHardenedStoneOre;
        ForgeConfigSpec.IntValue maxHeightHardenedStoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistHardenedStoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistHardenedStoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistHardenedStoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistHardenedStoneOre;
        ForgeConfigSpec.IntValue minXpHardenedStoneOre;
        ForgeConfigSpec.IntValue maxXpHardenedStoneOre;

        BUILDER.comment(CommentHandler.getGeneralComment()).push(PathHandler.getGeneralPath());
            disableOreType = BUILDER.comment(CommentHandler.getDisableAllVariantsComment()).define(PathHandler.getDisableAllVariantsPath(), false);
            if (oType.getEffect().equals(Effects.EXPLODE)) {
                explosionChance = BUILDER.comment(CommentHandler.getExplosionChanceComment()).defineInRange(PathHandler.getExplosionChancePath(), 10.0D, 0.0D, 100.0D);
                explosionRange = BUILDER.comment(CommentHandler.getExplosionRangeComment()).defineInRange(PathHandler.getExplosionRangePath(), 3.0D, 0.0D, 100.0D);
                explosionBreaksBlocks = BUILDER.comment(CommentHandler.getExplosionBreaksBlocksComment()).define(PathHandler.getExplosionBreaksBlocksPath(), false);
            } else if(!oType.getEffect().equals(Effects.NONE)) {
                disableEffect = BUILDER.comment(CommentHandler.getDisableEffectComment()).define(PathHandler.getDisableEffectPath(), false);
                onlyWhileSelected = BUILDER.comment(CommentHandler.getOnlyWhileSelectedComment()).define(PathHandler.getOnlyWhileSelectedPath(), false);
                effectDuration = BUILDER.comment(CommentHandler.getEffectDurationComment()).defineInRange(PathHandler.getEffectDurationPath(), oType.getEffectDuration(), oType.getEffectDuration(), 1000000);
                if (!oType.getEffect().equals(Effects.BURN)) {
                    effectLevel = BUILDER.comment(CommentHandler.getEffectLevelComment()).defineInRange(PathHandler.getEffectLevelPath(), 1, 1, 128);
                }
            }
            BUILDER.comment("Vanilla Stone Variants").push(PathHandler.getModNamePath(VariantsModId.MINECRAFT));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.STONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.STONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableStoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeStoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkStoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightStoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightStoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistStoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistStoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistStoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistStoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                            minXpStoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                            maxXpStoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ANDESITE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ANDESITE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableAndesiteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeAndesiteOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAndesiteOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAndesiteOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAndesiteOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAndesiteOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAndesiteOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAndesiteOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAndesiteOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAndesiteOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAndesiteOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.DIORITE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.DIORITE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableDioriteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeDioriteOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkDioriteOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightDioriteOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightDioriteOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistDioriteOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistDioriteOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistDioriteOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistDioriteOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpDioriteOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpDioriteOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.GRANITE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.GRANITE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableGraniteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeGraniteOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkGraniteOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightGraniteOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightGraniteOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistGraniteOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistGraniteOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistGraniteOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistGraniteOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpGraniteOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpGraniteOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.NETHERRACK, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.NETHERRACK, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableNetherrackOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeNetherrackOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getNetherFactor()), 0, 65536);
                        veinsPerChunkNetherrackOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getNetherFactor()), 0, 65536);
                        minHeightNetherrackOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), Math.max(128 - cType.getMaxY(), 0), 0, 256);
                        maxHeightNetherrackOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), Math.max(128 - cType.getMinY(), 0), 0, 256);
                        isTempWhitelistNetherrackOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistNetherrackOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistNetherrackOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistNetherrackOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpNetherrackOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpNetherrackOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.END_STONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.END_STONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableEndStoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeEndStoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getEndFactor()), 0, 65536);
                        veinsPerChunkEndStoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getEndFactor()), 0, 65536);
                        minHeightEndStoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), Math.min(cType.getMinY(), 56), 0, 256);
                        maxHeightEndStoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), Math.max(cType.getMaxY(), 16), 0, 256);
                        isTempWhitelistEndStoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistEndStoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistEndStoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistEndStoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpEndStoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpEndStoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.SAND, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.SAND, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableSandOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeSandOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getSurfaceFactor()), 0, 65536);
                        veinsPerChunkSandOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getSurfaceFactor()), 0, 65536);
                        minHeightSandOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightSandOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                        isTempWhitelistSandOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistSandOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistSandOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistSandOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpSandOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpSandOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.RED_SAND, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.RED_SAND, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                    enableRedSandOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                    veinSizeRedSandOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getSurfaceFactor()), 0, 65536);
                    veinsPerChunkRedSandOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getSurfaceFactor()), 0, 65536);
                    minHeightRedSandOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                    maxHeightRedSandOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                    isTempWhitelistRedSandOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                    temperatureBlacklistRedSandOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                    isBiomeWhitelistRedSandOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                    biomeBlacklistRedSandOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpRedSandOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpRedSandOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.SANDSTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.SANDSTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableSandstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeSandstoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getSurfaceFactor()), 0, 65536);
                        veinsPerChunkSandstoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getSurfaceFactor()), 0, 65536);
                        minHeightSandstoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightSandstoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                        isTempWhitelistSandstoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistSandstoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistSandstoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistSandstoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpSandstoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpSandstoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.RED_SANDSTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.RED_SANDSTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableRedSandstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeRedSandstoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getSurfaceFactor()), 0, 65536);
                        veinsPerChunkRedSandstoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getSurfaceFactor()), 0, 65536);
                        minHeightRedSandstoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightRedSandstoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                        isTempWhitelistRedSandstoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistRedSandstoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistRedSandstoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistRedSandstoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpRedSandstoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpRedSandstoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.GRAVEL, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.GRAVEL, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableGravelOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeGravelOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getSurfaceFactor()), 0, 65536);
                        veinsPerChunkGravelOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getSurfaceFactor()), 0, 65536);
                        minHeightGravelOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightGravelOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                        isTempWhitelistGravelOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistGravelOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistGravelOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistGravelOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpGravelOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpGravelOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.BLUE_ICE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.BLUE_ICE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableBlueIceOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeBlueIceOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getSurfaceFactor()), 0, 65536);
                        veinsPerChunkBlueIceOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getSurfaceFactor()), 0, 65536);
                        minHeightBlueIceOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightBlueIceOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                        isTempWhitelistBlueIceOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistBlueIceOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistBlueIceOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistBlueIceOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpBlueIceOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpBlueIceOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.PACKED_ICE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.PACKED_ICE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enablePackedIceOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizePackedIceOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getSurfaceFactor()), 0, 65536);
                        veinsPerChunkPackedIceOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getSurfaceFactor()), 0, 65536);
                        minHeightPackedIceOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightPackedIceOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                        isTempWhitelistPackedIceOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistPackedIceOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistPackedIceOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistPackedIceOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpPackedIceOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpPackedIceOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.BEDROCK, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.BEDROCK, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableBedrockOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeBedrockOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), 1, 0, 65536);
                        veinsPerChunkBedrockOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), 4, 0, 65536);
                        minHeightBedrockOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), 0, 0, 256);
                        maxHeightBedrockOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), 128, 0, 256);
                        isTempWhitelistBedrockOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistBedrockOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistBedrockOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistBedrockOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        resistanceBedrockOre = BUILDER.comment(CommentHandler.getResistanceComment()).defineInRange(PathHandler.getResistancePath(), 9.0, 0.0, 3600000.0);
                        if(oType.equals(OreTypes.XP)) {
                            minXpBedrockOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                            maxXpBedrockOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        }
                    BUILDER.pop();
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Quark Stone Variants").push(PathHandler.getModNamePath(VariantsModId.QUARK));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.QUARK_BASALT, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.QUARK_BASALT, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableQuarkBasaltOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeQuarkBasaltOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getNetherFactor()), 0, 65536);
                        veinsPerChunkQuarkBasaltOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getNetherFactor()), 0, 65536);
                        minHeightQuarkBasaltOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), Math.max(128 - cType.getMaxY(), 0), 0, 256);
                        maxHeightQuarkBasaltOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), Math.max(128 - cType.getMinY(), 0), 0, 256);
                        isTempWhitelistQuarkBasaltOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistQuarkBasaltOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistQuarkBasaltOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistQuarkBasaltOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpQuarkBasaltOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpQuarkBasaltOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.QUARK_LIMESTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.QUARK_LIMESTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableQuarkLimestoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeQuarkLimestoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkQuarkLimestoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightQuarkLimestoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightQuarkLimestoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistQuarkLimestoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistQuarkLimestoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistQuarkLimestoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistQuarkLimestoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpQuarkLimestoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpQuarkLimestoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.QUARK_JASPER, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.QUARK_JASPER, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableQuarkJasperOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeQuarkJasperOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkQuarkJasperOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightQuarkJasperOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightQuarkJasperOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistQuarkJasperOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistQuarkJasperOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistQuarkJasperOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistQuarkJasperOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpQuarkJasperOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpQuarkJasperOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.QUARK_MARBLE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.QUARK_MARBLE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableQuarkMarbleOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeQuarkMarbleOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkQuarkMarbleOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightQuarkMarbleOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightQuarkMarbleOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistQuarkMarbleOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistQuarkMarbleOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistQuarkMarbleOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistQuarkMarbleOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpQuarkMarbleOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpQuarkMarbleOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.QUARK_SLATE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.QUARK_SLATE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableQuarkSlateOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeQuarkSlateOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkQuarkSlateOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightQuarkSlateOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightQuarkSlateOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistQuarkSlateOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistQuarkSlateOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistQuarkSlateOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistQuarkSlateOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpQuarkSlateOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpQuarkSlateOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Embellishcraft Stone Variants").push(PathHandler.getModNamePath(VariantsModId.EMBELLISHCRAFT));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.EMBELLISHCRAFT_BASALT, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.EMBELLISHCRAFT_BASALT, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.EMBELLISHCRAFT_GNEISS, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.EMBELLISHCRAFT_GNEISS, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.EMBELLISHCRAFT_JADE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.EMBELLISHCRAFT_JADE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.EMBELLISHCRAFT_LARVIKITE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.EMBELLISHCRAFT_LARVIKITE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.EMBELLISHCRAFT_MARBLE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.EMBELLISHCRAFT_MARBLE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.EMBELLISHCRAFT_SLATE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.EMBELLISHCRAFT_SLATE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Mystical Agriculture Stone Variants").push(PathHandler.getModNamePath(VariantsModId.MYSTICALAGRICULTURE));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.MYSTICALAGRICULTURE_SOULSTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.MYSTICALAGRICULTURE_SOULSTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("The Midnight Stone Variants").push(PathHandler.getModNamePath(VariantsModId.MIDNIGHT));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.MIDNIGHT_NIGHTSTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.MIDNIGHT_NIGHTSTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableMidnightNightstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeMidnightNightstoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkMidnightNightstoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightMidnightNightstoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightMidnightNightstoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistMidnightNightstoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistMidnightNightstoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistMidnightNightstoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistMidnightNightstoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpMidnightNightstoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpMidnightNightstoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Danny's Ores Stone Variants").push(PathHandler.getModNamePath(VariantsModId.DANNYS_ORES));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.HARDENED_STONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.HARDENED_STONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        enableHardenedStoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getEnableVariantPath(), true);
                        veinSizeHardenedStoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkHardenedStoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightHardenedStoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightHardenedStoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistHardenedStoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistHardenedStoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistHardenedStoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistHardenedStoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpHardenedStoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpHardenedStoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
        BUILDER.pop();

        spec = BUILDER.build();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, path + "/" + oType.getName() + ".toml");

        return spec;
    }

    /**
     * Getter method.
     *
     * @return ForgeConfigSpec containing all config values and their unambiguously paths.
     */
    public ForgeConfigSpec getSpec() {
        return spec;
    }
}
