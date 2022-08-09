package Udemy

import org.junit.Assert.*
import org.junit.Test

class PositiveValidatorTest {
    @Test
    fun zeroReturnsFalse(){
        val zero = PositiveValidator()
        zero.isPositive(0)
        assertFalse(zero.toString(), false)
    }

    @Test
    fun negativeReturnsFalse() {
        val negative = PositiveValidator()
        negative.isPositive(-1)
        assertFalse(negative.toString(), false)
    }

    @Test
    fun positiveReturnsTrue() {
        val positive = PositiveValidator()
        positive.isPositive(1)
        assertTrue(positive.toString(), true)
    }
}