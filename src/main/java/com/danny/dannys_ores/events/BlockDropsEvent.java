//package com.danny.dannys_ores.events;
//
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.Hand;
//import net.minecraftforge.event.world.BlockEvent;
//
//public class BlockDropsEvent {
//
//    public final BlockEvent.HarvestDropsEvent event;
//
//    public BlockDropsEvent(BlockEvent.HarvestDropsEvent e) {
//        event = e;
//    }
//
//    public void addDrop() {
//        event.getHarvester().getHeldItem(Hand.MAIN_HAND);
//        event.getDrops().add(new ItemStack(event.getState().getBlock()));
//    }
//}
