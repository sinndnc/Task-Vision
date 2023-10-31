package com.android.taskvision.feature.navigation.graph

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.android.taskvision.feature.navigation.content.Content
@Composable
fun TaskVisionNavigationGraph() {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        navController = navController,
        startDestination = Content.Splash.route,
    ) {
        taskVisionSplashGraph(navController = navController)
        taskVisionAuthGraph(navController = navController)
        taskVisionMainGraph(navController = navController)
    }
}