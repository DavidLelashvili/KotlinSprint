package lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val userRoll = rollDice()
    println("Бросок пользователя: $userRoll")
    val botRoll = rollDice()
    println("Бросок бота: $botRoll")

    if (userRoll > botRoll) println("Победило человечество")
    else if (userRoll == botRoll) println("Ничья. Машине не удалось обыграть человека")
    else println("Победила машина")

}

fun rollDice() = Random.nextInt(1..6)