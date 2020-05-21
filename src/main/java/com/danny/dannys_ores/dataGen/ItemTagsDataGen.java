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
    private ArrayList<Item> adamantium = new ArrayList<>();
    private ArrayList<Item> bauxite = new ArrayList<>();
    private ArrayList<Item> amethyst = new ArrayList<>();
    private ArrayList<Item> ardite = new ArrayList<>();
    private ArrayList<Item> bismuth = new ArrayList<>();
    private ArrayList<Item> black_opal = new ArrayList<>();
    private ArrayList<Item> black_quartz = new ArrayList<>();
    private ArrayList<Item> chrome = new ArrayList<>();
    private ArrayList<Item> coal = new ArrayList<>();
    private ArrayList<Item> cobalt = new ArrayList<>();
    private ArrayList<Item> copper = new ArrayList<>();
    private ArrayList<Item> diamond = new ArrayList<>();
    private ArrayList<Item> draconium = new ArrayList<>();
    private ArrayList<Item> electrotine = new ArrayList<>();
    private ArrayList<Item> emerald = new ArrayList<>();
    private ArrayList<Item> gold = new ArrayList<>();
    private ArrayList<Item> imperium = new ArrayList<>();
    private ArrayList<Item> inferium = new ArrayList<>();
    private ArrayList<Item> insanium = new ArrayList<>();
    private ArrayList<Item> iridium = new ArrayList<>();
    private ArrayList<Item> iron = new ArrayList<>();
    private ArrayList<Item> lapis = new ArrayList<>();
    private ArrayList<Item> lead = new ArrayList<>();
    private ArrayList<Item> lucky = new ArrayList<>();
    private ArrayList<Item> mana_infused = new ArrayList<>();
    private ArrayList<Item> mithril = new ArrayList<>();
    private ArrayList<Item> nickel = new ArrayList<>();
    private ArrayList<Item> niter = new ArrayList<>();
    private ArrayList<Item> ores = new ArrayList<>();
    private ArrayList<Item> osmium = new ArrayList<>();
    private ArrayList<Item> peridot = new ArrayList<>();
    private ArrayList<Item> platinum = new ArrayList<>();
    private ArrayList<Item> prosperity = new ArrayList<>();
    private ArrayList<Item> prudentium = new ArrayList<>();
    private ArrayList<Item> quartz = new ArrayList<>();
    private ArrayList<Item> redstone = new ArrayList<>();
    private ArrayList<Item> ruby = new ArrayList<>();
    private ArrayList<Item> runite = new ArrayList<>();
    private ArrayList<Item> sapphire = new ArrayList<>();
    private ArrayList<Item> silver = new ArrayList<>();
    private ArrayList<Item> soulium = new ArrayList<>();
    private ArrayList<Item> sulfur = new ArrayList<>();
    private ArrayList<Item> supremium = new ArrayList<>();
    private ArrayList<Item> tertium = new ArrayList<>();
    private ArrayList<Item> tin = new ArrayList<>();
    private ArrayList<Item> uranium = new ArrayList<>();
    private ArrayList<Item> white_opal = new ArrayList<>();
    private ArrayList<Item> xp = new ArrayList<>();
    private ArrayList<Item> zanite = new ArrayList<>();
    private ArrayList<Item> zinc = new ArrayList<>();
    private ArrayList<Item> anglesite = new ArrayList<>();
    private ArrayList<Item> apatite = new ArrayList<>();
    private ArrayList<Item> benitoite = new ArrayList<>();
    private ArrayList<Item> galena = new ArrayList<>();
    private ArrayList<Item> pyrite = new ArrayList<>();
    private ArrayList<Item> resonating = new ArrayList<>();
    private ArrayList<Item> tungsten = new ArrayList<>();
    private ArrayList<Item> yellorite = new ArrayList<>();
    private ArrayList<Item> steel = new ArrayList<>();
    private ArrayList<Item> sticky = new ArrayList<>();
    private ArrayList<Item> certus_quartz = new ArrayList<>();
    private ArrayList<Item> charged_certus_quartz = new ArrayList<>();
    private ArrayList<Item> lava_crystal = new ArrayList<>();
    private ArrayList<Item> dimensional_shard = new ArrayList<>();

    public ItemTagsDataGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerTags() {
        for (RegistryObject<Block> regObj : BlockInit.BLOCKS.getEntries()) {
            Block block = regObj.get();
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                Item itemBlock = block.asItem();
                if (blockName.contains("_adamantium_")) { adamantium.add(itemBlock); }
                if (blockName.contains("_bauxite_")) { bauxite.add(itemBlock); }
                if (blockName.contains("_amethyst_")) { amethyst.add(itemBlock); }
                if (blockName.contains("_ardite_")) { ardite.add(itemBlock); }
                if (blockName.contains("_bismuth_")) { bismuth.add(itemBlock); }
                if (blockName.contains("_black_opal_")) { black_opal.add(itemBlock); }
                if (blockName.contains("_black_quartz_")) { black_quartz.add(itemBlock); }
                if (blockName.contains("_chrome_")) { chrome.add(itemBlock); }
                if (blockName.contains("_coal_")) { coal.add(itemBlock); }
                if (blockName.contains("_cobalt_")) { cobalt.add(itemBlock); }
                if (blockName.contains("_copper_")) { copper.add(itemBlock); }
                if (blockName.contains("_diamond_")) { diamond.add(itemBlock); }
                if (blockName.contains("_draconium_")) { draconium.add(itemBlock); }
                if (blockName.contains("_electrotine_")) { electrotine.add(itemBlock); }
                if (blockName.contains("_emerald_")) { emerald.add(itemBlock); }
                if (blockName.contains("_gold_")) { gold.add(itemBlock); }
                if (blockName.contains("_imperium_")) { imperium.add(itemBlock); }
                if (blockName.contains("_inferium_")) { inferium.add(itemBlock); }
                if (blockName.contains("_insanium_")) { insanium.add(itemBlock); }
                if (blockName.contains("_iridium_")) { iridium.add(itemBlock); }
                if (blockName.contains("_iron_")) { iron.add(itemBlock); }
                if (blockName.contains("_lapis_")) { lapis.add(itemBlock); }
                if (blockName.contains("_lead_")) { lead.add(itemBlock); }
                if (blockName.contains("_lucky_")) { lucky.add(itemBlock); }
                if (blockName.contains("_mana_infused_")) { mana_infused.add(itemBlock); }
                if (blockName.contains("_mithril_")) { mithril.add(itemBlock); }
                if (blockName.contains("_nickel_")) { nickel.add(itemBlock); }
                if (blockName.contains("_niter_")) { niter.add(itemBlock); }
                if (blockName.contains("_ore")) { ores.add(itemBlock); }
                if (blockName.contains("_osmium_")) { osmium.add(itemBlock); }
                if (blockName.contains("_peridot_")) { peridot.add(itemBlock); }
                if (blockName.contains("_platinum_")) { platinum.add(itemBlock); }
                if (blockName.contains("_prosperity_")) { prosperity.add(itemBlock); }
                if (blockName.contains("_prudentium_")) { prudentium.add(itemBlock); }
                if (blockName.contains("_quartz_")) { quartz.add(itemBlock); }
                if (blockName.contains("_redstone_")) { redstone.add(itemBlock); }
                if (blockName.contains("_ruby_")) { ruby.add(itemBlock); }
                if (blockName.contains("_runite_")) { runite.add(itemBlock); }
                if (blockName.contains("_sapphire_")) { sapphire.add(itemBlock); }
                if (blockName.contains("_silver_")) { silver.add(itemBlock); }
                if (blockName.contains("_soulium_")) { soulium.add(itemBlock); }
                if (blockName.contains("_sulfur_")) { sulfur.add(itemBlock); }
                if (blockName.contains("_supremium_")) { supremium.add(itemBlock); }
                if (blockName.contains("_tertium_")) { tertium.add(itemBlock); }
                if (blockName.contains("_tin_")) { tin.add(itemBlock); }
                if (blockName.contains("_uranium_")) { uranium.add(itemBlock); }
                if (blockName.contains("_white_opal_")) { white_opal.add(itemBlock); }
                if (blockName.contains("_xp_")) { xp.add(itemBlock); }
                if (blockName.contains("_zanite_")) { zanite.add(itemBlock); }
                if (blockName.contains("_zinc_")) { zinc.add(itemBlock); }
                if (blockName.contains("_anglesite_")) { anglesite.add(itemBlock); }
                if (blockName.contains("_apatite_")) { apatite.add(itemBlock); }
                if (blockName.contains("_benitoite_")) { benitoite.add(itemBlock); }
                if (blockName.contains("_galena_")) { galena.add(itemBlock); }
                if (blockName.contains("_pyrite_")) { pyrite.add(itemBlock); }
                if (blockName.contains("_resonating_")) { resonating.add(itemBlock); }
                if (blockName.contains("_tungsten_")) { tungsten.add(itemBlock); }
                if (blockName.contains("_yellorite_")) { yellorite.add(itemBlock); }
                if (blockName.contains("_steel_")) { steel.add(itemBlock); }
                if (blockName.contains("_sticky_")) { sticky.add(itemBlock); }
                if (blockName.contains("_certus_quartz_")) { certus_quartz.add(itemBlock); }
                if (blockName.contains("_charged_certus_quartz_")) { charged_certus_quartz.add(itemBlock); }
                if (blockName.contains("_lava_crystal_")) { lava_crystal.add(itemBlock); }
                if (blockName.contains("_dimensional_shard_")) { dimensional_shard.add(itemBlock); }
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
        addForgeTag("ores/steel", steel);
        addForgeTag("ores/sticky", sticky);
        addForgeTag("ores/certus_quartz", certus_quartz);
        addForgeTag("ores/charged_certus_quartz", charged_certus_quartz);
        addForgeTag("ores/lava_crystal", lava_crystal);
        addForgeTag("ores/dimensional_shard", dimensional_shard);
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
