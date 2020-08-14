package com.danny.dannys_ores.init;

import com.danny.dannys_ores.blocks.SimpleBlock;
import com.danny.dannys_ores.blocks.SimpleOre;
import com.danny.dannys_ores.util.OreTypes;
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

    public static void loadTags(TagsUpdatedEvent event) {
        oresBlockTag = event.getTagManager().getBlocks().get(new ResourceLocation("forge", "ores"));
        oresItemTag = event.getTagManager().getItems().get(new ResourceLocation("forge", "ores"));
        wg_stone = event.getTagManager().getBlocks().get(new ResourceLocation("forge", "wg_stone"));
        for (OreTypes oType : OreTypes.values()) {
            String tagName = "ores/" + oType.getName();
            blockTags.put(oType.getName(), event.getTagManager().getBlocks().get(new ResourceLocation("forge", tagName)));
            itemTags.put(oType.getName(), event.getTagManager().getItems().get(new ResourceLocation("forge", tagName)));
        }
        setTags();
    }

    private static void setTags() {
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();

            if (block instanceof SimpleOre) {
                SimpleOre ore = (SimpleOre) block;
                String oTypeName = ore.getOreType().getName();
                System.err.println("The current Ore Type: " + oTypeName);

                Tag<Block> bTag = blockTags.get(oTypeName);
                if (bTag != null) {
                    bTag.getAllElements().add(block);
                    bTag.getEntries().add(new Tag.TagEntry<Block>(Objects.requireNonNull(block.getRegistryName())));
                }

                if (oresBlockTag != null) {
                    oresBlockTag.getAllElements().add(block);
                    oresBlockTag.getEntries().add(new Tag.TagEntry<Block>(Objects.requireNonNull(block.getRegistryName())));
                }

                Tag<Item> iTag = itemTags.get(oTypeName);
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
    }
}
