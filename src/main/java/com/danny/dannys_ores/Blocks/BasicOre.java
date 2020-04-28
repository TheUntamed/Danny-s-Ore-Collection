package com.danny.dannys_ores.Blocks;


import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.configs.Iron;
import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeBlockState;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.client.renderer.RenderTypeLookup.setRenderLayer;

public class BasicOre extends Block implements IForgeBlockState {
    private boolean fireSource = false;
    private float explosionRange = 0.0F;
    private int explosionChance = 0;
    private int minXp = 0;
    private int maxXp = 0;
    private Explosion.Mode eM = Explosion.Mode.NONE;
    private List<String> statusEffects = new ArrayList<>();

    public BasicOre(Properties properties) {
        super(properties);
        //RenderType rendertype = RenderType.func_228641_d_();
        //setRenderLayer(this, rendertype::equals);
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
    public boolean isFireSource(BlockState state, IBlockReader world, BlockPos pos, Direction side) {
        setValues();
        return fireSource;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        setValues();
        return silktouch == 0 ? MathHelper.nextInt(RANDOM, minXp, maxXp) : 0;
    }

    private void setValues() {
        if (this == BlockInit.STONE_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropStoneCopperOre.get();
            maxXp = Copper.maxXpDropStoneCopperOre.get();
            explosionRange = Copper.explosionRangeStoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceStoneCopperOre.get();
            if (Copper.enableExplosionDestructionStoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.ANDESITE_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropAndesiteCopperOre.get();
            maxXp = Copper.maxXpDropAndesiteCopperOre.get();
            explosionRange = Copper.explosionRangeAndesiteCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceAndesiteCopperOre.get();
            if (Copper.enableExplosionDestructionAndesiteCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.DIORITE_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropDioriteCopperOre.get();
            maxXp = Copper.maxXpDropDioriteCopperOre.get();
            explosionRange = Copper.explosionRangeDioriteCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceDioriteCopperOre.get();
            if (Copper.enableExplosionDestructionDioriteCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRANITE_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropGraniteCopperOre.get();
            maxXp = Copper.maxXpDropGraniteCopperOre.get();
            explosionRange = Copper.explosionRangeGraniteCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceGraniteCopperOre.get();
            if (Copper.enableExplosionDestructionGraniteCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.NETHERRACK_COPPER_ORE) {
            fireSource = true;
            minXp = Copper.minXpDropNetherrackCopperOre.get();
            maxXp = Copper.maxXpDropNetherrackCopperOre.get();
            explosionRange = Copper.explosionRangeNetherrackCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceNetherrackCopperOre.get();
            if (Copper.enableExplosionDestructionNetherrackCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.END_STONE_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropEndStoneCopperOre.get();
            maxXp = Copper.maxXpDropEndStoneCopperOre.get();
            explosionRange = Copper.explosionRangeEndStoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceEndStoneCopperOre.get();
            if (Copper.enableExplosionDestructionEndStoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SAND_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropSandCopperOre.get();
            maxXp = Copper.maxXpDropSandCopperOre.get();
            explosionRange = Copper.explosionRangeSandCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceSandCopperOre.get();
            if (Copper.enableExplosionDestructionSandCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRAVEL_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropGravelCopperOre.get();
            maxXp = Copper.maxXpDropGravelCopperOre.get();
            explosionRange = Copper.explosionRangeGravelCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceGravelCopperOre.get();
            if (Copper.enableExplosionDestructionGravelCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SANDSTONE_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropSandstoneCopperOre.get();
            maxXp = Copper.maxXpDropSandstoneCopperOre.get();
            explosionRange = Copper.explosionRangeSandstoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceSandstoneCopperOre.get();
            if (Copper.enableExplosionDestructionSandstoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.RED_SANDSTONE_COPPER_ORE) {
            fireSource = false;
            minXp = Copper.minXpDropRedSandstoneCopperOre.get();
            maxXp = Copper.maxXpDropRedSandstoneCopperOre.get();
            explosionRange = Copper.explosionRangeRedSandstoneCopperOre.get().floatValue();
            explosionChance =  Copper.explosionChanceRedSandstoneCopperOre.get();
            if (Copper.enableExplosionDestructionRedSandstoneCopperOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}

        } else if (this == BlockInit.STONE_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropStoneIronOre.get();
            maxXp = Iron.maxXpDropStoneIronOre.get();
            explosionRange = Iron.explosionRangeStoneIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceStoneIronOre.get();
            if (Iron.enableExplosionDestructionStoneIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.ANDESITE_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropAndesiteIronOre.get();
            maxXp = Iron.maxXpDropAndesiteIronOre.get();
            explosionRange = Iron.explosionRangeAndesiteIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceAndesiteIronOre.get();
            if (Iron.enableExplosionDestructionAndesiteIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.DIORITE_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropDioriteIronOre.get();
            maxXp = Iron.maxXpDropDioriteIronOre.get();
            explosionRange = Iron.explosionRangeDioriteIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceDioriteIronOre.get();
            if (Iron.enableExplosionDestructionDioriteIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRANITE_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropGraniteIronOre.get();
            maxXp = Iron.maxXpDropGraniteIronOre.get();
            explosionRange = Iron.explosionRangeGraniteIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceGraniteIronOre.get();
            if (Iron.enableExplosionDestructionGraniteIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.NETHERRACK_IRON_ORE) {
            fireSource = true;
            minXp = Iron.minXpDropNetherrackIronOre.get();
            maxXp = Iron.maxXpDropNetherrackIronOre.get();
            explosionRange = Iron.explosionRangeNetherrackIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceNetherrackIronOre.get();
            if (Iron.enableExplosionDestructionNetherrackIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.END_STONE_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropEndStoneIronOre.get();
            maxXp = Iron.maxXpDropEndStoneIronOre.get();
            explosionRange = Iron.explosionRangeEndStoneIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceEndStoneIronOre.get();
            if (Iron.enableExplosionDestructionEndStoneIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SAND_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropSandIronOre.get();
            maxXp = Iron.maxXpDropSandIronOre.get();
            explosionRange = Iron.explosionRangeSandIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceSandIronOre.get();
            if (Iron.enableExplosionDestructionSandIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRAVEL_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropGravelIronOre.get();
            maxXp = Iron.maxXpDropGravelIronOre.get();
            explosionRange = Iron.explosionRangeGravelIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceGravelIronOre.get();
            if (Iron.enableExplosionDestructionGravelIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SANDSTONE_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropSandstoneIronOre.get();
            maxXp = Iron.maxXpDropSandstoneIronOre.get();
            explosionRange = Iron.explosionRangeSandstoneIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceSandstoneIronOre.get();
            if (Iron.enableExplosionDestructionSandstoneIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.RED_SANDSTONE_IRON_ORE) {
            fireSource = false;
            minXp = Iron.minXpDropRedSandstoneIronOre.get();
            maxXp = Iron.maxXpDropRedSandstoneIronOre.get();
            explosionRange = Iron.explosionRangeRedSandstoneIronOre.get().floatValue();
            explosionChance =  Iron.explosionChanceRedSandstoneIronOre.get();
            if (Iron.enableExplosionDestructionRedSandstoneIronOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}

        } else if (this == BlockInit.STONE_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropStoneXpOre.get();
            maxXp = Xp.maxXpDropStoneXpOre.get();
            explosionRange = Xp.explosionRangeStoneXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceStoneXpOre.get();
            if (Xp.enableExplosionDestructionStoneXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.ANDESITE_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropAndesiteXpOre.get();
            maxXp = Xp.maxXpDropAndesiteXpOre.get();
            explosionRange = Xp.explosionRangeAndesiteXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceAndesiteXpOre.get();
            if (Xp.enableExplosionDestructionAndesiteXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.DIORITE_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropDioriteXpOre.get();
            maxXp = Xp.maxXpDropDioriteXpOre.get();
            explosionRange = Xp.explosionRangeDioriteXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceDioriteXpOre.get();
            if (Xp.enableExplosionDestructionDioriteXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRANITE_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropGraniteXpOre.get();
            maxXp = Xp.maxXpDropGraniteXpOre.get();
            explosionRange = Xp.explosionRangeGraniteXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceGraniteXpOre.get();
            if (Xp.enableExplosionDestructionGraniteXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.NETHERRACK_XP_ORE) {
            fireSource = true;
            minXp = Xp.minXpDropNetherrackXpOre.get();
            maxXp = Xp.maxXpDropNetherrackXpOre.get();
            explosionRange = Xp.explosionRangeNetherrackXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceNetherrackXpOre.get();
            if (Xp.enableExplosionDestructionNetherrackXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.END_STONE_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropEndStoneXpOre.get();
            maxXp = Xp.maxXpDropEndStoneXpOre.get();
            explosionRange = Xp.explosionRangeEndStoneXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceEndStoneXpOre.get();
            if (Xp.enableExplosionDestructionEndStoneXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SAND_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropSandXpOre.get();
            maxXp = Xp.maxXpDropSandXpOre.get();
            explosionRange = Xp.explosionRangeSandXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceSandXpOre.get();
            if (Xp.enableExplosionDestructionSandXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.GRAVEL_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropGravelXpOre.get();
            maxXp = Xp.maxXpDropGravelXpOre.get();
            explosionRange = Xp.explosionRangeGravelXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceGravelXpOre.get();
            if (Xp.enableExplosionDestructionGravelXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.SANDSTONE_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropSandstoneXpOre.get();
            maxXp = Xp.maxXpDropSandstoneXpOre.get();
            explosionRange = Xp.explosionRangeSandstoneXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceSandstoneXpOre.get();
            if (Xp.enableExplosionDestructionSandstoneXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else if (this == BlockInit.RED_SANDSTONE_XP_ORE) {
            fireSource = false;
            minXp = Xp.minXpDropRedSandstoneXpOre.get();
            maxXp = Xp.maxXpDropRedSandstoneXpOre.get();
            explosionRange = Xp.explosionRangeRedSandstoneXpOre.get().floatValue();
            explosionChance =  Xp.explosionChanceRedSandstoneXpOre.get();
            if (Xp.enableExplosionDestructionRedSandstoneXpOre.get()) {eM = Explosion.Mode.BREAK;} else {eM = Explosion.Mode.NONE;}
        } else {
            minXp = 0;
            maxXp = 0;
            explosionRange = 0.0F;
            explosionChance = 0;
        }
    }
}
