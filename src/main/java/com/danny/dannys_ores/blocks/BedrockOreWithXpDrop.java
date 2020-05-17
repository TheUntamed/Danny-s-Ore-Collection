package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.init.BlockInitVanilla;
import com.danny.dannys_ores.init.BlockInitXpDrop;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class BedrockOreWithXpDrop extends BedrockOre {
    public BedrockOreWithXpDrop(Block.Properties properties, Block blockBase) {
        super(properties, blockBase);
    }

    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance() {
        if (this == BlockInitXpDrop.BEDROCK_XP_ORE.get()) {
            return Xp.resistanceBedrockXpOre.get().floatValue();
        } else {
            return this.blockResistance;
        }
    }

    private int setValues(Random random) {
        if (this == BlockInitVanilla.BEDROCK_COAL_ORE.get()) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == BlockInitVanilla.BEDROCK_DIAMOND_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInitVanilla.BEDROCK_EMERALD_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInitVanilla.BEDROCK_LAPIS_ORE.get()) {
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInitVanilla.BEDROCK_QUARTZ_ORE.get()) {
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInitXpDrop.BEDROCK_AMETHYST_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInitXpDrop.BEDROCK_BLACK_OPAL_ORE.get()) {
            return MathHelper.nextInt(random, 5, 10);
        } else if (this == BlockInitXpDrop.BEDROCK_WHITE_OPAL_ORE.get()) {
            return MathHelper.nextInt(random, 5, 10);
        } else if (this == BlockInitXpDrop.BEDROCK_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpBedrockXpOre.get(), Xp.maxXpBedrockXpOre.get());
        } else {
            return 0;
        }
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.setValues(RANDOM) : 0;
    }
}
