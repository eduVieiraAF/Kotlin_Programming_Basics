package samples

val lambdaExpression1 = { prettyPrintln("Lambda Expression #1") }

val lambdaExpression2 = { message: String -> prettyPrintln("$message → from lambda expression #2") }

val addNumber = { num1: Int, num2: Int -> prettyPrintln("$num1 + $num2 = " + (num1 + num2)) }

fun main() {
    lambdaExpression1()
    lambdaExpression2("Hello, Kotlin")
    addNumber(3, 5)
}