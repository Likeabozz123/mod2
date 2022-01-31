package xyz.gamars.mod2.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.init.ItemInit;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(DataGenerator gen, String locale) {
        super(gen, Mod2.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ItemInit.TEST_ITEM.get(), "Test Item");
        add(ItemInit.TEST_ITEM_2.get(), "Test Item 2");
    }

    /*public LanguageProvider addItem (String id, String name) {
        id.toUpperCase();
        return add(ItemInit.id.get(), name);
    }*/

    @Override
    public String getName() {
        return "Mod2 : Language";
    }
}
