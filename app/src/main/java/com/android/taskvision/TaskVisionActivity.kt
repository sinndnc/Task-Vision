package com.android.taskvision

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.android.taskvision.feature.navigation.main.TaskVisionNavigationGraph
import com.android.taskvision.feature.util.theme.TaskVisionTheme
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint
class TaskVisionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialSettings()
        setContent {
            TaskVisionTheme {
               TaskVisionNavigationGraph()
            }
        }
    }

    private fun initialSettings(){
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}