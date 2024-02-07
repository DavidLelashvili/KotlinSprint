package lesson_5

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var randomNumber: Int
    val smartRandomListOfNumbers = mutableListOf<Int>()

    do {
        randomNumber = Random.nextInt(0..42)
        if (randomNumber !in smartRandomListOfNumbers) {
            smartRandomListOfNumbers.add(randomNumber)
        }
    } while (smartRandomListOfNumbers.size < 3)

    println("""
        Для выигрыша джекпота в лотерии вам нужно угадать три числа от 0 до 42.
        Если угадываете два - получаете крупный приз.
        Если угадываете одно - получаете утешительный приз.

        Введите первое число.
    """.trimIndent())

    val userNumberOne = readln().toInt()

    println("Введите второе число")
    val userNumberTwo = readln().toInt()

    println("Введите третье число")
    val userNumberThree = readln().toInt()

    val listUserNumber = listOf(userNumberOne, userNumberTwo, userNumberThree)

    val overlapSize = listUserNumber.intersect(smartRandomListOfNumbers).size

    val checkResult = when (overlapSize) {
        3 -> "Невероятно! Вы угадали все числа и сорвали джекпот"
        2 -> "Сегодня ваш день! Вы отгадали 2 числа и выиграли крупный приз!"
        1 -> "Вы отгадали одно число и выиграли утешительный приз!"
        else -> "К сожалению, вы не угадали не одно число!"
    }

    println("Загаданными числами были $smartRandomListOfNumbers")
    println(checkResult)

}