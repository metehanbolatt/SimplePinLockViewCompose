package com.metehanbolat.simplepinlockviewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.metehanbolat.simplepinlockviewcompose.ui.theme.SimplePinLockViewComposeTheme

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimplePinLockViewComposeTheme {
                PinLockScreen()
            }
        }
    }
}