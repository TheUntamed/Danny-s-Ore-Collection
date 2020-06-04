package com.danny.dannys_ores.util;

import com.danny.dannys_ores.materials.MyMaterials;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.common.ToolType;

import java.util.Arrays;
import java.util.Comparator;

public enum StoneVariant implements IStringSerializable {
    STONE(0, "stone", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    DIORITE(1, "diorite", Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    ANDESITE(2, "andesite", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    GRANITE(3, "granite", Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    SAND(4, "sand", MyMaterials.SAND_ORE, MaterialColor.SAND, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    RED_SAND(5, "red_sand", MyMaterials.SAND_ORE, MaterialColor.ADOBE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    SANDSTONE(6, "sandstone", Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    RED_SANDSTONE(7, "red_sandstone", Material.ROCK, MaterialColor.ADOBE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    GRAVEL(8, "gravel", MyMaterials.GRAVEL_ORE, MaterialColor.STONE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    PACKED_ICE(9, "packed_ice", MyMaterials.ICE_ORE, MaterialColor.ICE, ToolType.PICKAXE, 3.0F, 3.0F, 0.98F, 0, 0),
    BLUE_ICE(10, "blue_ice", MyMaterials.ICE_ORE, MaterialColor.ICE, ToolType.PICKAXE, 3.0F, 3.0F, 0.989F, 0, 0),
    BEDROCK(11, "bedrock", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, -1.0F, 9.0F, 0.0F, 0, 1),
    NETHERRACK(12, "netherrack", Material.ROCK, MaterialColor.NETHERRACK, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    END_STONE(13, "end_stone", Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_BASALT(14, "quark_basalt", Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_LIMESTONE(15, "quark_limestone", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_JASPER(16, "quark_jasper", Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_MARBLE(17, "quark_marble", Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_SLATE(18, "quark_slate", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_BASALT(19, "embellishcraft_basalt", Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_GNEISS(20, "embellishcraft_gneiss", Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_JADE(21, "embellishcraft_jade", Material.ROCK, MaterialColor.LIME, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_LARVIKITE(22, "embellishcraft_larvikite", Material.ROCK, MaterialColor.CLAY, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_MARBLE(23, "embellishcraft_marble", Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_SLATE(24, "embellishcraft_slate", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, 3.0F, 3.0F, 0.0F, 0, 1),
    HARDENED_STONE(25, "hardened_stone", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, 4.0F, 6.0F, 0.0F, 1, 1);

    private static final StoneVariant[] VARIANTS = Arrays.stream(values()).sorted(Comparator.comparingInt(StoneVariant::getId)).toArray(StoneVariant[]::new);

    private final int id;
    private final String name;
    private final Material material;
    private final ToolType tool;
    private final MaterialColor color;
    private final float hardness;
    private final float resistance;
    private final float slipperiness;
    private final int increasedHarvestLevel;
    private final int xpMultiplier;

    private StoneVariant(int id, String name, Material material, MaterialColor color, ToolType tool, float hardness, float resistance, float slipperiness, int increasedHarvestLevel, int xpMultiplier) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.material = material;
        this.tool = tool;
        this.hardness =hardness;
        this.resistance = resistance;
        this.slipperiness = slipperiness;
        this.xpMultiplier = xpMultiplier;
        this.increasedHarvestLevel = increasedHarvestLevel;
    }

    public String toString() {
        return this.name;
    }

    public float getHardness() {
        return this.hardness;
    }

    public float getResistance() {
        return this.resistance;
    }

    public String getName() {
        return this.name;
    }

    public Material getMaterial() {
        return this.material;
    }

    public ToolType getToolType() {
        return this.tool;
    }

    public MaterialColor getColor() {
        return this.color;
    }

    public int getXpMultiplier() {
        return this.xpMultiplier;
    }

    public int getId() {
        return this.id;
    }

    public static StoneVariant byId(int id) {
        if(id < 0 || id >= VARIANTS.length)
        {
            id = 0;
        }
        return VARIANTS[id];
    }

    public int getIncreasedHarvestLevel() {
        return increasedHarvestLevel;
    }

    public float getSlipperiness() {
        return slipperiness;
    }
}
