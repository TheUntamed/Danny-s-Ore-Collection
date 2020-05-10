package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

public class ItemModelsDataGen extends ItemModelProvider {

        public ItemModelsDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
            super(generator, modid, existingFileHelper);
        }

        @Override
        protected void registerModels() {
                blockParented(BlockInit.ANDESITE_COAL_ORE.get(), "block/andesite_coal_ore");
        }

        public void blockParented(Block block, String model) {
                Main.LOGGER.debug("Creating item block model for " + block.getRegistryName());
                getBuilder(block.getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(modLoc(model)));
        }

        @Override
        public String getName() {
                return "Danny's Ores - Item Models";
        }
}
