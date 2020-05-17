package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.Xp;
import com.danny.dannys_ores.init.BlockInit;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.Random;

public class OreWithXpDrop extends BaseBlock {

    public OreWithXpDrop(Block.Properties properties, Block blockBase) {
        super(properties, blockBase);
    }

    private int setValues(Random random) {
        ResourceLocation resLoc = this.getRegistryName();
        if (resLoc != null) {
            String blockName = resLoc.toString().split(":")[1];
            if (blockName.contains("_coal_ore")) { return MathHelper.nextInt(random, 0, 2); }
            else if (blockName.contains("_diamond_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (blockName.contains("_emerald_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (blockName.contains("_lapis_ore")) { return MathHelper.nextInt(random, 2, 5); }
            else if (blockName.contains("_redstone_ore")) { return MathHelper.nextInt(random, 2, 5); }
            else if (blockName.contains("_quartz_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (blockName.contains("_amethyst_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (blockName.contains("_black_opal_ore")) { return MathHelper.nextInt(random, 5, 10); }
            else if (blockName.contains("_white_opal_ore")) { return MathHelper.nextInt(random, 5, 10); }
            else if (blockName.contains("_lucky_ore")) { return MathHelper.nextInt(random, 0, 7); }
            else if (blockName.contains("_ruby_ore")) { return MathHelper.nextInt(random, 2, 7); }
            else if (blockName.contains("_peridot_ore")) { return MathHelper.nextInt(random, 2, 7); }
            else if (blockName.contains("_sapphire_ore")) { return MathHelper.nextInt(random, 2, 7); }
            else if (blockName.contains("_electronite_ore")) { return MathHelper.nextInt(random, 1, 5); }
            else if (blockName.contains("_soulium_ore")) { return MathHelper.nextInt(random, 3, 7); }
            else if (blockName.contains("_prosperity_ore")) { return MathHelper.nextInt(random, 1, 5); }
            else if (blockName.contains("_inferium_ore")) { return MathHelper.nextInt(random, 2, 5); }
            else if (blockName.contains("_prudentium_ore")) { return MathHelper.nextInt(random, 3, 6); }
            else if (blockName.contains("_tertium_ore")) { return MathHelper.nextInt(random, 4, 7); }
            else if (blockName.contains("_imperium_ore")) { return MathHelper.nextInt(random, 5, 8); }
            else if (blockName.contains("_supremium_ore")) { return MathHelper.nextInt(random, 6, 9); }
            else if (blockName.contains("_insanium_ore")) { return MathHelper.nextInt(random, 7, 10); }
            else if (blockName.contains("_draconium_ore")) { return MathHelper.nextInt(random, 3, 7); }

            else if (blockName.contains("xp_ore")) {
                UnmodifiableConfig config = Xp.spec.getValues();
                return MathHelper.nextInt(random, config.get("general." + blockName + ".xp_drop.minXp"), config.get("general." + blockName + ".xp_drop.maxXp"));
            }
        }
        return 0;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.setValues(RANDOM) : 0;
    }
}
