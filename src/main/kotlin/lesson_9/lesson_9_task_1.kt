package lesson_9

fun main() {

    val ingredietnsList = listOf("яйцо", "молоко", "салат", "помидор", "огурец", "лаваш", "сыр", "соль")

    println("В рецепте есть следующие ингредиенты:")
    ingredietnsList.forEach { println(it) }

}