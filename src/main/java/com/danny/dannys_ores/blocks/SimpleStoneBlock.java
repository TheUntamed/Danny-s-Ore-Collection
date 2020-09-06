package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.BlockBaseHandler;
import com.danny.dannys_ores.util.ModHandler;
import com.danny.dannys_ores.util.VariantsModId;
import com.danny.dannys_ores.util.StoneVariants;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.storage.loot.LootContext;

import java.util.List;

/**
 * An object of this class represents a simple block of this mod.
 * All blocks of this class also generate in world.
 * A simple block has block properties, a block base (the stone variant that acts as filler block for the block),
 * and the modId of the block base as enum element.
 */
public class SimpleStoneBlock extends SimpleBlock {
    private StoneVariants variant;
    private VariantsModId blockBaseModId;

    public SimpleStoneBlock(Block.Properties properties, StoneVariants variant, VariantsModId blockBaseModId) {
        super(properties);
        this.variant = variant;
        this.blockBaseModId = blockBaseModId;
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if (ModHandler.variantsModIdExists(this.getBlockBaseModId())) {
            items.add(new ItemStack(this));
        }
    }

    /**
     *
     * @return The block base as enum element.
     */
    public StoneVariants getStoneVariant() {
        return variant;
    }

    /**
     *
     * @return The block base as actual block.
     */
    public Block getBlockBase() {
        return BlockBaseHandler.getBlockBase(variant);
    }

    /**
     *
     * @return The modId of the block base as enum element.
     */
    public VariantsModId getBlockBaseModId() {
        return blockBaseModId;
    }
}
