package xyz.gamars.mod2.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.init.BlockInit;
import xyz.gamars.mod2.init.ItemInit;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(DataGenerator gen, String locale) {
        super(gen, Mod2.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {

        addCreativeTab("materials_tab", "Materials Tab");
        addCreativeTab("blocks_tab", "Blocks Tab");

        add(ItemInit.TEST_ITEM.get(), "Test Item");
        add(ItemInit.TEST_STICK.get(), "Test Stick");
        add(ItemInit.TEST_ORE_CHUNK.get(), "Test Ore Chunk");

        add(BlockInit.TEST_BLOCK_ITEM.get(), "Test Block");
        add(BlockInit.TEST_ORE_ITEM.get(), "Test Ore");
    }

    /*public LanguageProvider addItem (String id, String name) {
        id.toUpperCase();
        return add(ItemInit.id.get(), name);
    }*/

    public void addCreativeTab(String id, String name) {
        add("itemGroup." + id, name);
    }

    @Override
    public String getName() {
        return "Mod2 : Language";
    }
}
