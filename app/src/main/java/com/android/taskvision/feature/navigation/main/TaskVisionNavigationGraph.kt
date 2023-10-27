package com.android.taskvision.feature.navigation.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.android.taskvision.feature.navigation.content.Content
@Composable
fun TaskVisionNavigationGraph() {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .fillMaxSize(),
        navController = navController,
        startDestination = Content.Splash.route,
    ) {
        taskVisionSplashGraph(navController = navController)
        taskVisionAuthGraph(navController = navController)
    }
}