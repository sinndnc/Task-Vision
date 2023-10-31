package com.android.taskvision.feature.component.texfield.colors

import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable

@Composable
fun outlinedTextFieldColors() = TextFieldDefaults.outlinedTextFieldColors(
    textColor = MaterialTheme.colors.onBackground,

)
