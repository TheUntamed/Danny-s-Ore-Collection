package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class BlockTagsDataGen extends BlockTagsProvider {

    public BlockTagsDataGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags()
    {
        addForgeTag("ores/coal", BlockInit.ANDESITE_COAL_ORE.get());
    }

    private void addForgeTag(String name, Block... blocks) {
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
