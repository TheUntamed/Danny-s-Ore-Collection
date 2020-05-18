package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.ores.with_xp_ore.Xp;
import com.danny.dannys_ores.init.BlockInitXpDrop;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

import java.util.Random;

public class BedrockOreWithXpDrop extends BedrockOre {
    private int minXp;
    private int maxXp;

    public BedrockOreWithXpDrop(Block.Properties properties, Block blockBase, int minXp, int maxXp) {
        super(properties, blockBase);
        this.minXp = minXp;
        this.maxXp = maxXp;
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
        if (this == BlockInitXpDrop.BEDROCK_XP_ORE.get()) {
            return MathHelper.nextInt(random, Xp.minXpBedrockXpOre.get(), Xp.maxXpBedrockXpOre.get());
        } else {
            return MathHelper.nextInt(RANDOM, minXp, maxXp);
        }
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? setValues(RANDOM) : 0;
    }
}
