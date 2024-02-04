package lesson_4

const val NORMAL_HUMIDITY = 20
const val TIME_OF_YEAR = "зима"
const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPEN = true

fun main() {

    val humidity = 20
    val currentTimeOfYear = "зима"

    val conditionsIsGood: Boolean = (
            WEATHER_IS_SUNNY &&
                    TENT_IS_OPEN &&
                    humidity == NORMAL_HUMIDITY &&
                    currentTimeOfYear != TIME_OF_YEAR
            )

    println("Благоприятные ли условия сейчас для роста бобовых: $conditionsIsGood")

}