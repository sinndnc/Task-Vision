package com.android.taskvision.feature.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.taskvision.feature.component.button.colors.darkButtonColors
import com.android.taskvision.feature.component.button.size.ButtonSize

@Composable
fun TaskVisionButton(
    modifier: Modifier = Modifier,
    contentText: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .height(ButtonSize.DefaultButtonHeight)
            .width(ButtonSize.DefaultButtonWidth),
        colors = darkButtonColors(),
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, Color.Transparent),
    ) {
        Text(text = contentText)
    }
}

@Preview
@Composable
fun TaskVisionButtonPreview() {
    TaskVisionButton(contentText = "Sign In") {}
}