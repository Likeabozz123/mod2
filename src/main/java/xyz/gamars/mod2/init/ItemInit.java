package xyz.gamars.mod2.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.objects.items.ExplosionStickItem;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod2.MOD_ID);
    public static final CreativeModeTab materialsTab = TabInit.MATERIALS_TAB;

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().tab(materialsTab)));
    public static final RegistryObject<Item> TEST_STICK = ITEMS.register("test_stick", () -> new Item(new Item.Properties().tab(materialsTab)));

    public static final RegistryObject<Item> EXPLOSION_STICK = ITEMS.register("explosion_stick", () -> new ExplosionStickItem(new Item.Properties().tab(materialsTab)));

    public static final RegistryObject<Item> TEST_ORE_CHUNK = ITEMS.register("test_ore_chunk", () -> new Item(new Item.Properties().tab(materialsTab)));


    public static void register (IEventBus bus) {
        ITEMS.register(bus);
    }

}
