package com.wakaztahir.qawazlogger

actual object QPlatformLogger : Logger {

    override fun logDebug(tag: String, message: String, exception: Throwable?) {
        console.log(tag, message, exception)
    }

    override fun logError(tag: String, message: String, exception: Throwable?) {
        console.error(tag, message, exception)
    }

    override fun logInfo(tag: String, message: String, exception: Throwable?) {
        console.info(tag, message, exception)
    }

    override fun logWarning(tag: String, message: String, exception: Throwable?) {
        console.warn(tag, message, exception)
    }

    override fun logVerbose(tag: String, message: String, exception: Throwable?) {
        console.log(tag, message, exception)
    }

    override fun logWeird(tag: String, message: String, exception: Throwable?) {
        console.error(tag, message, exception)
    }

    override fun logWTF(tag: String, message: String, exception: Throwable?) {
        console.error(tag, message, exception)
    }

}