package com.android.taskvision.feature.presentation.auth.signIn.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.android.taskvision.feature.presentation.auth.signIn.SignInViewModel

@Composable
fun ColumnScope.SignInTopView(viewModel: SignInViewModel, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.1f),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
    ) {
        IconButton(modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .background(Color.DarkGray),
            onClick = {
                navController.navigateUp()
            }
        ) {
            Icon(Icons.Rounded.ArrowBack, contentDescription = "signIn Back button")
        }
    }
}