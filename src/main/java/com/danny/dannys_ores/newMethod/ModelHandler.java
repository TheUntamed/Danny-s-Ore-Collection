package com.danny.dannys_ores.newMethod;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blockItems.GrayScaleBlockItem;
import com.danny.dannys_ores.blocks.GrayScaleBlock;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.init.ItemInit;
import com.danny.dannys_ores.items.GrayScaleItem;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;

import java.util.Map;

public class ModelHandler {
    @SubscribeEvent
    public void onModelBake(ModelBakeEvent event) {
        Main.LOGGER.debug("Start ModelBakeEvent");
        ResourceLocation resLocItem = new ResourceLocation(Main.MOD_ID, "item/plate");
        IBakedModel itemModel = Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelShapes().getModelManager().getModel(resLocItem);
        for (RegistryObject<Item> itemRo : ItemInit.GRAYSCALE_ITEMS.getEntries()) {
            Item item = itemRo.get();
            if (item instanceof GrayScaleItem) {
                Main.LOGGER.debug("The old item model: " + event.getModelRegistry().get(new ModelResourceLocation(item.getRegistryName(), "inventory")));
                Main.LOGGER.debug("The new item model: " + itemModel);
                event.getModelRegistry().replace(new ModelResourceLocation(item.getRegistryName(), "inventory"), itemModel);
            }
        }

        ResourceLocation resLocBlock = new ResourceLocation(Main.MOD_ID, "block/casing");
        ResourceLocation resLocBlockItem = new ResourceLocation(Main.MOD_ID, "item/casing");
        IBakedModel blockModel = Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelShapes().getModelManager().getModel(resLocBlock);
        IBakedModel blockItemModel = Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelShapes().getModelManager().getModel(resLocBlockItem);
        for (RegistryObject<Block> blockRo : BlockInit.GRAYSCALE_BLOCKS.getEntries()) {
            Block block = blockRo.get();
            if (block instanceof GrayScaleBlock) {
                Main.LOGGER.debug("Change block model");
                Main.LOGGER.debug("The block: " + block);
                Main.LOGGER.debug("The old block model: " + event.getModelRegistry().get(block.getRegistryName()));
                Main.LOGGER.debug("The new block model: " + blockModel);
                event.getModelRegistry().replace(block.getRegistryName(), blockModel);
            }
            Item blockItem = block.asItem();
            if (blockItem instanceof GrayScaleBlockItem) {
                Main.LOGGER.debug("Change block item model");
                Main.LOGGER.debug("The block item: " + blockItem);
                Main.LOGGER.debug("The old block item model: " + event.getModelRegistry().get(blockItem.getRegistryName()));
                Main.LOGGER.debug("The new block item model: " + blockItemModel);
                event.getModelRegistry().replace(blockItem.getRegistryName(), blockItemModel);
            }
        }
    }
}
