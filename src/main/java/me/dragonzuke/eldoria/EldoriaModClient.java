package me.dragonzuke.eldoria;

import me.dragonzuke.eldoria.block.ModBlocks;
import me.dragonzuke.eldoria.item.ModItems;
import me.dragonzuke.eldoria.screen.ancientforge.AncientForgeScreen;
import me.dragonzuke.eldoria.screen.ModScreenHandlers;
import me.dragonzuke.eldoria.screen.ruinpaper.RuinPaperScreen;
import me.dragonzuke.eldoria.util.InventoryUtil;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.lwjgl.glfw.GLFW;

public class EldoriaModClient implements ClientModInitializer {
    public static final KeyBinding RUIN_PAPER_GUI = new KeyBinding("key." + Eldoria.MOD_ID + ".open_ruin_paper_gui", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "key.categories." + Eldoria.MOD_ID);

    @Override
    public void onInitializeClient() {
        KeyBindingHelper.registerKeyBinding(RUIN_PAPER_GUI);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANCIENT_LEAVES, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.ANCIENT_FORGE_SCREEN_HANDLER_SCREEN_HANDLER, AncientForgeScreen::new);

        ClientTickEvents.START_CLIENT_TICK.register((client -> {
            if(RUIN_PAPER_GUI.wasPressed() && client.world != null && client.currentScreen == null) {
                PlayerEntity player = client.player;
                if(player.isPlayer()) {
                    ItemStack itemStack = player.getInventory().getMainHandStack();
                    if(itemStack.getItem() != ModItems.RUIN_SCROLL) return;
                    if(itemStack.hasNbt()) { if(!itemStack.getNbt().contains("CustomModelData")) { return; } }

                    int customModelData = itemStack.getNbt().getInt("CustomModelData");
                    boolean solved = itemStack.getNbt().getBoolean("Solved");

                    MinecraftClient.getInstance().setScreen(new RuinPaperScreen(customModelData, false));
                }
            }
        }));
    }
}
