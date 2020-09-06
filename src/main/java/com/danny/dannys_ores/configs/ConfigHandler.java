package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.*;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.RegistryObject;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * This class has nothing to do with the creation process of the configs. For that see {@link Config}.
 * It instead provides a method to get the correct config for a block
 * and a config checker that checks the configs for invalid entries (has to be enabled in the general config).
 */
public class ConfigHandler {

    /**
     * The configs of this mod are split into different files/classes.
     * This method selects the correct config for a given block.
     *
     * @param block The block the config should be returned for.
     * @return All values of the config file that matches the block type.
     */
    public static UnmodifiableConfig getConfig(Block block) {
        if (block instanceof SimpleOre) {
            SimpleOre ore = (SimpleOre) block;
            return Config.allConfigs.get(ore.getRichnessType()).get(ore.getOreType()).getValues();
        } else if (block instanceof SimpleBlock) {
            return StonesConfig.spec.getValues();
        } else {
            HashMap<Block, Pair<OreTypes, StoneVariants>> vanilla = BlockInit.getFilledVanillaBlockMap();
            return Config.allConfigs.get(RichnessTypes.NORMAL).get(vanilla.get(block).getLeft()).getValues();
        }
    }

    /**
     * Checks the blacklists in all configs (of this mod) for invalid entries and logs them.
     * This should help the user to fix an error caused by an invalid entry.
     *
     * @param biomeVerify A List of all vanilla and modded biomes.
     * @param tempVerify  A List of all vanilla and modded biome temperatures.
     */
    public static void checkConfig(ArrayList<String> biomeVerify, ArrayList<String> tempVerify) {
        for (RegistryObject<Block> blockRO : BlockInit.ORES.getEntries()) {
            Block block = blockRO.get();
            UnmodifiableConfig config = ConfigHandler.getConfig(block);
            if (block instanceof SimpleOre) {
                SimpleOre ore = (SimpleOre) block;
                OreTypes oType = ore.getOreType();
                RichnessTypes rType = ore.getRichnessType();
                StoneVariants variant = ore.getStoneVariant();
                VariantsModId fillerBlockModId = ore.getBlockBaseModId();
                ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get(PathBuilder.getBiomeBlacklistFullPath(fillerBlockModId, variant, rType, oType));
                List<String> biomeList = inBiomeFCS.get();
                ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get(PathBuilder.getTemperatureBlacklistFullPath(fillerBlockModId, variant, rType, oType));
                List<String> tempList = inTempFCS.get();
                for (String name : biomeList) {
                    if (!biomeVerify.contains(name)) {
                        Main.LOGGER.warn("Invalid biome '" + name + "' in Danny's Ores Config in Biome Blacklist for '" + CommentHandler.getBlockNameComment(variant, rType, oType) + "', please check the entries!");
                    }
                }
                for (String temp : tempList) {
                    if (!tempVerify.contains(temp)) {
                        Main.LOGGER.warn("Invalid temperature '" + temp + "' in Danny's Ores Config in Temperature Blacklist for '" + CommentHandler.getBlockNameComment(variant, rType, oType) + "', please check the entries!");
                    }
                }
            }
        }
        for (RegistryObject<Block> blockRO : BlockInit.STONES.getEntries()) {
            Block block = blockRO.get();
            UnmodifiableConfig config = ConfigHandler.getConfig(block);
            if (block instanceof SimpleBlock) {
                SimpleBlock simpleBlock = (SimpleBlock) block;
                String blockName = Objects.requireNonNull(simpleBlock.getRegistryName()).toString();
                ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get(PathBuilder.getBiomeBlacklistFullPath(blockName));
                List<String> biomeList = inBiomeFCS.get();
                ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get(PathBuilder.getTemperatureBlacklistFullPath(blockName));
                List<String> tempList = inTempFCS.get();
                for (String name : biomeList) {
                    if (!biomeVerify.contains(name)) {
                        Main.LOGGER.warn("Invalid biome '" + name + "' in Danny's Ores Config in Biome Blacklist for '" + blockName + "', please check the entries!");
                    }
                }
                for (String temp : tempList) {
                    if (!tempVerify.contains(temp)) {
                        Main.LOGGER.warn("Invalid temperature '" + temp + "' in Danny's Ores Config in Temperature Blacklist for '" + blockName + "', please check the entries!");
                    }
                }
            }
        }
    }
}
