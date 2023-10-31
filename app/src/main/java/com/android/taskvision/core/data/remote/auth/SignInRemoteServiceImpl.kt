package com.android.taskvision.core.data.remote.auth

import TaskVision.R
import android.content.Context
import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.core.domain.remote.auth.SignInRemoteService
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SignInRemoteServiceImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
    @ApplicationContext private val context: Context,
) : SignInRemoteService {

    override fun signInWithApple() {
        TODO("Not yet implemented")
    }

    override fun signInWithGoogle() =
        BeginSignInRequest.builder()
            .setGoogleIdTokenRequestOptions(
                BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                    .setSupported(true)
                    .setServerClientId("860199150563-b1o7biu39u1nca32gktofh6677k71nt7.apps.googleusercontent.com")
                    .setFilterByAuthorizedAccounts(false)
                    .build()
            )
            .build()


    override fun signInWithEmailAndPassword(model: SignInWithEmailAndPasswordModel): Task<AuthResult> =
        firebaseAuth.signInWithEmailAndPassword(model.email, model.password)

}