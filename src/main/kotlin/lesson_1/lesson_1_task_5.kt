package lesson_1

import java.util.*

fun main() {

    val time1 = "09:07:11" //HH:mm || HH:mm:ss
    val time2 = "10:55:24" //HH:mm || HH:mm:ss

    val duration = duration(time1, time2)
    val durationSeconds = duration.seconds.toInt()

    val hour = durationSeconds/60/60
    val minutes = durationSeconds /60 % 60
    val seconds = durationSeconds % 60

    val formatter = Formatter().format("%1\$02d:%2\$02d:%3\$02d", hour, minutes, seconds).toString()

    println("""
        $duration
        $durationSeconds
        Продолжительность в секундах - $durationSeconds
        Продолжительность в hh:mm:ss - $formatter
    """.trimIndent())

}

