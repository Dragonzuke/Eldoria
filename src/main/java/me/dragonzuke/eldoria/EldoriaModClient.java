package me.dragonzuke.eldoria;

import me.dragonzuke.eldoria.block.ModBlocks;
import me.dragonzuke.eldoria.screen.AncientForgeScreen;
import me.dragonzuke.eldoria.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class EldoriaModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANCIENT_LEAVES, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.ANCIENT_FORGE_SCREEN_HANDLER_SCREEN_HANDLER, AncientForgeScreen::new);
    }
}
