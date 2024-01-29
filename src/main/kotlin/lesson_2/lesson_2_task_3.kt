package lesson_2

fun main() {

    val departureHour: Byte = 9
    val departureMinute: Byte = 39
    val durationInMinutes: Short = 457

    val durationHours = durationInMinutes / 60
    val durationMinutes = durationInMinutes % 60

    var arrivalHour = departureHour + durationHours
    var arrivalMinute = departureMinute + durationMinutes

    if (arrivalMinute > 60) {

        arrivalHour += 1
        arrivalMinute -= 60

        println("Время прибытия поезда - $arrivalHour часов $arrivalMinute минут")
    } else println("Время прибытия поезда - $arrivalHour часов $arrivalMinute минут")

}