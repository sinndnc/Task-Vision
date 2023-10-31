package com.android.taskvision.core.domain.repository.auth

import android.app.Activity
import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.core.util.state.ResponseState
import com.google.android.gms.auth.api.identity.BeginSignInResult
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface SignInRepository {

    fun signInWithApple()
    fun signInWithGoogle(): Flow<ResponseState<BeginSignInResult>>
    fun signInWithEmailAndPassword(model: SignInWithEmailAndPasswordModel): Flow<ResponseState<FirebaseUser?>>
}