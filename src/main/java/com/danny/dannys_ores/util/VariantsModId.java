package com.danny.dannys_ores.util;

/**
 * Provides the modId feature. Not ores but their block base (stone variant) has exactly one of these features assigned.
 */
public enum VariantsModId {
    MINECRAFT,
    DANNYS_ORES,
    QUARK,
    EMBELLISHCRAFT,
    CREATE,
    MIDNIGHT,
    MYSTICALAGRICULTURE,
    NETHERCRAFT,
    ATUM,
    NETHEREX;

    /**
     *
     * @return The element as lower case string.
     */
    public String asLowerCaseString() {
        return this.toString().toLowerCase();
    }
}
