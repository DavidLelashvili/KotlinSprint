package lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

const val TRIES = 5

fun main() {

    val number = Random.nextInt(1..9)
    var userNumber: Int
    var i = 0

    do {
        if (i == TRIES) {
            println("Вы не угадали! Было загадано число $number")
            break
        }

        if (i == 0) println("У вас есть $TRIES попыток, чтобы угадать число от 1 до 9!\nВведите число")
        else println("Неудача, попробуйте снова\nВведите число")
        userNumber = readln().toInt()

        if (userNumber == number) println("Вы угадали! Это была великолепная игра!")

        i++
    } while (userNumber != number)

}