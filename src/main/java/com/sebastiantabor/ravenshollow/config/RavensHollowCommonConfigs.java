package com.sebastiantabor.ravenshollow.config;

import net.minecraftforge.common.*;

public class RavensHollowCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_ORE_VEIN_SIZE;

    static {
        BUILDER.push("Configs for Raven's Hollow");

        SILVER_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Silver Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 12);
        SILVER_ORE_VEIN_SIZE = BUILDER.comment("How many Silver Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 12, 10, 15);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
