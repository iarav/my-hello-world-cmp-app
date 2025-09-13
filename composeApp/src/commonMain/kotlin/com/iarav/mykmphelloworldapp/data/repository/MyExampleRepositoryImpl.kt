package com.iarav.mykmphelloworldapp.data.repository

import com.iarav.mykmphelloworldapp.data.database.ExampleDBClass
import com.iarav.mykmphelloworldapp.domain.repository.MyExampleRepository

class MyExampleRepositoryImpl(
    private val exampleDBClass: ExampleDBClass
): MyExampleRepository {
    override fun hello(): String {
        return "Olá"
    }
}