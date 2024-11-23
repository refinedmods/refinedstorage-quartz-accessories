package com.refinedmods.refinedstorage.quartzaccessories.common;

import java.util.function.Consumer;

import net.minecraft.world.item.ItemStack;

public final class CreativeModeTabItems {
    private CreativeModeTabItems() {
    }

    public static void addItems(final Consumer<ItemStack> consumer) {
        consumer.accept(Blocks.INSTANCE.getBlockOfQuartzEnrichedIron().asItem().getDefaultInstance());
        consumer.accept(Blocks.INSTANCE.getBlockOfQuartzEnrichedCopper().asItem().getDefaultInstance());
    }
}
