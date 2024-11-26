package com.no.basic.mod;

import com.no.basic.mod.item.ModItemGroups;
import com.no.basic.mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoBasic implements ModInitializer {
	public static final String MOD_ID = "no-basic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}