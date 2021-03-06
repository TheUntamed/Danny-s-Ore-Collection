package com.danny.dannys_ores.util;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

/**
 * Provides the stone variant feature. Each ore has exactly one of these features assigned.
 */
public enum StoneVariants {
    STONE("stone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    DIORITE("diorite", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    ANDESITE("andesite", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    GRANITE("granite", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    SAND("sand", VariantsModId.MINECRAFT, Material.SAND, MaterialColor.SAND, ToolType.SHOVEL, SoundType.SAND, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    RED_SAND("red_sand", VariantsModId.MINECRAFT, Material.SAND, MaterialColor.ADOBE, ToolType.SHOVEL, SoundType.SAND, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    SANDSTONE("sandstone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    RED_SANDSTONE("red_sandstone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.ADOBE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    GRAVEL("gravel", VariantsModId.MINECRAFT, Material.SAND, MaterialColor.STONE, ToolType.SHOVEL, SoundType.GROUND, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    PACKED_ICE("packed_ice", VariantsModId.MINECRAFT, Material.ICE, MaterialColor.ICE, ToolType.PICKAXE, SoundType.GLASS, 3.0F, 3.0F, 0.98F, 0, 0, 0),
    BLUE_ICE("blue_ice", VariantsModId.MINECRAFT, Material.ICE, MaterialColor.ICE, ToolType.PICKAXE, SoundType.GLASS, 3.0F, 3.0F, 0.989F, 0, 0, 0),
    BEDROCK("bedrock", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, -1.0F, 9.0F, 0.6F, 0, 0, 1),
    NETHERRACK("netherrack", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.NETHERRACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    END_STONE("end_stone", VariantsModId.MINECRAFT, Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    QUARK_BASALT("basalt", VariantsModId.QUARK, Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    QUARK_LIMESTONE("limestone", VariantsModId.QUARK, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    QUARK_JASPER("jasper", VariantsModId.QUARK, Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    QUARK_MARBLE("marble", VariantsModId.QUARK, Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    QUARK_SLATE("slate", VariantsModId.QUARK, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    EMBELLISHCRAFT_BASALT("basalt", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.BLACK, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    EMBELLISHCRAFT_GNEISS("gneiss", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.SAND, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    EMBELLISHCRAFT_JADE("jade", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.LIME, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    EMBELLISHCRAFT_LARVIKITE("larvikite", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.CLAY, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    EMBELLISHCRAFT_MARBLE("marble", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    EMBELLISHCRAFT_SLATE("slate", VariantsModId.EMBELLISHCRAFT, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    CREATE_DOLOMITE("dolomite", VariantsModId.CREATE, Material.ROCK, MaterialColor.QUARTZ, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    CREATE_GABBRO("gabbro", VariantsModId.CREATE, Material.ROCK, MaterialColor.DIRT, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    CREATE_LIMESTONE("limestone", VariantsModId.CREATE, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    CREATE_SCORIA("scoria", VariantsModId.CREATE, Material.ROCK, MaterialColor.BROWN, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    CREATE_WEATHERED_LIMESTONE("weathered_limestone", VariantsModId.CREATE, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    NETHERCRAFT_HEATSAND("heat_sand", VariantsModId.NETHERCRAFT, Material.SAND, MaterialColor.ADOBE, ToolType.PICKAXE, SoundType.SAND, 3.0F, 3.0F, 0.6F, 0, 9, 1),
    MYSTICALAGRICULTURE_SOULSTONE("soulstone", VariantsModId.MYSTICALAGRICULTURE, Material.ROCK, MaterialColor.BROWN_TERRACOTTA, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    MIDNIGHT_NIGHTSTONE("nightstone", VariantsModId.MIDNIGHT, Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, ToolType.PICKAXE, SoundType.STONE, 3.0F, 3.0F, 0.6F, 0, 0, 1),
    HARDENED_STONE("hardened_stone", VariantsModId.DANNYS_ORES, Material.ROCK, MaterialColor.STONE, ToolType.PICKAXE, SoundType.STONE, 4.0F, 6.0F, 0.6F, 1, 0, 1);

    private final String blockName;
    private final VariantsModId modid;
    private final Material material;
    private final ToolType tool;
    private final SoundType sound;
    private final MaterialColor color;
    private final float hardness;
    private final float resistance;
    private final float slipperiness;
    private final int increasedHarvestLevel;
    private final int lightValue;
    private final int xpMultiplier;

    private StoneVariants(String blockName, VariantsModId modid, Material material, MaterialColor color, ToolType tool, SoundType sound, float hardness, float resistance, float slipperiness, int increasedHarvestLevel, int lightValue, int xpMultiplier) {
        this.blockName = blockName;
        this.modid = modid;
        this.color = color;
        this.material = material;
        this.tool = tool;
        this.sound = sound;
        this.hardness =hardness;
        this.resistance = resistance;
        this.slipperiness = slipperiness;
        this.lightValue = lightValue;
        this.xpMultiplier = xpMultiplier;
        this.increasedHarvestLevel = increasedHarvestLevel;
    }

    public float getHardness() {
        return this.hardness;
    }

    public float getResistance() {
        return this.resistance;
    }

    public String getFullName() {
        return this.modid.asLowerCaseString() + "_" + this.blockName;
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

    public String getBlockName() {
        return blockName;
    }

    public int getLightValue() {
        return lightValue;
    }
}
