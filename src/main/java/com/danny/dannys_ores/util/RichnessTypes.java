package com.danny.dannys_ores.util;

/**
 * Provides the richness type feature. Each ore has exactly one of these features assigned.
 */
public enum RichnessTypes {
    NORMAL("normal", 1.0F),
    POOR("poor", 0.5F),
    DENSE("dense", 1.5F);

    private final String name;
    private final float xpMultiplier;

    private RichnessTypes(String name, float xpMultiplier) {
        this.name = name;
        this.xpMultiplier = xpMultiplier;
    }

    public String getName() {
        return this.name;
    }

    public float getXpMultiplier() {
        return xpMultiplier;
    }
}
