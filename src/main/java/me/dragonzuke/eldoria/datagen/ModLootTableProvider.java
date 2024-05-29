package me.dragonzuke.eldoria.datagen;

import me.dragonzuke.eldoria.block.ModBlocks;
import me.dragonzuke.eldoria.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SAPPHIRE_ORE);
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        addDrop(ModBlocks.OCEANIC_STEEL_ORE, oreDrops(ModBlocks.OCEANIC_STEEL_ORE, ModItems.RAW_OCEANIC_STEEL));
        addDrop(ModBlocks.DEEPSLATE_OCEANIC_STEEL_ORE, oreDrops(ModBlocks.DEEPSLATE_OCEANIC_STEEL_ORE, ModItems.RAW_OCEANIC_STEEL));

        addDrop(ModBlocks.ANCIENT_LOG);
        addDrop(ModBlocks.ANCIENT_WOOD);
        addDrop(ModBlocks.STRIPPED_ANCIENT_LOG);
        addDrop(ModBlocks.STRIPPED_ANCIENT_WOOD);
        addDrop(ModBlocks.ANCIENT_PLANKS);
        addDrop(ModBlocks.STRIPPED_HEARTWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_HEARTWOOD_WOOD);
        addDrop(ModBlocks.HEARTWOOD_PLANKS);

        addDrop(ModBlocks.ANCIENT_LEAVES, leavesDrops(ModBlocks.ANCIENT_LEAVES, ModBlocks.SAPPHIRE_ORE, 0.005f)); // TODO add sapling
    }
}
