package com.sebastiantabor.ravenshollow.world.gen;

import com.sebastiantabor.ravenshollow.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.SILVER_ORE_PLACED);

        if(event.getCategory() == Biome.BiomeCategory.THEEND) {
            base.add(ModPlacedFeatures.HOLLOW_ORE_PLACED);
        }

        if(event.getCategory() == Biome.BiomeCategory.NETHER) {
            base.add(ModPlacedFeatures.RED_ORE_PLACED);
        }
    }
}
