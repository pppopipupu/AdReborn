package com.pppopipupu.adreborn.mixin;

import com.pppopipupu.adreborn.advancements.TriggerInit;
import com.pppopipupu.adreborn.advancements.UseCraftTableTrigger;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CraftingTableBlock.class)
public class CraftingTableBlockMixin {

    @Inject(method = "onUse",at = @At("HEAD"))
    public void onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {
       if(player instanceof ServerPlayerEntity player2)
      TriggerInit.USE_BLOCK_TRIGGER.triger(player2);
    }


}
