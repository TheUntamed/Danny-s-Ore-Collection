package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.functions.CopyName;
import net.minecraft.world.storage.loot.functions.CopyNbt;
import net.minecraft.world.storage.loot.functions.SetContents;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public abstract class LootTablesBaseProvider extends LootTableProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;

    public LootTablesBaseProvider(DataGenerator generatorIn) {
        super(generatorIn);
        this.generator = generatorIn;
    }

    protected abstract void addTables();

//    protected LootTable.Builder createStandardTable(String name, Block block) {
//        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1))
//                .addEntry(ItemLootEntry.builder(block).acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY))
//                        .acceptFunction(CopyNbt.builder(CopyNbt.Source.BLOCK_ENTITY).addOperation("inv",
//                                "BlockEntityTag.inv", CopyNbt.Action.REPLACE)
////								.addOperation("energy", "BlockEntityTag.energy", CopyNbt.Action.REPLACE)
//                        ).acceptFunction(SetContents.func_215920_b().func_216075_a(
//                                DynamicLootEntry.func_216162_a(new ResourceLocation("minecraft", "contents")))));
//        return LootTable.builder().addLootPool(builder);
//    }
//
//    protected LootTable.Builder createStandardTable(String name, Item item) {
//        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1))
//                .addEntry(ItemLootEntry.builder(item).acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY))
//                        .acceptFunction(CopyNbt.builder(CopyNbt.Source.BLOCK_ENTITY).addOperation("inv",
//                                "BlockEntityTag.inv", CopyNbt.Action.REPLACE)
////                                .addOperation("energy", "BlockEntityTag.energy", CopyNbt.Action.REPLACE)
//                        ).acceptFunction(SetContents.func_215920_b().func_216075_a(
//                                DynamicLootEntry.func_216162_a(new ResourceLocation("minecraft", "contents")))));
//        return LootTable.builder().addLootPool(builder);
//    }

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
