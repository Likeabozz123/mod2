package xyz.gamars.mod2.objects.entities;

import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.minecraft.client.renderer.entity.GiantMobRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.client.event.EntityRenderersEvent;
import xyz.gamars.mod2.ClientSetup;

public class GrowingArrowProjectile extends Arrow {

    public GrowingArrowProjectile(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public GrowingArrowProjectile(Level level, double posX, double posY, double posZ) {
        super(level, posX, posY, posZ);
    }

    public GrowingArrowProjectile(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }


    //TRY TO MAKE ENTITY GROW BIGGER WHEN HIT BY THIS ARROW

    @Override
    protected void onHitEntity(EntityHitResult result) {

        if(level.isClientSide == false) {
            Entity entity = result.getEntity();
            makeEntityBigger(new EntityRenderersEvent.RegisterRenderers(), entity.getType());

        }

        this.discard();
        super.onHitEntity(result);
    }

    public static void makeEntityBigger(EntityRenderersEvent.RegisterRenderers event, EntityType entity) {
        event.registerEntityRenderer(entity, (e) -> {
            return new GiantMobRenderer(e, 1f);
        });

    }

}
