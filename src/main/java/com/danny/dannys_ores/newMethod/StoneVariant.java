package com.danny.dannys_ores.newMethod;

import net.minecraftforge.common.ToolType;

public class StoneVariant {
    private final String modId;
    private final String name;
    private final ToolType toolType;
    private final float hardness;
    private final float resistance;

    public StoneVariant(String modId, String name, ToolType toolType, float hardness, float resistance) {
        this.modId = modId;
        this.name = name;
        //ToolType.get("axe");
        this.toolType = toolType;
        this.hardness = hardness;
        this.resistance = resistance;

        DannysOresAPI.addStoneVariant(this);
    }

    public String getModId() {
        return modId;
    }

    public String getName() {
        return name;
    }

    public ToolType getToolType() {
        return toolType;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }
}
