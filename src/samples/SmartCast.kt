package samples

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
    val date: ChronoLocalDate? = LocalDate.now()

    if (date != null) println(date.isLeapYear)
    if (date != null && date.isLeapYear) println("it's a leap year...")
    if (date == null || !date.isLeapYear) println("There's no Feb 29th this year...")
    if (date is LocalDate) {
        val month = date.month
        println(month)
    }
}