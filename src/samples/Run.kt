package samples

/*
Like 'let', 'run' is another scope function  from the standard library. In a nutshell, it does
the same → executes a code block and returns its results.

The difference is that inside 'run' the object is accessed by 'this'.

This is useful when you want to call the object's method rather than pass it as an argument.
 */

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\": ")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length
        }
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("Kotlin function \"run\"")
}

