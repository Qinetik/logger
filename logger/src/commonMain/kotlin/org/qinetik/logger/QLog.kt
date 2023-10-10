package org.qinetik.logger

/** A Logger which logs to platform & sends logs to interceptors **/
object QLog : QLogConfig(), Logger {

    override fun debug(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.debug(tag = tag, message = message, exception = exception)
        intercept(type = LogType.Debug, tag = tag, message = message, exception = exception)
    }

    override fun error(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.error(tag = tag, message = message, exception = exception)
        intercept(type = LogType.Error, tag = tag, message = message, exception = exception)
    }

    override fun info(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.info(tag = tag, message = message, exception = exception)
        intercept(type = LogType.Information, tag = tag, message = message, exception = exception)
    }

    override fun warn(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.warn(tag = tag, message = message, exception = exception)
        intercept(type = LogType.Warning, tag = tag, message = message, exception = exception)
    }

    override fun verbose(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.verbose(tag = tag, message = message, exception = exception)
        intercept(type = LogType.Verbose, tag = tag, message = message, exception = exception)
    }

    override fun weird(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.weird(tag = tag, message = message, exception = exception)
        intercept(type = LogType.Weird, tag = tag, message = message, exception = exception)
    }

    override fun WTF(tag: String, message: String, exception: Throwable?) {
        QPlatformLogger.WTF(tag = tag, message = message, exception = exception)
        intercept(type = LogType.WTF, tag = tag, message = message, exception = exception)
    }

}