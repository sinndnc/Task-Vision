package com.android.taskvision.core.data.remote.auth

import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.core.domain.remote.auth.SignInRemoteService
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject

class SignInRemoteServiceImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) : SignInRemoteService {

    override fun signInWithApple() {
        TODO("Not yet implemented")
    }

    override fun signInWithGoogle() {
        TODO("Not yet implemented")
    }

    override fun signInWithEmailAndPassword(model: SignInWithEmailAndPasswordModel): Task<AuthResult> =
        firebaseAuth.signInWithEmailAndPassword(model.email, model.password)


}