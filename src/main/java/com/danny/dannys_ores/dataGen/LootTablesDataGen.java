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
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                if (blockName.contains("packed_ice") || blockName.contains("blue_ice") || (blockName.contains("_xp_ore") && !blockName.contains("bedrock"))) {
                        lootTables.put(block, justSilktouchTable(blockName, block));
                } else {

                    if (blockName.contains("_coal_ore")) {
                        lootTables.put(block, gemsTable(blockName, block, Items.COAL));
                    } else if (blockName.contains("_emerald_ore")) {
                        lootTables.put(block, gemsTable(blockName, block, Items.EMERALD));
                    } else if (blockName.contains("_diamond_ore")) {
                        lootTables.put(block, gemsTable(blockName, block, Items.DIAMOND));
                    } else if (blockName.contains("_quartz_ore")) {
                        lootTables.put(block, gemsTable(blockName, block, Items.QUARTZ));
                    } else if (blockName.contains("_lapis_ore")) {
                        lootTables.put(block, gemsTable(blockName, block, Items.LAPIS_LAZULI));
                    } else if (blockName.contains("_redstone_ore")) {
                        lootTables.put(block, gemsTable(blockName, block, Items.REDSTONE));
                    } else if (blockName.contains("_sticky_ore")) {
                        lootTables.put(block, gemsTable(blockName, block, Items.SLIME_BALL));
                    } else if (blockName.contains("_lucky_ore")) {
                        // Do Nothing. Table created manually.
                    } else {
                        lootTables.put(block, basicOreTable(block));
                    }
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Danny's Ores - Loottables";
    }
}
