package lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

const val TRIES = 5

fun main() {

    val number = Random.nextInt(1..9)
    var userNumber: Int
    var rightNumber: Boolean
    var i = 0


    println("У вас есть $TRIES попыток, чтобы угадать число от 1 до 9!")

    do {
        if (i == TRIES) {
            println("Вы не угадали! Было загадано число $number")
            break
        }

        println("Введите число")
        userNumber = readln().toInt()

        rightNumber = (userNumber == number)

        if (rightNumber) println("Вы угадали! Это была великолепная игра!")
        else println("Неудача, попробуйте снова")

        i++
    } while (!rightNumber)

}