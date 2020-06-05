package com.danny.dannys_ores.util;

import net.minecraft.util.IStringSerializable;

public enum RichnessTypes implements IStringSerializable {
    NORMAL("normal", 1.0F),
    POOR("poor", 0.5F),
    DENSE("dense", 1.5F);

    private final String name;
    private final float xpMultiplier;

    private RichnessTypes(String name, float xpMultiplier) {
        this.name = name;
        this.xpMultiplier = xpMultiplier;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public float getXpMultiplier() {
        return xpMultiplier;
    }
}
