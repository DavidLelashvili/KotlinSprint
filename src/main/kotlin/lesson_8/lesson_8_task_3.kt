package lesson_8

fun main() {

    val ingredientsArray = arrayOf("яйцо", "молоко", "салат", "помидор", "огурец", "лаваш", "сыр", "соль")
    val ingredientContains: Boolean

    println("Введите ингредиент, чтобы проверить есть ли он в рецепте")
    val userIngredient = readln()

    ingredientContains = userIngredient in ingredientsArray

    if (ingredientContains) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}