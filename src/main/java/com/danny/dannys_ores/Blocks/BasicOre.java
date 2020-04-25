package com.danny.dannys_ores.Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.danny.dannys_ores.Config;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class BasicOre extends Block {
    private float explosionRange = 0.0F;
    private int explosionChance = 0;
    private int minXp = 0;
    private int maxXp = 0;
    private Explosion.Mode eM = Explosion.Mode.NONE;

    public BasicOre(Properties properties) {
        super(properties);
    }

//    @Override
//    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
//        if (!entityIn.isImmuneToFire() && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)entityIn)) {
//            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
//        }
//        super.onEntityWalk(worldIn, pos, entityIn);
//    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        setValues();
        int i = RANDOM.nextInt(1000);
        if (explosionChance > i) {
            worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), explosionRange, true, eM);
        } else {
            worldIn.playEvent(player, 2001, pos, getStateId(state));
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        setValues();
        return silktouch == 0 ? MathHelper.nextInt(RANDOM, minXp, maxXp) : 0;
    }

    private void setValues() {
        if (this == BlockInit.STONE_COPPER_ORE) {
            minXp = Config.minXpDropStoneCopperOre.get();
            maxXp = Config.maxXpDropStoneCopperOre.get();
            explosionRange = Config.explosionRangeStoneCopperOre.get().floatValue();
            explosionChance =  Config.explosionChanceStoneCopperOre.get();
            if (Config.enableExplosionDestructionStoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else {
            minXp = 0;
            maxXp = 0;
            explosionRange = 0.0F;
            explosionChance = 0;
        }
    }
}
