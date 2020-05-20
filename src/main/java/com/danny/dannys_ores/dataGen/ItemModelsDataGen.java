package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.fml.RegistryObject;

public class ItemModelsDataGen extends ItemModelProvider {

        public ItemModelsDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
            super(generator, modid, existingFileHelper);
        }

        @Override
        protected void registerModels() {
                Main.LOGGER.debug("registerItemModels");
                for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
                        ResourceLocation resLoc = block.get().getRegistryName();
                        if (resLoc != null) {
                                String blockName = block.get().getRegistryName().toString().split(":")[1];
                                blockParented(block.get(), "block/" + blockName);
                        }
                }
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
