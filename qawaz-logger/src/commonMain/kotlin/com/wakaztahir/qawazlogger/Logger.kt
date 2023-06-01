package com.wakaztahir.qawazlogger

interface Logger {

    fun logDebug(tag: String, message: String, exception: Throwable?)

    fun logError(tag: String, message: String, exception: Throwable?)

    fun logInfo(tag: String, message: String, exception: Throwable?)

    fun logWarning(tag: String, message: String, exception: Throwable?)

    fun logVerbose(tag: String, message: String, exception: Throwable?)

    fun logWeird(tag: String, message: String, exception: Throwable?)

    fun logWTF(tag: String, message: String, exception: Throwable?)

}