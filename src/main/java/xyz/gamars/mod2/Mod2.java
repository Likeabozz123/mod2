package xyz.gamars.mod2;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.gamars.mod2.init.BlockInit;
import xyz.gamars.mod2.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mod2.MOD_ID)
public class Mod2 {
    public static final String MOD_ID = "mod2";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Mod2() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        bus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {
    }

}
