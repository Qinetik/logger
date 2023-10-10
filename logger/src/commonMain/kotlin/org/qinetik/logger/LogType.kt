package org.qinetik.logger

sealed interface LogType {

    val name: String

    fun log(tag : String, message : String, exception : Throwable? = null)

    @Deprecated("use log", replaceWith = ReplaceWith("this.log(tag, message, exception)"))
    fun logPlatform(tag: String, message: String, exception: Throwable? = null) {
        log(tag, message, exception)
    }

    object Debug : LogType {
        override val name: String = "DEBUG"
        override fun log(tag: String, message: String, exception: Throwable?) {
            QLog.debug(tag, message, exception)
        }
    }

    object Error : LogType {
        override val name: String = "ERROR"
        override fun log(tag: String, message: String, exception: Throwable?) {
            QLog.error(tag, message, exception)
        }
    }

    object Information : LogType {
        override val name: String = "INFO"
        override fun log(tag: String, message: String, exception: Throwable?) {
            QLog.info(tag, message, exception)
        }
    }

    object Warning : LogType {
        override val name: String = "WARNING"
        override fun log(tag: String, message: String, exception: Throwable?) {
            QLog.warn(tag, message, exception)
        }
    }

    object Verbose : LogType {
        override val name: String = "VERBOSE"
        override fun log(tag: String, message: String, exception: Throwable?) {
            QLog.verbose(tag, message, exception)
        }
    }

    object Weird : LogType {
        override val name: String = "WEIRD"
        override fun log(tag: String, message: String, exception: Throwable?) {
            QLog.weird(tag, message, exception)
        }
    }

    object WTF : LogType {
        override val name: String = "WTF"
        override fun log(tag: String, message: String, exception: Throwable?) {
            QLog.WTF(tag, message, exception)
        }
    }
}