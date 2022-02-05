package xyz.gamars.mod2.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.extra.ModArmorMaterials;

public class ArmorInit {

    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, Mod2.MOD_ID);

    private static ModArmorMaterials armorMaterials;

    public static RegistryObject<Item> TEST_HELMET = ARMOR.register("test_helmet", () -> new ArmorItem(
            ModArmorMaterials.TEST,
            EquipmentSlot.HEAD,
            new Item.Properties().tab(TabInit.ARMOR_TAB)));
    public static RegistryObject<Item> TEST_CHESTPLATE = ARMOR.register("test_chestplate", () -> new ArmorItem(
            ModArmorMaterials.TEST,
            EquipmentSlot.CHEST,
            new Item.Properties().tab(TabInit.ARMOR_TAB)));
    public static RegistryObject<Item> TEST_LEGGINGS = ARMOR.register("test_leggings", () -> new ArmorItem(
            ModArmorMaterials.TEST,
            EquipmentSlot.LEGS,
            new Item.Properties().tab(TabInit.ARMOR_TAB)));
    public static RegistryObject<Item> TEST_BOOTS = ARMOR.register("test_boots", () -> new ArmorItem(
            ModArmorMaterials.TEST,
            EquipmentSlot.FEET,
            new Item.Properties().tab(TabInit.ARMOR_TAB)));


    public static void register(IEventBus bus) {
        ARMOR.register(bus);
    }


}
