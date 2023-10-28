package com.android.taskvision.core.domain.repository.auth

import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.core.util.state.ResponseState
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface SignInRepository {

    fun signInApple()
    fun signInGoogle()
    fun signInWithEmailAndPassword(model: SignInWithEmailAndPasswordModel): Flow<ResponseState<FirebaseUser?>>
}