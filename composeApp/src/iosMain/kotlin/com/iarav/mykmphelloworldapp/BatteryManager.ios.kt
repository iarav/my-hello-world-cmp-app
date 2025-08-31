package com.iarav.mykmphelloworldapp

import platform.UIKit.UIDevice

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice().batteryMonitoringEnabled = true
        val batteryLevel = (UIDevice.currentDevice().batteryLevel * 100).toInt()
        return batteryLevel
    }
}