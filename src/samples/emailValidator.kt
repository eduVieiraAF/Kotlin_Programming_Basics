package samples

fun main() {
    val validEmail = isValidEmail("d4Xt2@example.com")
    val invalidEmail = isValidEmail("test.com")
    println(validEmail)
    println(invalidEmail)
}

fun isValidEmail(email: String): Boolean {
    val emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    return email.matches(emailPattern.toRegex())
}