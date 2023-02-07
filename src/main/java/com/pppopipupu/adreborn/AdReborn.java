package com.pppopipupu.adreborn;

import com.pppopipupu.adreborn.advancements.TriggerInit;
import com.pppopipupu.adreborn.advancements.UseCraftTableTrigger;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.advancement.criterion.Criterion;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.util.Identifier;
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
