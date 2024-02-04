package lesson_5

fun main() {

    println("Введите первое число")
    val numberOne = readln().toInt()

    println("Введите второе число")
    val numberTwo = readln().toInt()

    println("Введите сумму первого и второго чисел")
    val sum = readln().toInt()

    val checkResult = if ((numberOne + numberTwo) == sum) "Добро пожаловать!"
    else "Доступ запрещен"

    println(checkResult)

}