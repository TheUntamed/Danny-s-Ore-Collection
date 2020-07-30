package com.danny.dannys_ores.newMethod;

import com.danny.dannys_ores.Main;
import com.google.gson.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.*;

public class MaterialTypeLoader {

    public static void loadMaterialTypes() {
        File dir = FMLPaths.CONFIGDIR.get().resolve("dannys_ores/types/").toFile();
        if (!dir.exists() && dir.mkdirs()) {
            Main.LOGGER.info("Created /config/dannys_ores/types/ directory");
        }

        File[] files = dir.listFiles((FileFilter) FileFilterUtils.suffixFileFilter(".json"));
        if (files == null)
            return;

        for (File file : files) {
            JsonObject json;
            FileReader reader = null;
            ResourceLocation id = null;

            try {
                JsonParser parser = new JsonParser();
                reader = new FileReader(file);
                json = parser.parse(reader).getAsJsonObject();
                String fileName = file.getName().replace(".json", "");
                MaterialTypeCreator.create(fileName, json);
                System.err.println("loaded all types!");
                reader.close();
            } catch (Exception e) {
                Main.LOGGER.error("An error occurred while creating crop type with id {}", id, e);
            } finally {
                IOUtils.closeQuietly(reader);
            }
        }
    }
}
