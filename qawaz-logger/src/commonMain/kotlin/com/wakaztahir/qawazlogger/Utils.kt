package com.wakaztahir.qawazlogger

expect object QPlatformLogger : Logger {
    var isLoggingEnabled : Boolean
}

fun Throwable.logIt(
    message: String = "EXCEPTION",
    tag: String = "UNKNOWN",
    type: LogType = LogType.Error
) {
    type.logPlatform(tag, message, this)
}