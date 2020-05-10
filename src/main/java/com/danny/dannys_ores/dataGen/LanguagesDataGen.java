package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguagesDataGen extends LanguageProvider {
    public LanguagesDataGen(DataGenerator gen, String fileName)
    {
        super(gen, Main.MOD_ID, fileName);
    }

    @Override
    protected void addTranslations()
    {
        add("itemGroup.dannys_ores_tab", "Danny's Ores");
        add("block.dannys_ores.hardened_stone", "Hardened Stone");
        add(BlockInit.ANDESITE_ADAMANTIUM_ORE.get(), "Test");
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Languages";
    }
}
