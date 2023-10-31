package com.android.taskvision

import com.android.taskvision.Dependencies.Compose.compose_version

/**
 * For all packages you can click this link to see the source code:
 * https://developer.android.com/reference/packages
 */
object Dependencies {
    private const val hilt_version = "2.44"

    object Plugin {
        const val jvm = "jvm"
        const val kapt = "kapt"
        const val library = "com.android.library"
        const val hilt = "com.google.dagger.hilt.android"
        const val application = "com.android.application"
        const val kotlin = "org.jetbrains.kotlin.android"
        const val serialization = "org.jetbrains.kotlin.plugin.serialization"
        const val googleService = "com.google.gms.google-services"

    }

    object Gradle {
        const val android = "com.android.tools.build:gradle:7.4.2"
        const val googleService = "com.google.gms:google-services:4.3.15"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:$hilt_version"
    }

    object Androidx {
        const val activity = "androidx.activity:activity-ktx:1.6.0"
        const val core = "androidx.core:core-ktx:1.9.0"
        const val appCompat = "androidx.appcompat:appcompat:1.6.1"
    }

    object Ktor {
        private const val ktor_version = "2.3.0"
        const val cio = "io.ktor:ktor-client-cio:$ktor_version"
        const val core = "io.ktor:ktor-client-core:$ktor_version"
        const val android = "io.ktor:ktor-client-android:$ktor_version"
        const val negotiation = "io.ktor:ktor-client-content-negotiation:$ktor_version"
        const val clientSerialization = "io.ktor:ktor-client-serialization:$ktor_version"
        const val serialization = "io.ktor:ktor-serialization-kotlinx-json:$ktor_version"
    }

    object Firebase {
        private const val version = "31.2.3"
        const val auth = "com.google.firebase:firebase-auth-ktx"
        const val boom = "com.google.firebase:firebase-bom:$version"
        const val storage = "com.google.firebase:firebase-storage-ktx"
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val firestore = "com.google.firebase:firebase-firestore-ktx"
        const val bootAware = "com.google.firebase:firebase-messaging-directboot:20.2.0"
        const val messaging = "com.google.firebase:firebase-messaging-ktx"
        const val googleAuth = "com.google.android.gms:play-services-auth:20.7.0"
    }

    object WorkManager {
        private const val version = "2.7.1"
        const val runtime = "androidx.work:work-runtime-ktx:$version"
    }

    object GoogleService {
        private const val version = "18.1.0"
        const val maps = "com.google.android.gms:play-services-maps:$version"
        const val location = "com.google.android.gms:play-services-location:20.0.0"
    }

    object Hilt {
        const val workManager = "androidx.hilt:hilt-work:1.0.0"
        const val hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0"
        const val hilt = "com.google.dagger:hilt-android:$hilt_version"
        const val hiltKapt = "com.google.dagger:hilt-android-compiler:$hilt_version"
    }

    object Coroutines {
        private const val version = "1.3.6"
        const val services = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$version"
    }

    object Preferences {
        private const val version = "1.0.0"
        const val datastore = "androidx.datastore:datastore-preferences:$version"
    }

    object Serialization {
        private const val version = "1.5.0"
        const val runtime = "org.jetbrains.kotlinx:kotlinx-serialization-json:$version"
        const val gson = "com.google.code.gson:gson:2.9.0"
    }

    object Compose {
        const val compose_version = "1.4.3"
        const val ui = "androidx.compose.ui:ui:$compose_version"
        const val maps = "com.google.maps.android:maps-compose:2.5.3"
        const val activity = "androidx.activity:activity-compose:1.6.1"
        const val material = "androidx.compose.material:material:1.3.1"
        const val preview = "androidx.compose.ui:ui-tooling-preview:1.4.3"
    }

    object Lifecycle {
        private const val version = "2.6.0"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
        const val service = "androidx.lifecycle:lifecycle-service:$version"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
    }

    object Navigation {
        private const val version = "1.0.0"
        const val compose = "androidx.navigation:navigation-compose:2.5.3"
        const val hilt = "androidx.hilt:hilt-navigation-compose:$version"

    }

    object Room {
        private const val version = "2.4.3"
        const val runtime = "androidx.room:room-runtime:$version"
        const val compiler = "androidx.room:room-compiler:$version"
    }

    object Config {
        const val applicationName = "TaskVision"
        const val applicationId = "com.android.taskvision"
        const val targetSdk = 33
        const val minSdk = 28
        const val versionCode = 1
        const val versionName = "1.0"
    }

    //Test
    object Test {
        const val junit = "junit:junit:4.13.2"
    }

    object AndroidTest {
        const val junit = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
        const val uiJunit = "androidx.compose.ui:ui-test-junit4:$compose_version"
    }

    object DebugTest {
        const val uiTooling = "androidx.compose.ui:ui-tooling:$compose_version"
        const val uiManifest = "androidx.compose.ui:ui-test-manifest:$compose_version"
    }
}