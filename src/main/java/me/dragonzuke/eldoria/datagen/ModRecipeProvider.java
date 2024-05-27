package me.dragonzuke.eldoria.datagen;

import me.dragonzuke.eldoria.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) { super(output); }

    @Override
    public void generate(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.CLOTH, ModItems.SILK);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILK, 4).input(ModItems.CLOTH).criterion(FabricRecipeProvider.hasItem(ModItems.CLOTH), FabricRecipeProvider.conditionsFromItem(ModItems.CLOTH)).offerTo(exporter);
    }
}
