package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.util.*;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;

import static net.minecraft.world.Explosion.Mode.BREAK;
import static net.minecraft.world.Explosion.Mode.NONE;

public class ExplosiveOre extends SimpleOre {

    public ExplosiveOre(Block.Properties properties, StoneVariants blockBase, VariantsModId blockBaseModId, RichnessTypes rType, OreTypes oType, int minXp, int maxXp) {
        super(properties, blockBase, blockBaseModId, rType, oType, minXp, maxXp);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        // isRemote checks if it's server (false) or client (true) side.
        // This code is supposed to run server side only.
        if(!worldIn.isRemote) {
            UnmodifiableConfig config =  ConfigHandler.getConfig(this);
            double chance = ((ForgeConfigSpec.DoubleValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getExplosionChancePath())).get();
            double rand = RANDOM.nextDouble() * 100;
            if (rand < chance) {
                double explosionRange = ((ForgeConfigSpec.DoubleValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getExplosionRangePath())).get();
                Explosion.Mode eM = NONE;
                if(((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getExplosionBreaksBlocksPath())).get()) {
                    eM = BREAK;
                }
                worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), (float) explosionRange, true, eM);
            } else {
                worldIn.playEvent(player, 2001, pos, getStateId(state));
            }
        } else {
            worldIn.playEvent(player, 2001, pos, getStateId(state));
        }
    }
}
