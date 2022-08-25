package udemy.exercise4

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import udemy.exercise4.authtoken.AuthTokenCache
import udemy.exercise4.eventbus.EventBusPoster
import udemy.exercise4.eventbus.LoggedInEvent
import udemy.exercise4.networking.LoginHttpEndpointSync
import udemy.exercise4.networking.NetworkErrorExceptions
import kotlin.test.assertEquals

class LoginUseCaseSyncTest {
    private var mLoginHttpEndpointSyncTd: LoginHttpEndpointSyncTd? = null
    private var mAuthTokenCacheTd: AuthTokenCacheTd? = null
    private var mEventBusPosterTd: EventBusPosterTd? = null
    private var SUT: LoginUseCaseSync? = null

    @Before
    fun setup() {
        mLoginHttpEndpointSyncTd = LoginHttpEndpointSyncTd()
        mAuthTokenCacheTd = AuthTokenCacheTd()
        mEventBusPosterTd = EventBusPosterTd()
        SUT = LoginUseCaseSync(mLoginHttpEndpointSyncTd!!, mAuthTokenCacheTd!!, mEventBusPosterTd!!)
    }

    @Test
    fun loginSync_success_usernameAndPasswordPassedToEndpoint() {
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertEquals(mLoginHttpEndpointSyncTd!!.mUsername, USERNAME)
        Assert.assertEquals(mLoginHttpEndpointSyncTd!!.mPassword, PASSWORD)
    }

    @Test
    fun loginSync_success_authTokenCached() {
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertEquals(mAuthTokenCacheTd!!.getAuthToken(), AUTH_TOKEN)
    }

    @Test
    fun loginSync_generalError_authTokenNotCached() {
        mLoginHttpEndpointSyncTd!!.mIsGeneralError = true
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertNull(mAuthTokenCacheTd!!.getAuthToken())
    }

    @Test
    fun loginSync_authError_authTokenNotCached() {
        mLoginHttpEndpointSyncTd!!.mIsAuthError = true
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertNull(mAuthTokenCacheTd!!.getAuthToken())
    }

    @Test
    fun loginSync_serverError_authTokenNotCached() {
        mLoginHttpEndpointSyncTd!!.mIsServerError = true
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertNull(mAuthTokenCacheTd!!.getAuthToken())
    }

    @Test
    fun loginSync_success_loggedInEventPosted() {
        SUT!!.loginSync(USERNAME, PASSWORD)
        MatcherAssert.assertThat(
            mEventBusPosterTd!!.mEvent,
            CoreMatchers.`is`(CoreMatchers.instanceOf(LoggedInEvent::class.java))
        )
    }

    @Test
    fun loginSync_generalError_noInteractionWithEventBusPoster() {
        mLoginHttpEndpointSyncTd!!.mIsGeneralError = true
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertEquals(mEventBusPosterTd!!.mInteractionCount.toLong(), 0)
    }

    @Test
    fun loginSync_authError_noInteractionWithEventBusPoster() {
        mLoginHttpEndpointSyncTd!!.mIsAuthError = true
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertEquals(mEventBusPosterTd!!.mInteractionCount.toLong(), 0)
    }

    @Test
    fun loginSync_serverError_noInteractionWithEventBusPoster() {
        mLoginHttpEndpointSyncTd!!.mIsServerError = true
        SUT!!.loginSync(USERNAME, PASSWORD)
        Assert.assertEquals(mEventBusPosterTd!!.mInteractionCount.toLong(), 0)
    }

    @Test
    fun loginSync_success_returnsSuccess() {
        val result: LoginUseCaseSync.UseCaseResult = SUT!!.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.SUCCESS)
    }

    @Test
    fun loginSync_serverError_returnsFailure() {
        mLoginHttpEndpointSyncTd!!.mIsServerError = true
        val result: LoginUseCaseSync.UseCaseResult = SUT!!.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.FAILURE)
    }

    @Test
    fun loginSync_authError_returnsFailure() {
        mLoginHttpEndpointSyncTd!!.mIsAuthError = true
        val result: LoginUseCaseSync.UseCaseResult = SUT!!.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.FAILURE)
    }

    @Test
    fun loginSync_GeneralError_returnsFailure() {
        mLoginHttpEndpointSyncTd!!.mIsGeneralError = true
        val result: LoginUseCaseSync.UseCaseResult = SUT!!.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.FAILURE)
    }

    @Test
    fun loginSync_networkError_returnsNetworkError() {
        mLoginHttpEndpointSyncTd!!.mIsNetworkError = true
        val result: LoginUseCaseSync.UseCaseResult = SUT!!.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.NETWORK_ERROR)
    }

    //* ••••••••••••••••HELPER CLASSES••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

    class LoginHttpEndpointSyncTd : LoginHttpEndpointSync {
        var mUsername: String? = null
        var mPassword: String? = null
        var mIsGeneralError = false
        var mIsAuthError = false
        var mIsServerError = false
        var mIsNetworkError = false

        @Throws(NetworkErrorExceptions::class)
        override fun loginSync(username: String?, password: String?): LoginHttpEndpointSync.EndpointResult {
            mUsername = username
            mPassword = password

            return if (mIsGeneralError) {
                LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.GENERAL_ERROR,
                    ""
                )
            } else if (mIsAuthError) {
                LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.AUTH_ERROR,
                    ""
                )
            } else if (mIsServerError) {
                LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.SERVER_ERROR,
                    ""
                )
            } else if (mIsNetworkError) {
                throw NetworkErrorExceptions()
            } else {
                LoginHttpEndpointSync.EndpointResult(LoginHttpEndpointSync.EndpointResultStatus.SUCCESS, AUTH_TOKEN)
            }
        }
    }

    class AuthTokenCacheTd : AuthTokenCache {
        private var mAuthToken: String? = null

        override fun cacheAuthToken(authToken: String) {
            mAuthToken = "authToken"
        }

        override fun getAuthToken(): String? {
            return mAuthToken
        }
    }

    class EventBusPosterTd : EventBusPoster {
        var mEvent: Any? = null
        var mInteractionCount = 0

        override fun postEvent(event: String) {
            mInteractionCount++
            mEvent = event
        }
    }

    companion object {
        private const val USERNAME = "username"
        private const val PASSWORD = "password"
        const val AUTH_TOKEN = "authToken"
    }
}