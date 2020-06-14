package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * This class is an EventBusSubscriber and calls the classes for all the different data gen types.
 *
 * The different data gen classes iterate over the BLOCKS registry object
 * which only contains ores based on stone variants of installed mods.
 * This means for other ores no data will be generated except the mod check if statements in {@link BlockInit} is deactivated.
 * TODO: Find a dynamic way to deactivate the mod check if statements.
 *
 * Credits to Affehund for his easy to understand explanations and examples about Data Generation.
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            Main.LOGGER.debug("Starting server side data generators");
            generator.addProvider(new RecipesDataGen(generator));
            generator.addProvider(new LootTablesDataGen(generator));
            generator.addProvider(new BlockTagsDataGen(generator));
            generator.addProvider(new ItemTagsDataGen(generator));
        }
        if (event.includeClient()) {
            Main.LOGGER.debug("Starting client side data generators");
            generator.addProvider(new BlockStatesDataGen(generator, Main.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new BlockModelsDataGen(generator, Main.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new ItemModelsDataGen(generator, Main.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new LanguagesDataGen(generator, "en_us"));
        }
    }
}
