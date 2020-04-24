package com.danny.dannys_ores.Blocks;

import java.util.Random;

import com.danny.dannys_ores.Config;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BasicOre extends Block {
    private float explosionRange = 0.0F;

    public BasicOre(Properties properties) {
        super(properties);
    }

    private boolean willExplode(Random random) {
        //double d = MathHelper.nextDouble(random, 0.0, 100.0);
        double d = Math.random();
        //int i = MathHelper.nextInt(random, 0, 100);
        if (this == BlockInit.STONE_COPPER_ORE) {
            explosionRange = Config.explosionRangeStoneCopperOre.get().floatValue();
            return Config.explosionChanceStoneCopperOre.get() > d;
        } else {
            return false;
        }
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        if (this.willExplode(RANDOM)) {
            worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), explosionRange, true, Explosion.Mode.BREAK);
        } else {
            worldIn.playEvent(player, 2001, pos, getStateId(state));
        }
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
