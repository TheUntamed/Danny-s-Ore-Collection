package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Blocks.BasicOre;
import com.danny.dannys_ores.Blocks.BasicOreItem;
import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.Iron;
import com.danny.dannys_ores.configs.Xp;
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

    public static final BasicOre STONE_IRON_ORE = null;
    public static final BasicOre ANDESITE_IRON_ORE = null;
    public static final BasicOre DIORITE_IRON_ORE = null;
    public static final BasicOre GRANITE_IRON_ORE = null;
    public static final BasicOre NETHERRACK_IRON_ORE = null;
    public static final BasicOre END_STONE_IRON_ORE = null;
    public static final BasicOre SAND_IRON_ORE = null;
    public static final BasicOre GRAVEL_IRON_ORE = null;
    public static final BasicOre SANDSTONE_IRON_ORE = null;
    public static final BasicOre RED_SANDSTONE_IRON_ORE = null;

    public static final BasicOre STONE_COPPER_ORE = null;
    public static final BasicOre ANDESITE_COPPER_ORE = null;
    public static final BasicOre DIORITE_COPPER_ORE = null;
    public static final BasicOre GRANITE_COPPER_ORE = null;
    public static final BasicOre NETHERRACK_COPPER_ORE = null;
    public static final BasicOre END_STONE_COPPER_ORE = null;
    public static final BasicOre SAND_COPPER_ORE = null;
    public static final BasicOre GRAVEL_COPPER_ORE = null;
    public static final BasicOre SANDSTONE_COPPER_ORE = null;
    public static final BasicOre RED_SANDSTONE_COPPER_ORE = null;

    public static final BasicOre STONE_XP_ORE = null;
    public static final BasicOre ANDESITE_XP_ORE = null;
    public static final BasicOre DIORITE_XP_ORE = null;
    public static final BasicOre GRANITE_XP_ORE = null;
    public static final BasicOre NETHERRACK_XP_ORE = null;
    public static final BasicOre END_STONE_XP_ORE = null;
    public static final BasicOre SAND_XP_ORE = null;
    public static final BasicOre GRAVEL_XP_ORE = null;
    public static final BasicOre SANDSTONE_XP_ORE = null;
    public static final BasicOre RED_SANDSTONE_XP_ORE = null;

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class OresRegistryEvents {

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            registerBlock(event, "stone_iron_ore", Iron.harvestLevelStoneIronOre.get(), Iron.hardnessLevelStoneIronOre.get(), Iron.resistanceLevelStoneIronOre.get(), Iron.lightValueStoneIronOre.get(), Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "andesite_iron_ore", Iron.harvestLevelAndesiteIronOre.get(), Iron.hardnessLevelAndesiteIronOre.get(), Iron.resistanceLevelAndesiteIronOre.get(), Iron.lightValueAndesiteIronOre.get(), Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "diorite_iron_ore", Iron.harvestLevelDioriteIronOre.get(), Iron.hardnessLevelDioriteIronOre.get(), Iron.resistanceLevelDioriteIronOre.get(), Iron.lightValueDioriteIronOre.get(), Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "granite_iron_ore", Iron.harvestLevelGraniteIronOre.get(), Iron.hardnessLevelGraniteIronOre.get(), Iron.resistanceLevelGraniteIronOre.get(), Iron.lightValueGraniteIronOre.get(), Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "netherrack_iron_ore", Iron.harvestLevelNetherrackIronOre.get(), Iron.hardnessLevelNetherrackIronOre.get(), Iron.resistanceLevelNetherrackIronOre.get(), Iron.lightValueNetherrackIronOre.get(), Material.ROCK, MaterialColor.NETHERRACK, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "end_stone_iron_ore", Iron.harvestLevelEndStoneIronOre.get(), Iron.hardnessLevelEndStoneIronOre.get(), Iron.resistanceLevelEndStoneIronOre.get(), Iron.lightValueEndStoneIronOre.get(), Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "sand_iron_ore", Iron.harvestLevelSandIronOre.get(), Iron.hardnessLevelSandIronOre.get(), Iron.resistanceLevelSandIronOre.get(), Iron.lightValueSandIronOre.get(), Material.SAND, MaterialColor.SAND, ToolType.PICKAXE, SoundType.SAND);
            registerBlock(event, "gravel_iron_ore", Iron.harvestLevelGravelIronOre.get(), Iron.hardnessLevelGravelIronOre.get(), Iron.resistanceLevelGravelIronOre.get(), Iron.lightValueGravelIronOre.get(), Material.SAND, MaterialColor.STONE, ToolType.PICKAXE, SoundType.GROUND);
            registerBlock(event, "sandstone_iron_ore", Iron.harvestLevelSandstoneIronOre.get(), Iron.hardnessLevelSandstoneIronOre.get(), Iron.resistanceLevelSandstoneIronOre.get(), Iron.lightValueSandstoneIronOre.get(), Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "red_sandstone_iron_ore", Iron.harvestLevelRedSandstoneIronOre.get(), Iron.hardnessLevelRedSandstoneIronOre.get(), Iron.resistanceLevelRedSandstoneIronOre.get(), Iron.lightValueRedSandstoneIronOre.get(), Material.ROCK, MaterialColor.ADOBE, ToolType.PICKAXE, SoundType.STONE);

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

            registerBlock(event, "stone_xp_ore", Xp.harvestLevelStoneXpOre.get(), Xp.hardnessLevelStoneXpOre.get(), Xp.resistanceLevelStoneXpOre.get(), Xp.lightValueStoneXpOre.get(), Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "andesite_xp_ore", Xp.harvestLevelAndesiteXpOre.get(), Xp.hardnessLevelAndesiteXpOre.get(), Xp.resistanceLevelAndesiteXpOre.get(), Xp.lightValueAndesiteXpOre.get(), Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "diorite_xp_ore", Xp.harvestLevelDioriteXpOre.get(), Xp.hardnessLevelDioriteXpOre.get(), Xp.resistanceLevelDioriteXpOre.get(), Xp.lightValueDioriteXpOre.get(), Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "granite_xp_ore", Xp.harvestLevelGraniteXpOre.get(), Xp.hardnessLevelGraniteXpOre.get(), Xp.resistanceLevelGraniteXpOre.get(), Xp.lightValueGraniteXpOre.get(), Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "netherrack_xp_ore", Xp.harvestLevelNetherrackXpOre.get(), Xp.hardnessLevelNetherrackXpOre.get(), Xp.resistanceLevelNetherrackXpOre.get(), Xp.lightValueNetherrackXpOre.get(), Material.ROCK, MaterialColor.NETHERRACK, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "end_stone_xp_ore", Xp.harvestLevelEndStoneXpOre.get(), Xp.hardnessLevelEndStoneXpOre.get(), Xp.resistanceLevelEndStoneXpOre.get(), Xp.lightValueEndStoneXpOre.get(), Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "sand_xp_ore", Xp.harvestLevelSandXpOre.get(), Xp.hardnessLevelSandXpOre.get(), Xp.resistanceLevelSandXpOre.get(), Xp.lightValueSandXpOre.get(), Material.SAND, MaterialColor.SAND, ToolType.PICKAXE, SoundType.SAND);
            registerBlock(event, "gravel_xp_ore", Xp.harvestLevelGravelXpOre.get(), Xp.hardnessLevelGravelXpOre.get(), Xp.resistanceLevelGravelXpOre.get(), Xp.lightValueGravelXpOre.get(), Material.SAND, MaterialColor.STONE, ToolType.PICKAXE, SoundType.GROUND);
            registerBlock(event, "sandstone_xp_ore", Xp.harvestLevelSandstoneXpOre.get(), Xp.hardnessLevelSandstoneXpOre.get(), Xp.resistanceLevelSandstoneXpOre.get(), Xp.lightValueSandstoneXpOre.get(), Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE);
            registerBlock(event, "red_sandstone_xp_ore", Xp.harvestLevelRedSandstoneXpOre.get(), Xp.hardnessLevelRedSandstoneXpOre.get(), Xp.resistanceLevelRedSandstoneXpOre.get(), Xp.lightValueRedSandstoneXpOre.get(), Material.ROCK, MaterialColor.ADOBE, ToolType.PICKAXE, SoundType.STONE);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            registerItemBlock(STONE_IRON_ORE, event);
            registerItemBlock(ANDESITE_IRON_ORE, event);
            registerItemBlock(DIORITE_IRON_ORE, event);
            registerItemBlock(GRANITE_IRON_ORE, event);
            registerItemBlock(NETHERRACK_IRON_ORE, event);
            registerItemBlock(END_STONE_IRON_ORE, event);
            registerItemBlock(SAND_IRON_ORE, event);
            registerItemBlock(GRAVEL_IRON_ORE, event);
            registerItemBlock(SANDSTONE_IRON_ORE, event);
            registerItemBlock(RED_SANDSTONE_IRON_ORE, event);

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

            registerItemBlock(STONE_XP_ORE, event);
            registerItemBlock(ANDESITE_XP_ORE, event);
            registerItemBlock(DIORITE_XP_ORE, event);
            registerItemBlock(GRANITE_XP_ORE, event);
            registerItemBlock(NETHERRACK_XP_ORE, event);
            registerItemBlock(END_STONE_XP_ORE, event);
            registerItemBlock(SAND_XP_ORE, event);
            registerItemBlock(GRAVEL_XP_ORE, event);
            registerItemBlock(SANDSTONE_XP_ORE, event);
            registerItemBlock(RED_SANDSTONE_XP_ORE, event);
        }

        private static void registerBlock(RegistryEvent.Register<Block> event, String name, int harvestLevel, double hardnessLevel, double resistanceLevel, int lightValue, Material material, MaterialColor color, ToolType tool, SoundType sound) {
            event.getRegistry().register(new BasicOre(Block.Properties.create(material, color).hardnessAndResistance((float) hardnessLevel, (float) resistanceLevel).lightValue(lightValue).harvestTool(tool).harvestLevel(harvestLevel).sound(sound)).setRegistryName(name));
        }

        private static void registerItemBlock(BasicOre block, RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BasicOreItem(block, new Item.Properties().group(Main.TAB)).setRegistryName(block.getRegistryName()));
        }
    }
}
