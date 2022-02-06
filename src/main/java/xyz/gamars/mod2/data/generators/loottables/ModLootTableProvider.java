package xyz.gamars.mod2.data.generators.loottables;

import net.minecraft.data.DataGenerator;
import xyz.gamars.mod2.init.AdvancedBlockInit;
import xyz.gamars.mod2.init.BlockInit;
import xyz.gamars.mod2.init.ItemInit;

public class ModLootTableProvider extends BaseLootTableProvider {

    public ModLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        createSimpleTable("Test Block", BlockInit.TEST_BLOCK.get());
        lootTables.put(BlockInit.TEST_ORE.get(), createSilkTouchTable("test_ore", BlockInit.TEST_ORE.get(), ItemInit.TEST_ORE_CHUNK.get(), 1, 3));
        lootTables.put(AdvancedBlockInit.POWERGEN_BLOCK.get(), createStandardTable("powergen", AdvancedBlockInit.POWERGEN_BLOCK.get(), AdvancedBlockInit.POWERGEN_BE.get()));
    }

    @Override
    public String getName() {
        return "Mod2 : Loot Tables";
    }
}
