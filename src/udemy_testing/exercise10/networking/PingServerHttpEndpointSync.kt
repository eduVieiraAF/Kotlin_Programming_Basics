package udemy_testing.exercise10.networking

interface PingServerHttpEndpointSync {
    enum class EndpointResult {
        SUCCESS, GENERAL_ERROR, NETWORK_ERROR
    }

    fun pingServerSync(): EndpointResult
}