package com.refinedmods.refinedstorage.quartzaccessories.neoforge;

import com.refinedmods.refinedstorage.common.api.RefinedStorageApi;
import com.refinedmods.refinedstorage.common.content.RegistryCallback;
import com.refinedmods.refinedstorage.quartzaccessories.common.AbstractModInitializer;
import com.refinedmods.refinedstorage.quartzaccessories.common.CreativeModeTabItems;
import com.refinedmods.refinedstorage.quartzaccessories.common.QuartzAccessoriesIdentifierUtil;

import java.util.function.Supplier;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(QuartzAccessoriesIdentifierUtil.QUARTZ_ACCESSORIES_MOD_ID)
public class ModInitializer extends AbstractModInitializer {
    private final DeferredRegister<Item> itemRegistry =
        DeferredRegister.create(BuiltInRegistries.ITEM, QuartzAccessoriesIdentifierUtil.QUARTZ_ACCESSORIES_MOD_ID);
    private final DeferredRegister<Block> blockRegistry =
        DeferredRegister.create(BuiltInRegistries.BLOCK, QuartzAccessoriesIdentifierUtil.QUARTZ_ACCESSORIES_MOD_ID);

    public ModInitializer(final IEventBus eventBus) {
        registerContent(eventBus);
        eventBus.addListener(this::registerCreativeModeTabListener);
    }

    private void registerContent(final IEventBus eventBus) {
        registerItems(eventBus);
        registerBlocks(eventBus);
    }

    private void registerItems(final IEventBus eventBus) {
        final RegistryCallback<Item> callback = new ForgeRegistryCallback<>(itemRegistry);
        registerItems(callback);
        itemRegistry.register(eventBus);
    }

    private void registerBlocks(final IEventBus eventBus) {
        final RegistryCallback<Block> callback = new ForgeRegistryCallback<>(blockRegistry);
        registerBlocks(callback);
        blockRegistry.register(eventBus);
    }

    private void registerCreativeModeTabListener(final BuildCreativeModeTabContentsEvent e) {
        final ResourceKey<CreativeModeTab> creativeModeTab = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            RefinedStorageApi.INSTANCE.getCreativeModeTabId()
        );
        if (!e.getTabKey().equals(creativeModeTab)) {
            return;
        }
        CreativeModeTabItems.addItems(e::accept);
    }

    private record ForgeRegistryCallback<T>(DeferredRegister<T> registry) implements RegistryCallback<T> {
        @Override
        public <R extends T> Supplier<R> register(final ResourceLocation id, final Supplier<R> value) {
            return registry.register(id.getPath(), value);
        }
    }
}
