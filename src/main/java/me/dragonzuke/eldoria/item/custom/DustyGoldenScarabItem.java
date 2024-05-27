package me.dragonzuke.eldoria.item.custom;

import me.dragonzuke.eldoria.Eldoria;
import me.dragonzuke.eldoria.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class DustyGoldenScarabItem extends Item {
    public DustyGoldenScarabItem(Settings settings) { super(settings); }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            ItemStack stack = player.getStackInHand(player.getActiveHand());
            BlockState state = context.getWorld().getBlockState(positionClicked);

            if(!state.isOf(Blocks.WATER_CAULDRON)) { return ActionResult.FAIL; }

            context.getWorld().playSound(null, positionClicked, SoundEvents.AMBIENT_UNDERWATER_ENTER, SoundCategory.BLOCKS, 1f, 1f);
            stack.decrement(1);
            player.getInventory().insertStack(new ItemStack(ModItems.GOLDEN_SCARAB));
        }
        return ActionResult.SUCCESS;
    }
}
