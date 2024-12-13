// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.dagger.hilt.android) apply false
    alias(libs.plugins.kotlin.serialization)
    id("com.google.gms.google-services") version "4.4.2" apply false
}


//libs.plugins.android.application: Configures the module as an Android application, enabling features like APK generation, manifest merging, and resource processing.
//libs.plugins.kotlin.android: Enables Kotlin-specific features in the Android environment.
//libs.plugins.dagger.hilt.android: Configures Hilt for dependency injection and sets up annotation processors for Hilt.
//kotlin-kapt: Kotlin Annotation Processing Tool. It processes annotations (like Hilt's) during build time and generates code.
//kotlin-parcelize: Enables Kotlin's @Parcelize annotation for simplifying the implementation of Parcelable in Android.
//com.google.gms.google-services : Google services Gradle plugin