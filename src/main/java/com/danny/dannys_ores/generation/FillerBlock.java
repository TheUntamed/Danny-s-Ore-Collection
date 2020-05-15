package com.danny.dannys_ores.generation;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;


public class FillerBlock {

    /**
     * The filler block of a block is the block that should be replaced by that block during generation.
     *
     * @param block The block for which the filler block should be returned.
     * @return The filler block of the given block.
     */
    public static Block getFillerBlock(Block block) throws NullPointerException {
        ResourceLocation resLoc = block.getRegistryName();
        if (resLoc != null) {
            String blockName = resLoc.toString().split(":")[1];
            if (blockName.contains("andesite_")) {
                return Blocks.ANDESITE;
            } else if (blockName.contains("bedrock_")) {
                return Blocks.BEDROCK;
            } else if (blockName.contains("blue_ice_")) {
                return Blocks.BLUE_ICE;
            } else if (blockName.contains("diorite_")) {
                return Blocks.DIORITE;
            } else if (blockName.contains("embellishcraft_basalt_")) {
                return BlockInit.EMBELLISHCRAFT_BASALT;
            } else if (blockName.contains("embellishcraft_gneiss_")) {
                return BlockInit.EMBELLISHCRAFT_GNEISS;
            } else if (blockName.contains("embellishcraft_jade_")) {
                return BlockInit.EMBELLISHCRAFT_JADE;
            } else if (blockName.contains("embellishcraft_larvikite_")) {
                return BlockInit.EMBELLISHCRAFT_LARVIKITE;
            } else if (blockName.contains("embellishcraft_marble_")) {
                return BlockInit.EMBELLISHCRAFT_MARBLE;
            } else if (blockName.contains("embellishcraft_slate_")) {
                return BlockInit.EMBELLISHCRAFT_SLATE;
            } else if (blockName.contains("end_stone_")) {
                return Blocks.END_STONE;
            } else if (blockName.contains("granite_")) {
                return Blocks.GRANITE;
            } else if (blockName.contains("gravel_")) {
                return Blocks.GRAVEL;
            } else if (blockName.contains("hardened_stone_")) {
                return BlockInit.HARDENED_STONE.get();
            } else if (blockName.contains("netherrack_")) {
                return Blocks.NETHERRACK;
            } else if (blockName.contains("packed_ice_")) {
                return Blocks.PACKED_ICE;
            } else if (blockName.contains("quark_basalt_")) {
                return BlockInit.QUARK_BASALT;
            } else if (blockName.contains("quark_jasper_")) {
                return BlockInit.QUARK_JASPER;
            } else if (blockName.contains("quark_limestone_")) {
                return BlockInit.QUARK_LIMESTONE;
            } else if (blockName.contains("quark_marble_")) {
                return BlockInit.QUARK_MARBLE;
            } else if (blockName.contains("quark_slate_")) {
                return BlockInit.QUARK_SLATE;
            } else if (blockName.contains("sand_")) {
                if (blockName.contains("red_sand_")) {
                    return Blocks.RED_SAND;
                } else {
                    return Blocks.SAND;
                }
            } else if (blockName.contains("sandstone_")) {
                if (blockName.contains("red_sandstone_")) {
                    return Blocks.RED_SANDSTONE;
                } else {
                    return Blocks.SANDSTONE;
                }
            } else if (blockName.contains("stone_")) {
                return Blocks.STONE;
            }
        } else {
            Main.LOGGER.warn("Registry name of block '" + block + "' is null!");
        }
        return Blocks.BARRIER;
    }
}
