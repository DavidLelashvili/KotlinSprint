package lesson_9

fun main() {

    val quantityOfIngredientsPerDish = mutableListOf(2, 50, 15)

    println("Сколько хотите приготовить порций?")
    val portion = readln().toInt()

    val userQuantityOfIngredients = quantityOfIngredientsPerDish.map { quantity ->
        quantity * portion
    }

    println("""
        На $portion порций вам понадобится:
        Яиц - ${userQuantityOfIngredients.get(0)}
        Молока - ${userQuantityOfIngredients.get(1)}
        Сливочного масла - ${userQuantityOfIngredients.get(2)}
    """.trimIndent())
}