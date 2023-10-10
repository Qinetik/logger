package org.qinetik.logger

interface Logger {

    fun debug(tag: String, message: String, exception: Throwable? = null)

    fun error(tag: String, message: String, exception: Throwable? = null)

    fun info(tag: String, message: String, exception: Throwable? = null)

    fun warn(tag : String, message : String, exception : Throwable? = null)

    fun verbose(tag: String, message: String, exception: Throwable? = null)

    fun weird(tag: String, message: String, exception: Throwable? = null)

    fun WTF(tag: String, message: String, exception: Throwable? = null)

}