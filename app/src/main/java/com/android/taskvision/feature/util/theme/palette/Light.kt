package com.android.taskvision.feature.util.theme.palette

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Mint = Color(0xffB4F8C8)
val DarkMint = Color(0xff137a63)
val Cyan = Color(0xff94EDFF)
val DarkBlue = Color(0xff1D3B58)
val MidnightBlue = Color(0xff0A4C86)

val LightColorPalette = lightColors(
    primary = Mint,
    onPrimary = Color.White,

    secondary = Cyan,
    onSecondary = Color.White,

    primaryVariant = DarkMint,
    secondaryVariant = DarkBlue,

    background = Color.White,
    onBackground = Color.Black,

    surface = Color.White,
    onSurface = Color.Black,

    error = Color.Red,
    onError = Color.Black

)