package lesson_6

fun main() {

    println("Введите на сколько секунд поставить таймер")
    val timer = readln().toLong()

    Thread.sleep(timer * 1000)

    println("Прошло $timer секунд")


}