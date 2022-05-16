package com.sebastiantabor.ravenshollow.setup;

import com.sebastiantabor.ravenshollow.item.custom.HollowSword;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.registries.RegistryObject;

import static com.sebastiantabor.ravenshollow.RavensHollow.RAVENS_HOLLOW_TAB;

public class ModItems {
    // SILVER
    public static final RegistryObject<Item> SILVER_NUGGET = Registration.ITEMS.register("silver_nugget", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = Registration.ITEMS.register("raw_silver", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> SILVER_HELMET = Registration.ITEMS.register("silver_helmet", () ->
           new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD,
                  new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = Registration.ITEMS.register("silver_chestplate", () ->
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST,
                new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = Registration.ITEMS.register("silver_leggings", () ->
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS,
                new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_BOOTS = Registration.ITEMS.register("silver_boots", () ->
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET,
                new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_AXE = Registration.ITEMS.register("silver_axe", () ->
            new AxeItem(ModItemTier.SILVER, 5, -3.0F,
                new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_PICKAXE = Registration.ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(ModItemTier.SILVER,1, -2.8F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_SWORD = Registration.ITEMS.register("silver_sword", () ->
            new SwordItem(ModItemTier.SILVER,3, -2.4F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_SHOVEL = Registration.ITEMS.register("silver_shovel", () ->
            new ShovelItem(ModItemTier.SILVER,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_HOE = Registration.ITEMS.register("silver_hoe", () ->
            new HoeItem(ModItemTier.SILVER,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    // BRONZE
    public static final RegistryObject<Item> RAW_BRONZE = Registration.ITEMS.register("raw_bronze", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BRONZE_NUGGET = Registration.ITEMS.register("bronze_nugget", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BRONZE_INGOT = Registration.ITEMS.register("bronze_ingot", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BRONZE_HELMET = Registration.ITEMS.register("bronze_helmet", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = Registration.ITEMS.register("bronze_chestplate", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = Registration.ITEMS.register("bronze_leggings", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_BOOTS = Registration.ITEMS.register("bronze_boots", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_AXE = Registration.ITEMS.register("bronze_axe", () ->
            new AxeItem(ModItemTier.BRONZE, 5, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = Registration.ITEMS.register("bronze_pickaxe", () ->
            new PickaxeItem(ModItemTier.BRONZE,1, -2.8F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_SWORD = Registration.ITEMS.register("bronze_sword", () ->
            new SwordItem(ModItemTier.BRONZE,3, -2.4F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = Registration.ITEMS.register("bronze_shovel", () ->
            new ShovelItem(ModItemTier.BRONZE,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_HOE = Registration.ITEMS.register("bronze_hoe", () ->
            new HoeItem(ModItemTier.BRONZE,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    // BLOODMETAL
    public static final RegistryObject<Item> BLOOD_NUGGET = Registration.ITEMS.register("blood_nugget", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BLOOD_INGOT = Registration.ITEMS.register("blood_ingot", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BLOOD_HELMET = Registration.ITEMS.register("blood_helmet", () ->
            new ArmorItem(ModArmorMaterials.BLOOD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_CHESTPLATE = Registration.ITEMS.register("blood_chestplate", () ->
            new ArmorItem(ModArmorMaterials.BLOOD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_LEGGINGS = Registration.ITEMS.register("blood_leggings", () ->
            new ArmorItem(ModArmorMaterials.BLOOD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_BOOTS = Registration.ITEMS.register("blood_boots", () ->
            new ArmorItem(ModArmorMaterials.BLOOD, EquipmentSlot.FEET,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_AXE = Registration.ITEMS.register("blood_axe", () ->
            new AxeItem(ModItemTier.BLOOD, 5, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_PICKAXE = Registration.ITEMS.register("blood_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLOOD,1, -2.8F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_SWORD = Registration.ITEMS.register("blood_sword", () ->
            new SwordItem(ModItemTier.BLOOD,3, -2.4F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_SHOVEL = Registration.ITEMS.register("blood_shovel", () ->
            new ShovelItem(ModItemTier.BLOOD,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BLOOD_HOE = Registration.ITEMS.register("blood_hoe", () ->
            new HoeItem(ModItemTier.BLOOD,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    // HOLLOW
    public static final RegistryObject<Item> HOLLOW_NUGGET = Registration.ITEMS.register("hollow_nugget", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> HOLLOW_INGOT = Registration.ITEMS.register("hollow_ingot", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> HOLLOW_HELMET = Registration.ITEMS.register("hollow_helmet", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.HEAD,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_CHESTPLATE = Registration.ITEMS.register("hollow_chestplate", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.CHEST,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_LEGGINGS = Registration.ITEMS.register("hollow_leggings", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.LEGS,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_BOOTS = Registration.ITEMS.register("hollow_boots", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.FEET,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_AXE = Registration.ITEMS.register("hollow_axe", () ->
            new AxeItem(ModItemTier.HOLLOW, 5, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_PICKAXE = Registration.ITEMS.register("hollow_pickaxe", () ->
            new PickaxeItem(ModItemTier.HOLLOW,1, -2.8F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_SWORD = Registration.ITEMS.register("hollow_sword", () ->
            new HollowSword(ModItemTier.HOLLOW,3, -2.4F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_SHOVEL = Registration.ITEMS.register("hollow_shovel", () ->
            new ShovelItem(ModItemTier.HOLLOW,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_HOE = Registration.ITEMS.register("hollow_hoe", () ->
            new HoeItem(ModItemTier.HOLLOW,1, -3.0F,
                    new Item.Properties().tab(RAVENS_HOLLOW_TAB).stacksTo(1)));
    // MISC
    public static final RegistryObject<Item> FEATHER = Registration.ITEMS.register("feather", () ->
            new Item(new Properties().tab(RAVENS_HOLLOW_TAB)));
    // TURTWIG LIKE BOSS. NOCTURNAL. LOOKS LIKE BLOCKS/REMOVES BLOCKS IN NEST.
    static void register() {}
}
