package org.qinetik.logger

import android.util.Log

actual object QPlatformLogger : Logger {

    actual var isLoggingEnabled: Boolean = true

    override fun debug(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.d(tag, message, exception)
    }

    override fun error(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.e(tag, message, exception)
    }

    override fun info(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.i(tag, message, exception)
    }

    override fun warn(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.w(tag, message, exception)
    }

    override fun verbose(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.v(tag, message, exception)
    }

    override fun weird(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.e(tag, message, exception)
    }

    override fun WTF(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) Log.wtf(tag, message, exception)
    }

}