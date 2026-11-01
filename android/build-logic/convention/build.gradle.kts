import org.gradle.kotlin.dsl.compileOnly

plugins {
    `kotlin-dsl`
}

group = "io.github.sherifelkady70.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.hilt.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "nilepay.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidHilt") {
            id = "nilepay.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }

    }

}

