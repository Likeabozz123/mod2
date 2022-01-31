package xyz.gamars.mod2.data.generators.models;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import xyz.gamars.mod2.Mod2;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Mod2.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    @NotNull
    @Override
    public String getName() {
        return "Mod2 : Block State";
    }
}
