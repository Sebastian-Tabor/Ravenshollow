package com.sebastiantabor.ravenshollow.world;

import com.sebastiantabor.ravenshollow.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);


    }
}
