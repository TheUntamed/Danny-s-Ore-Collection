package com.danny.dannys_ores.materials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MyMaterials extends Material.Builder {

    public MyMaterials(MaterialColor properties) {
        super(properties);
    }

//    @Override
//    protected Material.Builder requiresTool() {
//        this.requiresNoTool = false;
//        return this;
//    }

    public static final Material GRAVEL_ORE = (new MyMaterials(MaterialColor.STONE)).requiresTool().build();
    public static final Material SAND_ORE = (new MyMaterials(MaterialColor.SAND)).requiresTool().build();
    public static final Material ICE_ORE = (new MyMaterials(MaterialColor.ICE)).requiresTool().build();

}
