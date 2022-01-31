package xyz.gamars.mod2.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        super.buildCraftingRecipes(pFinishedRecipeConsumer);
    }

    @Override
    public String getName() {
        return "Mod2 : Recipes";
    }
}
