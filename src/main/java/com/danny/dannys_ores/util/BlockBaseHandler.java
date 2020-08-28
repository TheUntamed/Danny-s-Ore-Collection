package com.danny.dannys_ores.util;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.newMethod.StoneVariant;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.Objects;

public class BlockBaseHandler {

    /**
     * Transforms the block base enum element into the actual block and returns it.
     * TODO: Maybe there is a better method than a switch case to do this.
     *
     * @param variant A Stone Variant to get the corresponding block base for.
     * @return The block base as actual block.
     */
    public static Block getBlockBase(StoneVariants variant) {
        switch (variant) {
            case STONE: return Blocks.STONE;
            case DIORITE: return Blocks.DIORITE;
            case ANDESITE: return Blocks.ANDESITE;
            case GRANITE: return Blocks.GRANITE;
            case SAND: return Blocks.SAND;
            case RED_SAND: return Blocks.RED_SAND;
            case RED_SANDSTONE: return Blocks.RED_SANDSTONE;
            case SANDSTONE: return Blocks.SANDSTONE;
            case GRAVEL: return Blocks.GRAVEL;
            case PACKED_ICE: return Blocks.PACKED_ICE;
            case BLUE_ICE: return Blocks.BLUE_ICE;
            case BEDROCK: return Blocks.BEDROCK;
            case NETHERRACK: return Blocks.NETHERRACK;
            case END_STONE: return Blocks.END_STONE;
            case HARDENED_STONE: return BlockInit.HARDENED_STONE.get();
            case QUARK_BASALT: return BlockInit.QUARK_BASALT;
            case QUARK_LIMESTONE: return BlockInit.QUARK_LIMESTONE;
            case QUARK_JASPER: return BlockInit.QUARK_JASPER;
            case QUARK_MARBLE: return BlockInit.QUARK_MARBLE;
            case QUARK_SLATE: return BlockInit.QUARK_SLATE;
            case CREATE_DOLOMITE: return BlockInit.CREATE_DOLOMITE;
            case CREATE_GABBRO: return BlockInit.CREATE_GABBRO;
            case CREATE_LIMESTONE: return BlockInit.CREATE_LIMESTONE;
            case CREATE_SCORIA: return BlockInit.CREATE_SCORIA;
            case CREATE_WEATHERED_LIMESTONE: return BlockInit.CREATE_WEATHERED_LIMESTONE;
            case NETHERCRAFT_HEATSAND: return BlockInit.NETHERCRAFT_HEAT_SAND;
            case MYSTICALAGRICULTURE_SOULSTONE: return BlockInit.MYSTICALAGRICULTURE_SOULSTONE;
            case MIDNIGHT_NIGHTSTONE: return BlockInit.MIDNIGHT_NIGHTSTONE;
            case EMBELLISHCRAFT_BASALT: return BlockInit.EMBELLISHCRAFT_BASALT;
            case EMBELLISHCRAFT_GNEISS: return BlockInit.EMBELLISHCRAFT_GNEISS;
            case EMBELLISHCRAFT_JADE: return BlockInit.EMBELLISHCRAFT_JADE;
            case EMBELLISHCRAFT_LARVIKITE: return BlockInit.EMBELLISHCRAFT_LARVIKITE;
            case EMBELLISHCRAFT_MARBLE: return BlockInit.EMBELLISHCRAFT_MARBLE;
            case EMBELLISHCRAFT_SLATE: return BlockInit.EMBELLISHCRAFT_SLATE;
            case ATUM_ALABASTER: return BlockInit.ATUM_ALABASTER;
            case ATUM_MARL: return BlockInit.ATUM_MARL;
            case ATUM_CRACKED_LIMESTONE: return BlockInit.ATUM_CRACKED_LIMESTONE;
            case ATUM_LIMESTONE: return BlockInit.ATUM_LIMESTONE;
            case ATUM_LIMESTONE_GRAVEL: return BlockInit.ATUM_LIMESTONE_GRAVEL;
            case ATUM_PORPHYRY: return BlockInit.ATUM_PORPHYRY;
            case ATUM_STRANGE_SAND: return BlockInit.ATUM_STRANGE_SAND;
            case NETHEREX_FIERY_NETHERRACK: return BlockInit.NETHEREX_FIERY_NETHERRACK;
            case NETHEREX_ICY_NETHERRACK: return BlockInit.NETHEREX_ICY_NETHERRACK;
            case NETHEREX_GLOOMY_NETHERRACK: return BlockInit.NETHEREX_GLOOMY_NETHERRACK;
            case NETHEREX_LIVELY_NETHERRACK: return BlockInit.NETHEREX_LIVELY_NETHERRACK;
            case NETHEREX_BASALT: return BlockInit.NETHEREX_BASALT;
            case NETHEREX_FROSTBURN_ICE: return BlockInit.NETHEREX_FROSTBURN_ICE;
            default:
                throw new IllegalArgumentException("For the Stone Variant '" + variant +  "' no block base could be returned!");
        }
    }

    /**
     *
     * @param blockBase The Block.
     * @return The name of the Block.
     */
    public static String getBlockBaseName(Block blockBase) {
        return Objects.requireNonNull(blockBase.getRegistryName()).toString().split(":")[1];
    }

    /**
     *
     * @param variant The Stone Variant to get the name of the corresponding block base for.
     * @return The name of the block base.
     */
    public static String getBlockBaseName(StoneVariants variant) {
        Main.LOGGER.info("The BlockBase name: " + Objects.requireNonNull(getBlockBase(variant).getRegistryName()).toString().split(":")[1]);
        return Objects.requireNonNull(getBlockBase(variant).getRegistryName()).toString().split(":")[1];
    }
}
