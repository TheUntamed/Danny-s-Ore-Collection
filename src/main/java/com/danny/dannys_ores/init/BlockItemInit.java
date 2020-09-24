package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blockItems.*;
import com.danny.dannys_ores.blocks.GrayScaleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.util.OreTypes;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.List;

public class BlockItemInit {

    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.ORES.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(Main.MyItemGroupOres.instance);
            ResourceLocation resLoc = block.getRegistryName();
            assert resLoc != null;
            if (block instanceof SimpleOre) {
                SimpleOre oreBlock = (SimpleOre) block;
                OreTypes oType = oreBlock.getOreType();
                if (oType.equals(OreTypes.VULCANITE) || oType.equals(OreTypes.FIRE)) {
                    final HotBlockItem blockItem = new HotBlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                } else if (oType.equals(OreTypes.URANINITE)) {
                    final ToxicBlockItem blockItem = new ToxicBlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                } else if (oType.equals(OreTypes.YELLORITE)) {
                    final ToxicBlockItem blockItem = new ToxicBlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                } else if (oType.equals(OreTypes.AIR)) {
                    final LightBlockItem blockItem = new LightBlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                } else if (oType.equals(OreTypes.EARTH)) {
                    final HeavyBlockItem blockItem = new HeavyBlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                } else if (oType.equals(OreTypes.WATER)) {
                    final DrowningBlockItem blockItem = new DrowningBlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                } else {
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                }
            } else {
                final BlockItem blockItem = new BlockItem(block, properties);
                blockItem.setRegistryName(resLoc);
                registry.register(blockItem);
            }
        });
        BlockInit.GRAYSCALE_BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            if (block instanceof GrayScaleBlock) {
                GrayScaleBlock grayScaleBlock = (GrayScaleBlock) block;
                Main.LOGGER.debug("Register GrayScale BlockItems!");
                grayScaleBlockItemRegistry(grayScaleBlock, registry);
            }
        });
        BlockInit.STONES.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            simpleBlockItemRegistry(block, registry);
        });

        Main.LOGGER.debug("Registered BlockItems!");

//        BlockInit.NEW_BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
//            final Item.Properties properties = new Item.Properties().group(MyItemGroup.instance);
//            final BlockItem blockItem = new BlockItem(block, properties);
//            blockItem.setRegistryName(block.getRegistryName());
//            registry.register(blockItem);
//        });
    }

    private static void grayScaleBlockItemRegistry(GrayScaleBlock block, IForgeRegistry<Item> registry) {
        final Item.Properties properties = new Item.Properties().group(Main.MyItemGroupOres.instance);
        ResourceLocation resLoc = block.getRegistryName();
        assert resLoc != null;
        final BlockItem blockItem = new GrayScaleBlockItem(block, properties, block.getItemColor());
        blockItem.setRegistryName(resLoc);
        registry.register(blockItem);
    }

    private static void simpleBlockItemRegistry(Block block, IForgeRegistry<Item> registry) {
        final Item.Properties properties = new Item.Properties().group(Main.MyItemGroupOres.instance);
        ResourceLocation resLoc = block.getRegistryName();
        assert resLoc != null;
        final BlockItem blockItem = new BlockItem(block, properties);
        blockItem.setRegistryName(resLoc);
        registry.register(blockItem);
    }
}
