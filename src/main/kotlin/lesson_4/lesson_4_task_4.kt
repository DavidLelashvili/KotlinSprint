package lesson_4


fun main() {

    val day = 5
    val evenDay = day % 2
    val arms = evenDay != 0
    val abs = evenDay != 0
    val legs = evenDay == 0
    val back = evenDay == 0

    println(
        """
            Упражнения для рук: $arms
            Упражнения для ног: $legs
            Упражнения для спины: $back
            Упражнения для пресса: $abs
        """.trimIndent()
    )
}