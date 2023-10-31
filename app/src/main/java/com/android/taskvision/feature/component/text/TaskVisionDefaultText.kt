package com.android.taskvision.feature.component.text

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle

@Composable
fun TaskVisionDefaultText(
    text: String,
    style: TextStyle,
) {
    Text(text = text, style = style, color = MaterialTheme.colors.onBackground)
}