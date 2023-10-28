package com.android.taskvision.feature.presentation.splash


import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController

@Composable
fun SplashContent(viewModel: SplashViewModel, navController: NavController) {
    LaunchedEffect(Unit) {
        viewModel.navigateUser(navController)
    }
}

