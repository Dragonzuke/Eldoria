package me.dragonzuke.eldoria.datagen;

import me.dragonzuke.eldoria.block.ModBlocks;
import me.dragonzuke.eldoria.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OCEANIC_STEEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_OCEANIC_STEEL_ORE);

        // Wood things
        blockStateModelGenerator.registerLog(ModBlocks.ANCIENT_LOG).log(ModBlocks.ANCIENT_LOG).wood(ModBlocks.ANCIENT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ANCIENT_LOG).log(ModBlocks.STRIPPED_ANCIENT_LOG).wood(ModBlocks.STRIPPED_ANCIENT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_HEARTWOOD_LOG).log(ModBlocks.STRIPPED_HEARTWOOD_LOG).wood(ModBlocks.STRIPPED_HEARTWOOD_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEARTWOOD_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SPIRIT_CRYSTALS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_SCARAB, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUSTY_GOLDEN_SCARAB, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCHANTED_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCEANIC_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSTED_OCEANIC_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_OCEANIC_STEEL, Models.GENERATED);
    }
}
