package udemy_testing.exercise5

class ServerUsernameValidator {
    fun isValidUsername(username: String): Boolean {
        try {
            Thread.sleep(1000)
            throw RuntimeException("...no network connection\n\tconnection failed...")
        } catch (e: InterruptedException) {
            e.printStackTrace()
            return false
        }
    }
}