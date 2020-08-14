package com.danny.dannys_ores;

import com.danny.dannys_ores.blockItems.*;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.configs.Config;
import com.danny.dannys_ores.events.OreBreak;
import com.danny.dannys_ores.generation.GenerationHandler;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.init.Tags;
import com.danny.dannys_ores.newMethod.ColorHandler;
import com.danny.dannys_ores.newMethod.MaterialTypeLoader;
import com.danny.dannys_ores.newMethod.ModelHandler;
import com.danny.dannys_ores.newMethod.StoneVariantLoader;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import com.danny.dannys_ores.util.StoneVariants;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
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

import java.util.Objects;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dannys_ores";
    public static Main instance;
    private static Tag<Block> testBlockTag;
    private static Tag<Item> testItemTag;


    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new OreBreak());

        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            modEventBus.register(new ColorHandler());
            modEventBus.register(new ModelHandler());
        });

//        addModListener<TextureStitchEvent.Pre> { SHItems.regTextures(it); }
//        addModListener<ModelRegistryEvent> { SHItems.regModels(); }
//        addModListener<ModelBakeEvent> { SHItems.regBakedModels(it); }

        StoneVariantLoader.loadStoneVariants();
        MaterialTypeLoader.loadMaterialTypes();
        BlockInit.BLOCKS.register(modEventBus);
        BlockInit.NEW_BLOCKS.register(modEventBus);
        BlockInit.initOres();

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
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(MyItemGroup.instance);
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                if (block instanceof SimpleOre) {
                    SimpleOre oreBlock = (SimpleOre) block;
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

        BlockInit.NEW_BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(MyItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }

    /**
     * For the textures a background + overlay technique is used.
     * For it to work the render type of all blocks has to be set to translucent.
     *
     * @param event The event for client setup.
     */
    private void doClientStuff(final FMLClientSetupEvent event) {
        for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
            RenderTypeLookup.setRenderLayer(block.get(), RenderType.getTranslucent());
        }
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

    private static void setTag() {
        if(testBlockTag != null) {
            for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
                Block block = blockRO.get();
                testBlockTag.getAllElements().add(block);
                testBlockTag.getEntries().add(new Tag.TagEntry<Block>(Objects.requireNonNull(block.getRegistryName())));
            }
		}
        if(testItemTag != null) {
            for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
                Block block = blockRO.get();
                testItemTag.getAllElements().add(block.asItem());
                testItemTag.getEntries().add(new Tag.TagEntry<Item>(Objects.requireNonNull(block.getRegistryName())));
            }
        }
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
            for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
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
}
