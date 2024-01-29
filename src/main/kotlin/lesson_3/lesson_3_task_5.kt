package lesson_3

fun main() {

    val move = "D2-D4;0"

    val listOfParts = move.split(";")
    val moveNumber = listOfParts.get(index = 1)
    val listFromTo = listOfParts.get(index = 0).split("-")
    val from = listFromTo.first()
    val to= listFromTo.last()

    println(from)
    println(to)
    println(moveNumber)


}