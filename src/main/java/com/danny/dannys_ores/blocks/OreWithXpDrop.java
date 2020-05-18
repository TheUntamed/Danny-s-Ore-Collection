package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.ores.with_xp_ore.Xp;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class OreWithXpDrop extends BaseBlock {
    private int minXp;
    private int maxXp;

    public OreWithXpDrop(Block.Properties properties, Block blockBase, int minXp, int maxXp) {
        super(properties, blockBase);
        this.minXp = minXp;
        this.maxXp = maxXp;
    }

    private int setValues(Random random) {
        ResourceLocation resLoc = this.getRegistryName();
        if (resLoc != null) {
            String blockName = resLoc.toString().split(":")[1];
            if (blockName.contains("xp_ore")) {
                UnmodifiableConfig config = Xp.spec.getValues();
                return MathHelper.nextInt(random, config.get("general." + blockName + ".xp_drop.minXp"), config.get("general." + blockName + ".xp_drop.maxXp"));
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
