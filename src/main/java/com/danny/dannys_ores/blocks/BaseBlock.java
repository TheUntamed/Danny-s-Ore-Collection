package com.danny.dannys_ores.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistryEntry;

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
