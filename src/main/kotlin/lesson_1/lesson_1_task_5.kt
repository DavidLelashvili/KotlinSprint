package lesson_1

const val MAGIC_60 = 60 //в часе - 60 минут, в минуте - 60 секунд
fun main() {

    val durationInSeconds: Short = 6480

    val hour = durationInSeconds / MAGIC_60 / MAGIC_60
    val minutes = durationInSeconds / MAGIC_60 % MAGIC_60
    val seconds = durationInSeconds % MAGIC_60

    println("%02d:%02d:%02d".format(hour, minutes, seconds))

}