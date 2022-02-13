package samples

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

fun main(){

    getCurrentDateTime()
    println()
    currentDateTimePattern()
    println()
    currentDateTimePattern2()
}

fun currentDateTimePattern2() {

    val dateTimePattern2 = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
    val formatted = dateTimePattern2.format(formatter)

    println("Today's date is: $formatted")
}

fun currentDateTimePattern() {

    val dateTimePattern = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("YYYY-dd-MM  HH:mm:ss")
    val formatted = dateTimePattern.format(formatter)

    println("Today's date is: $formatted")

}

fun getCurrentDateTime() {

    val currentDateAndTime = LocalDateTime.now()
    println("Today's date is: $currentDateAndTime")
}
