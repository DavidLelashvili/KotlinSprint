package lesson_4

const val TABLES: Byte = 13

fun main() {

    val reservedTablesToday: Byte = 13
    val reservedTablesTomorrow: Byte = 9

    val freeTablesToday: Boolean = (TABLES - reservedTablesToday) > 0
    val freeTablesTomorrow: Boolean = (TABLES - reservedTablesTomorrow) > 0

    println("Доступных столиков на сегодня: $freeTablesToday\nДоступных столиков на завтра: $freeTablesTomorrow")
}