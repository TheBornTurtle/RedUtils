package co.aplicared.jvm.utils

/**
 *  The `Log` class adds logging features to applications.
 *
 *  @property logLevel Sets what level logs should be shown in the console.
 *
 *  @property e This is used when setting the log level so that only errors are shown in the console.
 *  @property w This is used when setting the log level so that only warnings and above are shown in the console.
 *  @property i This is used when setting the log level so that only information and above are shown in the console.
 *  @property d This is used when setting the log level so that only debug and above are shown in the console.
 *
 *  @property error This is used to send a message to the console as an error.
 *  @property warn This is used to send a message to the console as a warning.
 *  @property info This is used to send a message to the console as information.
 *  @property debug This is used to send a message to the console as debug information.
 *
 */

class Log() {
    val e = 0
    val w = 1
    val i = 2
    val d = 3

    var logLevel: Int = i

    fun error(message: String) {
        /**
         * @property message This holds the message to be printed to the console.
         */

        if (logLevel >= e)
            println("[ERROR]: $message")
    }

    fun warn(message: String) {

        /**
         * @param message This holds the message to be printed to the console.
         */

        if (logLevel >= w)
            println("[WARNING]: $message")
    }


    fun info(message: String) {

        /**
         * @param message This holds the message to be printed to the console.
         */

        if (logLevel >= i)
            println("[INFO]: $message")
    }

    fun debug(message: String) {

        /**
         * @param message This holds the message to be printed to the console.
         */

        if (logLevel >= d)
            println("[DEBUG]: $message")
    }

}