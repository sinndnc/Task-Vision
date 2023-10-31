package com.android.taskvision.core.di.module

import android.app.Activity
import android.content.Context
import com.google.android.gms.auth.api.identity.Identity
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.ktx.storage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {
    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth =
        FirebaseAuth.getInstance()
    @Provides
    @Singleton
    fun provideFireStore(): FirebaseFirestore =
        Firebase.firestore

    @Provides
    @Singleton
    fun provideGoogleClient(@ApplicationContext activity: Context): SignInClient =
        Identity.getSignInClient(activity)

    @Provides
    @Singleton
    fun provideStorage(): StorageReference =
        Firebase.storage.reference
    @Provides
    @Singleton
    fun provideFirebaseMessaging(): FirebaseMessaging =
        FirebaseMessaging.getInstance()
}