package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

public class LanguagesDataGen extends LanguageProvider {
    public LanguagesDataGen(DataGenerator gen, String fileName)
    {
        super(gen, Main.MOD_ID, fileName);
    }

    @Override
    protected void addTranslations() {
        Main.LOGGER.debug("addTranslations");
        for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
            ResourceLocation resLoc = block.get().getRegistryName();
            if (resLoc != null) {
                String blockName = block.get().getRegistryName().toString().split(":")[1];
                System.err.println("the blockName: " + blockName);
                if (blockName.contains("aluminum")) {
                    blockName.replace("aluminum", "bauxite");
                } else if (blockName.contains("electronite")) {
                    blockName.replace("electronite", "electrotine");
                }
                String[] parts = blockName.split("_");
                StringBuilder displayName = new StringBuilder();
                for (String s : parts) {
                    s = s.substring(0, 1).toUpperCase() + s.substring(1);
                    displayName.append(s).append(" ");
                }
                add(block.get(), displayName.toString().trim());
            }
        }
        add("block.minecraft.coal_ore", "Stone Coal Ore");
        add("block.minecraft.iron_ore", "Stone Iron Ore");
        add("block.minecraft.gold_ore", "Stone Gold Ore");
        add("block.minecraft.diamond_ore", "Stone Diamond Ore");
        add("block.minecraft.emerald_ore", "Stone Emerald Ore");
        add("block.minecraft.lapis_ore", "Stone Lapis Ore");
        add("block.minecraft.redstone_ore", "Stone Redstone Ore");
        add("block.minecraft.nether_quartz_ore", "Netherrack Quartz Ore");
        add("itemGroup.dannys_ores_tab", "Danny's Ores");
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Languages";
    }
}
