package me.dragonzuke.eldoria.item.custom;

import me.dragonzuke.eldoria.Eldoria;
import me.dragonzuke.eldoria.item.ModItems;
import me.dragonzuke.eldoria.screen.ruinpaper.RuinPaperScreen;
import me.dragonzuke.eldoria.util.InventoryUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RuinScrollItem extends Item {
    public RuinScrollItem(Settings settings) { super(settings); }

    @Override
    public boolean isDamageable() { return true; }

    @Override
    public boolean isItemBarVisible(ItemStack stack) { return false; }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.getNbt().contains("eldoria.ruin")) {
            String currentText = stack.getNbt().getString("eldoria.ruin");
            tooltip.add(Text.translatable(currentText));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean onStackClicked(ItemStack stack, Slot slot, ClickType clickType, PlayerEntity player) {
        double chance = Math.random();
        NbtCompound nbtData = new NbtCompound();

        if(chance < .5) {
            nbtData.putInt("CustomModelData", 1);
            nbtData.putString("eldoria.ruin", "§2Nature §7Ruin Scroll");
        }
        else if(chance > .5) {
            nbtData.putInt("CustomModelData", 2);
            nbtData.putString("eldoria.ruin", "§6Desert §7Ruin Scroll");
        }

        stack.setNbt(nbtData);

        return super.onStackClicked(stack, slot, clickType, player);
    }
}
