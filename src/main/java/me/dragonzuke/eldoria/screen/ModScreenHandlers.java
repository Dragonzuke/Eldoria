package me.dragonzuke.eldoria.screen;

import me.dragonzuke.eldoria.Eldoria;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<AncientForgeScreenHandler> ANCIENT_FORGE_SCREEN_HANDLER_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER, new Identifier(Eldoria.MOD_ID, "ancient_forge"), new ExtendedScreenHandlerType<>(AncientForgeScreenHandler::new));

    public static void registerScreenHandlers() {
        Eldoria.LOGGER.info("Registering Screen Handlers for " + Eldoria.MOD_ID);
    }
}
