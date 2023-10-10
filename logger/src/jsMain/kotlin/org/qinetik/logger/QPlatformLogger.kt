package org.qinetik.logger

import org.qinetik.logger.Logger

actual object QPlatformLogger : Logger {

    actual var isLoggingEnabled: Boolean = true

    override fun debug(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.log(tag, message, exception)
    }

    override fun error(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.error(tag, message, exception)
    }

    override fun info(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.info(tag, message, exception)
    }

    override fun warn(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.warn(tag, message, exception)
    }

    override fun verbose(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.log(tag, message, exception)
    }

    override fun weird(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.error(tag, message, exception)
    }

    override fun WTF(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.error(tag, message, exception)
    }

}