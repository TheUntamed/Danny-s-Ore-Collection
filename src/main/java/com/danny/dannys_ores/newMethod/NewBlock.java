package com.danny.dannys_ores.newMethod;

import com.danny.dannys_ores.newMethod.models.MaterialType;
import com.danny.dannys_ores.newMethod.models.StoneVariant;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.*;

import java.util.List;

public class NewBlock extends Block {
    private final MaterialType mType;
    private final StoneVariant variant;

    public NewBlock(Block.Properties properties, MaterialType mType, StoneVariant variant) {
        super(properties);
        this.mType = mType;
        this.variant = variant;
    }

    public MaterialType getMaterialType() {
        return mType;
    }

    public StoneVariant getStoneVariant() {
        return variant;
    }

//    @Override
//    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
//        List<ItemStack> list = Lists.newArrayList();
//        list.add(new ItemStack(this));
//        return list;
//    }

}
