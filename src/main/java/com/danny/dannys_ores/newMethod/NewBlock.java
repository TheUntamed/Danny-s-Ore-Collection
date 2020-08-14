package com.danny.dannys_ores.newMethod;

import net.minecraft.block.Block;

public class NewBlock extends Block {
    private final MaterialType mType;
    private final StoneVariant variant;

    public NewBlock(Block.Properties properties, MaterialType mType, StoneVariant variant) {
        super(properties);
        this.mType = mType;
        this.variant = variant;
    }

    public MaterialType getMaterialType() {
        return mType;
    }

    public StoneVariant getStoneVariant() {
        return variant;
    }
}
