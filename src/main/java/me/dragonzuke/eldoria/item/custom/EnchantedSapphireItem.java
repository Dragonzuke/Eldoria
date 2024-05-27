package me.dragonzuke.eldoria.item.custom;

import me.dragonzuke.eldoria.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class EnchantedSapphireItem extends Item {
    public EnchantedSapphireItem(Settings settings) { super(settings); }

    @Override
    public boolean hasGlint(ItemStack stack) { return true; }
}
