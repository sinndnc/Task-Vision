package com.android.taskvision.feature.presentation.auth.signIn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.android.taskvision.feature.presentation.auth.signIn.component.SignInMiddleView
import com.android.taskvision.feature.presentation.auth.signIn.component.SignInTopView
import com.android.taskvision.feature.presentation.auth.signIn.component.TaskVisionBottomView
import com.android.taskvision.feature.util.extension.noRippleClickable

@Composable
fun SignInContent(viewModel: SignInViewModel, navController: NavController) {

    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .statusBarsPadding()
            .noRippleClickable {
                focusManager.clearFocus(true)
            },
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SignInTopView(viewModel, navController)
        SignInMiddleView(viewModel, navController)
        TaskVisionBottomView(viewModel, navController)
    }
}

@Preview
@Composable
fun SignInContentPreview() {
    SignInContent(viewModel = hiltViewModel(), navController = rememberNavController())
}