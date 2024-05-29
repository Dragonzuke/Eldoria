package me.dragonzuke.eldoria.block.entity;

import me.dragonzuke.eldoria.Eldoria;
import me.dragonzuke.eldoria.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<AncientForgeBlockEntity> ANCIENT_FORGE_BLOCK_ENTITY_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Eldoria.MOD_ID, "ancient_forge"), FabricBlockEntityTypeBuilder.create(AncientForgeBlockEntity::new, ModBlocks.ANCIENT_FORGE).build());

    public static void registerBlockEntities() {
        Eldoria.LOGGER.info("Registering Block Entities for " + Eldoria.MOD_ID);
    }
}
