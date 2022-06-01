package com.sebastiantabor.ravenshollow.world.feature;

import com.sebastiantabor.ravenshollow.config.*;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> SILVER_ORE_PLACED = PlacementUtils.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(
                    RavensHollowCommonConfigs.SILVER_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(160))));

    public static final Holder<PlacedFeature> HOLLOW_ORE_PLACED = PlacementUtils.register("hollow_ore_placed",
            ModConfiguredFeatures.HOLLOW_ORE, ModOrePlacement.rareOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(160))));

    public static final Holder<PlacedFeature> RED_ORE_PLACED = PlacementUtils.register("red_ore_placed",
            ModConfiguredFeatures.RED_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(15), VerticalAnchor.aboveBottom(100))));

}