package lesson_8

fun main() {

    val ingredientsArray = arrayOf("яйцо", "молоко", "салат", "помидор", "огурец", "лаваш", "сыр", "соль")
    var ingredientContains = false

    println("Введите ингредиент, чтобы проверить есть ли он в рецепте")
    val userIngredient = readln()

    for (ingredient in ingredientsArray) {
        ingredientContains = (userIngredient == ingredient)
        if (ingredientContains) break
    }

    if (ingredientContains) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")


}