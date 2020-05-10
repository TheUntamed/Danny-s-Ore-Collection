package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;

public class ItemTagsDataGen extends ItemTagsProvider {
    private ArrayList<Item> ores = new ArrayList<>();
    private ArrayList<Item> adamantium = new ArrayList<>();
    private ArrayList<Item> aluminum = new ArrayList<>();
    private ArrayList<Item> amethyst = new ArrayList<>();
    private ArrayList<Item> bismuth = new ArrayList<>();
    private ArrayList<Item> black_opal = new ArrayList<>();
    private ArrayList<Item> coal = new ArrayList<>();
    private ArrayList<Item> copper = new ArrayList<>();
    private ArrayList<Item> diamond = new ArrayList<>();
    private ArrayList<Item> emerald = new ArrayList<>();
    private ArrayList<Item> gold = new ArrayList<>();
    private ArrayList<Item> iridium = new ArrayList<>();
    private ArrayList<Item> iron = new ArrayList<>();
    private ArrayList<Item> lapis = new ArrayList<>();
    private ArrayList<Item> lead = new ArrayList<>();
    private ArrayList<Item> lucky = new ArrayList<>();
    private ArrayList<Item> mithril = new ArrayList<>();
    private ArrayList<Item> nickel = new ArrayList<>();
    private ArrayList<Item> osmium = new ArrayList<>();
    private ArrayList<Item> platinum = new ArrayList<>();
    private ArrayList<Item> quartz = new ArrayList<>();
    private ArrayList<Item> redstone = new ArrayList<>();
    private ArrayList<Item> runite = new ArrayList<>();
    private ArrayList<Item> silver = new ArrayList<>();
    private ArrayList<Item> tin = new ArrayList<>();
    private ArrayList<Item> uranium = new ArrayList<>();
    private ArrayList<Item> white_opal = new ArrayList<>();
    private ArrayList<Item> xp = new ArrayList<>();
    private ArrayList<Item> zinc = new ArrayList<>();

    public ItemTagsDataGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerTags() {
        for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
            ResourceLocation resLoc = block.get().getRegistryName();
            if (resLoc != null) {
                String blockName = block.get().getRegistryName().toString().split(":")[1];
                if (blockName.contains("ore")) { ores.add(block.get().asItem()); }
                if (blockName.contains("adamantium")) { adamantium.add(block.get().asItem()); }
                if (blockName.contains("aluminum")) { aluminum.add(block.get().asItem()); }
                if (blockName.contains("amethyst")) { amethyst.add(block.get().asItem()); }
                if (blockName.contains("bismuth")) { bismuth.add(block.get().asItem()); }
                if (blockName.contains("black_opal")) { black_opal.add(block.get().asItem()); }
                if (blockName.contains("coal")) { coal.add(block.get().asItem()); }
                if (blockName.contains("copper")) { copper.add(block.get().asItem()); }
                if (blockName.contains("diamond")) { diamond.add(block.get().asItem()); }
                if (blockName.contains("emerald")) { emerald.add(block.get().asItem()); }
                if (blockName.contains("gold")) { gold.add(block.get().asItem()); }
                if (blockName.contains("iridium")) { iridium.add(block.get().asItem()); }
                if (blockName.contains("iron")) { iron.add(block.get().asItem()); }
                if (blockName.contains("lapis")) { lapis.add(block.get().asItem()); }
                if (blockName.contains("lead")) { lead.add(block.get().asItem()); }
                if (blockName.contains("lucky")) { lucky.add(block.get().asItem()); }
                if (blockName.contains("mithril")) { mithril.add(block.get().asItem()); }
                if (blockName.contains("nickel")) { nickel.add(block.get().asItem()); }
                if (blockName.contains("osmium")) { osmium.add(block.get().asItem()); }
                if (blockName.contains("platinum")) { platinum.add(block.get().asItem()); }
                if (blockName.contains("quartz")) { quartz.add(block.get().asItem()); }
                if (blockName.contains("redstone")) { redstone.add(block.get().asItem()); }
                if (blockName.contains("runite")) { runite.add(block.get().asItem()); }
                if (blockName.contains("silver")) { silver.add(block.get().asItem()); }
                if (blockName.contains("tin")) { tin.add(block.get().asItem()); }
                if (blockName.contains("uranium")) { uranium.add(block.get().asItem()); }
                if (blockName.contains("white_opal")) { white_opal.add(block.get().asItem()); }
                if (blockName.contains("xp")) { xp.add(block.get().asItem()); }
                if (blockName.contains("zinc")) { zinc.add(block.get().asItem()); }
            }
        }
        addForgeTag("ores", ores);
        addForgeTag("ores/adamantium", adamantium);
        addForgeTag("ores/aluminum", aluminum);
        addForgeTag("ores/amethyst", amethyst);
        addForgeTag("ores/bismuth", bismuth);
        addForgeTag("ores/black_opal", black_opal);
        addForgeTag("ores/coal", coal);
        addForgeTag("ores/copper", copper);
        addForgeTag("ores/diamond", diamond);
        addForgeTag("ores/emerald", emerald);
        addForgeTag("ores/gold", gold);
        addForgeTag("ores/iridium", iridium);
        addForgeTag("ores/iron", iron);
        addForgeTag("ores/lapis", lapis);
        addForgeTag("ores/lead", lead);
        addForgeTag("ores/lucky", lucky);
        addForgeTag("ores/mithril", mithril);
        addForgeTag("ores/nickel", nickel);
        addForgeTag("ores/osmium", osmium);
        addForgeTag("ores/platinum", platinum);
        addForgeTag("ores/quartz", quartz);
        addForgeTag("ores/redstone", redstone);
        addForgeTag("ores/runite", runite);
        addForgeTag("ores/silver", silver);
        addForgeTag("ores/tin", tin);
        addForgeTag("ores/uranium", uranium);
        addForgeTag("ores/white_opal", white_opal);
        addForgeTag("ores/xp", xp);
        addForgeTag("ores/zinc", zinc);
    }

    private void addForgeTag(String name, ArrayList<Item> itemsIn) {
        Item[] items = itemsIn.toArray(new Item[0]);
        Main.LOGGER.debug("Creating item tag for forge: " + name);
        ResourceLocation loc = new ResourceLocation("forge", name);
        getBuilder(new Tag<Item>(loc)).replace(false).add(items).build(loc);
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Item Tags";
    }
}
