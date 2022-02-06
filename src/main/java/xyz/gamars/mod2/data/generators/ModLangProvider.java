package xyz.gamars.mod2.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.LanguageProvider;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.init.BlockInit;
import xyz.gamars.mod2.init.FoodInit;
import xyz.gamars.mod2.init.ItemInit;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(DataGenerator gen, String locale) {
        super(gen, Mod2.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {

        addCreativeTab("materials_tab", "Materials Tab");
        addCreativeTab("blocks_tab", "Blocks Tab");
        addCreativeTab("armor_tab", "Armor Tab");
        addCreativeTab("tools_tab", "Tools Tab");
        addCreativeTab("foods_tab", "Foods Tab");

        add(ItemInit.TEST_ITEM.get(), "Test Item");
        add(ItemInit.TEST_STICK.get(), "Test Stick");
        add(ItemInit.TEST_ORE_CHUNK.get(), "Test Ore Chunk");
        add(FoodInit.TEST_FOOD.get(), "Test Food");

        add(BlockInit.TEST_BLOCK_ITEM.get(), "Test Block");
        add(BlockInit.TEST_ORE_ITEM.get(), "Test Ore");

        addArmor("test");
        addTools("test");


    }

    /*public LanguageProvider addItem (String id, String name) {
        id.toUpperCase();
        return add(ItemInit.id.get(), name);
    }*/

    public void addCreativeTab(String id, String name) {
        add("itemGroup." + id, name);
    }

    private void addArmor(String armorMaterial) {
        String upperCaseArmorMaterial = armorMaterial.substring(0, 1).toUpperCase() + armorMaterial.substring(1);
        add("item.mod2." + armorMaterial + "_helmet", upperCaseArmorMaterial + " Helmet");
        add("item.mod2." + armorMaterial + "_chestplate", upperCaseArmorMaterial + " Chestplate");
        add("item.mod2." + armorMaterial + "_leggings", upperCaseArmorMaterial + " Leggings");
        add("item.mod2." + armorMaterial + "_boots", upperCaseArmorMaterial + " Boots");
    }

    private void addTools(String toolMaterial) {
        String upperCaseToolMaterial = toolMaterial.substring(0, 1).toUpperCase() + toolMaterial.substring(1);
        add("item.mod2." + toolMaterial + "_pickaxe", upperCaseToolMaterial + " Pickaxe");
        add("item.mod2." + toolMaterial + "_axe", upperCaseToolMaterial + " Axe");
        add("item.mod2." + toolMaterial + "_shovel", upperCaseToolMaterial + " Shovel");
        add("item.mod2." + toolMaterial + "_sword", upperCaseToolMaterial + " Sword");
        add("item.mod2." + toolMaterial + "_hoe", upperCaseToolMaterial + " Hoe");
    }




    @Override
    public String getName() {
        return "Mod2 : Language";
    }
}
