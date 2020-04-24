package com.danny.dannys_ores.Blocks;

import java.util.Random;

import com.danny.dannys_ores.Config;
import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class BasicOre extends Block {

    public BasicOre(Properties properties) {
        super(properties);
    }

    private int getXP(Random random) {
        if (this == BlockInit.STONE_COPPER_ORE) {
            return MathHelper.nextInt(random, Config.minXpDropStoneCopperOre.get(), Config.maxXpDropStoneCopperOre.get());
        } else {
            return 0;
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getXP(RANDOM) : 0;
    }
}
