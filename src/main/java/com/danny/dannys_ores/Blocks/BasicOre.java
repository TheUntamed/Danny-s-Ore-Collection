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
            if (Copper.enableExplosionDestructionStoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.ANDESITE_COPPER_ORE) {
            minXp = Copper.minXpDropAndesiteCopperOre.get();
            maxXp = Copper.maxXpDropAndesiteCopperOre.get();
            explosionRange = Copper.explosionRangeAndesiteCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceAndesiteCopperOre.get();
            if (Copper.enableExplosionDestructionAndesiteCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.DIORITE_COPPER_ORE) {
            minXp = Copper.minXpDropDioriteCopperOre.get();
            maxXp = Copper.maxXpDropDioriteCopperOre.get();
            explosionRange = Copper.explosionRangeDioriteCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceDioriteCopperOre.get();
            if (Copper.enableExplosionDestructionDioriteCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRANITE_COPPER_ORE) {
            minXp = Copper.minXpDropGraniteCopperOre.get();
            maxXp = Copper.maxXpDropGraniteCopperOre.get();
            explosionRange = Copper.explosionRangeGraniteCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceGraniteCopperOre.get();
            if (Copper.enableExplosionDestructionGraniteCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.NETHERRACK_COPPER_ORE) {
            minXp = Copper.minXpDropNetherrackCopperOre.get();
            maxXp = Copper.maxXpDropNetherrackCopperOre.get();
            explosionRange = Copper.explosionRangeNetherrackCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceNetherrackCopperOre.get();
            if (Copper.enableExplosionDestructionNetherrackCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.END_STONE_COPPER_ORE) {
            minXp = Copper.minXpDropEndStoneCopperOre.get();
            maxXp = Copper.maxXpDropEndStoneCopperOre.get();
            explosionRange = Copper.explosionRangeEndStoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceEndStoneCopperOre.get();
            if (Copper.enableExplosionDestructionEndStoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SAND_COPPER_ORE) {
            minXp = Copper.minXpDropSandCopperOre.get();
            maxXp = Copper.maxXpDropSandCopperOre.get();
            explosionRange = Copper.explosionRangeSandCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceSandCopperOre.get();
            if (Copper.enableExplosionDestructionSandCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRAVEL_COPPER_ORE) {
            minXp = Copper.minXpDropGravelCopperOre.get();
            maxXp = Copper.maxXpDropGravelCopperOre.get();
            explosionRange = Copper.explosionRangeGravelCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceGravelCopperOre.get();
            if (Copper.enableExplosionDestructionGravelCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SANDSTONE_COPPER_ORE) {
            minXp = Copper.minXpDropSandstoneCopperOre.get();
            maxXp = Copper.maxXpDropSandstoneCopperOre.get();
            explosionRange = Copper.explosionRangeSandstoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceSandstoneCopperOre.get();
            if (Copper.enableExplosionDestructionSandstoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.RED_SANDSTONE_COPPER_ORE) {
            minXp = Copper.minXpDropRedSandstoneCopperOre.get();
            maxXp = Copper.maxXpDropRedSandstoneCopperOre.get();
            explosionRange = Copper.explosionRangeRedSandstoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceRedSandstoneCopperOre.get();
            if (Copper.enableExplosionDestructionRedSandstoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else {
            minXp = 0;
            maxXp = 0;
            explosionRange = 0.0F;
            explosionChance = 0;
        }
    }
}
