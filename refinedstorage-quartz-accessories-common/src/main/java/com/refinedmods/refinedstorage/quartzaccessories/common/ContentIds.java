package com.refinedmods.refinedstorage.quartzaccessories.common;

import net.minecraft.resources.ResourceLocation;

import static com.refinedmods.refinedstorage.quartzaccessories.common.QuartzAccessoriesIdentifierUtil.createQuartzAccessoriesIdentifier;

public final class ContentIds {
    public static final ResourceLocation BLOCK_OF_QUARTZ_ENRICHED_IRON =
        createQuartzAccessoriesIdentifier("block_of_quartz_enriched_iron");
    public static final ResourceLocation BLOCK_OF_QUARTZ_ENRICHED_COPPER =
        createQuartzAccessoriesIdentifier("block_of_quartz_enriched_copper");

    private ContentIds() {
    }
}
