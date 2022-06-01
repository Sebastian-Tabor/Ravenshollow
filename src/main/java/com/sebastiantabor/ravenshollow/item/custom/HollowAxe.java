package com.sebastiantabor.ravenshollow.item.custom;

import net.minecraft.world.effect.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.*;

public class HollowAxe extends AxeItem {
    public HollowAxe(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.WITHER, 400), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
