package com.refinedmods.refinedstorage.quartzaccessories.common;

import java.util.function.Supplier;
import javax.annotation.Nullable;

import net.minecraft.world.level.block.Block;

import static java.util.Objects.requireNonNull;

public final class Blocks {
    public static final Blocks INSTANCE = new Blocks();

    @Nullable
    private Supplier<Block> blockOfQuartzEnrichedIron;
    @Nullable
    private Supplier<Block> blockOfQuartzEnrichedCopper;

    private Blocks() {
    }

    public void setBlockOfQuartzEnrichedIron(Supplier<Block> blockOfQuartzEnrichedIron) {
        this.blockOfQuartzEnrichedIron = requireNonNull(blockOfQuartzEnrichedIron);
    }

    public void setBlockOfQuartzEnrichedCopper(Supplier<Block> blockOfQuartzEnrichedCopper) {
        this.blockOfQuartzEnrichedCopper = requireNonNull(blockOfQuartzEnrichedCopper);
    }

    public Block getBlockOfQuartzEnrichedIron() {
        return requireNonNull(blockOfQuartzEnrichedIron).get();
    }

    public Block getBlockOfQuartzEnrichedCopper() {
        return requireNonNull(blockOfQuartzEnrichedCopper).get();
    }
}
