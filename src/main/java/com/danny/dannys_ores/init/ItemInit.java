package com.danny.dannys_ores.init;

import com.danny.dannys_ores.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.DeferredRegister;

//@ObjectHolder(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemInit {

   // public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
    //public static final Item example_item = null;

    //public static final RegistryObject<Item> DEF_ITEM = ITEMS.register("def_item", () -> new Item(new Item.Properties().group(Main.TAB)));

//    @SubscribeEvent
//    public static void registerItems(final RegistryEvent.Register<Item> event) {
//        //event.getRegistry().register(new Item(new Item.Properties().group(Main.TAB)).setRegistryName("example_item"));
//    }


}
