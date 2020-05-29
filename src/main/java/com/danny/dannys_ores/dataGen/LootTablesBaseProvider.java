package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.util.OreTypes;
import com.google.common.collect.ImmutableSet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.SilkTouchEnchantment;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraft.world.storage.loot.conditions.MatchTool;
import net.minecraft.world.storage.loot.conditions.SurvivesExplosion;
import net.minecraft.world.storage.loot.functions.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public abstract class LootTablesBaseProvider extends LootTableProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;

    public LootTablesBaseProvider(DataGenerator generatorIn) {
        super(generatorIn);
        this.generator = generatorIn;
    }

    protected abstract void addTables();

    /**
     * Creates the most basic loottable. A block dropping itself.
     *
     * @param block The block to create a loottable for.
     * @return The loottable.
     */
    protected LootTable.Builder basicBlockTable(Block block) {
        return MyBlockLootTables.dropSelf(block);
    }

    /**
     * Creates a loottable for blocks that should only drop itself if silktouch is used.
     * Otherwise nothing is dropped.
     *
     * @param block The block to create a loottable for.
     * @return The lotttable.
     */
    protected LootTable.Builder justSilktouchTable(Block block) {
        LootPool.Builder builder = LootPool.builder()
                .acceptCondition(MatchTool.builder(ItemPredicate.Builder.create().enchantment(
                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1)))))
                .rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(block));
        return LootTable.builder().addLootPool(builder);
    }

    protected LootTable.Builder gemsTable(OreTypes oType, Block block, Item item) {
        if (oType.equals(OreTypes.REDSTONE)) {
            return MyBlockLootTables.redstone(block, item);
        } else if (oType.equals(OreTypes.LAPIS)) {
            return MyBlockLootTables.lapis(block, item);
        } else {
            return MyBlockLootTables.dropItemWithFortune(block, item);
        }
    }

    protected LootTable.Builder denseGemsTable(OreTypes oType, Block block, Item item) {
        if (oType.equals(OreTypes.REDSTONE)) {
            return MyBlockLootTables.denseRedstone(block, item);
        } else if (oType.equals(OreTypes.LAPIS)) {
            return MyBlockLootTables.denseLapis(block, item);
        } else {
            return MyBlockLootTables.dropItemWithFortune(block, item);
        }
    }

    protected LootTable.Builder poorGemsTable(OreTypes oType, Block block, Item item) {
        if (oType.equals(OreTypes.REDSTONE)) {
            return MyBlockLootTables.poorRedstone(block, item);
        } else if (oType.equals(OreTypes.LAPIS)) {
            return MyBlockLootTables.poorLapis(block, item);
        } else {
            return MyBlockLootTables.dropItemWithFortune(block, item);
        }
    }

    @Override
    public void act(DirectoryCache cache) {
        addTables();

        Map<ResourceLocation, LootTable> tables = new HashMap<>();
        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet()) {
            tables.put(entry.getKey().getLootTable(),
                    entry.getValue().setParameterSet(LootParameterSets.BLOCK).build());
        }
        writeTables(cache, tables);
    }

    private void writeTables(DirectoryCache cache, Map<ResourceLocation, LootTable> tables) {
        Path outputFolder = this.generator.getOutputFolder();
        tables.forEach((key, lootTable) -> {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try {
                IDataProvider.save(GSON, cache, LootTableManager.toJson(lootTable), path);
                Main.LOGGER.debug("Creating loot table for block " + lootTable);
            } catch (IOException e) {
                Main.LOGGER.error("Couldn't write loot table {}", path, e);
            }
        });
    }

    @Override
    public String getName() {
        return "Danny's Ores - Loottables Base";
    }
}
