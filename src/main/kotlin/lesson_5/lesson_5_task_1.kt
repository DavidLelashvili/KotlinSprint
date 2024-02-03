package lesson_5

fun main() {

    println("Введите первое число")
    val a = readln().toInt()

    println("Введите второе число")
    val b = readln().toInt()

    println("Введите сумму первого и второго чисел")
    val c = readln().toInt()

    val checkResult = if ((a + b) == c) "Добро пожаловать!"
    else "Доступ запрещен"

    println(checkResult)

}