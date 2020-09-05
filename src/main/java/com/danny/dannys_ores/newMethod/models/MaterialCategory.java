package com.danny.dannys_ores.newMethod.models;


import com.danny.dannys_ores.newMethod.DannysOresAPI;

public class MaterialCategory {
    private String name;

    public MaterialCategory(String name) {
        this.name = name;

        DannysOresAPI.addMaterialCategory(this);
    }

    public String getName() {
        return name;
    }
}
