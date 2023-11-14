package net.jodatrash.mccourse;

import net.fabricmc.api.ModInitializer;
import net.jodatrash.mccourse.block.ModBlocks;
import net.jodatrash.mccourse.item.ModItemGroup;
import net.jodatrash.mccourse.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger("mccourse");

	@Override
	public void onInitialize() {
		ModItemGroup.registerModItemGroups();

		ModItems.registerModItem();
		ModBlocks.registerModBlocks();
		// LOGGER.info("Hello Fabric world!");
	}
}