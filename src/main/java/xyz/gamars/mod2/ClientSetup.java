package xyz.gamars.mod2;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import xyz.gamars.mod2.init.AdvancedBlockInit;
import xyz.gamars.mod2.init.EntityInit;
import xyz.gamars.mod2.objects.blocks.powergen.PowergenScreen;
import xyz.gamars.mod2.objects.entities.ExplodingBallProjectile;

@Mod.EventBusSubscriber(modid = Mod2.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(AdvancedBlockInit.POWERGEN_CONTAINER.get(), PowergenScreen::new);           // Attach our container to the screen
            ItemBlockRenderTypes.setRenderLayer(AdvancedBlockInit.POWERGEN_BLOCK.get(), RenderType.translucent()); // Set the render type for our power generator to translucent
        });
    }

    @SubscribeEvent
    public static void onRegisterRender(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.EXPLODING_BALL.get(), (entity) ->  {
            return new ThrownItemRenderer<>(entity, 16.0f, true);
        });

        event.registerEntityRenderer(EntityInit.GROWING_ARROW.get(), TippableArrowRenderer::new);
    }


}
