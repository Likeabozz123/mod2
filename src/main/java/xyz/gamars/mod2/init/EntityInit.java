package xyz.gamars.mod2.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.objects.entities.ExplodingBallProjectile;
import xyz.gamars.mod2.objects.entities.GrowingArrowProjectile;

import java.util.function.Supplier;


public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Mod2.MOD_ID);

/*    public static final RegistryObject<EntityType<ExplodingBallProjectile>> EXPLODING_BALL = ENTITIES.register("exploding_ball",
            () -> EntityType.Builder.of(ExplodingBallProjectile::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .updateInterval(10)
                    .clientTrackingRange(4)
                    .build("exploding_ball"));*/

    public static RegistryObject<EntityType<ExplodingBallProjectile>> EXPLODING_BALL = ENTITIES.register("exploding_ball",
            () -> EntityType.Builder.<ExplodingBallProjectile>of(ExplodingBallProjectile::new, MobCategory.MISC)
                    .sized(1f, 1f)
                    .updateInterval(10)
                    .clientTrackingRange(4)
                    .build("exploding_ball"));

    public static RegistryObject<EntityType<GrowingArrowProjectile>> GROWING_ARROW = ENTITIES.register("growing_arrow",
            () -> EntityType.Builder.<GrowingArrowProjectile>of(GrowingArrowProjectile::new, MobCategory.MISC)
                    .sized(1f, 1f)
                    .updateInterval(10)
                    .clientTrackingRange(4)
                    .build("growing_arrow"));


    public static void register (IEventBus bus) {
        ENTITIES.register(bus);
    }

}
