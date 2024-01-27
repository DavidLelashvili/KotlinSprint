package lesson_2

fun main() {

    val arrayOfAssessment: IntArray = intArrayOf(3, 4, 3, 5)
    var sum = 0

    for (i in 0..arrayOfAssessment.size - 1) {
        sum += arrayOfAssessment[i]
    }

    val average: Float = sum.toFloat() / arrayOfAssessment.size
    println("Средняя оценка в классе - $average")
}