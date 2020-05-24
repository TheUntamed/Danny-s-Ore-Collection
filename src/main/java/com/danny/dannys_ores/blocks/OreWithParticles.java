package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.util.OreTypes;
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

    public OreWithParticles(Block.Properties properties, Block blockBase, OreTypes type, int minXp, int maxXp, BasicParticleType bpt) {
        super(properties, blockBase, type, minXp, maxXp);
        this.bpt = bpt;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        worldIn.addParticle(bpt, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 0.0D,0.1D,0.0D);
        //worldIn.addParticle(bpt, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 0.0D,0.1D,0.0D);
        //worldIn.addParticle(bpt, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 0.0D,0.1D,0.0D);
        //worldIn.addParticle(bpt, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 0.0D,0.1D,0.0D);
    }

    public BasicParticleType getParticleType() {
        return bpt;
    }

}
