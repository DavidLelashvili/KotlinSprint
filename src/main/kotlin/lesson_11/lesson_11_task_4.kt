package lesson_11

class Recipe(
    var name: String = "",
    val pic: String = "",
    var category: String = Category().name,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
    var isFavorite: Boolean = false,
) {

    fun calculateIngredientsVolumeForCustomPortion(portion: Int) {
        ingredients
            .map { it.volume = (it.volume!! * portion) }
    }

    fun renameRecipe(): String {
        println("Текущее название - $name. Хотите переименовть рецепт? (да/нет)")
        val userAnswer = readln()
        if (userAnswer.equals("да", ignoreCase = true)) {
            println("Введите название рецепта")
            name = readln()
        } else println("Хорошо, оставили название - $name")
        return name
    }

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
        println("Ингредиент ${ingredient.name} добавлен в рецепт $name")
    }


    fun removeIngredient(ingredient: Ingredient) {
        ingredients.remove(ingredient)
        println("Ингредиент ${ingredient.name} удален из рецепта $name")

    }

    fun addToFavorite() {
        isFavorite = true
        println("Рецепт $name добавлен в избранное")
    }

    fun removeFromFavorite() {
        isFavorite = false
        println("Рецепт $name удален из избранного")
    }

    fun toPrettyString(ingredientsList: MutableList<Ingredient>): String {
        val ingredientData = ingredientsList
            .map { it.prepareIngredientInfo() }
            .joinToString()
        return ingredientData
    }

    fun getRecipeInfo() {
        println(
            """
            Название рецепта - $name
            Картинка рецепта - $pic
            Категория рецепта - $category
            Ингрдиенты: ${toPrettyString(ingredients)}
            Добавлен в избранное - $isFavorite
        """.trimIndent()
        )

    }
}

class Category(
    var name: String = "",
    var description: String = "",
    var pic: String = "",
    var recipes: MutableList<Recipe> = mutableListOf(),
) {

    fun fillCategoryInfo() {
        println("Введите название категории")
        name = readln()
        println("Введите описание категории")
        description = readln()
    }

    fun getCategoryInfo() {
        println(
            """
            Название категории - $name
            Описание категории - $description
            Картинка категории - $pic
            Рецепты: ${toPrettyString(recipes)}
        """.trimIndent()
        )
    }

    fun getFavoriteCategory() {
        recipes
            .map {
                if (it.isFavorite) println("Избранные рецепты: ${toPrettyString(recipes)}")
                else println("Вы еще не добавили ни одного рецепта в избранное")
            }
    }

    fun addRecipeInCategory(recipe: Recipe) {
        recipes.add(recipe)
        recipe.category = name
        println("Рецепт ${recipe.name} добавлен в категорию $name")
    }

    fun getRecipesInCategory() {
        println("Рецепты в категории $name: ${recipes.map { it.name }}")
    }

    fun toPrettyString(recipeList: MutableList<Recipe>): String {
        val recipeData = recipeList
            .map { it.name }
            .joinToString()
        return recipeData
    }

}

class Ingredient(
    var name: String = "",
    var volume: Int? = null,
    var unit: String = "",
) {
    companion object {
        const val GRAM = "г"
        const val THING = "штуки"
        const val TABLESPOON = "с. ложек"
    }

    fun fillIngredient() {
        println("Введите название ингредиента")
        name = readln()
        println("Введите сколько нужно ингредиента")
        volume = readln().toInt()
        println("Введите единицы измерения")
        unit = readln()
        formatUnit(unit)
    }

    fun formatUnit(units: String): String {
        unit = when {
            (listOf("гр", "граммы", "г")).contains(units) -> GRAM
            (listOf("штуки", "шт", "штук")).contains(units) -> THING
            (listOf("ст. ложка", "столовая ложка", "с. ложка")).contains(units) -> TABLESPOON
            else -> "Не поддерживается такая единица измерения"
        }
        return unit
    }

    fun prepareIngredientInfo(): String = "$name - $volume $unit"

    fun getIngredientInfo() {
        println("Ингредиент: ${prepareIngredientInfo()}")
    }

}

fun main() {

    println("Добавьте категорию")

    val category1 = Category()
    category1.fillCategoryInfo()
    category1.getCategoryInfo()

    println("Добавьте рецепт")
    val recipe1 = Recipe(pic = "ссылка на картинку")
    recipe1.renameRecipe()

    println("Добавьте ингредиенты")

    val ingredient1 = Ingredient()
    ingredient1.fillIngredient()
    ingredient1.getIngredientInfo()

    val ingredient2 = Ingredient()
    ingredient2.fillIngredient()

    val ingredient3 = Ingredient()
    ingredient3.fillIngredient()

    recipe1.addIngredient(ingredient1)
    recipe1.addIngredient(ingredient2)
    recipe1.addIngredient(ingredient3)
    recipe1.getRecipeInfo()

    println("Удалите ингредиент из рецепта")
    recipe1.removeIngredient(ingredient2)

    println("Выберите количество порций, а мы рассчитаем количество ингредиентов")
    val portion = readln().toInt()
    recipe1.calculateIngredientsVolumeForCustomPortion(portion)

    recipe1.getRecipeInfo()

    println("Добавьте рецепт в избранное")
    recipe1.addToFavorite()

    category1.addRecipeInCategory(recipe1)
    recipe1.getRecipeInfo()
    category1.getCategoryInfo()

    println("Перейдите в избранное")
    category1.getFavoriteCategory()
    category1.getRecipesInCategory()

}