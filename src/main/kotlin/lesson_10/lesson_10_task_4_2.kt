package lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var choseYes: Boolean
    val firstRound = countWinGame(checkResult(playRound()))
    var sumWinGames = firstRound

    do {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userInput = readln().lowercase()
        choseYes = userInput == "да"

        if (choseYes) sumWinGames += countWinGame(checkResult(playRound()))
        else println("Количество выигранных: $sumWinGames")
    } while (choseYes)

}

fun rollDice1(): Int = Random.nextInt(1..6)

fun playRound(): Pair<Int, Int> {

    val userRoll = rollDice1()
    println("Бросок пользователя: $userRoll")
    val botRoll = rollDice1()
    println("Бросок бота: $botRoll")

    return Pair(userRoll, botRoll)
}

fun checkResult(round: Pair<Int, Int>): Boolean {
    val userRoll = round.first
    val botRoll = round.second
    val checkResult = if (userRoll > botRoll) {
        println("Вы выиграли")
        true
    } else if (userRoll == botRoll) {
        println("Ничья")
        false
    } else {
        println("Вы проиграли")
        false
    }
    return checkResult

}

fun countWinGame(winGame: Boolean): Int {
    var winGameCount = 0
    if (winGame) winGameCount++
    return winGameCount
}
