package com.danny.dannys_ores.util;

import net.minecraftforge.fml.ModList;

public class ModHandler {

    /**
     * Checks if a given mod is loaded.
     *
     * @param modId The mod to check.
     * @return True if the mod is in the forge mod list.
     */
    public static boolean variantsModIdExists(VariantsModId modId) {
        ModList mods = ModList.get();
        switch (modId) {
            case MINECRAFT:
            case DANNYS_ORES:
                return true;
            case QUARK: return mods.isLoaded("quark");
            case EMBELLISHCRAFT: return mods.isLoaded("embellishcraft");
            case CREATE: return mods.isLoaded("create");
            case NETHERCRAFT: return mods.isLoaded("nethercraft");
            case MIDNIGHT: return mods.isLoaded("midnight");
            case MYSTICALAGRICULTURE: return mods.isLoaded("mysticalagriculture");
            case ATUM: return mods.isLoaded("atum");
            default: return false;
        }
    }
}
