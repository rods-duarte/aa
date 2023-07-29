package net.rodsduarte.mythrilore.item;

import net.rodsduarte.mythrilore.MythrilOreMod;
import net.rodsduarte.mythrilore.item.custom.MythrilArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MythrilOreMod.MOD_ID);

    public static final RegistryObject<Item> MYTHRIL_RAW = ITEMS.register("mythril_raw", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_SWORD = ITEMS.register("mythril_sword", () -> new SwordItem(ModTiers.MYTHRIL, 6, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_PICKAXE = ITEMS.register("mythril_pickaxe", () -> new PickaxeItem(ModTiers.MYTHRIL, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_AXE = ITEMS.register("mythril_axe", () -> new AxeItem(ModTiers.MYTHRIL, 8, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_SHOVEL = ITEMS.register("mythril_shovel", () -> new ShovelItem(ModTiers.MYTHRIL, 1.5F, -3F, new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_HOE = ITEMS.register("mythril_hoe", () -> new HoeItem(ModTiers.MYTHRIL, -3, 0.0F, new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_HELMET = ITEMS.register("mythril_helmet", () -> new MythrilArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET, new Item.Properties()));
    
    public static final RegistryObject<Item> MYTHRIL_CHESTPLATE = ITEMS.register("mythril_chestplate", () -> new MythrilArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    
    public static final RegistryObject<Item> MYTHRIL_LEGGINGS = ITEMS.register("mythril_leggings", () -> new MythrilArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_BOOTS = ITEMS.register("mythril_boots", () -> new MythrilArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
