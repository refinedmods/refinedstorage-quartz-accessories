package com.refinedmods.refinedstorage.quartzaccessories.common;

import net.minecraft.network.chat.MutableComponent;

import static com.refinedmods.refinedstorage.quartzaccessories.common.QuartzAccessoriesIdentifierUtil.createQuartzAccessoriesTranslation;

public final class ContentNames {
    public static final MutableComponent BLOCK_OF_QUARTZ_ENRICHED_IRON = createQuartzAccessoriesTranslation(
        "block", "block_of_quartz_enriched_iron"
    );
    public static final MutableComponent BLOCK_OF_QUARTZ_ENRICHED_COPPER = createQuartzAccessoriesTranslation(
        "block", "block_of_quartz_enriched_copper"
    );

    private ContentNames() {
    }
}
