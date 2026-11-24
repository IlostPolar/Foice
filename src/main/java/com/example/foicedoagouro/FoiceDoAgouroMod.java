package com.example.foicedoagouro;

import com.example.foicedoagouro.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FoiceDoAgouroMod.MOD_ID)
public class FoiceDoAgouroMod {
    public static final String MOD_ID = "foicedoagouro";

    public FoiceDoAgouroMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(ModItems::addCreative);
    }
}
