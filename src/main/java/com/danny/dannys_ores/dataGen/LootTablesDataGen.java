package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.data.DataGenerator;

public class LootTablesDataGen extends LootTablesBaseProvider {

    public LootTablesDataGen(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void addTables() {
        //lootTables.put(BlockInit.ANDESITE_COAL_ORE.get(), createStandardTable("andesite_coal_ore", BlockInit.ANDESITE_COAL_ORE.get()));
    }

    @Override
    public String getName() {
        return "Danny's Ores - Loottables";
    }
}
