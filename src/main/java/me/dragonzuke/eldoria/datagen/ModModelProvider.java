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
    }
}
