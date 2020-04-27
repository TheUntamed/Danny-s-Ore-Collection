package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.Main;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
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

    public static ForgeConfigSpec.BooleanValue disableStoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAndesiteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableDioriteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGraniteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherrackOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEndStoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGravelOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableSandstoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableRedSandstoneOreGeneration;

    public static ForgeConfigSpec.BooleanValue disableOtherOverworldOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherNetherOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherEndOreGeneration;
    public static ForgeConfigSpec.BooleanValue replaceVanillaOverworldOreGeneration;
    public static ForgeConfigSpec.BooleanValue replaceVanillaNetherOreGeneration;

    static {
        // = BUILDER.comment("").define("", false);
        BUILDER.comment("General settings").push("general");
        BUILDER.comment("Disable all Ores of a certain stone variant (only affects ores of this mod). (Game restart required.)").push("stone_variants");
            disableStoneOreGeneration = BUILDER.comment("If true, the Stone variant of all ores will be disabled.").define("disableStoneOreGeneration", false);
            disableAndesiteOreGeneration = BUILDER.comment("If true, the Andesite variant of all ores will be disabled.").define("disableAndesiteOreGeneration", false);
            disableDioriteOreGeneration = BUILDER.comment("If true, the Diorite variant of all ores will be disabled.").define("disableDioriteOreGeneration", false);
            disableGraniteOreGeneration = BUILDER.comment("If true, the Granite variant of all ores will be disabled.").define("disableGraniteOreGeneration", false);
            disableNetherrackOreGeneration = BUILDER.comment("If true, the Netherrack variant of all ores will be disabled.").define("disableNetherrackOreGeneration", false);
            disableEndStoneOreGeneration = BUILDER.comment("If true, the End Stone variant of all ores will be disabled.").define("disableEndStoneOreGeneration", false);
            disableSandOreGeneration = BUILDER.comment("If true, the Sand variant of all ores will be disabled.").define("disableSandOreGeneration", false);
            disableGravelOreGeneration = BUILDER.comment("If true, the Gravel variant of all ores will be disabled.").define("disableGravelOreGeneration", false);
            disableSandstoneOreGeneration = BUILDER.comment("If true, the Sandstone variant of all ores will be disabled.").define("disableSandstoneOreGeneration", false);
            disableRedSandstoneOreGeneration = BUILDER.comment("If true, the RedSandstone variant of all ores will be disabled.").define("disableRedSandstoneOreGeneration", false);
        BUILDER.pop();
        BUILDER.comment("Manipulate vanilla and other mods ore generation. (Game restart required.)").push("vanilla_and_other_mods");
            replaceVanillaOverworldOreGeneration = BUILDER.comment("If true, vanilla overworld ores will be removed and replaced by the corresponding ores provided by this mod which can be tweaked in this config.").define("replaceVanillaOverworldOreGeneration", false);
            replaceVanillaNetherOreGeneration = BUILDER.comment("If true, vanilla nether ores will be removed and replaced by the corresponding ores provided by this mod which can be tweaked in this config.").define("replaceVanillaNetherOreGeneration", false);
            disableOtherOverworldOreGeneration = BUILDER.comment("If true, the generation of overworld ores added by other mods will be disabled.").define("disableOtherOverworldOreGeneration", false);
            disableOtherNetherOreGeneration = BUILDER.comment("If true, the generation of nether ores added by other mods will be disabled.").define("disableOtherNetherOreGeneration", false);
            disableOtherEndOreGeneration = BUILDER.comment("If true, the generation of end ores added by other mods will be disabled.").define("disableOtherEndOreGeneration", false);
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

        // This part was taken from the code of the mod 'almost-all-the-ores' by waylanderou.
        // https://github.com/waylanderou/almost-all-the-ores
        final CommentedFileConfig configData = CommentedFileConfig.builder(FMLPaths.CONFIGDIR.get().resolve(Main.MOD_ID + "/#general.toml"))
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();
        spec.setConfig(configData);

        Copper.loadConfig();
    }
}
