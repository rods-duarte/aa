package net.rodsduarte.mythrilore.datagen;


import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import net.rodsduarte.mythrilore.MythrilOreMod;
import net.rodsduarte.mythrilore.block.ModBlocks;
import net.rodsduarte.mythrilore.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.MYTHRIL_RAW.get()), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 1.5f, 240, "mythril_ingot");

        oreBlasting(consumer, List.of(ModItems.MYTHRIL_RAW.get()), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 1.5f, 120, "mythril_ingot");

        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 1.5f, 240, "mythril_ingot");

        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_MYTHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 1.5f, 120, "mythril_ingot");

        oreSmelting(consumer, List.of(ModBlocks.MYTHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 1.5f, 240, "mythril_ingot");

        oreBlasting(consumer, List.of(ModBlocks.MYTHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 1.5f, 120, "mythril_ingot");

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.MYTHRIL_INGOT.get(), RecipeCategory.MISC, ModBlocks.MYTHRIL_BLOCK.get());

        // TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MYTHRIL_SWORD.get()).define('M', ModItems.MYTHRIL_INGOT.get()).define('S', Items.STICK).pattern(" M ").pattern(" M ").pattern(" S ").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MYTHRIL_PICKAXE.get()).define('M', ModItems.MYTHRIL_INGOT.get()).define('S', Items.STICK).pattern("MMM").pattern(" S ").pattern(" S ").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);
        
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MYTHRIL_AXE.get()).define('M', ModItems.MYTHRIL_INGOT.get()).define('S', Items.STICK).pattern("MM ").pattern("MS ").pattern(" S ").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MYTHRIL_SHOVEL.get()).define('M', ModItems.MYTHRIL_INGOT.get()).define('S', Items.STICK).pattern(" M ").pattern(" S ").pattern(" S ").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MYTHRIL_HOE.get()).define('M', ModItems.MYTHRIL_INGOT.get()).define('S', Items.STICK).pattern("MM ").pattern(" S ").pattern(" S ").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);

        // ARMOR
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MYTHRIL_HELMET.get()).define('M', ModItems.MYTHRIL_INGOT.get()).pattern("MMM").pattern("M M").pattern("   ").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MYTHRIL_CHESTPLATE.get()).define('M', ModItems.MYTHRIL_INGOT.get()).pattern("M M").pattern("MMM").pattern("MMM").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MYTHRIL_LEGGINGS.get()).define('M', ModItems.MYTHRIL_INGOT.get()).pattern("MMM").pattern("M M").pattern("M M").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MYTHRIL_BOOTS.get()).define('M', ModItems.MYTHRIL_INGOT.get()).pattern("   ").pattern("M M").pattern("M M").unlockedBy("has_mythril_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MYTHRIL_INGOT.get()).build())).save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> consumer, List<ItemLike> itemList, RecipeCategory recipeCategory, ItemLike item, float xpValue, int timeToCook, String groupName) {
      oreCooking(consumer, RecipeSerializer.SMELTING_RECIPE, itemList, recipeCategory, item, xpValue, timeToCook, groupName, "_from_smelting");
   }

   protected static void oreBlasting(Consumer<FinishedRecipe> consumer, List<ItemLike> itemList, RecipeCategory recipeCategory, ItemLike item, float xpValue, int timeToCook, String groupName) {
      oreCooking(consumer, RecipeSerializer.BLASTING_RECIPE, itemList, recipeCategory, item, xpValue, timeToCook, groupName, "_from_blasting");
   }

   protected static void oreCooking(Consumer<FinishedRecipe> consumer, RecipeSerializer<? extends AbstractCookingRecipe> serializer, List<ItemLike> itemList, RecipeCategory recipeCategory, ItemLike item, float xpValue, int timeToCook, String groupName, String cookSource) {
      Iterator var9 = itemList.iterator();

      while(var9.hasNext()) {
         ItemLike itemlike = (ItemLike)var9.next();
         SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), recipeCategory, item, xpValue, timeToCook, serializer).group(groupName).unlockedBy(getHasName(itemlike), has(itemlike)).save(consumer, new ResourceLocation(MythrilOreMod.MOD_ID, getItemName(item)) + cookSource + "_" + getItemName(itemlike));
      }

   }

   protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> consumer, RecipeCategory firstRecipeCategory, ItemLike firstItem, RecipeCategory secondRecipeCategory, ItemLike secondItem) {
    nineBlockStorageRecipes(consumer, firstRecipeCategory, firstItem, secondRecipeCategory, secondItem, getSimpleRecipeName(secondItem), (String)null, getSimpleRecipeName(firstItem), (String)null);
 }

   protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> consumer, RecipeCategory firstRecipeCategory, ItemLike firstItem, RecipeCategory secondRecipeCategory, ItemLike secondItem, String firstRecipeName, @javax.annotation.Nullable String fisrtGroupName, String secondRecipeName, @javax.annotation.Nullable String secondGroupName) {
      ShapelessRecipeBuilder.shapeless(firstRecipeCategory, firstItem, 9).requires(secondItem).group(secondGroupName).unlockedBy(getHasName(secondItem), has(secondItem)).save(consumer, new ResourceLocation(MythrilOreMod.MOD_ID, secondRecipeName));
      ShapedRecipeBuilder.shaped(secondRecipeCategory, secondItem).define('#', firstItem).pattern("###").pattern("###").pattern("###").group(fisrtGroupName).unlockedBy(getHasName(firstItem), has(firstItem)).save(consumer, new ResourceLocation(MythrilOreMod.MOD_ID, firstRecipeName));
   }
    
}
