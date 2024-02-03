package lesson_5

fun main() {

    val numberOne = 17
    val numberTwo = 40

    println("""
        Для выигрыша в лотерии вам нужно угадать два числа от 0 до 42.
        Если угадываете одно - получаете утешительный приз.
        
        Введите первое число.
    """.trimIndent())

    val userNumberOne = readln().toInt()

    println("Введите второе число")
    val userNumberTwo = readln().toInt()

    val checkResult = if ((userNumberOne == numberOne) && (userNumberTwo == numberTwo)) "Поздравляем! Вы выиграли гланый приз!"
    else if ((userNumberOne == numberOne) || (userNumberTwo == numberTwo)) "Вы выиграли утешительный приз!"
    else "Неудача!"

    println("Загаданными числами были $numberOne и $numberTwo")
    println(checkResult)



}