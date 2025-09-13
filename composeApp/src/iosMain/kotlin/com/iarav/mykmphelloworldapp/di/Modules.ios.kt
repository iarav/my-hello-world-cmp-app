package com.iarav.mykmphelloworldapp.di

import com.iarav.mykmphelloworldapp.data.database.ExampleDBClass
import com.iarav.mykmphelloworldapp.presentation.view.MyExampleViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::ExampleDBClass)
    factory { MyExampleViewModel(repository = get()) }
}