package com.danny.dannys_ores.materials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

/**
 * Provides some custom material types.
 * The existing material types like SAND, GRAVEL and ICE do not require a tool
 * but that's necessary to set a harvest level for blocks with those materials.
 */
public class MyMaterials extends Material.Builder {

    public MyMaterials(MaterialColor properties) {
        super(properties);
    }

    public static final Material GRAVEL_ORE = (new MyMaterials(MaterialColor.STONE)).requiresTool().build();
    public static final Material SAND_ORE = (new MyMaterials(MaterialColor.SAND)).requiresTool().build();
    public static final Material ICE_ORE = (new MyMaterials(MaterialColor.ICE)).requiresTool().build();

}
