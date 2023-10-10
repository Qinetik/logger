package com.wakaztahir.qawazlogger

import org.qinetik.logger.Logger
import org.qinetik.logger.QLog
import org.qinetik.logger.QLogConfig

@Deprecated("use QLog", replaceWith = ReplaceWith("QLog", "org.qinetik.logger.QLog"))
object QLogger : QLogConfig(), Logger {

    override fun debug(tag: String, message: String, exception: Throwable?) {
        QLog.debug(tag, message, exception)
    }

    override fun error(tag: String, message: String, exception: Throwable?) {
        QLog.error(tag = tag, message = message, exception = exception)
    }

    override fun info(tag: String, message: String, exception: Throwable?) {
        QLog.info(tag = tag, message = message, exception = exception)
    }

    override fun warn(tag: String, message: String, exception: Throwable?) {
        QLog.warn(tag = tag, message = message, exception = exception)
    }

    override fun verbose(tag: String, message: String, exception: Throwable?) {
        QLog.verbose(tag = tag, message = message, exception = exception)
    }

    override fun weird(tag: String, message: String, exception: Throwable?) {
        QLog.weird(tag = tag, message = message, exception = exception)
    }

    override fun WTF(tag: String, message: String, exception: Throwable?) {
        QLog.WTF(tag = tag, message = message, exception = exception)
    }

    @Deprecated("use debug", replaceWith = ReplaceWith("this.debug(tag, message, exception)"))
    fun logDebug(tag: String, message: String, exception: Throwable? = null) {
        debug(tag, message, exception)
    }

    @Deprecated("use error", replaceWith = ReplaceWith("this.error(tag, message, exception)"))
    fun logError(tag: String, message: String, exception: Throwable? = null) {
        error(tag, message, exception)
    }

    @Deprecated("use info", replaceWith = ReplaceWith("this.info(tag, message, exception)"))
    fun logInfo(tag: String, message: String, exception: Throwable? = null) {
        info(tag, message, exception)
    }

    @Deprecated("use warn", replaceWith = ReplaceWith("this.warn(tag, message, exception)"))
    fun logWarning(tag: String, message: String, exception: Throwable? = null) {
        warn(tag, message, exception)
    }

    @Deprecated("use verbose", replaceWith = ReplaceWith("this.verbose(tag, message, exception)"))
    fun logVerbose(tag: String, message: String, exception: Throwable? = null) {
        verbose(tag, message, exception)
    }

    @Deprecated("use weird", replaceWith = ReplaceWith("this.weird(tag, message, exception)"))
    fun logWeird(tag: String, message: String, exception: Throwable? = null) {
        weird(tag, message, exception)
    }

    @Deprecated("use WTF", replaceWith = ReplaceWith("this.WTF(tag, message, exception)"))
    fun logWTF(tag: String, message: String, exception: Throwable? = null) {
        WTF(tag, message, exception)
    }

}