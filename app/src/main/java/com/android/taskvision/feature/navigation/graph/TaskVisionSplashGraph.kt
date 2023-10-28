package com.android.taskvision.feature.navigation.graph

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.android.taskvision.feature.navigation.content.Content
import com.android.taskvision.feature.presentation.splash.SplashContent
import com.android.taskvision.feature.presentation.splash.SplashViewModel
fun NavGraphBuilder.taskVisionSplashGraph(navController : NavController){
    composable(Content.Splash.route) {
        val splashViewModel = hiltViewModel<SplashViewModel>()
        SplashContent(viewModel = splashViewModel,navController = navController)
    }
}