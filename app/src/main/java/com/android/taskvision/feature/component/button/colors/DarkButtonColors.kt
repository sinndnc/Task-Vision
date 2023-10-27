package com.android.taskvision.feature.component.button.colors

import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun darkButtonColors() = ButtonDefaults.buttonColors(
    backgroundColor = Color.Black,
    contentColor = Color.LightGray,
    disabledBackgroundColor = Color.DarkGray,
)