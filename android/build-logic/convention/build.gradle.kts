plugins {
    `kotlin-dsl`
}

group = "io.github.sherifelkady70.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "nilepay.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

    }

}

