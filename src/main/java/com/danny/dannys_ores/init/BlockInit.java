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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class BlockInit {
    private static HashMap<Block, Pair<OreTypes, StoneVariants>> vanilla = new HashMap<>();

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
    public static final Block MIDNIGHT_NIGHTSTONE = null;
    @ObjectHolder("mysticalagriculture:soulstone")
    public static final Block MYSTICALAGRICULTURE_SOULSTONE = null;

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> HARDENED_STONE = BLOCKS.register("hardened_stone", () -> new SimpleBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2.5F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE), StoneVariants.STONE, VariantsModId.DANNYS_ORES));
    public static final RegistryObject<Block> HARDENED_COBBLESTONE = BLOCKS.register("hardened_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2.5F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE)));

    /**
     * The main method to initialize all the ores of this mod.
     */
    public static void initOres() {
        HashMap<Block, Pair<OreTypes, StoneVariants>> vanilla = getFilledVanillaBlockMap();
        for (RichnessTypes rType : RichnessTypes.values()) {
            String rTypeName = rType.getName();
            boolean rTypeNormal = rType.equals(RichnessTypes.NORMAL);
            // An ore for each combination of ore type and stone variant will be created.
            // Excluding the vanilla minecraft ores.
            for (OreTypes oType : OreTypes.values()) {
                String oTypeName = oType.getName();
                if (rTypeNormal || oType.isHasRichnessLevels()) {
                    // If the ore has particles or an explosion effect a different block class is required.
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
                                    if (!(rTypeNormal && vanilla.containsValue(Pair.of(oType, variant)))) {
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

    /**
     * Getter for the vanilla ore block map.
     * Also fills the map with elements if it is empty.
     *
     * @return a HashMap with a block as key and a pair of ore type and variant of the block as value.
     */
    public static HashMap<Block, Pair<OreTypes, StoneVariants>> getFilledVanillaBlockMap() {
        if (vanilla.isEmpty()) {
            vanilla.put(Blocks.COAL_ORE, Pair.of(OreTypes.COAL, StoneVariants.STONE));
            vanilla.put(Blocks.IRON_ORE, Pair.of(OreTypes.IRON, StoneVariants.STONE));
            vanilla.put(Blocks.GOLD_ORE, Pair.of(OreTypes.GOLD, StoneVariants.STONE));
            vanilla.put(Blocks.LAPIS_ORE, Pair.of(OreTypes.LAPIS, StoneVariants.STONE));
            vanilla.put(Blocks.REDSTONE_ORE, Pair.of(OreTypes.REDSTONE, StoneVariants.STONE));
            vanilla.put(Blocks.DIAMOND_ORE, Pair.of(OreTypes.DIAMOND, StoneVariants.STONE));
            vanilla.put(Blocks.EMERALD_ORE, Pair.of(OreTypes.EMERALD, StoneVariants.STONE));
            vanilla.put(Blocks.NETHER_QUARTZ_ORE, Pair.of(OreTypes.QUARTZ, StoneVariants.NETHERRACK));
        }
        return vanilla;
    }

    /**
     * Creates the registry name of an ore based on the stone variant, richness type and ore type.
     *
     * @param variant     The stone variant.
     * @param rTypeName   The richness type as string.
     * @param rTypeNormal True if the richness type is 'normal'.
     * @param oTypeName   The ore type as string.
     * @return registryName for an ore.
     */
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

    /**
     * Takes features of an ore
     * and returns the minimum amount of xp an ore with that feature combination should drop.
     *
     * @param oType   The ore type.
     * @param variant The stone variant.
     * @param rType   The richness type.
     * @return Minimum amount of xp as int.
     */
    private static int getMinXp(OreTypes oType, StoneVariants variant, RichnessTypes rType) {
        return Math.round(oType.getMinXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
    }

    /**
     * Takes features of an ore
     * and returns the minimum amount of xp an ore with that feature combination should drop.
     *
     * @param oType   The ore type.
     * @param variant The stone variant.
     * @param rType   The richness type.
     * @return Maximum amount of xp as int.
     */
    private static int getMaxXp(OreTypes oType, StoneVariants variant, RichnessTypes rType) {
        return Math.round(oType.getMaxXp() * variant.getXpMultiplier() * rType.getXpMultiplier());
    }

}
