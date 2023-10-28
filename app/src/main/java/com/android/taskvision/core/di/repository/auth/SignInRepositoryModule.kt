package com.android.taskvision.core.di.repository.auth

import com.android.taskvision.core.data.repository.auth.SignInRepositoryImpl
import com.android.taskvision.core.domain.repository.auth.SignInRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SignInRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindLoginRepository(signInRepositoryImpl: SignInRepositoryImpl): SignInRepository
}