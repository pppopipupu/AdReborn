package com.pppopipupu.adreborn.advancements;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.ConsumeItemCriterion;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.PlayerInteractedWithEntityCriterion;
import net.minecraft.client.realms.dto.PlayerActivities;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.predicate.NumberRange;

import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;

import java.util.function.Consumer;

public class AdvancementGenerator extends FabricAdvancementProvider {

    public AdvancementGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {



       Advancement getDirt =  Advancement.Builder.create().display(
               Items.DIRT.getDefaultStack(), ((Text) Text.translatable("advancement.adreborn.getdirt")),((Text)Text.translatable("advancement.adreborn.getdirt.desc")),
               null,
               AdvancementFrame.TASK,

               true, true, false).criterion("have_one_dirt", InventoryChangedCriterion.Conditions.items(ItemPredicate.Builder.create().items(Items.DIRT).count(NumberRange.IntRange.exactly(1)).build())).build(consumer,"adreborn:getdirt");
  /*      Advancement dead_one =  Advancement.Builder.create().display(
                Items.DIRT.getDefaultStack(), ((Text) Text.translatable("advancement.adreborn.dead")),((Text)Text.translatable("advancement.adreborn.dead.desc")),
                null,
                AdvancementFrame.TASK,

                true, true, false).criterion("dead_one", PLAyer)

   */
        Advancement open_crafttable =  Advancement.Builder.create().display(
                Items.CRAFTING_TABLE.getDefaultStack(), ((Text) Text.translatable("advancement.adreborn.open_crafttable")),((Text)Text.translatable("advancement.adreborn.open_crafttable.desc")),
                null,
                AdvancementFrame.TASK,

                true, true, false).criterion("open_craft",UseCraftTableTrigger.Instance.create(true)).build(consumer,"adreborn:open_crafttble");



    }
}
