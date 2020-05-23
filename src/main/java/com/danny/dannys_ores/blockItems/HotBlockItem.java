package com.danny.dannys_ores.blockItems;

import com.danny.dannys_ores.util.ConfigHandler;
import com.danny.dannys_ores.util.PathHandler;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;

public class HotBlockItem extends BlockItem {
    private UnmodifiableConfig config;

    public HotBlockItem(Block block, Properties properties) {
        super(block, properties);
        this.config = ConfigHandler.getConfig(block.getRegistryName().toString().split(":")[1]);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + ".disableBurnEffect")).get()) {
            if (entityIn instanceof PlayerEntity) {
                boolean onlyIfSelected = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + ".onlyWhileSelected")).get();
                if (!onlyIfSelected || isSelected) {
                    int duration = ((ForgeConfigSpec.IntValue) config.get(PathHandler.getGeneralPath() + ".duration")).get();
                    entityIn.setFire(duration);
                }
            }
        }
    }
}
