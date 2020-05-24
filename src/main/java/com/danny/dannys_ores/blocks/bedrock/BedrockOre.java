package com.danny.dannys_ores.blocks.bedrock;

import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.util.ConfigHandler;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.PathHandler;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BedrockOre extends BaseOre {
    private BasicParticleType bpt;

    public BedrockOre(Block.Properties properties, Block blockBase, OreTypes type, int minXp, int maxXp) {
        super(properties, blockBase, type, minXp, maxXp);
        this.bpt = bpt;
    }

    /**
     * This method was inspired by the Carbonado mod (by InsaneGames_)
     * https://www.curseforge.com/minecraft/mc-mods/carbonado
     *
     * @param worldIn A World instance
     * @param pos The position of the destroyed block.
     * @param explosionIn A Explosion
     */
    @Override
    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {
        if (General.replaceBedrockOreWithBedrockOnExplosion.get()) {
            worldIn.setBlockState(pos, Blocks.BEDROCK.getDefaultState(), 3);
        }
        worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 2.0f, 1.5f);
    }

    /**
     *  The resistance for bedrock ores can be defined via config.
     *  This method can be called on a bedrock ore block to return the corresponding resistance.
     *
     * @return The resistance of the block.
     */
    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance() {

        ResourceLocation resLoc = this.getRegistryName();
        if (resLoc != null) {
            String blockName = resLoc.toString();
            UnmodifiableConfig config = ConfigHandler.getConfig(blockName);
            return config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getPropertiesPath() + "." + PathHandler.getResistancePath());
        } else {
            return this.blockResistance;
        }
    }
}