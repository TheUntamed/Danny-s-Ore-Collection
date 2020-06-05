package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.*;
import com.danny.dannys_ores.blocks.bedrock.*;
import com.danny.dannys_ores.util.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class BlockInit {

    @ObjectHolder("quark:basalt")
    public static final Block QUARK_BASALT = null;
    @ObjectHolder("quark:limestone")
    public static final Block QUARK_LIMESTONE = null;
    @ObjectHolder("quark:jasper")
    public static final Block QUARK_JASPER = null;
    @ObjectHolder("quark:marble")
    public static final Block QUARK_MARBLE = null;
    @ObjectHolder("quark:slate")
    public static final Block QUARK_SLATE = null;
    @ObjectHolder("embellishcraft:basalt")
    public static final Block EMBELLISHCRAFT_BASALT = null;
    @ObjectHolder("embellishcraft:gneiss")
    public static final Block EMBELLISHCRAFT_GNEISS = null;
    @ObjectHolder("embellishcraft:jade")
    public static final Block EMBELLISHCRAFT_JADE = null;
    @ObjectHolder("embellishcraft:larvikite")
    public static final Block EMBELLISHCRAFT_LARVIKITE = null;
    @ObjectHolder("embellishcraft:marble")
    public static final Block EMBELLISHCRAFT_MARBLE = null;
    @ObjectHolder("embellishcraft:slate")
    public static final Block EMBELLISHCRAFT_SLATE = null;

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> HARDENED_STONE = BLOCKS.register("hardened_stone", () -> new BaseBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2.5F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE), StoneVariants.STONE));
    public static final RegistryObject<Block> HARDENED_COBBLESTONE = BLOCKS.register("hardened_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2.5F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE)));

    public static void initOres() {
        ArrayList<OreTypes> vanilla = new ArrayList<>();
        vanilla.add(OreTypes.COAL);
        vanilla.add(OreTypes.IRON);
        vanilla.add(OreTypes.GOLD);
        vanilla.add(OreTypes.LAPIS);
        vanilla.add(OreTypes.REDSTONE);
        vanilla.add(OreTypes.DIAMOND);
        vanilla.add(OreTypes.EMERALD);

        for (RichnessTypes rType : RichnessTypes.values()) {
            String rTypeName = "_";
            boolean rTypeNormal = rType.equals(RichnessTypes.NORMAL);
            if (!rTypeNormal) {
                rTypeName += rType.toString() + "_";
            }
            for (OreTypes oType : OreTypes.values()) {
                if (rTypeNormal || oType.isHasRichnessLevels()) {
                    if (oType.getParticles() != null) {
                        for (StoneVariants variant : StoneVariants.values()) {
                            int minXp = Math.round(oType.getMinXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
                            int maxXp = Math.round(oType.getMaxXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
                            if (variant.equals(StoneVariants.BEDROCK)) {
                                BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new BedrockOreWithParticles(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, minXp, maxXp, oType.getParticles()));
                            } else {
                                BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new OreWithParticles(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, minXp, maxXp, oType.getParticles()));
                            }
                        }
                    } else if (oType.isCanExplode()) {
                        for (StoneVariants variant : StoneVariants.values()) {
                            int minXp = Math.round(oType.getMinXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
                            int maxXp = Math.round(oType.getMaxXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
                            if (variant.equals(StoneVariants.BEDROCK)) {
                                BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new ExplosiveBedrockOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, minXp, maxXp));
                            } else {
                                BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new ExplosiveOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, minXp, maxXp));
                            }
                        }
                    } else {
                        for (StoneVariants variant : StoneVariants.values()) {
                            int minXp = Math.round(oType.getMinXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
                            int maxXp = Math.round(oType.getMaxXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
                            if (variant.equals(StoneVariants.BEDROCK)) {
                                BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new BedrockOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, minXp, maxXp));
                            } else {
                                if (!rTypeNormal || !(variant.equals(StoneVariants.STONE) && vanilla.contains(oType) || variant.equals(StoneVariants.NETHERRACK) && oType.equals(OreTypes.QUARTZ))) {
                                    BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new BaseOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, minXp, maxXp));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
