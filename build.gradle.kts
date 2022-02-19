// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
    id("org.jetbrains.kotlin.jvm") version "1.6.10" apply false
    id("com.android.library") version "7.1.0" apply false
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}