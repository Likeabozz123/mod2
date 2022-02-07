package xyz.gamars.mod2.objects.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Explosion;

public class ExplosionStickItem extends Item {

    public ExplosionStickItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(!context.getLevel().isClientSide) {
            BlockPos blockPos = context.getClickedPos();
            Player player = context.getPlayer();
            if (context.getLevel().isClientSide == false) {
                context.getLevel().explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 5.5f, Explosion.BlockInteraction.DESTROY);
            }

        }

        return super.useOn(context);
    }


}
