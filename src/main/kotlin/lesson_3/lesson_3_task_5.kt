package lesson_3

fun main() {

    val move = "D2-D4;0"

    val from = move.take(2)
    val to = move.slice(3..4)
    val moveNumber = move.takeLast(1)

    println(from)
    println(to)
    println(moveNumber)


}