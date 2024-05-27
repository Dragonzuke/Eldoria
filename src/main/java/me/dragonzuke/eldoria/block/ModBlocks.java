package me.dragonzuke.eldoria.block;

import me.dragonzuke.eldoria.Eldoria;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Eldoria.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) { return Registry.register(Registries.ITEM, new Identifier(Eldoria.MOD_ID, name), new BlockItem(block, new Item.Settings())); }
    public static void registerModBlocks() { Eldoria.LOGGER.info("Registering ModBlocks for " + Eldoria.MOD_ID); }

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(3f)));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(4f)));
}
