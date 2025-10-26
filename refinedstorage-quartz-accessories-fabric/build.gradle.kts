plugins {
    id("com.refinedmods.refinedarchitect.fabric")
}

repositories {
    maven {
        name = "Refined Storage"
        url = uri("https://maven.creeperhost.net")
        content {
            includeGroup("com.refinedmods.refinedstorage")
        }
    }
    maven {
        name = "ModMenu"
        url = uri("https://maven.terraformersmc.com/")
    }
    maven {
        name = "Cloth Config"
        url = uri("https://maven.shedaniel.me/")
    }
}

refinedarchitect {
    modId = "refinedstorage_quartz_accessories"
    fabric()
    publishing {
        maven = true
    }
}

base {
    archivesName.set("refinedstorage-quartz-accessories-fabric")
}

val refinedstorageVersion: String by project

val commonJava by configurations.existing
val commonResources by configurations.existing

dependencies {
    compileOnly(project(":refinedstorage-quartz-accessories-common"))
    commonJava(project(path = ":refinedstorage-quartz-accessories-common", configuration = "commonJava"))
    commonResources(project(path = ":refinedstorage-quartz-accessories-common", configuration = "commonResources"))
    modApi("com.refinedmods.refinedstorage:refinedstorage-fabric:${refinedstorageVersion}")
}
