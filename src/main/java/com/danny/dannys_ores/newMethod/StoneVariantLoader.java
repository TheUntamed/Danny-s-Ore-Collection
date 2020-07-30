package com.danny.dannys_ores.newMethod;

import com.danny.dannys_ores.Main;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;

public class StoneVariantLoader {

    public static void loadStoneVariants() {
        File dir = FMLPaths.CONFIGDIR.get().resolve("dannys_ores/variants/").toFile();
        if (!dir.exists() && dir.mkdirs()) {
            Main.LOGGER.info("Created /config/dannys_ores/variants/ directory");
        }

        File[] files = dir.listFiles((FileFilter) FileFilterUtils.suffixFileFilter(".json"));
        if (files == null)
            return;

        for (File file : files) {
            JsonObject json;
            FileReader reader = null;
            System.err.println("start loading variants!");
            try {
                JsonParser parser = new JsonParser();
                reader = new FileReader(file);
                json = parser.parse(reader).getAsJsonObject();
                String fileName = file.getName().replace(".json", "");
                StoneVariantCreator.create(fileName, json);
                System.err.println("loaded all variants!");
                reader.close();
            } catch (Exception e) {
                Main.LOGGER.error("An error occurred while reading file {}", file, e);
            } finally {
                IOUtils.closeQuietly(reader);
            }
        }
    }
}
