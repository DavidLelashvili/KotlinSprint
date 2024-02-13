package lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    oneRound(userInput = "Перый раунд")

    do {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userInput = readln().lowercase()
        oneRound(userInput)
    } while (userInput == "да")
}

fun rollDice(): Int = Random.nextInt(1..6)

fun oneRound(userInput: String) {

    if (userInput == "нет") return
    else {
        val userRoll = rollDice()
        println("Бросок пользователя: $userRoll")
        val botRoll = rollDice()
        println("Бросок бота: $botRoll")
        checkResult(userRoll, botRoll)
    }

}

fun checkResult(userRoll: Int, botRoll: Int): Boolean {
    val checkResult: Boolean

    if (userRoll > botRoll) {
        println("Вы выиграли")
        checkResult = true
    } else if (userRoll == botRoll) {
        println("Ничья")
        checkResult = false
    } else {
        println("Вы проиграли")
        checkResult = false
    }

    return checkResult
}

