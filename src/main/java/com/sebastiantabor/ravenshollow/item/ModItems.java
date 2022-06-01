package com.sebastiantabor.ravenshollow.item;

import com.sebastiantabor.ravenshollow.*;
import com.sebastiantabor.ravenshollow.item.custom.*;
import com.sebastiantabor.ravenshollow.setup.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.registries.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RavensHollow.MOD_ID);
    // SILVER
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () ->
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () ->
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () ->
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () ->
            new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () ->
            new AxeItem(ModItemTier.SILVER, 5, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(ModItemTier.SILVER, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () ->
            new SwordItem(ModItemTier.SILVER, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
            new ShovelItem(ModItemTier.SILVER, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", () ->
            new HoeItem(ModItemTier.SILVER, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    // BRONZE
    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () ->
            new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () ->
            new AxeItem(ModItemTier.BRONZE, 5, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () ->
            new PickaxeItem(ModItemTier.BRONZE, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () ->
            new SwordItem(ModItemTier.BRONZE, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () ->
            new ShovelItem(ModItemTier.BRONZE, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () ->
            new HoeItem(ModItemTier.BRONZE, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    // RED DIAMOND
    public static final RegistryObject<Item> RED_DIAMOND = ITEMS.register("red_diamond", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> RED_HELMET = ITEMS.register("red_helmet", () ->
            new ArmorItem(ModArmorMaterials.RED, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_CHESTPLATE = ITEMS.register("red_chestplate", () ->
            new ArmorItem(ModArmorMaterials.RED, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_LEGGINGS = ITEMS.register("red_leggings", () ->
            new ArmorItem(ModArmorMaterials.RED, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_BOOTS = ITEMS.register("red_boots", () ->
            new ArmorItem(ModArmorMaterials.RED, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_AXE = ITEMS.register("red_axe", () ->
            new AxeItem(ModItemTier.RED, 5, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_PICKAXE = ITEMS.register("red_pickaxe", () ->
            new PickaxeItem(ModItemTier.RED, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_SWORD = ITEMS.register("red_sword", () ->
            new SwordItem(ModItemTier.RED, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_SHOVEL = ITEMS.register("red_shovel", () ->
            new ShovelItem(ModItemTier.RED, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RED_HOE = ITEMS.register("red_hoe", () ->
            new HoeItem(ModItemTier.RED, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    // HOLLOW
    public static final RegistryObject<Item> RAW_HOLLOW = ITEMS.register("raw_hollow", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> HOLLOW_NUGGET = ITEMS.register("hollow_nugget", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> HOLLOW_INGOT = ITEMS.register("hollow_ingot", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));
    public static final RegistryObject<Item> HOLLOW_HELMET = ITEMS.register("hollow_helmet", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_CHESTPLATE = ITEMS.register("hollow_chestplate", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_LEGGINGS = ITEMS.register("hollow_leggings", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_BOOTS = ITEMS.register("hollow_boots", () ->
            new ArmorItem(ModArmorMaterials.HOLLOW, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_AXE = ITEMS.register("hollow_axe", () ->
            new HollowAxe(ModItemTier.HOLLOW, 5, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_PICKAXE = ITEMS.register("hollow_pickaxe", () ->
            new HollowPickaxe(ModItemTier.HOLLOW, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_SWORD = ITEMS.register("hollow_sword", () ->
            new HollowSword(ModItemTier.HOLLOW, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_SHOVEL = ITEMS.register("hollow_shovel", () ->
            new HollowShovel(ModItemTier.HOLLOW, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOLLOW_HOE = ITEMS.register("hollow_hoe", () ->
            new HollowHoe(ModItemTier.HOLLOW, 1, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB).stacksTo(1)));
    // MISC
    public static final RegistryObject<Item> FEATHER = ITEMS.register("feather", () ->
            new Item(new Properties().tab(ModCreativeModeTab.RAVENS_HOLLOW_TAB)));

    // TURTWIG LIKE BOSS. NOCTURNAL. LOOKS LIKE BLOCKS/REMOVES BLOCKS IN NEST.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
