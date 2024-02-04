package lesson_3

fun main() {

    val move = "D2-D4;0"

    val listOfParts : List<String> = move.split("-", ";")
    val from = listOfParts.first()
    val to = listOfParts.elementAt(1)
    val moveNumber = listOfParts.last()

    println(from)
    println(to)
    println(moveNumber)

}