package lesson_6

fun main() {

    println("Для регистрации введите логин")
    val registerLogin = readln()

    println("Введите пароль")
    val registerPass = readln()

    var userLogin: String
    var userPass: String
    var validName: Boolean
    var validPass:  Boolean

    println("Для авторизации введите логин и пароль")

    do {
        println("Введите логин")
        userLogin = readln()

        println("Введите пароль")
        userPass = readln()

        validName = (userLogin == registerLogin)
        validPass = (userPass == registerPass)

        if (
            (validName) &&
            (validPass)
        ) println("Авторизация прошла успешно")
        else println("Неверный логин/пароль, попробуйте еще раз")
    } while (
        (!validName)
        || (!validPass)
    )




}