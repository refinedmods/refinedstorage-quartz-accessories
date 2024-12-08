plugins {
    id("refinedarchitect.neoforge")
}

repositories {
    maven {
        url = uri("https://maven.pkg.github.com/refinedmods/refinedstorage2")
        credentials {
            username = "anything"
            password = "\u0067hp_oGjcDFCn8jeTzIj4Ke9pLoEVtpnZMP4VQgaX"
        }
    }
}

refinedarchitect {
    modId = "refinedstorage_quartz_accessories"
    neoForge()
    publishing {
        maven = true
    }
}

base {
    archivesName.set("refinedstorage-quartz-accessories-neoforge")
}

val refinedstorageVersion: String by project

val commonJava by configurations.existing
val commonResources by configurations.existing

dependencies {
    compileOnly(project(":refinedstorage-quartz-accessories-common"))
    commonJava(project(path = ":refinedstorage-quartz-accessories-common", configuration = "commonJava"))
    commonResources(project(path = ":refinedstorage-quartz-accessories-common", configuration = "commonResources"))
    api("com.refinedmods.refinedstorage:refinedstorage-neoforge:${refinedstorageVersion}")
}
