package com.danny.dannys_ores.blockItems;

import com.danny.dannys_ores.configs.ConfigHandler;
import com.danny.dannys_ores.configs.PathBuilder;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * An item of this class sets a player on fire while in his/her inventory/hand.
 */
public class HotBlockItem extends BlockItem {
    private UnmodifiableConfig config;

    public HotBlockItem(Block block, Properties properties) {
        super(block, properties);
        this.config = ConfigHandler.getConfig(block);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!worldIn.isRemote) {
            if (entityIn instanceof PlayerEntity) {
                if (!((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getDisableEffectFullPath())).get()) {
                    boolean onlyIfSelected = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getOnlyWhileSelectedFullPath())).get();
                    if (!onlyIfSelected || isSelected) {
                        int duration = ((ForgeConfigSpec.IntValue) config.get(PathBuilder.getEffectDurationFullPath())).get();
                        entityIn.setFire(duration);
                    }
                }
            }
        }
    }
}
