package lesson_9

const val INGREDIENTS_COUNT = 5

fun main() {

    var userIngredient: String
    val ingredientsList = mutableSetOf<String>()

    for (ingredient in 1..INGREDIENTS_COUNT) {
        println("Введите ингредиент")
        userIngredient = readln()
        ingredientsList.add(userIngredient)
    }

    val formattedIngredientsOutput = ingredientsList
        .sorted()
        .joinToString(prefix = "", postfix = "")
        .replaceFirstChar { it.uppercase() }

    println(formattedIngredientsOutput)

}