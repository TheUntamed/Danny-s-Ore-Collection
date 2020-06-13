package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.util.VariantsModId;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import com.danny.dannys_ores.util.StoneVariants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

/**
 * There are no ores with particle effects right now.
 */
public class OreWithParticles extends SimpleOre {
    private BasicParticleType bpt;

    public OreWithParticles(Block.Properties properties, StoneVariants blockBase, VariantsModId blockBaseModId, RichnessTypes rType, OreTypes oType, int minXp, int maxXp, BasicParticleType bpt) {
        super(properties, blockBase, blockBaseModId, rType, oType, minXp, maxXp);
        this.bpt = bpt;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        //worldIn.addParticle(bpt, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 1, 0.0D,0.0D,0.0D);
        //worldIn.addParticle(bpt, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ(), 0.0D,0.0D,0.0D);
        //worldIn.addParticle(bpt, pos.getX(), pos.getY() + 0.5, pos.getZ() + 0.5, 0.0D,0.0D,0.0D);
        //worldIn.addParticle(bpt, pos.getX() + 1, pos.getY() + 0.5, pos.getZ() + 0.5, 0.0D,0.0D,0.0D);
    }

    public BasicParticleType getParticleType() {
        return bpt;
    }

}
