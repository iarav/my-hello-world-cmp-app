package com.iarav.mykmphelloworldapp

import oshi.SystemInfo

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        val systemInfo = SystemInfo()
        val batteryLevel = systemInfo.hardware.powerSources.firstOrNull()
        return batteryLevel?.remainingCapacityPercent?.times(100)?.toInt() ?: -1
    }
}