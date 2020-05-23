package com.danny.dannys_ores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class OreWithParticles extends BaseOre {
    private BasicParticleType bpt;

    public OreWithParticles(Block.Properties properties, Block blockBase, int minXp, int maxXp, BasicParticleType bpt) {
        super(properties, blockBase, minXp, maxXp);
        this.bpt = bpt;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        worldIn.addParticle(bpt, pos.getX(),pos.getY() + 1, pos.getZ(), 0.0D,0.5D,0.0D);
    }

    public BasicParticleType getParticleType() {
        return bpt;
    }

}
