package com.danny.dannys_ores;

import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.generation.OreGen;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dannys_ores";
    public static Main instance;
    public static boolean quark;
    public static boolean  embellishcraft;

    public Main() {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        quark = ModList.get().isLoaded("quark");
        embellishcraft = ModList.get().isLoaded("embellishcraft");
        BlockInit.BLOCKS.register(modEventBus);
        General.loadConfig();
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(Main.TAB);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems!");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
//        for(Block block : ) {
//            RenderTypeLookup.setRenderLayer(block, RenderType.translucent);
//        }
    }

    public static final ItemGroup TAB = new ItemGroup("dannys_ores_tab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.BEDROCK);
        }
    };

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        OreGen.generateOre();
    }
}
