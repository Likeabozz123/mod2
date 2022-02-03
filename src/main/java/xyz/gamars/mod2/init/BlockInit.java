package xyz.gamars.mod2.init;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.gamars.mod2.Mod2;

public class BlockInit {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod2.MOD_ID);
    private static final CreativeModeTab blocksTab = TabInit.BLOCKS_TAB;
    private static final Material metal = Material.METAL;
    private static final Material stone = Material.STONE;

    public static RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", () -> new Block(BlockBehaviour.Properties
            .of(metal)
            .strength(2f)
            .requiresCorrectToolForDrops()));
    public static RegistryObject<Item> TEST_BLOCK_ITEM = fromBlock(TEST_BLOCK, new Item.Properties().tab(blocksTab));
    public static RegistryObject<Block> TEST_ORE = BLOCKS.register("test_ore", () -> new Block(BlockBehaviour.Properties
            .of(metal)
            .strength(2f)
            .requiresCorrectToolForDrops()));
    public static RegistryObject<Item> TEST_ORE_ITEM = fromBlock(TEST_ORE, new Item.Properties().tab(blocksTab));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block, Item.Properties creativeTab) {
        return ItemInit.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), creativeTab));
    }

    public static void register (IEventBus bus) {
        BLOCKS.register(bus);
    }

}
