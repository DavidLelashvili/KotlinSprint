package lesson_10

fun main() {

    println("Введите логин")
    val userLogin = readln()

    println("Введите пароль")
    val userPass = readln()

    if (validateLenght(userLogin, userPass)) println("Логин или пароль недостаточно длинные")
    else println("Добро пожаловать")

}

fun validateLenght(login: String, pass: String): Boolean {

    val validateLenght = login.count() <= 4 || pass.count() <= 4
    return validateLenght

}