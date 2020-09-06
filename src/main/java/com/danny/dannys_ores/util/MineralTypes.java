package com.danny.dannys_ores.util;

public enum MineralTypes {
    METAL("metal"),
    GEM("gem"),
    CRYSTAL("crystal"),
    POWDER("powder"),
    PEARL("pearl"),
    OTHER("other");

    private final String name;

    private MineralTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
