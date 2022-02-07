package xyz.gamars.mod2.objects.entities;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import xyz.gamars.mod2.init.EntityInit;
import xyz.gamars.mod2.init.ItemInit;

public class ExplodingBallProjectile extends ThrowableItemProjectile {

    public ExplodingBallProjectile(EntityType<? extends ExplodingBallProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public ExplodingBallProjectile(Level level, LivingEntity livingEntity) {
        super(EntityInit.EXPLODING_BALL.get(), livingEntity, level);
    }

    public ExplodingBallProjectile(Level level, double posX, double posY, double posZ) {
        super(EntityInit.EXPLODING_BALL.get(), posX, posY, posZ, level);
    }



    @Override
    protected void onHit(HitResult result) {

        if(level.isClientSide == false) {
            double x = result.getLocation().x;
            double y = result.getLocation().y;
            double z = result.getLocation().z;
            this.level.explode(this, x, y, z, 5.5f, Explosion.BlockInteraction.DESTROY);
        }

        this.level.broadcastEntityEvent(this, (byte)3);
        this.discard();
        super.onHit(result);
    }





    @Override
    protected Item getDefaultItem() {
        return ItemInit.THROWABLE_ITEM.get();
    }
}
