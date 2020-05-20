package com.danny.dannys_ores.dataGen;

import com.danny.dannys_ores.Main;
import com.danny.dannys_ores.blocks.BaseBlock;
import com.danny.dannys_ores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Objects;

public class BlockModelsDataGen extends BlockModelProvider {

    @ObjectHolder("quark:basalt")
    public static final Block QUARK_BASALT = null;
    @ObjectHolder("quark:limestone")
    public static final Block QUARK_LIMESTONE = null;
    @ObjectHolder("quark:jasper")
    public static final Block QUARK_JASPER = null;
    @ObjectHolder("quark:marble")
    public static final Block QUARK_MARBLE = null;
    @ObjectHolder("quark:slate")
    public static final Block QUARK_SLATE = null;
    @ObjectHolder("embellishcraft:basalt")
    public static final Block EMBELLISHCRAFT_BASALT = null;
    @ObjectHolder("embellishcraft:gneiss")
    public static final Block EMBELLISHCRAFT_GNEISS = null;
    @ObjectHolder("embellishcraft:jade")
    public static final Block EMBELLISHCRAFT_JADE = null;
    @ObjectHolder("embellishcraft:larvikite")
    public static final Block EMBELLISHCRAFT_LARVIKITE = null;
    @ObjectHolder("embellishcraft:marble")
    public static final Block EMBELLISHCRAFT_MARBLE = null;
    @ObjectHolder("embellishcraft:slate")
    public static final Block EMBELLISHCRAFT_SLATE = null;

    public BlockModelsDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        Main.LOGGER.debug("registerBlockModels");
        for (RegistryObject<Block> blockRO : BlockInit.BLOCKS.getEntries()) {
            Block block = blockRO.get();
            Block fillerBlock;
                if (block instanceof BaseBlock) {
                    fillerBlock = ((BaseBlock) block).getBlockBase();
                    String fillerBlockName;
                    String blockName = block.getRegistryName().toString().split(":")[1];
                    //When the fillerblock is from another mod it is unknown and the name has to be created by stringsplitting
                    //that's not fancy but it only has to generate the jsons once.
                    if (fillerBlock == null) {
                        String[] name = blockName.split("_", 3);
                        fillerBlockName = name[0] + "_" + name[1];
                    } else {
                        ResourceLocation resLoc = fillerBlock.getRegistryName();
                        fillerBlockName = resLoc.toString().split(":")[1];
                    }
                    String typeName = blockName.replace(fillerBlockName + "_", "");
                    if (blockName.contains("_anglesite_") || blockName.contains("_benitoite_") || blockName.contains("_draconium_")) {
                        fillerBlockName += "_array_10";
                    } else if (blockName.contains("_yellorite_")) {
                        fillerBlockName += "_array_06";
                    } else if (blockName.contains("_xp_")) {
                        fillerBlockName += "_array_02";
                    }
                    doubleTextureBlock(block, "block/" + fillerBlockName, "block/" + typeName);
            }
        }

    }

    public void doubleTextureBlock(Block block, String textureBackground, String textureOverlay) {
        getBuilder(block.getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(modLoc("block/cube_overlayed"))).texture("base", textureBackground).texture("overlay", textureOverlay);

        Main.LOGGER.debug("Creating block models model for " + block.getRegistryName());
    }

    @Override
    public String getName() { return "Danny's Ores - Block Models"; }
}
