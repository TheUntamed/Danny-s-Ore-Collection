package com.danny.dannys_ores.util;

import net.minecraft.particles.BasicParticleType;

/**
 * Provides the ore type feature. Each ore has exactly one of these features assigned.
 */
public enum OreTypes {
    //Vanilla
    COAL("coal", 0, 1.0F, 0, 2, Effects.NONE, null, true, ConfigTypes.COAL),
    DIAMOND("diamond", 2, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.DIAMOND),
    EMERALD("emerald", 2, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.EMERALD),
    GOLD("gold", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.GOLD),
    IRON("iron", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.IRON),
    LAPIS("lapis", 1, 1.0F, 2, 5, Effects.NONE, null, true, ConfigTypes.LAPIS),
    QUARTZ("quartz", 1, 1.0F, 2, 5, Effects.NONE, null, true, ConfigTypes.QUARTZ),
    REDSTONE("redstone", 2, 1.0F, 2, 5, Effects.NONE, null, true, ConfigTypes.REDSTONE),

    //Gems
    AMBER("amber", 1, 1.0F, 6, 12, Effects.NONE, null, true, ConfigTypes.S4C2B0T128),
    AMETHYST("amethyst", 3, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.DIAMOND),
    ANGLESITE("anglesite", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S3C4B0T48),
    APATITE("apatite", 1, 1.0F, 0, 2, Effects.NONE, null, true, ConfigTypes.S17C20B48T128),
    ARCANE_CRYSTAL("arcane_crystal", 2, 1.0F, 2, 5, Effects.NONE, null, true, ConfigTypes.S6C3B0T24),
    ARCHAIC("archaic", 0, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.S1C1B0T16),
    BENITOITE("benitoite", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S3C4B0T48),
    BLACK_OPAL("black_opal", 4, 1.0F, 5, 10, Effects.NONE, null, true, ConfigTypes.S1C1B0T16),
    BLACK_QUARTZ("black_quartz", 1, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.S5C2B0T32),
    CERTUS_QUARTZ("certus_quartz", 1, 1.0F, 1, 5, Effects.NONE, null, true, ConfigTypes.S4C15B32T128),
    CHARGED_CERTUS_QUARTZ("charged_certus_quartz", 1, 1.0F, 1, 5, Effects.NONE, null, true, ConfigTypes.S2C8B32T128),
    DARK_PEARL("dark_pearl", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S16C8B0T64),
    DIMENSIONAL_SHARD("dimensional_shard", 2, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.S8C3B0T40),
    DRACONIUM("draconium", 3, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.S1C1B0T48),
    EBONITE("ebonite", 1, 1.0F, 3, 7, Effects.NONE, null, true, ConfigTypes.S8C12B0T24),
    ELECTROTINE("electrotine", 1, 1.0F, 1, 3, Effects.NONE, null, true, ConfigTypes.S6C8B0T16),
    FIERY_GLASS("fiery_glass", 2, 1.0F, 4, 10, Effects.NONE, null, true, ConfigTypes.S7C5B0T32),
    FOULITE("foulite", 0, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S7C10B016T64N2),
    IMPERIUM("imperium", 3, 1.0F, 5, 8, Effects.NONE, null, true, ConfigTypes.S1C2B0T48),
    INFERIUM("inferium", 1, 1.0F, 2, 5, Effects.NONE, null, true, ConfigTypes.S8C16B0T128),
    INSANIUM("insanium", 4, 1.0F, 7, 10, Effects.NONE, null, true, ConfigTypes.S1C1B0T16),
    LAVA_CRYSTAL("lava_crystal", 3, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S2C3B0T48N2),
    MALACHITE("malachite", 2, 1.0F, 2, 7, Effects.NONE, null, true, ConfigTypes.S6C3B8T64),
    MOONSTONE("moonstone", 3, 1.0F, 6, 14, Effects.NONE, null, true, ConfigTypes.S4C3B0T128),
    NITER("niter", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S2C8B40T128),
    PERIDOT("peridot", 2, 1.0F, 2, 7, Effects.NONE, null, true, ConfigTypes.S6C3B8T64),
    PROSPERITY("prosperity", 1, 1.0F, 1, 5, Effects.NONE, null, true, ConfigTypes.S8C12B0T48),
    PRUDENTIUM("prudentium", 2, 1.0F, 3, 6, Effects.NONE, null, true, ConfigTypes.S4C8B0T96),
    PYRITE("pyrite", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S6C3B16T128),
    RUBY("ruby", 2, 1.0F, 2, 7, Effects.NONE, null, true, ConfigTypes.S6C3B8T64),
    RUNESTONE("runestone", 3, 1.0F, 4, 8, Effects.NONE, null, false, ConfigTypes.S3C2B0T24),
    SAPPHIRE("sapphire", 2, 1.0F, 2, 7, Effects.NONE, null, true, ConfigTypes.S6C3B8T64),
    STICKY("sticky", 0, 1.0F, 1, 5, Effects.NONE, null, true, ConfigTypes.S1C11B40T128),
    SULFUR("sulfur", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S3C2B0T24N2),
    SUPREMIUM("supremium", 3, 1.0F, 6, 9, Effects.NONE, null, true, ConfigTypes.S1C1B0T32),
    TERTIUM("tertium", 2, 1.0F, 4, 7, Effects.NONE, null, true, ConfigTypes.S2C4B0T64),
    W("w", 3, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S2C1B16T64),
    WHITE_OPAL("white_opal", 4, 1.0F, 5, 10, Effects.NONE, null, true, ConfigTypes.S1C1B0T16),
    //XPETRIFIED("xpetrified", 2, 1.0F, 0, 0, Effects.NONE ,null, false, ConfigTypes.EMERALD),
    ZANITE("zanite", 2, 1.0F, 2, 7, Effects.NONE, null, true, ConfigTypes.S6C3B8T64),

    //Elementary
    AIR("air", 1, 1.0F, 0, 0, Effects.LEVITATE, null, false, ConfigTypes.S4C5B0T32),
    EARTH("earth", 1, 1.0F, 0, 0, Effects.SLOW, null, false, ConfigTypes.S4C5B0T32),
    ENTROPY("entropy", 1, 1.0F, 0, 0, Effects.EXPLODE, null, false, ConfigTypes.S4C5B0T32),
    FIRE("fire", 1, 1.0F, 0, 0, Effects.BURN, null, false, ConfigTypes.S4C5B0T32),
    ORDER("order", 1, 1.0F, 0, 0, Effects.NONE, null, false, ConfigTypes.S4C5B0T32),
    WATER("water", 1, 1.0F, 0, 0, Effects.DROWN, null, false, ConfigTypes.S4C5B0T32),

    //Other
    ADAMANTIUM("adamantium", 3, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S2C8B0T32),
    ARDITE("ardite", 1, 1.0F, 3, 0, Effects.NONE, null, true, ConfigTypes.S6C2B0T16),
    BAUXITE("bauxite", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C4B20T48),
    BISMUTH("bismuth", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C4B0T40),
    BORON("boron", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C6B0T32),
    CHROME("chrome", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S6C10B0T64),
    COBALT("cobalt", 3, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S6C2B0T16),
    COPPER("copper", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S9C20B40T128),
    GALENA("galena", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C4B0T40),
    IRIDIUM("iridium", 3, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S1C1B0T16),
    LEAD("lead", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C4B0T40),
    LINIUM("linium", 3, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S2C3B16T64N2),
    LITHIUM("lithium", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C6B0T32),
    LUCKY("lucky", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.EMERALD),
    MAGNESIUM("magnesium", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S5C4B0T24),
    MANA_INFUSED("mana_infused", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S3C3B16T48),
    MITHRIL("mithril", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S7C1B16T48),
    NAGRILITE("nagrilite", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S5C10B0T48),
    NERIDIUM("neridium", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C4B16T64N2),
    NICKEL("nickel", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S6C1B0T24),
    OSMIUM("osmium", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S8C12B0T64),
    PLATINUM("platinum", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.DIAMOND),
    PYRIDIUM("pyridium", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S3C2B16T64N2),
    ROCKROOT("rockroot", 0, 1.0F, 2, 10, Effects.NONE, null, true, ConfigTypes.S3C16B48T128),
    RUNITE("runite", 3, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.GOLD),
    SILVER("silver", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C4B0T40),
    SOULIUM("soulium", 0, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S6C2B0T32),
    STEEL("steel", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S5C10B0T48),
    TENEBRUM("tenebrum", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S5C10B0T48),
    THORIUM("thorium", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S3C3B0T32),
    TIN("tin", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S9C20B40T128),
    TUNGSTEN("tungsten", 2, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S6C3B16T128),
    URANINITE("uraninite", 1, 1.0F, 0, 0, Effects.POISON, null, true, ConfigTypes.GOLD),
    VULCANITE("vulcanite", 1, 1.0F, 0, 0, Effects.BURN, null, true, ConfigTypes.S4C5B0T32),
    XP("xp", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S1C11B40T128),
    YELLORITE("yellorite", 1, 1.0F, 0, 0, Effects.POISON, null, true, ConfigTypes.GOLD),
    ZINC("zinc", 1, 1.0F, 0, 0, Effects.NONE, null, true, ConfigTypes.S4C8B24T64);

    private final String name;
    private final int harvestLevel;
    private final float hardnessMultiplier;
    private final int minXp, maxXp;
    private final Effects effect;
    private final BasicParticleType bpt;
    private final boolean hasRichnessLevels;
    private final ConfigTypes cType;

    private OreTypes(String name, int harvestLevel, float hardnessMultiplier, int minXp, int maxXp, Effects effect, BasicParticleType bpt, boolean hasRichnessLevels, ConfigTypes cType) {
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.hardnessMultiplier = hardnessMultiplier;
        this.minXp = minXp;
        this.maxXp = maxXp;
        this.effect = effect;
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

    public BasicParticleType getParticles() {
        return bpt;
    }

    public boolean isHasRichnessLevels() {
        return hasRichnessLevels;
    }

    public ConfigTypes getConfigType() {
        return cType;
    }

    public Effects getEffect() {
        return effect;
    }

    /**
     * This method is used by configs to define the default and minimum effect duration.
     *
     * @return The duration of an effect
     */
    public int getEffectDuration() {
        if (this.getEffect().equals(Effects.POISON)) {
            return 25;
        } else {
            return 1;
        }
    }

    public float getHardnessMultiplier() {
        return hardnessMultiplier;
    }
}
