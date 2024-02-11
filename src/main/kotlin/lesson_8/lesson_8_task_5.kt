package lesson_8

fun main() {

    println("Введите количетсво ингредиентов в рецепте")
    val ingredientCount = readln().toInt()
    var ingredient: String
    val ingredientsArray = arrayOfNulls<String>(ingredientCount)

    for (i in 0 until ingredientCount) {
        println("Введите ингредиент ${i+1}")
        ingredient = readln()

        ingredientsArray[i] = ingredient
    }

    println("Список ингредиентов для вашего рецепта: ${ingredientsArray.contentToString()}")

}