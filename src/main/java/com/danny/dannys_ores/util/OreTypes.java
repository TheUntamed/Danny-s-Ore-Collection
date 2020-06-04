package com.danny.dannys_ores.util;

import net.minecraft.util.IStringSerializable;

public enum OreTypes implements IStringSerializable {
    //Vanilla
    COAL("coal", 0, 0, 2, false, false),
    DIAMOND("diamond", 1, 3, 7, false, false),
    EMERALD("emerald", 1, 3, 7, false, false),
    GOLD("gold", 1, 0, 0, false, false),
    IRON("iron", 1, 0, 0, false, false),
    LAPIS("lapis", 1, 2, 5, false, false),
    QUARTZ("quartz", 1, 2, 5, false, false),
    REDSTONE("redstone", 2, 2, 5, false, false),

    //Gems
    AMETHYST("amethyst", 3, 3, 7, false, false),
    ANGLESITE("anglesite", 1, 0, 0, false, false),
    APATITE("apatite", 1, 0, 2, false, false),
    BENITOITE("benitoite", 1, 0, 0, false, false),
    BLACK_OPAL("black_opal", 4, 5, 10, false, false),
    BLACK_QUARTZ("black_quartz", 1, 3, 7, false, false),
    CERTUS_QUARTZ("certus_quartz", 1, 1, 5, false, false),
    CHARGED_CERTUS_QUARTZ("charged_certus_quartz", 1, 1, 5, false, false),
    DIMENSIONAL_SHARD("dimensional_shard", 2, 3, 7, false, false),
    DRACONIUM("draconium", 3, 3, 7, false, false),
    ELECTROTINE("electrotine", 1, 1, 3, false, false),
    IMPERIUM("imperium", 3, 5, 8, false, false),
    INFERIUM("inferium", 1, 2, 5, false, false),
    INSANIUM("insanium", 4, 7, 10, false, false),
    LAVA_CRYSTAL("lava_crystal", 3, 0, 0, false, false),
    NITER("niter", 1, 0, 0, false, false),
    PERIDOT("peridot", 2, 2, 7, false, false),
    PROSPERITY("prosperity", 1, 1, 5, false, false),
    PRUDENTIUM("prudentium", 2, 3, 6, false, false),
    PYRITE("pyrite", 2, 0, 0, false, false),
    RUBY("ruby", 2, 2, 7, false, false),
    SAPPHIRE("sapphire", 2, 2, 7, false, false),
    STICKY("sticky", 0, 1, 5, false, false),
    SULFUR("sulfur", 1, 0, 0, false, false),
    SUPREMIUM("supremium", 3, 6, 9, false, false),
    TERTIUM("tertium", 2, 4, 7, false, false),
    WHITE_OPAL("white_opal", 4, 5, 10, false, false),
    ZANITE("zanite", 2, 2, 7, false, false),

    //Other
    ADAMANTIUM("adamantium", 3, 0, 0, false, false),
    ARDITE("ardite", 1, 3, 0, false, false),
    BAUXITE("bauxite", 1, 0, 0, false, false),
    BISMUTH("bismuth", 1, 0, 0, false, false),
    BORON("boron", 1, 0, 0, false, false),
    CHROME("chrome", 1, 0, 0, false, false),
    COBALT("cobalt", 3, 0, 0, false, false),
    COPPER("copper", 1, 0, 0, false, false),
    GALENA("galena", 2, 0, 0, false, false),
    IRIDIUM("iridium", 3, 0, 0, false, false),
    LEAD("lead", 1, 0, 0, false, false),
    LITHIUM("lithium", 1, 0, 0, false, false),
    LUCKY("lucky", 2, 0, 0, false, false),
    MAGNESIUM("magnesium", 1, 0, 0, false, false),
    MANA_INFUSED("mana_infused", 2, 0, 0, false, false),
    MITHRIL("mithril", 2, 0, 0, false, false),
    NICKEL("nickel", 1, 0, 0, false, false),
    OSMIUM("osmium", 1, 0, 0, false, false),
    PLATINUM("platinum", 1, 0, 0, false, false),
    RUNITE("runite", 3, 0, 0, false, false),
    SILVER("silver", 1, 0, 0, false, false),
    SOULIUM("soulium", 0, 0, 0, false, false),
    STEEL("steel", 2, 0, 0, false, false),
    THORIUM("thorium", 1, 0, 0, false, false),
    TIN("tin", 1, 0, 0, false, false),
    TUNGSTEN("tungsten", 2, 0, 0, false, false),
    URANIUM("uranium", 1, 0, 0, false, false),
    VULCANITE("vulcanite", 1, 0, 0, false, false),
    XP("xp", 1, 0, 0, false, false),
    YELLORITE("yellorite", 1, 0, 0, false, false),
    ZINC("zinc", 1, 0, 0, false, false),
    EARTH("earth", 1, 0, 0, false, false),
    FIRE("fire", 1, 0, 0, false, false),
    AIR("air", 1, 0, 0, false, false),
    WATER("water", 1, 0, 0, false, false),
    ORDER("order", 1, 0, 0, false, false),
    ENTROPY("entropy", 1, 0, 0, false, true);

    //private static final OreTypes[] TYPES = Arrays.stream(values()).sorted(Comparator.comparingInt(OreTypes::getId)).toArray(OreTypes[]::new);

    //private final int id;
    private final String name;
    private final int harvestLevel;
    private final int minXp;
    private final int maxXp;
    private final boolean hasParticles;
    private final boolean canExplode;

    private OreTypes(String name, int harvestLevel, int minXp, int maxXp, boolean hasParticles, boolean canExplode) {
        //this.id = id;
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.minXp = minXp;
        this.maxXp = maxXp;
        this.hasParticles = hasParticles;
        this.canExplode = canExplode;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

//    public int getId() {
//        return this.id;
//    }
//
//    public static OreTypes byId(int id) {
//        if(id < 0 || id >= TYPES.length)
//        {
//            id = 0;
//        }
//        return TYPES[id];
//    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public boolean isHasParticles() {
        return hasParticles;
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
}
