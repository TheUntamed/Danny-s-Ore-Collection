package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class OreWithXpDrop extends Block {
    public OreWithXpDrop(Block.Properties properties) {
        super(properties);
    }

    private int setValues(Random random) {
        ResourceLocation resLoc = this.getRegistryName();
        if (resLoc != null) {
            String regName = resLoc.toString();
            if (regName.contains("_coal_ore")) { return MathHelper.nextInt(random, 0, 2); }
            else if (regName.contains("_diamond_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (regName.contains("_emerald_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (regName.contains("_lapis_ore")) { return MathHelper.nextInt(random, 2, 5); }
            else if (regName.contains("_redstone_ore")) { return MathHelper.nextInt(random, 2, 5); }
            else if (regName.contains("_quartz_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (regName.contains("_amethyst_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (regName.contains("_black_opal_ore")) { return MathHelper.nextInt(random, 5, 10); }
            else if (regName.contains("_white_opal_ore")) { return MathHelper.nextInt(random, 5, 10); }
            else if (regName.contains("_lucky_ore")) { return MathHelper.nextInt(random, 0, 7); }
        }
        if (this == BlockInit.STONE_XP_ORE.get()) {
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
        } else if (this == BlockInit.RED_SAND_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpRedSandXpOre.get(), Xp.maxXpRedSandXpOre.get());
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
