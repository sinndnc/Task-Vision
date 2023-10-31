package com.android.taskvision.core.data.repository.auth

import android.app.Activity
import android.content.Context
import android.content.IntentSender
import android.util.Log
import androidx.core.app.ActivityCompat.startIntentSenderForResult
import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.core.domain.remote.auth.SignInRemoteService
import com.android.taskvision.core.domain.repository.auth.SignInRepository
import com.android.taskvision.core.util.state.ResponseState
import com.google.android.gms.auth.api.identity.BeginSignInResult
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

class SignInRepositoryImpl @Inject constructor(
    private val signInClient: SignInClient,
    private val signInRemoteService: SignInRemoteService,
) : SignInRepository {

    override fun signInWithApple() {
        TODO("Not yet implemented")
    }

    override fun signInWithGoogle(): Flow<ResponseState<BeginSignInResult>> = callbackFlow {
        send(ResponseState.Loading)
        signInClient.beginSignIn(signInRemoteService.signInWithGoogle())
            .addOnCanceledListener {
                Log.d("SignInGoogleTest", "canceled")
            }.addOnFailureListener {
                trySend(ResponseState.Error(it))
                Log.d("SignInGoogleTest", it.message.toString())
            }.addOnSuccessListener { result ->
                trySend(ResponseState.Success(result))
                Log.d("SignInGoogleTest", result.toString())
            }
        awaitClose { }
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
            awaitClose { }
        }

}