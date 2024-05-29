package me.dragonzuke.eldoria.item;

import me.dragonzuke.eldoria.Eldoria;
import me.dragonzuke.eldoria.block.ModBlocks;
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
                    .icon(() -> new ItemStack(ModItems.ENCHANTED_SAPPHIRE)).entries((displayContext, entries) -> {

                        // Items
                        entries.add(ModItems.SPIRIT_CRYSTALS);
                        entries.add(ModItems.SILK);
                        entries.add(ModItems.CLOTH);
                        entries.add(ModItems.GOLDEN_SCARAB);
                        entries.add(ModItems.DUSTY_GOLDEN_SCARAB);
                        entries.add(ModItems.ENCHANTED_SAPPHIRE);
                        entries.add(ModItems.OCEANIC_STEEL);
                        entries.add(ModItems.RUSTED_OCEANIC_STEEL);
                        entries.add(ModItems.RAW_OCEANIC_STEEL);

                        // Blocks
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.OCEANIC_STEEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_OCEANIC_STEEL_ORE);

                        entries.add(ModBlocks.ANCIENT_LOG);
                        entries.add(ModBlocks.STRIPPED_ANCIENT_LOG);
                        entries.add(ModBlocks.ANCIENT_PLANKS);
                        entries.add(ModBlocks.ANCIENT_LEAVES);
                        entries.add(ModBlocks.STRIPPED_HEARTWOOD_LOG);
                        entries.add(ModBlocks.HEARTWOOD_PLANKS);

                        entries.add(ModBlocks.ANCIENT_FORGE);

                        // Armor

                        // Weapons

                        // MISC
                    }).build());

    public static void registerItemGroups() {
        Eldoria.LOGGER.info("Registering Item Groups for " + Eldoria.MOD_ID);
    }
}
