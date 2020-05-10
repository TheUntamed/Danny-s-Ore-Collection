package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
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
                singleTextureBlock(block.get(), blockName, "block/" + blockName);
            }
        }
    }

    public void singleTextureBlock(Block block, String model, String textureName) {
        simpleBlock(block);
        Main.LOGGER.debug("Creating block states model for :" + block.getRegistryName());
    }

    @Override
    public String getName() {
        return "Danny's Ores - Blockstates";
    }
}
