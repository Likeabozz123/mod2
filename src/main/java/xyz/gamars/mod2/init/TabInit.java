package xyz.gamars.mod2.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TabInit extends CreativeModeTab{

    public static final CreativeModeTab TEST_TAB = new TabInit("Test Tab");

    public TabInit(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.TEST_ITEM.get());
    }
}
