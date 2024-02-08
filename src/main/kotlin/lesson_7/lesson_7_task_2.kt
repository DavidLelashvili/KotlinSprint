package lesson_7

fun main() {

    val verifyCodeRange = (1000..9999)
    var verifyCode: Int
    var userCode: Int
    var rightCode: Boolean

    do {
        verifyCode = verifyCodeRange.random()
        println("Ваш код авторизации: $verifyCode")

        println("Введите код")
        userCode = readln().toInt()

        rightCode = userCode == verifyCode

    } while (!rightCode)

    println("Добро подаловать!")

}