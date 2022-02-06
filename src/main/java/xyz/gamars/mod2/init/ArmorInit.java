package xyz.gamars.mod2.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
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

    public static RegistryObject<Item> TEST_HELMET = helmet("test_helmet", ModArmorMaterials.TEST, TabInit.ARMOR_TAB);
    public static RegistryObject<Item> TEST_CHESTPLATE = chestplate("test_chestplate", ModArmorMaterials.TEST, TabInit.ARMOR_TAB);
    public static RegistryObject<Item> TEST_LEGGINGS = leggings("test_leggings", ModArmorMaterials.TEST, TabInit.ARMOR_TAB);
    public static RegistryObject<Item> TEST_BOOTS = boots("test_boots", ModArmorMaterials.TEST, TabInit.ARMOR_TAB);



    public static RegistryObject<Item> helmet(String id, ArmorMaterial material, CreativeModeTab tab) {
        return ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.HEAD, new Item.Properties().tab(tab)));
    }
    public static RegistryObject<Item> chestplate(String id, ArmorMaterial material, CreativeModeTab tab) {
        return ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.CHEST, new Item.Properties().tab(tab)));
    }
    public static RegistryObject<Item> leggings(String id, ArmorMaterial material, CreativeModeTab tab) {
        return ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.LEGS, new Item.Properties().tab(tab)));
    }
    public static RegistryObject<Item> boots(String id, ArmorMaterial material, CreativeModeTab tab) {
        return ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.FEET, new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus bus) {
        ARMOR.register(bus);
    }



    // doesn't work unless inside a method or called
    /*public static void makeHelmet(RegistryObject<Item> name, String id, ArmorMaterial material, CreativeModeTab tab) {
        name = ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.HEAD, new Item.Properties().tab(tab)));
    }
    public static void makeChestplate(RegistryObject<Item> name, String id, ArmorMaterial material, CreativeModeTab tab) {
        name = ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.CHEST, new Item.Properties().tab(tab)));
    }
    public static void makeLeggings(RegistryObject<Item> name, String id, ArmorMaterial material, CreativeModeTab tab) {
        name = ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.LEGS, new Item.Properties().tab(tab)));
    }
    public static void makeBoots(RegistryObject<Item> name, String id, ArmorMaterial material, CreativeModeTab tab) {
        name = ARMOR.register(id.toLowerCase(), () -> new ArmorItem(material, EquipmentSlot.FEET, new Item.Properties().tab(tab)));
    }*/

}
