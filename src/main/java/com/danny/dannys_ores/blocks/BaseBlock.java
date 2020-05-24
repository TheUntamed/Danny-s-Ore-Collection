package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.util.OreTypes;
import net.minecraft.block.Block;

public class BaseBlock extends Block {
    private Block blockBase;

    public BaseBlock(Block.Properties properties, Block blockBase) {
        super(properties);
        this.blockBase = blockBase;
    }

    public Block getBlockBase() {
        return blockBase;
    }
}
