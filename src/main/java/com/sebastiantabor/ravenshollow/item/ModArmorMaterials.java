package com.sebastiantabor.ravenshollow.item;

import com.sebastiantabor.ravenshollow.RavensHollow;
import com.sebastiantabor.ravenshollow.item.*;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    SILVER("silver",10, new int[]{1,4,4,1},19, SoundEvents.ARMOR_EQUIP_CHAIN,0,0, () -> {
        return Ingredient.of(ModItems.SILVER_INGOT.get());
    }),
    BRONZE("bronze",23, new int[]{3,5,7,3},14, SoundEvents.ARMOR_EQUIP_IRON,1.0F,0, () -> {
        return Ingredient.of(ModItems.BRONZE_INGOT.get());
    }),
    RED("red",35, new int[]{3,6,8,3},14, SoundEvents.ARMOR_EQUIP_DIAMOND,2.0F,0.1F, () -> {
        return Ingredient.of(ModItems.RED_DIAMOND.get());
    }),
    HOLLOW("hollow",40, new int[]{3,6,8,3},20, SoundEvents.ARMOR_EQUIP_NETHERITE,4.0F,0.2F, () -> {
        return Ingredient.of(ModItems.HOLLOW_INGOT.get());
    })
    ;

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }
    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }
    @Override
    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }
    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }
    @Override
    public SoundEvent getEquipSound() {
        return sound;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
    @Override
    public String getName() {
        return RavensHollow.MOD_ID + ":" + this.name;
    }
    @Override
    public float getToughness() {
        return toughness;
    }
    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
