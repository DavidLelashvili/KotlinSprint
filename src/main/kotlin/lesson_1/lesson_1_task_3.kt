package lesson_1

fun main() {
    val year = 1961
    var hour = "09"
    var minute = "07"

    println("""
        Год полета - $year
        Время взлета - $hour:$minute
    """.trimIndent())

    hour = "10"
    minute = "55"
    println("Время посадки - $hour:$minute")
}