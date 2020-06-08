package com.danny.dannys_ores.util;

import com.danny.dannys_ores.materials.MyMaterials;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.common.ToolType;

public enum StoneVariants implements IStringSerializable {
    STONE("stone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    DIORITE("diorite", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    ANDESITE("andesite", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    GRANITE("granite", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    SAND("sand", VariantsModId.MINECRAFT, MyMaterials.SAND_ORE, MaterialColor.SAND, ToolType.SHOVEL, SoundType.SAND, 3.0F, 3.0F, 0.6F, 0, 1),
    RED_SAND("red_sand", VariantsModId.MINECRAFT, MyMaterials.SAND_ORE, MaterialColor.ADOBE, ToolType.SHOVEL, SoundType.SAND, 3.0F, 3.0F, 0.6F, 0, 1),
    SANDSTONE("sandstone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    RED_SANDSTONE("red_sandstone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.ADOBE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    GRAVEL("gravel", VariantsModId.MINECRAFT, MyMaterials.GRAVEL_ORE, MaterialColor.STONE, ToolType.SHOVEL, SoundType.GROUND, 3.0F, 3.0F, 0.6F, 0, 1),
    PACKED_ICE("packed_ice", VariantsModId.MINECRAFT, MyMaterials.ICE_ORE, MaterialColor.ICE, ToolType.PICKAXE, SoundType.GLASS, 3.0F, 3.0F, 0.98F, 0, 0),
    BLUE_ICE("blue_ice", VariantsModId.MINECRAFT, MyMaterials.ICE_ORE, MaterialColor.ICE, ToolType.PICKAXE, SoundType.GLASS, 3.0F, 3.0F, 0.989F, 0, 0),
    BEDROCK("bedrock", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, -1.0F, 9.0F, 0.6F, 0, 1),
    NETHERRACK("netherrack", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.NETHERRACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    END_STONE("end_stone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    QUARK_BASALT("quark_basalt", VariantsModId.QUARK, Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    QUARK_LIMESTONE("quark_limestone", VariantsModId.QUARK, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    QUARK_JASPER("quark_jasper", VariantsModId.QUARK, Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    QUARK_MARBLE("quark_marble", VariantsModId.QUARK, Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    QUARK_SLATE("quark_slate", VariantsModId.QUARK, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    EMBELLISHCRAFT_BASALT("embellishcraft_basalt", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    EMBELLISHCRAFT_GNEISS("embellishcraft_gneiss", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    EMBELLISHCRAFT_JADE("embellishcraft_jade", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.LIME, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    EMBELLISHCRAFT_LARVIKITE("embellishcraft_larvikite", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.CLAY, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    EMBELLISHCRAFT_MARBLE("embellishcraft_marble", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    EMBELLISHCRAFT_SLATE("embellishcraft_slate", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    MYSTICALAGRICULTURE_SOULSTONE("soulstone", VariantsModId.MYSTICALAGRICULTURE, Material.ROCK, MaterialColor.BROWN, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    MIDNIGHT_NIGHTSTONE("nightstone", VariantsModId.MIDNIGHT, Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 1),
    HARDENED_STONE("hardened_stone", VariantsModId.DANNYS_ORES, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 4.0F, 6.0F, 0.6F, 1, 1);

    private final String name;
    private final VariantsModId modid;
    private final Material material;
    private final ToolType tool;
    private final SoundType sound;
    private final MaterialColor color;
    private final float hardness;
    private final float resistance;
    private final float slipperiness;
    private final int increasedHarvestLevel;
    private final int xpMultiplier;

    private StoneVariants(String name, VariantsModId modid, Material material, MaterialColor color, ToolType tool, SoundType sound, float hardness, float resistance, float slipperiness, int increasedHarvestLevel, int xpMultiplier) {
        this.name = name;
        this.modid = modid;
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

    public int getIncreasedHarvestLevel() {
        return increasedHarvestLevel;
    }

    public float getSlipperiness() {
        return slipperiness;
    }

    public SoundType getSoundType() {
        return sound;
    }

    public VariantsModId getModid() {
        return modid;
    }
}
