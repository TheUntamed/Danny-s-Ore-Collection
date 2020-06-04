package com.danny.dannys_ores.util;

import com.danny.dannys_ores.materials.MyMaterials;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.common.ToolType;

import java.util.Arrays;
import java.util.Comparator;

public enum StoneVariants implements IStringSerializable {
    STONE("stone", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    DIORITE("diorite", Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    ANDESITE("andesite", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    GRANITE("granite", Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    SAND("sand", MyMaterials.SAND_ORE, MaterialColor.SAND, ToolType.SHOVEL, SoundType.SAND, 3.0F, 3.0F, 0.0F, 0, 1),
    RED_SAND("red_sand", MyMaterials.SAND_ORE, MaterialColor.ADOBE, ToolType.SHOVEL, SoundType.SAND, 3.0F, 3.0F, 0.0F, 0, 1),
    SANDSTONE("sandstone", Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    RED_SANDSTONE("red_sandstone", Material.ROCK, MaterialColor.ADOBE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    GRAVEL("gravel", MyMaterials.GRAVEL_ORE, MaterialColor.STONE, ToolType.SHOVEL, SoundType.GROUND, 3.0F, 3.0F, 0.0F, 0, 1),
    PACKED_ICE("packed_ice", MyMaterials.ICE_ORE, MaterialColor.ICE, ToolType.PICKAXE, SoundType.GLASS, 3.0F, 3.0F, 0.98F, 0, 0),
    BLUE_ICE("blue_ice", MyMaterials.ICE_ORE, MaterialColor.ICE, ToolType.PICKAXE, SoundType.GLASS, 3.0F, 3.0F, 0.989F, 0, 0),
    BEDROCK("bedrock", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, -1.0F, 9.0F, 0.0F, 0, 1),
    NETHERRACK("netherrack", Material.ROCK, MaterialColor.NETHERRACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    END_STONE("end_stone", Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_BASALT("quark_basalt", Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_LIMESTONE("quark_limestone", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_JASPER("quark_jasper", Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_MARBLE("quark_marble", Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    QUARK_SLATE("quark_slate", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_BASALT("embellishcraft_basalt", Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_GNEISS("embellishcraft_gneiss", Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_JADE("embellishcraft_jade", Material.ROCK, MaterialColor.LIME, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_LARVIKITE("embellishcraft_larvikite", Material.ROCK, MaterialColor.CLAY, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_MARBLE("embellishcraft_marble", Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    EMBELLISHCRAFT_SLATE("embellishcraft_slate", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.0F, 0, 1),
    HARDENED_STONE("hardened_stone", Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 4.0F, 6.0F, 0.0F, 1, 1);

    //private static final StoneVariants[] VARIANTS = Arrays.stream(values()).sorted(Comparator.comparingInt(StoneVariants::getId)).toArray(StoneVariants[]::new);

    //private final int id;
    private final String name;
    private final Material material;
    private final ToolType tool;
    private final SoundType sound;
    private final MaterialColor color;
    private final float hardness;
    private final float resistance;
    private final float slipperiness;
    private final int increasedHarvestLevel;
    private final int xpMultiplier;

    private StoneVariants(String name, Material material, MaterialColor color, ToolType tool, SoundType sound, float hardness, float resistance, float slipperiness, int increasedHarvestLevel, int xpMultiplier) {
        //this.id = id;
        this.name = name;
        this.color = color;
        this.material = material;
        this.tool = tool;
        this.sound = sound;
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

//    public int getId() {
//        return this.id;
//    }
//
//    public static StoneVariants byId(int id) {
//        if(id < 0 || id >= VARIANTS.length)
//        {
//            id = 0;
//        }
//        return VARIANTS[id];
//    }

    public int getIncreasedHarvestLevel() {
        return increasedHarvestLevel;
    }

    public float getSlipperiness() {
        return slipperiness;
    }

    public SoundType getSoundType() {
        return sound;
    }
}
