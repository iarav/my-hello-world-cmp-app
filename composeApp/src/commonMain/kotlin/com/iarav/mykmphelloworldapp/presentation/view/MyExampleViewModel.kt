package com.iarav.mykmphelloworldapp.presentation.view

import androidx.lifecycle.ViewModel
import com.iarav.mykmphelloworldapp.domain.repository.MyExampleRepository

class MyExampleViewModel(
    val repository: MyExampleRepository
) : ViewModel() {
    fun getHelloString(): String {
        return repository.hello()
    }
}