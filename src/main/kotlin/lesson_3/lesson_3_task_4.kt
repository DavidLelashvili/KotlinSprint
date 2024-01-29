package lesson_3

fun main() {

    val moveNumber: Byte = 1
    val from = "E2"
    val to = "E4"

    println("$from-$to;$moveNumber")

    val d = "D"
    val fromD: Byte = 2
    val toD = (fromD + 1).toString()

    println("$d$fromD-$d$toD;${moveNumber + 2}")

}