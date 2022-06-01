package com.sebastiantabor.ravenshollow.events;

import com.sebastiantabor.ravenshollow.*;
import net.minecraftforge.common.loot.*;
import net.minecraftforge.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;

import javax.annotation.*;

@Mod.EventBusSubscriber(modid = RavensHollow.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final
                                                   RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(

        );
    }
}
