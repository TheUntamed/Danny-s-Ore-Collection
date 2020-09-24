package com.danny.dannys_ores.blockItems;

import com.danny.dannys_ores.items.GrayScaleItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.BlockItem;

public class GrayScaleBlockItem extends BlockItem implements GrayScaleItems {

    private final IItemColor color;

    public GrayScaleBlockItem(Block blockIn, Properties builder, IItemColor color) {
        super(blockIn, builder);
        this.color = color;
    }

    public IItemColor getColor() {
        return color;
    }
}
