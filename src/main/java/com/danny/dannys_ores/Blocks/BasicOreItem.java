package com.danny.dannys_ores.Blocks;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.Copper;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
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
                    } else if (id == 33 && !entityIn.isInvulnerableTo(DamageSource.ON_FIRE)) {
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
        } else if (this == BlockInit.ANDESITE_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectAndesiteCopperOre.get();
            statusEffects = Copper.statusEffectsAndesiteCopperOre.get();
            onlyIfSelected = Copper.onlyInHandAndesiteCopperOre.get();
        } else if (this == BlockInit.DIORITE_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectDioriteCopperOre.get();
            statusEffects = Copper.statusEffectsDioriteCopperOre.get();
            onlyIfSelected = Copper.onlyInHandDioriteCopperOre.get();
        } else if (this == BlockInit.GRANITE_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectGraniteCopperOre.get();
            statusEffects = Copper.statusEffectsGraniteCopperOre.get();
            onlyIfSelected = Copper.onlyInHandGraniteCopperOre.get();
        } else if (this == BlockInit.NETHERRACK_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectNetherrackCopperOre.get();
            statusEffects = Copper.statusEffectsNetherrackCopperOre.get();
            onlyIfSelected = Copper.onlyInHandNetherrackCopperOre.get();
        } else if (this == BlockInit.END_STONE_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectEndStoneCopperOre.get();
            statusEffects = Copper.statusEffectsEndStoneCopperOre.get();
            onlyIfSelected = Copper.onlyInHandEndStoneCopperOre.get();
        } else if (this == BlockInit.SAND_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectSandCopperOre.get();
            statusEffects = Copper.statusEffectsSandCopperOre.get();
            onlyIfSelected = Copper.onlyInHandSandCopperOre.get();
        } else if (this == BlockInit.GRAVEL_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectGravelCopperOre.get();
            statusEffects = Copper.statusEffectsGravelCopperOre.get();
            onlyIfSelected = Copper.onlyInHandGravelCopperOre.get();
        } else if (this == BlockInit.SANDSTONE_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectSandstoneCopperOre.get();
            statusEffects = Copper.statusEffectsSandstoneCopperOre.get();
            onlyIfSelected = Copper.onlyInHandSandstoneCopperOre.get();
        } else if (this == BlockInit.RED_SANDSTONE_COPPER_ORE.asItem()) {
            glow = Copper.hasGlowEffectRedSandstoneCopperOre.get();
            statusEffects = Copper.statusEffectsRedSandstoneCopperOre.get();
            onlyIfSelected = Copper.onlyInHandRedSandstoneCopperOre.get();
        } else {
            glow = false;
            onlyIfSelected = false;
            statusEffects.clear();
        }
    }
}
