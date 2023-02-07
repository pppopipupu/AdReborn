package com.pppopipupu.adreborn.data;

import com.pppopipupu.adreborn.advancements.AdvancementGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.render.BufferBuilder;

public class DataGenerators implements DataGeneratorEntrypoint {


    @Override

    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
           var pack = fabricDataGenerator.createPack();
           pack.addProvider(AdvancementGenerator::new);
    }
}
