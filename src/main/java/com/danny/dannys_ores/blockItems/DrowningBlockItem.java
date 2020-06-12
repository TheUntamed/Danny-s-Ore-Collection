package com.danny.dannys_ores.blockItems;

import com.danny.dannys_ores.configs.ConfigHandler;
import com.danny.dannys_ores.configs.PathBuilder;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
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
            if (entityIn instanceof PlayerEntity) {
                PlayerEntity pEntity = (PlayerEntity) entityIn;
                if (!((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getDisableEffectFullPath())).get()) {
                    boolean onlyIfSelected = ((ForgeConfigSpec.BooleanValue) config.get(PathBuilder.getOnlyWhileSelectedFullPath())).get();
                    if (!onlyIfSelected || isSelected) {
                        if (pEntity.isAlive() && pEntity.getActivePotionEffect(Effects.WATER_BREATHING) == null) {
                            pEntity.setAir(entityIn.getAir() - 5);
                            if (pEntity.getAir() <= -25) {
                                pEntity.setAir(-5);
                                pEntity.attackEntityFrom(DamageSource.DROWN, 2.0F);
                            }
                        } else {
                            pEntity.setAir(300);
                        }
                    }
                }
            }
        }
    }
}
