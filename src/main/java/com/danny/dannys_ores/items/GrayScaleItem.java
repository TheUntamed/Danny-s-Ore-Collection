package com.danny.dannys_ores.items;

import com.danny.dannys_ores.util.Forms;
import com.danny.dannys_ores.util.MaterialTypes;
import com.danny.dannys_ores.util.MineralTypes;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;

public class GrayScaleItem extends SimpleItem implements GrayScaleItems {

    private final IItemColor color;

    public GrayScaleItem (Item.Properties properties, MineralTypes mType, MaterialTypes material, Forms form, IItemColor color) {
        super(properties, mType, material, form);
        this.color = color;
    }

    public IItemColor getColor() {
        return color;
    }
}
