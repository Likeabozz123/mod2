package xyz.gamars.mod2.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import xyz.gamars.mod2.init.*;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    // CRAFTING RECIPES
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe/*?*/> consumer) {
        buildSmeltingRecipes(consumer);

        stickFormat(ItemInit.TEST_ITEM.get(), ItemInit.TEST_STICK.get(), consumer);
        ringWithCenterFormat(ItemInit.TEST_ITEM.get(), Items.APPLE, FoodInit.TEST_FOOD.get(), consumer);

        pickaxeFormat(ItemInit.TEST_ITEM.get(), ItemInit.TEST_STICK.get(), ToolInit.TEST_PICKAXE.get(),  consumer);
        axeFormat(ItemInit.TEST_ITEM.get(), ItemInit.TEST_STICK.get(), ToolInit.TEST_AXE.get(),  consumer);
        shovelFormat(ItemInit.TEST_ITEM.get(), ItemInit.TEST_STICK.get(), ToolInit.TEST_SHOVEL.get(),  consumer);
        swordFormat(ItemInit.TEST_ITEM.get(), ItemInit.TEST_STICK.get(), ToolInit.TEST_SWORD.get(),  consumer);
        hoeFormat(ItemInit.TEST_ITEM.get(), ItemInit.TEST_STICK.get(), ToolInit.TEST_HOE.get(),  consumer);

        helmetFormat(ItemInit.TEST_ITEM.get(), ArmorInit.TEST_HELMET.get(), consumer);
        chestplateFormat(ItemInit.TEST_ITEM.get(), ArmorInit.TEST_CHESTPLATE.get(), consumer);
        leggingsFormat(ItemInit.TEST_ITEM.get(), ArmorInit.TEST_LEGGINGS.get(), consumer);
        bootsFormat(ItemInit.TEST_ITEM.get(), ArmorInit.TEST_BOOTS.get(), consumer);
    }

    // SMELTING RECIPES
    public void buildSmeltingRecipes (Consumer<FinishedRecipe> consumer) {
        inputOutput(BlockInit.TEST_ORE_ITEM.get(), ItemInit.TEST_ITEM.get(), 1.0f, 100, "test_ingot1", consumer);
        inputOutput(ItemInit.TEST_ORE_CHUNK.get(), ItemInit.TEST_ITEM.get(), 1.0f, 100, "test_ingot2", consumer);
    }

    public static void inputOutput(ItemLike input, ItemLike output, float experience, int cookingTime, String recipeID, Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(
                        input),
                        output,
                        experience,
                        cookingTime)
                .unlockedBy("has_chunk", has(input))
                .save(consumer, recipeID);
    }

    public static void stickFormat(ItemLike input, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', input)
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_ingot", has(input))
                .save(consumer);
    }

    public static void pickaxeFormat(ItemLike material, ItemLike stick, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .define('/', stick)
                .pattern("###")
                .pattern(" / ")
                .pattern(" / ")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void axeFormat(ItemLike material, ItemLike stick, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .define('/', stick)
                .pattern("## ")
                .pattern("#/ ")
                .pattern(" / ")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void shovelFormat(ItemLike material, ItemLike stick, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .define('/', stick)
                .pattern(" # ")
                .pattern(" / ")
                .pattern(" / ")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void swordFormat(ItemLike material, ItemLike stick, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .define('/', stick)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" / ")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void hoeFormat(ItemLike material, ItemLike stick, ItemLike output,  Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .define('/', stick)
                .pattern("## ")
                .pattern(" / ")
                .pattern(" / ")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void helmetFormat(ItemLike material, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void chestplateFormat(ItemLike material, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void leggingsFormat(ItemLike material, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void bootsFormat(ItemLike material, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void ringFormat(ItemLike material, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }

    public static void ringWithCenterFormat(ItemLike material, ItemLike material2, ItemLike output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(output)
                .define('#', material)
                .define('/', material2)
                .pattern("###")
                .pattern("#/#")
                .pattern("###")
                .unlockedBy("has_ingot", has(material))
                .save(consumer);
    }



    @Override
    public String getName() {
        return "Mod2 : Recipes";
    }
}
