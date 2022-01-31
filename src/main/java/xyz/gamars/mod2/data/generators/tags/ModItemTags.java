package xyz.gamars.mod2.data.generators.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import xyz.gamars.mod2.Mod2;

public class ModItemTags extends ItemTagsProvider {
    public ModItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, pBlockTagsProvider, Mod2.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        super.addTags();
    }

    @Override
    public String getName() {
        return "Mod2 : Item Tags";
    }
}
