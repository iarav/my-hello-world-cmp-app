package com.iarav.mykmphelloworldapp.di

import com.iarav.mykmphelloworldapp.data.repository.MyExampleRepositoryImpl
import com.iarav.mykmphelloworldapp.domain.repository.MyExampleRepository
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    singleOf(::MyExampleRepositoryImpl).bind<MyExampleRepository>()
}