package com.danny.dannys_ores.util;

public enum ConfigTypes {
    //Vanilla
    COAL("coal", 0, 0, 0, 0),
    DIAMOND("diamond", 0, 0, 0, 0),
    EMERALD("emerald", 0, 0, 0, 0),
    GOLD("gold", 0, 0, 0, 0),
    IRON("iron", 0, 0, 0, 0),
    LAPIS("lapis", 0, 0, 0, 0),
    QUARTZ("quartz", 0, 0, 0, 0),
    REDSTONE("redstone", 0, 0, 0, 0);

    private final String name;
    private final int veinSize;
    private final int veinsPerChunk;
    private final int minY;
    private final int maxY;

    private ConfigTypes(String name, int veinSize, int veinsPerChunk, int minY, int maxY) {
        this.name = name;
        this.veinSize = veinSize;
        this.veinsPerChunk = veinsPerChunk;
        this.minY = minY;
        this.maxY = maxY;
    }

    public String getName() {
        return this.name;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public int getVeinSize() {
        return veinSize;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }
}
