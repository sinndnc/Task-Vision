package com.android.taskvision.feature.presentation.auth.signIn

import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.core.domain.repository.auth.SignInRepository
import com.android.taskvision.feature.navigation.content.Content
import com.android.taskvision.feature.util.state.UiState
import com.google.android.gms.auth.api.identity.SignInClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInClient: SignInClient,
    private val signInRepository: SignInRepository
) : ViewModel() {

    val uiState = mutableStateOf(UiState.Initial)

    fun signInWithGoogle(activityResult: ActivityResultLauncher<IntentSenderRequest>) {
        signInRepository.signInWithGoogle().onEach { responseState ->
            responseState.onLoading {
                uiState.value = UiState.Loading
            }.onError { exception ->
                uiState.value = UiState.Error
                Log.d("SignInGoogleTest", exception.message.toString())
            }.onSuccess { result ->
                uiState.value = UiState.Success
                val intentSenderRequest = IntentSenderRequest.Builder(result.pendingIntent.intentSender)
                activityResult.launch(intentSenderRequest.build())
            }
        }.launchIn(viewModelScope)
    }

    fun signInEmailAndPassword(model: SignInWithEmailAndPasswordModel, navController: NavController) {
        signInRepository.signInWithEmailAndPassword(model).onEach { responseState ->
            responseState.onLoading {
                uiState.value = UiState.Loading
            }.onError { exception ->

            }.onSuccess {
                onLoginSuccess(navController)
            }
        }.launchIn(viewModelScope)
    }

    private fun onLoginSuccess(navController: NavController) {
        uiState.value = UiState.Success
        //navController.popBackStack()
        navController.navigate(Content.Main.route) {
            popUpTo(Content.OnBoard.route) {
                inclusive = true
            }
        }

    }


}