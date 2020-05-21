package com.danny.dannys_ores.dataGen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

/**
 * If this mod would add any recipes, this class would generate them.
 */
public class RecipesDataGen extends RecipeProvider implements IConditionBuilder {

    public RecipesDataGen(DataGenerator generator) {
        super(generator);
    }

}
