package lesson_4

const val tables: Byte = 13

fun main() {

    val reservedTablesToday: Byte = 13
    val reservedTablesTomorrow: Byte = 9

    val freeTablesToday: Boolean = (tables - reservedTablesToday) > 0
    val freeTablesTomorrow: Boolean = (tables - reservedTablesTomorrow) > 0

    println("Доступных столиков на сегодня: $freeTablesToday\nДоступных столиков на завтра: $freeTablesTomorrow")
}