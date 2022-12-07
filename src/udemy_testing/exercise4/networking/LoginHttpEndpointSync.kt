package udemy_testing.exercise4.networking

interface LoginHttpEndpointSync {

    /**
     * Log in using provided credentials
     * @return the aggregated result of login operation
     * @throws NetworkErrorExceptions if login attempt fails due to network error
     */

    @Throws(NetworkErrorExceptions::class)
    open fun loginSync(
        username: String?,
        password: String?
    ): EndpointResult?

    enum class EndpointResultStatus {
        SUCCESS,
        AUTH_ERROR,
        SERVER_ERROR,
        GENERAL_ERROR
    }

    class EndpointResult(status: EndpointResultStatus, authToken: String) {
        private val mStatus: EndpointResultStatus = status
        private val mAuthToken: String = authToken

        fun getStatus(): EndpointResultStatus { return mStatus}
        fun getAuthToken(): String {return mAuthToken}
    }
}