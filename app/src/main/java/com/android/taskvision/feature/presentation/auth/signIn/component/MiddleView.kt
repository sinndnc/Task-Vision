package com.android.taskvision.feature.presentation.auth.signIn.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.android.taskvision.core.domain.model.auth.signIn.SignInWithEmailAndPasswordModel
import com.android.taskvision.feature.component.button.TaskVisionPrimaryButton
import com.android.taskvision.feature.component.texfield.TaskVisionOutlinedTextField
import com.android.taskvision.feature.component.text.TaskVisionDefaultText
import com.android.taskvision.feature.presentation.auth.signIn.SignInViewModel
import com.android.taskvision.feature.util.state.UiState

@Composable
fun ColumnScope.SignInMiddleView(viewModel: SignInViewModel, navController: NavController) {

    var email by remember { mutableStateOf("sinandinc444@gmail.com") }
    var password by remember { mutableStateOf("Snn20012004") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.1f),
        contentAlignment = Alignment.CenterStart,
    ) {
        TaskVisionDefaultText(text = "Sign In", style = MaterialTheme.typography.h4)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.2f),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        TaskVisionOutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            placeholder = "email",
            value = email,
            onValueChange = { email = it })
        TaskVisionOutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            placeholder = "password",
            value = password,
            onValueChange = { password = it })
        TaskVisionDefaultText(text = "forgot password", style = MaterialTheme.typography.caption)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.1f),
        contentAlignment = Alignment.Center
    ) {
        if (viewModel.uiState.value == UiState.Loading)
            CircularProgressIndicator()
        else
            TaskVisionPrimaryButton(modifier = Modifier.fillMaxWidth(), contentText = "Sign In") {
                viewModel.signInEmailAndPassword(SignInWithEmailAndPasswordModel(email, password), navController)
            }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth(0.85f)
            .weight(0.05f),
        contentAlignment = Alignment.CenterStart,
    ) {
        Divider()
    }
}