package com.android.taskvision.feature.presentation.auth.onBoard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.android.taskvision.feature.component.button.TaskVisionDefaultButton
import com.android.taskvision.feature.component.button.TaskVisionPrimaryButton

@Composable
fun OnBoardContent(viewModel: OnBoardViewModel, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .weight(0.6f)
                .fillMaxSize(),
        ) {
        }
        Column(
            modifier = Modifier
                .weight(0.4f)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                TaskVisionDefaultButton(contentText = "Sign In") {
                    viewModel.navigateToSignInContent(navController)
                }
                TaskVisionPrimaryButton(contentText = "Sign Up") {
                    viewModel.navigateToSignUpContent(navController)

                }
            }
        }
    }
}

@Preview
@Composable
fun OnBoardContentPreview() {
    OnBoardContent(hiltViewModel(), rememberNavController())
}