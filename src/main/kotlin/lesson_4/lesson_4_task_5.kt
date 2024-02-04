package lesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val NORMAL_DAMAGE = false
const val NORMAL_WEATHER = true
const val NORMAL_BOXES = 50


fun main() {

    println("Есть ли повреждения у корабля?\nВведите true - есть повреждения\nfalse -нет повреждений")
    val isDamage: Boolean = readln().toBoolean()

    println("Введите число экипажа")
    val crew = readln().toInt()

    println("Сколько есть ящиков провизии ?")
    val boxes = readln().toInt()

    println("Благоприятная ли погода?\nВведите true - благоприятная\nfalse -неблагоприятная")
    val isGoodWeather: Boolean = readln().toBoolean()

    val checkConditions = (
            (
                    isDamage == NORMAL_DAMAGE &&
                    crew in CREW_MIN..CREW_MAX &&
                    boxes > NORMAL_BOXES
                    ) ||
                    (
                            crew == CREW_MAX &&
                            isGoodWeather == NORMAL_WEATHER &&
                            boxes >= 50
                            )
            )

    println("Можете отплывать: $checkConditions")


}