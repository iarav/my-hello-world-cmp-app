package com.iarav.mykmphelloworldapp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.iarav.mykmphelloworldapp.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "MyKMPHelloWorldApp",
        ) {
            App(
                batteryManager = remember { BatteryManager() }
            )
        }
    }
}