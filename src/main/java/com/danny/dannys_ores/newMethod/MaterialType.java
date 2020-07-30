package com.danny.dannys_ores.newMethod;

import net.minecraft.util.ResourceLocation;


public class MaterialType {
    private final String regName;
    private final String name;
    private final MaterialCategory mCat;
    private final int harvestLevel;
    private final boolean hasRichnessTypes;

    public MaterialType(String regName, String name, MaterialCategory mCat, int harvestLevel, boolean hasRichnessTypes) {
        this.regName = regName;
        this.name = name;
        this.mCat = mCat;
        this.harvestLevel = harvestLevel;
        this.hasRichnessTypes = hasRichnessTypes;

        DannysOresAPI.addMaterialType(this);
    }

    public String getRegName() {
        return regName;
    }

    public String getName() {
        return name;
    }

    public MaterialCategory getMaterialCategory() {
        return mCat;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public boolean getHasRichnessTypes() {
        return hasRichnessTypes;
    }

}
