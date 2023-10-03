package com.example.collaborationlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.collaborationlearning.ui.theme.CollaborationLearningTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CollaborationLearningTheme {
                HomeScreen()
            }
        }
    }
}