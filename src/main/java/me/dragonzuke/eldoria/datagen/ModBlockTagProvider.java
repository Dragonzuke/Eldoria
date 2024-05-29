package me.dragonzuke.eldoria.datagen;

import me.dragonzuke.eldoria.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_OCEANIC_STEEL_ORE)
                .add(ModBlocks.OCEANIC_STEEL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_OCEANIC_STEEL_ORE)
                .add(ModBlocks.OCEANIC_STEEL_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ANCIENT_LOG)
                .add(ModBlocks.ANCIENT_WOOD)
                .add(ModBlocks.STRIPPED_ANCIENT_LOG)
                .add(ModBlocks.STRIPPED_ANCIENT_WOOD)
                .add(ModBlocks.ANCIENT_PLANKS)
                .add(ModBlocks.ANCIENT_LEAVES)
                .add(ModBlocks.STRIPPED_HEARTWOOD_LOG)
                .add(ModBlocks.STRIPPED_HEARTWOOD_WOOD)
                .add(ModBlocks.HEARTWOOD_PLANKS);
    }
}
