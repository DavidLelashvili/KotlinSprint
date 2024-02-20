package lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var sumWinGames = 0
    var oneMoreGame: Boolean
    var round = 1

    do {
        if (round == 1) sumWinGames = countWinGame(checkResult(playRound()))

        oneMoreGame = playOneMoreGame()

        if (oneMoreGame) sumWinGames += countWinGame(checkResult(playRound()))
        else println("Количество выигранных: $sumWinGames")

        round++
    } while (oneMoreGame)

}

fun rollDiceForTaskFour(): Int = Random.nextInt(1..6)

fun playRound(): Pair<Int, Int> {

    val userRoll = rollDiceForTaskFour()
    println("Бросок пользователя: $userRoll")
    val botRoll = rollDiceForTaskFour()
    println("Бросок бота: $botRoll")

    return Pair(userRoll, botRoll)
}

fun checkResult(round: Pair<Int, Int>): Boolean {
    val userRoll = round.first
    val botRoll = round.second
    val checkResult = when {
        userRoll > botRoll -> {
            println("Вы выиграли"); true
        }

        userRoll == botRoll -> {
            println("Ничья"); false
        }

        else -> {
            println("Вы проиграли"); false
        }
    }
    return checkResult

}

fun countWinGame(winGame: Boolean): Int {
    var winGameCount = 0
    if (winGame) winGameCount++
    return winGameCount
}

fun playOneMoreGame(): Boolean {
    val choseYes: Boolean
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val userInput = readln()
    choseYes = userInput.equals("да", ignoreCase = true)
    return choseYes
}