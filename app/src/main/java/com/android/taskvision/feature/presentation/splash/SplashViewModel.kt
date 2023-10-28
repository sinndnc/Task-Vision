package com.android.taskvision.feature.presentation.splash

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.android.taskvision.feature.navigation.content.Content
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
) : ViewModel() {

    fun navigateUser(navController: NavController) {
        navController.popBackStack()
        if (firebaseAuth.currentUser != null)
            navController.navigate(Content.MAIN_GRAPH)
        else
            navController.navigate(Content.AUTH_GRAPH)
    }
}