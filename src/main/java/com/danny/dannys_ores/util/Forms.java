package com.danny.dannys_ores.util;

public enum Forms {
    INGOT("ingot", false),
//    NUGGET("nugget", false),
    STORAGE_BLOCK("block", true),
//    DUST("dust", false),
    PLATE("plate", false),
//    GEAR("gear", false),
//    ROD("rod", false),
    CASING("casing", true);

    private final String name;
    private final boolean isBlock;

    private Forms(String name, boolean isBlock) {
        this.name = name;
        this.isBlock = isBlock;
    }

    public String getName() {
        return name;
    }

    public boolean getIsBlock() {
        return isBlock;
    }
}
