package com.android.taskvision.feature.presentation.auth.signIn

import androidx.lifecycle.ViewModel
import com.android.taskvision.core.domain.repository.auth.SignInRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInRepository: SignInRepository
) : ViewModel() {

}