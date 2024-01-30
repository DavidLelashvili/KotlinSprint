package lesson_4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_CONST = 100

fun main() {

    var weight = 20
    var volume = 50
    val category = "\'Average\'"

    println("Груз с весом $weight кг и объемом $volume соответствует категории $category: ${weight >= WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_CONST}")

    weight = 80
    volume = 100

    println("Груз с весом $weight кг и объемом $volume соответствует категории $category: ${weight >= WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_CONST}")

}