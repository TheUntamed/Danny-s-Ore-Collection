package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.util.Forms;
import com.danny.dannys_ores.util.MaterialTypes;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;

public class GrayScaleBlock extends SimpleBlock {

    private final IBlockColor blockColor;
    private final IItemColor itemColor;
    private final MaterialTypes material;
    private final Forms form;

    public GrayScaleBlock(Block.Properties properties, MaterialTypes material, Forms form, IBlockColor blockColor, IItemColor itemColor) {
        super(properties);
        this.material = material;
        this.form = form;
        this.itemColor = itemColor;
        this.blockColor = blockColor;
    }

    public Forms getForm() {
        return form;
    }

    public MaterialTypes getMaterial() {
        return material;
    }

    public IItemColor getItemColor() {
        return itemColor;
    }

    public IBlockColor getBlockColor() {
        return blockColor;
    }
}
