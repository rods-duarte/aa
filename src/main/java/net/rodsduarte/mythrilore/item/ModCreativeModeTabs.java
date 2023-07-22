package net.rodsduarte.mythrilore.item;

import net.rodsduarte.mythrilore.MythrilOreMod;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythrilOreMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MYTHRIL_ORE_MOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MYTHRIL_ORE_MOD_TAB = event.registerCreativeModeTab(new ResourceLocation(MythrilOreMod.MOD_ID, "mythril_ore_mod_tab"), builder -> builder.icon(() -> new ItemStack(ModItems.MYTHRIL_INGOT.get())).title(Component.translatable("creativemodetab.mythril_ore_mod_tab")));
    }
}
