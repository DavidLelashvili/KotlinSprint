package lesson_2

fun main() {

    val iron: Byte = 11
    val crystal: Byte = 7
    val buff: Byte = 20

    val ironBuff = iron * buff / 100
    val crystalBuff = crystal * buff / 100

    println("Бафф железной руды - $ironBuff")
    println("Бафф кристаллической руды - $crystalBuff")
}