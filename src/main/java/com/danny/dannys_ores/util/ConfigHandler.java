package com.danny.dannys_ores.util;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.ores.gems.*;
import com.danny.dannys_ores.configs.ores.other.*;
import com.danny.dannys_ores.configs.ores.vanilla.*;
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
     * @param block The block the config should be returned for.
     * @return All Values of the config file that matches the block type.
     */
    public static UnmodifiableConfig getConfig(Block block) {

        if (block instanceof BaseOre) {
            OreTypes type = ((BaseOre) block).getOreType();

            if (type == OreTypes.ADAMANTIUM) { return Adamantium.spec.getValues(); }
            else if (type == OreTypes.BAUXITE) { return Bauxite.spec.getValues(); }
            else if (type == OreTypes.AMETHYST) { return Amethyst.spec.getValues(); }
            else if (type == OreTypes.BISMUTH) { return Bismuth.spec.getValues(); }
            else if (type == OreTypes.BLACK_OPAL) { return BlackOpal.spec.getValues(); }
            else if (type == OreTypes.COAL) { return Coal.spec.getValues(); }
            else if (type == OreTypes.COPPER) { return Copper.spec.getValues(); }
            else if (type == OreTypes.DIAMOND) { return Diamond.spec.getValues(); }
            else if (type == OreTypes.EMERALD) { return Emerald.spec.getValues(); }
            else if (type == OreTypes.GOLD) { return Gold.spec.getValues(); }
            else if (type == OreTypes.IRIDIUM) { return Iridium.spec.getValues(); }
            else if (type == OreTypes.IRON) { return Iron.spec.getValues(); }
            else if (type == OreTypes.LAPIS) { return Lapis.spec.getValues(); }
            else if (type == OreTypes.LEAD) { return Lead.spec.getValues(); }
            else if (type == OreTypes.LUCKY) { return Lucky.spec.getValues(); }
            else if (type == OreTypes.MITHRIL) { return Mithril.spec.getValues(); }
            else if (type == OreTypes.NICKEL) { return Nickel.spec.getValues(); }
            else if (type == OreTypes.OSMIUM) { return Osmium.spec.getValues(); }
            else if (type == OreTypes.PLATINUM) { return Platinum.spec.getValues(); }
            else if (type == OreTypes.BLACK_QUARTZ) { return BlackQuartz.spec.getValues(); }
            else if (type == OreTypes.CHARGED_CERTUS_QUARTZ) { return ChargedCertusQuartz.spec.getValues(); }
            else if (type == OreTypes.CERTUS_QUARTZ) { return CertusQuartz.spec.getValues(); }
            else if (type == OreTypes.QUARTZ) { return Quartz.spec.getValues(); }
            else if (type == OreTypes.REDSTONE) { return Redstone.spec.getValues(); }
            else if (type == OreTypes.RUNITE) { return Runite.spec.getValues(); }
            else if (type == OreTypes.SILVER) { return Silver.spec.getValues(); }
            else if (type == OreTypes.TIN) { return Tin.spec.getValues(); }
            else if (type == OreTypes.URANIUM) { return Uranium.spec.getValues(); }
            else if (type == OreTypes.WHITE_OPAL) { return WhiteOpal.spec.getValues(); }
            else if (type == OreTypes.XP) { return Xp.spec.getValues(); }
            else if (type == OreTypes.ZINC) { return Zinc.spec.getValues(); }
            else if (type == OreTypes.ARDITE) { return Ardite.spec.getValues(); }
            else if (type == OreTypes.CHROME) { return Chrome.spec.getValues(); }
            else if (type == OreTypes.DRACONIUM) { return Draconium.spec.getValues(); }
            else if (type == OreTypes.MANA_INFUSED) { return ManaInfused.spec.getValues(); }
            else if (type == OreTypes.NITER) { return Niter.spec.getValues(); }
            else if (type == OreTypes.COBALT) { return Cobalt.spec.getValues(); }
            else if (type == OreTypes.SULFUR) { return Sulfur.spec.getValues(); }
            else if (type == OreTypes.ELECTROTINE) { return Electrotine.spec.getValues(); }
            else if (type == OreTypes.IMPERIUM) { return Imperium.spec.getValues(); }
            else if (type == OreTypes.INFERIUM) { return Inferium.spec.getValues(); }
            else if (type == OreTypes.INSANIUM) { return Insanium.spec.getValues(); }
            else if (type == OreTypes.PERIDOT) { return Peridot.spec.getValues(); }
            else if (type == OreTypes.PROSPERITY) { return Prosperity.spec.getValues(); }
            else if (type == OreTypes.PRUDENTIUM) { return Prudentium.spec.getValues(); }
            else if (type == OreTypes.RUBY) { return Ruby.spec.getValues(); }
            else if (type == OreTypes.SAPPHIRE) { return Sapphire.spec.getValues(); }
            else if (type == OreTypes.SOULIUM) { return Soulium.spec.getValues(); }
            else if (type == OreTypes.SUPREMIUM) { return Supremium.spec.getValues(); }
            else if (type == OreTypes.TERTIUM) { return Tertium.spec.getValues(); }
            else if (type == OreTypes.ZANITE) { return Zanite.spec.getValues(); }
            else if (type == OreTypes.ANGLESITE) { return Anglesite.spec.getValues(); }
            else if (type == OreTypes.APATITE) { return Apatite.spec.getValues(); }
            else if (type == OreTypes.BENITOITE) { return Benitoite.spec.getValues(); }
            else if (type == OreTypes.GALENA) { return Galena.spec.getValues(); }
            else if (type == OreTypes.PYRITE) { return Pyrite.spec.getValues(); }
            else if (type == OreTypes.VULCANITE) { return Vulcanite.spec.getValues(); }
            else if (type == OreTypes.TUNGSTEN) { return Tungsten.spec.getValues(); }
            else if (type == OreTypes.YELLORITE) { return Yellorite.spec.getValues(); }
            else if (type == OreTypes.STEEL) { return Steel.spec.getValues(); }
            else if (type == OreTypes.STICKY) { return Sticky.spec.getValues(); }
            else if (type == OreTypes.LAVA_CRYSTAL) { return LavaCrystal.spec.getValues(); }
            else if (type == OreTypes.DIMENSIONAL_SHARD) { return DimensionalShard.spec.getValues(); }
            else if (type == OreTypes.BORON) { return Boron.spec.getValues(); }
            else if (type == OreTypes.MAGNESIUM) { return Magnesium.spec.getValues(); }
            else if (type == OreTypes.LITHIUM) { return Lithium.spec.getValues(); }
            else if (type == OreTypes.THORIUM) { return Thorium.spec.getValues(); }
            else {
                throw new IllegalArgumentException("For the ore '" + block + "' no config could be returned!");
            }
        } else {
            return StoneVariants.spec.getValues();
        }
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
                UnmodifiableConfig config = ConfigHandler.getConfig(block);
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
