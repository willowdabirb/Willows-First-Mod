package com.willowdabirb.willowsfirstmod.item;

import com.willowdabirb.willowsfirstmod.WillowsFirstMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WillowsFirstMod.MOD_ID);

    public static final DeferredItem<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERIDOT_SHARDS = ITEMS.register("peridot_shards",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
