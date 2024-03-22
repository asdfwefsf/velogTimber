package com.company.velogtimber

import android.app.Application
import android.os.Debug
import androidx.core.os.BuildCompat
//import com.company.velogtimber.Logging.CrashAndLog
import timber.log.Timber.*
import timber.log.Timber

class HelloSpikeApp : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }


    }
}