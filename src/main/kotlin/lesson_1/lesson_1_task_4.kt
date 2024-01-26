package lesson_1

import java.time.Duration
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.regex.Pattern


fun main() {

    var length: Long = 40868600000 //mm
    val age: Int = 27
    val apogee: Int = 327000
    val time1 = "09:07" //HH:mm || HH:mm:ss
    val time2 = "10:55" //HH:mm || HH:mm:ss

    val duration = duration(time1, time2)
    val durationInt = duration.toMinutes().toInt()
    val partOfDay: Double = durationInt.toDouble() / 24 / 60
    val partOfYear: Double = partOfDay / 365 //не Float потому что в данных больше числе после запятой

    println(
        """
        Расстояние - $length
        Возраст - $age
        Часть дня - $partOfDay
        Секунды - ${duration.seconds}
        Часть года - $partOfYear
        Апогей арбиты - $apogee
    """.trimIndent()
    )

    println()
    println(duration.toHours())

}

fun duration(time1: String, time2: String): Duration {

    val pattern = checkFormat(time1,time2)
//   val pattern = DateTimeFormatter.ofPattern("HH:mm")
    val time1 = LocalTime.parse(time1, pattern)
    val time2 = LocalTime.parse(time2, pattern)
//
    return Duration.between(time1, time2)
}

//попытался сделать проверку формата HH:mm || HH:mm:ss
fun checkFormat(time1: String, time2: String): DateTimeFormatter {
    val pattern: DateTimeFormatter

    if (time1.length  <= 5 || time2.length <= 5) {
        pattern = DateTimeFormatter.ofPattern("HH:mm")
        return pattern
    } else if (time1.length > 5 || time2.length > 5) {
        pattern = DateTimeFormatter.ofPattern("HH:mm:ss")
        return pattern
    } else {
        throw Exception("Неправильный формат времени, укажите в HH:mm:ss или HH:mm") // как тут правильно вместо стектрейса выкинуть мессадж ?
        return DateTimeFormatter.ofPattern("HH:mm:ss")
    }
}

