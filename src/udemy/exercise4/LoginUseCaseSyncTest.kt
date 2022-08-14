package udemy.exercise4

import org.junit.Assert.*
import udemy.exercise4.eventbus.EventBusPoster
import udemy.exercise4.eventbus.LoggedInEvent
import udemy.exercise4.networking.LoginHttpEndpointSync

class LoginUseCaseSyncTest {
    companion object {
        const val USERNAME = "username"
        const val PASSWORD = "password"
        const val AUTH_TOKEN = "authToken"
    }

// *••••••••••••••••HELPER•CLASSES••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••

    class LoginHttpEndpointSyncTd: LoginHttpEndpointSync {
        override fun loginSync(username: String?, password: String?): LoginHttpEndpointSync.EndpointResult? {
            TODO("Not yet implemented")
        }
    }

    class EventBusPosterTd: EventBusPoster {
        override fun postEvent(event: LoggedInEvent) {
            TODO("Not yet implemented")
        }

    }
}