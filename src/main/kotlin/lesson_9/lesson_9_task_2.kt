package lesson_9

fun main() {

    val ingredientsList = mutableListOf("яйцо", "молоко", "салат", "помидор", "огурец")
    val ingredient: String
    val choseYes = "да"

    println("В рецепте есть базовые ингредиенты: $ingredientsList\nЖелаете добавить еще?")

    val askToAddIngredient = readln().lowercase()

    if (askToAddIngredient == choseYes) {
        println("Какой ингредиент хотите добавить?")
        ingredient = readln()

        if (ingredientsList.contains(ingredient)) {
            println("Такой ингредиент уже есть в рецепте: $ingredient")
        } else {
            ingredientsList.add(ingredient)
            println("Теперь в рецепте есть следующие ингредиенты: $ingredientsList")
        }
    } else return

}