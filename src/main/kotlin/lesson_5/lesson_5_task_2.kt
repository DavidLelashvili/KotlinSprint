package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите год своего рождения")
    val userBirthYear = readln().toInt()

    val currentYear = LocalDate.now().year
    val userAge = currentYear - userBirthYear

    val checkAge = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(checkAge)

}