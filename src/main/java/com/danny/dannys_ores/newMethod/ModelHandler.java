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
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;

import java.util.Map;

public class ModelHandler {
    @SubscribeEvent
    public void onModelBake(ModelBakeEvent event) {
        ResourceLocation resLocBlock = new ResourceLocation(Main.MOD_ID, "block/casing");
        ResourceLocation resLocBlockItem = new ResourceLocation(Main.MOD_ID, "item/casing");
        ResourceLocation resLocItem = new ResourceLocation(Main.MOD_ID, "item/plate");
        IBakedModel blockModel = Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelShapes().getModelManager().getModel(resLocBlock);
        IBakedModel blockItemModel = Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelShapes().getModelManager().getModel(resLocBlockItem);
        IBakedModel itemModel = Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelShapes().getModelManager().getModel(resLocItem);
        for (RegistryObject<Item> itemRo : ItemInit.GRAYSCALE_ITEMS.getEntries()) {
            Item item = itemRo.get();
            if (item instanceof GrayScaleItem) {
                event.getModelRegistry().replace(item.getRegistryName(), itemModel);
            }
        }
        for (RegistryObject<Block> blockRo : BlockInit.GRAYSCALE_BLOCKS.getEntries()) {
            Block block = blockRo.get();
            if (block instanceof GrayScaleBlock) {
                event.getModelRegistry().replace(block.getRegistryName(), blockModel);
            }
            Item blockItem = block.asItem();
            if (blockItem instanceof GrayScaleBlockItem) {
                event.getModelRegistry().replace(blockItem.getRegistryName(), blockItemModel);
            }
        }
    }
}
