package com.danny.dannys_ores.util;

/**
 * Provides the config values for ore types.
 */
public enum ConfigTypes {
    //Vanilla
    EMERALD("emerald", 1, 11, 0, 32,0.5F, 0.5F, 0.5F),
    LAPIS("lapis", 7, 1, 0, 32,0.5F, 0.5F, 0.5F),
    DIAMOND("diamond", 8, 1, 0, 16,0.5F, 0.5F, 0.5F),
    REDSTONE("redstone", 8, 8, 0, 16,0.5F, 0.5F, 0.5F),
    GOLD("gold", 9, 2, 0, 32,0.5F, 0.5F, 0.5F),
    IRON("iron", 9, 20, 0, 64,0.5F, 0.5F, 0.5F),
    COAL("coal", 17, 20, 0, 128, 0.5F, 0.5F, 0.5F),

    QUARTZ("quartz", 7, 8, 0, 128,0.5F, 2.0F, 0.5F),

    S1C1B0T16("s1c1b0t16", 1, 1, 0, 16,0.5F, 0.5F, 0.5F),
    S1C1B0T32("s1c1b0t32", 1, 1, 0, 32,0.5F, 0.5F, 0.5F),
    S1C1B0T48("s1c1b0t48", 1, 1, 0, 48,0.5F, 0.5F, 0.5F),
    S1C2B0T48("s1c2b0t48", 1, 2, 0, 48,0.5F, 0.5F, 0.5F),
    S1C11B40T128("s1c11b40t128", 1, 11, 40, 128,0.5F, 0.5F, 0.5F),
    S2C4B0T64("s2c4b0t64", 2, 4, 0, 64,0.5F, 0.5F, 0.5F),
    S2C8B0T32("s2c8b0t32", 2, 8, 0, 32,0.5F, 0.5F, 0.5F),
    S2C8B32T128("s2c8b32t128", 2, 8, 32, 128,0.5F, 0.5F, 0.5F),
    S2C8B40T128("s2c8b40t128", 2, 8, 40, 128,0.5F, 0.5F, 0.5F),
    S2C15B40T128("s2c15b40t128", 2, 15, 40, 128, 0.5F, 0.5F, 0.5F),
    S3C2B0T24("s3c2b0t24", 3, 2, 0, 24,0.5F, 0.5F, 0.5F),
    S3C2B0T48("s3c2b0t48", 3, 2, 0, 48,0.5F, 0.5F, 0.5F),
    S3C3B0T32("s3c3b0t32", 3, 3, 0, 32,0.5F, 0.5F, 0.5F),
    S3C3B16T48("s3c3b16t48", 3, 3, 16, 48,0.5F, 0.5F, 0.5F),
    S3C4B0T48("s3c4b0t48", 3, 4, 0, 48,0.5F, 0.5F, 0.5F),
    S3C16B48T128("s3c16b48t128", 3, 16, 48, 128,0.5F, 0.5F, 0.5F),
    S4C2B0T128("s4c2b0t48", 4, 2, 0, 128,0.5F, 0.5F, 0.5F),
    S4C3B0T128("s4c3b0t48", 4, 3, 0, 128,0.5F, 0.5F, 0.5F),
    S4C4B0T40("s4c4b0t40", 4, 4, 0, 40,0.5F, 0.5F, 0.5F),
    S4C4B0T48("s4c4b0t48", 4, 4, 0, 48,0.5F, 0.5F, 0.5F),
    S4C4B20T48("s4c4b20t48", 4, 4, 20, 48,0.5F, 0.5F, 0.5F),
    S4C5B0T32("s4c5b0t32", 4, 5, 0, 32,0.5F, 0.5F, 0.5F),
    S4C6B0T32("s4c6b0t32", 4, 6, 0, 32,0.5F, 0.5F, 0.5F),
    S4C8B0T32("s4c8b0t32", 4, 8, 0, 32,0.5F, 0.5F, 0.5F),
    S4C8B0T96("s4c8b0t96", 4, 8, 0, 96,0.5F, 0.5F, 0.5F),
    S4C8B24T64("s4c8b24t64", 4, 8, 24, 64,0.5F, 0.5F, 0.5F),
    S4C15B32T128("s4c15b32t128", 4, 15, 32, 128,0.5F, 0.5F, 0.5F),
    S5C2B0T32("s5c2b0t32", 5, 2, 0, 32,0.5F, 0.5F, 0.5F),
    S5C4B0T24("s5c4b0t24", 5, 4, 0, 24,0.5F, 0.5F, 0.5F),
    S5C10B0T48("s5c10b0t48", 5, 10, 0, 48,0.5F, 0.5F, 0.5F),
    S6C1B0T24("s6c1b0t24", 6, 1, 0, 24,0.5F, 0.5F, 0.5F),
    S6C2B0T16("s6c2b0t16", 6, 2, 0, 16,0.5F, 0.5F, 0.5F),
    S6C2B0T32("s6c2b0t32", 6, 2, 0, 32,0.5F, 0.5F, 0.5F),
    S6C3B0T24("s6c3b0t24", 6, 3, 0, 24,0.5F, 0.5F, 0.5F),
    S6C3B8T64("s6c3b8t64", 6, 3, 8, 64,0.5F, 0.5F, 0.5F),
    S6C3B16T128("s6c3b16t128", 6, 3, 16, 128,0.5F, 0.5F, 0.5F),
    S6C8B0T16("s6c8b0t16", 6, 8, 0, 16,0.5F, 0.5F, 0.5F),
    S6C10B0T64("s6c10b0t64", 6, 10, 0, 64,0.5F, 0.5F, 0.5F),
    S7C1B16T48("s7c1b16t48", 7, 1, 16, 48,0.5F, 0.5F, 0.5F),
    S7C5B0T32("s7c5b0t32", 7, 5, 0, 32,0.5F, 0.5F, 0.5F),
    S8C3B0T40("s8c3b0t40", 8, 3, 0, 40,0.5F, 0.5F, 0.5F),
    S8C12B0T24("s8c12b0t24", 8, 12, 0, 24,0.5F, 0.5F, 0.5F),
    S8C12B0T48("s8c12b0t48", 8, 12, 0, 48,0.5F, 0.5F, 0.5F),
    S8C12B0T64("s8c12b0t64", 8, 12, 0, 64,0.5F, 0.5F, 0.5F),
    S8C16B0T128("s8c16b0t128", 8, 16, 0, 128,0.5F, 0.5F, 0.5F),
    S9C20B40T128("s9c20b40t128", 9, 20, 40, 128,0.5F, 0.5F, 0.5F),
    S16C8B0T64("s16c8b0t64", 16, 8, 0, 64,0.5F, 0.5F, 0.5F),
    S17C20B48T128("s17c20b48t128", 17, 20, 48, 128,0.5F, 0.5F, 0.5F),

    S2C1B16T64N2("s2c2b16t64n2", 2, 2, 16, 64,0.5F, 2.0F, 0.5F),
    S2C5B40T128N2("s2c15b40t128n2", 2, 5, 40, 128, 0.5F, 2.0F, 0.5F),
    S2C3B0T48N2("s2c3b0t48n2", 2, 3, 0, 48,0.5F, 2.0F, 0.5F),
    S2C3B16T64N2("s2c3b16t64n2", 2, 3, 16, 64,0.5F, 2.0F, 0.5F),
    S3C2B0T24N2("s3c2b0t24n2", 3, 2, 0, 24,0.5F, 2.0F, 0.5F),
    S3C2B16T64N2("s3c2b0t64n2", 3, 2, 16, 64,0.5F, 2.0F, 0.5F),
    S4C4B16T64N2("s4c4b16t64n2", 4, 4, 16, 64,0.5F, 2.0F, 0.5F),
    S7C10B016T64N2("s7c10b16t64n2", 7, 10, 16, 64,0.5F, 2.0F, 0.5F);

    //SCBT("scbt", 0, 0, 0, 0,0.5F, 0.5F, 0.5F)

    private final String configName;
    private final int veinSize, veinsPerChunk;
    private final int minY, maxY;
    private final float netherFactor, surfaceFactor, endFactor;

    private ConfigTypes(String configName, int veinSize, int veinsPerChunk, int minY, int maxY, float surfaceFactor, float netherFactor, float endFactor) {
        this.configName = configName;
        this.veinSize =veinSize;
        this.veinsPerChunk = veinsPerChunk;
        this.minY = minY;
        this.maxY = maxY;
        this.surfaceFactor = surfaceFactor;
        this.netherFactor = netherFactor;
        this.endFactor = endFactor;
    }

    public String getName() { return this.configName; }

    public int getVeinsPerChunk(float factor) { return Math.round(getVeinsPerChunk() * factor); }

    public int getVeinSize(float factor) { return Math.round(getVeinSize() * factor); }

    public float getNetherFactor() { return netherFactor; }

    public float getEndFactor() { return endFactor; }

    public int getVeinSize() { return veinSize; }

    public int getVeinsPerChunk() { return veinsPerChunk; }

    public int getMinY() { return minY; }

    public int getMaxY() { return maxY; }

    public float getSurfaceFactor() { return surfaceFactor; }
}
