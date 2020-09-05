//package com.danny.dannys_ores.newMethod.contentTweakerMethod;
//
//import net.minecraft.resources.ResourcePackInfo;
//import net.minecraftforge.fml.common.thread.EffectiveSide;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class VanillaFactory {
//    private static final CustomRegistry registry = new CustomRegistry();
//
//    public static void complete() {
//        registry.getBlocksAsVanillaBlocks().forEach(value -> {
//            CraftTweakerAPI.logDebug("Registering Block '%s'", value.getRegistryName());
//            ForgeRegistries.BLOCKS.register(value);
//        });
//
//        registry.getItemsAsVanillaItems().forEach(value -> {
//            CraftTweakerAPI.logDebug("Registering Item '%s'", value.getRegistryName());
//            ForgeRegistries.ITEMS.register(value);
//        });
//
//        writeResourcePack();
//        writeDataPack();
//    }
//
//    private static void writeResourcePack() {
//        if(!EffectiveSide.get().isClient()) {
//            CraftTweakerAPI.logInfo("Skipping writing resources for ContentTweaker, because we are on a server");
//            return;
//        }
//
//        final ResourcePackInfo resourcePackInfo = ResourcePackInfo.get();
//        if(resourcePackInfo == null) {
//            CraftTweakerAPI.logInfo("Could not find resource loader mod, no resource pack will be generated!");
//            return;
//        }
//
//        resourcePackInfo.createResourcePackIfNotExists();
//        registry.getAssetResources()
//                .filter(w -> modIdsToGenerateStuffFor.contains(w.getModId()))
//                .forEach(w -> {
//                    w.writeContentUsing(resourcePackInfo.getResourcePackDirectory());
//                    w.onWrite();
//                });
//    }
//
//    private static void writeDataPack() {
//        final ResourcePackInfo resourcePackInfo = ResourcePackInfo.get();
//        if(resourcePackInfo == null) {
//            CraftTweakerAPI.logInfo("Could not find resource loader mod, no data pack will be generated!");
//            return;
//        }
//
//        resourcePackInfo.createDataPackIfNotExists();
//        registry.getDataResources()
//                .filter(w -> modIdsToGenerateStuffFor.contains(w.getModId()))
//                .forEach(w -> {
//                    w.writeContentUsing(resourcePackInfo.getDataPackDirectory());
//                    w.onWrite();
//                });
//    }
//}
