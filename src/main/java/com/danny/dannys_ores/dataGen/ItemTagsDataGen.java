package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;

public class ItemTagsDataGen extends ItemTagsProvider {
    private ArrayList<Item> ores = new ArrayList<>();
    private ArrayList<Item> oreType = new ArrayList<>();

    public ItemTagsDataGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerTags() {
        OreTypes type = null;
        for (RegistryObject<Block> regObj : BlockInit.BLOCKS.getEntries()) {
            Block block = regObj.get();
            if (block instanceof BaseOre) {
                // Because the ores are grouped by type in the BlockInit classes
                // all ores of one type will always come after each other.
                if (type == null) {
                    type = ((BaseOre) block).getOreType();
                    oreType.add(block.asItem());
                } else if (type != ((BaseOre) block).getOreType()) {
                    addForgeTag("ores/" + type.toString().toLowerCase(), oreType);
                    oreType.clear();
                    type = ((BaseOre) block).getOreType();
                } else {
                    oreType.add(block.asItem());
                }
                ores.add(block.asItem());

            }
        }
        addForgeTag("ores", ores);
    }

    private void addForgeTag(String name, ArrayList<Item> itemsIn) {
        Item[] items = itemsIn.toArray(new Item[0]);
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
