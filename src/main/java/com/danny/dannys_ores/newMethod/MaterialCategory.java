package com.danny.dannys_ores.newMethod;


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
