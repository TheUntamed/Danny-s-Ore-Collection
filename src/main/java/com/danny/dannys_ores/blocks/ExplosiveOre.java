package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.ConfigHandler;
import com.danny.dannys_ores.configs.PathBuilder;
import com.danny.dannys_ores.util.*;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;

import static net.minecraft.world.Explosion.Mode.BREAK;
import static net.minecraft.world.Explosion.Mode.NONE;

/**
 * A simple ore that has a chance to explode when mined by a player.
 */
public class ExplosiveOre extends SimpleOre {

    public ExplosiveOre(Block.Properties properties, StoneVariants blockBase, VariantsModId blockBaseModId, RichnessTypes rType, OreTypes oType, int minXp, int maxXp) {
        super(properties, blockBase, blockBaseModId, rType, oType, minXp, maxXp);
    }

    @Override
    public void onPlayerDestroy(IWorld world, BlockPos pos, BlockState state) {
        if (!world.isRemote()) {
            UnmodifiableConfig config = ConfigHandler.getConfig(this);
            double chance = ((ForgeConfigSpec.DoubleValue) config.get(PathBuilder.getExplosionChanceFullPath())).get();
            double rand = RANDOM.nextDouble() * 100;
            if (rand < chance) {
                double explosionRange = ((ForgeConfigSpec.DoubleValue) config.get(PathBuilder.getExplosionRangeFullPath())).get();
                Explosion.Mode eM = NONE;
                if (((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getExplosionBreaksBlocksFullPath())).get()) {
                    eM = BREAK;
                }
                world.getWorld().createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), (float) explosionRange, eM);
            }
        }
        super.onPlayerDestroy(world, pos, state);
    }
}
