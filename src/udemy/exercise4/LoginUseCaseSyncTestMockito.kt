@file:Suppress("FunctionName")

package udemy.exercise4

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.runners.MockitoJUnitRunner
import udemy.exercise4.authtoken.AuthTokenCache
import udemy.exercise4.eventbus.EventBusPoster
import udemy.exercise4.networking.LoginHttpEndpointSync
import udemy.exercise4.networking.LoginHttpEndpointSync.EndpointResultStatus.SUCCESS
import udemy.exercise4.networking.NetworkErrorExceptions
import kotlin.test.assertEquals

@RunWith(MockitoJUnitRunner::class)
class LoginUseCaseSyncTestMockito {

    // region Constants
    companion object {
        const val USERNAME = "username"
        const val PASSWORD = "password"
        const val AUTH_TOKEN = "authToken"
    }

    // endregion Constants

    // region helper fields
    @Mock
    var mLoginHttpEndpointSyncMock: LoginHttpEndpointSync? = null

    @Mock
    var mAuthTokenCacheMock: AuthTokenCache? = null

    @Mock
    var mEventBusPosterMock: EventBusPoster? = null

    // endregion helper fields

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



    @Throws(Exception::class)
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


    // helper methods
    @Throws(NetworkErrorExceptions::class)
    private fun success() {
        `when`(mLoginHttpEndpointSyncMock?.loginSync(any(String::class.java), any(String::class.java)))
            .thenReturn(LoginHttpEndpointSync.EndpointResult(
                SUCCESS, AUTH_TOKEN)
        )
    }

    // endregion helper methods

    // region helper classes

    // endregion helper classes
}