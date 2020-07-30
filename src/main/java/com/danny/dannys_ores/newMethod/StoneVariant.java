package com.danny.dannys_ores.newMethod;

import net.minecraftforge.common.ToolType;

public class StoneVariant {
    private final String modId;
    private final String regName;
    private final String name;
    private final ToolType toolType;
    private final float hardness;
    private final float resistance;

    public StoneVariant(String modId, String regName, String name, ToolType toolType, float hardness, float resistance) {
        this.modId = modId;
        this.regName = regName;
        this.name = name;
        this.toolType = toolType;
        this.hardness = hardness;
        this.resistance = resistance;

        DannysOresAPI.addStoneVariant(this);
    }

    public String getModId() {
        return modId.toLowerCase();
    }

    public String getRegName() {
        return regName.toLowerCase();
    }

    public String getName() { return name; }

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
