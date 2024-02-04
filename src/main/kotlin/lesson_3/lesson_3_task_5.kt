package lesson_3

fun main() {

    val move = "D2-D4;0"

    val listOfParts : List<String> = move.split("-", ";")
    val from = listOfParts[0]
    val to = listOfParts[1]
    val moveNumber = listOfParts[2]

    println(from)
    println(to)
    println(moveNumber)

}