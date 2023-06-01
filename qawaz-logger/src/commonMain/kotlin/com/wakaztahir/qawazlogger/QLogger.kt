package com.wakaztahir.qawazlogger

object QLogger : Logger {

    override fun logDebug(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.logDebug(tag = tag, message = message, exception = exception)
        QLogConfig.intercept(type = LogType.Debug, tag = tag, message = message, exception = exception)
    }

    override fun logError(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.logError(tag = tag, message = message, exception = exception)
        QLogConfig.intercept(type = LogType.Error, tag = tag, message = message, exception = exception)
    }

    override fun logInfo(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.logInfo(tag = tag, message = message, exception = exception)
        QLogConfig.intercept(type = LogType.Information, tag = tag, message = message, exception = exception)
    }

    override fun logWarning(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.logWarning(tag = tag, message = message, exception = exception)
        QLogConfig.intercept(type = LogType.Warning, tag = tag, message = message, exception = exception)
    }

    override fun logVerbose(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.logVerbose(tag = tag, message = message, exception = exception)
        QLogConfig.intercept(type = LogType.Verbose, tag = tag, message = message, exception = exception)
    }

    override fun logWeird(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.logWeird(tag = tag, message = message, exception = exception)
        QLogConfig.intercept(type = LogType.Weird, tag = tag, message = message, exception = exception)
    }

    override fun logWTF(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.logWTF(tag = tag, message = message, exception = exception)
        QLogConfig.intercept(type = LogType.WTF, tag = tag, message = message, exception = exception)
    }

}