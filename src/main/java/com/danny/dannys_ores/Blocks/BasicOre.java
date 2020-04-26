package com.danny.dannys_ores.Blocks;


import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Difficulty;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class BasicOre extends Block {
    private float explosionRange = 0.0F;
    private int explosionChance = 0;
    private int minXp = 0;
    private int maxXp = 0;
    private Explosion.Mode eM = Explosion.Mode.NONE;
    private List<String> statusEffects = new ArrayList<>();

    public BasicOre(Properties properties) {
        super(properties);
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
            if (entityIn instanceof LivingEntity) {
                setValues();
                LivingEntity livingentity = (LivingEntity)entityIn;
                livingentity.addPotionEffect(new EffectInstance(Effects.WITHER, 40));
                    for (String s : statusEffects) {
                        int id = Integer.parseInt(s.split(":")[0]);
                        int value = Integer.parseInt(s.split(":")[1]);
                        if (0 < id && id < 33 && !(livingentity.isInvulnerableTo(DamageSource.WITHER) && id == 20)) {
                            livingentity.addPotionEffect(new EffectInstance(Effect.get(id), 1, (value-1)));
                        } else if (id == 33 && !livingentity.isInvulnerableTo(DamageSource.ON_FIRE)) {
                            livingentity.setFire(1);
                        } else {
                            Main.LOGGER.warn("Invalid effect id '" + value + "' for '" + this.getRegistryName() + "' in dannys_ores-common.toml");
                        }
                    }
            }
    }

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
            minXp = Copper.minXpDropStoneCopperOre.get();
            maxXp = Copper.maxXpDropStoneCopperOre.get();
            explosionRange = Copper.explosionRangeStoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceStoneCopperOre.get();
            statusEffects = Copper.blockStatusEffectsStoneCopperOre.get();
            if (Copper.enableExplosionDestructionStoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else {
            minXp = 0;
            maxXp = 0;
            explosionRange = 0.0F;
            explosionChance = 0;
        }
    }
}
