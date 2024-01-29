package lesson_1

import java.util.*

fun main() {

    val durationInSeconds = 6480

    val hour = durationInSeconds / 60 / 60
    val minutes = durationInSeconds / 60 % 60
    val seconds = durationInSeconds % 60

//    нашел вот такой вариант, буду рад если поделитесь, как было бы лучше сделать
    val formatter = Formatter().format("%1\$02d:%2\$02d:%3\$02d", hour, minutes, seconds)

    println(
        """
        Продолжительность в hh:mm:ss - $formatter
    """.trimIndent()
    )

}