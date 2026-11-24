package com.example.foicedoagouro.client.model;

import com.example.foicedoagouro.FoiceDoAgouroMod;
import com.example.foicedoagouro.item.FoiceDoAgouroItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FoiceDoAgouroModel extends GeoModel<FoiceDoAgouroItem> {
    @Override
    public ResourceLocation getModelResource(FoiceDoAgouroItem animatable) {
        return new ResourceLocation(FoiceDoAgouroMod.MOD_ID, "geo/foice_do_agouro.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FoiceDoAgouroItem animatable) {
        return new ResourceLocation(FoiceDoAgouroMod.MOD_ID, "textures/item/foice_do_agouro.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FoiceDoAgouroItem animatable) {
        return new ResourceLocation(FoiceDoAgouroMod.MOD_ID, "animations/foice_do_agouro.animation.json");
    }
}
