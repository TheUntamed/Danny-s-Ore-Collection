package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.VariantsModId;
import com.danny.dannys_ores.util.StoneVariants;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

/**
 * An object of this class represents a simple block of this mod.
 * All blocks of this class also generate in world.
 * A simple block has block properties, a block base (the stone variant that acts as filler block for the block),
 * and the modId of the block base as enum element.
 */
public class SimpleBlock extends Block {
    private StoneVariants blockBase;
    private VariantsModId blockBaseModId;

    public SimpleBlock(Block.Properties properties, StoneVariants blockBase, VariantsModId blockBaseModId) {
        super(properties);
        this.blockBase = blockBase;
        this.blockBaseModId = blockBaseModId;
    }

    /**
     *
     * @return The block base as enum element.
     */
    public StoneVariants getStoneVariant() {
        return blockBase;
    }

    /**
     * Transforms the block base enum element into the actual block and returns it.
     * TODO: Maybe there is a better method than a switch case to do this.
     *
     * @return The block base as actual block.
     */
    public Block getBlockBase() {
        switch (blockBase) {
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
            case EMBELLISHCRAFT_BASALT: return BlockInit.EMBELLISHCRAFT_BASALT;
            case EMBELLISHCRAFT_GNEISS: return BlockInit.EMBELLISHCRAFT_GNEISS;
            case EMBELLISHCRAFT_JADE: return BlockInit.EMBELLISHCRAFT_JADE;
            case EMBELLISHCRAFT_LARVIKITE: return BlockInit.EMBELLISHCRAFT_LARVIKITE;
            case EMBELLISHCRAFT_MARBLE: return BlockInit.EMBELLISHCRAFT_MARBLE;
            case EMBELLISHCRAFT_SLATE: return BlockInit.EMBELLISHCRAFT_SLATE;
            case QUARK_BASALT: return BlockInit.QUARK_BASALT;
            case QUARK_LIMESTONE: return BlockInit.QUARK_LIMESTONE;
            case QUARK_JASPER: return BlockInit.QUARK_JASPER;
            case QUARK_MARBLE: return BlockInit.QUARK_MARBLE;
            case QUARK_SLATE: return BlockInit.QUARK_SLATE;
            case MYSTICALAGRICULTURE_SOULSTONE: return BlockInit.MYSTICALAGRICULTURE_SOULSTONE;
            case MIDNIGHT_NIGHTSTONE: return BlockInit.MIDNIGHT_NIGHTSTONE;
            default:
                throw new IllegalArgumentException("For the ore '" + this + "' with block base '" + blockBase + "' no block base could be returned!");
        }
    }

    /**
     *
     * @return The modId of the block base as enum element.
     */
    public VariantsModId getBlockBaseModId() {
        return blockBaseModId;
    }
}
