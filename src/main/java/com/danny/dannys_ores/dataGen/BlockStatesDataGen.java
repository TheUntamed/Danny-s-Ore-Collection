package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class BlockStatesDataGen extends BlockStateProvider {

    public BlockStatesDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        singleTextureBlock(BlockInit.ANDESITE_COAL_ORE.get(), "andesite_coal_ore", "block/andesite_coal_ore");
    }

    public void singleTextureBlock(Block block, String model, String textureName) {
        simpleBlock(block);
        Main.LOGGER.debug("Creating block states model for :" + block.getRegistryName());
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Blockstates";
    }
}
