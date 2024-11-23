package com.refinedmods.refinedstorage.quartzaccessories.common;

import com.refinedmods.refinedstorage.common.content.BlockConstants;
import com.refinedmods.refinedstorage.common.content.RegistryCallback;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public abstract class AbstractModInitializer {
    protected final void registerBlocks(final RegistryCallback<Block> callback) {
        Blocks.INSTANCE.setBlockOfQuartzEnrichedIron(callback.register(
            ContentIds.BLOCK_OF_QUARTZ_ENRICHED_IRON,
            () -> new Block(BlockConstants.PROPERTIES)
        ));
        Blocks.INSTANCE.setBlockOfQuartzEnrichedCopper(callback.register(
            ContentIds.BLOCK_OF_QUARTZ_ENRICHED_COPPER,
            () -> new Block(BlockConstants.PROPERTIES)
        ));
    }

    protected final void registerItems(final RegistryCallback<Item> callback) {
        Items.INSTANCE.setBlockOfQuartzEnrichedIron(callback.register(
            ContentIds.BLOCK_OF_QUARTZ_ENRICHED_IRON,
            () -> new BlockItem(Blocks.INSTANCE.getBlockOfQuartzEnrichedIron(), new Item.Properties())
        ));
        Items.INSTANCE.setBlockOfQuartzEnrichedCopper(callback.register(
            ContentIds.BLOCK_OF_QUARTZ_ENRICHED_COPPER,
            () -> new BlockItem(Blocks.INSTANCE.getBlockOfQuartzEnrichedCopper(), new Item.Properties())
        ));
    }
}
