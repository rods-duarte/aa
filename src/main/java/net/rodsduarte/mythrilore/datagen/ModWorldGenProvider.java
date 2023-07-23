package net.rodsduarte.mythrilore.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.rodsduarte.mythrilore.MythrilOreMod;
import net.rodsduarte.mythrilore.worldgen.ModPlacedFeatures;
import net.rodsduarte.mythrilore.worldgen.ModConfiguredFeatures;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    
 
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures.REGISTERY)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MythrilOreMod.MOD_ID));
    }
}
