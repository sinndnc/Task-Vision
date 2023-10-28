package com.android.taskvision.feature.presentation.auth.onBoard

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.android.taskvision.feature.navigation.content.Content
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardViewModel  @Inject constructor() : ViewModel() {

    fun navigateToSignInContent(navController: NavController){
        navController.navigate(Content.SignIn.route)
    }
    fun navigateToSignUpContent(navController: NavController){
        navController.navigate(Content.SignUp.route)
    }
}