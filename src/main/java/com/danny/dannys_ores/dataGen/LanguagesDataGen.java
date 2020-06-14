package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import com.danny.dannys_ores.util.StoneVariants;
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
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();
            if (block instanceof SimpleOre) {
                SimpleOre ore = (SimpleOre) block;
                StoneVariants variant = ore.getStoneVariant();
                RichnessTypes rType = ore.getRichnessType();
                OreTypes oType = ore.getOreType();
                String displayName = getOreDisplayName(variant, rType, oType);
                add(block, displayName);
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
        add("block.dannys_ores.hardened_stone", "Hardened Stone");
        add("block.dannys_ores.hardened_cobblestone", "Hardened Cobblestone");
        add("itemGroup.dannys_ores_tab", "Danny's Ores");
    }

    /**
     * Constructs the display name of an ore based on it's stone variant, richness type and ore type.
     *
     * @param variant The stone variant the ore is based on. E.g. 'sandstone', gravel', 'basalt', etc.
     * @param rType The richness type of the ore. Either 'dense', 'normal' or 'poor'.
     * @param oType The ore type of the ore. E.g. 'silver', 'emerald', etc.
     * @return The display name of the ore as string. E.g. 'Andesite Dense Gold Ore'.
     */
    private String getOreDisplayName(StoneVariants variant, RichnessTypes rType, OreTypes oType) {
        String[] oTypeParts = oType.getName().split("_");
        StringBuilder oTypeBuilder = new StringBuilder();
        for (String oTypePart : oTypeParts) {
            oTypeBuilder.append(oTypePart.substring(0, 1).toUpperCase()).append(oTypePart.substring(1)).append(" ");
        }
        String oTypeName = oTypeBuilder.toString();
        String[] variantNameSplit = variant.getBlockName().split("_");
        StringBuilder variantName = new StringBuilder();
        for (String part : variantNameSplit) {
            variantName.append(part.substring(0, 1).toUpperCase()).append(part.substring(1)).append(" ");
        }

        if (rType.equals(RichnessTypes.NORMAL)) {
            return variantName + oTypeName + "Ore";
        } else {
            String rTypeName = rType.getName().substring(0, 1).toUpperCase() + rType.getName().substring(1);
            return variantName + rTypeName + " " + oTypeName + "Ore";
        }
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Languages";
    }
}
