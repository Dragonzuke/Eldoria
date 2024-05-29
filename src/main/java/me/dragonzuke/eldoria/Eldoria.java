package me.dragonzuke.eldoria;

import me.dragonzuke.eldoria.block.ModBlocks;
import me.dragonzuke.eldoria.item.ModItemGroups;
import me.dragonzuke.eldoria.item.ModItems;
import me.dragonzuke.eldoria.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eldoria implements ModInitializer {
	public static final String MOD_ID = "eldoria";
    public static final Logger LOGGER = LoggerFactory.getLogger("eldoria");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();

		StrippableBlockRegistry.register(ModBlocks.ANCIENT_LOG, ModBlocks.STRIPPED_ANCIENT_LOG);
		StrippableBlockRegistry.register(ModBlocks.ANCIENT_WOOD, ModBlocks.STRIPPED_ANCIENT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ANCIENT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ANCIENT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HEARTWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HEARTWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HEARTWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_LEAVES, 30, 60);
	}
}