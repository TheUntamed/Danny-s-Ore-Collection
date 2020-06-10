package com.danny.dannys_ores.util;

/**
 * Provides the effect feature. Each ore type has exactly one of these features assigned.
 */
public enum Effects {
    NONE("none"),
    EXPLODE("explode"),
    BURN("burn"),
    DROWN("drown"),
    LEVITATE("levitate"),
    POISON("poison"),
    SLOW("slow");

    private final String name;

    private Effects(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
