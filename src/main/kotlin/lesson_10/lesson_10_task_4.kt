package lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var choseYes: Boolean
    val firstRound = countWinRound()
    var sumWinGames = firstRound

    do {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userInput = readln().lowercase()
        choseYes = userInput == "да"

        if (choseYes) sumWinGames += countWinRound()
        else println("Количество выигранных: $sumWinGames")
    } while (choseYes)

}

fun rollDice(): Int = Random.nextInt(1..6)

fun countWinRound(): Int {

    var winGameCount = 0
    val userRoll = rollDice()
    println("Бросок пользователя: $userRoll")
    val botRoll = rollDice()
    println("Бросок бота: $botRoll")

    if (userRoll > botRoll) {
        println("Вы выиграли")
        winGameCount++
    } else if (userRoll == botRoll) {
        println("Ничья")
    } else {
        println("Вы проиграли")
    }
    return winGameCount
}
