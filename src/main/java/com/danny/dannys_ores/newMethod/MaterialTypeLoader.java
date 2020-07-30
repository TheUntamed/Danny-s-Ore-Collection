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
import java.util.HashMap;
import java.util.Map;

public class MaterialTypeLoader {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    public static final Map<MaterialType, ResourceLocation> MATERIAL_TYPE_MAP = new HashMap<>();

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
                String regName = file.getName().replace(".json", "");
                MaterialTypeCreator.create(regName, json);
                System.err.println("loaded all!");
                reader.close();
            } catch (Exception e) {
                Main.LOGGER.error("An error occurred while creating crop type with id {}", id, e);
            } finally {
                IOUtils.closeQuietly(reader);
            }
        }
    }

//    public static void onPostRegisterCrops() {
//        File dir = FMLPaths.CONFIGDIR.get().resolve("dannys_ores/").toFile();
//        if (!dir.exists() && dir.mkdirs()) {
//            Main.LOGGER.info("Created /config/dannys_ores/ directory");
//        }
//
//        File file = FMLPaths.CONFIGDIR.get().resolve("dannys_ores/configure-types.json").toFile();
//        if (file.exists() && file.isFile()) {
//            JsonObject json;
//            FileReader reader = null;
//            try {
//                JsonParser parser = new JsonParser();
//                reader = new FileReader(file);
//                json = parser.parse(reader).getAsJsonObject();
//
//                json.entrySet().forEach(entry -> {
//                    String name = entry.getKey();
//                    JsonObject changes = entry.getValue().getAsJsonObject();
//                    MaterialType type = MysticalAgricultureAPI.getCropTypeByName(name);
//
//                    CropTypeModifier.modify(type, changes);
//                });
//
//                reader.close();
//            } catch (Exception e) {
//                Main.LOGGER.error("An error occurred while reading configure-types.json", e);
//            } finally {
//                IOUtils.closeQuietly(reader);
//            }
//        } else {
//            try (Writer writer = new FileWriter(file)) {
//                JsonObject object = new JsonObject();
//                GSON.toJson(object, writer);
//            } catch (IOException e) {
//                Main.LOGGER.error("An error occurred while creating configure-types.json", e);
//            }
//        }
//    }

//    public static void onCommonSetup() {
//        MATERIAL_TYPE_MAP.forEach((type, item) -> {
//            Item craftingSeed = ForgeRegistries.ITEMS.getValue(item);
//            if (craftingSeed != Items.AIR) {
//                type.setCraftingSeed(() -> craftingSeed);
//            } else {
//                throw new JsonSyntaxException("Invalid crafting seed item provided");
//            }
//        });
//    }
}
