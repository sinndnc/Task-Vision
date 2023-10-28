package com.android.taskvision.core.di.remote.auth

import com.android.taskvision.core.data.remote.auth.SignInRemoteServiceImpl
import com.android.taskvision.core.domain.remote.auth.SignInRemoteService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SignInRemoteServiceModule {

    @Binds
    @Singleton
    abstract fun bindLoginService(signInRemoteServiceImpl: SignInRemoteServiceImpl): SignInRemoteService
}