package lesson_6

fun main() {

    println("Введите на сколько секунд поставить таймер")
    var timer = readln().toInt()

    while (timer > 0) {
        println("Осталось секунд: $timer")
        Thread.sleep(1000)
        timer--
    }

    println("Время вышло")


}