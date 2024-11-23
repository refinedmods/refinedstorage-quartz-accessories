package com.refinedmods.refinedstorage.quartzaccessories.fabric;

import com.refinedmods.refinedstorage.common.api.RefinedStorageApi;
import com.refinedmods.refinedstorage.common.content.DirectRegistryCallback;
import com.refinedmods.refinedstorage.fabric.api.RefinedStoragePlugin;
import com.refinedmods.refinedstorage.quartzaccessories.common.AbstractModInitializer;
import com.refinedmods.refinedstorage.quartzaccessories.common.CreativeModeTabItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RefinedStoragePluginImpl extends AbstractModInitializer implements RefinedStoragePlugin {
    @Override
    public void onApiAvailable(final RefinedStorageApi refinedStorageApi) {
        registerContent();
        registerCreativeModeTabListener(refinedStorageApi);
    }

    private void registerContent() {
        final DirectRegistryCallback<Block> blockRegistryCallback = new DirectRegistryCallback<>(
            BuiltInRegistries.BLOCK
        );
        registerBlocks(blockRegistryCallback);
        final DirectRegistryCallback<Item> itemRegistryCallback = new DirectRegistryCallback<>(BuiltInRegistries.ITEM);
        registerItems(itemRegistryCallback);
    }

    private void registerCreativeModeTabListener(final RefinedStorageApi refinedStorageApi) {
        final ResourceKey<CreativeModeTab> creativeModeTab = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            refinedStorageApi.getCreativeModeTabId()
        );
        ItemGroupEvents.modifyEntriesEvent(creativeModeTab).register(
            entries -> CreativeModeTabItems.addItems(entries::accept)
        );
    }
}
