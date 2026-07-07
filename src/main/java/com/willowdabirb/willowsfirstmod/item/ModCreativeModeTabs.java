package com.willowdabirb.willowsfirstmod.item;

import com.willowdabirb.willowsfirstmod.WillowsFirstMod;
import com.willowdabirb.willowsfirstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WillowsFirstMod.MOD_ID);

    public static final Supplier<CreativeModeTab> PERIDOT_ITEMS_TAB = CREATIVE_MODE_TAB.register("peridot_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PERIDOT.get()))
                    .title(Component.translatable("creativetab.willowsfirstmod.peridot_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PERIDOT);
                        output.accept(ModItems.PERIDOT_SHARDS);
                    }).build());

    public static final Supplier<CreativeModeTab> PERIDOT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("peridot_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PERIDOT_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(WillowsFirstMod.MOD_ID, "peridot_items_tab"))
                    .title(Component.translatable("creativetab.willowsfirstmod.peridot_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PERIDOT_BLOCK);
                        output.accept(ModBlocks.PERIDOT_ORE);
                        output.accept(ModBlocks.PERIDOT_DEEPSLATE_ORE);
                        output.accept(ModBlocks.WOOKIE_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
