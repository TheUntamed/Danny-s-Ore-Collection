package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;

public class BlockTagsDataGen extends BlockTagsProvider {
    private ArrayList<Block> ores = new ArrayList<>();
    private ArrayList<Block> adamantium = new ArrayList<>();
    private ArrayList<Block> aluminum = new ArrayList<>();
    private ArrayList<Block> amethyst = new ArrayList<>();
    private ArrayList<Block> bismuth = new ArrayList<>();
    private ArrayList<Block> black_opal = new ArrayList<>();
    private ArrayList<Block> coal = new ArrayList<>();
    private ArrayList<Block> copper = new ArrayList<>();
    private ArrayList<Block> diamond = new ArrayList<>();
    private ArrayList<Block> emerald = new ArrayList<>();
    private ArrayList<Block> gold = new ArrayList<>();
    private ArrayList<Block> iridium = new ArrayList<>();
    private ArrayList<Block> iron = new ArrayList<>();
    private ArrayList<Block> lapis = new ArrayList<>();
    private ArrayList<Block> lead = new ArrayList<>();
    private ArrayList<Block> lucky = new ArrayList<>();
    private ArrayList<Block> mithril = new ArrayList<>();
    private ArrayList<Block> nickel = new ArrayList<>();
    private ArrayList<Block> osmium = new ArrayList<>();
    private ArrayList<Block> platinum = new ArrayList<>();
    private ArrayList<Block> quartz = new ArrayList<>();
    private ArrayList<Block> redstone = new ArrayList<>();
    private ArrayList<Block> runite = new ArrayList<>();
    private ArrayList<Block> silver = new ArrayList<>();
    private ArrayList<Block> tin = new ArrayList<>();
    private ArrayList<Block> uranium = new ArrayList<>();
    private ArrayList<Block> white_opal = new ArrayList<>();
    private ArrayList<Block> xp = new ArrayList<>();
    private ArrayList<Block> zinc = new ArrayList<>();
    private ArrayList<Block> ardite = new ArrayList<>();
    private ArrayList<Block> black_quartz = new ArrayList<>();
    private ArrayList<Block> chrome = new ArrayList<>();
    private ArrayList<Block> cobalt = new ArrayList<>();
    private ArrayList<Block> draconium = new ArrayList<>();
    private ArrayList<Block> mana_infused = new ArrayList<>();
    private ArrayList<Block> niter = new ArrayList<>();
    private ArrayList<Block> sulfur = new ArrayList<>();


    public BlockTagsDataGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        for (RegistryObject<Block> block : BlockInit.BLOCKS.getEntries()) {
            ResourceLocation resLoc = block.get().getRegistryName();
            if (resLoc != null) {
                String blockName = block.get().getRegistryName().toString().split(":")[1];
                if (blockName.contains("ore")) { ores.add(block.get()); }
                if (blockName.contains("adamantium")) { adamantium.add(block.get()); }
                if (blockName.contains("aluminum")) { aluminum.add(block.get()); }
                if (blockName.contains("amethyst")) { amethyst.add(block.get()); }
                if (blockName.contains("bismuth")) { bismuth.add(block.get()); }
                if (blockName.contains("black_opal")) { black_opal.add(block.get()); }
                if (blockName.contains("coal")) { coal.add(block.get()); }
                if (blockName.contains("copper")) { copper.add(block.get()); }
                if (blockName.contains("diamond")) { diamond.add(block.get()); }
                if (blockName.contains("emerald")) { emerald.add(block.get()); }
                if (blockName.contains("gold")) { gold.add(block.get()); }
                if (blockName.contains("iridium")) { iridium.add(block.get()); }
                if (blockName.contains("iron")) { iron.add(block.get()); }
                if (blockName.contains("lapis")) { lapis.add(block.get()); }
                if (blockName.contains("lead")) { lead.add(block.get()); }
                if (blockName.contains("lucky")) { lucky.add(block.get()); }
                if (blockName.contains("mithril")) { mithril.add(block.get()); }
                if (blockName.contains("nickel")) { nickel.add(block.get()); }
                if (blockName.contains("osmium")) { osmium.add(block.get()); }
                if (blockName.contains("platinum")) { platinum.add(block.get()); }
                if (blockName.contains("quartz")) { quartz.add(block.get()); }
                if (blockName.contains("redstone")) { redstone.add(block.get()); }
                if (blockName.contains("runite")) { runite.add(block.get()); }
                if (blockName.contains("silver")) { silver.add(block.get()); }
                if (blockName.contains("tin")) { tin.add(block.get()); }
                if (blockName.contains("uranium")) { uranium.add(block.get()); }
                if (blockName.contains("white_opal")) { white_opal.add(block.get()); }
                if (blockName.contains("xp")) { xp.add(block.get()); }
                if (blockName.contains("zinc")) { zinc.add(block.get()); }
                if (blockName.contains("ardite")) { ardite.add(block.get()); }
                if (blockName.contains("black_quartz")) { black_quartz.add(block.get()); }
                if (blockName.contains("chrome")) { chrome.add(block.get()); }
                if (blockName.contains("draconium")) { draconium.add(block.get()); }
                if (blockName.contains("mana_infused")) { mana_infused.add(block.get()); }
                if (blockName.contains("niter")) { niter.add(block.get()); }
                if (blockName.contains("cobalt")) { cobalt.add(block.get()); }
                if (blockName.contains("sulfur")) { sulfur.add(block.get()); }
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
        addForgeTag("ores/ardite", ardite);
        addForgeTag("ores/black_quartz", black_quartz);
        addForgeTag("ores/chrome", chrome);
        addForgeTag("ores/cobalt", cobalt);
        addForgeTag("ores/draconium", draconium);
        addForgeTag("ores/mana_infused", mana_infused);
        addForgeTag("ores/niter", niter);
        addForgeTag("ores/sulfur", sulfur);
    }

    private void addForgeTag(String name, ArrayList<Block> blocksIn) {
        Block[] blocks = blocksIn.toArray(new Block[0]);
        Main.LOGGER.debug("Creating block tag for forge: " + name);
        ResourceLocation loc = new ResourceLocation("forge", name);
        getBuilder(new Tag<Block>(loc)).replace(false).add(blocks).build(loc);
    }

    @Override
    public String getName()
    {
        return "Danny's Ores - Block Tags";
    }
}
