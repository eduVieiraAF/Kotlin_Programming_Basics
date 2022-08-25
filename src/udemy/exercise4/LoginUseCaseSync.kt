package udemy.exercise4

import udemy.exercise4.authtoken.AuthTokenCache
import udemy.exercise4.eventbus.EventBusPoster
import udemy.exercise4.eventbus.LoggedInEvent
import udemy.exercise4.networking.LoginHttpEndpointSync
import udemy.exercise4.networking.NetworkErrorExceptions

class LoginUseCaseSync(
    private var mLoginHttpEndpointSync: LoginHttpEndpointSync?,
    private var mAuthTokenCache: AuthTokenCache?,
    private var mEventBusPoster: EventBusPoster?
) {
    enum class UseCaseResult {
        SUCCESS,
        FAILURE,
        NETWORK_ERROR
    }

    fun loginUseCaseSync(
        loginHttpEndpointSync: LoginHttpEndpointSync,
        authTokenCache: AuthTokenCache,
        eventBusPoster: EventBusPoster
    ) {
        mLoginHttpEndpointSync = loginHttpEndpointSync
        mAuthTokenCache = authTokenCache
        mEventBusPoster = eventBusPoster
    }

    fun loginSync(username: String?, password: String?): UseCaseResult {
        val endpointEndpointResult: LoginHttpEndpointSync.EndpointResult? = try {
            mLoginHttpEndpointSync?.loginSync(username, password)
        } catch (e: NetworkErrorExceptions) {
            return UseCaseResult.NETWORK_ERROR
        }

        return if (endpointEndpointResult?.let { isSuccessfulEndpointResult(it) } == true) {
            mAuthTokenCache?.cacheAuthToken(endpointEndpointResult.getAuthToken())
            mEventBusPoster?.postEvent(LoggedInEvent().toString())
            UseCaseResult.SUCCESS
        } else {
            UseCaseResult.FAILURE
        }
    }

    private fun isSuccessfulEndpointResult(endpointResult: LoginHttpEndpointSync.EndpointResult): Boolean {
        return endpointResult.getStatus() === LoginHttpEndpointSync.EndpointResultStatus.SUCCESS
    }
}