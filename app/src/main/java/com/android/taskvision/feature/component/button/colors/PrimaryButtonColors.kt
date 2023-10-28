package com.android.taskvision.feature.component.button.colors

import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun primaryButtonColors() = ButtonDefaults.buttonColors(
    backgroundColor = MaterialTheme.colors.secondary,
    contentColor = MaterialTheme.colors.onSecondary,
)