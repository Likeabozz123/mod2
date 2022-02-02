package xyz.gamars.mod2.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod2.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().tab(TabInit.TEST_TAB)));
    public static final RegistryObject<Item> TEST_ITEM_2 = ITEMS.register("test_item_2", () -> new Item(new Item.Properties().tab(TabInit.TEST_TAB)));

    public static void register (IEventBus bus) {
        ITEMS.register(bus);
    }

}
