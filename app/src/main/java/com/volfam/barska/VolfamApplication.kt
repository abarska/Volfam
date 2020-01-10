package com.volfam.barska

import android.app.Application
import timber.log.Timber

class VolfamApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}