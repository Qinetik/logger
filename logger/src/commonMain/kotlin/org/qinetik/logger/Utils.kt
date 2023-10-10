package org.qinetik.logger

import org.qinetik.logger.LogType
import org.qinetik.logger.Logger

/** A logger that only logs to platforms **/
expect object QPlatformLogger : Logger {
    var isLoggingEnabled: Boolean
}

@Suppress("NOTHING_TO_INLINE", "unused")
inline fun Throwable.logIt(
    message: String = "EXCEPTION",
    tag: String = "UNKNOWN"
) {
    QLog.error(tag, message, this)
}

@Suppress("NOTHING_TO_INLINE", "unused")
inline fun Throwable.logIt(
    message: String = "EXCEPTION",
    tag: String = "UNKNOWN",
    type: LogType
) {
    type.log(tag, message, this)
}

@Suppress("NOTHING_TO_INLINE", "unused")
/** calls [Logger.debug] **/
inline fun Logger.d(tag: String, message: String, exception: Throwable? = null) = debug(tag, message, exception)

@Suppress("NOTHING_TO_INLINE", "unused")
/** calls [Logger.error] **/
inline fun Logger.e(tag: String, message: String, exception: Throwable? = null) = error(tag, message, exception)

@Suppress("NOTHING_TO_INLINE", "unused")
/** calls [Logger.info] **/
inline fun Logger.i(tag: String, message: String, exception: Throwable? = null) = info(tag, message, exception)

@Suppress("NOTHING_TO_INLINE", "unused")
/** calls [Logger.warn] **/
inline fun Logger.w(tag: String, message: String, exception: Throwable? = null) = warn(tag, message, exception)

@Suppress("NOTHING_TO_INLINE", "unused")
/** calls [Logger.verbose] **/
inline fun Logger.v(tag: String, message: String, exception: Throwable? = null) = verbose(tag, message, exception)