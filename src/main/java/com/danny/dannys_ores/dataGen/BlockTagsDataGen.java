package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;

public class BlockTagsDataGen extends BlockTagsProvider {
    private ArrayList<Block> oreType = new ArrayList<>();
    private ArrayList<Block> ores = new ArrayList<>();
    private ArrayList<Block> stone = new ArrayList<>();
    private ArrayList<Block> cobblestone = new ArrayList<>();

    public BlockTagsDataGen(DataGenerator generator) {
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
                    SimpleOre oreBlock = (SimpleOre) block;
                    // Because the ores are grouped by type in the BlockInit classes
                    // all ores of one type will always come after each other.
                    ores.add(oreBlock);
                    if (oType == null) {
                        oType = oreBlock.getOreType();
                        rType = oreBlock.getRichnessType();
                        oreType.add(oreBlock);
                    } else if (oType != oreBlock.getOreType()) {
                        if (rType.equals(RichnessTypes.NORMAL)) {
                            addForgeTag("ores/" + oType.toString().toLowerCase(), oreType);
                        } else {
                            addForgeTag("ores/" + rType.toString().toLowerCase() + "_" + oType.toString().toLowerCase(), oreType);
                        }
                        oreType.clear();
                        oType = oreBlock.getOreType();
                        rType = oreBlock.getRichnessType();
                        oreType.add(oreBlock);
                    } else {
                        oreType.add(oreBlock);
                    }

                } else {
                    SimpleBlock simpleBlock = (SimpleBlock) block;
                    stone.add(simpleBlock);
                }
            } else {
                cobblestone.add(block);
            }
        }
        addForgeTag("ores", ores);
        addForgeTag("stone", stone);
    }

    private void addForgeTag(String name, ArrayList<Block> blocksIn) {
        Block[] blocks = blocksIn.toArray(new Block[0]);
        Main.LOGGER.debug("Creating block tag for forge: " + name);
        ResourceLocation loc = new ResourceLocation("forge", name);
        getBuilder(new Tag<Block>(loc)).replace(false).add(blocks).build(loc);
    }

    @Override
    public String getName() {
        return "Danny's Ores - Block Tags";
    }
}
