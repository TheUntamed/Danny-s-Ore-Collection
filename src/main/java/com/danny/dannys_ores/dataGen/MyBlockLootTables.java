package com.danny.dannys_ores.dataGen;

import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootTable;

public class MyBlockLootTables extends BlockLootTables {

    public static LootTable.Builder dropItemWithFortune(Block block, Item item) {
        return droppingItemWithFortune(block, item);
    }
}
