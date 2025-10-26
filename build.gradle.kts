plugins {
    id("com.refinedmods.refinedarchitect.root")
    id("com.refinedmods.refinedarchitect.base")
}

refinedarchitect {
    sonarQube("refinedmods_refinedstorage-quartz-accessories", "refinedmods")
}

subprojects {
    group = "com.refinedmods.refinedstorage"
}
