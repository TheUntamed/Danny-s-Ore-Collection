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
public class SimpleBlock extends Block {

    public SimpleBlock(Block.Properties properties) {
        super(properties);
    }
}
