package me.dragonzuke.eldoria;

import me.dragonzuke.eldoria.block.ModBlocks;
import me.dragonzuke.eldoria.item.ModItemGroups;
import me.dragonzuke.eldoria.item.ModItems;
import me.dragonzuke.eldoria.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eldoria implements ModInitializer {
	public static final String MOD_ID = "eldoria";
	public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LoggerFactory.getLogger("eldoria");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();

		LOGGER.info("DEBUG: " + LOGGER.isDebugEnabled());
		LOGGER.info("Starting Eldoria v" + VERSION);
	}
}