package com.pppopipupu.adreborn;

import com.pppopipupu.adreborn.advancements.TriggerInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import org.apache.http.config.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdReborn implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final Logger LOGGER = LoggerFactory.getLogger("adreborn");

	@Override
	public void onInitialize() {
		TriggerInit t = new TriggerInit();


	}

}
