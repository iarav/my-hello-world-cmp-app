package com.iarav.mykmphelloworldapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iarav.mykmphelloworldapp.presentation.view.MyExampleViewModel
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mykmphelloworldapp.composeapp.generated.resources.Res
import mykmphelloworldapp.composeapp.generated.resources.battery_level_text
import mykmphelloworldapp.composeapp.generated.resources.click_here
import mykmphelloworldapp.composeapp.generated.resources.logo_android
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun App(
    batteryManager: BatteryManager
) {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val batteryLevel = batteryManager.getBatteryLevel()
            val viewModel = koinViewModel<MyExampleViewModel>()
            Box(
                modifier = Modifier.fillMaxWidth()
                    .background(MaterialTheme.colorScheme.secondary)
                    .padding(20.dp)
            ) {
                Text(
                    color = MaterialTheme.colorScheme.onSecondary,
                    text = "${stringResource(Res.string.battery_level_text)} ${batteryLevel}%"
                )
            }
            Button(
                modifier = Modifier.padding(top = 20.dp),
                onClick = { showContent = !showContent }) {
                Text(stringResource(Res.string.click_here))
            }
            AnimatedVisibility(showContent) {
                val greeting = remember {
                    Greeting().greet(
                        helloString = viewModel.getHelloString()
                    )
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painterResource(Res.drawable.logo_android),
                        modifier = Modifier.width(100.dp),
                        contentDescription = null
                    )
                    Text(greeting)
                }
            }
        }
    }
}