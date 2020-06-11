package com.danny.dannys_ores.util;

public enum ConfigTypes {
    //Vanilla
    COAL("coal", 17, 20, 0, 128, 1, 1),
    DIAMOND("diamond", 8, 1, 0, 16, 1, 1),
    EMERALD("emerald", 1, 11, 0, 32, 1, 1),
    GOLD("gold", 9, 2, 0, 32, 1, 1),
    IRON("iron", 9, 20, 0, 64, 1, 1),
    LAPIS("lapis", 7, 1, 0, 32, 1, 1),
    QUARTZ("quartz", 7, 8, 0, 128, 2, 1),
    REDSTONE("redstone", 8, 8, 0, 16, 1, 1);

    private final String name;
    private final int veinSize;
    private final int veinsPerChunk;
    private final int minY;
    private final int maxY;
    private final float netherFactor;
    private final float endFactor;

    private ConfigTypes(String name, int veinSize, int veinsPerChunk, int minY, int maxY, float netherFactor, float endFactor) {
        this.name = name;
        this.veinSize = veinSize;
        this.veinsPerChunk = veinsPerChunk;
        this.minY = minY;
        this.maxY = maxY;
        this.netherFactor = netherFactor;
        this.endFactor = endFactor;
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

    public int getVeinsPerChunk(float factor) {
        return Math.round(getVeinsPerChunk() * factor);
    }

    public int getVeinSize(float factor) {
        return Math.round(getVeinSize() * factor);
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public float getNetherFactor() {
        return netherFactor;
    }

    public float getEndFactor() {
        return endFactor;
    }
}
