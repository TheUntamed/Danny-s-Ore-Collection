package com.danny.dannys_ores.events;

import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.util.StoneVariants;
import net.minecraft.block.Block;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class OreBreak {

    @SubscribeEvent
    public void registerEvent(PlayerEvent.BreakSpeed event) {
        Block block = event.getState().getBlock();
        if (block instanceof SimpleOre) {
            SimpleOre ore = (SimpleOre) block;
            if (ore.getStoneVariant().equals(StoneVariants.SAND)) {
                if (!event.getPlayer().getHeldItemMainhand().getToolTypes().contains(ToolType.SHOVEL)) {
                    event.setCanceled(true);
                }
            }
        }
    }
}
