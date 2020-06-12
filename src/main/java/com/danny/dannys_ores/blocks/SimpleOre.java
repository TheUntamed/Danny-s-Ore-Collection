package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.ConfigHandler;
import com.danny.dannys_ores.configs.PathBuilder;
import com.danny.dannys_ores.util.*;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.Random;

public class SimpleOre extends SimpleBlock {
    private int minXp;
    private int maxXp;
    private OreTypes oType;
    private RichnessTypes rType;

    public SimpleOre(Block.Properties properties, StoneVariants blockBase, VariantsModId blockBaseModId, RichnessTypes rType, OreTypes oType, int minXp, int maxXp) {
        super(properties, blockBase, blockBaseModId);
        this.minXp = minXp;
        this.maxXp = maxXp;
        this.rType = rType;
        this.oType = oType;
    }

    public RichnessTypes getRichnessType() {
        return rType;
    }

    public OreTypes getOreType() {
        return oType;
    }

    private int setValues(Random random) {
        if (this.getOreType().equals(OreTypes.XP)) {
            UnmodifiableConfig config = ConfigHandler.getConfig(this);
            StoneVariants variant = this.getStoneVariant();
            VariantsModId fillerBlockModId = this.getBlockBaseModId();
            return MathHelper.nextInt(random,
                    ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getMinXpDropFullPath(fillerBlockModId, variant, rType, oType))).get(),
                    ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getMaxXpDropFullPath(fillerBlockModId, variant, rType, oType))).get());
        } else {
            return MathHelper.nextInt(RANDOM, minXp, maxXp);
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? setValues(RANDOM) : 0;
    }
}
