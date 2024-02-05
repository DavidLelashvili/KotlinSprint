package lesson_6

const val TRIES = 3

fun main() {

    var number1: Int
    var number2: Int
    var sum: Int
    var i = 0

    do {
        if (i == TRIES) {
            println("Доступ запрещен")
            break
        }

        if (i == 0) println("Подтвердите, что вы не бот!\nУ вас есть три попытки, чтобы ввести два числа от 1 до 9 и посчитать их сумму")
        else println("Неверно, попробуйте еще раз, осталось попыток: ${TRIES-i}")

        println("Введите первое число")
        number1 = readln().toInt()

        println("Введите второе число")
        number2 = readln().toInt()

        println("Введите сумму этих двух чисел")
        sum = readln().toInt()

        if (number1 + number2 == sum) println("Добро пожаловать!")

        i++
    } while (
        (number1 + number2 != sum)
    )

}