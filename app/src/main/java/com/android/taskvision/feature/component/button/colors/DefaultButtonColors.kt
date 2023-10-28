package com.android.taskvision.feature.component.button.colors

import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun defaultButtonColors() = ButtonDefaults.buttonColors(
    backgroundColor = MaterialTheme.colors.background,
    contentColor = MaterialTheme.colors.onBackground,
)