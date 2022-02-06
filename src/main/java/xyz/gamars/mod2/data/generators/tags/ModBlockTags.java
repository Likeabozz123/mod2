package xyz.gamars.mod2.data.generators.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.init.AdvancedBlockInit;
import xyz.gamars.mod2.init.BlockInit;

public class ModBlockTags extends BlockTagsProvider {
    public ModBlockTags(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, Mod2.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(BlockInit.TEST_BLOCK.get())

        ;
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.TEST_BLOCK.get())
                .add(BlockInit.TEST_ORE.get())
                .add(AdvancedBlockInit.POWERGEN_BLOCK.get());

        ;
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.TEST_BLOCK.get())
                .add(BlockInit.TEST_ORE.get())
                .add(AdvancedBlockInit.POWERGEN_BLOCK.get());

        ;
        tag(Tags.Blocks.ORES)
                .add(BlockInit.TEST_ORE.get())

        ;

    }

    @Override
    public String getName() {
        return "Mod2 : Block Tags";
    }
}
