package com.danny.dannys_ores.blocks.bedrock;

import com.danny.dannys_ores.blocks.ExplosiveOre;
import com.danny.dannys_ores.configs.ConfigHandler;
import com.danny.dannys_ores.configs.GeneralConfig;
import com.danny.dannys_ores.configs.PathBuilder;
import com.danny.dannys_ores.util.*;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;

/**
 * A simple bedrock ore that has a chance to explode when mined.
 */
public class ExplosiveBedrockOre extends ExplosiveOre {

    public ExplosiveBedrockOre(Block.Properties properties, StoneVariants blockBase, VariantsModId blockBaseModId, RichnessTypes rType, OreTypes oType, int minXp, int maxXp) {
        super(properties, blockBase, blockBaseModId, rType, oType, minXp, maxXp);
    }

    /**
     * This method was inspired by the Carbonado mod (by InsaneGames_)
     * https://www.curseforge.com/minecraft/mc-mods/carbonado
     *
     * @param worldIn     A World instance
     * @param pos         The position of the destroyed block.
     * @param explosionIn A Explosion
     */
    @Override
    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {
        if (!worldIn.isRemote) {
            if (GeneralConfig.replaceBedrockOreWithBedrockOnExplosion.get()) {
                worldIn.setBlockState(pos, Blocks.BEDROCK.getDefaultState(), 3);
            }
            worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 2.0f, 1.5f);
        }
    }

    /**
     * The resistance for bedrock ores can be defined via config.
     * This method can be called on a bedrock ore block to return the corresponding resistance.
     *
     * @return The resistance of the block.
     */
    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance() {
        UnmodifiableConfig config = ConfigHandler.getConfig(this);
        double d = ((ForgeConfigSpec.DoubleValue) config.get(PathBuilder.getResistanceFullPath(this.getBlockBaseModId(), this.getStoneVariant(), this.getRichnessType(), this.getOreType()))).get();
        return (float) d;
    }
}
