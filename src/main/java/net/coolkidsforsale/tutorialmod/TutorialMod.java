package net.coolkidsforsale.tutorialmod;

import net.coolkidsforsale.tutorialmod.block.ModBlocks;
import net.coolkidsforsale.tutorialmod.item.ModItems;
import net.coolkidsforsale.tutorialmod.painting.ModPaintings;
import net.coolkidsforsale.tutorialmod.villager.ModVillagers;
import net.coolkidsforsale.tutorialmod.world.feature.ModConfiguredFeatures;
import net.coolkidsforsale.tutorialmod.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very Important comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

        ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModPaintings.registerPaintings();
		ModOreGeneration.generateOres();
	}
}
