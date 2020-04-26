package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Blocks.BasicOre;
import com.danny.dannys_ores.Blocks.BasicOreItem;
import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Main.MOD_ID)
//@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class BlockInit {

    //@ObjectHolder(Main.MOD_ID + ":stone_copper_ore")
    public static final BasicOre STONE_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":andesite_copper_ore")
    public static final BasicOre ANDESITE_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":diorite_copper_ore")
    public static final BasicOre DIORITE_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":granite_copper_ore")
    public static final BasicOre GRANITE_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":netherrack_copper_ore")
    public static final BasicOre NETHERRACK_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":end_stone_copper_ore")
    public static final BasicOre END_STONE_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":sand_copper_ore")
    public static final BasicOre SAND_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":gravel_copper_ore")
    public static final BasicOre GRAVEL_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":sandstone_copper_ore")
    public static final BasicOre SANDSTONE_COPPER_ORE = null;
    //@ObjectHolder(Main.MOD_ID + ":red_sandstone_copper_ore")
    public static final BasicOre RED_SANDSTONE_COPPER_ORE = null;

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class OresRegistryEvents {

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            registerBlock(event, "stone_copper_ore", Copper.harvestLevelStoneCopperOre.get(), Copper.hardnessLevelStoneCopperOre.get(), Copper.resistanceLevelStoneCopperOre.get(), Copper.lightValueStoneCopperOre.get(), Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "andesite_copper_ore", Copper.harvestLevelAndesiteCopperOre.get(), Copper.hardnessLevelAndesiteCopperOre.get(), Copper.resistanceLevelAndesiteCopperOre.get(), Copper.lightValueAndesiteCopperOre.get(), Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "diorite_copper_ore", Copper.harvestLevelDioriteCopperOre.get(), Copper.hardnessLevelDioriteCopperOre.get(), Copper.resistanceLevelDioriteCopperOre.get(), Copper.lightValueDioriteCopperOre.get(), Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "granite_copper_ore", Copper.harvestLevelGraniteCopperOre.get(), Copper.hardnessLevelGraniteCopperOre.get(), Copper.resistanceLevelGraniteCopperOre.get(), Copper.lightValueGraniteCopperOre.get(), Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "netherrack_copper_ore", Copper.harvestLevelNetherrackCopperOre.get(), Copper.hardnessLevelNetherrackCopperOre.get(), Copper.resistanceLevelNetherrackCopperOre.get(), Copper.lightValueNetherrackCopperOre.get(), Material.ROCK, MaterialColor.NETHERRACK, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "end_stone_copper_ore", Copper.harvestLevelEndStoneCopperOre.get(), Copper.hardnessLevelEndStoneCopperOre.get(), Copper.resistanceLevelEndStoneCopperOre.get(), Copper.lightValueEndStoneCopperOre.get(), Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "sand_copper_ore", Copper.harvestLevelSandCopperOre.get(), Copper.hardnessLevelSandCopperOre.get(), Copper.resistanceLevelSandCopperOre.get(), Copper.lightValueSandCopperOre.get(), Material.SAND, MaterialColor.SAND, ToolType.PICKAXE, SoundType.SAND);
            registerBlock(event, "gravel_copper_ore", Copper.harvestLevelGravelCopperOre.get(), Copper.hardnessLevelGravelCopperOre.get(), Copper.resistanceLevelGravelCopperOre.get(), Copper.lightValueGravelCopperOre.get(), Material.SAND, MaterialColor.STONE, ToolType.PICKAXE, SoundType.GROUND);
            registerBlock(event, "sandstone_copper_ore", Copper.harvestLevelSandstoneCopperOre.get(), Copper.hardnessLevelSandstoneCopperOre.get(), Copper.resistanceLevelSandstoneCopperOre.get(), Copper.lightValueSandstoneCopperOre.get(), Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "red_sandstone_copper_ore", Copper.harvestLevelRedSandstoneCopperOre.get(), Copper.hardnessLevelRedSandstoneCopperOre.get(), Copper.resistanceLevelRedSandstoneCopperOre.get(), Copper.lightValueRedSandstoneCopperOre.get(), Material.ROCK, MaterialColor.ADOBE, ToolType.PICKAXE, SoundType.STONE);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            registerItemBlock(STONE_COPPER_ORE, event);
            registerItemBlock(ANDESITE_COPPER_ORE, event);
            registerItemBlock(DIORITE_COPPER_ORE, event);
            registerItemBlock(GRANITE_COPPER_ORE, event);
            registerItemBlock(NETHERRACK_COPPER_ORE, event);
            registerItemBlock(END_STONE_COPPER_ORE, event);
            registerItemBlock(SAND_COPPER_ORE, event);
            registerItemBlock(GRAVEL_COPPER_ORE, event);
            registerItemBlock(SANDSTONE_COPPER_ORE, event);
            registerItemBlock(RED_SANDSTONE_COPPER_ORE, event);
        }

        private static void registerBlock(RegistryEvent.Register<Block> event, String name, int harvestLevel, double hardnessLevel, double resistanceLevel, int lightValue, Material material, MaterialColor color, ToolType tool, SoundType sound) {
            event.getRegistry().register(new BasicOre(Block.Properties.create(material, color).hardnessAndResistance((float) hardnessLevel, (float) resistanceLevel).lightValue(lightValue).harvestTool(tool).harvestLevel(harvestLevel).sound(sound)).setRegistryName(name));
        }

        private static void registerItemBlock(BasicOre block, RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BasicOreItem(block, new Item.Properties().group(Main.TAB)).setRegistryName(block.getRegistryName()));
        }
    }
}
