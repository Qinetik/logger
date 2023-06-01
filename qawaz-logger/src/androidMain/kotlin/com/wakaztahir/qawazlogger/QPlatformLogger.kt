package com.wakaztahir.qawazlogger

import android.util.Log

actual object QPlatformLogger : Logger {

    override fun logDebug(tag: String, message: String, exception: Throwable?) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message, exception)
        }
    }

    override fun logError(tag: String, message: String, exception: Throwable?) {
        Log.e(tag, message, exception)
    }

    override fun logInfo(tag: String, message: String, exception: Throwable?) {
        Log.i(tag, message, exception)
    }

    override fun logWarning(tag: String, message: String, exception: Throwable?) {
        Log.w(tag, message, exception)
    }

    override fun logVerbose(tag: String, message: String, exception: Throwable?) {
        Log.v(tag, message, exception)
    }

    override fun logWeird(tag: String, message: String, exception: Throwable?) {
        Log.e(tag, message, exception)
    }

    override fun logWTF(tag: String, message: String, exception: Throwable?) {
        Log.wtf(tag, message, exception)
    }

}