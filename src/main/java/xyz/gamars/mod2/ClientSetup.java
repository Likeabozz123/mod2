package xyz.gamars.mod2;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import xyz.gamars.mod2.init.AdvancedBlockInit;
import xyz.gamars.mod2.objects.blocks.powergen.PowergenScreen;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(AdvancedBlockInit.POWERGEN_CONTAINER.get(), PowergenScreen::new);           // Attach our container to the screen
            ItemBlockRenderTypes.setRenderLayer(AdvancedBlockInit.POWERGEN_BLOCK.get(), RenderType.translucent()); // Set the render type for our power generator to translucent
        });
    }

}
