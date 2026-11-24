package com.example.foicedoagouro.registry;

import com.example.foicedoagouro.FoiceDoAgouroMod;
import com.example.foicedoagouro.item.FoiceDoAgouroItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoiceDoAgouroMod.MOD_ID);

    public static final RegistryObject<Item> FOICE_DO_AGOURO = ITEMS.register(
            "foice_do_agouro",
            () -> new FoiceDoAgouroItem(new Item.Properties())
    );

    private ModItems() {}

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(FOICE_DO_AGOURO);
        }
    }
}
