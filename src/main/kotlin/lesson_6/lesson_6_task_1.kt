package lesson_6

fun main() {

    println("Для регистрации введите логин")
    val registerLogin = readln()

    println("Введите пароль")
    val registerPass = readln()

    var userLogin: String
    var userPass: String

    var i = 0

    do {
        if (i == 0) println("Для авторизации введите логин и пароль")
        else println("Неверный логин/пароль, попробуйте еще раз\nВведите логин")
        userLogin = readln()
        println("Введите пароль")
        userPass = readln()
        i++
    } while (
        (userLogin != registerLogin)
        || (userPass != registerPass)
    )


    println("Авторизация прошла успешно")

}