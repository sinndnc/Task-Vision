package com.android.taskvision.feature.component.texfield

import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.taskvision.feature.component.texfield.colors.outlinedTextFieldColors
import com.android.taskvision.feature.component.text.TaskVisionDefaultText

@Composable
fun TaskVisionOutlinedTextField(
    value: String,
    modifier: Modifier,
    placeholder: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        placeholder = { TaskVisionDefaultText(text = placeholder, style = MaterialTheme.typography.body2) },
        colors = outlinedTextFieldColors()
    )
}