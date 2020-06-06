package com.danny.dannys_ores.util;

import com.danny.dannys_ores.Main;

public class ModHandler {

    public static boolean variantsModIdExists(VariantsModId modId) {
        switch (modId) {
            case MINECRAFT:
            case DANNYS_ORES:
                return true;
            case QUARK: return Main.quark;
            case EMBELLISHCRAFT: return Main.embellishcraft;
            case THE_MIDNIGHT: return Main.theMidnight;
            case MYSTICAL_AGRICULTURE: return Main.mysticalAgriculture;
            default: return false;
        }
    }
}
