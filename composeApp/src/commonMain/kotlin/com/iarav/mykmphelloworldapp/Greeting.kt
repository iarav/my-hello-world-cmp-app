package com.iarav.mykmphelloworldapp

class Greeting {
    private val platform = getPlatform()

    fun greet(helloString: String): String {
        return "${helloString}, ${platform.name}!"
    }
}