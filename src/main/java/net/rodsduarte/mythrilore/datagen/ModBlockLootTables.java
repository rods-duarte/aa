package net.rodsduarte.mythrilore.datagen;

import java.util.Set;

import net.rodsduarte.mythrilore.block.ModBlocks;
import net.rodsduarte.mythrilore.item.ModItems;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.MYTHRIL_BLOCK.get());

        add(ModBlocks.MYTHRIL_ORE.get(), (block) -> createOreDrop(ModBlocks.MYTHRIL_ORE.get(), ModItems.MYTHRIL_RAW.get()));
        add(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get(), (block) -> createOreDrop(ModBlocks.MYTHRIL_ORE.get(), ModItems.MYTHRIL_RAW.get()));
    }
    
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
