package com.sebastiantabor.ravenshollow.block;

import com.sebastiantabor.ravenshollow.*;
import com.sebastiantabor.ravenshollow.item.*;
import com.sebastiantabor.ravenshollow.setup.*;
import net.minecraft.network.chat.*;
import net.minecraft.util.valueproviders.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.registries.*;

import javax.annotation.*;
import java.util.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RavensHollow.MOD_ID);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.METAL)
            .strength(1.0f).requiresCorrectToolForDrops(), UniformInt.of(0,2)), ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.TERRACOTTA_WHITE).strength(1).requiresCorrectToolForDrops().sound(SoundType.METAL)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.TERRACOTTA_WHITE).strength(1).requiresCorrectToolForDrops().sound(SoundType.METAL)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(1).requiresCorrectToolForDrops().sound(SoundType.METAL)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> RED_DIAMOND_BLOCK = registerBlock("red_diamond_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(2.5F).requiresCorrectToolForDrops().sound(SoundType.METAL)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> RED_ORE = registerBlock("red_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.0f).requiresCorrectToolForDrops(),UniformInt.of(3,7)), ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    //Possible new sounds? RED, HOLLOW, etc
    public static final RegistryObject<Block> RAW_HOLLOW_BLOCK = registerBlock("raw_hollow_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3F).requiresCorrectToolForDrops().sound(SoundType.METAL)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> HOLLOW_BLOCK = registerBlock("hollow_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    //public static final RegistryObject<Block> RAVEN_ALTAR = registerBlock("raven_altar", () ->
           // new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)),ModCreativeModeTab.RAVENS_HOLLOW_TAB);
    public static final RegistryObject<Block> HOLLOW_ORE = registerBlock("hollow_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.RAVENS_HOLLOW_TAB);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
