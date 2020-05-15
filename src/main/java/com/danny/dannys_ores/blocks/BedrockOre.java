package com.danny.dannys_ores.blocks;

import com.danny.dannys_ores.configs.*;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BedrockOre extends Block {
    public BedrockOre(Block.Properties properties) {
        super(properties);
    }

    /**
     * This method was inspired by the Carbonado mod (by InsaneGames_)
     * https://www.curseforge.com/minecraft/mc-mods/carbonado
     *
     * @param worldIn A World instance
     * @param pos The position of the destroyed block.
     * @param explosionIn A Explosion
     */
    @Override
    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {
        if (General.replaceBedrockOreWithBedrockOnExplosion.get()) {
            worldIn.setBlockState(pos, Blocks.BEDROCK.getDefaultState(), 3);
        }
        worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 2.0f, 1.5f);
    }

    /**
     *  The resistance for bedrock ores can be defined via config.
     *  This method can be called on a bedrock ore block to return the corresponding resistance.
     *
     * @return The resistance of the block.
     */
    @SuppressWarnings("deprecation")
    @Override
    public float getExplosionResistance() {

        if (this == BlockInit.BEDROCK_ALUMINUM_ORE.get()) { return Aluminum.resistanceBedrockAluminumOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_COAL_ORE.get()) { return Coal.resistanceBedrockCoalOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_COPPER_ORE.get()) { return Copper.resistanceBedrockCopperOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_DIAMOND_ORE.get()) { return Diamond.resistanceBedrockDiamondOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_EMERALD_ORE.get()) { return Emerald.resistanceBedrockEmeraldOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_GOLD_ORE.get()) { return Gold.resistanceBedrockGoldOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_IRIDIUM_ORE.get()) { return Iridium.resistanceBedrockIridiumOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_IRON_ORE.get()) { return Iron.resistanceBedrockIronOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_LAPIS_ORE.get()) { return Lapis.resistanceBedrockLapisOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_LEAD_ORE.get()) { return Lead.resistanceBedrockLeadOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_PLATINUM_ORE.get()) { return Platinum.resistanceBedrockPlatinumOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_QUARTZ_ORE.get()) { return Quartz.resistanceBedrockQuartzOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_REDSTONE_ORE.get()) { return Redstone.resistanceBedrockRedstoneOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_SILVER_ORE.get()) { return Silver.resistanceBedrockSilverOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_TIN_ORE.get()) { return Tin.resistanceBedrockTinOre.get().floatValue(); }
        else if (this == BlockInit.BEDROCK_URANIUM_ORE.get()) { return Uranium.resistanceBedrockUraniumOre.get().floatValue(); }
        else {
            return this.blockResistance;
        }
    }
}
