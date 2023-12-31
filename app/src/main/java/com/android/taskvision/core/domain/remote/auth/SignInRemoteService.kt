package com.android.taskvision.core.domain.remote.auth

import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface SignInRemoteService {

    fun signInWithApple()
    fun signInWithGoogle(): BeginSignInRequest
    fun signInWithEmailAndPassword(model: SignInWithEmailAndPasswordModel): Task<AuthResult>
}