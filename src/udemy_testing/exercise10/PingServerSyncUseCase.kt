package udemy_testing.exercise10

import udemy_testing.exercise10.networking.PingServerHttpEndpointSync

class PingServerSyncUseCase(pingServerHttpEndpointSync: PingServerHttpEndpointSync) {
    enum class UseCaseResult {
        FAILURE, SUCCESS
    }

    private var mPingServerHttpEndpointSync: PingServerHttpEndpointSync? = pingServerHttpEndpointSync

    fun pingServerSync(): UseCaseResult {

        return when (mPingServerHttpEndpointSync!!.pingServerSync()) {
            PingServerHttpEndpointSync.EndpointResult.GENERAL_ERROR -> UseCaseResult.FAILURE
            PingServerHttpEndpointSync.EndpointResult.NETWORK_ERROR -> UseCaseResult.FAILURE
            PingServerHttpEndpointSync.EndpointResult.SUCCESS -> UseCaseResult.SUCCESS
        }
    }
}