package net.jodatrash.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jodatrash.mccourse.MCCourseMod;
import net.jodatrash.mccourse.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MCCOURSE_FABRIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "mccourse_fabric_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mccourse_fabric_group"))
                    .icon(() -> new ItemStack(ModItems.BONE_NEEDLE)).entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.BONE_NEEDLE);
                        entries.add(ModItems.IRON_NEEDLE);
                        entries.add(ModItems.PHIAL);
                        entries.add(ModItems.INGREDIENT_PHIAL);
                        entries.add(ModItems.PHIAL_FULL);
                        entries.add(ModItems.PHIAL_NEEDLE);
                        entries.add(ModItems.RAW_XP_ORE);

                        // Blocks
                        entries.add(ModBlocks.GRAVEL_IRON_ORE);
                        entries.add(ModBlocks.GRAVEL_COAL_ORE);
                        entries.add(ModBlocks.SAND_IRON_ORE);
                        entries.add(ModBlocks.SAND_COAL_ORE);
                        entries.add(ModBlocks.REDSAND_IRON_ORE);
                        entries.add(ModBlocks.REDSAND_COAL_ORE);
                        entries.add(ModBlocks.SOLID_EXPERIENCE_BLOCK);
                        entries.add(ModBlocks.SOLID_EXPERIENCE_CROP);
                    }).build());

    public static void registerModItemGroups() {

    }

}
