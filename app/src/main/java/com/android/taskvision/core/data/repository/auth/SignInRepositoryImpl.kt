package com.android.taskvision.core.data.repository.auth

import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.core.domain.remote.auth.SignInRemoteService
import com.android.taskvision.core.domain.repository.auth.SignInRepository
import com.android.taskvision.core.util.state.ResponseState
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

class SignInRepositoryImpl @Inject constructor(
    private val signInRemoteService: SignInRemoteService,
) : SignInRepository {

    override fun signInApple() {
        TODO("Not yet implemented")
    }

    override fun signInGoogle() {
        TODO("Not yet implemented")
    }

    override fun signInWithEmailAndPassword(model: SignInWithEmailAndPasswordModel): Flow<ResponseState<FirebaseUser?>> =
        callbackFlow {
            send(ResponseState.Loading)
            signInRemoteService.signInWithEmailAndPassword(model)
                .addOnCanceledListener {
                    trySend(ResponseState.Error(Throwable("process is canceled")))
                }
                .addOnFailureListener { exception ->
                    trySend(ResponseState.Error(exception))
                }
                .addOnSuccessListener { task ->
                    trySend(ResponseState.Success(task.user))
                }
        }

}