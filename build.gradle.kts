plugins {
    id(com.android.taskvision.Dependencies.Plugin.hilt) version "2.44" apply false
    id(com.android.taskvision.Dependencies.Plugin.library) version "7.4.2" apply false
    id(com.android.taskvision.Dependencies.Plugin.kotlin) version "1.8.10" apply false
    id(com.android.taskvision.Dependencies.Plugin.application) version "7.4.2" apply false
    id(com.android.taskvision.Dependencies.Plugin.googleService) version "4.4.0" apply false
}

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(com.android.taskvision.Dependencies.Gradle.android)
        classpath(com.android.taskvision.Dependencies.Gradle.googleService)
    }
}