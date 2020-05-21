package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.fml.RegistryObject;

public class BlockStatesDataGen extends BlockStateProvider {

    public BlockStatesDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
            ResourceLocation resLoc = block.get().getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                singleTextureBlock(block.get(), blockName);
            }
        }
    }

    public void singleTextureBlock(Block block, String modelName) {
        System.err.println("modelName: " + modelName);
        simpleBlock(block, getModelFile(modelName));
        Main.LOGGER.debug("Creating block states model for :" + block.getRegistryName());
    }

    private ModelFile getModelFile(String modelName) {
        return new ModelFile.UncheckedModelFile(modLoc("block/" + modelName));
    }

    @Override
    public String getName() {
        return "Danny's Ores - Blockstates";
    }
}
