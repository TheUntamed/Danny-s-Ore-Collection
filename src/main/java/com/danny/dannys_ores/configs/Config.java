package com.danny.dannys_ores.configs;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Config {
    private static Path myConfigPath;
    private static Path configPathNormalOres;
    private static Path configPathDenseOres;
    private static Path configPathPoorOres;
    private static HashMap<OreTypes, ForgeConfigSpec> normalConfigs = new HashMap<>();
    private static HashMap<OreTypes, ForgeConfigSpec> poorConfigs = new HashMap<>();
    private static HashMap<OreTypes, ForgeConfigSpec> denseConfigs = new HashMap<>();
    public static HashMap<RichnessTypes, HashMap<OreTypes, ForgeConfigSpec>> allConfigs = new HashMap<>();

    /**
     * Main method to creates all config folders and files.
     */
    public static void loadConfigs() {
        createDirectories();

        String generalPath = myConfigPath.toString();
        String normalPath = configPathNormalOres.toString();
        String densePath = configPathDenseOres.toString();
        String poorPath = configPathPoorOres.toString();

        GeneralConfig.loadConfig(generalPath);
        StonesConfig.loadConfig(generalPath);

        for (RichnessTypes rType : RichnessTypes.values()) {
            for (OreTypes oType : OreTypes.values()) {
                OresConfig oresConfig = new OresConfig();
                ForgeConfigSpec oreSpec;
                if (rType.equals(RichnessTypes.NORMAL)) {
                    oreSpec = oresConfig.create(normalPath, oType, rType);
                    normalConfigs.put(oType, oreSpec);
                } else if (rType.equals(RichnessTypes.POOR)) {
                    if(oType.isHasRichnessLevels()) {
                        oreSpec = oresConfig.create(poorPath, oType, rType);
                        poorConfigs.put(oType, oreSpec);
                    }
                } else if (rType.equals(RichnessTypes.DENSE)) {
                    if(oType.isHasRichnessLevels()) {
                        oreSpec = oresConfig.create(densePath, oType, rType);
                        denseConfigs.put(oType, oreSpec);
                    }
                } else {
                    throw new IllegalArgumentException("Richness Type '" + rType + "' cannot be handled in config creation!");
                }
            }
        }
        allConfigs.put(RichnessTypes.NORMAL, normalConfigs);
        allConfigs.put(RichnessTypes.POOR, poorConfigs);
        allConfigs.put(RichnessTypes.DENSE, denseConfigs);
    }

    /**
     * Creates all config folders.
     */
    private static void createDirectories() {
        Path configPath = FMLPaths.CONFIGDIR.get();
        myConfigPath = Paths.get(configPath.toAbsolutePath().toString(), Main.MOD_ID);
        try {
            Files.createDirectory(myConfigPath);
        } catch (FileAlreadyExistsException e) {
        } catch (IOException e) {
            Main.LOGGER.error("Failed to create config directory '" + myConfigPath + "' for Danny's Ores mod.", e);
        }

        Path configPathOres = Paths.get(myConfigPath.toString(), "/ores");
        try {
            Files.createDirectory(configPathOres);
        } catch (FileAlreadyExistsException e) {
        } catch (IOException e) {
            Main.LOGGER.error("Failed to create config directory '" + configPathOres + "' for Danny's Ores mod.", e);
        }

        configPathNormalOres = Paths.get(configPathOres.toString(), "/normal");
        try {
            Files.createDirectory(configPathNormalOres);
        } catch (FileAlreadyExistsException e) {
        } catch (IOException e) {
            Main.LOGGER.error("Failed to create config directory '" + configPathNormalOres + "' for Danny's Ores mod.", e);
        }

        configPathDenseOres = Paths.get(configPathOres.toString(), "/dense");
        try {
            Files.createDirectory(configPathDenseOres);
        } catch (FileAlreadyExistsException e) {
        } catch (IOException e) {
            Main.LOGGER.error("Failed to create config directory '" + configPathDenseOres + "' for Danny's Ores mod.", e);
        }

        configPathPoorOres = Paths.get(configPathOres.toString(), "/poor");
        try {
            Files.createDirectory(configPathPoorOres);
        } catch (FileAlreadyExistsException e) {
        } catch (IOException e) {
            Main.LOGGER.error("Failed to create config directory '" + configPathPoorOres + "' for Danny's Ores mod.", e);
        }
    }
}
