package lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

const val MAX_TRIES = 5

fun main() {

    val number = Random.nextInt(1..9)
    var userNumber: Int
    var userTries = 0
    var checkResult = true

    println("У вас есть $MAX_TRIES попыток, чтобы угадать число от 1 до 9!")

    while (checkResult == true && userTries != MAX_TRIES) {
        println("Введите число")
        userNumber = readln().toInt()

        checkResult = userNumber != number

        userTries++

        if ((checkResult == false) || userTries == MAX_TRIES) break
        else println("Неудача, попробуйте снова")

    }

    if (checkResult == false) println("Вы угадали! Это была великолепная игра!")
    else println("Вы не угадали! Было загадано число $number")


}