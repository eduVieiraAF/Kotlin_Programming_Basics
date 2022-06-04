package housing_oop

sealed class Booking

class Owner(val id: Int) : Booking()
class Resident(val name: String, val roomNumber: Int) : Booking()
object Guest : Booking()

fun frontDesk(e: Booking): Int = when (e) {
    is Owner -> e.id
    is Resident -> e.roomNumber
    Guest -> 0
}

