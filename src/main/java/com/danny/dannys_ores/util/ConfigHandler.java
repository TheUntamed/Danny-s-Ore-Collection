package com.danny.dannys_ores.util;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.ores.other.*;
import com.danny.dannys_ores.configs.ores.vanilla.*;
import com.danny.dannys_ores.configs.ores.with_xp_ore.*;
import com.danny.dannys_ores.init.BlockInit;
import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ConfigHandler {

    /**
     * The configs of this mod are split into different files/classes.
     * This method selects the correct config for a given block.
     *
     * @param blockName The registry name of the block without the modid part.
     * @return All Values of the config file that matches the block name.
     */
    public static UnmodifiableConfig getConfig(String blockName) {

        if (blockName.contains("_adamantium_")) { return Adamantium.spec.getValues(); }
        if (blockName.contains("_bauxite_")) { return Bauxite.spec.getValues(); }
        if (blockName.contains("_amethyst_")) { return Amethyst.spec.getValues(); }
        if (blockName.contains("_bismuth_")) { return Bismuth.spec.getValues(); }
        if (blockName.contains("_black_opal_")) { return BlackOpal.spec.getValues(); }
        if (blockName.contains("_coal_")) { return Coal.spec.getValues(); }
        if (blockName.contains("_copper_")) { return Copper.spec.getValues(); }
        if (blockName.contains("_diamond_")) { return Diamond.spec.getValues(); }
        if (blockName.contains("_emerald_")) { return Emerald.spec.getValues(); }
        if (blockName.contains("_gold_")) { return Gold.spec.getValues(); }
        if (blockName.contains("_iridium_")) { return Iridium.spec.getValues(); }
        if (blockName.contains("_iron_")) { return Iron.spec.getValues(); }
        if (blockName.contains("_lapis_")) { return Lapis.spec.getValues(); }
        if (blockName.contains("_lead_")) { return Lead.spec.getValues(); }
        if (blockName.contains("_lucky_")) { return Lucky.spec.getValues(); }
        if (blockName.contains("_mithril_")) { return Mithril.spec.getValues(); }
        if (blockName.contains("_nickel_")) { return Nickel.spec.getValues(); }
        if (blockName.contains("_osmium_")) { return Osmium.spec.getValues(); }
        if (blockName.contains("_platinum_")) { return Platinum.spec.getValues(); }
        if (blockName.contains("_quartz_")) {
            if (blockName.contains("_black_quartz_")) { return BlackQuartz.spec.getValues();
            } else if (blockName.contains("_certus_quartz_")) {
                if (blockName.contains("_charged_certus_quartz_")) { return ChargedCertusQuartz.spec.getValues();
                } else { return CertusQuartz.spec.getValues(); }
            } else {
                return Quartz.spec.getValues();
            }
        }
        if (blockName.contains("_certus_quartz_")) {
            if (blockName.contains("_charged_certus_quartz_")) { return ChargedCertusQuartz.spec.getValues();
            } else { return CertusQuartz.spec.getValues(); }
        }
        if (blockName.contains("_redstone_")) { return Redstone.spec.getValues(); }
        if (blockName.contains("_runite_")) { return Runite.spec.getValues(); }
        if (blockName.contains("_silver_")) { return Silver.spec.getValues(); }
        if (blockName.contains("_tin_")) { return Tin.spec.getValues(); }
        if (blockName.contains("_uranium_")) { return Uranium.spec.getValues(); }
        if (blockName.contains("_white_opal_")) { return WhiteOpal.spec.getValues(); }
        if (blockName.contains("_xp_")) { return Xp.spec.getValues(); }
        if (blockName.contains("_zinc_")) { return Zinc.spec.getValues(); }
        if (blockName.contains("_ardite_")) { return Ardite.spec.getValues(); }
        if (blockName.contains("_chrome_")) { return Chrome.spec.getValues(); }
        if (blockName.contains("_draconium_")) { return Draconium.spec.getValues(); }
        if (blockName.contains("_mana_infused_")) { return ManaInfused.spec.getValues(); }
        if (blockName.contains("_niter_")) { return Niter.spec.getValues(); }
        if (blockName.contains("_cobalt_")) { return Cobalt.spec.getValues(); }
        if (blockName.contains("_sulfur_")) { return Sulfur.spec.getValues(); }
        if (blockName.contains("_electrotine_")) { return Electrotine.spec.getValues(); }
        if (blockName.contains("_imperium_")) { return Imperium.spec.getValues(); }
        if (blockName.contains("_inferium_")) { return Inferium.spec.getValues(); }
        if (blockName.contains("_insanium_")) { return Insanium.spec.getValues(); }
        if (blockName.contains("_peridot_")) { return Peridot.spec.getValues(); }
        if (blockName.contains("_prosperity_")) { return Prosperity.spec.getValues(); }
        if (blockName.contains("_prudentium_")) { return Prudentium.spec.getValues(); }
        if (blockName.contains("_ruby_")) { return Ruby.spec.getValues(); }
        if (blockName.contains("_sapphire_")) { return Sapphire.spec.getValues(); }
        if (blockName.contains("_soulium_")) { return Soulium.spec.getValues(); }
        if (blockName.contains("_supremium_")) { return Supremium.spec.getValues(); }
        if (blockName.contains("_tertium_")) { return Tertium.spec.getValues(); }
        if (blockName.contains("_zanite_")) { return Zanite.spec.getValues(); }
        if (blockName.contains("_anglesite_")) { return Anglesite.spec.getValues(); }
        if (blockName.contains("_apatite_")) { return Apatite.spec.getValues(); }
        if (blockName.contains("_benitoite_")) { return Benitoite.spec.getValues(); }
        if (blockName.contains("_galena_")) { return Galena.spec.getValues(); }
        if (blockName.contains("_pyrite_")) { return Pyrite.spec.getValues(); }
        if (blockName.contains("_vulcanite_")) { return Vulcanite.spec.getValues(); }
        if (blockName.contains("_tungsten_")) { return Tungsten.spec.getValues(); }
        if (blockName.contains("_yellorite_")) { return Yellorite.spec.getValues(); }
        if (blockName.contains("_steel_")) { return Steel.spec.getValues(); }
        if (blockName.contains("_sticky_")) { return Sticky.spec.getValues(); }
        if (blockName.contains("_lava_crystal_")) { return LavaCrystal.spec.getValues(); }
        if (blockName.contains("_dimensional_shard_")) { return DimensionalShard.spec.getValues(); }
        return StoneVariants.spec.getValues();
    }

    /**
     *  Checks the Blacklists in all Configs (of this mod) for invalid entries and logs them.
     *  This should help the user to fix an error caused by an invalid entry.
     *
     * @param biomeVerify A List of all Vanilla and modded biomes.
     * @param tempVerify A List of all Vanilla and modded biome temperatures.
     */
    public static void checkConfig(ArrayList<String> biomeVerify, ArrayList<String> tempVerify) {
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                UnmodifiableConfig config = ConfigHandler.getConfig(blockName);
                ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get("general." + blockName + ".generation.biomeBlacklist");
                List<String> biomeList = inBiomeFCS.get();
                ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get("general." + blockName + ".generation.temperatureBlacklist");
                List<String> tempList = inTempFCS.get();
                for (String name : biomeList) {
                    if (!biomeVerify.contains(name)) {
                        Main.LOGGER.warn("Invalid biome '" + name + "' in Danny's Ores Config in Biome Blacklist for '" + blockName + "', please check the entries!");
                    }
                }
                for (String temp : tempList) {
                    if (!tempVerify.contains(temp)) {
                        Main.LOGGER.warn("Invalid temperature '" + temp + "' in Danny's Ores Config in Temperature Blacklist for '" + blockName + "', please check the entries!");
                    }
                }
            }
        }
    }
}
