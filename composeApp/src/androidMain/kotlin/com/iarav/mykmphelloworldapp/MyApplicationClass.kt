package com.iarav.mykmphelloworldapp

import android.app.Application
import com.iarav.mykmphelloworldapp.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplicationClass: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApplicationClass)
        }
    }
}