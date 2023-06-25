package com.wakaztahir.qawazlogger

import android.util.Log

actual object QPlatformLogger : Logger {

    actual var isLoggingEnabled: Boolean = true

    override fun logDebug(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.d(tag, message, exception)
    }

    override fun logError(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.e(tag, message, exception)
    }

    override fun logInfo(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.i(tag, message, exception)
    }

    override fun logWarning(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.w(tag, message, exception)
    }

    override fun logVerbose(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.v(tag, message, exception)
    }

    override fun logWeird(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.e(tag, message, exception)
    }

    override fun logWTF(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.wtf(tag, message, exception)
    }

}