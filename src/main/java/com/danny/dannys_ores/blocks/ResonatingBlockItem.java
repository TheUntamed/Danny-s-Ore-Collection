package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.ores.Resonating;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec;

public class ResonatingBlockItem extends BlockItem {

    public ResonatingBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (entityIn instanceof PlayerEntity) {
            ResourceLocation resLoc = this.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                boolean onlyIfSelected = ((ForgeConfigSpec.BooleanValue) Resonating.spec.getValues().get("general." + blockName + ".properties.onlyWhileSelected")).get();
                if (!onlyIfSelected || isSelected) {
                    entityIn.setFire(1);
                }
            } else {
                throw new NullPointerException("Block '" + this + "' has no registry name!");
            }
        }
    }
}
