package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.init.BlockInit;
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

public class BedrockOreWithXpDrop extends Block {
    public BedrockOreWithXpDrop(Block.Properties properties) {
        super(properties);
    }

    /*
    This method was inspired by the Carbonado mod (by InsaneGames_)
    https://www.curseforge.com/minecraft/mc-mods/carbonado
 */
    @Override
    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {
        if (General.replaceBedrockOreWithBedrockOnExplosion.get()) {
            worldIn.setBlockState(pos, Blocks.BEDROCK.getDefaultState(), 3);
        }
        worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 2.0f, 1.5f);
    }

    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance() {
        if (this == BlockInit.BEDROCK_XP_ORE.get()) {
            return Xp.resistanceBedrockXpOre.get().floatValue();
        } else {
            return this.blockResistance;
        }
    }

    private int setValues(Random random) {
        if (this == BlockInit.BEDROCK_COAL_ORE.get()) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == BlockInit.BEDROCK_DIAMOND_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.BEDROCK_EMERALD_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.BEDROCK_LAPIS_ORE.get()) {
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInit.BEDROCK_QUARTZ_ORE.get()) {
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInit.BEDROCK_XP_ORE.get()) {
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
