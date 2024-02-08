package lesson_7

fun main() {

    println("Введите число")
    val userNumber: Int = readln().toInt()

    val evenRange = 0..userNumber step 2

    for (i in evenRange) {
        print("$i ")
    }

}