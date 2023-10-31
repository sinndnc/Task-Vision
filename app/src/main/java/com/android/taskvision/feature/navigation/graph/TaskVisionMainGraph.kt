package com.android.taskvision.feature.navigation.graph

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.android.taskvision.feature.navigation.content.Content
import com.android.taskvision.feature.presentation.main.MainContent
import com.android.taskvision.feature.presentation.main.MainViewModel

fun NavGraphBuilder.taskVisionMainGraph(navController: NavController) {
    navigation(
        startDestination = Content.Main.route,
        route = Content.MAIN_GRAPH
    ) {
        composable(Content.Main.route) {
            val mainViewModel = hiltViewModel<MainViewModel>()
            MainContent(viewModel = mainViewModel, navController = navController)
        }

    }
}