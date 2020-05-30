package com.danny.dannys_ores.blockItems;

import com.danny.dannys_ores.util.ConfigHandler;
import com.danny.dannys_ores.util.PathHandler;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;

public class DrowningBlockItem extends BlockItem {
    private UnmodifiableConfig config;

    public DrowningBlockItem(Block block, Properties properties) {
        super(block, properties);
        this.config = ConfigHandler.getConfig(block);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!worldIn.isRemote) {
            if (!((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + ".disableDrownEffect")).get()) {
                if (entityIn instanceof PlayerEntity) {
                    boolean onlyIfSelected = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getSelectedPath())).get();
                    if (!onlyIfSelected || isSelected) {
                        if (entityIn.isAlive()) {
                            entityIn.setAir(entityIn.getAir() - 5);
                            if (entityIn.getAir() <= -25) {
                                entityIn.setAir(-5);
                                entityIn.attackEntityFrom(DamageSource.DROWN, 2.0F);
                            }
                        } else {
                            entityIn.setAir(300);
                        }
                    }
                }
            }
        }
    }
}
