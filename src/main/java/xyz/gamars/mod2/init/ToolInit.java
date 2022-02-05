package xyz.gamars.mod2.init;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.extra.ModToolMaterial;

public class ToolInit {

    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod2.MOD_ID);

    public static RegistryObject<Item> TEST_PICKAXE = TOOLS.register("test_pickaxe", () -> new PickaxeItem(
            ModToolMaterial.TEST,
            1,
            -2.8f,
            new Item.Properties().tab(TabInit.TOOLS_TAB)));
    public static RegistryObject<Item> TEST_AXE = TOOLS.register("test_axe", () -> new AxeItem(
            ModToolMaterial.TEST,
            5.0f,
            -3.0f,
            new Item.Properties().tab(TabInit.TOOLS_TAB)));
    public static RegistryObject<Item> TEST_SHOVEL = TOOLS.register("test_shovel", () -> new ShovelItem(
            ModToolMaterial.TEST,
            1.5f,
            -3.0f,
            new Item.Properties().tab(TabInit.TOOLS_TAB)));
    public static RegistryObject<Item> TEST_SWORD = TOOLS.register("test_sword", () -> new SwordItem(
            ModToolMaterial.TEST,
            3,
            -2.4f,
            new Item.Properties().tab(TabInit.TOOLS_TAB)));
    public static RegistryObject<Item> TEST_HOE = TOOLS.register("test_hoe", () -> new HoeItem(
            ModToolMaterial.TEST,
            -3,
            0,
            new Item.Properties().tab(TabInit.TOOLS_TAB)));


    public static void register(IEventBus bus) {
        TOOLS.register(bus);
    }


}
