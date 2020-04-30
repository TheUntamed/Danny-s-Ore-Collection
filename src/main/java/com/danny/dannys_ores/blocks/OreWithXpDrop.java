package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class OreWithXpDrop extends Block {
    public OreWithXpDrop(Block.Properties properties) {
        super(properties);
    }

    private int setValues(Random random) {
        if (this == BlockInit.ANDESITE_COAL_ORE.get() || this == BlockInit.DIORITE_COAL_ORE.get() || this == BlockInit.GRANITE_COAL_ORE.get() || this == BlockInit.NETHERRACK_COAL_ORE.get() || this == BlockInit.END_STONE_COAL_ORE.get() || this == BlockInit.SAND_COAL_ORE.get() || this == BlockInit.GRAVEL_COAL_ORE.get() || this == BlockInit.SANDSTONE_COAL_ORE.get() || this == BlockInit.RED_SANDSTONE_COAL_ORE.get()) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == BlockInit.ANDESITE_DIAMOND_ORE.get() || this == BlockInit.DIORITE_DIAMOND_ORE.get() || this == BlockInit.GRANITE_DIAMOND_ORE.get() || this == BlockInit.NETHERRACK_DIAMOND_ORE.get() || this == BlockInit.END_STONE_DIAMOND_ORE.get() || this == BlockInit.SAND_DIAMOND_ORE.get() || this == BlockInit.GRAVEL_DIAMOND_ORE.get() || this == BlockInit.SANDSTONE_DIAMOND_ORE.get() || this == BlockInit.RED_SANDSTONE_DIAMOND_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.ANDESITE_EMERALD_ORE.get() || this == BlockInit.DIORITE_EMERALD_ORE.get() || this == BlockInit.GRANITE_EMERALD_ORE.get() || this == BlockInit.NETHERRACK_EMERALD_ORE.get() || this == BlockInit.END_STONE_EMERALD_ORE.get() || this == BlockInit.SAND_EMERALD_ORE.get() || this == BlockInit.GRAVEL_EMERALD_ORE.get() || this == BlockInit.SANDSTONE_EMERALD_ORE.get() || this == BlockInit.RED_SANDSTONE_EMERALD_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.ANDESITE_LAPIS_ORE.get() || this == BlockInit.DIORITE_LAPIS_ORE.get() || this == BlockInit.GRANITE_LAPIS_ORE.get() || this == BlockInit.NETHERRACK_LAPIS_ORE.get() || this == BlockInit.END_STONE_LAPIS_ORE.get() || this == BlockInit.SAND_LAPIS_ORE.get() || this == BlockInit.GRAVEL_LAPIS_ORE.get() || this == BlockInit.SANDSTONE_LAPIS_ORE.get() || this == BlockInit.RED_SANDSTONE_LAPIS_ORE.get()) {
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInit.STONE_QUARTZ_ORE.get() || this == BlockInit.ANDESITE_QUARTZ_ORE.get() || this == BlockInit.DIORITE_QUARTZ_ORE.get() || this == BlockInit.GRANITE_QUARTZ_ORE.get() || this == BlockInit.END_STONE_QUARTZ_ORE.get() || this == BlockInit.SAND_QUARTZ_ORE.get() || this == BlockInit.GRAVEL_QUARTZ_ORE.get() || this == BlockInit.SANDSTONE_QUARTZ_ORE.get() || this == BlockInit.RED_SANDSTONE_QUARTZ_ORE.get()){
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInit.STONE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpStoneXpOre.get(), Xp.maxXpStoneXpOre.get());
        } else if (this == BlockInit.ANDESITE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpAndesiteXpOre.get(), Xp.maxXpAndesiteXpOre.get());
        } else if (this == BlockInit.DIORITE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpDioriteXpOre.get(), Xp.maxXpDioriteXpOre.get());
        } else if (this == BlockInit.GRANITE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpGraniteXpOre.get(), Xp.maxXpGraniteXpOre.get());
        } else if (this == BlockInit.NETHERRACK_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpNetherrackXpOre.get(), Xp.maxXpNetherrackXpOre.get());
        } else if (this == BlockInit.END_STONE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpEndStoneXpOre.get(), Xp.maxXpEndStoneXpOre.get());
        } else if (this == BlockInit.SAND_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpSandXpOre.get(), Xp.maxXpSandXpOre.get());
        } else if (this == BlockInit.GRAVEL_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpGravelXpOre.get(), Xp.maxXpGravelXpOre.get());
        } else if (this == BlockInit.SANDSTONE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpSandstoneXpOre.get(), Xp.maxXpStoneXpOre.get());
        } else if (this == BlockInit.RED_SANDSTONE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpRedSandstoneXpOre.get(), Xp.maxXpRedSandstoneXpOre.get());
        } else {
            return 0;
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.setValues(RANDOM) : 0;
    }
}
