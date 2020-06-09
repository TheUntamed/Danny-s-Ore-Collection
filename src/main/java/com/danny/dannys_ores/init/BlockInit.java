package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.*;
import com.danny.dannys_ores.blocks.bedrock.*;
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
import java.util.HashMap;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class BlockInit {
    public static HashMap<OreTypes, StoneVariants> vanilla = new HashMap<>();

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
    @ObjectHolder("midnight:nightstone")
    public static final Block NIGHTSTONE = null;
    @ObjectHolder("mysticalagriculture:soulstone")
    public static final Block SOULSTONE = null;

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> HARDENED_STONE = BLOCKS.register("hardened_stone", () -> new SimpleBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2.5F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE), StoneVariants.STONE, VariantsModId.DANNYS_ORES));
    public static final RegistryObject<Block> HARDENED_COBBLESTONE = BLOCKS.register("hardened_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2.5F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE)));

    public static void initOres() {
        vanilla.put(OreTypes.COAL, StoneVariants.STONE);
        vanilla.put(OreTypes.IRON, StoneVariants.STONE);
        vanilla.put(OreTypes.GOLD, StoneVariants.STONE);
        vanilla.put(OreTypes.LAPIS, StoneVariants.STONE);
        vanilla.put(OreTypes.REDSTONE, StoneVariants.STONE);
        vanilla.put(OreTypes.DIAMOND, StoneVariants.STONE);
        vanilla.put(OreTypes.EMERALD, StoneVariants.STONE);
        vanilla.put(OreTypes.QUARTZ, StoneVariants.NETHERRACK);

        for (RichnessTypes rType : RichnessTypes.values()) {
            String rTypeName = rType.getName();
            boolean rTypeNormal = rType.equals(RichnessTypes.NORMAL);

            for (OreTypes oType : OreTypes.values()) {
                String oTypeName = oType.getName();
                if (rTypeNormal || oType.isHasRichnessLevels()) {
                    if (oType.getParticles() != null) {
                        for (StoneVariants variant : StoneVariants.values()) {
                            if (ModHandler.variantsModIdExists(variant.getModid())) {
                                String regName = getRegName(variant, rTypeName, rTypeNormal, oTypeName);
                                int minXp = getMinXp(oType, variant, rType);
                                int maxXp = getMaxXp(oType, variant, rType);
                                if (variant.equals(StoneVariants.BEDROCK)) {
                                    //Main.LOGGER.info("The BlockInit reg name: " + variantName + rTypeName + oTypeName + "_ore");
                                    BLOCKS.register(regName, () -> new BedrockOreWithParticles(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, variant.getModid(), rType, oType, minXp, maxXp, oType.getParticles()));
                                } else {
                                    //Main.LOGGER.info("The BlockInit reg name: " + regName);
                                    BLOCKS.register(regName, () -> new OreWithParticles(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, variant.getModid(), rType, oType, minXp, maxXp, oType.getParticles()));
                                }
                            }
                        }
                    } else if (oType.getEffect().equals(Effects.EXPLODE)) {
                        for (StoneVariants variant : StoneVariants.values()) {
                            if (ModHandler.variantsModIdExists(variant.getModid())) {
                                String regName = getRegName(variant, rTypeName, rTypeNormal, oTypeName);
                                int minXp = getMinXp(oType, variant, rType);
                                int maxXp = getMaxXp(oType, variant, rType);
                                if (variant.equals(StoneVariants.BEDROCK)) {
                                    //Main.LOGGER.info("The BlockInit reg name: " + regName);
                                    BLOCKS.register(regName, () -> new ExplosiveBedrockOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, variant.getModid(), rType, oType, minXp, maxXp));
                                } else {
                                    //Main.LOGGER.info("The BlockInit reg name: " + regName);
                                    BLOCKS.register(regName, () -> new ExplosiveOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, variant.getModid(), rType, oType, minXp, maxXp));
                                }
                            }
                        }
                    } else {
                        for (StoneVariants variant : StoneVariants.values()) {
                            if (ModHandler.variantsModIdExists(variant.getModid())) {
                                String regName = getRegName(variant, rTypeName, rTypeNormal, oTypeName);
                                int minXp = getMinXp(oType, variant, rType);
                                int maxXp = getMaxXp(oType, variant, rType);
                                if (variant.equals(StoneVariants.BEDROCK)) {
                                    //Main.LOGGER.info("The BlockInit reg name: " + regName);
                                    BLOCKS.register(regName, () -> new BedrockOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, variant.getModid(), rType, oType, minXp, maxXp));
                                } else {
                                    if (!(rTypeNormal && vanilla.containsKey(oType) && variant.equals(vanilla.get(oType)))) {
                                        //Main.LOGGER.info("The BlockInit reg name: " + regName);
                                        BLOCKS.register(regName, () -> new SimpleOre(Block.Properties.create(Material.ROCK, variant.getColor()).hardnessAndResistance(variant.getHardness(), variant.getResistance()).harvestTool(variant.getToolType()).sound(variant.getSoundType()).harvestLevel(oType.getHarvestLevel() + variant.getIncreasedHarvestLevel()), variant, variant.getModid(), rType, oType, minXp, maxXp));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static String getRegName(StoneVariants variant, String rTypeName, boolean rTypeNormal, String oTypeName) {
        // Normal Ores don't have the richness type 'normal' in their name.
        if (rTypeNormal) {
            rTypeName = "_";
        } else {
            rTypeName = "_" + rTypeName + "_";
        }
        // Ores with a variant of modid minecraft or dannys_ores don't have the modid in their name.
        String variantName = variant.getName().replace("minecraft_", "").replace("dannys_ores_", "");
        return variantName + rTypeName + oTypeName + "_ore";
    }

    private static int getMinXp(OreTypes oType, StoneVariants variant, RichnessTypes rType) {
        return Math.round(oType.getMinXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
    }

    private static int getMaxXp(OreTypes oType, StoneVariants variant, RichnessTypes rType) {
        return Math.round(oType.getMaxXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
    }

}
