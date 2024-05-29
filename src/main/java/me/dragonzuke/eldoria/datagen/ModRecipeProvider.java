package me.dragonzuke.eldoria.datagen;

import me.dragonzuke.eldoria.block.ModBlocks;
import me.dragonzuke.eldoria.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) { super(output); }
    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
    private static final List<ItemConvertible> OCEANIC_STEEL_SMELTABLES = List.of(ModBlocks.OCEANIC_STEEL_ORE, ModBlocks.DEEPSLATE_OCEANIC_STEEL_ORE);

    @Override
    public void generate(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.CLOTH, ModItems.SILK);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILK, 4).input(ModItems.CLOTH).criterion(FabricRecipeProvider.hasItem(ModItems.CLOTH), FabricRecipeProvider.conditionsFromItem(ModItems.CLOTH)).offerTo(exporter);

        offerSmelting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.ENCHANTED_SAPPHIRE, 0.7f, 200, "sapphire");
        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.ENCHANTED_SAPPHIRE, 0.7f, 100, "sapphire");
        offerSmelting(exporter, OCEANIC_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.OCEANIC_STEEL, 0.7f, 300, "oceanic_steel");
        offerBlasting(exporter, OCEANIC_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.OCEANIC_STEEL, 0.7f, 200, "oceanic_steel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANCIENT_FORGE,1 )
                .pattern("DDD")
                .pattern("DBD")
                .pattern("L L")
                .input('D', Items.DEEPSLATE)
                .input('B', Blocks.BLAST_FURNACE)
                .input('L', Blocks.OAK_LOG)
                .criterion(hasItem(Items.BLAST_FURNACE), conditionsFromItem(Items.BLAST_FURNACE))
                .criterion(hasItem(Items.DEEPSLATE), conditionsFromItem(Items.DEEPSLATE))
                .criterion(hasItem(Items.OAK_LOG), conditionsFromItem(Items.OAK_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_FORGE)));
    }
}
