package xyz.gamars.mod2.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabInit {

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

    public static final CreativeModeTab ARMOR_TAB = new CreativeModeTab("armor_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ArmorInit.TEST_CHESTPLATE.get());
        }
    };

    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("tools_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ToolInit.TEST_PICKAXE.get());
        }
    };

    public static final CreativeModeTab FOODS_TAB = new CreativeModeTab("foods_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoodInit.TEST_FOOD.get());
        }
    };

    public static final CreativeModeTab ADVANCED_BLOCKS_TAB = new CreativeModeTab("advanced_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AdvancedBlockInit.POWERGEN_BLOCK_ITEM.get());
        }
    };


}
