package xyz.gamars.mod2.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import xyz.gamars.mod2.init.BlockInit;
import xyz.gamars.mod2.init.ItemInit;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
                BlockInit.TEST_ORE_ITEM.get()),
                ItemInit.TEST_ITEM.get(),
                1.0f,
                100)
                .unlockedBy("has_ore", has(BlockInit.TEST_ORE_ITEM.get()))
                .save(consumer, "test_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
                ItemInit.TEST_ORE_CHUNK.get()),
                ItemInit.TEST_ITEM.get(),
                1.0f,
                100)
                .unlockedBy("has_chunk", has(ItemInit.TEST_ORE_CHUNK.get()))
                .save(consumer, "test_ingot2");

        ShapedRecipeBuilder.shaped(ItemInit.TEST_STICK.get())
                .define('#', ItemInit.TEST_STICK.get())
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_ingot", has(ItemInit.TEST_ITEM.get()))
                .save(consumer);
    }

    @Override
    public String getName() {
        return "Mod2 : Recipes";
    }
}
