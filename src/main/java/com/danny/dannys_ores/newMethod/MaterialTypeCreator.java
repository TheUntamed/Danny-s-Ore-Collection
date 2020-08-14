package com.danny.dannys_ores.newMethod;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.util.JSONUtils;

public class MaterialTypeCreator {

    public static void create(String fileName, JsonObject json) throws JsonSyntaxException {
        StringBuilder materialName = new StringBuilder();
        String materialCategory = JSONUtils.getString(json, "category");
        String materialColor = JSONUtils.getString(json, "color");
        JsonObject generation = JSONUtils.getJsonObject(json, "generation");
        int harvestLevel = 0;
        boolean hasRichnessTypes = JSONUtils.getBoolean(json, "richness");

        if (json.has("name")) {
            materialName = new StringBuilder(JSONUtils.getString(json, "name"));
        } else {
            String[] parts = fileName.split(":")[1].split("_");
            for (String s : parts) {
                materialName.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toUpperCase());
            }
        }

        if (json.has("harvestLevel")) {
            harvestLevel = JSONUtils.getInt(json, "harvestLevel");
        }

        MaterialCategory category = DannysOresAPI.getMaterialCategoryByName(materialCategory);
//        if (category == null) {
//            throw new JsonSyntaxException("Invalid category provided: " + materialCategory);
//        }

        System.err.println("creating: " + materialName);
        new MaterialType(fileName, materialName.toString(), category, harvestLevel, hasRichnessTypes, generation);
    }
}
