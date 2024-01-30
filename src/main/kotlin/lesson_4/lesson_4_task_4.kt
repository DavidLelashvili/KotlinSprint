package lesson_4

const val NORMAL_HUMIDITY = 20
const val NORMAL_TIME_OF_YEAR = "не зима"

fun main() {

    val weatherIsSunny = true //погода солнечная
    val tentIsOpen = true //тент открыт
    val humidity = 20
    val timeOfYear = "зима"

    val conditionsIsGood: Boolean = (
            weatherIsSunny &&
                    tentIsOpen &&
                    humidity == NORMAL_HUMIDITY &&
                    timeOfYear === NORMAL_TIME_OF_YEAR //тут наверное правильнее сравнивать ссылки, но может ошибаюсь
            )

    println("Благоприятные ли условия сейчас для роста бобовых: $conditionsIsGood")

}