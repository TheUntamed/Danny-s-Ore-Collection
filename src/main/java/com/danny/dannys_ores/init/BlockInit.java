package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Blocks.BasicOre;
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

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);
    public static final RegistryObject<Block> STONE_COPPER_ORE = BLOCKS.register("stone_copper_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(Config.hardnessLevelStoneCopperOre.get().floatValue(), Config.resistanceLevelStoneCopperOre.get().floatValue()).harvestLevel(Config.harvestLevelStoneCopperOre.get()).lightValue(Config.lightValueStoneCopperOre.get())));
//    public static final RegistryObject<Block> ANDESITE_COPPER_ORE = BLOCKS.register("andesite_copper_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(Config.hardnessLevelAndesiteCopperOre.get().floatValue(), Config.resistanceLevelAndesiteCopperOre.get().floatValue()).harvestLevel(Config.harvestLevelAndesiteCopperOre.get()).lightValue(Config.lightValueAndesiteCopperOre.get())));
//    public static final RegistryObject<Block> DIORITE_COPPER_ORE = BLOCKS.register("diorite_copper_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(Config.hardnessLevelDioriteCopperOre.get().floatValue(), Config.resistanceLevelDioriteCopperOre.get().floatValue()).harvestLevel(Config.harvestLevelDioriteCopperOre.get()).lightValue(Config.lightValueDioriteCopperOre.get())));
//    public static final RegistryObject<Block> GRANITE_COPPER_ORE = BLOCKS.register("granite_copper_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(Config.hardnessLevelGraniteCopperOre.get().floatValue(), Config.resistanceLevelGraniteCopperOre.get().floatValue()).harvestLevel(Config.harvestLevelGraniteCopperOre.get()).lightValue(Config.lightValueGraniteCopperOre.get())));
//    public static final RegistryObject<Block> NETHERRACK_COPPER_ORE = BLOCKS.register("netherrack_copper_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(Config.hardnessLevelNetherrackCopperOre.get().floatValue(), Config.resistanceLevelNetherrackCopperOre.get().floatValue()).harvestLevel(Config.harvestLevelNetherrackCopperOre.get()).lightValue(Config.lightValueNetherrackCopperOre.get())));
//    public static final RegistryObject<Block> END_STONE_COPPER_ORE = BLOCKS.register("end_stone_copper_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(Config.hardnessLevelEndStoneCopperOre.get().floatValue(), Config.resistanceLevelEndStoneCopperOre.get().floatValue()).harvestLevel(Config.harvestLevelEndStoneCopperOre.get()).lightValue(Config.lightValueEndStoneCopperOre.get())));

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
