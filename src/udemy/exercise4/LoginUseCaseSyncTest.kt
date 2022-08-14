package udemy.exercise4

import udemy.exercise4.authtoken.AuthTokenCache
import udemy.exercise4.eventbus.EventBusPoster
import udemy.exercise4.eventbus.LoggedInEvent
import udemy.exercise4.networking.LoginHttpEndpointSync
import udemy.exercise4.networking.NetworkErrorExceptions

class LoginUseCaseSyncTest {
    companion object {
        const val USERNAME = "username"
        const val PASSWORD = "password"
        const val AUTH_TOKEN = "authToken"
    }



//*••••••••••••••••HELPER•CLASSES••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

    class LoginHttpEndpointSyncTd(
            private var mUsername: String,
            private var mPassword: String,
            private val mIsGeneralError: Boolean,
            private val mIsAuthError: Boolean,
            private val mIsServerError: Boolean,
            private val mIsNetworkError: Boolean
            ) : LoginHttpEndpointSync {
        override fun loginSync(username: String?, password: String?): LoginHttpEndpointSync.EndpointResult? {
            mUsername = username!!
            mPassword = password!!

            return if (mIsGeneralError) LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.GENERAL_ERROR,
                    ""
            )
            else if (mIsAuthError) LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.AUTH_ERROR,
                    ""
            ) else if (mIsServerError) LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.SERVER_ERROR,
                    ""
            ) else if (mIsNetworkError) throw NetworkErrorExceptions()
            else LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.SUCCESS,
                    AUTH_TOKEN
            )
        }
    }

    class EventBusPosterTd: EventBusPoster {
        override fun postEvent(event: LoggedInEvent) {
            TODO("Not yet implemented")
        }
    }

    class AuthTokenCacheTd: AuthTokenCache {
        override fun cacheAuthToken(authToken: String) {
            TODO("Not yet implemented")
        }

        override fun getAuthToken() {
            TODO("Not yet implemented")
        }
    }
}