package com.sebastiantabor.ravenshollow.setup;

import com.sebastiantabor.ravenshollow.item.*;
import net.minecraft.world.item.*;

public class ModCreativeModeTab {
    public static final CreativeModeTab RAVENS_HOLLOW_TAB = new CreativeModeTab("Raven's Hollow") {
        @Override
        public ItemStack makeIcon() {
            return ModItems.FEATHER.get().getDefaultInstance();
        }
    };

}

