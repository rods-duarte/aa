package net.rodsduarte.mythrilore.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rodsduarte.mythrilore.MythrilOreMod;
import net.rodsduarte.mythrilore.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MythrilOreMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.MYTHRIL_RAW);
        simpleItem(ModItems.MYTHRIL_INGOT);
        handheldItem(ModItems.MYTHRIL_SWORD);
        handheldItem(ModItems.MYTHRIL_PICKAXE);
        handheldItem(ModItems.MYTHRIL_AXE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated")).texture("layer0", new ResourceLocation(MythrilOreMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/handheld")).texture("layer0", new ResourceLocation(MythrilOreMod.MOD_ID, "item/" + item.getId().getPath()));
    }
    
}
