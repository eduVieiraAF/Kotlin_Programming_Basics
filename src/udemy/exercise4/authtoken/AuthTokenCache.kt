package udemy.exercise4.authtoken

interface AuthTokenCache {
    fun cacheAuthToken(authToken: String)
    fun getAuthToken()
}