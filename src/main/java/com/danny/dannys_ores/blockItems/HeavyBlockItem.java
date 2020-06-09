package com.danny.dannys_ores.blockItems;

import com.danny.dannys_ores.util.ConfigHandler;
import com.danny.dannys_ores.util.PathHandler;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;

public class HeavyBlockItem extends BlockItem {
    private UnmodifiableConfig config;

    public HeavyBlockItem(Block block, Item.Properties properties) {
        super(block, properties);
        this.config = ConfigHandler.getConfig(block);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!worldIn.isRemote) {
            if (!((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getDisableEffectPath())).get()) {
                if (entityIn instanceof PlayerEntity) {
                    boolean onlyIfSelected = ((ForgeConfigSpec.BooleanValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getOnlyWhileSelectedPath())).get();
                    if (!onlyIfSelected || isSelected) {
                        int effectLevel = ((ForgeConfigSpec.IntValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getEffectLevelPath())).get();
                        int duration = ((ForgeConfigSpec.IntValue) config.get(PathHandler.getGeneralPath() + "." + PathHandler.getEffectDurationPath())).get();
                        ((PlayerEntity) entityIn).addPotionEffect(new EffectInstance(Effect.get(2), duration, (effectLevel - 1)));
                    }
                }
            }
        }
    }
}
