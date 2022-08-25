package udemy.exercise4

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.Matchers
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.runners.MockitoJUnitRunner
import udemy.exercise4.authtoken.AuthTokenCache
import udemy.exercise4.eventbus.EventBusPoster
import udemy.exercise4.eventbus.LoggedInEvent
import udemy.exercise4.networking.LoginHttpEndpointSync
import udemy.exercise4.networking.NetworkErrorExceptions

@Suppress("FunctionName", "PrivatePropertyName")
@RunWith(MockitoJUnitRunner::class)
class LoginUseCaseSyncTestMockito {
    @Mock
    var mLoginHttpEndpointSyncMock: LoginHttpEndpointSync? = null

    @Mock
    var mAuthTokenCacheMock: AuthTokenCache? = null

    @Mock
    var mEventBusPosterMock: EventBusPoster? = null
    private var SUT: LoginUseCaseSync? = null

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = LoginUseCaseSync(
            mLoginHttpEndpointSyncMock,
            mAuthTokenCacheMock,
            mEventBusPosterMock
        )
        success()
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_success_usernameAndPasswordPassedToEndpoint() {
        val ac = ArgumentCaptor.forClass(String::class.java)
        SUT?.loginSync(USERNAME, PASSWORD)
        verify(mLoginHttpEndpointSyncMock, times(1))
            ?.loginSync(ac.capture().toString(), ac.capture().toString())
        val captures = ac.allValues
        assertEquals(captures[0], USERNAME)
        assertEquals(captures[1], PASSWORD)
    }

    @Test
    fun loginSync_success_authTokenCached() {
        val ac = ArgumentCaptor.forClass(String::class.java)
        SUT?.loginSync(USERNAME, AUTH_TOKEN)
        verify(mAuthTokenCacheMock)?.cacheAuthToken(ac.capture().toString())
        assertEquals(ac.value, AUTH_TOKEN)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_generalError_authTokenNotCached() {
        generalError()
        SUT?.loginSync(USERNAME, PASSWORD)
        verifyZeroInteractions(mAuthTokenCacheMock)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_authError_authTokenNotCached() {
        authError()
        SUT?.loginSync(USERNAME, PASSWORD)
        verifyNoMoreInteractions(mAuthTokenCacheMock)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_serverError_authTokenNotCached() {
        serverError()
        SUT?.loginSync(USERNAME, PASSWORD)
        verifyNoMoreInteractions(mAuthTokenCacheMock)
    }

    @Test
    fun loginSync_success_loggedInEventPosted() {
        val ac = ArgumentCaptor.forClass(Any::class.java)
        SUT?.loginSync(USERNAME, PASSWORD)
        verify(mEventBusPosterMock)?.postEvent(ac.capture().toString())
        @Suppress("DEPRECATION")
        Assert.assertThat(
            ac.value, CoreMatchers.`is`(
                CoreMatchers.instanceOf(
                    LoggedInEvent::class.java
                )
            )
        )
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_generalError_noInteractionWithEventBusPoster() {
        generalError()
        SUT?.loginSync(USERNAME, PASSWORD)
        verifyNoMoreInteractions(mEventBusPosterMock)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_authError_noInteractionWithEventBusPoster() {
        authError()
        SUT?.loginSync(USERNAME, PASSWORD)
        verifyNoMoreInteractions(mEventBusPosterMock)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_serverError_noInteractionWithEventBusPoster() {
        serverError()
        SUT?.loginSync(USERNAME, PASSWORD)
        verifyNoMoreInteractions(mEventBusPosterMock)
    }

    @Test
    fun loginSync_success_returnsSuccess() {
        val result: LoginUseCaseSync.UseCaseResult? = SUT?.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.SUCCESS)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_serverError_returnsFailure() {
        serverError()
        val result: LoginUseCaseSync.UseCaseResult? = SUT?.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.FAILURE)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_authError_returnsFailure() {
        authError()
        val result: LoginUseCaseSync.UseCaseResult? = SUT?.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.FAILURE)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_GeneralError_returnsFailure() {
        generalError()
        val result: LoginUseCaseSync.UseCaseResult? = SUT?.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.FAILURE)
    }

    @Test
    @Throws(Exception::class)
    fun loginSync_networkError_returnsNetworkError() {
        networkError()
        val result: LoginUseCaseSync.UseCaseResult? = SUT?.loginSync(USERNAME, PASSWORD)
        assertEquals(result, LoginUseCaseSync.UseCaseResult.NETWORK_ERROR)
    }

    //* ---------------HELPER-METHODS--------------------------------------------------------------------------------------
    @Throws(Exception::class)
    private fun networkError() {
        doThrow(NetworkErrorExceptions())
            .`when`(mLoginHttpEndpointSyncMock)?.loginSync(
                Matchers.any(String::class.java), Matchers.any(
                    String::class.java
                )
            )
    }

    @Throws(NetworkErrorExceptions::class)
    private fun success() {
        `when`(
            mLoginHttpEndpointSyncMock?.loginSync(
                any(String::class.java), any(
                    String::class.java
                )
            )
        )
            .thenReturn(
                LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.SUCCESS, AUTH_TOKEN
                )
            )
    }

    @Throws(Exception::class)
    private fun generalError() {
        `when`(
            mLoginHttpEndpointSyncMock?.loginSync(
                any(String::class.java), any(
                    String::class.java
                )
            )
        )
            .thenReturn(
                LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.GENERAL_ERROR,
                    ""
                )
            )
    }

    @Throws(Exception::class)
    private fun authError() {
        `when`(
            mLoginHttpEndpointSyncMock?.loginSync(
                any(String::class.java), any(
                    String::class.java
                )
            )
        )
            .thenReturn(
                LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.AUTH_ERROR,
                    ""
                )
            )
    }

    @Throws(Exception::class)
    private fun serverError() {
        `when`(
            mLoginHttpEndpointSyncMock?.loginSync(
                any(String::class.java), any(
                    String::class.java
                )
            )
        )
            .thenReturn(
                LoginHttpEndpointSync.EndpointResult(
                    LoginHttpEndpointSync.EndpointResultStatus.SERVER_ERROR,
                    ""
                )
            )
    }

    companion object {
        private const val USERNAME = "username"
        private const val PASSWORD = "password"
        const val AUTH_TOKEN = "authToken"
    }
}