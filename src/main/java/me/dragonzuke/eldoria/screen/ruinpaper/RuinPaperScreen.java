package me.dragonzuke.eldoria.screen.ruinpaper;

import io.github.cottonmc.cotton.gui.client.BackgroundPainter;
import io.github.cottonmc.cotton.gui.client.CottonClientScreen;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import me.dragonzuke.eldoria.Eldoria;
import me.dragonzuke.eldoria.item.ModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// TODO: Finish Ruin Paper

@Environment(EnvType.CLIENT)
public class RuinPaperScreen extends CottonClientScreen {
    public RuinPaperScreen(int index, boolean solved) { super(new Gui(index, solved)); }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (MinecraftClient.getInstance().options.inventoryKey.matchesKey(keyCode, scanCode) && !(this.description.getFocus() instanceof WTextField)) {
            this.close();
            return true;
        }

        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    public static class Gui extends LightweightGuiDescription {
        public Gui(int index, boolean solved) {

            WGridPanel root = new WGridPanel();
            setRootPanel(root);
            root.setSize(256, 240);
            root.setInsets(Insets.ROOT_PANEL);
            root.validate(this);

            // Nature
            if(index == 1) {
                WSprite rIcon = new WSprite(new Identifier("eldoria:textures/item/ruin_scroll_forest.png"));
                WSprite lIcon = new WSprite(new Identifier("eldoria:textures/item/ruin_scroll_forest.png"));
                WLabel title;
                WLabel description;
                if(!solved) {
                    title = new WLabel(Text.literal("-.. . ... . .-. -"), 0x304529);
                    root.add(title, 5, 1, 1, 1);
                }
                root.add(rIcon, 0, 0, 1, 1);
                root.add(lIcon, 13, 0, 1, 1);
                return;
            }

            if(index == 2) {

            }

            //WSprite icon = new WSprite(new Identifier("minecraft:textures/item/redstone.png"));
            //root.add(icon, 0, 2, 1, 1);

            //WButton button = new WButton(Text.translatable("gui.examplemod.examplebutton"));
            //root.add(button, 0, 3, 4, 1);

            //WLabel label = new WLabel(Text.literal("Test"), 0xFFFFFF);
            //root.add(label, 0, 4, 2, 1);
        }
    }
}
