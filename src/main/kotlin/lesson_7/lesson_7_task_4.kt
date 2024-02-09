package lesson_7

const val SECOND: Long = 1000

fun main() {

    println("Введите, сколько хотите засечь секунд")
    var timer = readln().toInt()

    for (i in timer downTo 0) {
        if (i == 0) {
            println("Время вышло")
            break
        }
        println("Осталось секунд: ${timer--}")
        Thread.sleep(SECOND)
    }

}