package com.wakaztahir.qawazlogger

sealed interface LogType {

    val name: String

    fun logPlatform(tag: String, message: String, exception: Throwable?)

    object Debug : LogType {
        override val name: String = "DEBUG"
        override fun logPlatform(tag: String, message: String, exception: Throwable?) {
            QLogger.logDebug(tag, message, exception)
        }
    }

    object Error : LogType {
        override val name: String = "ERROR"
        override fun logPlatform(tag: String, message: String, exception: Throwable?) {
            QLogger.logError(tag, message, exception)
        }
    }

    object Information : LogType {
        override val name: String = "INFO"
        override fun logPlatform(tag: String, message: String, exception: Throwable?) {
            QLogger.logInfo(tag, message, exception)
        }
    }

    object Warning : LogType {
        override val name: String = "WARNING"
        override fun logPlatform(tag: String, message: String, exception: Throwable?) {
            QLogger.logWarning(tag, message, exception)
        }
    }

    object Verbose : LogType {
        override val name: String = "VERBOSE"
        override fun logPlatform(tag: String, message: String, exception: Throwable?) {
            QLogger.logVerbose(tag, message, exception)
        }
    }

    object Weird : LogType {
        override val name: String = "WEIRD"
        override fun logPlatform(tag: String, message: String, exception: Throwable?) {
            QLogger.logWeird(tag, message, exception)
        }
    }

    object WTF : LogType {
        override val name: String = "WTF"
        override fun logPlatform(tag: String, message: String, exception: Throwable?) {
            QLogger.logWTF(tag, message, exception)
        }
    }
}