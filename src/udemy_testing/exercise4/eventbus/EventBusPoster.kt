package udemy_testing.exercise4.eventbus

interface EventBusPoster {
    fun postEvent(event: String)
}