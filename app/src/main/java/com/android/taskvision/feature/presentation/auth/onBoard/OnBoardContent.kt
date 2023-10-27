package com.android.taskvision.feature.presentation.auth.onBoard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavController

@Composable
fun OnBoardContent(viewModel: OnBoardViewModel, navController: NavController) {
    val configuration = LocalConfiguration.current
    val width = configuration.screenWidthDp
    val height = configuration.screenHeightDp
    Box(modifier = Modifier.fillMaxSize().padding()) {

    }
}