package com.sebastiantabor.ravenshollow.setup;

import com.sebastiantabor.ravenshollow.RavensHollow;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.sebastiantabor.ravenshollow.RavensHollow.RAVENS_HOLLOW_TAB;

public class ModBlocks {
    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.TERRACOTTA_WHITE).strength(1).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> BRONZE_BLOCK = register("bronze_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> BLOOD_BLOCK = register("blood_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(2.5F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    //Possible new sounds? BLOOD, HOLLOW, etc
    public static final RegistryObject<Block> HOLLOW_BLOCK = register("hollow_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAVEN_ALTAR = register("raven_altar", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    static void register() {}

    private static <T extends Block > RegistryObject < T > registerNoItem(String name, Supplier< T > block) {
        return Registration.BLOCKS.register(name, block);
    }
    private static <T extends Block > RegistryObject < T > register(String name, Supplier < T > block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(RAVENS_HOLLOW_TAB)));
        return ret;
    }

}