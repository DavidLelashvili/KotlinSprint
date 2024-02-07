package lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

const val MAX_TRIES = 5

fun main() {

    val number = Random.nextInt(1..9)
    var userNumber: Int
    var userTries = 0
    var rightNumber: Boolean

    println("У вас есть $MAX_TRIES попыток, чтобы угадать число от 1 до 9!")

    do {
        println("Введите число")
        userNumber = readln().toInt()

        rightNumber = userNumber == number
        userTries++

        if (rightNumber) println("Вы угадали! Это была великолепная игра!")
        else if (userTries < MAX_TRIES) println("Неудача, попробуйте снова\nОстальнось попыток: ${MAX_TRIES-userTries}")
        else println("Вы не угадали! Было загадано число $number")

    } while (!rightNumber && userTries != MAX_TRIES)

}