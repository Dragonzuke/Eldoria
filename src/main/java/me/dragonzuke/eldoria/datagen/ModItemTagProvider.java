package me.dragonzuke.eldoria.datagen;

import me.dragonzuke.eldoria.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.ANCIENT_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ANCIENT_LOG.asItem())
                .add(ModBlocks.ANCIENT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_LOG.asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_WOOD.asItem())
                .add(ModBlocks.ANCIENT_PLANKS.asItem())
                .add(ModBlocks.ANCIENT_LEAVES.asItem())
                .add(ModBlocks.STRIPPED_HEARTWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_HEARTWOOD_WOOD.asItem())
                .add(ModBlocks.HEARTWOOD_PLANKS.asItem());
    }
}
