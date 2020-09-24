package com.danny.dannys_ores;

import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.configs.Config;
import com.danny.dannys_ores.events.ColorHandler;
import com.danny.dannys_ores.events.OreBreak;
import com.danny.dannys_ores.generation.GenerationHandler;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.init.BlockItemInit;
import com.danny.dannys_ores.init.ItemInit;
import com.danny.dannys_ores.init.Tags;
import com.danny.dannys_ores.newMethod.ModelHandler;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import com.danny.dannys_ores.util.StoneVariants;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.common.thread.EffectiveSide;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dannys_ores";
    public static Main instance;


    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new OreBreak());
        if (EffectiveSide.get() == LogicalSide.CLIENT) {
            modEventBus.register(new ColorHandler());
            modEventBus.register(new ModelHandler());
        }

//        addModListener<TextureStitchEvent.Pre> { SHItems.regTextures(it); }
//        addModListener<ModelRegistryEvent> { SHItems.regModels(); }
//        addModListener<ModelBakeEvent> { SHItems.regBakedModels(it); }

//        StoneVariantLoader.loadStoneVariants();
//        MaterialTypeLoader.loadMaterialTypes();

        ItemInit.GRAYSCALE_ITEMS.register(modEventBus);
        BlockInit.ORES.register(modEventBus);
        BlockInit.STONES.register(modEventBus);
        BlockInit.GRAYSCALE_BLOCKS.register(modEventBus);
//        BlockInit.NEW_BLOCKS.register(modEventBus);
        ItemInit.initItems();
        BlockInit.initOres();
        BlockInit.initBlocks();

        Config.loadConfigs();
    }

    private void setup(final FMLCommonSetupEvent event) {
        // MaterialTypeLoader.onCommonSetup();
    }

    /**
     * Registers the BlockItems for all blocks of this mod.
     *
     * @param event The event for item registry.
     */
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockItemInit.registerBlockItems(event);
    }

    /**
     * For the textures a background + overlay technique is used.
     * For it to work the render type of all blocks has to be set to translucent.
     *
     * @param event The event for client setup.
     */
    private void doClientStuff(final FMLClientSetupEvent event) {
        for (RegistryObject<Block> block : BlockInit.ORES.getEntries()) {
            RenderTypeLookup.setRenderLayer(block.get(), RenderType.getTranslucent());
        }
    }

    @SubscribeEvent
    public void beforeServerStart(final FMLServerAboutToStartEvent event) {
//        event.getServer().getResourceManager().addReloadListener(DynamicDataPack.getInstance());
    }

    @SubscribeEvent
    public void onClientSetupEvent(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @SubscribeEvent
    public void tagsLoaded(TagsUpdatedEvent event) {
        Tags.loadTags(event);
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        GenerationHandler.generateOre();
    }

    /**
     * Creates a custom item group (creative tab) for the blocks of this mod.
     */
    public static class MyItemGroupOres extends ItemGroup {
        public static final ItemGroup instance = new MyItemGroupOres(ItemGroup.GROUPS.length, "dannys_ores_ores");

        private MyItemGroupOres(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            for (RegistryObject<Block> blockRO : BlockInit.ORES.getEntries()) {
                Block block = blockRO.get();
                if (block instanceof SimpleOre) {
                    SimpleOre ore = (SimpleOre) block;
                    if (ore.getOreType().equals(OreTypes.GOLD) && ore.getStoneVariant().equals(StoneVariants.RED_SAND) && ore.getRichnessType().equals(RichnessTypes.NORMAL)) {
                        return new ItemStack(ore);
                    }
                }
            }
            return new ItemStack(Blocks.DIAMOND_ORE);
        }
    }

    public static class MyItemGroupItems extends ItemGroup {
        public static final ItemGroup instance = new MyItemGroupItems(ItemGroup.GROUPS.length, "dannys_ores_items");

        private MyItemGroupItems(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            //TODO: Change icon to item
            for (RegistryObject<Block> blockRO : BlockInit.ORES.getEntries()) {
                Block block = blockRO.get();
                if (block instanceof SimpleOre) {
                    SimpleOre ore = (SimpleOre) block;
                    if (ore.getOreType().equals(OreTypes.GOLD) && ore.getStoneVariant().equals(StoneVariants.RED_SAND) && ore.getRichnessType().equals(RichnessTypes.NORMAL)) {
                        return new ItemStack(ore);
                    }
                }
            }
            return new ItemStack(Items.DIAMOND);
        }
    }

    public static class MyItemGroupStones extends ItemGroup {
        public static final ItemGroup instance = new MyItemGroupStones(ItemGroup.GROUPS.length, "dannys_ores_stones");

        private MyItemGroupStones(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            //TODO: Change icon to item
            for (RegistryObject<Block> blockRO : BlockInit.STONES.getEntries()) {
                Block block = blockRO.get();
                if (block instanceof SimpleOre) {
                    SimpleOre ore = (SimpleOre) block;
                    if (ore.getOreType().equals(OreTypes.GOLD) && ore.getStoneVariant().equals(StoneVariants.RED_SAND) && ore.getRichnessType().equals(RichnessTypes.NORMAL)) {
                        return new ItemStack(ore);
                    }
                }
            }
            return new ItemStack(Items.DIAMOND);
        }
    }
}
