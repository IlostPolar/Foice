package com.example.foicedoagouro.client.renderer;

import com.example.foicedoagouro.client.model.FoiceDoAgouroModel;
import com.example.foicedoagouro.item.FoiceDoAgouroItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FoiceDoAgouroRenderer extends GeoItemRenderer<FoiceDoAgouroItem> {
    public FoiceDoAgouroRenderer() {
        super(new FoiceDoAgouroModel());
    }
}
