package com.danny.dannys_ores.Blocks;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class BasicOreItem extends BlockItem {
    private boolean glow = false;
    private boolean onlyIfSelected = false;
    private List<String> statusEffects = new ArrayList<>();

    public BasicOreItem(BasicOre block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (entityIn instanceof PlayerEntity) {
            setValues();
            if (!onlyIfSelected || isSelected) {
                for (String s : statusEffects) {
                    int id = Integer.parseInt(s.split(":")[0]);
                    int value = Integer.parseInt(s.split(":")[1]);
                    if (0 < id && id < 33) {
                        ((PlayerEntity) entityIn).addPotionEffect(new EffectInstance(Effect.get(id), 1, (value-1)));
                    } else if (id == 33) {
                        entityIn.setFire(1);
                    } else {
                        Main.LOGGER.warn("Invalid effect id '" + value + "' for '" + this.getRegistryName() + "' in dannys_ores-common.toml");
                    }
                }
            }
        }
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        setValues();
        return glow;
    }

    private void setValues() {
        if (this == BlockInit.STONE_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectStoneCopperOre.get();
            statusEffects = Copper.statusEffectsStoneCopperOre.get();
            onlyIfSelected = Copper.onlyInHandStoneCopperOre.get();
        } else {
            glow = false;
            onlyIfSelected = false;
            statusEffects.clear();
        }
    }
}
