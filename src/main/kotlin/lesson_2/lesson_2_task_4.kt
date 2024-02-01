package lesson_2

const val PERCENT_100 = 100

fun main() {

    val iron: Byte = 11
    val crystal: Byte = 7
    val buff: Byte = 20

    val ironBuff = iron * buff / PERCENT_100
    val crystalBuff = crystal * buff / PERCENT_100

    println("Бафф железной руды - $ironBuff")
    println("Бафф кристаллической руды - $crystalBuff")
}