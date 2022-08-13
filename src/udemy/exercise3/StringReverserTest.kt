package udemy.exercise3

import org.junit.Assert.assertEquals
import org.junit.Test

class StringReverserTest {
    val sut = StringReverser()

    @Test
    fun `reverse fun with empty string returns empty string`() {
        val result = sut.reverse("")
        assertEquals(result, "")
    }

    @Test
    fun `reverse fun with single char returns same char`() {
        val result = sut.reverse("e")
        assertEquals(result, "e")
    }

    @Test
    fun `reverse fun with long string returns reversed string`() {
        val result = sut.reverse("eduardo")
        assertEquals(result, "odraude")
    }
}