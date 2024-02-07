package lesson_6

fun main() {

    println("Для регистрации введите логин")
    val registerLogin = readln()

    println("Введите пароль")
    val registerPass = readln()

    var userLogin: String
    var userPass: String
    var isAuthorized: Boolean

    println("Для авторизации введите логин и пароль")

    do {
        println("Введите логин")
        userLogin = readln()

        println("Введите пароль")
        userPass = readln()

        isAuthorized = ((userLogin == registerLogin) && (userPass == registerPass))

        if (isAuthorized) println("Авторизация прошла успешно")
        else println("Неверный логин/пароль, попробуйте еще раз")
    } while (
        !isAuthorized
    )


}