package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public class BaseBlock extends Block {
    private Block blockBase;

    public BaseBlock(Block.Properties properties, Block blockBase) {
        super(properties);
        this.blockBase = blockBase;
    }

    public Block getBlockBase() {
        if (blockBase == null) {
            ResourceLocation resLoc = this.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString();
                if (blockName.contains("quark_basalt")) {
                    return BlockInit.QUARK_BASALT;
                } else if (blockName.contains("quark_limestone")) {
                    return BlockInit.QUARK_LIMESTONE;
                } else if (blockName.contains("quark_jasper")) {
                    return BlockInit.QUARK_JASPER;
                } else if (blockName.contains("quark_marble")) {
                    return BlockInit.QUARK_MARBLE;
                } else if (blockName.contains("quark_slate")) {
                    return BlockInit.QUARK_SLATE;
                } else if (blockName.contains("embellishcraft_basalt")) {
                    return BlockInit.EMBELLISHCRAFT_BASALT;
                } else if (blockName.contains("embellishcraft_gneiss")) {
                    return BlockInit.EMBELLISHCRAFT_GNEISS;
                } else if (blockName.contains("embellishcraft_jade")) {
                    return BlockInit.EMBELLISHCRAFT_JADE;
                } else if (blockName.contains("embellishcraft_larvikite")) {
                    return BlockInit.EMBELLISHCRAFT_LARVIKITE;
                } else if (blockName.contains("embellishcraft_marble")) {
                    return BlockInit.EMBELLISHCRAFT_MARBLE;
                } else if (blockName.contains("embellishcraft_slate")) {
                    return BlockInit.EMBELLISHCRAFT_SLATE;
                } else {
                    throw new IllegalArgumentException("Variant of Block '" + this + "' is not handled in getBlockBase!");
                }
            } else {
                throw new NullPointerException("Block '" + this + "' has no registry name!");
            }
        } else {
            return blockBase;
        }
    }
}
