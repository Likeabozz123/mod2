package xyz.gamars.mod2.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import xyz.gamars.mod2.Mod2;
import xyz.gamars.mod2.data.generators.ModLangProvider;
import xyz.gamars.mod2.data.generators.ModRecipeProvider;
import xyz.gamars.mod2.data.generators.loottables.ModLootTableProvider;
import xyz.gamars.mod2.data.generators.models.ModBlockStateProvider;
import xyz.gamars.mod2.data.generators.models.ModItemModelProvider;
import xyz.gamars.mod2.data.generators.tags.ModBlockTags;
import xyz.gamars.mod2.data.generators.tags.ModItemTags;

@Mod.EventBusSubscriber(modid = Mod2.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData (GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if(event.includeServer()) {
            generator.addProvider(new ModRecipeProvider(generator));
            generator.addProvider(new ModLootTableProvider(generator));
            ModBlockTags blockTags = new ModBlockTags(generator, existingFileHelper);
            generator.addProvider(blockTags);
            generator.addProvider(new ModItemTags(generator, blockTags, existingFileHelper));
        }

        if(event.includeClient()) {
            generator.addProvider(new ModBlockStateProvider(generator, existingFileHelper));
            generator.addProvider(new ModItemModelProvider(generator, existingFileHelper));
            generator.addProvider(new ModLangProvider(generator, "en_us"));
        }

    }

}
