package lesson_4


fun main() {

    val day = 5
    val arms: Boolean
    val abs: Boolean
    val legs: Boolean
    val back: Boolean

    if (day % 2 == 0) {
        arms = false
        abs = false
        legs = true
        back = true
    } else {
        arms = true
        abs = true
        legs = false
        back = false
    }

    println(
        """
            Упражнения для рук: $arms
            Упражнения для ног: $legs
            Упражнения для спины: $back
            Упражнения для пресса: $abs
        """.trimIndent()
    )
}