package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseBlock;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.fml.RegistryObject;

public class BlockModelsDataGen extends BlockModelProvider {

    public BlockModelsDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        Main.LOGGER.debug("registerBlockModels");
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();
            Block fillerBlock;
                if (block instanceof BaseBlock) {
                    fillerBlock = ((BaseBlock) block).getBlockBase();
                    String fillerBlockName;
                    String blockName = block.getRegistryName().toString().split(":")[1];
                    //When the fillerblock is from another mod it is unknown and the name has to be created by stringsplitting
                    //that's not fancy but it only has to generate the jsons once.
                    if (fillerBlock == null) {
                        String[] name = blockName.split("_", 3);
                        fillerBlockName = name[0] + "_" + name[1];
                    } else {
                        ResourceLocation resLoc = fillerBlock.getRegistryName();
                        fillerBlockName = resLoc.toString().split(":")[1];
                    }
                    String typeName = blockName.replace(fillerBlockName + "_", "");
                    doubleTextureBlock(block, "block/" + fillerBlockName, "block/" + typeName);
            }
        }

    }

    public void doubleTextureBlock(Block block, String textureBackground, String textureOverlay) {
        getBuilder(block.getRegistryName().getPath()).parent(getModelFile()).texture("base", textureBackground).texture("overlay", textureOverlay);

        Main.LOGGER.debug("Creating block models model for " + block.getRegistryName());
    }

    private ModelFile getModelFile() {
        return new ModelFile.UncheckedModelFile(modLoc("block/cube_overlayed"));
    }

    @Override
    public String getName() { return "Danny's Ores - Block Models"; }
}
