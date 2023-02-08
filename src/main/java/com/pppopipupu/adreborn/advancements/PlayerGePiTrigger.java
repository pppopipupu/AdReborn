package com.pppopipupu.adreborn.advancements;

import com.google.gson.JsonObject;
import net.minecraft.advancement.criterion.AbstractCriterion;
import net.minecraft.advancement.criterion.AbstractCriterionConditions;
import net.minecraft.predicate.entity.AdvancementEntityPredicateDeserializer;
import net.minecraft.predicate.entity.AdvancementEntityPredicateSerializer;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class PlayerGePiTrigger extends AbstractCriterion<PlayerGePiTrigger.Instance> {
    @Override
    public PlayerGePiTrigger.Instance conditionsFromJson(JsonObject jsonObject, EntityPredicate.Extended extended, AdvancementEntityPredicateDeserializer advancementEntityPredicateDeserializer) {

        return new PlayerGePiTrigger.Instance(extended,true);
    }
    public void triger(ServerPlayerEntity player){
        this.trigger(player,(instance -> true));
    }
    @Override
    public Identifier getId() {
        return ID;
    }
    static final Identifier ID = new Identifier("adreborn","player_dead");


    public static class Instance extends AbstractCriterionConditions {


        private final boolean b;

        public Instance(EntityPredicate.Extended entity, boolean b) {
            super(ID, entity);
            this.b = b;

        }
        public static PlayerGePiTrigger.Instance create(boolean bbb){
            return new PlayerGePiTrigger.Instance(EntityPredicate.Extended.EMPTY,bbb);
        }


        @Override
        public JsonObject toJson(AdvancementEntityPredicateSerializer predicateSerializer) {
            JsonObject jsonObject = super.toJson(predicateSerializer);
            jsonObject.addProperty("jjsjjsjjsjj",b);
            return jsonObject;
        }
        public boolean matches() {
            return true;
        }
    }
}


