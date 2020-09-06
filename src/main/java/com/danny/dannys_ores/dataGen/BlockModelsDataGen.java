package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import com.danny.dannys_ores.util.StoneVariants;
import com.danny.dannys_ores.util.VariantsModId;
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
        for (RegistryObject<Block> blockRO : BlockInit.ORES.getEntries()) {
            Block block = blockRO.get();
            ResourceLocation resLoc = block.getRegistryName();
            assert resLoc != null;
            if (block instanceof SimpleOre) {
                SimpleOre ore = (SimpleOre) block;
                StoneVariants variant = ore.getStoneVariant();
                RichnessTypes rType = ore.getRichnessType();
                OreTypes oType = ore.getOreType();
                String backgroundPath = "block/" + variant.getFullName();
                doubleTextureBlock(resLoc, backgroundPath,
                        "block/" + rType.getName() + "_" + oType.getName() + "_ore");
            } else {
                registerSimpleModel(resLoc);
            }
        }
        for (RegistryObject<Block> blockRO : BlockInit.STONES.getEntries()) {
            Block block = blockRO.get();
            ResourceLocation resLoc = block.getRegistryName();
            assert resLoc != null;
            registerSimpleModel(resLoc);
        }

        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();
            ResourceLocation resLoc = block.getRegistryName();
            assert resLoc != null;
            registerSimpleModel(resLoc);
        }
    }

    private void registerSimpleModel(ResourceLocation resLoc) {
        String blockName = resLoc.toString().replace(":", "_");
        doubleTextureBlock(resLoc, "block/" + blockName, "block/" + blockName);
    }

    public void doubleTextureBlock(ResourceLocation resLoc, String textureBackground, String textureOverlay) {

        getBuilder(resLoc.getPath()).parent(getModelFile()).texture("base", textureBackground).texture("overlay", textureOverlay);

        Main.LOGGER.debug("Creating block models model for " + resLoc);
    }

    private ModelFile getModelFile() {
        return new ModelFile.UncheckedModelFile(modLoc("block/cube_overlayed"));
    }

    @Override
    public String getName() {
        return "Danny's Ores - Block Models";
    }
}
