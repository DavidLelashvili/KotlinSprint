package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    val departureHour: Byte = 9
    val departureMinute: Byte = 39
    val durationInMinutes: Short = 457

    val arrivalTimeInMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + durationInMinutes

    val arrivalHour = arrivalTimeInMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTimeInMinutes % MINUTES_IN_HOUR

    println("Время прибытия поезда - $arrivalHour часов $arrivalMinute минут")

}