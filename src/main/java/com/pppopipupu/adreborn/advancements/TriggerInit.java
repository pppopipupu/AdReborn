package com.pppopipupu.adreborn.advancements;

import net.minecraft.advancement.criterion.Criteria;

public class TriggerInit {
    public static final UseCraftTableTrigger USE_BLOCK_TRIGGER = Criteria.register(new UseCraftTableTrigger());
    public static final PlayerGePiTrigger PLAYER_GE_PI_TRIGGER = Criteria.register(new PlayerGePiTrigger());
}
