package xyz.gamars.mod2.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeProvider;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Mod2 : Recipes";
    }
}
