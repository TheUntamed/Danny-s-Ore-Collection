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
        if (this == BlockInit.ANDESITE_COAL_ORE.get() || this == BlockInit.DIORITE_COAL_ORE.get() || this == BlockInit.GRANITE_COAL_ORE.get() || this == BlockInit.NETHERRACK_COAL_ORE.get() || this == BlockInit.END_STONE_COAL_ORE.get() || this == BlockInit.SAND_COAL_ORE.get() || this == BlockInit.GRAVEL_COAL_ORE.get() || this == BlockInit.SANDSTONE_COAL_ORE.get() || this == BlockInit.RED_SANDSTONE_COAL_ORE.get()
                || this == BlockInit.QUARK_BASALT_COAL_ORE.get() || this == BlockInit.QUARK_LIMESTONE_COAL_ORE.get() || this == BlockInit.QUARK_JASPER_COAL_ORE.get() || this == BlockInit.QUARK_MARBLE_COAL_ORE.get() || this == BlockInit.QUARK_SLATE_COAL_ORE.get()
                || this == BlockInit.EMBELLISHCRAFT_BASALT_COAL_ORE.get() || this == BlockInit.EMBELLISHCRAFT_GNEISS_COAL_ORE.get() || this == BlockInit.EMBELLISHCRAFT_JADE_COAL_ORE.get() || this == BlockInit.EMBELLISHCRAFT_LARVIKITE_COAL_ORE.get() || this == BlockInit.EMBELLISHCRAFT_MARBLE_COAL_ORE.get() || this == BlockInit.EMBELLISHCRAFT_SLATE_COAL_ORE.get()) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == BlockInit.ANDESITE_DIAMOND_ORE.get() || this == BlockInit.DIORITE_DIAMOND_ORE.get() || this == BlockInit.GRANITE_DIAMOND_ORE.get() || this == BlockInit.NETHERRACK_DIAMOND_ORE.get() || this == BlockInit.END_STONE_DIAMOND_ORE.get() || this == BlockInit.SAND_DIAMOND_ORE.get() || this == BlockInit.GRAVEL_DIAMOND_ORE.get() || this == BlockInit.SANDSTONE_DIAMOND_ORE.get() || this == BlockInit.RED_SANDSTONE_DIAMOND_ORE.get()
                || this == BlockInit.QUARK_BASALT_DIAMOND_ORE.get() || this == BlockInit.QUARK_LIMESTONE_DIAMOND_ORE.get() || this == BlockInit.QUARK_JASPER_DIAMOND_ORE.get() || this == BlockInit.QUARK_MARBLE_DIAMOND_ORE.get() || this == BlockInit.QUARK_SLATE_DIAMOND_ORE.get()
                || this == BlockInit.EMBELLISHCRAFT_BASALT_DIAMOND_ORE.get() || this == BlockInit.EMBELLISHCRAFT_GNEISS_DIAMOND_ORE.get() || this == BlockInit.EMBELLISHCRAFT_JADE_DIAMOND_ORE.get() || this == BlockInit.EMBELLISHCRAFT_LARVIKITE_DIAMOND_ORE.get() || this == BlockInit.EMBELLISHCRAFT_MARBLE_DIAMOND_ORE.get() || this == BlockInit.EMBELLISHCRAFT_SLATE_DIAMOND_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.ANDESITE_EMERALD_ORE.get() || this == BlockInit.DIORITE_EMERALD_ORE.get() || this == BlockInit.GRANITE_EMERALD_ORE.get() || this == BlockInit.NETHERRACK_EMERALD_ORE.get() || this == BlockInit.END_STONE_EMERALD_ORE.get() || this == BlockInit.SAND_EMERALD_ORE.get() || this == BlockInit.GRAVEL_EMERALD_ORE.get() || this == BlockInit.SANDSTONE_EMERALD_ORE.get() || this == BlockInit.RED_SANDSTONE_EMERALD_ORE.get()
                || this == BlockInit.QUARK_BASALT_EMERALD_ORE.get() || this == BlockInit.QUARK_LIMESTONE_EMERALD_ORE.get() || this == BlockInit.QUARK_JASPER_EMERALD_ORE.get() || this == BlockInit.QUARK_MARBLE_EMERALD_ORE.get() || this == BlockInit.QUARK_SLATE_EMERALD_ORE.get()
                || this == BlockInit.EMBELLISHCRAFT_BASALT_EMERALD_ORE.get() || this == BlockInit.EMBELLISHCRAFT_GNEISS_EMERALD_ORE.get() || this == BlockInit.EMBELLISHCRAFT_JADE_EMERALD_ORE.get() || this == BlockInit.EMBELLISHCRAFT_LARVIKITE_EMERALD_ORE.get() || this == BlockInit.EMBELLISHCRAFT_MARBLE_EMERALD_ORE.get() || this == BlockInit.EMBELLISHCRAFT_SLATE_EMERALD_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.ANDESITE_LAPIS_ORE.get() || this == BlockInit.DIORITE_LAPIS_ORE.get() || this == BlockInit.GRANITE_LAPIS_ORE.get() || this == BlockInit.NETHERRACK_LAPIS_ORE.get() || this == BlockInit.END_STONE_LAPIS_ORE.get() || this == BlockInit.SAND_LAPIS_ORE.get() || this == BlockInit.GRAVEL_LAPIS_ORE.get() || this == BlockInit.SANDSTONE_LAPIS_ORE.get() || this == BlockInit.RED_SANDSTONE_LAPIS_ORE.get()
                || this == BlockInit.QUARK_BASALT_LAPIS_ORE.get() || this == BlockInit.QUARK_LIMESTONE_LAPIS_ORE.get() || this == BlockInit.QUARK_JASPER_LAPIS_ORE.get() || this == BlockInit.QUARK_MARBLE_LAPIS_ORE.get() || this == BlockInit.QUARK_SLATE_LAPIS_ORE.get()
                || this == BlockInit.EMBELLISHCRAFT_BASALT_LAPIS_ORE.get() || this == BlockInit.EMBELLISHCRAFT_GNEISS_LAPIS_ORE.get() || this == BlockInit.EMBELLISHCRAFT_JADE_LAPIS_ORE.get() || this == BlockInit.EMBELLISHCRAFT_LARVIKITE_LAPIS_ORE.get() || this == BlockInit.EMBELLISHCRAFT_MARBLE_LAPIS_ORE.get() || this == BlockInit.EMBELLISHCRAFT_SLATE_LAPIS_ORE.get()) {
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInit.STONE_QUARTZ_ORE.get() || this == BlockInit.ANDESITE_QUARTZ_ORE.get() || this == BlockInit.DIORITE_QUARTZ_ORE.get() || this == BlockInit.GRANITE_QUARTZ_ORE.get() || this == BlockInit.END_STONE_QUARTZ_ORE.get() || this == BlockInit.SAND_QUARTZ_ORE.get() || this == BlockInit.GRAVEL_QUARTZ_ORE.get() || this == BlockInit.SANDSTONE_QUARTZ_ORE.get() || this == BlockInit.RED_SANDSTONE_QUARTZ_ORE.get()
                || this == BlockInit.QUARK_BASALT_QUARTZ_ORE.get() || this == BlockInit.QUARK_LIMESTONE_QUARTZ_ORE.get() || this == BlockInit.QUARK_JASPER_QUARTZ_ORE.get() || this == BlockInit.QUARK_MARBLE_QUARTZ_ORE.get() || this == BlockInit.QUARK_SLATE_QUARTZ_ORE.get()
                || this == BlockInit.EMBELLISHCRAFT_BASALT_QUARTZ_ORE.get() || this == BlockInit.EMBELLISHCRAFT_GNEISS_QUARTZ_ORE.get() || this == BlockInit.EMBELLISHCRAFT_JADE_QUARTZ_ORE.get() || this == BlockInit.EMBELLISHCRAFT_LARVIKITE_QUARTZ_ORE.get() || this == BlockInit.EMBELLISHCRAFT_MARBLE_QUARTZ_ORE.get() || this == BlockInit.EMBELLISHCRAFT_SLATE_QUARTZ_ORE.get()){
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
        } else if (this == BlockInit.QUARK_BASALT_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpQuarkBasaltXpOre.get(), Xp.maxXpQuarkBasaltXpOre.get());
        } else if (this == BlockInit.QUARK_LIMESTONE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpQuarkLimestoneXpOre.get(), Xp.maxXpQuarkLimestoneXpOre.get());
        } else if (this == BlockInit.QUARK_JASPER_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpQuarkJasperXpOre.get(), Xp.maxXpQuarkJasperXpOre.get());
        } else if (this == BlockInit.QUARK_MARBLE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpQuarkMarbleXpOre.get(), Xp.maxXpQuarkMarbleXpOre.get());
        } else if (this == BlockInit.QUARK_SLATE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpQuarkSlateXpOre.get(), Xp.maxXpQuarkSlateXpOre.get());
        } else if (this == BlockInit.EMBELLISHCRAFT_BASALT_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpEmbellishcraftBasaltXpOre.get(), Xp.maxXpEmbellishcraftBasaltXpOre.get());
        } else if (this == BlockInit.EMBELLISHCRAFT_GNEISS_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpEmbellishcraftGneissXpOre.get(), Xp.maxXpEmbellishcraftGneissXpOre.get());
        } else if (this == BlockInit.EMBELLISHCRAFT_JADE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpEmbellishcraftJadeXpOre.get(), Xp.maxXpEmbellishcraftJadeXpOre.get());
        } else if (this == BlockInit.EMBELLISHCRAFT_LARVIKITE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpEmbellishcraftLarvikiteXpOre.get(), Xp.maxXpEmbellishcraftLarvikiteXpOre.get());
        } else if (this == BlockInit.EMBELLISHCRAFT_MARBLE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpEmbellishcraftMarbleXpOre.get(), Xp.maxXpEmbellishcraftMarbleXpOre.get());
        } else if (this == BlockInit.EMBELLISHCRAFT_SLATE_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpEmbellishcraftSlateXpOre.get(), Xp.maxXpEmbellishcraftSlateXpOre.get());
        } else {
            return 0;
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.setValues(RANDOM) : 0;
    }
}
