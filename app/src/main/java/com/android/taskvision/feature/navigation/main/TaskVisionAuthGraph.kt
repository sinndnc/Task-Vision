package com.android.taskvision.feature.navigation.main

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.android.taskvision.feature.navigation.content.Content
import com.android.taskvision.feature.presentation.auth.onBoard.OnBoardContent
import com.android.taskvision.feature.presentation.auth.onBoard.OnBoardViewModel
fun NavGraphBuilder.taskVisionAuthGraph(navController: NavController) {
    navigation(
        startDestination = Content.OnBoard.route,
        route = Content.AUTH_GRAPH
    ) {
        composable(Content.OnBoard.route) {
            val onBoardViewModel = hiltViewModel<OnBoardViewModel>()
            OnBoardContent(viewModel = onBoardViewModel, navController = navController)
        }
    }
}