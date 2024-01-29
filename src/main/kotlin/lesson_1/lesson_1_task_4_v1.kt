package lesson_1

fun main() {

    var length: Long = 40868600000
    val age: Int = 27
    val partOfDay: Float = 0.075f
    val durationInSeconds: Int = 6480
    val partOfYear: Double = partOfDay.toDouble() / 365
    val apogee: Int = 327000
    println(
        """
        Расстояние - $length
        Возраст - $age
        Часть дня - $partOfDay
        Секунды - $durationInSeconds
        Часть года - $partOfYear
        Апогей арбиты - $apogee
    """.trimIndent()
    )

}

