package com.wakaztahir.qawazlogger

abstract class QLogConfig {

    @Suppress("MemberVisibilityCanBePrivate")
    var isInterceptorsEnabled: Boolean = true

    private val interceptors = mutableListOf<LogInterceptor>()

    interface LogInterceptor {
        val key: String
        fun intercept(type: LogType, tag: String, message: String, exception: Throwable?)
    }

    internal fun intercept(type: LogType, tag: String, message: String, exception: Throwable?) {
        if (isInterceptorsEnabled) {
            if (interceptors.isEmpty()) return
            for (interceptor in interceptors) {
                interceptor.intercept(type, tag, message, exception)
            }
        }
    }

    @Suppress("unused")
    fun integrate(newInterceptor: LogInterceptor) {
        for (interceptor in interceptors) {
            if (interceptor.key == newInterceptor.key) return
        }
        interceptors.add(newInterceptor)
    }

    fun removeInterceptorByKey(key: String): Boolean {
        val index = interceptors.indexOfFirst { it.key == key }
        if (index == -1) return false
        interceptors.removeAt(index)
        return true
    }

}