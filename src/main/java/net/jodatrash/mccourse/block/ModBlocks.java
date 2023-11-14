package net.jodatrash.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jodatrash.mccourse.MCCourseMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
        // Create a block
        public static final Block GRAVEL_IRON_ORE = registerBlock("gravel_iron_ore",
                        new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
        public static final Block GRAVEL_COAL_ORE = registerBlock("gravel_coal_ore",
                        new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
        public static final Block SAND_IRON_ORE = registerBlock("sand_iron_ore",
                        new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
        public static final Block SAND_COAL_ORE = registerBlock("sand_coal_ore",
                        new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
        public static final Block REDSAND_IRON_ORE = registerBlock("redsand_iron_ore",
                        new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
        public static final Block REDSAND_COAL_ORE = registerBlock("redsand_coal_ore",
                        new Block(FabricBlockSettings.copyOf(Blocks.SAND)));
        public static final Block SOLID_EXPERIENCE_BLOCK = registerBlock("solid_experience_block",
                        new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
        public static final Block SOLID_EXPERIENCE_CROP = registerBlock("solid_experience_crop",
                        new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

        // Create a register to the block
        private static Block registerBlock(String name, Block block) {
                registerBlockItem(name, block);
                return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
        }

        // Create a new item to the block and register this item
        private static Item registerBlockItem(String name, Block block) {
                return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                                new BlockItem(block, new FabricItemSettings()));
        }

        public static void registerModBlocks() {
                MCCourseMod.LOGGER.info("Registering ModBlocks for " + MCCourseMod.MOD_ID);
        }
}
