package com.android.taskvision.feature.navigation.graph

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.android.taskvision.feature.navigation.content.Content
import com.android.taskvision.feature.presentation.auth.onBoard.OnBoardContent
import com.android.taskvision.feature.presentation.auth.onBoard.OnBoardViewModel
import com.android.taskvision.feature.presentation.auth.signIn.SignInContent
import com.android.taskvision.feature.presentation.auth.signIn.SignInViewModel

fun NavGraphBuilder.taskVisionAuthGraph(navController: NavController) {
    navigation(
        startDestination = Content.OnBoard.route,
        route = Content.AUTH_GRAPH
    ) {
        composable(Content.OnBoard.route) {
            val onBoardViewModel = hiltViewModel<OnBoardViewModel>()
            OnBoardContent(viewModel = onBoardViewModel, navController = navController)
        }
        composable(Content.SignIn.route) {
            val signInViewModel = hiltViewModel<SignInViewModel>()
            SignInContent(viewModel = signInViewModel, navController = navController)
        }
    }
}