package com.wakaztahir.qawazlogger

import org.qinetik.logger.LogType

@Deprecated("use qinetik", replaceWith = ReplaceWith("this.logIt(message, tag, type)", "org.qinetik.logger.logIt"))
fun Throwable.logIt(
    message: String = "EXCEPTION",
    tag: String = "UNKNOWN",
    type: LogType = LogType.Error
) {
    type.log(tag, message, this)
}