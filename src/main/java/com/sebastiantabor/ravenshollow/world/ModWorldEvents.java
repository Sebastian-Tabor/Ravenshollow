package com.sebastiantabor.ravenshollow.world;

import com.sebastiantabor.ravenshollow.RavensHollow;
import com.sebastiantabor.ravenshollow.world.gen.ModOreGeneration;
import net.minecraftforge.event.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RavensHollow.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

    }
}
