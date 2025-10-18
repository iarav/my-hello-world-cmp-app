package com.iarav.mykmphelloworldapp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.iarav.mykmphelloworldapp.di.initKoin
import io.ktor.client.engine.darwin.Darwin
import networking.InsultCensorClient
import networking.createHttpClient

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App(
        batteryManager = remember { BatteryManager() },
        client = remember {
            InsultCensorClient(createHttpClient(Darwin.create()))
        }
    )
}