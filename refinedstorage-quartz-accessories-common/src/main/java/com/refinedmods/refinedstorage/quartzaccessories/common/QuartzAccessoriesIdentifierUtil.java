package com.refinedmods.refinedstorage.quartzaccessories.common;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;

public final class QuartzAccessoriesIdentifierUtil {
    public static final String QUARTZ_ACCESSORIES_MOD_ID = "refinedstorage_quartz_accessories";

    private QuartzAccessoriesIdentifierUtil() {
    }

    public static ResourceLocation createQuartzAccessoriesIdentifier(final String value) {
        return ResourceLocation.fromNamespaceAndPath(QUARTZ_ACCESSORIES_MOD_ID, value);
    }

    public static MutableComponent createQuartzAccessoriesTranslation(final String category, final String value) {
        return Component.translatable(createQuartzAccessoriesTranslationKey(category, value));
    }

    private static String createQuartzAccessoriesTranslationKey(final String category, final String value) {
        return String.format("%s.%s.%s", category, QUARTZ_ACCESSORIES_MOD_ID, value);
    }
}
