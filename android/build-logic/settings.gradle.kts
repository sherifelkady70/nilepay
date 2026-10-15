dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    versionCatalogs {
        create("libs") {
            from(files("/Users/sherifabdulrahman/nilepay/android/gradle/libs.versions.toml"))
        }
    }
}


rootProject.name = "build-logic"
include(":convention")