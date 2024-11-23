package com.refinedmods.refinedstorage.quartzaccessories.common;

import java.util.function.Supplier;
import javax.annotation.Nullable;

import net.minecraft.world.item.BlockItem;

import static java.util.Objects.requireNonNull;

public final class Items {
    public static final Items INSTANCE = new Items();

    @Nullable
    private Supplier<BlockItem> blockOfQuartzEnrichedIron;
    @Nullable
    private Supplier<BlockItem> blockOfQuartzEnrichedCopper;

    private Items() {
    }

    public void setBlockOfQuartzEnrichedIron(Supplier<BlockItem> blockOfQuartzEnrichedIron) {
        this.blockOfQuartzEnrichedIron = requireNonNull(blockOfQuartzEnrichedIron);
    }

    public void setBlockOfQuartzEnrichedCopper(Supplier<BlockItem> blockOfQuartzEnrichedCopper) {
        this.blockOfQuartzEnrichedCopper = requireNonNull(blockOfQuartzEnrichedCopper);
    }

    public BlockItem getBlockOfQuartzEnrichedIron() {
        return requireNonNull(blockOfQuartzEnrichedIron).get();
    }

    public BlockItem getBlockOfQuartzEnrichedCopper() {
        return requireNonNull(blockOfQuartzEnrichedCopper).get();
    }
}
