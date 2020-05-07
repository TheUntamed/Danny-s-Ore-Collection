package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.Main;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class General {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec spec;

    public static ForgeConfigSpec.BooleanValue enableConfigChecker;

    // Vanilla
    public static ForgeConfigSpec.BooleanValue disableStoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAndesiteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableDioriteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGraniteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherrackOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEndStoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGravelOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandstoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandstoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBlueIceOreGeneration;
    public static ForgeConfigSpec.BooleanValue disablePackedIceOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableBedrockOreGeneration;

    // Quark
    public static ForgeConfigSpec.BooleanValue disableQuarkBasaltOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkLimestoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkJasperOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkMarbleOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableQuarkSlateOreGeneration;

    // Embellishcraft
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftBasaltOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftGneissOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftJadeOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftLarvikiteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftMarbleOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEmbellishcraftSlateOreGeneration;

    // Danny's Ores
    public static ForgeConfigSpec.BooleanValue disableHardenedStoneOreGeneration;

    public static ForgeConfigSpec.BooleanValue enableCustomVanillaOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherOverworldOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherNetherOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherEndOreGeneration;
    public static ForgeConfigSpec.BooleanValue removeVanillaOverworldOreGeneration;
    public static ForgeConfigSpec.BooleanValue removeVanillaNetherOreGeneration;
    public static ForgeConfigSpec.BooleanValue replaceBedrockOreWithBedrockOnExplosion;

    static {
        // = BUILDER.comment("").define("", false);
        BUILDER.comment("General settings").push("general");
            enableConfigChecker = BUILDER.comment("Checks your blacklists and whitelists for correct syntax. If something is wrong it will be printed to the log.").define("enableConfigChecker", false);
            BUILDER.comment("Disable all Ores of a certain stone variant (only affects ores of this mod).").push("stone_variants");
                BUILDER.comment("Vanilla stone variants").push("vanilla");
                    disableStoneOreGeneration = BUILDER.comment("If true, the Stone variant of all ores (except vanilla ores) will be disabled.").define("disableStoneOreGeneration", false);
                    disableAndesiteOreGeneration = BUILDER.comment("If true, the Andesite variant of all ores will be disabled.").define("disableAndesiteOreGeneration", false);
                    disableDioriteOreGeneration = BUILDER.comment("If true, the Diorite variant of all ores will be disabled.").define("disableDioriteOreGeneration", false);
                    disableGraniteOreGeneration = BUILDER.comment("If true, the Granite variant of all ores will be disabled.").define("disableGraniteOreGeneration", false);
                    disableNetherrackOreGeneration = BUILDER.comment("If true, the Netherrack variant of all ores (except vanilla ores) will be disabled.").define("disableNetherrackOreGeneration", false);
                    disableEndStoneOreGeneration = BUILDER.comment("If true, the End Stone variant of all ores will be disabled.").define("disableEndStoneOreGeneration", false);
                    disableSandOreGeneration = BUILDER.comment("If true, the Sand variant of all ores will be disabled.").define("disableSandOreGeneration", false);
                    disableRedSandOreGeneration = BUILDER.comment("If true, the RedSand variant of all ores will be disabled.").define("disableRedSandOreGeneration", false);
                    disableGravelOreGeneration = BUILDER.comment("If true, the Gravel variant of all ores will be disabled.").define("disableGravelOreGeneration", false);
                    disableSandstoneOreGeneration = BUILDER.comment("If true, the Sandstone variant of all ores will be disabled.").define("disableSandstoneOreGeneration", false);
                    disableRedSandstoneOreGeneration = BUILDER.comment("If true, the RedSandstone variant of all ores will be disabled.").define("disableRedSandstoneOreGeneration", false);
                    disableBlueIceOreGeneration = BUILDER.comment("If true, the Blue Ice variant of all ores (except vanilla ores) will be disabled.").define("disableBlueIceOreGeneration", false);
                    disablePackedIceOreGeneration = BUILDER.comment("If true, the Packed Ice variant of all ores (except vanilla ores) will be disabled.").define("disablePackedIceOreGeneration", false);
                    disableBedrockOreGeneration = BUILDER.comment("If true, the Bedrock variant of all ores (except vanilla ores) will be disabled.").define("disableBedrockOreGeneration", false);
        BUILDER.pop();
                BUILDER.comment("Quark stone variants. Quark has to be installed for the ores to generate at all.").push("quark");
                    disableQuarkBasaltOreGeneration = BUILDER.comment("If true, the (Quark) Basalt variant of all ores will be disabled.").define("disableQuarkBasaltOreGeneration", false);
                    disableQuarkLimestoneOreGeneration = BUILDER.comment("If true, the (Quark) Limestone variant of all ores will be disabled.").define("disableQuarkLimestoneOreGeneration", false);
                    disableQuarkJasperOreGeneration = BUILDER.comment("If true, the (Quark) Jasper variant of all ores will be disabled.").define("disableQuarkJasperOreGeneration", false);
                    disableQuarkMarbleOreGeneration = BUILDER.comment("If true, the (Quark) Marble variant of all ores will be disabled.").define("disableQuarkMarbleOreGeneration", false);
                    disableQuarkSlateOreGeneration = BUILDER.comment("If true, the (Quark) Slate variant of all ores will be disabled.").define("disableQuarkSlateOreGeneration", false);
                BUILDER.pop();
                BUILDER.comment("Embellishcraft stone variants. Embellishcraft has to be installed for the ores to generate at all.").push("embellishcraft");
                    disableEmbellishcraftBasaltOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Basalt variant of all ores will be disabled.").define("disableEmbellishcraftBasaltOreGeneration", false);
                    disableEmbellishcraftGneissOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Gneiss variant of all ores will be disabled.").define("disableEmbellishcraftGneissOreGeneration", false);
                    disableEmbellishcraftJadeOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Jade variant of all ores will be disabled.").define("disableEmbellishcraftJadeOreGeneration", false);
                    disableEmbellishcraftLarvikiteOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Larvikite variant of all ores will be disabled.").define("disableEmbellishcraftLarvikiteOreGeneration", false);
                    disableEmbellishcraftMarbleOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Marble variant of all ores will be disabled.").define("disableEmbellishcraftMarbleOreGeneration", false);
                    disableEmbellishcraftSlateOreGeneration = BUILDER.comment("If true, the (Embellishcraft) Slate variant of all ores will be disabled.").define("disableEmbellishcraftSlateOreGeneration", false);
                BUILDER.pop();
                BUILDER.comment("Stone variants added by this mod.").push("dannys_ores");
                    disableHardenedStoneOreGeneration = BUILDER.comment("If true, the Hardened Stone variant of all ores (except vanilla ores) will be disabled.").define("disableStoneOreGeneration", false);
                BUILDER.pop();
            BUILDER.pop();
            BUILDER.comment("Manipulate vanilla and other mods ore generation.").push("vanilla_and_other_mods");
                enableCustomVanillaOreGeneration = BUILDER.comment("If true, this mod will generate vanilla ores based on the configs of this mod. Works even if the corresponding stone variant is disabled.").define("enableCustomVanillaOreGeneration", true);
                removeVanillaOverworldOreGeneration = BUILDER.comment("If true, vanilla overworld ores will be removed and removed.").define("removeVanillaOverworldOreGeneration", true);
                removeVanillaNetherOreGeneration = BUILDER.comment("If true, vanilla nether ores will be removed and removed.").define("removeVanillaNetherOreGeneration", true);
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

    public static void loadConfig() {
        Path configPath = FMLPaths.CONFIGDIR.get();
        Path myConfigPath = Paths.get(configPath.toAbsolutePath().toString(), Main.MOD_ID);
        try
        {
            Files.createDirectory(myConfigPath);
        }
        catch (FileAlreadyExistsException e)
        {
            // Do nothing
        }
        catch (IOException e) {
            Main.LOGGER.error("Failed to create config directory for Danny's Ores mod.", e);
        }

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, General.spec, Main.MOD_ID + "/#general.toml");

        StoneVariants.loadConfig();
        Iron.loadConfig();
        Gold.loadConfig();
        Lapis.loadConfig();
        Redstone.loadConfig();
        Emerald.loadConfig();
        Coal.loadConfig();
        Diamond.loadConfig();
        Quartz.loadConfig();
        Copper.loadConfig();
        Xp.loadConfig();
        Aluminum.loadConfig();
        Iridium.loadConfig();
        Lead.loadConfig();
        Platinum.loadConfig();
        Silver.loadConfig();
        Tin.loadConfig();
        Nickel.loadConfig();
        Zinc.loadConfig();
        Osmium.loadConfig();
        Uranium.loadConfig();

    }
}
