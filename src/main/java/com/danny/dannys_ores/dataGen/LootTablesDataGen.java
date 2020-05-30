package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.init.BlockInit;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
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

    /**
     * Calls for each block of this mod a method to create the loottable for that block.
     * Lucky Ores have a complex loottable and I decided to create it manually. Those tables are not generated here.
     */
    @Override
    protected void addTables() {
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                if (block instanceof BaseOre) {
                    BaseOre oreBlock = ((BaseOre) block);
                    OreTypes oType = oreBlock.getOreType();
                    RichnessTypes rType = oreBlock.getRichnessType();
                    boolean justSilk = blockName.contains("packed_ice") || blockName.contains("blue_ice") || (oType.equals(OreTypes.XP) && !blockName.contains("bedrock"));
                    if (rType.equals(RichnessTypes.NORMAL)) {
                        if (justSilk) {
                            lootTables.put(block, justSilktouchTable(block));
                        } else {
                            if (oType.equals(OreTypes.COAL)) {
                                lootTables.put(block, gemsTable(oType, block, Items.COAL));
                            } else if (oType.equals(OreTypes.EMERALD)) {
                                lootTables.put(block, gemsTable(oType, block, Items.EMERALD));
                            } else if (oType.equals(OreTypes.DIAMOND)) {
                                lootTables.put(block, gemsTable(oType, block, Items.DIAMOND));
                            } else if (oType.equals(OreTypes.QUARTZ)) {
                                lootTables.put(block, gemsTable(oType, block, Items.QUARTZ));
                            } else if (oType.equals(OreTypes.LAPIS)) {
                                lootTables.put(block, gemsTable(oType, block, Items.LAPIS_LAZULI));
                            } else if (oType.equals(OreTypes.REDSTONE)) {
                                lootTables.put(block, gemsTable(oType, block, Items.REDSTONE));
                            } else if (oType.equals(OreTypes.STICKY)) {
                                lootTables.put(block, gemsTable(oType, block, Items.SLIME_BALL));
                            } else if (oType.equals(OreTypes.LUCKY)) {
                                // Do Nothing. Table created manually.
                            } else {
                                lootTables.put(block, basicBlockTable(block));
                            }
                        }
                    } else if (rType.equals(RichnessTypes.DENSE)) {
                        if (justSilk) {
                            lootTables.put(block, justSilktouchTable(block));
                        } else {
                            if (oType.equals(OreTypes.COAL)) {
                                // lootTables.put(block, denseGemsTable(oType, block, Items.COAL));
                            } else if (oType.equals(OreTypes.EMERALD)) {
                                // lootTables.put(block, denseGemsTable(oType, block, Items.EMERALD));
                            } else if (oType.equals(OreTypes.DIAMOND)) {
                                // lootTables.put(block, denseGemsTable(oType, block, Items.DIAMOND));
                            } else if (oType.equals(OreTypes.QUARTZ)) {
                                // lootTables.put(block, denseGemsTable(oType, block, Items.QUARTZ));
                            } else if (oType.equals(OreTypes.LAPIS)) {
                                lootTables.put(block, denseGemsTable(oType, block, Items.LAPIS_LAZULI));
                            } else if (oType.equals(OreTypes.REDSTONE)) {
                                lootTables.put(block, denseGemsTable(oType, block, Items.REDSTONE));
                            } else if (oType.equals(OreTypes.STICKY)) {
                                // lootTables.put(block, denseGemsTable(oType, block, Items.SLIME_BALL));
                            } else if (oType.equals(OreTypes.LUCKY)) {
                                // Do Nothing. Table created manually.
                            } else {
                                lootTables.put(block, basicBlockTable(block));
                            }
                        }
                    } else if (rType.equals(RichnessTypes.POOR)) {
                        if (justSilk) {
                            lootTables.put(block, justSilktouchTable(block));
                        } else {
                            if (oType.equals(OreTypes.COAL)) {
                                // lootTables.put(block, poorGemsTable(oType, block, Items.COAL));
                            } else if (oType.equals(OreTypes.EMERALD)) {
                                // ootTables.put(block, poorGemsTable(oType, block, Items.EMERALD));
                            } else if (oType.equals(OreTypes.DIAMOND)) {
                                // lootTables.put(block, poorGemsTable(oType, block, Items.DIAMOND));
                            } else if (oType.equals(OreTypes.QUARTZ)) {
                                // lootTables.put(block, poorGemsTable(oType, block, Items.QUARTZ));
                            } else if (oType.equals(OreTypes.LAPIS)) {
                                lootTables.put(block, poorGemsTable(oType, block, Items.LAPIS_LAZULI));
                            } else if (oType.equals(OreTypes.REDSTONE)) {
                                lootTables.put(block, poorGemsTable(oType, block, Items.REDSTONE));
                            } else if (oType.equals(OreTypes.STICKY)) {
                                // lootTables.put(block, poorGemsTable(oType, block, Items.SLIME_BALL));
                            } else if (oType.equals(OreTypes.LUCKY)) {
                                // Do Nothing. Table created manually.
                            } else {
                                lootTables.put(block, basicBlockTable(block));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("For " + rType + " no loottable creation exists");
                    }

//                    //TODO: Only loottables for coal, diamond, emerald, quartz and sticky ores cannot be auto generated yet.
//                    // The others have to be created first before the code below can be used.
//                    if (rType.equals(RichnessTypes.DENSE)) {
//                        if (justSilk) {
//                            lootTables.put(block, justSilktouchTable(block));
//                        } else {
//                            if (oType.equals(OreTypes.COAL)) {
//                                lootTables.put(block, denseGemsTable(oType, block, Items.COAL));
//                            } else if (oType.equals(OreTypes.EMERALD)) {
//                                lootTables.put(block, denseGemsTable(oType, block, Items.EMERALD));
//                            } else if (oType.equals(OreTypes.DIAMOND)) {
//                                lootTables.put(block, denseGemsTable(oType, block, Items.DIAMOND));
//                            } else if (oType.equals(OreTypes.QUARTZ)) {
//                                lootTables.put(block, denseGemsTable(oType, block, Items.QUARTZ));
//                            } else if (oType.equals(OreTypes.LAPIS)) {
//                                lootTables.put(block, denseGemsTable(oType, block, Items.LAPIS_LAZULI));
//                            } else if (oType.equals(OreTypes.REDSTONE)) {
//                                lootTables.put(block, denseGemsTable(oType, block, Items.REDSTONE));
//                            } else if (oType.equals(OreTypes.STICKY)) {
//                                lootTables.put(block, denseGemsTable(oType, block, Items.SLIME_BALL));
//                            } else if (oType.equals(OreTypes.LUCKY)) {
//                                // Do Nothing. Table created manually.
//                            } else {
//                                lootTables.put(block, basicBlockTable(block));
//                            }
//                        }
//                    } else if (rType.equals(RichnessTypes.POOR)) {
//                        if (justSilk) {
//                            lootTables.put(block, justSilktouchTable(block));
//                        } else {
//                            if (oType.equals(OreTypes.COAL)) {
//                                lootTables.put(block, poorGemsTable(oType, block, Items.COAL));
//                            } else if (oType.equals(OreTypes.EMERALD)) {
//                                lootTables.put(block, poorGemsTable(oType, block, Items.EMERALD));
//                            } else if (oType.equals(OreTypes.DIAMOND)) {
//                                lootTables.put(block, poorGemsTable(oType, block, Items.DIAMOND));
//                            } else if (oType.equals(OreTypes.QUARTZ)) {
//                                lootTables.put(block, poorGemsTable(oType, block, Items.QUARTZ));
//                            } else if (oType.equals(OreTypes.LAPIS)) {
//                                lootTables.put(block, poorGemsTable(oType, block, Items.LAPIS_LAZULI));
//                            } else if (oType.equals(OreTypes.REDSTONE)) {
//                                lootTables.put(block, poorGemsTable(oType, block, Items.REDSTONE));
//                            } else if (oType.equals(OreTypes.STICKY)) {
//                                lootTables.put(block, poorGemsTable(oType, block, Items.SLIME_BALL));
//                            } else if (oType.equals(OreTypes.LUCKY)) {
//                                // Do Nothing. Table created manually.
//                            } else {
//                                lootTables.put(block, basicBlockTable(block));
//                            }
//                        }
//                    } else {
//                        if (justSilk) {
//                            lootTables.put(block, justSilktouchTable(block));
//                        } else {
//                            if (oType.equals(OreTypes.COAL)) {
//                                lootTables.put(block, gemsTable(oType, block, Items.COAL));
//                            } else if (oType.equals(OreTypes.EMERALD)) {
//                                lootTables.put(block, gemsTable(oType, block, Items.EMERALD));
//                            } else if (oType.equals(OreTypes.DIAMOND)) {
//                                lootTables.put(block, gemsTable(oType, block, Items.DIAMOND));
//                            } else if (oType.equals(OreTypes.QUARTZ)) {
//                                lootTables.put(block, gemsTable(oType, block, Items.QUARTZ));
//                            } else if (oType.equals(OreTypes.LAPIS)) {
//                                lootTables.put(block, gemsTable(oType, block, Items.LAPIS_LAZULI));
//                            } else if (oType.equals(OreTypes.REDSTONE)) {
//                                lootTables.put(block, gemsTable(oType, block, Items.REDSTONE));
//                            } else if (oType.equals(OreTypes.STICKY)) {
//                                lootTables.put(block, gemsTable(oType, block, Items.SLIME_BALL));
//                            } else if (oType.equals(OreTypes.LUCKY)) {
//                                // Do Nothing. Table created manually.
//                            } else {
//                                lootTables.put(block, basicBlockTable(block));
//                            }
//                        }
//                    }
                } else {
                    lootTables.put(block, basicBlockTable(block));
                }
            } else {
                throw new NullPointerException("Block '" + block + "' has no registry name!");
            }
        }
    }

    @Override
    public String getName() {
        return "Danny's Ores - Loottables";
    }
}
