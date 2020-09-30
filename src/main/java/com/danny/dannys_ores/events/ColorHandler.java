package com.danny.dannys_ores.events;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blockItems.GrayScaleBlockItem;
import com.danny.dannys_ores.blocks.GrayScaleBlock;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.init.BlockItemInit;
import com.danny.dannys_ores.init.ItemInit;
import com.danny.dannys_ores.items.GrayScaleItem;
import com.danny.dannys_ores.items.SimpleItem;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;

public class ColorHandler {

    @SubscribeEvent
    public void registerEvent(ColorHandlerEvent.Item event) {
        for (RegistryObject<Item> itemRo : ItemInit.GRAYSCALE_ITEMS.getEntries()) {
            Item item = itemRo.get();
            if (item instanceof GrayScaleItem) {
                GrayScaleItem grayScaleItem = (GrayScaleItem) item;
                event.getItemColors().register(grayScaleItem.getColor(), item);
            }
        }
        for (RegistryObject<Block> blockRo : BlockInit.GRAYSCALE_BLOCKS.getEntries()) {
            Block block = blockRo.get();
//            if (block instanceof  GrayScaleBlock) {
//                Item blockItem = block.asItem();
//                GrayScaleItem grayScaleItem = (GrayScaleItem) blockItem;
//                event.getItemColors().register(grayScaleItem.getColor(), blockItem);
//            }
            Item blockItem = block.asItem();
            if (blockItem instanceof GrayScaleBlockItem) {
                GrayScaleBlockItem grayScaleItem = (GrayScaleBlockItem) blockItem;
                event.getItemColors().register(grayScaleItem.getColor(), blockItem);
            }
        }
    }

    @SubscribeEvent
    public void registerEvent(ColorHandlerEvent.Block event) {
        for (RegistryObject<Block> blockRo : BlockInit.GRAYSCALE_BLOCKS.getEntries()) {
            Block block = blockRo.get();
            if (block instanceof GrayScaleBlock) {
                GrayScaleBlock grayScaleBlock = (GrayScaleBlock) block;
                event.getBlockColors().register(grayScaleBlock.getBlockColor(), block);
            }
        }
    }
}
