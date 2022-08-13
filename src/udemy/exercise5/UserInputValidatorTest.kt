package udemy.exercise5

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class UserInputValidatorTest {

    private val sut = UserInputValidator()

    @Test
    fun `isValidFullName has valid fullName returns true`() {
        val result = sut.isValidFullName("validFullName")
        assertTrue(result)
    }

    @Test
    fun `isValidFullName has invalid fullName returns false`() {
        val result = sut.isValidFullName("")
        assertFalse(result)
    }

    @Test // It's supposed to fail
    fun `isValidFullName has valid username returns true`() {
        val result = sut.isValidUsername("validUsername")
        assertTrue(result)
    }

    @Test // It's supposed to fail
    fun `isValidFullName has invalid username returns false`() {
        val result = sut.isValidUsername("validUsername")
        assertTrue(result)
    }
}