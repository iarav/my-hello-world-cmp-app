package com.iarav.mykmphelloworldapp

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Olá, ${platform.name}!"
    }
}