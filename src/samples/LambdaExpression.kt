package samples

val lambdaExpression1 = { println("Lambda Expression #1") }

val lambdaExpression2 = { message: String -> println("$message → from lambda expression #2") }

val addNumber = { num1: Int, num2: Int -> println("$num1 + $num2 = " + (num1 + num2)) }

fun main() {
    lambdaExpression1()
    lambdaExpression2("Hello, Kotlin")
    addNumber(3, 5)
}