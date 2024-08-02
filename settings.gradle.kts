pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
rootProject.name = "QinetikLogger"

include(":demo:android")
include(":demo:desktop")
include(":demo:common")
include(":demo:web")
include(":logger")
