package me.dragonzuke.eldoria.item;

import me.dragonzuke.eldoria.Eldoria;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPIRIT_CRYSTALS = registerItem("spirit_crystal", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) { return Registry.register(Registries.ITEM, new Identifier(Eldoria.MOD_ID, name), item); }
    public static void registerModItems() { Eldoria.LOGGER.info("Registering Mod Items for " + Eldoria.MOD_ID); }
}
