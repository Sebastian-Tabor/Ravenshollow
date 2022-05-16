package com.sebastiantabor.ravenshollow.setup;


import com.sebastiantabor.ravenshollow.setup.ModItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.checkerframework.checker.units.qual.Speed;

import javax.swing.*;
import java.util.function.Supplier;

public enum ModItemTier implements Tier {
    SILVER(1,191,5.0F,1.5F,19, () -> {
        return Ingredient.of(ModItems.SILVER_INGOT.get());
    } ),
    BRONZE(2,800,7.0F,2.5F,14, () -> {
        return Ingredient.of(ModItems.BRONZE_INGOT.get());
    } ),
    BLOOD(2,1781,9.0F,3.5F,14, () -> {
        return Ingredient.of(ModItems.BLOOD_INGOT.get());
    } ),
    HOLLOW(5,2500,11.0F,5.0F,20, () -> {
        return Ingredient.of(ModItems.HOLLOW_INGOT.get());
    } ),
    ;


    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
