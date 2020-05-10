package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ItemTagsDataGen extends ItemTagsProvider {
    public ItemTagsDataGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerTags()
    {
        //addForgeTag("ores/coal", BlockInit.ANDESITE_COAL_ORE.get());
    }

    private void addForgeTag(String name, Item... items) {
        Main.LOGGER.debug("Creating item tag for forge: " + name);
        ResourceLocation loc = new ResourceLocation("forge", name);
        getBuilder(new Tag<Item>(loc)).replace(false).add(items).build(loc);
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Item Tags";
    }
}
