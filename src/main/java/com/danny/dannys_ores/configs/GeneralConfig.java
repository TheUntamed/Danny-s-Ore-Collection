package com.danny.dannys_ores.configs;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class GeneralConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec spec;

    public static ForgeConfigSpec.BooleanValue enableConfigChecker;

    //Normal
    // Vanilla
    public static ForgeConfigSpec.BooleanValue disableStoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAndesiteNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableDioriteNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGraniteNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherrackNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEndStoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGravelNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandstoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandstoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBlueIceNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disablePackedIceNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBedrockNormalOreGeneration;

    // Danny's Ores
    public static ForgeConfigSpec.BooleanValue disableHardenedStoneNormalOreGeneration;

    // Quark
    public static ForgeConfigSpec.BooleanValue disableQuarkBasaltNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkLimestoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkJasperNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkMarbleNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkSlateNormalOreGeneration;

    // Embellishcraft
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftBasaltNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftGneissNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftJadeNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftLarvikiteNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftMarbleNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftSlateNormalOreGeneration;

    // Create
    public static ForgeConfigSpec.BooleanValue disableCreateDarkScoriaNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateDolomiteNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateGabbroNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateLimestoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateScoriaNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateWeatheredLimestoneNormalOreGeneration;

    // Nethercraft
    public static ForgeConfigSpec.BooleanValue disableNethercraftHeatSandNormalOreGeneration;

    // Midnight
    public static ForgeConfigSpec.BooleanValue disableMidnightNightstoneNormalOreGeneration;

    // Mystical Agriculture
    public static ForgeConfigSpec.BooleanValue disableMysticalagricultureSoulstoneNormalOreGeneration;

    //Dense
    // Vanilla
    public static ForgeConfigSpec.BooleanValue disableStoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAndesiteDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableDioriteDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGraniteDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherrackDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEndStoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGravelDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandstoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandstoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBlueIceDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disablePackedIceDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBedrockDenseOreGeneration;

    // Danny's Ores
    public static ForgeConfigSpec.BooleanValue disableHardenedStoneDenseOreGeneration;

    // Quark
    public static ForgeConfigSpec.BooleanValue disableQuarkBasaltDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkLimestoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkJasperDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkMarbleDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkSlateDenseOreGeneration;

    // Embellishcraft
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftBasaltDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftGneissDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftJadeDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftLarvikiteDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftMarbleDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftSlateDenseOreGeneration;

    // Create
    public static ForgeConfigSpec.BooleanValue disableCreateDarkScoriaDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateDolomiteDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateGabbroDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateLimestoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateScoriaDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateWeatheredLimestoneDenseOreGeneration;

    // Nethercraft
    public static ForgeConfigSpec.BooleanValue disableNethercraftHeatSandDenseOreGeneration;

    // Midnight
    public static ForgeConfigSpec.BooleanValue disableMidnightNightstoneDenseOreGeneration;

    // Mystical Agriculture
    public static ForgeConfigSpec.BooleanValue disableMysticalagricultureSoulstoneDenseOreGeneration;

    //Poor
    // Vanilla
    public static ForgeConfigSpec.BooleanValue disableStonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAndesitePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableDioritePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGranitePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherrackPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEndStonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGravelPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandstonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandstonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBlueIcePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disablePackedIcePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBedrockPoorOreGeneration;

    // Danny's Ores
    public static ForgeConfigSpec.BooleanValue disableHardenedStonePoorOreGeneration;

    // Quark
    public static ForgeConfigSpec.BooleanValue disableQuarkBasaltPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkLimestonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkJasperPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkMarblePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkSlatePoorOreGeneration;

    // Embellishcraft
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftBasaltPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftGneissPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftJadePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftLarvikitePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftMarblePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftSlatePoorOreGeneration;

    // Create
    public static ForgeConfigSpec.BooleanValue disableCreateDarkScoriaPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateDolomitePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateGabbroPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateLimestonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateScoriaPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableCreateWeatheredLimestonePoorOreGeneration;

    // Nethercraft
    public static ForgeConfigSpec.BooleanValue disableNethercraftHeatSandPoorOreGeneration;

    // Midnight
    public static ForgeConfigSpec.BooleanValue disableMidnightNightstonePoorOreGeneration;

    // Mystical Agriculture
    public static ForgeConfigSpec.BooleanValue disableMysticalagricultureSoulstonePoorOreGeneration;

    public static ForgeConfigSpec.BooleanValue disableNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disablePoorOreGeneration;

    public static ForgeConfigSpec.BooleanValue enableCustomVanillaOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherOverworldOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherNetherOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherEndOreGeneration;
    public static ForgeConfigSpec.BooleanValue removeVanillaOverworldOreGeneration;
    public static ForgeConfigSpec.BooleanValue removeVanillaNetherOreGeneration;
    public static ForgeConfigSpec.BooleanValue replaceBedrockOreWithBedrockOnExplosion;

    static {
        // = BUILDER.comment("").define("", false);
        BUILDER.comment(CommentHandler.getGeneralComment()).push(PathHandler.getGeneralPath());
            enableConfigChecker = BUILDER.comment("Checks your blacklists and whitelists for correct syntax. If something is wrong it will be printed to the log.").define("enableConfigChecker", false);
            BUILDER.comment("Settings that affect all normal ores. Normal means all ores that are not poor or dense.").push("normal");
                disableNormalOreGeneration = BUILDER.comment("If true, all normal ores will be disabled.").define(PathHandler.getDisableAllVariantsPath(), false);
                BUILDER.comment("Disable all normal ores of a certain stone variant (only affects ores of this mod). For Vanilla and other mods' ores see 'vanilla_and_other_mods' settings in this file.").push(PathHandler.getStoneVariantsPath());
                    BUILDER.comment("Vanilla stone variants").push("minecraft");
                        disableStoneNormalOreGeneration = BUILDER.comment("If true, the Stone variant of all normal ores (except vanilla ores) will be disabled.").define("stone", false);
                        disableAndesiteNormalOreGeneration = BUILDER.comment("If true, the Andesite variant of all normal ores will be disabled.").define("andesite", false);
                        disableDioriteNormalOreGeneration = BUILDER.comment("If true, the Diorite variant of all normal ores will be disabled.").define("diorite", false);
                        disableGraniteNormalOreGeneration = BUILDER.comment("If true, the Granite variant of all normal ores will be disabled.").define("granite", false);
                        disableNetherrackNormalOreGeneration = BUILDER.comment("If true, the Netherrack variant of all normal ores (except vanilla ores) will be disabled.").define("netherrack", false);
                        disableEndStoneNormalOreGeneration = BUILDER.comment("If true, the End Stone variant of all normal ores will be disabled.").define("end_stone", false);
                        disableSandNormalOreGeneration = BUILDER.comment("If true, the Sand variant of all normal ores will be disabled.").define("sand", false);
                        disableRedSandNormalOreGeneration = BUILDER.comment("If true, the Red Sand variant of all normal ores will be disabled.").define("red_sand", false);
                        disableGravelNormalOreGeneration = BUILDER.comment("If true, the Gravel variant of all normal ores will be disabled.").define("gravel", false);
                        disableSandstoneNormalOreGeneration = BUILDER.comment("If true, the Sandstone variant of all normal ores will be disabled.").define("sandstone", false);
                        disableRedSandstoneNormalOreGeneration = BUILDER.comment("If true, the Red Sandstone variant of all normal ores will be disabled.").define("red_sandstone", false);
                        disableBlueIceNormalOreGeneration = BUILDER.comment("If true, the Blue Ice variant of all normal ores (except vanilla ores) will be disabled.").define("blue_ice", false);
                        disablePackedIceNormalOreGeneration = BUILDER.comment("If true, the Packed Ice variant of all normal ores (except vanilla ores) will be disabled.").define("packed_ice", false);
                        disableBedrockNormalOreGeneration = BUILDER.comment("If true, the Bedrock variant of all normal ores (except vanilla ores) will be disabled.").define("bedrock", false);
                    BUILDER.pop();
                    BUILDER.comment("Stone variants added by this mod.").push("dannys_ores");
                        disableHardenedStoneNormalOreGeneration = BUILDER.comment("If true, the Hardened Stone variant of all normal ores (except vanilla ores) will be disabled.").define("hardened_stone", false);
                    BUILDER.pop();
                    BUILDER.comment("Quark stone variants. Quark has to be installed for the ores to generate at all.").push("quark");
                        disableQuarkBasaltNormalOreGeneration = BUILDER.comment("If true, the (Quark) Basalt variant of all normal ores will be disabled.").define("basalt", false);
                        disableQuarkLimestoneNormalOreGeneration = BUILDER.comment("If true, the (Quark) Limestone variant of all normal ores will be disabled.").define("limestone", false);
                        disableQuarkJasperNormalOreGeneration = BUILDER.comment("If true, the (Quark) Jasper variant of all normal ores will be disabled.").define("jasper", false);
                        disableQuarkMarbleNormalOreGeneration = BUILDER.comment("If true, the (Quark) Marble variant of all normal ores will be disabled.").define("marble", false);
                        disableQuarkSlateNormalOreGeneration = BUILDER.comment("If true, the (Quark) Slate variant of all normal ores will be disabled.").define("slate", false);
                    BUILDER.pop();
                    BUILDER.comment("Embellishcraft stone variants. Embellishcraft has to be installed for the ores to generate at all.").push("embellishcraft");
                        disableEmbellishcraftBasaltNormalOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Basalt variant of all normal ores will be disabled.").define("basalt", false);
                        disableEmbellishcraftGneissNormalOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Gneiss variant of all normal ores will be disabled.").define("gneiss", false);
                        disableEmbellishcraftJadeNormalOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Jade variant of all normal ores will be disabled.").define("jade", false);
                        disableEmbellishcraftLarvikiteNormalOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Larvikite variant of all normal ores will be disabled.").define("larvikite", false);
                        disableEmbellishcraftMarbleNormalOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Marble variant of all normal ores will be disabled.").define("marble", false);
                        disableEmbellishcraftSlateNormalOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Slate variant of all normal ores will be disabled.").define("slate", false);
                    BUILDER.pop();
                    BUILDER.comment("Create stone variants. Create has to be installed for the ores to generate at all.").push("create");
                        disableCreateDarkScoriaNormalOreGeneration = BUILDER.comment("If true, the (Create) Basalt variant of all normal ores will be disabled.").define("dark_scoria", false);
                        disableCreateDolomiteNormalOreGeneration = BUILDER.comment("If true, the (Create) Gneiss variant of all normal ores will be disabled.").define("dolomite", false);
                        disableCreateGabbroNormalOreGeneration = BUILDER.comment("If true, the (Create) Jade variant of all normal ores will be disabled.").define("gabbro", false);
                        disableCreateLimestoneNormalOreGeneration = BUILDER.comment("If true, the (Create) Larvikite variant of all normal ores will be disabled.").define("limestone", false);
                        disableCreateScoriaNormalOreGeneration = BUILDER.comment("If true, the (Create) Marble variant of all normal ores will be disabled.").define("scoria", false);
                        disableCreateWeatheredLimestoneNormalOreGeneration = BUILDER.comment("If true, the (Create) Slate variant of all normal ores will be disabled.").define("weathered_limestone", false);
                    BUILDER.pop();
                    BUILDER.comment("Midnight stone variants. Midnight has to be installed for the ores to generate at all.").push("midnight");
                        disableMidnightNightstoneNormalOreGeneration = BUILDER.comment("If true, the (Midnight) Basalt variant of all normal ores will be disabled.").define("nightstone", false);
                    BUILDER.pop();
                    BUILDER.comment("Nethercraft stone variants. Nethercraft has to be installed for the ores to generate at all.").push("nethercraft");
                        disableNethercraftHeatSandNormalOreGeneration = BUILDER.comment("If true, the (Nethercraft) Basalt variant of all normal ores will be disabled.").define("heat_sand", false);
                    BUILDER.pop();
                    BUILDER.comment("Mystical Agriculture stone variants. Mystical Agriculture has to be installed for the ores to generate at all.").push("mysticalagriculture");
                        disableMysticalagricultureSoulstoneNormalOreGeneration = BUILDER.comment("If true, the (Mystical Agriculture) Basalt variant of all normal ores will be disabled.").define("soulstone", false);
                    BUILDER.pop();
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Settings that affect all dense ores.").push("dense");
                disableDenseOreGeneration = BUILDER.comment("If true, all dense ores will be disabled.").define(PathHandler.getDisableAllVariantsPath(), false);
                BUILDER.comment("Disable all dense ores of a certain stone variant (only affects ores of this mod).").push(PathHandler.getStoneVariantsPath());
                    BUILDER.comment("Vanilla stone variants").push("minecraft");
                        disableStoneDenseOreGeneration = BUILDER.comment("If true, the Stone variant of all dense ores (except vanilla ores) will be disabled.").define("stone", false);
                        disableAndesiteDenseOreGeneration = BUILDER.comment("If true, the Andesite variant of all dense ores will be disabled.").define("andesite", false);
                        disableDioriteDenseOreGeneration = BUILDER.comment("If true, the Diorite variant of all dense ores will be disabled.").define("diorite", false);
                        disableGraniteDenseOreGeneration = BUILDER.comment("If true, the Granite variant of all dense ores will be disabled.").define("granite", false);
                        disableNetherrackDenseOreGeneration = BUILDER.comment("If true, the Netherrack variant of all dense ores (except vanilla ores) will be disabled.").define("netherrack", false);
                        disableEndStoneDenseOreGeneration = BUILDER.comment("If true, the End Stone variant of all dense ores will be disabled.").define("end_stone", false);
                        disableSandDenseOreGeneration = BUILDER.comment("If true, the Sand variant of all dense ores will be disabled.").define("sand", false);
                        disableRedSandDenseOreGeneration = BUILDER.comment("If true, the Red Sand variant of all dense ores will be disabled.").define("red_sand", false);
                        disableGravelDenseOreGeneration = BUILDER.comment("If true, the Gravel variant of all dense ores will be disabled.").define("gravel", false);
                        disableSandstoneDenseOreGeneration = BUILDER.comment("If true, the Sandstone variant of all dense ores will be disabled.").define("sandstone", false);
                        disableRedSandstoneDenseOreGeneration = BUILDER.comment("If true, the Red Sandstone variant of all dense ores will be disabled.").define("red_sandstone", false);
                        disableBlueIceDenseOreGeneration = BUILDER.comment("If true, the Blue Ice variant of all dense ores (except vanilla ores) will be disabled.").define("blue_ice", false);
                        disablePackedIceDenseOreGeneration = BUILDER.comment("If true, the Packed Ice variant of all dense ores (except vanilla ores) will be disabled.").define("packed_ice", false);
                        disableBedrockDenseOreGeneration = BUILDER.comment("If true, the Bedrock variant of all dense ores (except vanilla ores) will be disabled.").define("bedrock", false);
                    BUILDER.pop();
                    BUILDER.comment("Stone variants added by this mod.").push("dannys_ores");
                        disableHardenedStoneDenseOreGeneration = BUILDER.comment("If true, the Hardened Stone variant of all dense ores (except vanilla ores) will be disabled.").define("hardened_stone", false);
                    BUILDER.pop();
                    BUILDER.comment("Quark stone variants. Quark has to be installed for the ores to generate at all.").push("quark");
                        disableQuarkBasaltDenseOreGeneration = BUILDER.comment("If true, the (Quark) Basalt variant of all dense ores will be disabled.").define("basalt", false);
                        disableQuarkLimestoneDenseOreGeneration = BUILDER.comment("If true, the (Quark) Limestone variant of all dense ores will be disabled.").define("limestone", false);
                        disableQuarkJasperDenseOreGeneration = BUILDER.comment("If true, the (Quark) Jasper variant of all dense ores will be disabled.").define("jasper", false);
                        disableQuarkMarbleDenseOreGeneration = BUILDER.comment("If true, the (Quark) Marble variant of all dense ores will be disabled.").define("marble", false);
                        disableQuarkSlateDenseOreGeneration = BUILDER.comment("If true, the (Quark) Slate variant of all dense ores will be disabled.").define("slate", false);
                    BUILDER.pop();
                    BUILDER.comment("Embellishcraft stone variants. Embellishcraft has to be installed for the ores to generate at all.").push("embellishcraft");
                        disableEmbellishcraftBasaltDenseOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Basalt variant of all dense ores will be disabled.").define("basalt", false);
                        disableEmbellishcraftGneissDenseOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Gneiss variant of all dense ores will be disabled.").define("gneiss", false);
                        disableEmbellishcraftJadeDenseOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Jade variant of all dense ores will be disabled.").define("jade", false);
                        disableEmbellishcraftLarvikiteDenseOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Larvikite variant of all dense ores will be disabled.").define("larvikite", false);
                        disableEmbellishcraftMarbleDenseOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Marble variant of all dense ores will be disabled.").define("marble", false);
                        disableEmbellishcraftSlateDenseOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Slate variant of all dense ores will be disabled.").define("slate", false);
                    BUILDER.pop();
                    BUILDER.comment("Create stone variants. Create has to be installed for the ores to generate at all.").push("create");
                        disableCreateDarkScoriaDenseOreGeneration = BUILDER.comment("If true, the (Create) Basalt variant of all normal ores will be disabled.").define("dark_scoria", false);
                        disableCreateDolomiteDenseOreGeneration = BUILDER.comment("If true, the (Create) Gneiss variant of all normal ores will be disabled.").define("dolomite", false);
                        disableCreateGabbroDenseOreGeneration = BUILDER.comment("If true, the (Create) Jade variant of all normal ores will be disabled.").define("gabbro", false);
                        disableCreateLimestoneDenseOreGeneration = BUILDER.comment("If true, the (Create) Larvikite variant of all normal ores will be disabled.").define("limestone", false);
                        disableCreateScoriaDenseOreGeneration = BUILDER.comment("If true, the (Create) Marble variant of all normal ores will be disabled.").define("scoria", false);
                        disableCreateWeatheredLimestoneDenseOreGeneration = BUILDER.comment("If true, the (Create) Slate variant of all normal ores will be disabled.").define("weathered_limestone", false);
                    BUILDER.pop();
                    BUILDER.comment("Midnight stone variants. Midnight has to be installed for the ores to generate at all.").push("midnight");
                        disableMidnightNightstoneDenseOreGeneration = BUILDER.comment("If true, the (Midnight) Basalt variant of all normal ores will be disabled.").define("nightstone", false);
                    BUILDER.pop();
                    BUILDER.comment("Nethercraft stone variants. Nethercraft has to be installed for the ores to generate at all.").push("nethercraft");
                        disableNethercraftHeatSandDenseOreGeneration = BUILDER.comment("If true, the (Nethercraft) Basalt variant of all normal ores will be disabled.").define("heat_sand", false);
                    BUILDER.pop();
                    BUILDER.comment("Mystical Agriculture stone variants. Mystical Agriculture has to be installed for the ores to generate at all.").push("mysticalagriculture");
                        disableMysticalagricultureSoulstoneDenseOreGeneration = BUILDER.comment("If true, the (Mystical Agriculture) Basalt variant of all normal ores will be disabled.").define("soulstone", false);
                    BUILDER.pop();
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Settings that affect all poor ores.").push("poor");
                disablePoorOreGeneration = BUILDER.comment("If true, all poor ores will be disabled.").define(PathHandler.getDisableAllVariantsPath(), false);
                BUILDER.comment("Disable all poor ores of a certain stone variant (only affects ores of this mod).").push(PathHandler.getStoneVariantsPath());
                    BUILDER.comment("Vanilla stone variants").push("minecraft");
                        disableStonePoorOreGeneration = BUILDER.comment("If true, the Stone variant of all poor ores (except vanilla ores) will be disabled.").define("stone", false);
                        disableAndesitePoorOreGeneration = BUILDER.comment("If true, the Andesite variant of all poor ores will be disabled.").define("andesite", false);
                        disableDioritePoorOreGeneration = BUILDER.comment("If true, the Diorite variant of all poor ores will be disabled.").define("diorite", false);
                        disableGranitePoorOreGeneration = BUILDER.comment("If true, the Granite variant of all poor ores will be disabled.").define("granite", false);
                        disableNetherrackPoorOreGeneration = BUILDER.comment("If true, the Netherrack variant of all poor ores (except vanilla ores) will be disabled.").define("netherrack", false);
                        disableEndStonePoorOreGeneration = BUILDER.comment("If true, the End Stone variant of all poor ores will be disabled.").define("end_stone", false);
                        disableSandPoorOreGeneration = BUILDER.comment("If true, the Sand variant of all poor ores will be disabled.").define("sand", false);
                        disableRedSandPoorOreGeneration = BUILDER.comment("If true, the Red Sand variant of all poor ores will be disabled.").define("red_sand", false);
                        disableGravelPoorOreGeneration = BUILDER.comment("If true, the Gravel variant of all poor ores will be disabled.").define("gravel", false);
                        disableSandstonePoorOreGeneration = BUILDER.comment("If true, the Sandstone variant of all poor ores will be disabled.").define("sandstone", false);
                        disableRedSandstonePoorOreGeneration = BUILDER.comment("If true, the Red Sandstone variant of all poor ores will be disabled.").define("red_sandstone", false);
                        disableBlueIcePoorOreGeneration = BUILDER.comment("If true, the Blue Ice variant of all poor ores (except vanilla ores) will be disabled.").define("blue_ice", false);
                        disablePackedIcePoorOreGeneration = BUILDER.comment("If true, the Packed Ice variant of all poor ores (except vanilla ores) will be disabled.").define("packed_ice", false);
                        disableBedrockPoorOreGeneration = BUILDER.comment("If true, the Bedrock variant of all poor ores (except vanilla ores) will be disabled.").define("bedrock", false);
                    BUILDER.pop();
                    BUILDER.comment("Stone variants added by this mod.").push("dannys_ores");
                        disableHardenedStonePoorOreGeneration = BUILDER.comment("If true, the Hardened Stone variant of all poor ores (except vanilla ores) will be disabled.").define("hardened_stone", false);
                    BUILDER.pop();
                    BUILDER.comment("Quark stone variants. Quark has to be installed for the ores to generate at all.").push("quark");
                        disableQuarkBasaltPoorOreGeneration = BUILDER.comment("If true, the (Quark) Basalt variant of all poor ores will be disabled.").define("basalt", false);
                        disableQuarkLimestonePoorOreGeneration = BUILDER.comment("If true, the (Quark) Limestone variant of all poor ores will be disabled.").define("limestone", false);
                        disableQuarkJasperPoorOreGeneration = BUILDER.comment("If true, the (Quark) Jasper variant of all poor ores will be disabled.").define("jasper", false);
                        disableQuarkMarblePoorOreGeneration = BUILDER.comment("If true, the (Quark) Marble variant of all poor ores will be disabled.").define("marble", false);
                        disableQuarkSlatePoorOreGeneration = BUILDER.comment("If true, the (Quark) Slate variant of all poor ores will be disabled.").define("slate", false);
                    BUILDER.pop();
                    BUILDER.comment("Embellishcraft stone variants. Embellishcraft has to be installed for the ores to generate at all.").push("embellishcraft");
                        disableEmbellishcraftBasaltPoorOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Basalt variant of all poor ores will be disabled.").define("basalt", false);
                        disableEmbellishcraftGneissPoorOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Gneiss variant of all poor ores will be disabled.").define("gneiss", false);
                        disableEmbellishcraftJadePoorOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Jade variant of all poor ores will be disabled.").define("jade", false);
                        disableEmbellishcraftLarvikitePoorOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Larvikite variant of all poor ores will be disabled.").define("larvikite", false);
                        disableEmbellishcraftMarblePoorOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Marble variant of all poor ores will be disabled.").define("marble", false);
                        disableEmbellishcraftSlatePoorOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Slate variant of all poor ores will be disabled.").define("slate", false);
                    BUILDER.pop();
                    BUILDER.comment("Create stone variants. Create has to be installed for the ores to generate at all.").push("create");
                        disableCreateDarkScoriaPoorOreGeneration = BUILDER.comment("If true, the (Create) Basalt variant of all normal ores will be disabled.").define("dark_scoria", false);
                        disableCreateDolomitePoorOreGeneration = BUILDER.comment("If true, the (Create) Gneiss variant of all normal ores will be disabled.").define("dolomite", false);
                        disableCreateGabbroPoorOreGeneration = BUILDER.comment("If true, the (Create) Jade variant of all normal ores will be disabled.").define("gabbro", false);
                        disableCreateLimestonePoorOreGeneration = BUILDER.comment("If true, the (Create) Larvikite variant of all normal ores will be disabled.").define("limestone", false);
                        disableCreateScoriaPoorOreGeneration = BUILDER.comment("If true, the (Create) Marble variant of all normal ores will be disabled.").define("scoria", false);
                        disableCreateWeatheredLimestonePoorOreGeneration = BUILDER.comment("If true, the (Create) Slate variant of all normal ores will be disabled.").define("weathered_limestone", false);
                    BUILDER.pop();
                    BUILDER.comment("Midnight stone variants. Midnight has to be installed for the ores to generate at all.").push("midnight");
                        disableMidnightNightstonePoorOreGeneration = BUILDER.comment("If true, the (Midnight) Basalt variant of all normal ores will be disabled.").define("nightstone", false);
                    BUILDER.pop();
                    BUILDER.comment("Nethercraft stone variants. Nethercraft has to be installed for the ores to generate at all.").push("nethercraft");
                        disableNethercraftHeatSandPoorOreGeneration = BUILDER.comment("If true, the (Nethercraft) Basalt variant of all normal ores will be disabled.").define("heat_sand", false);
                    BUILDER.pop();
                    BUILDER.comment("Mystical Agriculture stone variants. Mystical Agriculture has to be installed for the ores to generate at all.").push("mysticalagriculture");
                        disableMysticalagricultureSoulstonePoorOreGeneration = BUILDER.comment("If true, the (Mystical Agriculture) Basalt variant of all normal ores will be disabled.").define("soulstone", false);
                    BUILDER.pop();
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Manipulate vanilla and other mods ore generation.").push("vanilla_and_other_mods");
                enableCustomVanillaOreGeneration = BUILDER.comment("If true, this mod will generate vanilla ores based on the configs of this mod. Works even if the corresponding stone variant is disabled.").define("enableCustomVanillaOreGeneration", true);
                removeVanillaOverworldOreGeneration = BUILDER.comment("If true, vanilla overworld ores will be removed.").define("removeVanillaOverworldOreGeneration", true);
                removeVanillaNetherOreGeneration = BUILDER.comment("If true, vanilla nether ores will be removed.").define("removeVanillaNetherOreGeneration", true);
                disableOtherOverworldOreGeneration = BUILDER.comment("If true, the generation of overworld ores added by other mods and vanilla minecraft will be disabled.").define("disableOtherOverworldOreGeneration", false);
                disableOtherNetherOreGeneration = BUILDER.comment("If true, the generation of nether ores added by other mods and vanilla minecraft will be disabled.").define("disableOtherNetherOreGeneration", false);
                disableOtherEndOreGeneration = BUILDER.comment("If true, the generation of end ores added by other mods will be disabled.").define("disableOtherEndOreGeneration", false);
            BUILDER.pop();
            BUILDER.comment("Other general settings").push("others");
                replaceBedrockOreWithBedrockOnExplosion = BUILDER.comment("If true, Bedrock ores will be replaced with Bedrock when blown up. If Bedrock ores drop itself this might be a way to reproduce bedrock. If false, people could break out of the world.").define("replaceBedrockOreWithBedrockOnExplosion", true);
            BUILDER.pop();
        BUILDER.pop();
        spec = BUILDER.build();
        //BUILDER.comment("").push("");
        //
        //BUILDER.pop();
    }

    public static void loadConfig(String path) {

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GeneralConfig.spec, path + "/#general.toml");

//        Air.loadConfig(normalPath);
//        Fire.loadConfig(normalPath);
//        Earth.loadConfig(normalPath);
//        Water.loadConfig(normalPath);
//        Order.loadConfig(normalPath);
//        Entropy.loadConfig(normalPath);
//        Adamantium.loadConfig(normalPath);
//        Bauxite.loadConfig(normalPath);
//        Anglesite.loadConfig(normalPath);
//        Amethyst.loadConfig(normalPath);
//        Apatite.loadConfig(normalPath);
//        Ardite.loadConfig(normalPath);
//        Benitoite.loadConfig(normalPath);
//        Bismuth.loadConfig(normalPath);
//        BlackOpal.loadConfig(normalPath);
//        Coal.loadConfig(normalPath);
//        Copper.loadConfig(normalPath);
//        Galena.loadConfig(normalPath);
//        Diamond.loadConfig(normalPath);
//        Electrotine.loadConfig(normalPath);
//        Emerald.loadConfig(normalPath);
//        Gold.loadConfig(normalPath);
//        Imperium.loadConfig(normalPath);
//        Inferium.loadConfig(normalPath);
//        Insanium.loadConfig(normalPath);
//        Iridium.loadConfig(normalPath);
//        Iron.loadConfig(normalPath);
//        Lapis.loadConfig(normalPath);
//        Lead.loadConfig(normalPath);
//        Lucky.loadConfig(normalPath);
//        Mithril.loadConfig(normalPath);
//        Nickel.loadConfig(normalPath);
//        Osmium.loadConfig(normalPath);
//        Peridot.loadConfig(normalPath);
//        Platinum.loadConfig(normalPath);
//        Pyrite.loadConfig(normalPath);
//        Vulcanite.loadConfig(normalPath);
//        Prosperity.loadConfig(normalPath);
//        Prudentium.loadConfig(normalPath);
//        Quartz.loadConfig(normalPath);
//        Redstone.loadConfig(normalPath);
//        Ruby.loadConfig(normalPath);
//        Runite.loadConfig(normalPath);
//        Sapphire.loadConfig(normalPath);
//        Silver.loadConfig(normalPath);
//        Soulium.loadConfig(normalPath);
//        Supremium.loadConfig(normalPath);
//        Tertium.loadConfig(normalPath);
//        Tin.loadConfig(normalPath);
//        Tungsten.loadConfig(normalPath);
//        Uraninite.loadConfig(normalPath);
//        WhiteOpal.loadConfig(normalPath);
//        Xp.loadConfig(normalPath);
//        Zanite.loadConfig(normalPath);
//        Yellorite.loadConfig(normalPath);
//        Zinc.loadConfig(normalPath);
//        CertusQuartz.loadConfig(normalPath);
//        ChargedCertusQuartz.loadConfig(normalPath);
//        DimensionalShard.loadConfig(normalPath);
//        LavaCrystal.loadConfig(normalPath);
//        Sticky.loadConfig(normalPath);
//        Steel.loadConfig(normalPath);
//        Boron.loadConfig(normalPath);
//        Magnesium.loadConfig(normalPath);
//        Lithium.loadConfig(normalPath);
//        Thorium.loadConfig(normalPath);
//
//        DenseAdamantium.loadConfig(densePath);
//        DenseBauxite.loadConfig(densePath);
//        DenseAnglesite.loadConfig(densePath);
//        DenseAmethyst.loadConfig(densePath);
//        DenseApatite.loadConfig(densePath);
//        DenseArdite.loadConfig(densePath);
//        DenseBenitoite.loadConfig(densePath);
//        DenseBismuth.loadConfig(densePath);
//        DenseBlackOpal.loadConfig(densePath);
//        DenseCoal.loadConfig(densePath);
//        DenseCopper.loadConfig(densePath);
//        DenseGalena.loadConfig(densePath);
//        DenseDiamond.loadConfig(densePath);
//        DenseElectrotine.loadConfig(densePath);
//        DenseEmerald.loadConfig(densePath);
//        DenseGold.loadConfig(densePath);
//        DenseImperium.loadConfig(densePath);
//        DenseInferium.loadConfig(densePath);
//        DenseInsanium.loadConfig(densePath);
//        DenseIridium.loadConfig(densePath);
//        DenseIron.loadConfig(densePath);
//        DenseLapis.loadConfig(densePath);
//        DenseLead.loadConfig(densePath);
//        DenseLucky.loadConfig(densePath);
//        DenseMithril.loadConfig(densePath);
//        DenseNickel.loadConfig(densePath);
//        DenseOsmium.loadConfig(densePath);
//        DensePeridot.loadConfig(densePath);
//        DensePlatinum.loadConfig(densePath);
//        DensePyrite.loadConfig(densePath);
//        DenseVulcanite.loadConfig(densePath);
//        DenseProsperity.loadConfig(densePath);
//        DensePrudentium.loadConfig(densePath);
//        DenseQuartz.loadConfig(densePath);
//        DenseRedstone.loadConfig(densePath);
//        DenseRuby.loadConfig(densePath);
//        DenseRunite.loadConfig(densePath);
//        DenseSapphire.loadConfig(densePath);
//        DenseSilver.loadConfig(densePath);
//        DenseSoulium.loadConfig(densePath);
//        DenseSupremium.loadConfig(densePath);
//        DenseTertium.loadConfig(densePath);
//        DenseTin.loadConfig(densePath);
//        DenseTungsten.loadConfig(densePath);
//        DenseUraninite.loadConfig(densePath);
//        DenseWhiteOpal.loadConfig(densePath);
//        DenseXp.loadConfig(densePath);
//        DenseZanite.loadConfig(densePath);
//        DenseYellorite.loadConfig(densePath);
//        DenseZinc.loadConfig(densePath);
//        DenseCertusQuartz.loadConfig(densePath);
//        DenseChargedCertusQuartz.loadConfig(densePath);
//        DenseDimensionalShard.loadConfig(densePath);
//        DenseLavaCrystal.loadConfig(densePath);
//        DenseSticky.loadConfig(densePath);
//        DenseSteel.loadConfig(densePath);
//        DenseBoron.loadConfig(densePath);
//        DenseMagnesium.loadConfig(densePath);
//        DenseLithium.loadConfig(densePath);
//        DenseThorium.loadConfig(densePath);
//
//        PoorAdamantium.loadConfig(poorPath);
//        PoorBauxite.loadConfig(poorPath);
//        PoorAnglesite.loadConfig(poorPath);
//        PoorAmethyst.loadConfig(poorPath);
//        PoorApatite.loadConfig(poorPath);
//        PoorArdite.loadConfig(poorPath);
//        PoorBenitoite.loadConfig(poorPath);
//        PoorBismuth.loadConfig(poorPath);
//        PoorBlackOpal.loadConfig(poorPath);
//        PoorCoal.loadConfig(poorPath);
//        PoorCopper.loadConfig(poorPath);
//        PoorGalena.loadConfig(poorPath);
//        PoorDiamond.loadConfig(poorPath);
//        PoorElectrotine.loadConfig(poorPath);
//        PoorEmerald.loadConfig(poorPath);
//        PoorGold.loadConfig(poorPath);
//        PoorImperium.loadConfig(poorPath);
//        PoorInferium.loadConfig(poorPath);
//        PoorInsanium.loadConfig(poorPath);
//        PoorIridium.loadConfig(poorPath);
//        PoorIron.loadConfig(poorPath);
//        PoorLapis.loadConfig(poorPath);
//        PoorLead.loadConfig(poorPath);
//        PoorLucky.loadConfig(poorPath);
//        PoorMithril.loadConfig(poorPath);
//        PoorNickel.loadConfig(poorPath);
//        PoorOsmium.loadConfig(poorPath);
//        PoorPeridot.loadConfig(poorPath);
//        PoorPlatinum.loadConfig(poorPath);
//        PoorPyrite.loadConfig(poorPath);
//        PoorVulcanite.loadConfig(poorPath);
//        PoorProsperity.loadConfig(poorPath);
//        PoorPrudentium.loadConfig(poorPath);
//        PoorQuartz.loadConfig(poorPath);
//        PoorRedstone.loadConfig(poorPath);
//        PoorRuby.loadConfig(poorPath);
//        PoorRunite.loadConfig(poorPath);
//        PoorSapphire.loadConfig(poorPath);
//        PoorSilver.loadConfig(poorPath);
//        PoorSoulium.loadConfig(poorPath);
//        PoorSupremium.loadConfig(poorPath);
//        PoorTertium.loadConfig(poorPath);
//        PoorTin.loadConfig(poorPath);
//        PoorTungsten.loadConfig(poorPath);
//        PoorUraninite.loadConfig(poorPath);
//        PoorWhiteOpal.loadConfig(poorPath);
//        PoorXp.loadConfig(poorPath);
//        PoorZanite.loadConfig(poorPath);
//        PoorYellorite.loadConfig(poorPath);
//        PoorZinc.loadConfig(poorPath);
//        PoorCertusQuartz.loadConfig(poorPath);
//        PoorChargedCertusQuartz.loadConfig(poorPath);
//        PoorDimensionalShard.loadConfig(poorPath);
//        PoorLavaCrystal.loadConfig(poorPath);
//        PoorSticky.loadConfig(poorPath);
//        PoorSteel.loadConfig(poorPath);
//        PoorBoron.loadConfig(poorPath);
//        PoorMagnesium.loadConfig(poorPath);
//        PoorLithium.loadConfig(poorPath);
//        PoorThorium.loadConfig(poorPath);

    }
}
