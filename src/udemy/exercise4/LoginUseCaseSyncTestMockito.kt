@file:Suppress("FunctionName")

package udemy.exercise4

import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.runners.MockitoJUnitRunner
import udemy.exercise4.authtoken.AuthTokenCache
import udemy.exercise4.eventbus.EventBusPoster
import udemy.exercise4.eventbus.LoggedInEvent
import udemy.exercise4.networking.LoginHttpEndpointSync
import udemy.exercise4.networking.LoginHttpEndpointSync.EndpointResultStatus.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
import kotlin.test.assertEquals
import kotlin.test.assertIs

@RunWith(MockitoJUnitRunner::class)
class LoginUseCaseSyncTestMockito {


    @Mock
    var mLoginHttpEndpointSyncMock: LoginHttpEndpointSync? = null

    @Mock
    var mAuthTokenCacheMock: AuthTokenCache? = null

    @Mock
    var mEventBusPosterMock: EventBusPoster? = null

    private lateinit var SUT: LoginUseCaseSync

    @Before
    fun setup() {
        SUT = LoginUseCaseSync(
            mLoginHttpEndpointSyncMock,
            mAuthTokenCacheMock,
            mEventBusPosterMock
        )

        success()
    }

    @kotlin.jvm.Throws(Exception::class)
    @Test
    fun `return success if username and password pass to endpoint with loginSync`() {
        val ac = ArgumentCaptor.forClass(String::class.java)
        SUT.loginSync(USERNAME, PASSWORD)
        verify(mLoginHttpEndpointSyncMock, times(1))
            ?.loginSync(ac.capture().toString(), ac.capture().toString())
        val captures: MutableList<String>? = ac.allValues
        assertEquals<Any?>(captures?.get(0), USERNAME)
        assertEquals<Any?>(captures?.get(1), PASSWORD)
    }

    @kotlin.jvm.Throws(Exception::class)
    @Test
    fun `cache authToken when loginSync is successful`() {
        val ac = ArgumentCaptor.forClass(String::class.java)
        SUT.loginSync(USERNAME, AUTH_TOKEN)
        verify(mAuthTokenCacheMock)?.cacheAuthToken(ac.capture())
        assertEquals(ac.value, AUTH_TOKEN)
    }

    @kotlin.jvm.Throws(Exception::class)
    @Test
    fun `authToken not cached due to general error in loginSync`() {
        generalError()
        SUT.loginSync(USERNAME, PASSWORD)
        verifyZeroInteractions(mAuthTokenCacheMock)
    }

    @kotlin.jvm.Throws(Exception::class)
    @Test
    fun `authToken not cached due to auth error in loginSync`() {
        authError()
        SUT.loginSync(USERNAME, AUTH_TOKEN)
        verifyNoMoreInteractions(mAuthTokenCacheMock)
    }

    @kotlin.jvm.Throws(Exception::class)
    @Test
    fun `authToken not cached due to server error in loginSync`() {
        serverError()
        SUT.loginSync(USERNAME, AUTH_TOKEN)
        verifyNoMoreInteractions(mAuthTokenCacheMock)
    }

    @kotlin.jvm.Throws(Exception::class)
    @Test
    fun `Event Poster Login is successful with loginSync`() {
        val ac = ArgumentCaptor.forClass(Object::class.java)
        SUT.loginSync(USERNAME, PASSWORD)
        assertIs<JvmType.Object>(ac.value, LoggedInEvent::class.java.toString())
    }

    // * ---------- helper methods && companion object -----------------------------------------------------

    @kotlin.jvm.Throws(Exception::class)
    private fun success() {
        `when`(mLoginHttpEndpointSyncMock?.loginSync(any(String::class.java), any(String::class.java)))
            .thenReturn(LoginHttpEndpointSync.EndpointResult(SUCCESS, AUTH_TOKEN))
    }

    @kotlin.jvm.Throws(Exception::class)
    private fun generalError() {
        `when`(mLoginHttpEndpointSyncMock?.loginSync(any(String::class.java), any(String::class.java)))
            .thenReturn(LoginHttpEndpointSync.EndpointResult(GENERAL_ERROR, ""))
    }

    @kotlin.jvm.Throws(Exception::class)
    private fun authError() {
        `when`(mLoginHttpEndpointSyncMock?.loginSync(any(String::class.java), any(String::class.java)))
            .thenReturn(LoginHttpEndpointSync.EndpointResult(AUTH_ERROR, ""))
    }

    @kotlin.jvm.Throws(Exception::class)
    private fun serverError() {
        `when`(mLoginHttpEndpointSyncMock?.loginSync(any(String::class.java), any(String::class.java)))
            .thenReturn(LoginHttpEndpointSync.EndpointResult(SERVER_ERROR, ""))
    }

    companion object {
        const val USERNAME = "username"
        const val PASSWORD = "password"
        const val AUTH_TOKEN = "authToken"
    }
}