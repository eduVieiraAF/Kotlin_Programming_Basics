package udemy_testing.exerciseextra

import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun testMultiply() {
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4, result)
    }

    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.parse("2 + 2")
        assertEquals(4, result)
    }

    @Test
    fun testSubtract() {
        val calculator = Calculator()
        val result = calculator.parse("8 - 2")
        assertEquals(6, result)
    }

    @Test
    fun testDivide() {
        val calculator = Calculator()
        val result = calculator.parse("15 / 5")
        assertEquals(3, result)
    }
}

class Calculator {
    fun parse(s: String): Int {
        val (a, op, b) = s.split(" ")
        return when(op) {
            "*" -> a.toInt() * b.toInt()
            "+" -> a.toInt() + b.toInt()
            "/" -> a.toInt() / b.toInt()
            "-" -> a.toInt() - b.toInt()
            else -> throw IllegalArgumentException("Invalid operator")
        }
    }
}
