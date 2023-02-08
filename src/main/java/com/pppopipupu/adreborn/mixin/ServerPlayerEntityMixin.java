package com.pppopipupu.adreborn.mixin;

import com.pppopipupu.adreborn.advancements.TriggerInit;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin {




    @Inject(method = "onDeath",at = @At("HEAD"))
    public void onDeath(DamageSource damageSource, CallbackInfo ci) {

        TriggerInit.PLAYER_GE_PI_TRIGGER.triger((ServerPlayerEntity)(Object)this);

    }


}
