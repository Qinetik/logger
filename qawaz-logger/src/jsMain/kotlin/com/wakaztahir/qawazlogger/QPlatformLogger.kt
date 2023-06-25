package com.wakaztahir.qawazlogger

actual object QPlatformLogger : Logger {

    actual var isLoggingEnabled: Boolean = true

    override fun logDebug(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.log(tag, message, exception)
    }

    override fun logError(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.error(tag, message, exception)
    }

    override fun logInfo(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.info(tag, message, exception)
    }

    override fun logWarning(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.warn(tag, message, exception)
    }

    override fun logVerbose(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.log(tag, message, exception)
    }

    override fun logWeird(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.error(tag, message, exception)
    }

    override fun logWTF(tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) console.error(tag, message, exception)
    }

}