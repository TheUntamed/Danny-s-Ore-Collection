package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.items.SimpleItem;
import com.danny.dannys_ores.util.Forms;
import com.danny.dannys_ores.util.MaterialTypes;
import com.danny.dannys_ores.util.MineralTypes;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void initItems() {
        Main.LOGGER.debug("Start item init.");
        for (Forms form : Forms.values()) {
            if (!form.getIsBlock()) {
                for (MaterialTypes material : MaterialTypes.values()) {
                    MineralTypes mType = material.getMineralType();
                    if (!material.getFormsToExclude().contains(form)) {
                        ITEMS.register(material.getName() + "_" + form.getName(), () -> new SimpleItem(new Item.Properties().group(Main.MyItemGroupItems.instance), mType, material, form));
                    }
                }
            }
        }
        Main.LOGGER.debug("Finished item init.");
    }
}
