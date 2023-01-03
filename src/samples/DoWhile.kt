package samples

fun main(){
    var x = 1

    do {
        println(x)
        x++
    } while (x <= 10)

    println("Do while is done")

    if (x > 11) println("Code was executed at least once\n\t" +
            "before checking loop condition")
}