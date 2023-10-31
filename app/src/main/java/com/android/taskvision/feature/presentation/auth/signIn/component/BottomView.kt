package com.android.taskvision.feature.presentation.auth.signIn.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.android.taskvision.feature.component.button.TaskVisionDefaultButton
import com.android.taskvision.feature.component.text.TaskVisionDefaultText
import com.android.taskvision.feature.presentation.auth.signIn.SignInViewModel
import com.android.taskvision.feature.util.contracts.activityForResultContracts

@Composable
fun ColumnScope.TaskVisionBottomView(viewModel: SignInViewModel, navController: NavController) {

    val resultContracts = activityForResultContracts()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.34f),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TaskVisionDefaultButton(shapeSize = 25, modifier = Modifier.fillMaxWidth(), contentText = "Sign In with Apple") {}
        TaskVisionDefaultButton(shapeSize = 25, modifier = Modifier.fillMaxWidth(), contentText = "Sign In with Google") {
            viewModel.signInWithGoogle(resultContracts)
        }
        TaskVisionDefaultButton(shapeSize = 25, modifier = Modifier.fillMaxWidth(), contentText = "Sign In with Twitter") {}
        TaskVisionDefaultButton(shapeSize = 25, modifier = Modifier.fillMaxWidth(), contentText = "Sign In with Facebook") {}
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.1f),
        contentAlignment = Alignment.TopCenter
    ) {
        TaskVisionDefaultText(text = "Don't have an account?  Sign Up", MaterialTheme.typography.body1)
    }
}