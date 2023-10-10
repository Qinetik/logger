package org.qinetik.logger

actual object QPlatformLogger : Logger {

    actual var isLoggingEnabled: Boolean = true

    private const val ANSI_RESET = "\u001B[0m"
    private const val ANSI_BLACK = "\u001B[30m"
    private const val ANSI_RED = "\u001B[31m"
    private const val ANSI_GREEN = "\u001B[32m"
    private const val ANSI_YELLOW = "\u001B[33m"
    private const val ANSI_BLUE = "\u001B[34m"
    private const val ANSI_PURPLE = "\u001B[35m"
    private const val ANSI_CYAN = "\u001B[36m"
    private const val ANSI_WHITE = "\u001B[37m"

    private fun log(color: String, type: LogType, tag: String, message: String, exception: Throwable?) {
        if (isLoggingEnabled) {
            println("$color[${type.name}] $tag:$message$ANSI_RESET")
            exception?.also { exc ->
                println("$color[${type.name}] ${exc.stackTraceToString()}$ANSI_RESET")
            }
        }
    }

    override fun debug(tag: String, message: String, exception: Throwable?) {
        log(color = ANSI_GREEN, type = LogType.Debug, tag = tag, message = message, exception = exception)
    }

    override fun error(tag: String, message: String, exception: Throwable?) {
        log(color = ANSI_RED, type = LogType.Error, tag = tag, message = message, exception = exception)
    }

    override fun info(tag: String, message: String, exception: Throwable?) {
        log(color = ANSI_BLUE, type = LogType.Information, tag = tag, message = message, exception = exception)
    }

    override fun warn(tag: String, message: String, exception: Throwable?) {
        log(color = ANSI_YELLOW, type = LogType.Warning, tag = tag, message = message, exception = exception)
    }

    override fun verbose(tag: String, message: String, exception: Throwable?) {
        log(color = ANSI_CYAN, type = LogType.Verbose, tag = tag, message = message, exception = exception)
    }

    override fun weird(tag: String, message: String, exception: Throwable?) {
        log(color = ANSI_PURPLE, type = LogType.Weird, tag = tag, message = message, exception = exception)
    }

    override fun WTF(tag: String, message: String, exception: Throwable?) {
        log(color = ANSI_RED, type = LogType.WTF, tag = tag, message = message, exception = exception)
    }

}