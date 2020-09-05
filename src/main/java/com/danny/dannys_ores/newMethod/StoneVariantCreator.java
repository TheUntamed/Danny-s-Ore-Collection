package com.danny.dannys_ores.newMethod;

import com.danny.dannys_ores.newMethod.models.StoneVariant;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.util.JSONUtils;
import net.minecraftforge.common.ToolType;

public class StoneVariantCreator {

    public static void create(String fileName, JsonObject json) throws JsonSyntaxException {
        String modId = JSONUtils.getString(json, "mod_id");
        String regName;
        StringBuilder name = new StringBuilder();
        ToolType tool = ToolType.PICKAXE;
        int hardness = 3, resistance = 3;

        if (json.has("reg_name")) {
            regName = JSONUtils.getString(json, "reg_name");
        } else {
            regName = fileName;
        }

        if (json.has("name")) {
            name = new StringBuilder(JSONUtils.getString(json, "name"));
        } else {
            String[] parts = regName.split("_");
            for (String s : parts) {
                name.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toUpperCase());
            }
        }

        if (json.has("tool")) {
            tool = ToolType.get(JSONUtils.getString(json, "tool"));
        }

        if (json.has("hardness")) {
            hardness = JSONUtils.getInt(json, "hardness");
        }

        if (json.has("resistance")) {
            resistance = JSONUtils.getInt(json, "resistance");
        }

        System.err.println("creating: " + regName);
        new StoneVariant(modId, regName, name.toString(), tool, hardness, resistance);
    }
}
