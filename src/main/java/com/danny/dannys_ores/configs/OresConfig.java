package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.util.*;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

import java.util.ArrayList;
import java.util.List;

public class OresConfig {
    private ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    private ForgeConfigSpec spec;

    /**
     * An object of this class represents a config file for all stone variants
     * of an ore type + richness type combination. E.g. 'dense lapis ore' or 'normal copper ore'.
     *
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

        ForgeConfigSpec.BooleanValue disableStoneOre;
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

        ForgeConfigSpec.BooleanValue disableAndesiteOre;
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

        ForgeConfigSpec.BooleanValue disableDioriteOre;
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

        ForgeConfigSpec.BooleanValue disableGraniteOre;
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

        ForgeConfigSpec.BooleanValue disableNetherrackOre;
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

        ForgeConfigSpec.BooleanValue disableEndStoneOre;
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

        ForgeConfigSpec.BooleanValue disableSandOre;
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

        ForgeConfigSpec.BooleanValue disableRedSandOre;
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

        ForgeConfigSpec.BooleanValue disableSandstoneOre;
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

        ForgeConfigSpec.BooleanValue disableRedSandstoneOre;
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

        ForgeConfigSpec.BooleanValue disableGravelOre;
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

        ForgeConfigSpec.BooleanValue disableBlueIceOre;
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

        ForgeConfigSpec.BooleanValue disablePackedIceOre;
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

        ForgeConfigSpec.BooleanValue disableBedrockOre;
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

        ForgeConfigSpec.BooleanValue disableQuarkBasaltOre;
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

        ForgeConfigSpec.BooleanValue disableQuarkLimestoneOre;
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

        ForgeConfigSpec.BooleanValue disableQuarkJasperOre;
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

        ForgeConfigSpec.BooleanValue disableQuarkMarbleOre;
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

        ForgeConfigSpec.BooleanValue disableQuarkSlateOre;
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

        ForgeConfigSpec.BooleanValue disableEmbellishcraftBasaltOre;
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

        ForgeConfigSpec.BooleanValue disableEmbellishcraftGneissOre;
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

        ForgeConfigSpec.BooleanValue disableEmbellishcraftJadeOre;
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

        ForgeConfigSpec.BooleanValue disableEmbellishcraftLarvikiteOre;
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

        ForgeConfigSpec.BooleanValue disableEmbellishcraftMarbleOre;
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

        ForgeConfigSpec.BooleanValue disableEmbellishcraftSlateOre;
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

        ForgeConfigSpec.BooleanValue disableMysticalagricultureSoulstoneOre;
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

        ForgeConfigSpec.BooleanValue disableMidnightNightstoneOre;
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

        ForgeConfigSpec.BooleanValue disableCreateDolomiteOre;
        ForgeConfigSpec.IntValue veinSizeCreateDolomiteOre;
        ForgeConfigSpec.IntValue veinsPerChunkCreateDolomiteOre;
        ForgeConfigSpec.IntValue minHeightCreateDolomiteOre;
        ForgeConfigSpec.IntValue maxHeightCreateDolomiteOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistCreateDolomiteOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistCreateDolomiteOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistCreateDolomiteOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistCreateDolomiteOre;
        ForgeConfigSpec.IntValue minXpCreateDolomiteOre;
        ForgeConfigSpec.IntValue maxXpCreateDolomiteOre;

        ForgeConfigSpec.BooleanValue disableCreateGabbroOre;
        ForgeConfigSpec.IntValue veinSizeCreateGabbroOre;
        ForgeConfigSpec.IntValue veinsPerChunkCreateGabbroOre;
        ForgeConfigSpec.IntValue minHeightCreateGabbroOre;
        ForgeConfigSpec.IntValue maxHeightCreateGabbroOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistCreateGabbroOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistCreateGabbroOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistCreateGabbroOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistCreateGabbroOre;
        ForgeConfigSpec.IntValue minXpCreateGabbroOre;
        ForgeConfigSpec.IntValue maxXpCreateGabbroOre;

        ForgeConfigSpec.BooleanValue disableCreateLimestoneOre;
        ForgeConfigSpec.IntValue veinSizeCreateLimestoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkCreateLimestoneOre;
        ForgeConfigSpec.IntValue minHeightCreateLimestoneOre;
        ForgeConfigSpec.IntValue maxHeightCreateLimestoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistCreateLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistCreateLimestoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistCreateLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistCreateLimestoneOre;
        ForgeConfigSpec.IntValue minXpCreateLimestoneOre;
        ForgeConfigSpec.IntValue maxXpCreateLimestoneOre;

        ForgeConfigSpec.BooleanValue disableCreateScoriaOre;
        ForgeConfigSpec.IntValue veinSizeCreateScoriaOre;
        ForgeConfigSpec.IntValue veinsPerChunkCreateScoriaOre;
        ForgeConfigSpec.IntValue minHeightCreateScoriaOre;
        ForgeConfigSpec.IntValue maxHeightCreateScoriaOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistCreateScoriaOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistCreateScoriaOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistCreateScoriaOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistCreateScoriaOre;
        ForgeConfigSpec.IntValue minXpCreateScoriaOre;
        ForgeConfigSpec.IntValue maxXpCreateScoriaOre;

        ForgeConfigSpec.BooleanValue disableCreateWeatheredLimestoneOre;
        ForgeConfigSpec.IntValue veinSizeCreateWeatheredLimestoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkCreateWeatheredLimestoneOre;
        ForgeConfigSpec.IntValue minHeightCreateWeatheredLimestoneOre;
        ForgeConfigSpec.IntValue maxHeightCreateWeatheredLimestoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistCreateWeatheredLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistCreateWeatheredLimestoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistCreateWeatheredLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistCreateWeatheredLimestoneOre;
        ForgeConfigSpec.IntValue minXpCreateWeatheredLimestoneOre;
        ForgeConfigSpec.IntValue maxXpCreateWeatheredLimestoneOre;

        ForgeConfigSpec.BooleanValue disableNethercraftHeatSandOre;
        ForgeConfigSpec.IntValue veinSizeNethercraftHeatSandOre;
        ForgeConfigSpec.IntValue veinsPerChunkNethercraftHeatSandOre;
        ForgeConfigSpec.IntValue minHeightNethercraftHeatSandOre;
        ForgeConfigSpec.IntValue maxHeightNethercraftHeatSandOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistNethercraftHeatSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistNethercraftHeatSandOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistNethercraftHeatSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistNethercraftHeatSandOre;
        ForgeConfigSpec.IntValue minXpNethercraftHeatSandOre;
        ForgeConfigSpec.IntValue maxXpNethercraftHeatSandOre;

        ForgeConfigSpec.BooleanValue disableAtumStrangeSandOre;
        ForgeConfigSpec.IntValue veinSizeAtumStrangeSandOre;
        ForgeConfigSpec.IntValue veinsPerChunkAtumStrangeSandOre;
        ForgeConfigSpec.IntValue minHeightAtumStrangeSandOre;
        ForgeConfigSpec.IntValue maxHeightAtumStrangeSandOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAtumStrangeSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAtumStrangeSandOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAtumStrangeSandOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAtumStrangeSandOre;
        ForgeConfigSpec.IntValue minXpAtumStrangeSandOre;
        ForgeConfigSpec.IntValue maxXpAtumStrangeSandOre;

        ForgeConfigSpec.BooleanValue disableAtumLimestoneOre;
        ForgeConfigSpec.IntValue veinSizeAtumLimestoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkAtumLimestoneOre;
        ForgeConfigSpec.IntValue minHeightAtumLimestoneOre;
        ForgeConfigSpec.IntValue maxHeightAtumLimestoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAtumLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAtumLimestoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAtumLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAtumLimestoneOre;
        ForgeConfigSpec.IntValue minXpAtumLimestoneOre;
        ForgeConfigSpec.IntValue maxXpAtumLimestoneOre;

        ForgeConfigSpec.BooleanValue disableAtumCrackedLimestoneOre;
        ForgeConfigSpec.IntValue veinSizeAtumCrackedLimestoneOre;
        ForgeConfigSpec.IntValue veinsPerChunkAtumCrackedLimestoneOre;
        ForgeConfigSpec.IntValue minHeightAtumCrackedLimestoneOre;
        ForgeConfigSpec.IntValue maxHeightAtumCrackedLimestoneOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAtumCrackedLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAtumCrackedLimestoneOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAtumCrackedLimestoneOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAtumCrackedLimestoneOre;
        ForgeConfigSpec.IntValue minXpAtumCrackedLimestoneOre;
        ForgeConfigSpec.IntValue maxXpAtumCrackedLimestoneOre;

        ForgeConfigSpec.BooleanValue disableAtumLimestoneGravelOre;
        ForgeConfigSpec.IntValue veinSizeAtumLimestoneGravelOre;
        ForgeConfigSpec.IntValue veinsPerChunkAtumLimestoneGravelOre;
        ForgeConfigSpec.IntValue minHeightAtumLimestoneGravelOre;
        ForgeConfigSpec.IntValue maxHeightAtumLimestoneGravelOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAtumLimestoneGravelOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAtumLimestoneGravelOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAtumLimestoneGravelOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAtumLimestoneGravelOre;
        ForgeConfigSpec.IntValue minXpAtumLimestoneGravelOre;
        ForgeConfigSpec.IntValue maxXpAtumLimestoneGravelOre;

        ForgeConfigSpec.BooleanValue disableAtumAlabasterOre;
        ForgeConfigSpec.IntValue veinSizeAtumAlabasterOre;
        ForgeConfigSpec.IntValue veinsPerChunkAtumAlabasterOre;
        ForgeConfigSpec.IntValue minHeightAtumAlabasterOre;
        ForgeConfigSpec.IntValue maxHeightAtumAlabasterOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAtumAlabasterOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAtumAlabasterOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAtumAlabasterOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAtumAlabasterOre;
        ForgeConfigSpec.IntValue minXpAtumAlabasterOre;
        ForgeConfigSpec.IntValue maxXpAtumAlabasterOre;

        ForgeConfigSpec.BooleanValue disableAtumPorphyryOre;
        ForgeConfigSpec.IntValue veinSizeAtumPorphyryOre;
        ForgeConfigSpec.IntValue veinsPerChunkAtumPorphyryOre;
        ForgeConfigSpec.IntValue minHeightAtumPorphyryOre;
        ForgeConfigSpec.IntValue maxHeightAtumPorphyryOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAtumPorphyryOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAtumPorphyryOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAtumPorphyryOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAtumPorphyryOre;
        ForgeConfigSpec.IntValue minXpAtumPorphyryOre;
        ForgeConfigSpec.IntValue maxXpAtumPorphyryOre;

        ForgeConfigSpec.BooleanValue disableAtumMarlOre;
        ForgeConfigSpec.IntValue veinSizeAtumMarlOre;
        ForgeConfigSpec.IntValue veinsPerChunkAtumMarlOre;
        ForgeConfigSpec.IntValue minHeightAtumMarlOre;
        ForgeConfigSpec.IntValue maxHeightAtumMarlOre;
        ForgeConfigSpec.BooleanValue isTempWhitelistAtumMarlOre;
        ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistAtumMarlOre;
        ForgeConfigSpec.BooleanValue isBiomeWhitelistAtumMarlOre;
        ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAtumMarlOre;
        ForgeConfigSpec.IntValue minXpAtumMarlOre;
        ForgeConfigSpec.IntValue maxXpAtumMarlOre;

        ForgeConfigSpec.BooleanValue disableHardenedStoneOre;
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
                        disableStoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableAndesiteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableDioriteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableGraniteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableNetherrackOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeNetherrackOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getNetherFactor()), 0, 65536);
                        veinsPerChunkNetherrackOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getNetherFactor()), 0, 65536);
                        minHeightNetherrackOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), Math.max(96 - cType.getMaxY(), 0), 0, 256);
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
                        disableEndStoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableSandOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                    disableRedSandOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableSandstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableRedSandstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableGravelOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableBlueIceOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disablePackedIceOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableBedrockOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableQuarkBasaltOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeQuarkBasaltOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getNetherFactor()), 0, 65536);
                        veinsPerChunkQuarkBasaltOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getNetherFactor()), 0, 65536);
                        minHeightQuarkBasaltOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), Math.max(96 - cType.getMaxY(), 0), 0, 256);
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
                        disableQuarkLimestoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableQuarkJasperOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableQuarkMarbleOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableQuarkSlateOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableEmbellishcraftBasaltOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableEmbellishcraftGneissOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableEmbellishcraftJadeOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableEmbellishcraftLarvikiteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableEmbellishcraftMarbleOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableEmbellishcraftSlateOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
            BUILDER.comment("Create Stone Variants").push(PathHandler.getModNamePath(VariantsModId.CREATE));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.CREATE_DOLOMITE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.CREATE_DOLOMITE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableCreateDolomiteOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeCreateDolomiteOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkCreateDolomiteOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightCreateDolomiteOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightCreateDolomiteOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistCreateDolomiteOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistCreateDolomiteOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistCreateDolomiteOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistCreateDolomiteOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpCreateDolomiteOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpCreateDolomiteOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.CREATE_GABBRO, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.CREATE_GABBRO, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableCreateGabbroOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeCreateGabbroOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkCreateGabbroOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightCreateGabbroOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightCreateGabbroOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistCreateGabbroOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistCreateGabbroOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistCreateGabbroOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistCreateGabbroOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpCreateGabbroOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpCreateGabbroOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.CREATE_LIMESTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.CREATE_LIMESTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableCreateLimestoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeCreateLimestoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkCreateLimestoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightCreateLimestoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightCreateLimestoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistCreateLimestoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistCreateLimestoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistCreateLimestoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistCreateLimestoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpCreateLimestoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpCreateLimestoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.CREATE_SCORIA, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.CREATE_SCORIA, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableCreateScoriaOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeCreateScoriaOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkCreateScoriaOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightCreateScoriaOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightCreateScoriaOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistCreateScoriaOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistCreateScoriaOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistCreateScoriaOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistCreateScoriaOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpCreateScoriaOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpCreateScoriaOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.CREATE_WEATHERED_LIMESTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.CREATE_WEATHERED_LIMESTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpCreateWeatheredLimestoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Mystical Agriculture Stone Variants").push(PathHandler.getModNamePath(VariantsModId.MYSTICALAGRICULTURE));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.MYSTICALAGRICULTURE_SOULSTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.MYSTICALAGRICULTURE_SOULSTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableMysticalagricultureSoulstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
                        disableMidnightNightstoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
            BUILDER.comment("The Nethercraft Stone Variants").push(PathHandler.getModNamePath(VariantsModId.NETHERCRAFT));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.NETHERCRAFT_HEATSAND, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.NETHERCRAFT_HEATSAND, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(cType.getNetherFactor()), 0, 65536);
                        veinsPerChunkNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(cType.getNetherFactor()), 0, 65536);
                        minHeightNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(),  Math.max(96 - cType.getMaxY(), 0), 0, 256);
                        maxHeightNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), Math.max(128 - cType.getMinY(), 0), 0, 256);
                        isTempWhitelistNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpNethercraftHeatSandOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Atum 2 Stone Variants").push(PathHandler.getModNamePath(VariantsModId.ATUM));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ATUM_STRANGE_SAND, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ATUM_STRANGE_SAND, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableAtumStrangeSandOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeAtumStrangeSandOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAtumStrangeSandOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAtumStrangeSandOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAtumStrangeSandOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAtumStrangeSandOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAtumStrangeSandOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAtumStrangeSandOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAtumStrangeSandOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAtumStrangeSandOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAtumStrangeSandOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ATUM_LIMESTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ATUM_LIMESTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableAtumLimestoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeAtumLimestoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAtumLimestoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAtumLimestoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAtumLimestoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAtumLimestoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAtumLimestoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAtumLimestoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAtumLimestoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAtumLimestoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAtumLimestoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ATUM_CRACKED_LIMESTONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ATUM_CRACKED_LIMESTONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAtumCrackedLimestoneOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ATUM_LIMESTONE_GRAVEL, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ATUM_LIMESTONE_GRAVEL, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAtumLimestoneGravelOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ATUM_ALABASTER, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ATUM_ALABASTER, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableAtumAlabasterOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeAtumAlabasterOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAtumAlabasterOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAtumAlabasterOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAtumAlabasterOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAtumAlabasterOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAtumAlabasterOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAtumAlabasterOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAtumAlabasterOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAtumAlabasterOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAtumAlabasterOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ATUM_PORPHYRY, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ATUM_PORPHYRY, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableAtumPorphyryOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeAtumPorphyryOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAtumPorphyryOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAtumPorphyryOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAtumPorphyryOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAtumPorphyryOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAtumPorphyryOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAtumPorphyryOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAtumPorphyryOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAtumPorphyryOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAtumPorphyryOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.ATUM_MARL, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.ATUM_MARL, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableAtumMarlOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
                        veinSizeAtumMarlOre = BUILDER.comment(CommentHandler.getVeinSizeComment()).defineInRange(PathHandler.getVeinSizePath(), cType.getVeinSize(), 0, 65536);
                        veinsPerChunkAtumMarlOre = BUILDER.comment(CommentHandler.getVeinsPerChunkComment()).defineInRange(PathHandler.getVeinsPerChunkPath(), cType.getVeinsPerChunk(), 0, 65536);
                        minHeightAtumMarlOre = BUILDER.comment(CommentHandler.getMinHeightComment()).defineInRange(PathHandler.getMinHeightPath(), cType.getMinY(), 0, 256);
                        maxHeightAtumMarlOre = BUILDER.comment(CommentHandler.getMaxHeightComment()).defineInRange(PathHandler.getMaxHeightPath(), cType.getMaxY(), 0, 256);
                        isTempWhitelistAtumMarlOre = BUILDER.comment(CommentHandler.getIsTempWhitelistComment()).define(PathHandler.getIsTempWhitelistPath(), false);
                        temperatureBlacklistAtumMarlOre = BUILDER.comment(CommentHandler.getTemperatureBlacklistComment()).define(PathHandler.getTemperatureBlacklistPath(), new ArrayList<String>());
                        isBiomeWhitelistAtumMarlOre = BUILDER.comment(CommentHandler.getIsBiomeWhitelistComment()).define(PathHandler.getIsBiomeWhitelistPath(), false);
                        biomeBlacklistAtumMarlOre = BUILDER.comment(CommentHandler.getBiomeBlacklistComment()).define(PathHandler.getBiomeBlacklistPath(), new ArrayList<String>());
                    BUILDER.pop();
                    if(oType.equals(OreTypes.XP)) {
                        BUILDER.comment(CommentHandler.getPropertiesComment()).push(PathHandler.getPropertiesPath());
                        minXpAtumMarlOre = BUILDER.comment(CommentHandler.getMinXpDropComment()).defineInRange(PathHandler.getMinXpDropPath(), 20, 0, 1000000);
                        maxXpAtumMarlOre = BUILDER.comment(CommentHandler.getMaxXpDropComment()).defineInRange(PathHandler.getMaxXpDropPath(), 50, 0, 1000000);
                        BUILDER.pop();
                    }
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Danny's Ores Stone Variants").push(PathHandler.getModNamePath(VariantsModId.DANNYS_ORES));
                BUILDER.comment(CommentHandler.getBlockNameComment(StoneVariants.HARDENED_STONE, rType, oType)).push(PathHandler.getBlockNamePath(StoneVariants.HARDENED_STONE, rType, oType));
                    BUILDER.comment(CommentHandler.getGenerationComment()).push(PathHandler.getGenerationPath());
                        disableHardenedStoneOre = BUILDER.comment(CommentHandler.getEnableVariantComment()).define(PathHandler.getDisableVariantPath(), false);
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
