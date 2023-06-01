package com.wakaztahir.common

import com.wakaztahir.qawazlogger.LogType
import com.wakaztahir.qawazlogger.logIt


fun DisplayDemo() {
    createLogsViaExtension()
}

fun createLogsViaExtension(){
    Throwable("This object doesn't work").logIt()
    Throwable("This is a warning that it doesn't work").logIt(message = "Bad Work",tag = "No Where",type = LogType.Warning)
    Throwable("Error it really doesn't work").logIt(message = "Bad Work",tag = "No Where",type = LogType.Error)
    Throwable("How about a little information in debug").logIt(message = "Bad Work",tag = "No Where",type = LogType.Debug)
    Throwable("How about weirdness everywhere").logIt(message = "Bad Work",tag = "No Where",type = LogType.Weird)
    Throwable("Some information for you").logIt(message = "Bad Work",tag = "No Where",type = LogType.Information)
    Throwable("THIS ERROR SHOULD NOT OCCUR").logIt(message = "Bad Work",tag = "No Where",type = LogType.WTF)
}