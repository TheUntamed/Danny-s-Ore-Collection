package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
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
    private ArrayList<Item> stone = new ArrayList<>();
    private ArrayList<Item> cobblestone = new ArrayList<>();

    public ItemTagsDataGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        OreTypes oType = null;
        RichnessTypes rType = null;
        for (RegistryObject<Block> regObj : BlockInit.BLOCKS.getEntries()) {
            Block block = regObj.get();
            if (block instanceof SimpleBlock) {
                if (block instanceof SimpleOre) {
                    SimpleOre ore = (SimpleOre) block;
                    // Because the ores are grouped by type in the BlockInit classes
                    // all ores of one type will always come after each other.
                    ores.add(ore.asItem());
                    if (oType == null) {
                        oType = ore.getOreType();
                        rType = ore.getRichnessType();
                        oreType.add(ore.asItem());
                    } else if (oType != ore.getOreType()) {
                        if (rType.equals(RichnessTypes.NORMAL)) {
                            addForgeTag("ores/" + oType.toString().toLowerCase(), oreType);
                        } else {
                            addForgeTag("ores/" + rType.toString().toLowerCase() + "_" + oType.toString().toLowerCase(), oreType);
                        }
                        oreType.clear();
                        oType = ore.getOreType();
                        rType = ore.getRichnessType();
                        oreType.add(ore.asItem());
                    } else {
                        oreType.add(ore.asItem());
                    }

                } else {
                    SimpleBlock simpleBlock = (SimpleBlock) block;
                    stone.add(simpleBlock.asItem());
                }
            } else {
                cobblestone.add(block.asItem());
            }
        }
        addForgeTag("ores", ores);
        addForgeTag("stone", stone);
        addForgeTag("cobblestone", cobblestone);
    }

    private void addForgeTag(String name, ArrayList<Item> itemsIn) {
        Item[] items = itemsIn.toArray(new Item[0]);
        Main.LOGGER.debug("Creating item tag for forge: " + name);
        ResourceLocation loc = new ResourceLocation("forge", name);
        getBuilder(new Tag<Item>(loc)).replace(false).add(items).build(loc);
    }

    @Override
    public String getName() {
        return "Danny's Ores - Item Tags";
    }
}
