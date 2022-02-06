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
    private static final ModToolMaterial testMaterial = ModToolMaterial.TEST;
    private static final CreativeModeTab toolsTab = TabInit.TOOLS_TAB;
    private static final int pickaxeDamageModifier = 1; private static final float pickaxeAttackSpeedModifier = -2.8f;
    private static final float axeDamageModifier = 5.0f; private static final float axeAttackSpeedModifier = -3.0f;
    private static final float shovelDamageModifier = 1.5f; private static final float shovelAttackSpeedModifier = -3.0F;
    private static final int swordDamageModifier = 3; private static final float swordAttackSpeedModifier = -2.4F;
    private static final int hoeDamageModifier = -4; private static final float hoeAttackSpeedModifier = 0.0F;

    public static RegistryObject<Item> TEST_PICKAXE = pickaxe("test_pickaxe", testMaterial, pickaxeDamageModifier, pickaxeAttackSpeedModifier, toolsTab);
    public static RegistryObject<Item> TEST_AXE = axe("test_axe", testMaterial, axeDamageModifier, axeAttackSpeedModifier, toolsTab);
    public static RegistryObject<Item> TEST_SHOVEL = shovel("test_shovel", testMaterial, shovelDamageModifier, shovelAttackSpeedModifier, toolsTab);
    public static RegistryObject<Item> TEST_SWORD = sword("test_sword", testMaterial, swordDamageModifier, swordAttackSpeedModifier, toolsTab);
    public static RegistryObject<Item> TEST_HOE = hoe("test_hoe", testMaterial, hoeDamageModifier, hoeAttackSpeedModifier, toolsTab);

    private static RegistryObject<Item> pickaxe(String id, Tier material, int damageModifier, float attackSpeedModifier, CreativeModeTab tab) {
        return TOOLS.register(id.toLowerCase(), () -> new PickaxeItem(material, damageModifier, attackSpeedModifier, new Item.Properties().tab(tab)));
    }
    private static RegistryObject<Item> axe(String id, Tier material, float damageModifier, float attackSpeedModifier, CreativeModeTab tab) {
        return TOOLS.register(id.toLowerCase(), () -> new AxeItem(material, damageModifier, attackSpeedModifier, new Item.Properties().tab(tab)));
    }
    private static RegistryObject<Item> shovel(String id, Tier material, float damageModifier, float attackSpeedModifier, CreativeModeTab tab) {
        return TOOLS.register(id.toLowerCase(), () -> new ShovelItem(material, damageModifier, attackSpeedModifier, new Item.Properties().tab(tab)));
    }
    private static RegistryObject<Item> sword(String id, Tier material, int damageModifier, float attackSpeedModifier, CreativeModeTab tab) {
        return TOOLS.register(id.toLowerCase(), () -> new SwordItem(material, damageModifier, attackSpeedModifier, new Item.Properties().tab(tab)));
    }
    private static RegistryObject<Item> hoe(String id, Tier material, int damageModifier, float attackSpeedModifier, CreativeModeTab tab) {
        return TOOLS.register(id.toLowerCase(), () -> new HoeItem(material, damageModifier, attackSpeedModifier, new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus bus) {
        TOOLS.register(bus);
    }


}
