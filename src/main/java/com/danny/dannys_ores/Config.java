package com.danny.dannys_ores;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

/*
This file was heavily inspired by the code of the mod almost-all-the-ores by waylanderou.
https://github.com/waylanderou/almost-all-the-ores
 */
//@ObjectHolder(Main.MOD_ID)
//@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec spec;

    public static ForgeConfigSpec.BooleanValue disableStoneOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableAndesiteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableDioriteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableGraniteOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableNetherrackOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableEndStoneOreGeneration;

    public static ForgeConfigSpec.BooleanValue disableOtherOverworldOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherNetherOreGeneration;
    public static ForgeConfigSpec.BooleanValue disableOtherEndOreGeneration;

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
//
//    public static ForgeConfigSpec.BooleanValue enableAndesiteCopperOre;
//    public static ForgeConfigSpec.IntValue veinSizeAndesiteCopperOre;
//    public static ForgeConfigSpec.IntValue veinsPerChunkAndesiteCopperOre;
//    public static ForgeConfigSpec.IntValue minHeightAndesiteCopperOre;
//    public static ForgeConfigSpec.IntValue maxHeightAndesiteCopperOre;
//    public static ForgeConfigSpec.BooleanValue isWhitelistAndesiteCopperOre;
//    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistAndesiteCopperOre;
//    public static ForgeConfigSpec.IntValue harvestLevelAndesiteCopperOre;
//    public static ForgeConfigSpec.DoubleValue hardnessLevelAndesiteCopperOre;
//    public static ForgeConfigSpec.DoubleValue resistanceLevelAndesiteCopperOre;
//    public static ForgeConfigSpec.IntValue lightValueAndesiteCopperOre;
//
//    public static ForgeConfigSpec.BooleanValue enableDioriteCopperOre;
//    public static ForgeConfigSpec.IntValue veinSizeDioriteCopperOre;
//    public static ForgeConfigSpec.IntValue veinsPerChunkDioriteCopperOre;
//    public static ForgeConfigSpec.IntValue minHeightDioriteCopperOre;
//    public static ForgeConfigSpec.IntValue maxHeightDioriteCopperOre;
//    public static ForgeConfigSpec.BooleanValue isWhitelistDioriteCopperOre;
//    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistDioriteCopperOre;
//    public static ForgeConfigSpec.IntValue harvestLevelDioriteCopperOre;
//    public static ForgeConfigSpec.DoubleValue hardnessLevelDioriteCopperOre;
//    public static ForgeConfigSpec.DoubleValue resistanceLevelDioriteCopperOre;
//    public static ForgeConfigSpec.IntValue lightValueDioriteCopperOre;
//
//    public static ForgeConfigSpec.BooleanValue enableGraniteCopperOre;
//    public static ForgeConfigSpec.IntValue veinSizeGraniteCopperOre;
//    public static ForgeConfigSpec.IntValue veinsPerChunkGraniteCopperOre;
//    public static ForgeConfigSpec.IntValue minHeightGraniteCopperOre;
//    public static ForgeConfigSpec.IntValue maxHeightGraniteCopperOre;
//    public static ForgeConfigSpec.BooleanValue isWhitelistGraniteCopperOre;
//    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistGraniteCopperOre;
//    public static ForgeConfigSpec.IntValue harvestLevelGraniteCopperOre;
//    public static ForgeConfigSpec.DoubleValue hardnessLevelGraniteCopperOre;
//    public static ForgeConfigSpec.DoubleValue resistanceLevelGraniteCopperOre;
//    public static ForgeConfigSpec.IntValue lightValueGraniteCopperOre;
//
//    public static ForgeConfigSpec.BooleanValue enableNetherrackCopperOre;
//    public static ForgeConfigSpec.IntValue veinSizeNetherrackCopperOre;
//    public static ForgeConfigSpec.IntValue veinsPerChunkNetherrackCopperOre;
//    public static ForgeConfigSpec.IntValue minHeightNetherrackCopperOre;
//    public static ForgeConfigSpec.IntValue maxHeightNetherrackCopperOre;
//    public static ForgeConfigSpec.BooleanValue isWhitelistNetherrackCopperOre;
//    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistNetherrackCopperOre;
//    public static ForgeConfigSpec.IntValue harvestLevelNetherrackCopperOre;
//    public static ForgeConfigSpec.DoubleValue hardnessLevelNetherrackCopperOre;
//    public static ForgeConfigSpec.DoubleValue resistanceLevelNetherrackCopperOre;
//    public static ForgeConfigSpec.IntValue lightValueNetherrackCopperOre;
//
//    public static ForgeConfigSpec.BooleanValue enableEndStoneCopperOre;
//    public static ForgeConfigSpec.IntValue veinSizeEndStoneCopperOre;
//    public static ForgeConfigSpec.IntValue veinsPerChunkEndStoneCopperOre;
//    public static ForgeConfigSpec.IntValue minHeightEndStoneCopperOre;
//    public static ForgeConfigSpec.IntValue maxHeightEndStoneCopperOre;
//    public static ForgeConfigSpec.BooleanValue isWhitelistEndStoneCopperOre;
//    public static ForgeConfigSpec.ConfigValue<List<String>> biomeBlacklistEndStoneCopperOre;
//    public static ForgeConfigSpec.IntValue harvestLevelEndStoneCopperOre;
//    public static ForgeConfigSpec.DoubleValue hardnessLevelEndStoneCopperOre;
//    public static ForgeConfigSpec.DoubleValue resistanceLevelEndStoneCopperOre;
//    public static ForgeConfigSpec.IntValue lightValueEndStoneCopperOre;

    static {
        // = BUILDER.comment("").define("", false);
        BUILDER.comment("General settings").push("general");
            disableStoneOreGeneration = BUILDER.comment("If true, the Stone variant of all ores will be disabled.").define("disableStoneOreGeneration", false);
            disableAndesiteOreGeneration = BUILDER.comment("If true, the Andesite variant of all ores will be disabled.").define("disableAndesiteOreGeneration", false);
            disableDioriteOreGeneration = BUILDER.comment("If true, the Diorite variant of all ores will be disabled.").define("disableDioriteOreGeneration", false);
            disableGraniteOreGeneration = BUILDER.comment("If true, the Granite variant of all ores will be disabled.").define("disableGraniteOreGeneration", false);
            disableNetherrackOreGeneration = BUILDER.comment("If true, the Netherrack variant of all ores will be disabled.").define("disableNetherrackOreGeneration", false);
            disableEndStoneOreGeneration = BUILDER.comment("If true, the End Stone variant of all ores will be disabled.").define("disableEndStoneOreGeneration", false);

            disableOtherOverworldOreGeneration = BUILDER.comment("If true, the generation of overworld ores added by other mods will be disabled").define("disableOtherOverworldOreGeneration", false);
            disableOtherNetherOreGeneration = BUILDER.comment("If true, the generation of nether ores added by other mods will be disabled").define("disableOtherNetherOreGeneration", false);
            disableOtherEndOreGeneration = BUILDER.comment("If true, the generation of end ores added by other mods will be disabled").define("disableOtherEndOreGeneration", false);
        BUILDER.pop();

        BUILDER.comment("Copper Ores").push("copper_ores");
            enableCopperOres = BUILDER.comment("Enable or disable all Copper Ore variants.").define("enableCopperOres", true);
            BUILDER.comment("Stone Copper Ore").push("stone_copper_ore");
                enableStoneCopperOre = BUILDER.comment("If false, this ore variant will not generate.").define("enableStoneCopperOre", true);
                veinSizeStoneCopperOre = BUILDER.comment("The amount of ores in one vein.").defineInRange("veinSizeStoneCopperOre", 0, 0, 65536);
                veinsPerChunkStoneCopperOre = BUILDER.comment("How many veins per chunk.").defineInRange("veinsPerChunkStoneCopperOre", 0, 0, 65536);
                minHeightStoneCopperOre = BUILDER.comment("The min y-level the ore will generate.").defineInRange("minHeightStoneCopperOre", 0, 0, 256);
                maxHeightStoneCopperOre = BUILDER.comment("The max y-level the ore will generate.").defineInRange("maxHeightStoneCopperOre", 0, 0, 256);
                isTempWhitelistStoneCopperOre = BUILDER.comment("If true, the biome temperature blacklist is a whitelist.").define("isTempWhitelistStoneCopperOre", false);
                temperatureBlacklistStoneCopperOre = BUILDER.comment("Possible Entries: \"MEDIUM\", \"WARM\", \"COLD\", \"OCEAN\"").define("temperatureBlacklistStoneCopperOre", new ArrayList<String>());
                isBiomeWhitelistStoneCopperOre = BUILDER.comment("If true, the biome blacklist is a whitelist.").define("isBiomeWhitelistStoneCopperOre", false);
                biomeBlacklistStoneCopperOre = BUILDER.comment("Syntax: \"modid:biome\". E.g.: [\"minecraft:plains\", \"biomesoplenty:meadow\"])").define("biomeBlacklistStoneCopperOre", new ArrayList<String>());
                harvestLevelStoneCopperOre = BUILDER.comment("The required tool level. Wood/Gold: 0, Stone: 1, Iron: 2, Diamond: 3, Above Diamond: 4+").defineInRange("harvestLevelStoneCopperOre", 3, 0, 2000000000);
                hardnessLevelStoneCopperOre = BUILDER.comment("How long it takes to break the block. Has nothing to do with the required tool level. Default value is equal to the value of vanilla ores. Obsidian: 50.0, Bedrock: -1.00 (unbreakable)").defineInRange("hardnessLevelStoneCopperOre", 3.00, -1.00, 3600000.00);
                resistanceLevelStoneCopperOre = BUILDER.comment("The Blast Resistance of the block. Default value is equal to the value of vanilla ores. Obsidian: 1200.0, Bedrock: 3600000.00").defineInRange("resistanceLevelStoneCopperOre", 3.00, 0.00, 3600000.00);
                lightValueStoneCopperOre = BUILDER.comment("Should this block emit light? 0: disabled, 15: glowstone").defineInRange("lightValueStoneCopperOre", 0, 0, 15);
            BUILDER.pop();
        BUILDER.pop();
        spec = BUILDER.build();
        //BUILDER.comment("").push("");
        //
        //BUILDER.pop();
    }

    public static void loadConfig() {
        final CommentedFileConfig configData = CommentedFileConfig.builder(FMLPaths.CONFIGDIR.get().resolve(Main.MOD_ID + "-common.toml"))
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();
        spec.setConfig(configData);
    }

}
