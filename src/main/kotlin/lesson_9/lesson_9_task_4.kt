package lesson_9

fun main() {

    println("Введите 5 ингредиентов для вашего блюда через ,")
    val ingredientsList = readln().split(", ")

    println("${ingredientsList.sorted()}")
}