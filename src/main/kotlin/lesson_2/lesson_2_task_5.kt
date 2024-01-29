package lesson_2

import kotlin.math.pow

fun main() {

//    Формула: S=A*(1+R)^T
//    A- СУММА ВКЛАДА;
//    R- СТАВКА ПРОЦЕНТА;
//    T- КОЛИЧЕСТВО ПЕРИОДОВ;
//    S- ПОЛУЧАЕМАЯ СУММА.

    val deposit = 70000
    val interestRate = 16.7
    val time = 20
    val s = deposit * (1 + interestRate / 100).pow(time)

    println((String.format("%.3f", s)))

}