package com.iarav.mykmphelloworldapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform