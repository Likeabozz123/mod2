package xyz.gamars.mod2.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabInit{

    public static final CreativeModeTab MATERIALS_TAB = new CreativeModeTab("materials_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.TEST_ITEM.get());
        }
    };

    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab("blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.TEST_BLOCK_ITEM.get());
        }
    };

}
