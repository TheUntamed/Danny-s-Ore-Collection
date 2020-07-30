package com.danny.dannys_ores.newMethod;

import java.util.HashSet;
import java.util.Set;

public class DannysOresAPI {
    public static final Set<MaterialType> MATERIAL_TYPES = new HashSet<>();
    public static final Set<StoneVariant> STONE_VARIANTS = new HashSet<>();
    public static final Set<MaterialCategory> MATERIAL_CATEGORIES = new HashSet<>();

    public static MaterialType getMaterialTypeByName(String name) {
        return MATERIAL_TYPES.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }

    public static void addMaterialType(MaterialType mType) {
        MATERIAL_TYPES.add(mType);
    }

    public static StoneVariant getStoneVariantByName(String name) {
        return STONE_VARIANTS.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }

    public static void addStoneVariant(StoneVariant variant) {
        STONE_VARIANTS.add(variant);
    }

    public static MaterialCategory getMaterialCategoryByName(String name) {
        return MATERIAL_CATEGORIES.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }

    public static void addMaterialCategory(MaterialCategory mCat) {
        MATERIAL_CATEGORIES.add(mCat);
    }
}
