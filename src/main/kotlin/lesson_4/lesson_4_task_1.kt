package lesson_4

const val tables: Byte = 13
const val CHECK_FREE_TABLES: Byte = 0

fun main() {

    val reservedTablesToday: Byte = 13
    val reservedTablesTomorrow: Byte = 9

    val freeTablesToday: Boolean = (tables - reservedTablesToday) > CHECK_FREE_TABLES
    val freeTablesTomorrow: Boolean = (tables - reservedTablesTomorrow) > CHECK_FREE_TABLES

    println("Доступных столиков на сегодня: $freeTablesToday\nДоступных столиков на завтра: $freeTablesTomorrow")
}