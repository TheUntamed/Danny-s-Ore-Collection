package com.danny.dannys_ores.newMethod;

import com.google.gson.JsonObject;
import net.minecraft.util.JSONUtils;


public class MaterialType {
    private final String regName;
    private final String name;
    private final MaterialCategory mCat;
    private final int harvestLevel;
    private final boolean hasRichnessTypes;
    private final JsonObject generation;

    public MaterialType(String regName, String name, MaterialCategory mCat, int harvestLevel, boolean hasRichnessTypes, JsonObject generation) {
        this.regName = regName;
        this.name = name;
        this.mCat = mCat;
        this.harvestLevel = harvestLevel;
        this.hasRichnessTypes = hasRichnessTypes;
        this.generation = generation;

        DannysOresAPI.addMaterialType(this);
    }

    public String getRegName() {
        return regName.toLowerCase();
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

    public JsonObject getGenerationSettings() { return generation; }

    public boolean getShouldGenerate() {
        return JSONUtils.getBoolean(generation, "enable");
    }

    public int getMinY() {
        return JSONUtils.getInt(generation, "min");
    }

    public int getMaxY() {
        return JSONUtils.getInt(generation, "max");
    }

    public int getSize() {
        return JSONUtils.getInt(generation, "size");
    }

    public int getCount() {
        return JSONUtils.getInt(generation, "count");
    }

}
