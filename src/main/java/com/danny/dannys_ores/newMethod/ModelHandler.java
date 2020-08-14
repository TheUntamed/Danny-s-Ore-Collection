package com.danny.dannys_ores.newMethod;

import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Map;

public class ModelHandler {

    @SubscribeEvent
    public void onModelBake(ModelBakeEvent event) {

        Map<ResourceLocation, IBakedModel> registry = event.getModelRegistry();
        ModelBakery bakery = event.getModelLoader();

    }
}
