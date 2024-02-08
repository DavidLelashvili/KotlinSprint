package lesson_6

const val MAX_TRIES_TASK_5 = 3

fun main() {

    var number1: Int
    var number2: Int
    var sum: Int
    var userTries = 0

    println("Подтвердите, что вы не бот!\nУ вас есть три попытки, чтобы ввести два числа от 1 до 9 и посчитать их сумму")

    do {
        println("Введите первое число")
        number1 = readln().toInt()

        println("Введите второе число")
        number2 = readln().toInt()

        println("Введите сумму этих двух чисел")
        sum = readln().toInt()

        userTries++

        if (number1 + number2 == sum) println("Добро пожаловать!")
        else if (userTries < MAX_TRIES_TASK_5) println("Неверно, попробуйте еще раз\nОсталось попыток: ${MAX_TRIES_TASK_5 - userTries}")
        else println("Доступ запрещен")

    } while (
        (number1 + number2 != sum) &&
        (userTries != MAX_TRIES_TASK_5)
    )

}