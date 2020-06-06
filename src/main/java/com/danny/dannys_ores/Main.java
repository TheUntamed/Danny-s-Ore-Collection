package com.danny.dannys_ores;

import com.danny.dannys_ores.blockItems.*;
import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.configs.General;
import com.danny.dannys_ores.generation.GenerationHandler;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
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
    public static boolean embellishcraft;


    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        quark = ModList.get().isLoaded("quark");
        embellishcraft = ModList.get().isLoaded("embellishcraft");

        BlockInit.BLOCKS.register(modEventBus);
        BlockInit.initOres();

        General.loadConfig();

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    /**
     * Registers the BlockItems for all blocks of this mod.
     *
     * @param event The event for item registry.
     */
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(MyItemGroup.instance);
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                if (block instanceof BaseOre) {
                    BaseOre oreBlock = (BaseOre) block;
                    OreTypes oType = oreBlock.getOreType();
                    if (oType.equals(OreTypes.VULCANITE) || oType.equals(OreTypes.FIRE)) {
                        final HotBlockItem blockItem = new HotBlockItem(block, properties);
                        blockItem.setRegistryName(resLoc);
                        registry.register(blockItem);
                    } else if (oType.equals(OreTypes.URANINITE)) {
                        final ToxicBlockItem blockItem = new ToxicBlockItem(block, properties);
                        blockItem.setRegistryName(resLoc);
                        registry.register(blockItem);
                    } else if (oType.equals(OreTypes.YELLORITE)) {
                        final ToxicBlockItem blockItem = new ToxicBlockItem(block, properties);
                        blockItem.setRegistryName(resLoc);
                        registry.register(blockItem);
                    } else if (oType.equals(OreTypes.AIR)) {
                        final LightBlockItem blockItem = new LightBlockItem(block, properties);
                        blockItem.setRegistryName(resLoc);
                        registry.register(blockItem);
                    } else if (oType.equals(OreTypes.EARTH)) {
                        final HeavyBlockItem blockItem = new HeavyBlockItem(block, properties);
                        blockItem.setRegistryName(resLoc);
                        registry.register(blockItem);
                    } else if (oType.equals(OreTypes.WATER)) {
                        final DrowningBlockItem blockItem = new DrowningBlockItem(block, properties);
                        blockItem.setRegistryName(resLoc);
                        registry.register(blockItem);
                    } else {
                        final BlockItem blockItem = new BlockItem(block, properties);
                        blockItem.setRegistryName(resLoc);
                        registry.register(blockItem);
                    }
                } else {
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(resLoc);
                    registry.register(blockItem);
                }
            } else {
                throw new NullPointerException("block '" + block + "' has no registry name!");
            }
        });

        LOGGER.debug("Registered BlockItems!");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
            RenderTypeLookup.setRenderLayer(block.get(), RenderType.getTranslucent());
        }
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
            return new ItemStack(Blocks.DIAMOND_ORE);
        }
    }
}
