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
import java.util.ArrayList;
import java.util.List;

public class Copper {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec spec;
    public static ForgeConfigSpec.BooleanValue enableCopperOres;

    public static ForgeConfigSpec.BooleanValue enableStoneCopperOre;
    public static ForgeConfigSpec.IntValue veinSizeStoneCopperOre;
    public static ForgeConfigSpec.IntValue veinsPerChunkStoneCopperOre;
    public static ForgeConfigSpec.IntValue minHeightStoneCopperOre;
    public static ForgeConfigSpec.IntValue maxHeightStoneCopperOre;
    public static ForgeConfigSpec.BooleanValue isTempWhitelistStoneCopperOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> temperatureBlacklistStoneCopperOre;
    public static ForgeConfigSpec.BooleanValue isBiomeWhitelistStoneCopperOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistStoneCopperOre;
    public static ForgeConfigSpec.IntValue harvestLevelStoneCopperOre;
    public static ForgeConfigSpec.DoubleValue hardnessLevelStoneCopperOre;
    public static ForgeConfigSpec.DoubleValue resistanceLevelStoneCopperOre;
    public static ForgeConfigSpec.IntValue lightValueStoneCopperOre;
    public static ForgeConfigSpec.IntValue minXpDropStoneCopperOre;
    public static ForgeConfigSpec.IntValue maxXpDropStoneCopperOre;
    public static ForgeConfigSpec.IntValue explosionChanceStoneCopperOre;
    public static ForgeConfigSpec.DoubleValue explosionRangeStoneCopperOre;
    public static ForgeConfigSpec.BooleanValue enableExplosionDestructionStoneCopperOre;
    public static ForgeConfigSpec.BooleanValue hasGlowEffectStoneCopperOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> itemStatusEffectsStoneCopperOre;
    public static ForgeConfigSpec.BooleanValue onlyInHandStoneCopperOre;
    public static ForgeConfigSpec.ConfigValue<List<String>> blockStatusEffectsStoneCopperOre;

    static {
        // = BUILDER.comment("").define("", false);

        BUILDER.comment("Copper Ores").push("copper_ores");
            enableCopperOres = BUILDER.comment("Enable or disable all Copper Ore variants.").define("enableCopperOres", true);
            BUILDER.comment("Stone Copper Ore").push("stone_copper_ore");
                BUILDER.comment("Generation settings for this ore. (Game restart required.)").push("generation");
                    enableStoneCopperOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableStoneCopperOre", true);
                    veinSizeStoneCopperOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeStoneCopperOre", 8, 0, 65536);
                    veinsPerChunkStoneCopperOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkStoneCopperOre", 8, 0, 65536);
                    minHeightStoneCopperOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightStoneCopperOre", 0, 0, 256);
                    maxHeightStoneCopperOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightStoneCopperOre", 60, 0, 256);
                    isTempWhitelistStoneCopperOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistStoneCopperOre", false);
                    temperatureBlacklistStoneCopperOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistStoneCopperOre", new ArrayList<String>());
                    isBiomeWhitelistStoneCopperOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistStoneCopperOre", false);
                    biomeBlacklistStoneCopperOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistStoneCopperOre", new ArrayList<String>());
                BUILDER.pop();
                BUILDER.comment("Block properties for this ore. (Game restart required.)").push("properties");
                    harvestLevelStoneCopperOre = BUILDER.comment("The required tool level. Wood/Gold: 0, Stone: 1, Iron: 2, Diamond: 3, Above Diamond: 4+").defineInRange("harvestLevelStoneCopperOre", 1, 0, 2000000000);
                    hardnessLevelStoneCopperOre = BUILDER.comment("How long it takes to break the block. Has nothing to do with the required tool level. Default value is equal to the value of vanilla ores. Obsidian: 50.0, Bedrock: -1.00 (unbreakable)").defineInRange("hardnessLevelStoneCopperOre", 3.0, -1.0, 3600000.0);
                    resistanceLevelStoneCopperOre = BUILDER.comment("The Blast Resistance of the block. Default value is equal to the value of vanilla ores. Obsidian: 1200.0, Bedrock: 3600000.00").defineInRange("resistanceLevelStoneCopperOre", 3.0, 0.0, 3600000.0);
                    lightValueStoneCopperOre = BUILDER.comment("Should this block emit light? 0: disabled, 15: glowstone").defineInRange("lightValueStoneCopperOre", 0, 0, 15);
                    minXpDropStoneCopperOre = BUILDER.comment("The minimum xp that drops from this ore. Is always 0 if silktouch is used.").defineInRange("minXpDropStoneCopperOre", 0, 0, 100000);
                    maxXpDropStoneCopperOre = BUILDER.comment("The maximum xp that drops from this ore. Is always 0 if silktouch is used.").defineInRange("maxXpDropStoneCopperOre", 0, 0,100000);
                BUILDER.pop();
                BUILDER.comment("Explosion settings for this ore. (Can be applied live.)").push("explosion");
                    explosionChanceStoneCopperOre = BUILDER.comment("The chance that this ore will explode when harvested. Unfortunately the values are not exact. Tests showed that 500 is much more than 50%.").defineInRange("explosionChanceStoneCopperOre", 0, 0, 1000);
                    explosionRangeStoneCopperOre = BUILDER.comment("The range of the explosion.").defineInRange("explosionRangeStoneCopperOre", 3.0, 0.0, 100.0);
                    enableExplosionDestructionStoneCopperOre = BUILDER.comment("If true, the explosion of this ore will destroy blocks.").define("enableExplosionDestructionStoneCopperOre", false);
                BUILDER.pop();
                BUILDER.comment("Effects provided by this ore. (Can be applied live.)").push("effects");
                    hasGlowEffectStoneCopperOre = BUILDER.comment("If true, the item has the enchanted glow.").define("hasGlowEffectStoneCopperOre", false);
                    itemStatusEffectsStoneCopperOre = BUILDER.comment("The effects the ore should apply to the player while in his/her inventory. Syntax: \"effectid:level\". E.g.: [\"1:2\", \"3:5\"] provides Speed II and Haste V. Max level is 255. See the wiki for ID list.").define("statusEffectsStoneCopperOre", new ArrayList<String>());
                    onlyInHandStoneCopperOre = BUILDER.comment("If true, status effects are only applied if the item is in hand.").define("onlyInHandStoneCopperOre", false);
                    blockStatusEffectsStoneCopperOre = BUILDER.comment("The effects the ore should apply to a living entity on touch. Syntax: \"effectid:level\". E.g.: [\"20:2\", \"31:1\"] provides Wither II and Bad Omen I. Max level is 255. See the wiki for ID list.").define("blockStatusEffectsStoneCopperOre", new ArrayList<String>());
                BUILDER.pop();
            BUILDER.pop();
        BUILDER.pop();
        spec = BUILDER.build();
        //BUILDER.comment("").push("");
        //
        //BUILDER.pop();
    }

    public static void loadConfig() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Copper.spec, Main.MOD_ID + "/copper.toml");
        final CommentedFileConfig configData = CommentedFileConfig.builder(FMLPaths.CONFIGDIR.get().resolve(Main.MOD_ID + "/copper.toml"))
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();
        spec.setConfig(configData);
    }
}
