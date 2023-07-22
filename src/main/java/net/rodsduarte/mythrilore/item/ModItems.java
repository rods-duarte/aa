package net.rodsduarte.mythrilore.item;

import net.rodsduarte.mythrilore.MythrilOreMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MythrilOreMod.MOD_ID);

    public static final RegistryObject<Item> MYTHRIL_RAW = ITEMS.register("mythril_raw", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
