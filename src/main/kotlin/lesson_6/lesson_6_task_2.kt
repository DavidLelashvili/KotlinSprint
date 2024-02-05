package lesson_6

fun main() {

    println("Введите на сколько секунд поставить таймер")
    val timer = readln().toInt()

    var i = timer

    while (i > 0) {
        Thread.sleep(1000)
        i--
    }

    println("Прошло $timer секунд")


}