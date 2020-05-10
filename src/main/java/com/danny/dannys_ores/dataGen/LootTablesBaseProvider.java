package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public abstract class LootTablesBaseProvider extends LootTableProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;
    private static final ILootCondition.IBuilder SILK_TOUCH = MatchTool.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1))));
    private static final Set<Item> IMMUNE_TO_EXPLOSIONS = Stream.of(Blocks.DRAGON_EGG, Blocks.BEACON, Blocks.CONDUIT, Blocks.SKELETON_SKULL, Blocks.WITHER_SKELETON_SKULL, Blocks.PLAYER_HEAD, Blocks.ZOMBIE_HEAD, Blocks.CREEPER_HEAD, Blocks.DRAGON_HEAD, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX).map(IItemProvider::asItem).collect(ImmutableSet.toImmutableSet());


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

    protected LootTable.Builder basicOreTable(String name, Block block) {
        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1))
                .addEntry(ItemLootEntry.builder(block)).acceptCondition(SurvivesExplosion.builder());
        return LootTable.builder().addLootPool(builder);
    }

    protected LootTable.Builder justSilktouchTable(String name, Block block) {
        LootPool.Builder builder = LootPool.builder().name(name)
                .acceptCondition(MatchTool.builder(ItemPredicate.Builder.create().enchantment(
                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1)))))
                .rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(block));
        return LootTable.builder().addLootPool(builder);
    }

    protected LootTable.Builder gemsTable(String name, Block block, Item item) {

        return MyBlockLootTables.dropItemWithFortune(block, item);
        //return droppingWithSilkTouch(block, withExplosionDecay(block, ItemLootEntry.builder(item).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
//        LootPool.Builder builder = LootPool.builder().name(name)
//                .acceptCondition(MatchTool.builder(ItemPredicate.Builder.create().enchantment(
//                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1)))))
//                .rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(block));
//        return LootTable.builder().addLootPool(builder);

//        return LootTable.builder().addLootPool(LootPool.builder().name(name)
//                .rolls(ConstantRange.of(1)).addEntry(((StandaloneLootEntry.Builder)ItemLootEntry.builder(block).acceptCondition(MatchTool.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1))))))
//                .alternatively((T)(!IMMUNE_TO_EXPLOSIONS.contains(block.asItem()) ? ItemLootEntry.builder(Items.DIAMOND).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE)).acceptFunction(ExplosionDecay.builder()) : ItemLootEntry.builder(Items.DIAMOND).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE)).cast()))));

    }

//    protected static LootTable.Builder droppingWithSilkTouch(Block block, LootEntry.Builder<?> lootEntry) {
//        return dropping(block, SILK_TOUCH, lootEntry);
//    }
//
//    protected static <T> T withExplosionDecay(IItemProvider p_218552_0_, ILootFunctionConsumer<T> p_218552_1_) {
//        return (T)(!IMMUNE_TO_EXPLOSIONS.contains(p_218552_0_.asItem()) ? p_218552_1_.acceptFunction(ExplosionDecay.builder()) : p_218552_1_.cast());
//    }
//
//    protected static LootTable.Builder dropping(Block block, ILootCondition.IBuilder lootCond, LootEntry.Builder<?> lootEntry) {
//        return LootTable.builder().addLootPool(LootPool.builder().rolls(ConstantRange.of(1)).addEntry(((StandaloneLootEntry.Builder)ItemLootEntry.builder(block).acceptCondition(lootCond)).alternatively(lootEntry)));
//    }

//    protected LootTable.Builder bedrockTable(String name, Block block) {
//        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1))
//                .addEntry();
//        return LootTable.builder().addLootPool(builder);
//    }

    protected LootTable.Builder createStandardTable(String name, Item item) {
        LootPool.Builder builder = LootPool.builder().name(name).rolls(ConstantRange.of(1))
                .addEntry(ItemLootEntry.builder(item).acceptFunction(CopyName.builder(CopyName.Source.BLOCK_ENTITY))
                        .acceptFunction(CopyNbt.builder(CopyNbt.Source.BLOCK_ENTITY).addOperation("inv",
                                "BlockEntityTag.inv", CopyNbt.Action.REPLACE)
//                                .addOperation("energy", "BlockEntityTag.energy", CopyNbt.Action.REPLACE)
                        ).acceptFunction(SetContents.func_215920_b().func_216075_a(
                                DynamicLootEntry.func_216162_a(new ResourceLocation("minecraft", "contents")))));
        return LootTable.builder().addLootPool(builder);
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
