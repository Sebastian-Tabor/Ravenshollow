package com.sebastiantabor.ravenshollow.world.feature;

import com.sebastiantabor.ravenshollow.block.ModBlocks;
import com.sebastiantabor.ravenshollow.config.*;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, RavensHollowCommonConfigs.SILVER_ORE_VEIN_SIZE.get()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_RED_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.RED_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RED_ORE = FeatureUtils.register("red_ore",
            Feature.ORE, new OreConfiguration(NETHER_RED_ORES, 6));

    public static final List<OreConfiguration.TargetBlockState> END_HOLLOW_ORES = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.HOLLOW_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HOLLOW_ORE = FeatureUtils.register("hollow_ore",
            Feature.ORE, new OreConfiguration(END_HOLLOW_ORES, 5));
}
