package com.danny.dannys_ores.dataGen;

import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraft.world.storage.loot.conditions.MatchTool;
import net.minecraft.world.storage.loot.functions.ApplyBonus;
import net.minecraft.world.storage.loot.functions.SetCount;

import java.util.ArrayList;

public class MyBlockLootTables extends BlockLootTables {

    public static LootTable.Builder dropItemWithFortune(Block block, Item item) {
        return droppingItemWithFortune(block, item);
    }

    public static LootTable.Builder dropSelf(Block block) {
        return dropping(block);
    }

    public static LootTable.Builder redstone(Block block, Item item) {
        return droppingWithSilkTouch(block, withExplosionDecay(block, ItemLootEntry.builder(item).acceptFunction(SetCount.builder(RandomValueRange.of(4.0F, 5.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
    }

    public static LootTable.Builder lapis(Block block, Item item) {
        return droppingWithSilkTouch(block, withExplosionDecay(block, ItemLootEntry.builder(item).acceptFunction(SetCount.builder(RandomValueRange.of(4.0F, 9.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
    }

    public static LootTable.Builder denseRedstone(Block block, Item item) {
        return droppingWithSilkTouch(block, withExplosionDecay(block, ItemLootEntry.builder(item).acceptFunction(SetCount.builder(RandomValueRange.of(6.0F, 8.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
    }

    public static LootTable.Builder denseLapis(Block block, Item item) {
        return droppingWithSilkTouch(block, withExplosionDecay(block, ItemLootEntry.builder(item).acceptFunction(SetCount.builder(RandomValueRange.of(6.0F, 14.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
    }

    public static LootTable.Builder poorRedstone(Block block, Item item) {
        return droppingWithSilkTouch(block, withExplosionDecay(block, ItemLootEntry.builder(item).acceptFunction(SetCount.builder(RandomValueRange.of(2.0F, 3.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
    }

    public static LootTable.Builder poorLapis(Block block, Item item) {
        return droppingWithSilkTouch(block, withExplosionDecay(block, ItemLootEntry.builder(item).acceptFunction(SetCount.builder(RandomValueRange.of(2.0F, 5.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
    }

}
