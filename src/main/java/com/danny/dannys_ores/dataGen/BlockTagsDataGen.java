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
    private ArrayList<Block> adamantium = new ArrayList<>();
    private ArrayList<Block> bauxite = new ArrayList<>();
    private ArrayList<Block> amethyst = new ArrayList<>();
    private ArrayList<Block> ardite = new ArrayList<>();
    private ArrayList<Block> bismuth = new ArrayList<>();
    private ArrayList<Block> black_opal = new ArrayList<>();
    private ArrayList<Block> black_quartz = new ArrayList<>();
    private ArrayList<Block> chrome = new ArrayList<>();
    private ArrayList<Block> coal = new ArrayList<>();
    private ArrayList<Block> cobalt = new ArrayList<>();
    private ArrayList<Block> copper = new ArrayList<>();
    private ArrayList<Block> diamond = new ArrayList<>();
    private ArrayList<Block> draconium = new ArrayList<>();
    private ArrayList<Block> electrotine = new ArrayList<>();
    private ArrayList<Block> emerald = new ArrayList<>();
    private ArrayList<Block> gold = new ArrayList<>();
    private ArrayList<Block> imperium = new ArrayList<>();
    private ArrayList<Block> inferium = new ArrayList<>();
    private ArrayList<Block> insanium = new ArrayList<>();
    private ArrayList<Block> iridium = new ArrayList<>();
    private ArrayList<Block> iron = new ArrayList<>();
    private ArrayList<Block> lapis = new ArrayList<>();
    private ArrayList<Block> lead = new ArrayList<>();
    private ArrayList<Block> lucky = new ArrayList<>();
    private ArrayList<Block> mana_infused = new ArrayList<>();
    private ArrayList<Block> mithril = new ArrayList<>();
    private ArrayList<Block> nickel = new ArrayList<>();
    private ArrayList<Block> niter = new ArrayList<>();
    private ArrayList<Block> ores = new ArrayList<>();
    private ArrayList<Block> osmium = new ArrayList<>();
    private ArrayList<Block> peridot = new ArrayList<>();
    private ArrayList<Block> platinum = new ArrayList<>();
    private ArrayList<Block> prosperity = new ArrayList<>();
    private ArrayList<Block> prudentium = new ArrayList<>();
    private ArrayList<Block> quartz = new ArrayList<>();
    private ArrayList<Block> redstone = new ArrayList<>();
    private ArrayList<Block> ruby = new ArrayList<>();
    private ArrayList<Block> runite = new ArrayList<>();
    private ArrayList<Block> sapphire = new ArrayList<>();
    private ArrayList<Block> silver = new ArrayList<>();
    private ArrayList<Block> soulium = new ArrayList<>();
    private ArrayList<Block> sulfur = new ArrayList<>();
    private ArrayList<Block> supremium = new ArrayList<>();
    private ArrayList<Block> tertium = new ArrayList<>();
    private ArrayList<Block> tin = new ArrayList<>();
    private ArrayList<Block> uranium = new ArrayList<>();
    private ArrayList<Block> white_opal = new ArrayList<>();
    private ArrayList<Block> xp = new ArrayList<>();
    private ArrayList<Block> zanite = new ArrayList<>();
    private ArrayList<Block> zinc = new ArrayList<>();
    private ArrayList<Block> anglesite = new ArrayList<>();
    private ArrayList<Block> apatite = new ArrayList<>();
    private ArrayList<Block> benitoite = new ArrayList<>();
    private ArrayList<Block> galena = new ArrayList<>();
    private ArrayList<Block> pyrite = new ArrayList<>();
    private ArrayList<Block> resonating = new ArrayList<>();
    private ArrayList<Block> tungsten = new ArrayList<>();
    private ArrayList<Block> yellorite = new ArrayList<>();


    public BlockTagsDataGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        for (RegistryObject<Block> regObj : BlockInit.BLOCKS.getEntries()) {
            Block block = regObj.get();
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                if (blockName.contains("_adamantium_")) { adamantium.add(block); }
                if (blockName.contains("_bauxite_")) { bauxite.add(block); }
                if (blockName.contains("_amethyst_")) { amethyst.add(block); }
                if (blockName.contains("_ardite_")) { ardite.add(block); }
                if (blockName.contains("_bismuth_")) { bismuth.add(block); }
                if (blockName.contains("_black_opal_")) { black_opal.add(block); }
                if (blockName.contains("_black_quartz_")) { black_quartz.add(block); }
                if (blockName.contains("_chrome_")) { chrome.add(block); }
                if (blockName.contains("_coal_")) { coal.add(block); }
                if (blockName.contains("_cobalt_")) { cobalt.add(block); }
                if (blockName.contains("_copper_")) { copper.add(block); }
                if (blockName.contains("_diamond_")) { diamond.add(block); }
                if (blockName.contains("_draconium_")) { draconium.add(block); }
                if (blockName.contains("_electrotine_")) { electrotine.add(block); }
                if (blockName.contains("_emerald_")) { emerald.add(block); }
                if (blockName.contains("_gold_")) { gold.add(block); }
                if (blockName.contains("_imperium_")) { imperium.add(block); }
                if (blockName.contains("_inferium_")) { inferium.add(block); }
                if (blockName.contains("_insanium_")) { insanium.add(block); }
                if (blockName.contains("_iridium_")) { iridium.add(block); }
                if (blockName.contains("_iron_")) { iron.add(block); }
                if (blockName.contains("_lapis_")) { lapis.add(block); }
                if (blockName.contains("_lead_")) { lead.add(block); }
                if (blockName.contains("_lucky_")) { lucky.add(block); }
                if (blockName.contains("_mana_infused_")) { mana_infused.add(block); }
                if (blockName.contains("_mithril_")) { mithril.add(block); }
                if (blockName.contains("_nickel_")) { nickel.add(block); }
                if (blockName.contains("_niter_")) { niter.add(block); }
                if (blockName.contains("_ore")) { ores.add(block); }
                if (blockName.contains("_osmium_")) { osmium.add(block); }
                if (blockName.contains("_peridot_")) { peridot.add(block); }
                if (blockName.contains("_platinum_")) { platinum.add(block); }
                if (blockName.contains("_prosperity_")) { prosperity.add(block); }
                if (blockName.contains("_prudentium_")) { prudentium.add(block); }
                if (blockName.contains("_quartz_")) { quartz.add(block); }
                if (blockName.contains("_redstone_")) { redstone.add(block); }
                if (blockName.contains("_ruby_")) { ruby.add(block); }
                if (blockName.contains("_runite_")) { runite.add(block); }
                if (blockName.contains("_sapphire_")) { sapphire.add(block); }
                if (blockName.contains("_silver_")) { silver.add(block); }
                if (blockName.contains("_soulium_")) { soulium.add(block); }
                if (blockName.contains("_sulfur_")) { sulfur.add(block); }
                if (blockName.contains("_supremium_")) { supremium.add(block); }
                if (blockName.contains("_tertium_")) { tertium.add(block); }
                if (blockName.contains("_tin_")) { tin.add(block); }
                if (blockName.contains("_uranium_")) { uranium.add(block); }
                if (blockName.contains("_white_opal_")) { white_opal.add(block); }
                if (blockName.contains("_xp_")) { xp.add(block); }
                if (blockName.contains("_zanite_")) { zanite.add(block); }
                if (blockName.contains("_zinc_")) { zinc.add(block); }
                if (blockName.contains("_anglesite_")) { anglesite.add(block); }
                if (blockName.contains("_apatite_")) { apatite.add(block); }
                if (blockName.contains("_benitoite_")) { benitoite.add(block); }
                if (blockName.contains("_galena_")) { galena.add(block); }
                if (blockName.contains("_pyrite_")) { pyrite.add(block); }
                if (blockName.contains("_resonating_")) { resonating.add(block); }
                if (blockName.contains("_tungsten_")) { tungsten.add(block); }
                if (blockName.contains("_yellorite_")) { yellorite.add(block); }
            }
        }
        addForgeTag("ores", ores);
        addForgeTag("ores/adamantium", adamantium);
        addForgeTag("ores/bauxite", bauxite);
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
        addForgeTag("ores/electrotine", electrotine);
        addForgeTag("ores/imperium", imperium);
        addForgeTag("ores/inferium", inferium);
        addForgeTag("ores/insanium", insanium);
        addForgeTag("ores/peridot", peridot);
        addForgeTag("ores/prosperity", prosperity);
        addForgeTag("ores/prudentium", prudentium);
        addForgeTag("ores/ruby", ruby);
        addForgeTag("ores/sapphire", sapphire);
        addForgeTag("ores/soulium", soulium);
        addForgeTag("ores/supremium", supremium);
        addForgeTag("ores/tertium", tertium);
        addForgeTag("ores/zanite", zanite);
        addForgeTag("ores/anglesite", anglesite);
        addForgeTag("ores/apatite", apatite);
        addForgeTag("ores/benitoite", benitoite);
        addForgeTag("ores/galena", galena);
        addForgeTag("ores/pyrite", pyrite);
        addForgeTag("ores/resonating", resonating);
        addForgeTag("ores/tungsten", tungsten);
        addForgeTag("ores/yellorite", yellorite);

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
