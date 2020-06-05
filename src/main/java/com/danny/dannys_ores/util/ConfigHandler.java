package com.danny.dannys_ores.util;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.configs.ores.elementary.*;
import com.danny.dannys_ores.configs.ores.gems.*;
import com.danny.dannys_ores.configs.ores.other.*;
import com.danny.dannys_ores.configs.ores.vanilla.*;
import com.danny.dannys_ores.configs.dense_ores.gems.*;
import com.danny.dannys_ores.configs.dense_ores.other.*;
import com.danny.dannys_ores.configs.dense_ores.vanilla.*;
import com.danny.dannys_ores.configs.poor_ores.gems.*;
import com.danny.dannys_ores.configs.poor_ores.other.*;
import com.danny.dannys_ores.configs.poor_ores.vanilla.*;
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
     * return All Values of the config file that matches the block type.
     */
    public static UnmodifiableConfig getConfig(Block block) {

        if (block instanceof BaseOre) {
            RichnessTypes rType = ((BaseOre) block).getRichnessType();
            OreTypes oType = ((BaseOre) block).getOreType();

            switch (rType) {
                case DENSE:
                    switch (oType) {
                        case ADAMANTIUM: return DenseAdamantium.spec.getValues();
                        case BAUXITE: return DenseBauxite.spec.getValues();
                        case AMETHYST: return DenseAmethyst.spec.getValues();
                        case BISMUTH: return DenseBismuth.spec.getValues();
                        case BLACK_OPAL: return DenseBlackOpal.spec.getValues();
                        case COAL: return DenseCoal.spec.getValues();
                        case COPPER: return DenseCopper.spec.getValues();
                        case DIAMOND: return DenseDiamond.spec.getValues();
                        case EMERALD: return DenseEmerald.spec.getValues();
                        case GOLD: return DenseGold.spec.getValues();
                        case IRIDIUM: return DenseIridium.spec.getValues();
                        case IRON: return DenseIron.spec.getValues();
                        case LAPIS: return DenseLapis.spec.getValues();
                        case LEAD: return DenseLead.spec.getValues();
                        case LUCKY: return DenseLucky.spec.getValues();
                        case MITHRIL: return DenseMithril.spec.getValues();
                        case NICKEL: return DenseNickel.spec.getValues();
                        case OSMIUM: return DenseOsmium.spec.getValues();
                        case PLATINUM: return DensePlatinum.spec.getValues();
                        case BLACK_QUARTZ: return DenseBlackQuartz.spec.getValues();
                        case CHARGED_CERTUS_QUARTZ: return DenseChargedCertusQuartz.spec.getValues();
                        case CERTUS_QUARTZ: return DenseCertusQuartz.spec.getValues();
                        case QUARTZ: return DenseQuartz.spec.getValues();
                        case REDSTONE: return DenseRedstone.spec.getValues();
                        case RUNITE: return DenseRunite.spec.getValues();
                        case SILVER: return DenseSilver.spec.getValues();
                        case TIN: return DenseTin.spec.getValues();
                        case URANINITE: return DenseUraninite.spec.getValues();
                        case WHITE_OPAL: return DenseWhiteOpal.spec.getValues();
                        case XP: return DenseXp.spec.getValues();
                        case ZINC: return DenseZinc.spec.getValues();
                        case ARDITE: return DenseArdite.spec.getValues();
                        case CHROME: return DenseChrome.spec.getValues();
                        case DRACONIUM: return DenseDraconium.spec.getValues();
                        case MANA_INFUSED: return DenseManaInfused.spec.getValues();
                        case NITER: return DenseNiter.spec.getValues();
                        case COBALT: return DenseCobalt.spec.getValues();
                        case SULFUR: return DenseSulfur.spec.getValues();
                        case ELECTROTINE: return DenseElectrotine.spec.getValues();
                        case IMPERIUM: return DenseImperium.spec.getValues();
                        case INFERIUM: return DenseInferium.spec.getValues();
                        case INSANIUM: return DenseInsanium.spec.getValues();
                        case PERIDOT: return DensePeridot.spec.getValues();
                        case PROSPERITY: return DenseProsperity.spec.getValues();
                        case PRUDENTIUM: return DensePrudentium.spec.getValues();
                        case RUBY: return DenseRuby.spec.getValues();
                        case SAPPHIRE: return DenseSapphire.spec.getValues();
                        case SOULIUM: return DenseSoulium.spec.getValues();
                        case SUPREMIUM: return DenseSupremium.spec.getValues();
                        case TERTIUM: return DenseTertium.spec.getValues();
                        case ZANITE: return DenseZanite.spec.getValues();
                        case ANGLESITE: return DenseAnglesite.spec.getValues();
                        case APATITE: return DenseApatite.spec.getValues();
                        case BENITOITE: return DenseBenitoite.spec.getValues();
                        case GALENA: return DenseGalena.spec.getValues();
                        case PYRITE: return DensePyrite.spec.getValues();
                        case VULCANITE: return DenseVulcanite.spec.getValues();
                        case TUNGSTEN: return DenseTungsten.spec.getValues();
                        case YELLORITE: return DenseYellorite.spec.getValues();
                        case STEEL: return DenseSteel.spec.getValues();
                        case STICKY: return DenseSticky.spec.getValues();
                        case LAVA_CRYSTAL: return DenseLavaCrystal.spec.getValues();
                        case DIMENSIONAL_SHARD: return DenseDimensionalShard.spec.getValues();
                        case BORON: return DenseBoron.spec.getValues();
                        case MAGNESIUM: return DenseMagnesium.spec.getValues();
                        case LITHIUM: return DenseLithium.spec.getValues();
                        case THORIUM: return DenseThorium.spec.getValues();
                        default: throw new IllegalArgumentException("For the ore '" + block + "' no config could be returned!");
                    }
                case POOR:
                    switch (oType) {
                        case ADAMANTIUM: return PoorAdamantium.spec.getValues();
                        case BAUXITE: return PoorBauxite.spec.getValues();
                        case AMETHYST: return PoorAmethyst.spec.getValues();
                        case BISMUTH: return PoorBismuth.spec.getValues();
                        case BLACK_OPAL: return PoorBlackOpal.spec.getValues();
                        case COAL: return PoorCoal.spec.getValues();
                        case COPPER: return PoorCopper.spec.getValues();
                        case DIAMOND: return PoorDiamond.spec.getValues();
                        case EMERALD: return PoorEmerald.spec.getValues();
                        case GOLD: return PoorGold.spec.getValues();
                        case IRIDIUM: return PoorIridium.spec.getValues();
                        case IRON: return PoorIron.spec.getValues();
                        case LAPIS: return PoorLapis.spec.getValues();
                        case LEAD: return PoorLead.spec.getValues();
                        case LUCKY: return PoorLucky.spec.getValues();
                        case MITHRIL: return PoorMithril.spec.getValues();
                        case NICKEL: return PoorNickel.spec.getValues();
                        case OSMIUM: return PoorOsmium.spec.getValues();
                        case PLATINUM: return PoorPlatinum.spec.getValues();
                        case BLACK_QUARTZ: return PoorBlackQuartz.spec.getValues();
                        case CHARGED_CERTUS_QUARTZ: return PoorChargedCertusQuartz.spec.getValues();
                        case CERTUS_QUARTZ: return PoorCertusQuartz.spec.getValues();
                        case QUARTZ: return PoorQuartz.spec.getValues();
                        case REDSTONE: return PoorRedstone.spec.getValues();
                        case RUNITE: return PoorRunite.spec.getValues();
                        case SILVER: return PoorSilver.spec.getValues();
                        case TIN: return PoorTin.spec.getValues();
                        case URANINITE: return PoorUraninite.spec.getValues();
                        case WHITE_OPAL: return PoorWhiteOpal.spec.getValues();
                        case XP: return PoorXp.spec.getValues();
                        case ZINC: return PoorZinc.spec.getValues();
                        case ARDITE: return PoorArdite.spec.getValues();
                        case CHROME: return PoorChrome.spec.getValues();
                        case DRACONIUM: return PoorDraconium.spec.getValues();
                        case MANA_INFUSED: return PoorManaInfused.spec.getValues();
                        case NITER: return PoorNiter.spec.getValues();
                        case COBALT: return PoorCobalt.spec.getValues();
                        case SULFUR: return PoorSulfur.spec.getValues();
                        case ELECTROTINE: return PoorElectrotine.spec.getValues();
                        case IMPERIUM: return PoorImperium.spec.getValues();
                        case INFERIUM: return PoorInferium.spec.getValues();
                        case INSANIUM: return PoorInsanium.spec.getValues();
                        case PERIDOT: return PoorPeridot.spec.getValues();
                        case PROSPERITY: return PoorProsperity.spec.getValues();
                        case PRUDENTIUM: return PoorPrudentium.spec.getValues();
                        case RUBY: return PoorRuby.spec.getValues();
                        case SAPPHIRE: return PoorSapphire.spec.getValues();
                        case SOULIUM: return PoorSoulium.spec.getValues();
                        case SUPREMIUM: return PoorSupremium.spec.getValues();
                        case TERTIUM: return PoorTertium.spec.getValues();
                        case ZANITE: return PoorZanite.spec.getValues();
                        case ANGLESITE: return PoorAnglesite.spec.getValues();
                        case APATITE: return PoorApatite.spec.getValues();
                        case BENITOITE: return PoorBenitoite.spec.getValues();
                        case GALENA: return PoorGalena.spec.getValues();
                        case PYRITE: return PoorPyrite.spec.getValues();
                        case VULCANITE: return PoorVulcanite.spec.getValues();
                        case TUNGSTEN: return PoorTungsten.spec.getValues();
                        case YELLORITE: return PoorYellorite.spec.getValues();
                        case STEEL: return PoorSteel.spec.getValues();
                        case STICKY: return PoorSticky.spec.getValues();
                        case LAVA_CRYSTAL: return PoorLavaCrystal.spec.getValues();
                        case DIMENSIONAL_SHARD: return PoorDimensionalShard.spec.getValues();
                        case BORON: return PoorBoron.spec.getValues();
                        case MAGNESIUM: return PoorMagnesium.spec.getValues();
                        case LITHIUM: return PoorLithium.spec.getValues();
                        case THORIUM: return PoorThorium.spec.getValues();
                        default: throw new IllegalArgumentException("For the ore '" + block + "' no config could be returned!");
                    }
                case NORMAL:
                    switch (oType) {
                        case ADAMANTIUM: return Adamantium.spec.getValues();
                        case BAUXITE: return Bauxite.spec.getValues();
                        case AMETHYST: return Amethyst.spec.getValues();
                        case BISMUTH: return Bismuth.spec.getValues();
                        case BLACK_OPAL: return BlackOpal.spec.getValues();
                        case COAL: return Coal.spec.getValues();
                        case COPPER: return Copper.spec.getValues();
                        case DIAMOND: return Diamond.spec.getValues();
                        case EMERALD: return Emerald.spec.getValues();
                        case GOLD: return Gold.spec.getValues();
                        case IRIDIUM: return Iridium.spec.getValues();
                        case IRON: return Iron.spec.getValues();
                        case LAPIS: return Lapis.spec.getValues();
                        case LEAD: return Lead.spec.getValues();
                        case LUCKY: return Lucky.spec.getValues();
                        case MITHRIL: return Mithril.spec.getValues();
                        case NICKEL: return Nickel.spec.getValues();
                        case OSMIUM: return Osmium.spec.getValues();
                        case PLATINUM: return Platinum.spec.getValues();
                        case BLACK_QUARTZ: return BlackQuartz.spec.getValues();
                        case CHARGED_CERTUS_QUARTZ: return ChargedCertusQuartz.spec.getValues();
                        case CERTUS_QUARTZ: return CertusQuartz.spec.getValues();
                        case QUARTZ: return Quartz.spec.getValues();
                        case REDSTONE: return Redstone.spec.getValues();
                        case RUNITE: return Runite.spec.getValues();
                        case SILVER: return Silver.spec.getValues();
                        case TIN: return Tin.spec.getValues();
                        case URANINITE: return Uraninite.spec.getValues();
                        case WHITE_OPAL: return WhiteOpal.spec.getValues();
                        case XP: return Xp.spec.getValues();
                        case ZINC: return Zinc.spec.getValues();
                        case ARDITE: return Ardite.spec.getValues();
                        case CHROME: return Chrome.spec.getValues();
                        case DRACONIUM: return Draconium.spec.getValues();
                        case MANA_INFUSED: return ManaInfused.spec.getValues();
                        case NITER: return Niter.spec.getValues();
                        case COBALT: return Cobalt.spec.getValues();
                        case SULFUR: return Sulfur.spec.getValues();
                        case ELECTROTINE: return Electrotine.spec.getValues();
                        case IMPERIUM: return Imperium.spec.getValues();
                        case INFERIUM: return Inferium.spec.getValues();
                        case INSANIUM: return Insanium.spec.getValues();
                        case PERIDOT: return Peridot.spec.getValues();
                        case PROSPERITY: return Prosperity.spec.getValues();
                        case PRUDENTIUM: return Prudentium.spec.getValues();
                        case RUBY: return Ruby.spec.getValues();
                        case SAPPHIRE: return Sapphire.spec.getValues();
                        case SOULIUM: return Soulium.spec.getValues();
                        case SUPREMIUM: return Supremium.spec.getValues();
                        case TERTIUM: return Tertium.spec.getValues();
                        case ZANITE: return Zanite.spec.getValues();
                        case ANGLESITE: return Anglesite.spec.getValues();
                        case APATITE: return Apatite.spec.getValues();
                        case BENITOITE: return Benitoite.spec.getValues();
                        case GALENA: return Galena.spec.getValues();
                        case PYRITE: return Pyrite.spec.getValues();
                        case VULCANITE: return Vulcanite.spec.getValues();
                        case TUNGSTEN: return Tungsten.spec.getValues();
                        case YELLORITE: return Yellorite.spec.getValues();
                        case STEEL: return Steel.spec.getValues();
                        case STICKY: return Sticky.spec.getValues();
                        case LAVA_CRYSTAL: return LavaCrystal.spec.getValues();
                        case DIMENSIONAL_SHARD: return DimensionalShard.spec.getValues();
                        case BORON: return Boron.spec.getValues();
                        case MAGNESIUM: return Magnesium.spec.getValues();
                        case LITHIUM: return Lithium.spec.getValues();
                        case THORIUM: return Thorium.spec.getValues();
                        case FIRE: return Fire.spec.getValues();
                        case EARTH: return Earth.spec.getValues();
                        case WATER: return Water.spec.getValues();
                        case AIR: return Air.spec.getValues();
                        case ORDER: return Order.spec.getValues();
                        case ENTROPY: return Entropy.spec.getValues();
                        default: throw new IllegalArgumentException("The ore type of '" + block + "' has no Ore Type no config could be returned!");
                    }
                default:
                    throw new IllegalArgumentException("The richness type of '" + block + "' has no Richness Type. No config could be returned!");
            }
        } else { return Stones.spec.getValues(); }
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
            System.err.println("Config Checker current block: " + block);
            ResourceLocation resLoc = block.getRegistryName();
            if (resLoc != null) {
                String blockName = resLoc.toString().split(":")[1];
                UnmodifiableConfig config = ConfigHandler.getConfig(block);
                ForgeConfigSpec.ConfigValue<List<String>> inBiomeFCS = config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getBiomeBlacklistPath());
                List<String> biomeList = inBiomeFCS.get();
                ForgeConfigSpec.ConfigValue<List<String>> inTempFCS = config.get(PathHandler.getGeneralPath() + "." + blockName + "." + PathHandler.getGenerationPath() + "." + PathHandler.getTemperatureBlacklistPath());
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
            } else {
                throw new NullPointerException("Block '" + block + "' has no registry name!");
            }
        }
    }
}
