package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;

public class LootTablesDataGen extends LootTablesBaseProvider {

    public LootTablesDataGen(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void addTables() {
        for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
            ResourceLocation resLoc = block.get().getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
//                if (blockName.contains("bedrock")) {
//                    if (blockName.contains("_coal_ore") || blockName.contains("_lapis_ore") || blockName.contains("_redstone_ore") || blockName.contains("_quartz_ore") || blockName.contains("_diamond_ore") || blockName.contains("_emerald_ore")) {
//
//                    } else {
//                        //lootTables.put(block.get(), bedrockTable(blockName, block.get()));
//                    }
                if (blockName.contains("packed_ice") || blockName.contains("blue_ice") || (blockName.contains("_xp_ore") && !blockName.contains("bedrock"))) {
                        lootTables.put(block.get(), justSilktouchTable(blockName, block.get()));
                } else {
                    if (blockName.contains("_coal_ore")) {
                        lootTables.put(block.get(), gemsTable(blockName, block.get(), Items.COAL));
                    } else if (blockName.contains("_emerald_ore")) {
                        lootTables.put(block.get(), gemsTable(blockName, block.get(), Items.EMERALD));
                    } else if (blockName.contains("_diamond_ore")) {
                        lootTables.put(block.get(), gemsTable(blockName, block.get(), Items.DIAMOND));
                    } else if (blockName.contains("_quartz_ore")) {
                        lootTables.put(block.get(), gemsTable(blockName, block.get(), Items.QUARTZ));
                    } else if (blockName.contains("_lapis_ore")) {
                        lootTables.put(block.get(), gemsTable(blockName, block.get(), Items.LAPIS_LAZULI));
                    } else if (blockName.contains("_redstone_ore")) {
                        lootTables.put(block.get(), gemsTable(blockName, block.get(), Items.REDSTONE));
                    } else if (blockName.contains("_lucky_ore")) {
                        // Do Nothing. Table created manually.
                    } else {
                        lootTables.put(block.get(), basicOreTable(block.get()));
                    }
                }
            }
        }
        //lootTables.put(BlockInit.ANDESITE_COPPER_ORE.get(), basicOreTable("andesite_copper_ore", BlockInit.ANDESITE_COPPER_ORE.get()));
    }

    @Override
    public String getName() {
        return "Danny's Ores - Loottables";
    }
}
