package me.dragonzuke.eldoria.item;

import me.dragonzuke.eldoria.Eldoria;
import me.dragonzuke.eldoria.item.custom.DustyGoldenScarabItem;
import me.dragonzuke.eldoria.item.custom.EnchantedSapphireItem;
import me.dragonzuke.eldoria.item.custom.RuinScrollItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item item) { return Registry.register(Registries.ITEM, new Identifier(Eldoria.MOD_ID, name), item); }
    public static void registerModItems() { Eldoria.LOGGER.info("Registering Mod Items for " + Eldoria.MOD_ID); }

    public static final Item RUIN_SCROLL = registerItem("ruin_scroll", new RuinScrollItem((new Item.Settings()).maxCount(1).maxDamage(6)));

    // Ruins
    public static final Item SPIRIT_CRYSTALS = registerItem("spirit_crystal", new Item(new Item.Settings()));
    public static final Item GOLDEN_SCARAB = registerItem("golden_scarab", new Item(new Item.Settings()));
    public static final Item DUSTY_GOLDEN_SCARAB = registerItem("dusty_golden_scarab", new DustyGoldenScarabItem(new Item.Settings()));
    public static final Item NATURE_ESSENCE = registerItem("nature_essence", new Item(new Item.Settings()));

    // Ores
    public static final Item ENCHANTED_SAPPHIRE = registerItem("enchanted_sapphire", new EnchantedSapphireItem(new Item.Settings()));
    public static final Item RAW_OCEANIC_STEEL = registerItem("raw_oceanic_steel", new Item(new Item.Settings()));

    // Mob Drops
    public static final Item SILK = registerItem("silk", new Item(new Item.Settings()));

    // Craftable and Smeltable
    public static final Item CLOTH = registerItem("cloth", new Item(new Item.Settings()));
    public static final Item OCEANIC_STEEL = registerItem("oceanic_steel", new Item(new Item.Settings()));
    public static final Item RUSTED_OCEANIC_STEEL = registerItem("rusted_oceanic_steel", new Item(new Item.Settings()));
}
