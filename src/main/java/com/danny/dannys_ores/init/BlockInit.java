package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Blocks.BasicOre;
import com.danny.dannys_ores.Main;
import net.minecraft.block.Block;
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
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> STONE_COPPER_ORE = BLOCKS.register("stone_copper_ore", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> STONE_TIN_ORE = BLOCKS.register("stone_tin_ore", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> STONE_SILVER_ORE = BLOCKS.register("stone_silver_ore", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> STONE_LEAD_ORE = BLOCKS.register("stone_lead_ore", () -> new Block(Block.Properties.create(Material.ROCK)));

//    public static final Block STONE_COPPER_ORE = null;
//    public static final Block STONE_TIN_ORE = null;
//    public static final Block STONE_SILVER_ORE = null;
//    public static final Block STONE_LEAD_ORE = null;
//
//    @SubscribeEvent
//    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
//        event.getRegistry().register(new BasicOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("stone_copper_ore"));
//        event.getRegistry().register(new BasicOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("stone_tin_ore"));
//        event.getRegistry().register(new BasicOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("stone_silver_ore"));
//        event.getRegistry().register(new BasicOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("stone_lead_ore"));
//    }
//
//    @SubscribeEvent
//    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
//        event.getRegistry().register(new BlockItem(STONE_COPPER_ORE, new Item.Properties().group(Main.TAB)).setRegistryName("stone_copper_ore"));
//        event.getRegistry().register(new BlockItem(STONE_TIN_ORE, new Item.Properties().group(Main.TAB)).setRegistryName("stone_tin_ore"));
//        event.getRegistry().register(new BlockItem(STONE_SILVER_ORE, new Item.Properties().group(Main.TAB)).setRegistryName("stone_silver_ore"));
//        event.getRegistry().register(new BlockItem(STONE_LEAD_ORE, new Item.Properties().group(Main.TAB)).setRegistryName("stone_lead_ore"));
//
//    }

}
