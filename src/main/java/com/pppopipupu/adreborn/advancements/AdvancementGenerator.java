package com.pppopipupu.adreborn.advancements;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

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
        Advancement open_crafttable =  Advancement.Builder.create().display(
                Items.CRAFTING_TABLE.getDefaultStack(), ((Text) Text.translatable("advancement.adreborn.open_crafttable")),((Text)Text.translatable("advancement.adreborn.open_crafttable.desc")),
                null,
                AdvancementFrame.TASK,

                true, true, false).criterion("open_craft",UseCraftTableTrigger.Instance.create(true)).parent(getDirt).build(consumer,"adreborn:open_crafttble");
       Advancement dead_one =  Advancement.Builder.create().display(
                Items.DIRT.getDefaultStack(), ((Text) Text.translatable("advancement.adreborn.dead")),((Text)Text.translatable("advancement.adreborn.dead.desc")),
                null,
                AdvancementFrame.TASK,

                true, true, false).criterion("dead_one", PlayerGePiTrigger.Instance.create(true)).rewards(AdvancementRewards.Builder.experience(33).addLoot(new Identifier("minecraft","iron_chestplate"))).parent(open_crafttable).build(consumer,"adreborn:dead_one");






    }
}
