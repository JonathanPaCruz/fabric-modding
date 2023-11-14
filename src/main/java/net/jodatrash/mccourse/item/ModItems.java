package net.jodatrash.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jodatrash.mccourse.MCCourseMod;
import net.jodatrash.mccourse.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

        public static final Item IRON_NEEDLE = registerItem("iron_needle",
                        new Item(new FabricItemSettings().maxCount(16)));
        public static final Item BONE_NEEDLE = registerItem("bone_needle",
                        new Item(new FabricItemSettings().maxCount(16)));
        public static final Item PHIAL = registerItem("phial",
                        new Item(new FabricItemSettings()));
        public static final Item PHIAL_NEEDLE = registerItem("phial_needle",
                        new Item(new FabricItemSettings().maxCount(1)));
        public static final Item PHIAL_FULL = registerItem("phial_full",
                        new Item(new FabricItemSettings().maxCount(1)));
        public static final Item RAW_XP_ORE = registerItem("raw_xp_ore",
                        new Item(new FabricItemSettings()));
        // Item creativo
        public static final Item INGREDIENT_PHIAL = registerItem("ingredient_phial",
                        new Item(new FabricItemSettings().maxCount(1)));

        private static Item registerItem(String name, Item item) {
                return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
        }

        private static void itemGroupIngredients(FabricItemGroupEntries entries) {
                entries.add(IRON_NEEDLE);
                entries.add(BONE_NEEDLE);
                entries.add(PHIAL);
                entries.add(PHIAL_NEEDLE);
                entries.add(PHIAL_FULL);
                // Item creativo
                entries.add(INGREDIENT_PHIAL);

                // Add item to the block
                entries.add(ModBlocks.GRAVEL_IRON_ORE);
        }

        public static void registerModItem() {
                MCCourseMod.LOGGER.info("Registering ModItems for " + MCCourseMod.MOD_ID);
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
                ;
        }
}
