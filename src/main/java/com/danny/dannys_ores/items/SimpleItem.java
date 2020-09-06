package com.danny.dannys_ores.items;

import com.danny.dannys_ores.newMethod.models.MaterialType;
import com.danny.dannys_ores.util.Forms;
import com.danny.dannys_ores.util.MaterialTypes;
import com.danny.dannys_ores.util.MineralTypes;
import net.minecraft.item.Item;

public class SimpleItem extends Item {

    private final MineralTypes mType;
    private final MaterialTypes material;
    private final Forms form;

    public SimpleItem (Item.Properties properties, MineralTypes mType, MaterialTypes material, Forms form) {
        super(properties);
        this.mType = mType;
        this.material = material;
        this.form = form;
    }

    public MineralTypes getMType() {
        return mType;
    }

    public MaterialTypes getMaterial() {
        return material;
    }

    public Forms getForm() {
        return form;
    }
}
