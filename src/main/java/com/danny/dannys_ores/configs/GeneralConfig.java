package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.util.BlockBaseHandler;
import com.danny.dannys_ores.util.StoneVariants;
import net.minecraft.client.renderer.model.Variant;
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

    // Atum
    public static ForgeConfigSpec.BooleanValue disableAtumStrangeSandNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumCrackedLimestoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumLimestoneNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumLimestoneGravelNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumAlabasterNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumPorphyryNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumMarlNormalOreGeneration;

    // Nether Ex
    public static ForgeConfigSpec.BooleanValue disableNetherexFieryNetherrackNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexIcyNetherrackNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexGloomyNetherrackNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexLivelyNetherrackNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexBasaltNormalOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexFrostburnIceNormalOreGeneration;


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

    // Atum
    public static ForgeConfigSpec.BooleanValue disableAtumStrangeSandDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumCrackedLimestoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumLimestoneDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumLimestoneGravelDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumAlabasterDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumPorphyryDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumMarlDenseOreGeneration;

    // Nether Ex
    public static ForgeConfigSpec.BooleanValue disableNetherexFieryNetherrackDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexIcyNetherrackDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexGloomyNetherrackDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexLivelyNetherrackDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexBasaltDenseOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexFrostburnIceDenseOreGeneration;

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

    // Atum
    public static ForgeConfigSpec.BooleanValue disableAtumStrangeSandPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumCrackedLimestonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumLimestonePoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumLimestoneGravelPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumAlabasterPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumPorphyryPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAtumMarlPoorOreGeneration;

    // Nether Ex
    public static ForgeConfigSpec.BooleanValue disableNetherexFieryNetherrackPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexIcyNetherrackPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexGloomyNetherrackPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexLivelyNetherrackPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexBasaltPoorOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherexFrostburnIcePoorOreGeneration;


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
        disableCreateDolomiteNormalOreGeneration = BUILDER.comment("If true, the (Create) Dolomite variant of all normal ores will be disabled.").define("dolomite", false);
        disableCreateGabbroNormalOreGeneration = BUILDER.comment("If true, the (Create) Gabbro variant of all normal ores will be disabled.").define("gabbro", false);
        disableCreateLimestoneNormalOreGeneration = BUILDER.comment("If true, the (Create) Limestone variant of all normal ores will be disabled.").define("limestone", false);
        disableCreateScoriaNormalOreGeneration = BUILDER.comment("If true, the (Create) Scoria variant of all normal ores will be disabled.").define("scoria", false);
        disableCreateWeatheredLimestoneNormalOreGeneration = BUILDER.comment("If true, the (Create) Weathered Limestone variant of all normal ores will be disabled.").define("weathered_limestone", false);
        BUILDER.pop();
        BUILDER.comment("Midnight stone variants. Midnight has to be installed for the ores to generate at all.").push("midnight");
        disableMidnightNightstoneNormalOreGeneration = BUILDER.comment("If true, the (Midnight) Nightstone variant of all normal ores will be disabled.").define("nightstone", false);
        BUILDER.pop();
        BUILDER.comment("Nethercraft stone variants. Nethercraft has to be installed for the ores to generate at all.").push("nethercraft");
        disableNethercraftHeatSandNormalOreGeneration = BUILDER.comment("If true, the (Nethercraft) Heat Sand variant of all normal ores will be disabled.").define("heat_sand", false);
        BUILDER.pop();
        BUILDER.comment("Mystical Agriculture stone variants. Mystical Agriculture has to be installed for the ores to generate at all.").push("mysticalagriculture");
        disableMysticalagricultureSoulstoneNormalOreGeneration = BUILDER.comment("If true, the (Mystical Agriculture) Soulstone variant of all normal ores will be disabled.").define("soulstone", false);
        BUILDER.pop();
        BUILDER.comment("Atum 2 stone variants. Atum 2 has to be installed for the ores to generate at all.").push("atum");
        disableAtumStrangeSandNormalOreGeneration = BUILDER.comment("If true, the (Atum 2) Strange Sand variant of all normal ores will be disabled.").define("sand", false);
        disableAtumLimestoneNormalOreGeneration = BUILDER.comment("If true, the (Atum 2) Limestone variant of all normal ores will be disabled.").define("limestone", false);
        disableAtumCrackedLimestoneNormalOreGeneration = BUILDER.comment("If true, the (Atum 2) Cracked Limestone variant of all normal ores will be disabled.").define("limestone_cracked", false);
        disableAtumLimestoneGravelNormalOreGeneration = BUILDER.comment("If true, the (Atum 2) Limestone Gravel variant of all normal ores will be disabled.").define("limestone_gravel", false);
        disableAtumAlabasterNormalOreGeneration = BUILDER.comment("If true, the (Atum 2) Alabaster variant of all normal ores will be disabled.").define("alabaster", false);
        disableAtumPorphyryNormalOreGeneration = BUILDER.comment("If true, the (Atum 2) Porphyry variant of all normal ores will be disabled.").define("porphyry", false);
        disableAtumMarlNormalOreGeneration = BUILDER.comment("If true, the (Atum 2) Marl variant of all normal ores will be disabled.").define("marl", false);
        BUILDER.pop();
        BUILDER.comment("Nether Ex stone variants. Nether Ex has to be installed for the ores to generate at all.").push("netherex");
        disableNetherexFieryNetherrackNormalOreGeneration = BUILDER.comment("If true, the (Nether Ex) Fiery Netherrack variant of all normal ores will be disabled.").define("fiery_netherrack", false);
        disableNetherexIcyNetherrackNormalOreGeneration = BUILDER.comment("If true, the (Nether Ex) Icy Netherrack variant of all normal ores will be disabled.").define("icy_netherrack", false);
        disableNetherexGloomyNetherrackNormalOreGeneration = BUILDER.comment("If true, the (Nether Ex) Gloomy Netherrack variant of all normal ores will be disabled.").define("gloomy_netherrack", false);
        disableNetherexLivelyNetherrackNormalOreGeneration = BUILDER.comment("If true, the (Nether Ex) Lively Netherrack variant of all normal ores will be disabled.").define("lively_netherrack", false);
        disableNetherexBasaltNormalOreGeneration = BUILDER.comment("If true, the (Nether Ex) Basalt variant of all normal ores will be disabled.").define("basalt", false);
        disableNetherexFrostburnIceNormalOreGeneration = BUILDER.comment("If true, the (Nether Ex) Frostburn Ice variant of all normal ores will be disabled.").define("frostburn_ice", false);
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
        disableCreateDolomiteDenseOreGeneration = BUILDER.comment("If true, the (Create) Dolomite variant of all dense ores will be disabled.").define("dolomite", false);
        disableCreateGabbroDenseOreGeneration = BUILDER.comment("If true, the (Create) Gabbro variant of all dense ores will be disabled.").define("gabbro", false);
        disableCreateLimestoneDenseOreGeneration = BUILDER.comment("If true, the (Create) Limestone variant of all dense ores will be disabled.").define("limestone", false);
        disableCreateScoriaDenseOreGeneration = BUILDER.comment("If true, the (Create) Scoria variant of all dense ores will be disabled.").define("scoria", false);
        disableCreateWeatheredLimestoneDenseOreGeneration = BUILDER.comment("If true, the (Create) Weathered Limestone variant of all dense ores will be disabled.").define("weathered_limestone", false);
        BUILDER.pop();
        BUILDER.comment("Midnight stone variants. Midnight has to be installed for the ores to generate at all.").push("midnight");
        disableMidnightNightstoneDenseOreGeneration = BUILDER.comment("If true, the (Midnight) Nightstone variant of all dense ores will be disabled.").define("nightstone", false);
        BUILDER.pop();
        BUILDER.comment("Nethercraft stone variants. Nethercraft has to be installed for the ores to generate at all.").push("nethercraft");
        disableNethercraftHeatSandDenseOreGeneration = BUILDER.comment("If true, the (Nethercraft) Heat Sand variant of all dense ores will be disabled.").define("heat_sand", false);
        BUILDER.pop();
        BUILDER.comment("Mystical Agriculture stone variants. Mystical Agriculture has to be installed for the ores to generate at all.").push("mysticalagriculture");
        disableMysticalagricultureSoulstoneDenseOreGeneration = BUILDER.comment("If true, the (Mystical Agriculture) Soulstone variant of all dense ores will be disabled.").define("soulstone", false);
        BUILDER.pop();
        BUILDER.comment("Atum 2 stone variants. Atum 2 has to be installed for the ores to generate at all.").push("atum");
        disableAtumStrangeSandDenseOreGeneration = BUILDER.comment("If true, the (Atum 2) Strange Sand variant of all dense ores will be disabled.").define("sand", false);
        disableAtumLimestoneDenseOreGeneration = BUILDER.comment("If true, the (Atum 2) Limestone variant of all dense ores will be disabled.").define("limestone", false);
        disableAtumCrackedLimestoneDenseOreGeneration = BUILDER.comment("If true, the (Atum 2) Cracked Limestone variant of all dense ores will be disabled.").define("limestone_cracked", false);
        disableAtumLimestoneGravelDenseOreGeneration = BUILDER.comment("If true, the (Atum 2) Limestone Gravel variant of all dense ores will be disabled.").define("limestone_gravel", false);
        disableAtumAlabasterDenseOreGeneration = BUILDER.comment("If true, the (Atum 2) Alabaster variant of all dense ores will be disabled.").define("alabaster", false);
        disableAtumPorphyryDenseOreGeneration = BUILDER.comment("If true, the (Atum 2) Porphyry variant of all dense ores will be disabled.").define("porphyry", false);
        disableAtumMarlDenseOreGeneration = BUILDER.comment("If true, the (Atum 2) Marl variant of all dense ores will be disabled.").define("marl", false);
        BUILDER.pop();
        BUILDER.comment("Nether Ex stone variants. Nether Ex has to be installed for the ores to generate at all.").push("netherex");
        disableNetherexFieryNetherrackDenseOreGeneration = BUILDER.comment("If true, the (Nether Ex) Fiery Netherrack variant of all dense ores will be disabled.").define("fiery_netherrack", false);
        disableNetherexIcyNetherrackDenseOreGeneration = BUILDER.comment("If true, the (Nether Ex) Icy Netherrack variant of all dense ores will be disabled.").define("icy_netherrack", false);
        disableNetherexGloomyNetherrackDenseOreGeneration = BUILDER.comment("If true, the (Nether Ex) Gloomy Netherrack variant of all dense ores will be disabled.").define("gloomy_netherrack", false);
        disableNetherexLivelyNetherrackDenseOreGeneration = BUILDER.comment("If true, the (Nether Ex) Lively Netherrack variant of all dense ores will be disabled.").define("lively_netherrack", false);
        disableNetherexBasaltDenseOreGeneration = BUILDER.comment("If true, the (Nether Ex) Basalt variant of all dense ores will be disabled.").define("basalt", false);
        disableNetherexFrostburnIceDenseOreGeneration = BUILDER.comment("If true, the (Nether Ex) Frostburn Ice variant of all dense ores will be disabled.").define("frostburn_ice", false);
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
        disableCreateDolomitePoorOreGeneration = BUILDER.comment("If true, the (Create) Dolomite variant of all poor ores will be disabled.").define("dolomite", false);
        disableCreateGabbroPoorOreGeneration = BUILDER.comment("If true, the (Create) Gabbro variant of all poor ores will be disabled.").define("gabbro", false);
        disableCreateLimestonePoorOreGeneration = BUILDER.comment("If true, the (Create) Limestone variant of all poor ores will be disabled.").define("limestone", false);
        disableCreateScoriaPoorOreGeneration = BUILDER.comment("If true, the (Create) Scoria variant of all poor ores will be disabled.").define("scoria", false);
        disableCreateWeatheredLimestonePoorOreGeneration = BUILDER.comment("If true, the (Create) Weathered Limestone variant of all poor ores will be disabled.").define("weathered_limestone", false);
        BUILDER.pop();
        BUILDER.comment("Midnight stone variants. Midnight has to be installed for the ores to generate at all.").push("midnight");
        disableMidnightNightstonePoorOreGeneration = BUILDER.comment("If true, the (Midnight) Nightstone variant of all poor ores will be disabled.").define("nightstone", false);
        BUILDER.pop();
        BUILDER.comment("Nethercraft stone variants. Nethercraft has to be installed for the ores to generate at all.").push("nethercraft");
        disableNethercraftHeatSandPoorOreGeneration = BUILDER.comment("If true, the (Nethercraft) Heat Sand variant of all poor ores will be disabled.").define("heat_sand", false);
        BUILDER.pop();
        BUILDER.comment("Mystical Agriculture stone variants. Mystical Agriculture has to be installed for the ores to generate at all.").push("mysticalagriculture");
        disableMysticalagricultureSoulstonePoorOreGeneration = BUILDER.comment("If true, the (Mystical Agriculture) Soulstone variant of all poor ores will be disabled.").define("soulstone", false);
        BUILDER.pop();
        BUILDER.comment("Atum 2 stone variants. Atum 2 has to be installed for the ores to generate at all.").push("atum");
        disableAtumStrangeSandPoorOreGeneration = BUILDER.comment("If true, the (Atum 2) Strange Sand variant of all poor ores will be disabled.").define("sand", false);
        disableAtumLimestonePoorOreGeneration = BUILDER.comment("If true, the (Atum 2) Limestone variant of all poor ores will be disabled.").define("limestone", false);
        disableAtumCrackedLimestonePoorOreGeneration = BUILDER.comment("If true, the (Atum 2) Cracked Limestone variant of all poor ores will be disabled.").define("limestone_cracked", false);
        disableAtumLimestoneGravelPoorOreGeneration = BUILDER.comment("If true, the (Atum 2) Limestone Gravel variant of all poor ores will be disabled.").define("limestone_gravel", false);
        disableAtumAlabasterPoorOreGeneration = BUILDER.comment("If true, the (Atum 2) Alabaster variant of all poor ores will be disabled.").define("alabaster", false);
        disableAtumPorphyryPoorOreGeneration = BUILDER.comment("If true, the (Atum 2) Porphyry variant of all poor ores will be disabled.").define("porphyry", false);
        disableAtumMarlPoorOreGeneration = BUILDER.comment("If true, the (Atum 2) Marl variant of all poor ores will be disabled.").define("marl", false);
        BUILDER.pop();
        BUILDER.comment("Nether Ex stone variants. Nether Ex has to be installed for the ores to generate at all.").push("netherex");
        disableNetherexFieryNetherrackPoorOreGeneration = BUILDER.comment("If true, the (Nether Ex) Fiery Netherrack variant of all poor ores will be disabled.").define("fiery_netherrack", false);
        disableNetherexIcyNetherrackPoorOreGeneration = BUILDER.comment("If true, the (Nether Ex) Icy Netherrack variant of all poor ores will be disabled.").define("icy_netherrack", false);
        disableNetherexGloomyNetherrackPoorOreGeneration = BUILDER.comment("If true, the (Nether Ex) Gloomy Netherrack variant of all poor ores will be disabled.").define("gloomy_netherrack", false);
        disableNetherexLivelyNetherrackPoorOreGeneration = BUILDER.comment("If true, the (Nether Ex) Lively Netherrack variant of all poor ores will be disabled.").define("lively_netherrack", false);
        disableNetherexBasaltPoorOreGeneration = BUILDER.comment("If true, the (Nether Ex) Basalt variant of all poor ores will be disabled.").define("basalt", false);
        disableNetherexFrostburnIcePoorOreGeneration = BUILDER.comment("If true, the (Nether Ex) Frostburn Ice variant of all poor ores will be disabled.").define("frostburn_ice", false);
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
    }
}
