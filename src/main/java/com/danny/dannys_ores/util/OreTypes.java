package com.danny.dannys_ores.util;

import net.minecraft.particles.BasicParticleType;

public enum OreTypes {
    //Vanilla
    COAL("coal", 0, 0, 2, false,null, true, ConfigTypes.COAL),
    DIAMOND("diamond", 2, 3, 7, false,null, true, ConfigTypes.COAL),
    EMERALD("emerald", 2, 3, 7, false,null, true, ConfigTypes.COAL),
    GOLD("gold", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    IRON("iron", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    LAPIS("lapis", 1, 2, 5, false,null, true, ConfigTypes.COAL),
    QUARTZ("quartz", 1, 2, 5, false,null, true, ConfigTypes.COAL),
    REDSTONE("redstone", 2, 2, 5, false,null, true, ConfigTypes.COAL),

    //Gems
    AMETHYST("amethyst", 3, 3, 7, false,null, true, ConfigTypes.COAL),
    ANGLESITE("anglesite", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    APATITE("apatite", 1, 0, 2, false,null, true, ConfigTypes.COAL),
    BENITOITE("benitoite", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    BLACK_OPAL("black_opal", 4, 5, 10, false,null, true, ConfigTypes.COAL),
    BLACK_QUARTZ("black_quartz", 1, 3, 7, false,null, true, ConfigTypes.COAL),
    CERTUS_QUARTZ("certus_quartz", 1, 1, 5, false,null, true, ConfigTypes.COAL),
    CHARGED_CERTUS_QUARTZ("charged_certus_quartz", 1, 1, 5, false,null, true, ConfigTypes.COAL),
    DIMENSIONAL_SHARD("dimensional_shard", 2, 3, 7, false,null, true, ConfigTypes.COAL),
    DRACONIUM("draconium", 3, 3, 7, false,null, true, ConfigTypes.COAL),
    ELECTROTINE("electrotine", 1, 1, 3, false,null, true, ConfigTypes.COAL),
    IMPERIUM("imperium", 3, 5, 8, false,null, true, ConfigTypes.COAL),
    INFERIUM("inferium", 1, 2, 5, false,null, true, ConfigTypes.COAL),
    INSANIUM("insanium", 4, 7, 10, false,null, true, ConfigTypes.COAL),
    LAVA_CRYSTAL("lava_crystal", 3, 0, 0, false,null, true, ConfigTypes.COAL),
    NITER("niter", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    PERIDOT("peridot", 2, 2, 7, false,null, true, ConfigTypes.COAL),
    PROSPERITY("prosperity", 1, 1, 5, false,null, true, ConfigTypes.COAL),
    PRUDENTIUM("prudentium", 2, 3, 6, false,null, true, ConfigTypes.COAL),
    PYRITE("pyrite", 2, 0, 0, false,null, true, ConfigTypes.COAL),
    RUBY("ruby", 2, 2, 7, false,null, true, ConfigTypes.COAL),
    SAPPHIRE("sapphire", 2, 2, 7, false,null, true, ConfigTypes.COAL),
    STICKY("sticky", 0, 1, 5, false,null, true, ConfigTypes.COAL),
    SULFUR("sulfur", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    SUPREMIUM("supremium", 3, 6, 9, false,null, true, ConfigTypes.COAL),
    TERTIUM("tertium", 2, 4, 7, false,null, true, ConfigTypes.COAL),
    WHITE_OPAL("white_opal", 4, 5, 10, false,null, true, ConfigTypes.COAL),
    ZANITE("zanite", 2, 2, 7, false,null, true, ConfigTypes.COAL),

    //Other
    ADAMANTIUM("adamantium", 3, 0, 0, false,null, true, ConfigTypes.COAL),
    ARDITE("ardite", 1, 3, 0, false,null, true, ConfigTypes.COAL),
    BAUXITE("bauxite", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    BISMUTH("bismuth", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    BORON("boron", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    CHROME("chrome", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    COBALT("cobalt", 3, 0, 0, false,null, true, ConfigTypes.COAL),
    COPPER("copper", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    GALENA("galena", 2, 0, 0, false,null, true, ConfigTypes.COAL),
    IRIDIUM("iridium", 3, 0, 0, false,null, true, ConfigTypes.COAL),
    LEAD("lead", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    LITHIUM("lithium", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    LUCKY("lucky", 2, 0, 0, false,null, true, ConfigTypes.COAL),
    MAGNESIUM("magnesium", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    MANA_INFUSED("mana_infused", 2, 0, 0, false,null, true, ConfigTypes.COAL),
    MITHRIL("mithril", 2, 0, 0, false,null, true, ConfigTypes.COAL),
    NICKEL("nickel", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    OSMIUM("osmium", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    PLATINUM("platinum", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    RUNITE("runite", 3, 0, 0, false,null, true, ConfigTypes.COAL),
    SILVER("silver", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    SOULIUM("soulium", 0, 0, 0, false,null, true, ConfigTypes.COAL),
    STEEL("steel", 2, 0, 0, false,null, true, ConfigTypes.COAL),
    THORIUM("thorium", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    TIN("tin", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    TUNGSTEN("tungsten", 2, 0, 0, false,null, true, ConfigTypes.COAL),
    URANINITE("uraninite", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    VULCANITE("vulcanite", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    XP("xp", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    YELLORITE("yellorite", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    ZINC("zinc", 1, 0, 0, false,null, true, ConfigTypes.COAL),
    EARTH("earth", 1, 0, 0, false,null, false, ConfigTypes.COAL),
    FIRE("fire", 1, 0, 0, false,null, false, ConfigTypes.COAL),
    AIR("air", 1, 0, 0, false,null, false, ConfigTypes.COAL),
    WATER("water", 1, 0, 0, false,null, false, ConfigTypes.COAL),
    ORDER("order", 1, 0, 0, false,null, false, ConfigTypes.COAL),
    ENTROPY("entropy", 1, 0, 0, false,null, false, ConfigTypes.COAL);
//    ARCHAIC("archaic", 0, 3, 7, false,null, false, ConfigTypes.COAL),
//    EBONITE("ebonite", 1, 3, 7, false,null, false, ConfigTypes.COAL),
//    FOULITE("foulite", 0, 0, 0, false,null, false, ConfigTypes.COAL),
//    LINIUM("linium", 3, 0, 0, false,null, false, ConfigTypes.COAL),
//    NAGRILITE("nagrilite", 2, 0, 0, false,null, false, ConfigTypes.COAL),
//    NERIDIUM("neridium", 1, 0, 0, false,null, false, ConfigTypes.COAL),
//    PYRIDIUM("pyridium", 2, 0, 0, false,null, false, ConfigTypes.COAL),
//    TENEBRUM("tenebrum", 2, 0, 0, false,null, false, ConfigTypes.COAL),
//    W("w", 3, 0, 0, false,null, false, ConfigTypes.COAL);

    private final String name;
    private final int harvestLevel;
    private final int minXp;
    private final int maxXp;
    private final boolean canExplode;
    private final BasicParticleType bpt;
    private final boolean hasRichnessLevels;
    private final ConfigTypes cType;

    private OreTypes(String name, int harvestLevel, int minXp, int maxXp, boolean canExplode, BasicParticleType bpt, boolean hasRichnessLevels, ConfigTypes cType) {
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.minXp = minXp;
        this.maxXp = maxXp;
        this.canExplode = canExplode;
        this.bpt = bpt;
        this.hasRichnessLevels = hasRichnessLevels;
        this.cType = cType;
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

    public ConfigTypes getConfigType() {
        return cType;
    }
}
