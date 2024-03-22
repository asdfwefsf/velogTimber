package com.company.velogtimber.Logging

import android.util.Log.ERROR
import timber.log.Timber

//class CrashReportingTree : Timber.Tree() {
//    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
//        val crashlytics = FirebaseCrashlytics.getInstance()
//        crashlytics.log(message)
//
//        if (priority == ERROR) {
//            if (t == null) crashlytics.recordException(Throwable(message))
//            else crashlytics.recordException(t)
//        }
//    }
//}