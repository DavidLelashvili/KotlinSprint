package lesson_8

fun main() {

    val ingredientsArray = arrayOf("яйцо", "молоко", "салат", "помидор", "огурец", "лаваш", "сыр", "соль")
    var ingredientContains = false
    val userNewIngredient: String

    println("Вот какие ингредиенты входят сейчас в рецепт:")
    ingredientsArray.forEach { print("$it ") }
    println()
    println("Введите ингредиент, которых хотите изменить")
    val userReplaceIngredient = readln()

    for (i in ingredientsArray) {
        ingredientContains = userReplaceIngredient == i
        if (!ingredientContains) {
            continue
        } else {
            println("Ингредиент найден, на какой хотите заменить")
            userNewIngredient = readln()

            ingredientsArray.set(ingredientsArray.indexOf(i), userNewIngredient)
            break
        }
    }

    if (ingredientContains) {
        println("Готово! Вы сохранили следующий список:")
        ingredientsArray.forEach { print("$it ") }
    } else println("Нет такого ингредиента")

}