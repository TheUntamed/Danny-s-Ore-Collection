package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseBlock;
import com.danny.dannys_ores.blocks.TestOre;
import com.danny.dannys_ores.util.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

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

    public static final RegistryObject<Block> HARDENED_STONE = BLOCKS.register("hardened_stone", () -> new BaseBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2.5F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE), VariantType.STONE));

    //LOCKS.register(type.getName() + "_test_ore", () -> new BaseOre(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(type.getHardness(), type.getResistance()).harvestTool(type.getToolType()).slipperiness(type.getSlipperiness()).harvestLevel(1+type.getIncreasedHarvestLevel()), type, RichnessTypes.DENSE, OreTypes.ELECTROTINE, 2*type.getXpMultiplier(), 8*type.getXpMultiplier()))

    public static void initOres() {
        System.err.println("initOres is called!");
        for (RichnessTypes rType : RichnessTypes.values()) {
            String rTypeName = "_";
            if (!rType.equals(RichnessTypes.NORMAL)) {
                rTypeName += rType.toString() + "_";
            }
            for (OreTypes oType : OreTypes.values()) {
                if (oType.isHasParticles()) {
                    for (StoneVariants variant : StoneVariants.values()) {
                        BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new TestOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).slipperiness(variant.getSlipperiness()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, oType.getMinXp() * variant.getXpMultiplier(), oType.getMaxXp() * variant.getXpMultiplier()));
                    }
                } else if (oType.isCanExplode()) {
                    for (StoneVariants variant : StoneVariants.values()) {
                        BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new TestOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).slipperiness(variant.getSlipperiness()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, oType.getMinXp() * variant.getXpMultiplier(), oType.getMaxXp() * variant.getXpMultiplier()));
                    }
                } else {
                    for (StoneVariants variant : StoneVariants.values()) {
                        BLOCKS.register(variant.getName() + rTypeName + oType.getName() + "_ore", () -> new TestOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).slipperiness(variant.getSlipperiness()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, rType, oType, oType.getMinXp() * variant.getXpMultiplier(), oType.getMaxXp() * variant.getXpMultiplier()));
                    }
                }
            }
        }
//        Map<StoneVariants, RegistryObject<TestOre>> ORE_BLOCKS = Arrays.stream(StoneVariants.values()).map(
//                type -> Pair.of(type, BLOCKS.register(type.getName() + "_test_ore", () ->
//                        type.equals(StoneVariants.BEDROCK)
//                                ? new TestOre(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(type.getHardness(), type.getResistance()).harvestTool(type.getToolType()).sound(type.getSoundType()).slipperiness(type.getSlipperiness()).harvestLevel(1+type.getIncreasedHarvestLevel()), type, RichnessTypes.POOR, OreTypes.ELECTROTINE, 2*type.getXpMultiplier(), 8*type.getXpMultiplier())
//                                : new TestOre(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(type.getHardness(), type.getResistance()).harvestTool(type.getToolType()).sound(type.getSoundType()).slipperiness(type.getSlipperiness()).harvestLevel(1+type.getIncreasedHarvestLevel()), type, RichnessTypes.DENSE, OreTypes.ELECTROTINE, 2*type.getXpMultiplier(), 8*type.getXpMultiplier())))).collect(
//                Collectors.toMap(Pair::getKey, Pair::getValue));
    }

//    public static final Map<StoneVariants, RegistryObject<TestOre>> ORE_BLOCKS = Arrays.stream(StoneVariants.values()).map(
//            type -> Pair.of(type, BLOCKS.register(type.getName() + "_test_ore", () ->
//                    type.equals(StoneVariants.BEDROCK)
//                            ? new TestOre(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(type.getHardness(), type.getResistance()).harvestTool(type.getToolType()).sound(type.getSoundType()).slipperiness(type.getSlipperiness()).harvestLevel(1+type.getIncreasedHarvestLevel()), type, RichnessTypes.POOR, OreTypes.ELECTROTINE, 2*type.getXpMultiplier(), 8*type.getXpMultiplier())
//                            : new TestOre(Block.Properties.create(Material.ROCK, type.getColor()).hardnessAndResistance(type.getHardness(), type.getResistance()).harvestTool(type.getToolType()).sound(type.getSoundType()).slipperiness(type.getSlipperiness()).harvestLevel(1+type.getIncreasedHarvestLevel()), type, RichnessTypes.DENSE, OreTypes.ELECTROTINE, 2*type.getXpMultiplier(), 8*type.getXpMultiplier())))).collect(
//            Collectors.toMap(Pair::getKey, Pair::getValue));

}
