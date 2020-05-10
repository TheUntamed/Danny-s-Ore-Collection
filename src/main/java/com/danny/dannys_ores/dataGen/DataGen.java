package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/*
Credits to Affehund for his easy to understand explanations and examples about Data Generation.
 */
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
            generator.addProvider(new ItemModelsDataGen(generator, Main.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new LanguagesDataGen(generator, "en_us"));
        }
    }
}