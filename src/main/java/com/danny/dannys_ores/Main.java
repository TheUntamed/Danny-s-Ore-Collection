package com.danny.dannys_ores;

import com.danny.dannys_ores.blocks.ResonatingBlockItem;
import com.danny.dannys_ores.configs.ores.vanilla.Coal;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.generation.GenerationHandler;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.init.BlockInitVanilla;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
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
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dannys_ores";
    public static Main instance;

    // True if the mod 'Quark' by Vazkii is in the mod list.
    public static boolean quark;

    // True if the mod 'Embellishcraft' by Mapper is in the mod list.
    public static boolean  embellishcraft;


    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        quark = ModList.get().isLoaded("quark");
        embellishcraft = ModList.get().isLoaded("embellishcraft");
        BlockInit.BLOCKS.register(modEventBus);
        General.loadConfig();

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);

        UnmodifiableConfig s = Coal.spec.getValues();
        System.err.println("Unmodifiable Configs!: " + s);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    /**
     * Registers the BlockItems for all blocks of this mod.
     * @param event The event for item registry.
     */
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().filter(block -> !(exclude(block.get()))).map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(MyItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        BlockInit.BLOCKS.getEntries().stream().filter(block -> (exclude(block.get()))).map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(MyItemGroup.instance);
            final ResonatingBlockItem blockItem = new ResonatingBlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems!");
    }

    /**
     * ItemBlocks with a custom class have to be registered separately.
     * This method will be called by the filter.
     *
     * @param block The block.
     * @return True, if the block should be excluded from the general BlockItems registration.
     */
    private static boolean exclude(Block block) {
        ResourceLocation resLoc = block.getRegistryName();
        if (resLoc != null) {
            String regName = resLoc.toString();
            if (regName.contains("_resonating_")) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new NullPointerException("");
        }
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        GenerationHandler.generateOre();
    }

    /**
     * Creates a custom item group (creative tab) for the blocks of this mod.
     */
    public static class MyItemGroup extends ItemGroup {
        public static final ItemGroup instance = new MyItemGroup(ItemGroup.GROUPS.length, "dannys_ores_tab");

        private MyItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInitVanilla.HARDENED_STONE_DIAMOND_ORE.get());
        }
    }
}
