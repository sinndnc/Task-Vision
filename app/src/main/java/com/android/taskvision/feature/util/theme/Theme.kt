package com.android.taskvision.feature.util.theme

import android.app.Activity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.android.taskvision.feature.util.theme.palette.DarkColorPalette
import com.android.taskvision.feature.util.theme.palette.LightColorPalette
@Composable
fun TaskVisionTheme( content: @Composable () -> Unit) {

    val view = LocalView.current

    if (!view.isInEditMode) {
        val currentWindow = (view.context as? Activity)?.window
            ?: throw Exception("Not in an activity - unable to get Window reference")

        SideEffect {
            currentWindow.statusBarColor =  Color.Transparent.toArgb()
            WindowCompat.getInsetsController(currentWindow, view).isAppearanceLightStatusBars = !true
            WindowCompat.getInsetsController(currentWindow, view).isAppearanceLightNavigationBars = !true
        }
    }
    val colors = if (true) DarkColorPalette else LightColorPalette

    MaterialTheme(
        colors = colors,
        content = content
    )
}