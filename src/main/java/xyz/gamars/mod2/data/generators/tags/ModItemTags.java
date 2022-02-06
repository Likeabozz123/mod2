package xyz.gamars.mod2.data.generators.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.init.BlockInit;
import xyz.gamars.mod2.init.ItemInit;
import xyz.gamars.mod2.init.ToolInit;

public class ModItemTags extends ItemTagsProvider {
    public ModItemTags(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, pBlockTagsProvider, Mod2.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.INGOTS)
                .add(ItemInit.TEST_ITEM.get())

        ;
        tag(Tags.Items.RAW_MATERIALS)
                .add(ItemInit.TEST_ORE_CHUNK.get())

        ;
        tag(Tags.Items.ORES)
                .add(BlockInit.TEST_BLOCK_ITEM.get())

        ;

        tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ToolInit.TEST_PICKAXE.get())

        ;

    }

    @Override
    public String getName() {
        return "Mod2 : Item Tags";
    }
}
