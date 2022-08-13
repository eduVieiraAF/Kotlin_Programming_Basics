package udemy.exercise4.eventbus

interface EventBusPoster {
    fun postEvent(event: LoggedInEvent)
}