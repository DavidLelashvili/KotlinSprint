package lesson_8

fun main() {

    var promoCount: Int
    val promoWeekCount = intArrayOf(0, 0, 0, 0, 0, 0, 0)

    var sum = 0

    for (i in 0..6) {
        promoCount = (1..1000).random()
        promoWeekCount[i] = promoCount
        sum += promoWeekCount[i]
    }

    println("Количество просмотров за неделю: $sum")
    println("Количество просмотров за неделю: ${promoWeekCount.sum()}")

}