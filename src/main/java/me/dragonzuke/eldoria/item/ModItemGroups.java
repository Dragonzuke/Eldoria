package me.dragonzuke.eldoria.item;

import me.dragonzuke.eldoria.Eldoria;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ELDORIA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Eldoria.MOD_ID, "eldoria_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldoria"))
                    .icon(() -> new ItemStack(Items.GLOW_ITEM_FRAME)).entries((displayContext, entries) -> {

                        // Items
                        entries.add(ModItems.SPIRIT_CRYSTALS);
                        entries.add(ModItems.SILK);
                        entries.add(ModItems.CLOTH);

                        // Blocks

                        // Armor

                        // Weapons

                        // MISC
                    }).build());

    public static void registerItemGroups() {
        Eldoria.LOGGER.info("Registering Item Groups for " + Eldoria.MOD_ID);
    }
}
