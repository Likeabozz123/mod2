package xyz.gamars.mod2.data.generators.models;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import xyz.gamars.mod2.Mod2;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Mod2.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        // withExistingParent(ItemInit.TEST_ITEM.get().getRegistryName().getPath(), modLoc("item/test_item"));

        builder("test_item", itemGenerated);
        builder("test_item_2", itemGenerated);


    }

    private ItemModelBuilder builder(String name, ModelFile parent) {
        return getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }

    private ItemModelBuilder blockBuilder(String name, ModelFile parent) {
        return getBuilder(name).parent(parent).texture("layer0", "block/" + name);
    }

    @NotNull
    @Override
    public String getName() {
        return "Mod2 : Item Models";
    }
}
