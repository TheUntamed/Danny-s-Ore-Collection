package com.danny.dannys_ores.init;

import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.util.ModHandler;
import com.danny.dannys_ores.util.OreTypes;
import com.danny.dannys_ores.util.RichnessTypes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.fml.RegistryObject;

import java.util.HashMap;
import java.util.Objects;

public class Tags {
    private static HashMap<String, Tag<Block>> blockTags = new HashMap<>();
    private static HashMap<String, Tag<Item>> itemTags = new HashMap<>();
    private static Tag<Block> oresBlockTag;
    private static Tag<Item> oresItemTag;
    private static Tag<Block> wg_stone;
    private static HashMap<String, String> secondaryTags  = new HashMap<>();

    public static void loadTags(TagsUpdatedEvent event) {
        oresBlockTag = event.getTagManager().getBlocks().get(new ResourceLocation("forge", "ores"));
        oresItemTag = event.getTagManager().getItems().get(new ResourceLocation("forge", "ores"));
        wg_stone = event.getTagManager().getBlocks().get(new ResourceLocation("forge", "wg_stone"));
        for (RichnessTypes rType : RichnessTypes.values()) {
            String prefix;
            if (rType.equals(RichnessTypes.NORMAL)) {
                prefix = "";
            } else {
                prefix = rType.getName() + "_";
            }
            for (OreTypes oType : OreTypes.values()) {
                String tagName;
                String key = prefix + oType.getName();
                tagName = "ores/" + prefix + oType.getName();
                blockTags.put(key, event.getTagManager().getBlocks().get(new ResourceLocation("forge", tagName)));
                itemTags.put(key, event.getTagManager().getItems().get(new ResourceLocation("forge", tagName)));
            }
            secondaryTags.put(prefix + "adamantine", prefix + "adamantium");
            secondaryTags.put(prefix + "aluminum", prefix + "bauxite");
            secondaryTags.put(prefix + "aluminium", prefix + "bauxite");
            secondaryTags.put(prefix + "uranium", prefix + "uraninite");
            secondaryTags.put(prefix + "teslatite", prefix + "electrotine");
        }

        for (String secondaryTagName : secondaryTags.keySet()) {
            blockTags.put(secondaryTagName, event.getTagManager().getBlocks().get(new ResourceLocation("forge", "ores/" + secondaryTagName)));
            itemTags.put(secondaryTagName, event.getTagManager().getItems().get(new ResourceLocation("forge", "ores/" + secondaryTagName)));
        }

        setTags();
    }

    private static void setTags() {
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();

            if (block instanceof SimpleOre) {
                SimpleOre ore = (SimpleOre) block;

                if (!ModHandler.variantsModIdExists(ore.getStoneVariant().getModid())) {
                    continue;
                }

                String oTypeName = ore.getOreType().getName();
                RichnessTypes rType = ore.getRichnessType();
                String rTypeName = rType.getName();
                String prefix;
                if (rType.equals(RichnessTypes.NORMAL)) {
                    prefix = "";
                } else {
                    prefix = rTypeName + "_";
                }

                Tag<Block> bTag = blockTags.get(prefix + oTypeName);
                if (bTag != null) {
                    bTag.getAllElements().add(block);
                    bTag.getEntries().add(new Tag.TagEntry<Block>(Objects.requireNonNull(block.getRegistryName())));
                }

                if (oresBlockTag != null) {
                    oresBlockTag.getAllElements().add(block);
                    oresBlockTag.getEntries().add(new Tag.TagEntry<Block>(Objects.requireNonNull(block.getRegistryName())));
                }

                Tag<Item> iTag = itemTags.get(prefix + oTypeName);
                if (iTag != null) {
                    iTag.getAllElements().add(block.asItem());
                    iTag.getEntries().add(new Tag.TagEntry<Item>(Objects.requireNonNull(block.getRegistryName())));
                }

                if (oresItemTag != null) {
                    oresItemTag.getAllElements().add(block.asItem());
                    oresItemTag.getEntries().add(new Tag.TagEntry<Item>(Objects.requireNonNull(block.getRegistryName())));
                }
            } else if (block instanceof SimpleBlock) {
                wg_stone.getAllElements().add(block);
                wg_stone.getEntries().add(new Tag.TagEntry<Block>(Objects.requireNonNull(block.getRegistryName())));
            }
        }

        for (String secondaryTag : secondaryTags.keySet()) {
            Tag<Block> bTag = blockTags.get(secondaryTags.get(secondaryTag));
            Tag<Block> secBTag = blockTags.get(secondaryTag);
            if (bTag != null && secBTag != null) {
                secBTag.getAllElements().addAll(bTag.getAllElements());
                secBTag.getEntries().add(new Tag.TagEntry<Block>(bTag));
            }

            Tag<Item> iTag = itemTags.get(secondaryTags.get(secondaryTag));
            Tag<Item> secITag = itemTags.get(secondaryTag);
            if (iTag != null && secITag != null) {
                secITag.getAllElements().addAll(iTag.getAllElements());
                secITag.getEntries().add(new Tag.TagEntry<Item>(iTag));
            }
        }
    }
}
