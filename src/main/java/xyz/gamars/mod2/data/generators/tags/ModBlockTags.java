package xyz.gamars.mod2.data.generators.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import xyz.gamars.mod2.Mod2;

public class ModBlockTags extends BlockTagsProvider {
    public ModBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, Mod2.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        super.addTags();
    }

    @Override
    public String getName() {
        return "Mod2 : Block Tags";
    }
}
