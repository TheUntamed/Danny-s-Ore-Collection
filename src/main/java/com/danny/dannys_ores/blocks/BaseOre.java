package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.ores.other.Xp;
import com.danny.dannys_ores.util.*;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class BaseOre extends BaseBlock {
    private int minXp;
    private int maxXp;
    private OreTypes oType;
    private RichnessTypes rType;

    public BaseOre(Block.Properties properties, VariantType blockBase, RichnessTypes rType, OreTypes oType, int minXp, int maxXp) {
        super(properties, blockBase);
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
        ResourceLocation resLoc = this.getRegistryName();
        if (resLoc != null) {
            String blockName = resLoc.toString().split(":")[1];
            if (blockName.contains("xp_ore")) {
                UnmodifiableConfig config = Xp.spec.getValues();
                return MathHelper.nextInt(random,
                        config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getPropertiesPath() + "." + PathHandler.getMinXpDropPath()),
                        config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getPropertiesPath() + "." + PathHandler.getMaxXpDropPath()));
            } else {
                return MathHelper.nextInt(RANDOM, minXp, maxXp);
            }
        } else {
            throw new NullPointerException("Block '" + this + "' has no registry name!");
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? setValues(RANDOM) : 0;
    }
}
