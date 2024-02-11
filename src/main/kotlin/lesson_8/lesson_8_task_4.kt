package lesson_8

fun main() {

    val ingredientsArray = arrayOf("яйцо", "молоко", "салат", "помидор", "огурец", "лаваш", "сыр", "соль")
    val userNewIngredient: String
    val indexReplaceIngredient: Int

    println("Вот какие ингредиенты входят сейчас в рецепт: ${ingredientsArray.contentToString()}")
    println("Введите ингредиент, которых хотите изменить")
    val userReplaceIngredient = readln()

    indexReplaceIngredient = ingredientsArray.indexOf(userReplaceIngredient)

    if (indexReplaceIngredient == -1) println("Нет такого ингредиента")
    else {
        println("Ингредиент найден! Введите ингредиент, на который хотите заменить")
        userNewIngredient = readln()

        ingredientsArray.set(indexReplaceIngredient, userNewIngredient)

        println("Готово! Вы сохранили следующий список: ${ingredientsArray.contentToString()}")
    }

}