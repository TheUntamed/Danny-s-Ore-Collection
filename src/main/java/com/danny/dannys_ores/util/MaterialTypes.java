package com.danny.dannys_ores.util;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import net.minecraftforge.common.ToolType;

import java.util.Arrays;
import java.util.List;

public enum MaterialTypes {
    // Vanilla
    COAL("coal", OreTypes.COAL, MineralTypes.GEM, Material.ROCK, MaterialColor.BLACK, 1, ToolType.PICKAXE, SoundType.STONE, 5, 6, 0, new Forms[] {Forms.INGOT, Forms.STORAGE_BLOCK}, 0xFF0000);
//    DIAMOND("diamond", OreTypes.DIAMOND, MineralTypes.GEM, Material.IRON, MaterialColor.DIAMOND, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {Forms.INGOT, Forms.STORAGE_BLOCK}),
//    EMERALD("emerald", OreTypes.EMERALD, MineralTypes.GEM, Material.IRON, MaterialColor.EMERALD, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {Forms.INGOT, Forms.STORAGE_BLOCK}),
//    GOLD("gold", OreTypes.GOLD, MineralTypes.METAL, Material.IRON, MaterialColor.GOLD, 1, ToolType.PICKAXE, SoundType.METAL, 3, 6, 0, new Forms[] {Forms.INGOT, Forms.NUGGET, Forms.STORAGE_BLOCK}),
//    IRON("iron", OreTypes.IRON, MineralTypes.METAL, Material.IRON, MaterialColor.IRON, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {Forms.INGOT, Forms.NUGGET, Forms.STORAGE_BLOCK}),
//    LAPIS("lapis", OreTypes.LAPIS, MineralTypes.GEM, Material.IRON, MaterialColor.LAPIS, 1, ToolType.PICKAXE, SoundType.METAL, 3, 3, 0, new Forms[] {Forms.INGOT, Forms.STORAGE_BLOCK}),
//    QUARTZ("quartz", OreTypes.QUARTZ, MineralTypes.GEM, Material.ROCK, MaterialColor.QUARTZ, 1, ToolType.PICKAXE, SoundType.STONE, 0.8F, 0.8F, 0, new Forms[] {Forms.INGOT, Forms.STORAGE_BLOCK}),
//    REDSTONE("redstone", OreTypes.REDSTONE, MineralTypes.GEM, Material.IRON, MaterialColor.TNT, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {Forms.DUST, Forms.STORAGE_BLOCK}),
//    GLOWSTONE("glowstone", null, MineralTypes.CRYSTAL, Material.GLASS, MaterialColor.SAND, 0, ToolType.PICKAXE, SoundType.GLASS, 3, 3, 15, new Forms[] {Forms.DUST}),
//    // Gems
//    AMBER("amber", OreTypes.AMBER, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    AMETHYST("amethyst", OreTypes.AMETHYST, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ANGLESITE("anglesite", OreTypes.ANGLESITE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    APATITE("apatite", OreTypes.APATITE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ARCANE_CRYSTAL("arcane_crystal", OreTypes.ARCANE_CRYSTAL, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ARCHAIC("archaic", OreTypes.ARCHAIC, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    BENITOITE("benitoite", OreTypes.BENITOITE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    BLACK_OPAL("black_opal", OreTypes.BLACK_OPAL, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    BLACK_QUARTZ("black_quartz", OreTypes.BLACK_QUARTZ, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    CERTUS_QUARTZ("certus_quartz", OreTypes.CERTUS_QUARTZ, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    CHARGED_CERTUS_QUARTZ("charged_certus_quartz", OreTypes.CHARGED_CERTUS_QUARTZ, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    DARK("dark", OreTypes.DARK_PEARL, MineralTypes.PEARL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    DIMENSIONAL("dimensional", OreTypes.DIMENSIONAL_SHARD, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    DRACONIUM("draconium", OreTypes.DRACONIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    EBONITE("ebonite", OreTypes.EBONITE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ELECTROTINE("electrotine", OreTypes.ELECTROTINE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    FIERY_GLASS("fiery_glass", OreTypes.FIERY_GLASS, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    FOULITE("foulite", OreTypes.FOULITE, MineralTypes.POWDER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    IMPERIUM("imperium", OreTypes.IMPERIUM, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    INFERIUM("inferium", OreTypes.INFERIUM, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    INSANIUM("insanium", OreTypes.INSANIUM, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    LAVA("lava", OreTypes.LAVA_CRYSTAL, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    MALACHITE("malachite", OreTypes.MALACHITE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    MOONSTONE("moonstone", OreTypes.MOONSTONE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    NITER("niter", OreTypes.NITER, MineralTypes.POWDER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    PERIDOT("peridot", OreTypes.PERIDOT, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    PROSPERITY("prosperity", OreTypes.PROSPERITY, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    PRUDENTIUM("prudentium", OreTypes.PRUDENTIUM, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    PYRITE("pyrite", OreTypes.PYRITE, MineralTypes.POWDER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    RUBY("ruby", OreTypes.RUBY, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    RUNESTONE("runestone", OreTypes.RUNESTONE, MineralTypes.OTHER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    SAPPHIRE("sapphire", OreTypes.SAPPHIRE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    SLIME_BALL("slime_ball", OreTypes.STICKY, MineralTypes.OTHER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {Forms.INGOT}),
//    SULFUR("sulfur", OreTypes.SULFUR, MineralTypes.POWDER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    SUPREMIUM("supremium", OreTypes.SUPREMIUM, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    TERTIUM("tertium", OreTypes.TERTIUM, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    W("w", OreTypes.W, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    WHITE_OPAL("white_opal", OreTypes.WHITE_OPAL, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ZANITE("zanite", OreTypes.ZANITE, MineralTypes.GEM, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//
//    // Elementary
//    AIR("air", OreTypes.AIR, MineralTypes.OTHER, Material.ROCK, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.STONE, 5, 6, 0, new Forms[] {}),
//    EARTH("earth", OreTypes.EARTH, MineralTypes.OTHER, Material.ROCK, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.STONE, 5, 6, 0, new Forms[] {}),
//    ENTROPY("entropy", OreTypes.ENTROPY, MineralTypes.OTHER, Material.ROCK, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.STONE, 5, 6, 0, new Forms[] {}),
//    FIRE("fire", OreTypes.FIRE, MineralTypes.OTHER, Material.ROCK, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.STONE, 5, 6, 0, new Forms[] {}),
//    ORDER("order", OreTypes.ORDER, MineralTypes.OTHER, Material.ROCK, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.STONE, 5, 6, 0, new Forms[] {}),
//    WATER("water", OreTypes.WATER, MineralTypes.OTHER, Material.ROCK, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.STONE, 5, 6, 0, new Forms[] {}),
//
//    // Other
//    ADAMANTIUM("adamantium", OreTypes.ADAMANTIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ARDITE("ardite", OreTypes.ARDITE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    BAUXITE("bauxite", OreTypes.BAUXITE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    BISMUTH("bismuth", OreTypes.BISMUTH, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    BONE("bone", OreTypes.BONE, MineralTypes.OTHER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    BORON("boron", OreTypes.BORON, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    CHROME("chrome", OreTypes.CHROME, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    COBALT("cobalt", OreTypes.COBALT, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    COPPER("copper", OreTypes.COPPER, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    GALENA("galena", OreTypes.GALENA, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    IRIDIUM("iridium", OreTypes.IRIDIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    LEAD("lead", OreTypes.LEAD, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    LINIUM("linium", OreTypes.LINIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    LITHIUM("lithium", OreTypes.LITHIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    LUCKY("lucky", OreTypes.LUCKY, MineralTypes.OTHER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    MAGNESIUM("magnesium", OreTypes.MAGNESIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    MANA_INFUSED("mana_infused", OreTypes.MANA_INFUSED, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    MITHRIL("mithril", OreTypes.MITHRIL, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    NAGRILITE("nagrilite", OreTypes.NAGRILITE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    NERIDIUM("neridium", OreTypes.NERIDIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    NICKEL("nickel", OreTypes.NICKEL, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    OSMIUM("osmium", OreTypes.OSMIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    PLATINUM("platinum", OreTypes.PLATINUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    PYRIDIUM("pyridium", OreTypes.PYRIDIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ROCKROOT("rockroot", OreTypes.ROCKROOT, MineralTypes.OTHER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    RUNITE("runite", OreTypes.RUNITE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    SILVER("silver", OreTypes.SILVER, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    SOULIUM("soulium", OreTypes.SOULIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    STEEL("steel", OreTypes.STEEL, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    TENEBRUM("tenebrum", OreTypes.TENEBRUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    THORIUM("thorium", OreTypes.THORIUM, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    TIN("tin", OreTypes.TIN, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    TUNGSTEN("tungsten", OreTypes.TUNGSTEN, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    URANINITE("uraninite", OreTypes.URANINITE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    VULCANITE("vulcanite", OreTypes.VULCANITE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    WITHERED_BONE("withered_bone", OreTypes.WITHERED_BONE, MineralTypes.OTHER, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    XP("xp", OreTypes.XP, MineralTypes.CRYSTAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    YELLORITE("yellorite", OreTypes.YELLORITE, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {}),
//    ZINC("zinc", OreTypes.ZINC, MineralTypes.METAL, Material.IRON, MaterialColor.ADOBE, 1, ToolType.PICKAXE, SoundType.METAL, 5, 6, 0, new Forms[] {});

    private final String name;
    private final OreTypes oType;
    private final MineralTypes mType;
    private final Material blockMaterial;
    private final MaterialColor mapColor;
    private final int harvestLevel;
    private final ToolType tool;
    private final SoundType sound;
    private final float hardness;
    private final float resistance;
    private final int lightValue;
    private final Forms[] formsToExclude;
    private final int color;

    private MaterialTypes(String name, OreTypes oType, MineralTypes mType, Material blockMaterial, MaterialColor mapColor, int harvestLevel, ToolType tool, SoundType sound, float hardness, float resistance, int lightValue, Forms[] formsToExclude, int color) {
        this.name = name;
        this.oType = oType;
        this.mType = mType;
        this.blockMaterial = blockMaterial;
        this.mapColor = mapColor;
        this.harvestLevel = harvestLevel;
        this.tool = tool;
        this.sound = sound;
        this.hardness = hardness;
        this.resistance = resistance;
        this.lightValue = lightValue;
        this.formsToExclude = formsToExclude;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public OreTypes getOreType() {
        return this.oType;
    }

    public MineralTypes getMineralType() {
        return this.mType;
    }

    public Material getBlockMaterial() {
        return blockMaterial;
    }

    public MaterialColor getMapColor() {
        return mapColor;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public ToolType getTool() {
        return tool;
    }

    public SoundType getSound() {
        return sound;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public int getLightValue() {
        return lightValue;
    }

    public List<Forms> getFormsToExclude() {
        return Arrays.asList(formsToExclude);
    }

//    public IItemColor getItemColor() {
//        return new IItemColor() {
//            @Override
//            public int getColor(ItemStack stack, int itemColor) {
//                return color;
//            }
//        };
//    }

    public IItemColor getItemColor()
    {
        return (stack, tintIndex) -> this.color;
    }

    public IBlockColor getBlockColor() {
        return (state, reader, pos, tintIndex) -> this.color;
    }

//    public IBlockColor getBlockColor() {
//        return new IBlockColor() {
//            @Override
//            public int getColor(BlockState state, ILightReader reader, BlockPos pos, int blockColor) {
//                return color;
//            }
//        };
//    }

}
