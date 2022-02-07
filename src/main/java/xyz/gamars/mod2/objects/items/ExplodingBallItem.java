package xyz.gamars.mod2.objects.items;

import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import xyz.gamars.mod2.objects.entities.ExplodingBallProjectile;

public class ExplodingBallItem extends Item {

    public ExplodingBallItem(Properties properties) {
        super(properties);
    }



    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemStack = player.getItemInHand(usedHand);

        if (level.isClientSide == false) {
            ExplodingBallProjectile explodingBallProjectile = new ExplodingBallProjectile(level, player);
            explodingBallProjectile.setItem(itemStack);
            explodingBallProjectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0f, 1.5f, 1.0f);
            level.addFreshEntity(explodingBallProjectile);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (player.getAbilities().instabuild == false) {
            itemStack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide);
    }
}
