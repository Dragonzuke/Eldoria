package me.dragonzuke.eldoria;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eldoria implements ModInitializer {
	public static final String MOD_ID = "eldoria";
	public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LoggerFactory.getLogger("eldoria");

	@Override
	public void onInitialize() {

		LOGGER.info("Starting Eldoria v" + VERSION);
	}
}