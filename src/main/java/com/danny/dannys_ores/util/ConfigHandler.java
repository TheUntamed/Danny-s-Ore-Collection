package com.danny.dannys_ores.util;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseOre;
import com.danny.dannys_ores.configs.*;
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
     * @return All Values of the config file that matches the block type.
     */
    public static UnmodifiableConfig getConfig(Block block) {

        if (block instanceof BaseOre) {
            OreTypes type = ((BaseOre) block).getOreType();

            switch (type) {
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
                case URANIUM: return Uranium.spec.getValues();
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

                case DENSE_ADAMANTIUM: return DenseAdamantium.spec.getValues();
                case DENSE_BAUXITE: return DenseBauxite.spec.getValues();
                case DENSE_AMETHYST: return DenseAmethyst.spec.getValues();
                case DENSE_BISMUTH: return DenseBismuth.spec.getValues();
                case DENSE_BLACK_OPAL: return DenseBlackOpal.spec.getValues();
                case DENSE_COAL: return DenseCoal.spec.getValues();
                case DENSE_COPPER: return DenseCopper.spec.getValues();
                case DENSE_DIAMOND: return DenseDiamond.spec.getValues();
                case DENSE_EMERALD: return DenseEmerald.spec.getValues();
                case DENSE_GOLD: return DenseGold.spec.getValues();
                case DENSE_IRIDIUM: return DenseIridium.spec.getValues();
                case DENSE_IRON: return DenseIron.spec.getValues();
                case DENSE_LAPIS: return DenseLapis.spec.getValues();
                case DENSE_LEAD: return DenseLead.spec.getValues();
                case DENSE_LUCKY: return DenseLucky.spec.getValues();
                case DENSE_MITHRIL: return DenseMithril.spec.getValues();
                case DENSE_NICKEL: return DenseNickel.spec.getValues();
                case DENSE_OSMIUM: return DenseOsmium.spec.getValues();
                case DENSE_PLATINUM: return DensePlatinum.spec.getValues();
                case DENSE_BLACK_QUARTZ: return DenseBlackQuartz.spec.getValues();
                case DENSE_CHARGED_CERTUS_QUARTZ: return DenseChargedCertusQuartz.spec.getValues();
                case DENSE_CERTUS_QUARTZ: return DenseCertusQuartz.spec.getValues();
                case DENSE_QUARTZ: return DenseQuartz.spec.getValues();
                case DENSE_REDSTONE: return DenseRedstone.spec.getValues();
                case DENSE_RUNITE: return DenseRunite.spec.getValues();
                case DENSE_SILVER: return DenseSilver.spec.getValues();
                case DENSE_TIN: return DenseTin.spec.getValues();
                case DENSE_URANIUM: return DenseUranium.spec.getValues();
                case DENSE_WHITE_OPAL: return DenseWhiteOpal.spec.getValues();
                case DENSE_XP: return DenseXp.spec.getValues();
                case DENSE_ZINC: return DenseZinc.spec.getValues();
                case DENSE_ARDITE: return DenseArdite.spec.getValues();
                case DENSE_CHROME: return DenseChrome.spec.getValues();
                case DENSE_DRACONIUM: return DenseDraconium.spec.getValues();
                case DENSE_MANA_INFUSED: return DenseManaInfused.spec.getValues();
                case DENSE_NITER: return DenseNiter.spec.getValues();
                case DENSE_COBALT: return DenseCobalt.spec.getValues();
                case DENSE_SULFUR: return DenseSulfur.spec.getValues();
                case DENSE_ELECTROTINE: return DenseElectrotine.spec.getValues();
                case DENSE_IMPERIUM: return DenseImperium.spec.getValues();
                case DENSE_INFERIUM: return DenseInferium.spec.getValues();
                case DENSE_INSANIUM: return DenseInsanium.spec.getValues();
                case DENSE_PERIDOT: return DensePeridot.spec.getValues();
                case DENSE_PROSPERITY: return DenseProsperity.spec.getValues();
                case DENSE_PRUDENTIUM: return DensePrudentium.spec.getValues();
                case DENSE_RUBY: return DenseRuby.spec.getValues();
                case DENSE_SAPPHIRE: return DenseSapphire.spec.getValues();
                case DENSE_SOULIUM: return DenseSoulium.spec.getValues();
                case DENSE_SUPREMIUM: return DenseSupremium.spec.getValues();
                case DENSE_TERTIUM: return DenseTertium.spec.getValues();
                case DENSE_ZANITE: return DenseZanite.spec.getValues();
                case DENSE_ANGLESITE: return DenseAnglesite.spec.getValues();
                case DENSE_APATITE: return DenseApatite.spec.getValues();
                case DENSE_BENITOITE: return DenseBenitoite.spec.getValues();
                case DENSE_GALENA: return DenseGalena.spec.getValues();
                case DENSE_PYRITE: return DensePyrite.spec.getValues();
                case DENSE_VULCANITE: return DenseVulcanite.spec.getValues();
                case DENSE_TUNGSTEN: return DenseTungsten.spec.getValues();
                case DENSE_YELLORITE: return DenseYellorite.spec.getValues();
                case DENSE_STEEL: return DenseSteel.spec.getValues();
                case DENSE_STICKY: return DenseSticky.spec.getValues();
                case DENSE_LAVA_CRYSTAL: return DenseLavaCrystal.spec.getValues();
                case DENSE_DIMENSIONAL_SHARD: return DenseDimensionalShard.spec.getValues();
                case DENSE_BORON: return DenseBoron.spec.getValues();
                case DENSE_MAGNESIUM: return DenseMagnesium.spec.getValues();
                case DENSE_LITHIUM: return DenseLithium.spec.getValues();
                case DENSE_THORIUM: return DenseThorium.spec.getValues();

                case POOR_ADAMANTIUM: return PoorAdamantium.spec.getValues();
                case POOR_BAUXITE: return PoorBauxite.spec.getValues();
                case POOR_AMETHYST: return PoorAmethyst.spec.getValues();
                case POOR_BISMUTH: return PoorBismuth.spec.getValues();
                case POOR_BLACK_OPAL: return PoorBlackOpal.spec.getValues();
                case POOR_COAL: return PoorCoal.spec.getValues();
                case POOR_COPPER: return PoorCopper.spec.getValues();
                case POOR_DIAMOND: return PoorDiamond.spec.getValues();
                case POOR_EMERALD: return PoorEmerald.spec.getValues();
                case POOR_GOLD: return PoorGold.spec.getValues();
                case POOR_IRIDIUM: return PoorIridium.spec.getValues();
                case POOR_IRON: return PoorIron.spec.getValues();
                case POOR_LAPIS: return PoorLapis.spec.getValues();
                case POOR_LEAD: return PoorLead.spec.getValues();
                case POOR_LUCKY: return PoorLucky.spec.getValues();
                case POOR_MITHRIL: return PoorMithril.spec.getValues();
                case POOR_NICKEL: return PoorNickel.spec.getValues();
                case POOR_OSMIUM: return PoorOsmium.spec.getValues();
                case POOR_PLATINUM: return PoorPlatinum.spec.getValues();
                case POOR_BLACK_QUARTZ: return PoorBlackQuartz.spec.getValues();
                case POOR_CHARGED_CERTUS_QUARTZ: return PoorChargedCertusQuartz.spec.getValues();
                case POOR_CERTUS_QUARTZ: return PoorCertusQuartz.spec.getValues();
                case POOR_QUARTZ: return PoorQuartz.spec.getValues();
                case POOR_REDSTONE: return PoorRedstone.spec.getValues();
                case POOR_RUNITE: return PoorRunite.spec.getValues();
                case POOR_SILVER: return PoorSilver.spec.getValues();
                case POOR_TIN: return PoorTin.spec.getValues();
                case POOR_URANIUM: return PoorUranium.spec.getValues();
                case POOR_WHITE_OPAL: return PoorWhiteOpal.spec.getValues();
                case POOR_XP: return PoorXp.spec.getValues();
                case POOR_ZINC: return PoorZinc.spec.getValues();
                case POOR_ARDITE: return PoorArdite.spec.getValues();
                case POOR_CHROME: return PoorChrome.spec.getValues();
                case POOR_DRACONIUM: return PoorDraconium.spec.getValues();
                case POOR_MANA_INFUSED: return PoorManaInfused.spec.getValues();
                case POOR_NITER: return PoorNiter.spec.getValues();
                case POOR_COBALT: return PoorCobalt.spec.getValues();
                case POOR_SULFUR: return PoorSulfur.spec.getValues();
                case POOR_ELECTROTINE: return PoorElectrotine.spec.getValues();
                case POOR_IMPERIUM: return PoorImperium.spec.getValues();
                case POOR_INFERIUM: return PoorInferium.spec.getValues();
                case POOR_INSANIUM: return PoorInsanium.spec.getValues();
                case POOR_PERIDOT: return PoorPeridot.spec.getValues();
                case POOR_PROSPERITY: return PoorProsperity.spec.getValues();
                case POOR_PRUDENTIUM: return PoorPrudentium.spec.getValues();
                case POOR_RUBY: return PoorRuby.spec.getValues();
                case POOR_SAPPHIRE: return PoorSapphire.spec.getValues();
                case POOR_SOULIUM: return PoorSoulium.spec.getValues();
                case POOR_SUPREMIUM: return PoorSupremium.spec.getValues();
                case POOR_TERTIUM: return PoorTertium.spec.getValues();
                case POOR_ZANITE: return PoorZanite.spec.getValues();
                case POOR_ANGLESITE: return PoorAnglesite.spec.getValues();
                case POOR_APATITE: return PoorApatite.spec.getValues();
                case POOR_BENITOITE: return PoorBenitoite.spec.getValues();
                case POOR_GALENA: return PoorGalena.spec.getValues();
                case POOR_PYRITE: return PoorPyrite.spec.getValues();
                case POOR_VULCANITE: return PoorVulcanite.spec.getValues();
                case POOR_TUNGSTEN: return PoorTungsten.spec.getValues();
                case POOR_YELLORITE: return PoorYellorite.spec.getValues();
                case POOR_STEEL: return PoorSteel.spec.getValues();
                case POOR_STICKY: return PoorSticky.spec.getValues();
                case POOR_LAVA_CRYSTAL: return PoorLavaCrystal.spec.getValues();
                case POOR_DIMENSIONAL_SHARD: return PoorDimensionalShard.spec.getValues();
                case POOR_BORON: return PoorBoron.spec.getValues();
                case POOR_MAGNESIUM: return PoorMagnesium.spec.getValues();
                case POOR_LITHIUM: return PoorLithium.spec.getValues();
                case POOR_THORIUM: return PoorThorium.spec.getValues();
                default: throw new IllegalArgumentException("For the ore '" + block + "' no config could be returned!");
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
