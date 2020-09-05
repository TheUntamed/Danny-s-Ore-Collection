//package com.danny.dannys_ores.newMethod;
//
//import com.google.common.collect.ImmutableMap;
//import net.minecraft.item.crafting.ICraftingRecipe;
//import net.minecraft.item.crafting.IRecipe;
//import net.minecraft.item.crafting.IRecipeType;
//import net.minecraft.item.crafting.RecipeManager;
//import net.minecraft.resources.IResourceManager;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.world.storage.loot.LootTableManager;
//import net.minecraftforge.fml.server.ServerLifecycleHooks;
//import net.minecraftforge.resource.IResourceType;
//import net.minecraftforge.resource.ISelectiveResourceReloadListener;
//
//import java.util.*;
//import java.util.function.Predicate;
//
//public class DynamicDataPack implements ISelectiveResourceReloadListener {
//    private static final DynamicDataPack OBJ = new DynamicDataPack();
//
//    private DynamicDataPack() {
//
//    }
//
//    public static DynamicDataPack getInstance() {
//        return OBJ;
//    }
//
//    @Override
//    public void onResourceManagerReload(IResourceManager resourceManager, Predicate<IResourceType> resourcePredicate) {
//        LootTableManager ltm = ServerLifecycleHooks.getCurrentServer().getLootTableManager();
//        ltm.getLootTableKeys();
//
//
////        RecipeManager rm = ServerLifecycleHooks.getCurrentServer().getRecipeManager();
////        if (rm.getRecipes() instanceof ImmutableMap) {
////
////        }
////        List<ICraftingRecipe> list = new ArrayList<>();
////        Collection<IRecipe<?>> recipes = rm.getRecipes();
////        recipes.addAll(list);
//    }
//}
