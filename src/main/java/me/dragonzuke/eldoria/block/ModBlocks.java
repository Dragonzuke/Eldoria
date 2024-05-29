package me.dragonzuke.eldoria.block;

import me.dragonzuke.eldoria.Eldoria;
import me.dragonzuke.eldoria.block.custom.AncientForgeBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
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

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0f, 3.0f)));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5f, 3.0f)));

    public static final Block OCEANIC_STEEL_ORE = registerBlock("oceanic_steel_ore", new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0f, 3.0f)));
    public static final Block DEEPSLATE_OCEANIC_STEEL_ORE = registerBlock("deepslate_oceanic_steel_ore", new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5f, 3.0f)));

    public static final Block ANCIENT_LOG = registerBlock("ancient_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f)));
    public static final Block ANCIENT_WOOD = registerBlock("ancient_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f)));
    public static final Block STRIPPED_ANCIENT_LOG = registerBlock("stripped_ancient_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f)));
    public static final Block STRIPPED_ANCIENT_WOOD = registerBlock("stripped_ancient_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f)));

    public static final Block ANCIENT_PLANKS = registerBlock("ancient_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f)));
    public static final Block ANCIENT_LEAVES = registerBlock("ancient_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).nonOpaque()));

    public static final Block STRIPPED_HEARTWOOD_LOG = registerBlock("stripped_heartwood_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f)));
    public static final Block STRIPPED_HEARTWOOD_WOOD = registerBlock("stripped_heartwood_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f)));

    public static final Block HEARTWOOD_PLANKS = registerBlock("heartwood_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f)));

    public static final Block ANCIENT_FORGE = registerBlock("ancient_forge", new AncientForgeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).nonOpaque()));
}