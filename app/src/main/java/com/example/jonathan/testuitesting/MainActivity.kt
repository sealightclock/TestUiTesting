package com.example.jonathan.testuitesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jonathan.testuitesting.ui.theme.TestUiTestingTheme
import com.example.jonathan.testuitesting.view.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestUiTestingTheme {
                MainScreen()
            }
        }
    }
}
