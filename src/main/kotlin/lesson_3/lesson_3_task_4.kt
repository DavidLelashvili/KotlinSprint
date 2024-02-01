package lesson_3

const val MOVE_TO_ONE_CELL = 1

fun main() {

    val moveNumberWhite1: Byte = 1
    val moveNumberWhite2: Byte = 3
    val from = "E2"
    val to = "E4"

    println("$from-$to;$moveNumberWhite1")

    val d = "D"
    val fromD: Byte = 2
    val toD = (fromD + MOVE_TO_ONE_CELL).toString()

    println("$d$fromD-$d$toD;${moveNumberWhite2}")

}