plugins {
    id("refinedarchitect.root")
    id("refinedarchitect.base")
}

refinedarchitect {
    sonarQube("refinedmods_refinedstorage-quartz-accessories", "refinedmods")
}

subprojects {
    group = "com.refinedmods.refinedstorage"
}
