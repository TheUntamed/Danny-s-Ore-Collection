package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Blocks.BasicOre;
import com.danny.dannys_ores.Blocks.BasicOreItem;
import com.danny.dannys_ores.Config;
import com.danny.dannys_ores.Main;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

//@ObjectHolder(Main.MOD_ID)
//@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class BlockInit {

    @ObjectHolder(Main.MOD_ID + ":stone_copper_ore")
    public static final BasicOre STONE_COPPER_ORE = null;

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class OresRegistryEvents {

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            registerBlock(event, Config.harvestLevelStoneCopperOre.get(), Config.hardnessLevelStoneCopperOre.get(), Config.resistanceLevelStoneCopperOre.get(), Config.lightValueStoneCopperOre.get(), "stone_copper_ore");
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            registerItemBlock(STONE_COPPER_ORE, event);
        }

        private static void registerBlock(RegistryEvent.Register<Block> event, int harvestLevel, double hardnessLevel, double resistanceLevel, int lightValue, String name) {
            event.getRegistry().register(new BasicOre(Block.Properties.create(Material.ROCK).hardnessAndResistance((float) hardnessLevel, (float) resistanceLevel).lightValue(lightValue).harvestTool(net.minecraftforge.common.ToolType.PICKAXE).harvestLevel(harvestLevel)).setRegistryName(name));
        }

        private static void registerItemBlock(BasicOre block, RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BasicOreItem(block, new Item.Properties().group(Main.TAB)).setRegistryName(block.getRegistryName()));
        }
    }
}
