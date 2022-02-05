package xyz.gamars.mod2.data.generators.models;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
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
        builder("test_stick", itemGenerated);
        builder("test_ore_chunk", itemGenerated);

        /*
        builder("test_helmet", itemGenerated);
        builder("test_chestplate", itemGenerated);
        builder("test_leggings", itemGenerated);
        builder("test_boots", itemGenerated);
        */

        armorBuilder("test", itemGenerated);
        toolBuilder("test", itemHandheld);

        blockBuilder("test_block");
        blockBuilder("test_ore");

    }

    private ItemModelBuilder builder(String name, ModelFile parent) {
        return getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }

    private ItemModelBuilder blockBuilder(String name) {
        return withExistingParent(name, modLoc("block/" + name));
    }

    private void armorBuilder(String armorMaterial, ModelFile parent) {
        builder(armorMaterial + "_helmet", parent);
        builder(armorMaterial + "_chestplate", parent);
        builder(armorMaterial + "_leggings", parent);
        builder(armorMaterial + "_boots", parent);
    }

    private void toolBuilder(String toolMaterial, ModelFile parent) {
        builder(toolMaterial + "_pickaxe", parent);
        builder(toolMaterial + "_axe", parent);
        builder(toolMaterial + "_shovel", parent);
        builder(toolMaterial + "_sword", parent);
        builder(toolMaterial + "_hoe", parent);
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
