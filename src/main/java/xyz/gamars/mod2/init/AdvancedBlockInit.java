package xyz.gamars.mod2.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.objects.blocks.powergen.PowergenBlock;
import xyz.gamars.mod2.objects.blocks.powergen.PowergenBlockEntity;
import xyz.gamars.mod2.objects.blocks.powergen.PowergenContainer;

public class AdvancedBlockInit {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod2.MOD_ID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Mod2.MOD_ID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Mod2.MOD_ID);

    private static final CreativeModeTab blocksTab = TabInit.ADVANCED_BLOCKS_TAB;

    public static RegistryObject<PowergenBlock> POWERGEN_BLOCK = BLOCKS.register("powergen_block", () -> new PowergenBlock());
    public static final RegistryObject<Item> POWERGEN_BLOCK_ITEM = fromBlock(POWERGEN_BLOCK, new Item.Properties().tab(blocksTab));
    public static final RegistryObject<BlockEntityType<PowergenBlockEntity>> POWERGEN_BE = BLOCK_ENTITIES.register("powergen", () -> BlockEntityType.Builder.of(PowergenBlockEntity::new, POWERGEN_BLOCK.get()).build(null));
    public static final RegistryObject<MenuType<PowergenContainer>> POWERGEN_CONTAINER = CONTAINERS.register("powergen",
            () -> IForgeMenuType.create((windowId, inv, data) -> new PowergenContainer(windowId, data.readBlockPos(), inv, inv.player)));



    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block, Item.Properties creativeTab) {
        return ItemInit.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), creativeTab));
    }

    public static void register (IEventBus bus) {
        BLOCKS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);
    }

}
