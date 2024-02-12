package lesson_9

fun main() {

    println("Введите 5 ингредиентов для вашего блюда через ;")
    val ingredientsList = readln().replace(" ", "").split(";")

    println("${ingredientsList.sorted()}")
}