package xyz.gamars.mod2.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.objects.ModFoods;

public class FoodInit {

    public static final DeferredRegister<Item> FOOD = DeferredRegister.create(ForgeRegistries.ITEMS, Mod2.MOD_ID);

    public static RegistryObject<Item> TEST_FOOD = FOOD.register("test_food", () ->
            new Item(new Item.Properties()
                    .tab(TabInit.FOODS_TAB)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(5.5f).alwaysEat().fast().build() /*ModFoods.TEST_FOOD*/)));

    public static void register(IEventBus bus) {
        FOOD.register(bus);
    }


}
