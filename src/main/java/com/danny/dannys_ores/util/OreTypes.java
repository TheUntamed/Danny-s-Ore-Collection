package com.danny.dannys_ores.util;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.IStringSerializable;

public enum OreTypes implements IStringSerializable {
    //Vanilla
    COAL("coal", 0, 0, 2, false,null, true),
    DIAMOND("diamond", 2, 3, 7, false,null, true),
    EMERALD("emerald", 2, 3, 7, false,null, true),
    GOLD("gold", 1, 0, 0, false,null, true),
    IRON("iron", 1, 0, 0, false,null, true),
    LAPIS("lapis", 1, 2, 5, false,null, true),
    QUARTZ("quartz", 1, 2, 5, false,null, true),
    REDSTONE("redstone", 2, 2, 5, false,null, true),

    //Gems
    AMETHYST("amethyst", 3, 3, 7, false,null, true),
    ANGLESITE("anglesite", 1, 0, 0, false,null, true),
    APATITE("apatite", 1, 0, 2, false,null, true),
    BENITOITE("benitoite", 1, 0, 0, false,null, true),
    BLACK_OPAL("black_opal", 4, 5, 10, false,null, true),
    BLACK_QUARTZ("black_quartz", 1, 3, 7, false,null, true),
    CERTUS_QUARTZ("certus_quartz", 1, 1, 5, false,null, true),
    CHARGED_CERTUS_QUARTZ("charged_certus_quartz", 1, 1, 5, false,null, true),
    DIMENSIONAL_SHARD("dimensional_shard", 2, 3, 7, false,null, true),
    DRACONIUM("draconium", 3, 3, 7, false,null, true),
    ELECTROTINE("electrotine", 1, 1, 3, false,null, true),
    IMPERIUM("imperium", 3, 5, 8, false,null, true),
    INFERIUM("inferium", 1, 2, 5, false,null, true),
    INSANIUM("insanium", 4, 7, 10, false,null, true),
    LAVA_CRYSTAL("lava_crystal", 3, 0, 0, false,null, true),
    NITER("niter", 1, 0, 0, false,null, true),
    PERIDOT("peridot", 2, 2, 7, false,null, true),
    PROSPERITY("prosperity", 1, 1, 5, false,null, true),
    PRUDENTIUM("prudentium", 2, 3, 6, false,null, true),
    PYRITE("pyrite", 2, 0, 0, false,null, true),
    RUBY("ruby", 2, 2, 7, false,null, true),
    SAPPHIRE("sapphire", 2, 2, 7, false,null, true),
    STICKY("sticky", 0, 1, 5, false,null, true),
    SULFUR("sulfur", 1, 0, 0, false,null, true),
    SUPREMIUM("supremium", 3, 6, 9, false,null, true),
    TERTIUM("tertium", 2, 4, 7, false,null, true),
    WHITE_OPAL("white_opal", 4, 5, 10, false,null, true),
    ZANITE("zanite", 2, 2, 7, false,null, true),

    //Other
    ADAMANTIUM("adamantium", 3, 0, 0, false,null, true),
    ARDITE("ardite", 1, 3, 0, false,null, true),
    BAUXITE("bauxite", 1, 0, 0, false,null, true),
    BISMUTH("bismuth", 1, 0, 0, false,null, true),
    BORON("boron", 1, 0, 0, false,null, true),
    CHROME("chrome", 1, 0, 0, false,null, true),
    COBALT("cobalt", 3, 0, 0, false,null, true),
    COPPER("copper", 1, 0, 0, false,null, true),
    GALENA("galena", 2, 0, 0, false,null, true),
    IRIDIUM("iridium", 3, 0, 0, false,null, true),
    LEAD("lead", 1, 0, 0, false,null, true),
    LITHIUM("lithium", 1, 0, 0, false,null, true),
    LUCKY("lucky", 2, 0, 0, false,null, true),
    MAGNESIUM("magnesium", 1, 0, 0, false,null, true),
    MANA_INFUSED("mana_infused", 2, 0, 0, false,null, true),
    MITHRIL("mithril", 2, 0, 0, false,null, true),
    NICKEL("nickel", 1, 0, 0, false,null, true),
    OSMIUM("osmium", 1, 0, 0, false,null, true),
    PLATINUM("platinum", 1, 0, 0, false,null, true),
    RUNITE("runite", 3, 0, 0, false,null, true),
    SILVER("silver", 1, 0, 0, false,null, true),
    SOULIUM("soulium", 0, 0, 0, false,null, true),
    STEEL("steel", 2, 0, 0, false,null, true),
    THORIUM("thorium", 1, 0, 0, false,null, true),
    TIN("tin", 1, 0, 0, false,null, true),
    TUNGSTEN("tungsten", 2, 0, 0, false,null, true),
    URANINITE("uraninite", 1, 0, 0, false,null, true),
    VULCANITE("vulcanite", 1, 0, 0, false,null, true),
    XP("xp", 1, 0, 0, false,null, true),
    YELLORITE("yellorite", 1, 0, 0, false,null, true),
    ZINC("zinc", 1, 0, 0, false,null, true),
    EARTH("earth", 1, 0, 0, false,null, false),
    FIRE("fire", 1, 0, 0, false,null, false),
    AIR("air", 1, 0, 0, false,null, false),
    WATER("water", 1, 0, 0, false,null, false),
    ORDER("order", 1, 0, 0, false,null, false),
    ENTROPY("entropy", 1, 0, 0, true,null, false);

    private final String name;
    private final int harvestLevel;
    private final int minXp;
    private final int maxXp;
    private final boolean canExplode;
    private final BasicParticleType bpt;
    private final boolean hasRichnessLevels;

    private OreTypes(String name, int harvestLevel, int minXp, int maxXp, boolean canExplode, BasicParticleType bpt, boolean hasRichnessLevels) {
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.minXp = minXp;
        this.maxXp = maxXp;
        this.canExplode = canExplode;
        this.bpt = bpt;
        this.hasRichnessLevels = hasRichnessLevels;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public int getMaxXp() {
        return maxXp;
    }

    public int getMinXp() {
        return minXp;
    }

    public boolean isCanExplode() {
        return canExplode;
    }

    public BasicParticleType getParticles() {
        return bpt;
    }

    public boolean isHasRichnessLevels() {
        return hasRichnessLevels;
    }
}
