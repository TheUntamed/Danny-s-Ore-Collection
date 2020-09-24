package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.init.ItemInit;
import com.danny.dannys_ores.items.GrayScaleItem;
import com.danny.dannys_ores.util.Forms;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
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
        for (RegistryObject<Block> block : BlockInit.ORES.getEntries()) {
            registerBlockItemModel(block);
        }
        for (RegistryObject<Block> block : BlockInit.STONES.getEntries()) {
            registerBlockItemModel(block);
        }
        for (RegistryObject<Block> block : BlockInit.GRAYSCALE_BLOCKS.getEntries()) {
            registerBlockItemModel(block);
        }

        for (RegistryObject<Item> item : ItemInit.GRAYSCALE_ITEMS.getEntries()) {
            registerItemModel(item);
        }
    }

    private void registerBlockItemModel(RegistryObject<Block> regObj) {
        ResourceLocation resLoc = regObj.get().getRegistryName();
        assert resLoc != null;
        String blockName = resLoc.toString().split(":")[1];
        blockParented(resLoc, "block/" + blockName);
    }

    private void registerItemModel(RegistryObject<Item> regObj) {
        Item item = regObj.get();
        String textureName;
        ResourceLocation resLoc = item.getRegistryName();
        assert resLoc != null;
        if (item instanceof GrayScaleItem) {
            GrayScaleItem grayItem = (GrayScaleItem) item;
            Forms form = grayItem.getForm();
            textureName = form.getName();
        } else {
            textureName = resLoc.toString().split(":")[1];
        }
        itemGenerated(resLoc, "item/" + textureName);
    }

    private void itemGenerated(ResourceLocation resLoc, String texture) {
        Main.LOGGER.debug("Creating generated item model for " + resLoc);
        getBuilder(resLoc.getPath()).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0",
                modLoc(texture));
    }

    private void blockParented(ResourceLocation resLoc, String model) {
        Main.LOGGER.debug("Creating item block model for " + resLoc);
        getBuilder(resLoc.getPath()).parent(new ModelFile.UncheckedModelFile(modLoc(model)));
    }

    @Override
    public String getName() {
        return "Danny's Ores - Item Models";
    }
}
