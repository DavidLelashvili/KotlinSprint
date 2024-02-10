package lesson_8

fun main() {

    val ingredientsArray = arrayOf("яйцо", "молоко", "салат", "помидор", "огурец", "лаваш", "сыр", "соль")
    val userNewIngredient: String
    val indexReplaceIngredient :Int

    println("Вот какие ингредиенты входят сейчас в рецепт:")
    ingredientsArray.forEach { print("$it ") }
    println()
    println("Введите ингредиент, которых хотите изменить")
    val userReplaceIngredient = readln()

    if (userReplaceIngredient in ingredientsArray) {
        println("Ингредиент найден, на какой хотите заменить")
        userNewIngredient = readln()

        indexReplaceIngredient = ingredientsArray.indexOf(userReplaceIngredient)
        ingredientsArray.set(indexReplaceIngredient, userNewIngredient)

        println("Готово! Вы сохранили следующий список:")
        ingredientsArray.forEach { print("$it ") }
    } else println("Нет такого ингредиента")

}