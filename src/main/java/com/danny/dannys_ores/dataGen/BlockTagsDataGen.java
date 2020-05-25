package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseBlock;
import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;

public class BlockTagsDataGen extends BlockTagsProvider {
    private ArrayList<Block> oreType = new ArrayList<>();
    private ArrayList<Block> ores = new ArrayList<>();


    public BlockTagsDataGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        OreTypes type = null;
        for (RegistryObject<Block> regObj : BlockInit.BLOCKS.getEntries()) {
            Block block = regObj.get();
            if (block instanceof BaseOre) {
                System.err.println("The OreType: " + type);
                // Because the ores are grouped by type in the BlockInit classes
                // all ores of one type will always come after each other.
                ores.add(block);
                if (type == null) {
                    type = ((BaseOre) block).getOreType();
                    oreType.add(block);
                } else if (type != ((BaseOre) block).getOreType()) {
                    addForgeTag("ores/" + type.toString().toLowerCase(), oreType);
                    oreType.clear();
                    type = ((BaseOre) block).getOreType();
                    oreType.add(block);
                } else {
                    oreType.add(block);
                }

            }
        }
        addForgeTag("ores", ores);
    }

    private void addForgeTag(String name, ArrayList<Block> blocksIn) {
        Block[] blocks = blocksIn.toArray(new Block[0]);
        Main.LOGGER.debug("Creating block tag for forge: " + name);
        ResourceLocation loc = new ResourceLocation("forge", name);
        getBuilder(new Tag<Block>(loc)).replace(false).add(blocks).build(loc);
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Block Tags";
    }
}
