package xyz.gamars.mod2.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.gamars.mod2.Mod2;

public class ToolInit {

    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod2.MOD_ID);




    public static void register(IEventBus bus) {
        TOOLS.register(bus);
    }


}
