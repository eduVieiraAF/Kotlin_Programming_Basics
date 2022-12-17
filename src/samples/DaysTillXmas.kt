import java.time.LocalDate
import java.time.Month

fun main() {
    val today = LocalDate.now()
    val xmas = LocalDate.of(today.year, Month.DECEMBER, 25)
    val daysTillXmas = xmas.dayOfYear - today.dayOfYear

    println("$daysTillXmas days till X-mas")
}